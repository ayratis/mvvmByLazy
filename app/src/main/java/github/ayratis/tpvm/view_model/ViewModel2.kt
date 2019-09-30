package github.ayratis.tpvm.view_model

import androidx.lifecycle.ViewModel
import github.ayratis.tpvm.navigation.Router
import timber.log.Timber
import javax.inject.Inject

class ViewModel2 @Inject constructor (private val router: Router) : ViewModel() {

    init {
        Timber.d("init")
    }

    override fun onCleared() {
        Timber.d("clear")
        super.onCleared()
    }

    fun onBackClick() {
        router.exit()
    }

}