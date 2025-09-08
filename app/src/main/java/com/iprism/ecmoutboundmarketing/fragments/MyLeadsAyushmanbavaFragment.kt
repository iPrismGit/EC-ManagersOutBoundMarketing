package com.iprism.ecmoutboundmarketing.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.iprism.ecmoutboundmarketing.adapters.MyLeadCashAdapter
import com.iprism.ecmoutboundmarketing.databinding.FragmentMyLeadsAyushmanbavaBinding
import com.iprism.ecmoutboundmarketing.interfaces.OnSingleItemClickListener
import com.iprism.ecmoutboundmarketing.utils.ToastUtils


class MyLeadsAyushmanbavaFragment : Fragment() {

    private lateinit var binding: FragmentMyLeadsAyushmanbavaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMyLeadsAyushmanbavaBinding.inflate(inflater, container, false)
        setupAyushmanbhavaAdapter()
        return binding.root
    }

    private fun setupAyushmanbhavaAdapter() {
        var myLeadsCashAdapter = MyLeadCashAdapter(requireContext())
        var linearLayoutManager = LinearLayoutManager(requireContext())
        binding.ayushmanbhavaRv.adapter = myLeadsCashAdapter
        binding.ayushmanbhavaRv.layoutManager = linearLayoutManager
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