package github.ayratis.tpvm.navigation

class Router {

    var navigator: Navigator? = null
        private set

    fun setNavigator(navigationComponent: Navigator) {
        this.navigator = navigationComponent
    }

    fun removeNavigator() {
        navigator = null
    }

    fun navigate(action: Int) {
        navigator?.navigate(action)
    }

    fun exit() {
        navigator?.exit()
    }
}