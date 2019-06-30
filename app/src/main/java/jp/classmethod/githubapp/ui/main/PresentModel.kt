package jp.classmethod.githubapp.ui.main

class UserPresentModel(val id: String, val reposUrl: String) {
    companion object {
        val NONE = UserPresentModel("", "")
    }
}