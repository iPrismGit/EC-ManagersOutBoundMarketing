package com.iprism.ecmoutboundmarketing.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.iprism.ecmoutboundmarketing.adapters.MyLeadCashAdapter
import com.iprism.ecmoutboundmarketing.databinding.FragmentMyLeadsOthersBinding
import com.iprism.ecmoutboundmarketing.interfaces.OnSingleItemClickListener
import com.iprism.ecmoutboundmarketing.utils.ToastUtils


class MyLeadsOthersFragment : Fragment() {

    private lateinit var binding: FragmentMyLeadsOthersBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMyLeadsOthersBinding.inflate(inflater, container, false)
        setupOthersAdapter()
        return binding.root
    }

    private fun setupOthersAdapter() {
        var myLeadsCashAdapter = MyLeadCashAdapter(requireContext())
        var linearLayoutManager = LinearLayoutManager(requireContext())
        binding.othersRv.adapter = myLeadsCashAdapter
        binding.othersRv.layoutManager = linearLayoutManager
        myLeadsCashAdapter.setupListener(object : OnSingleItemClickListener {
            override fun onCallNowClick(doctorId: String, mobile: String) {
                ToastUtils.showSuccessCustomToast(requireContext(), "Calling to the Employee!")
            }

            override fun onSmsClick(doctorId: String, mobile: String) {
                ToastUtils.showSuccessCustomToast(requireContext(), "Messaging to the Employee!")
            }

            override fun onWhatsappClick(doctorId: String, mobile: String) {
                ToastUtils.showSuccessCustomToast(requireContext(), "Navigate to Whatsapp")
            }
        })
    }

}