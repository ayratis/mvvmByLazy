package github.ayratis.tpvm

import github.ayratis.tpvm.navigation.Router
import github.ayratis.tpvm.view_model.ViewModel2
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mockito.mock
import org.mockito.Mockito.verify
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class ViewModel2Test {
    private val router = mock(Router::class.java)
    private val viewModel2 = ViewModel2(router)

    @Test
    fun onBackClickTest() {
        viewModel2.onBackClick()
        verify(router).exit()
    }
}