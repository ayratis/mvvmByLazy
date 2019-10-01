package github.ayratis.tpvm.navigation

open class Router {

    var navigator: Navigator? = null
        private set

    fun setNavigator(navigationComponent: Navigator) {
        this.navigator = navigationComponent
    }

    fun removeNavigator() {
        navigator = null
    }

    open fun navigate(action: Int) {
        navigator?.navigate(action)
    }

    open fun exit() {
        navigator?.exit()
    }
}