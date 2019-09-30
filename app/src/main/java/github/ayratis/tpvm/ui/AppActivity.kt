package github.ayratis.tpvm.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import github.ayratis.tpvm.R
import github.ayratis.tpvm.di.DI
import github.ayratis.tpvm.navigation.Navigator
import github.ayratis.tpvm.navigation.Router
import toothpick.Toothpick
import javax.inject.Inject

class AppActivity : AppCompatActivity() {

    @Inject
    lateinit var router: Router

    private val navigator: Navigator by lazy {
        object : Navigator {
            override fun navigate(action: Int) {
                findNavController(R.id.nav_host_fragment).navigate(action)
            }
            override fun exit() {
                findNavController(R.id.nav_host_fragment).popBackStack()
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Toothpick.inject(this, Toothpick.openScope(DI.APP_SCOPE))
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_container)
    }

    override fun onResumeFragments() {
        super.onResumeFragments()
        router.setNavigator(navigator)
    }

    override fun onPause() {
        router.removeNavigator()
        super.onPause()
    }
}
