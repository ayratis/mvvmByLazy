package github.ayratis.tpvm.view_model

import androidx.lifecycle.ViewModel
import github.ayratis.tpvm.R
import github.ayratis.tpvm.navigation.Router
import timber.log.Timber
import javax.inject.Inject

class ViewModel1 @Inject constructor (private val router: Router) : ViewModel() {

    init {
        Timber.d("init")
    }

    override fun onCleared() {
        Timber.d("clear")
        super.onCleared()
    }

    fun onNextClick() {
        router.navigate(R.id.action_fragment1_to_fragment2)
    }
}