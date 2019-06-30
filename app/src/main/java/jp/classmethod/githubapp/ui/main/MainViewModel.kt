package jp.classmethod.githubapp.ui.main

import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainViewModel(private val useCase: IGitHubUseCase) : ViewModel() {

    val id = ObservableField<String>()
    val repoUrl = ObservableField<String>()
    val loading = ObservableField<Boolean>()
    val nameEdit = ObservableField<String>()

    fun fetch() = viewModelScope.launch(Dispatchers.Main) {
        loading.set(true)
        runCatching {
            withContext(Dispatchers.IO) {
                useCase.user(nameEdit.get() ?: "")
            }
        }.onSuccess {
            id.set(it.id)
            repoUrl.set(it.reposUrl)
            loading.set(false)
        }.onFailure {
            it.printStackTrace()
            loading.set(false)
        }
    }

}