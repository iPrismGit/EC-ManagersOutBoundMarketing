package com.iprism.ecmoutboundmarketing.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.iprism.ecmoutboundmarketing.activities.CreateEmployeesActivity
import com.iprism.ecmoutboundmarketing.activities.CreateHealthAdvisorActivity
import com.iprism.ecmoutboundmarketing.activities.CreateMyLeadsActivity
import com.iprism.ecmoutboundmarketing.databinding.FragmentAddUsersBinding

class AddUsersFragment : Fragment() {

    private lateinit var binding: FragmentAddUsersBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentAddUsersBinding.inflate(inflater, container, false)
        handleMyLeadsLo()
        handleHealthAdvisorLo()
        handleCompanyEmployeeLo()
        handleBankEmployeeLo()
        return binding.root
    }

    private fun handleHealthAdvisorLo() {
        binding.healthAdvisorsLo.setOnClickListener { view ->
            startActivity(Intent(requireContext(), CreateHealthAdvisorActivity::class.java))
        }
    }


    private fun handleCompanyEmployeeLo() {
    binding.companyEmployeesLo.setOnClickListener { view ->
        var intent = Intent(requireContext(), CreateEmployeesActivity::class.java)
        intent.putExtra("tag", "Company Employee ")
        startActivity(intent)
    }
}

    private fun handleBankEmployeeLo() {
        binding.bankEmployeesLo.setOnClickListener { view ->
            var intent = Intent(requireContext(), CreateEmployeesActivity::class.java)
            intent.putExtra("tag", "Bank Employee ")
            startActivity(intent)
        }
    }

    private fun handleMyLeadsLo() {
        binding.myLeadsLo.setOnClickListener(View.OnClickListener {
            startActivity(Intent(requireContext(), CreateMyLeadsActivity::class.java))
        })
    }


}