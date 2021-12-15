package br.com.instagram.add.view

import br.com.instagram.R
import br.com.instagram.add.Add
import br.com.instagram.common.base.BaseFragment
import br.com.instagram.databinding.FragmentAddBinding
import com.google.android.material.tabs.TabLayoutMediator

class AddFragment : BaseFragment<FragmentAddBinding, Add.Presenter>(
    R.layout.fragment_add,
    FragmentAddBinding::bind
), Add.View {

    override lateinit var presenter: Add.Presenter

    override fun setupPresenter() {
    }

    override fun setupViews() {
        val tabLayout = binding?.addTab
        val viewPager = binding?.addViewpager
        val adapter = AddViewPagerAdapter(requireActivity())
        viewPager?.adapter = adapter

        if (tabLayout != null && viewPager != null) {
            TabLayoutMediator(tabLayout, viewPager) { tab, position ->
                tab.text = getString(adapter.tabs[position])
            }.attach()
        }

    }

}