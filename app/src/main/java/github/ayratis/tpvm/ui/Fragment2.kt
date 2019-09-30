package github.ayratis.tpvm.ui


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_fragment2.*
import github.ayratis.tpvm.R
import github.ayratis.tpvm.extensions.viewModelProvider
import github.ayratis.tpvm.view_model.ViewModel2

class Fragment2 : Fragment() {

    private val viewModel: ViewModel2 by viewModelProvider()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_fragment2, container, false)

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        backButton.setOnClickListener { viewModel.onBackClick() }
    }

}
