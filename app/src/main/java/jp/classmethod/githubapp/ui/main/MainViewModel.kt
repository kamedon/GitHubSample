package jp.classmethod.githubapp.ui.main

import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import jp.classmethod.githubapp.usecase.IGitHubUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainViewModel(private val useCase: IGitHubUseCase) : ViewModel() {

    val id = ObservableField<String>()

    fun load() {
        viewModelScope.launch(Dispatchers.Main) {
            runCatching {
                withContext(Dispatchers.IO) {
                    useCase.user("kamedon")
                }
            }.onSuccess {
                id.set(it.id)
            }.onFailure {
                it.printStackTrace()
            }
        }
    }

}