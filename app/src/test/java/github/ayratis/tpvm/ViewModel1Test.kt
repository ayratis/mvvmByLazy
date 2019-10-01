package github.ayratis.tpvm

import github.ayratis.tpvm.navigation.Router
import github.ayratis.tpvm.view_model.ViewModel1
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mockito.mock
import org.mockito.Mockito.verify
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class ViewModel1Test {

    private val router = mock(Router::class.java)
    private val viewModel1 = ViewModel1(router)

    @Test
    fun onNextClickTest() {
        viewModel1.onNextClick()
        verify(router).navigate(R.id.action_fragment1_to_fragment2)
    }
}