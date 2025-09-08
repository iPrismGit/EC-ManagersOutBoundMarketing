package com.iprism.ecmoutboundmarketing.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.iprism.ecmoutboundmarketing.activities.AddUsersActivity
import com.iprism.ecmoutboundmarketing.databinding.FragmentHomeBinding
import com.iprism.ecmoutboundmarketing.utils.ToastUtils


class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
//        handleRequestAmbulanceLo()
//        handleReferAnAdmissionLo()
//        handleReferADiagnosticLo()
//        handlePreInsurenceLo()
        handleAddUSersLo()
//        handleMyLeadsLo()
//        handleHospitalDoctorsLo()
//        handleHospitalHodsLo()
//        handleMyTaskLo()
//        handleTeamConnectLo()
//        handleMyHealthAdvisorsLo()
//        handleEventsLo()
//        handleAddTodoListLo()
//        handleDailyReportsLo()
//        handlePromoCouponsLo()
//        handleRewardsLo()
//        handleHospitalFecilitiesLo()
//        handleHospitalTieupsLo()
//        handleSurgeriesLo()
//        handleWhiteBoardLo()
//        handleHospitalTarrifsLo()
//        handlePromoCouponsTopLo()
//        handleRewardsTopLo()
//        handleOutBounndMTLo()
        handleHospitalUpdatesLo()
        handlePatientTestimonialsLo()
        handleHealthTalks()
//        handleHealthMedia()
//        handleDegitalPromos()
        return binding.root
    }



//    private fun handleDegitalPromos() {
//        binding.digitalPromosLo.setOnClickListener { view ->
//            startActivity(Intent(requireContext(), DigitalBrandingsActivity::class.java))
//        }
//    }
//
//    private fun handleHealthMedia() {
//        binding.healthMediaLo.setOnClickListener { view ->
//            startActivity(Intent(requireContext(), HealthMediaActivity::class.java))
//        }
//    }

    private fun handleHealthTalks() {
        binding.healthTalksLo.setOnClickListener { view ->
            ToastUtils.showErrorCustomToast(requireContext(), "There are no Screens in Figma!")
        }
    }


    private fun handleHospitalUpdatesLo() {
        binding.hospitalUpdatesLo.setOnClickListener(View.OnClickListener {
            ToastUtils.showErrorCustomToast(requireContext(), "There are no Screens in Figma!")
        })
    }

    private fun handlePatientTestimonialsLo() {
        binding.patientTestimonialsLo.setOnClickListener(View.OnClickListener {
            ToastUtils.showErrorCustomToast(requireContext(), "There are no Screens in Figma!")
        })
    }

//    private fun handleOutBounndMTLo() {
//        binding.outBoundMarketingTeamLo.setOnClickListener { view ->
//            startActivity(Intent(requireContext(), InBoundMarketingTeamsActivity::class.java))
//        }
//    }
//
//    private fun handleRewardsTopLo() {
//        binding.rewardsTopLo.setOnClickListener { view ->
//            startActivity(Intent(requireContext(), RewardsActivity::class.java))
//        }
//    }
//
//    private fun handlePromoCouponsTopLo() {
//        binding.promoCouponsTopLo.setOnClickListener { view ->
//            startActivity(Intent(requireContext(), PromoCouponsActivity::class.java))
//        }
//    }
//
//    private fun handlePreInsurenceLo() {
//        binding.sendInsurencePreAuthLo.setOnClickListener(View.OnClickListener {
//            startActivity(Intent(requireContext(), SendInsurencePreAuthActivity::class.java))
//        })
//    }
//
//    private fun handleReferAnAdmissionLo() {
//        binding.referAnAdmissionLo.setOnClickListener(View.OnClickListener {
//            startActivity(Intent(requireContext(), RefferAnAdmissionActivity::class.java))
//        })
//    }
//
//    private fun handleReferADiagnosticLo() {
//        binding.refferADiagnosticLo.setOnClickListener(View.OnClickListener {
//            startActivity(Intent(requireContext(), ReferADiagnosticActivity::class.java))
//        })
//    }
//
//    private fun handleRequestAmbulanceLo() {
//        binding.requestAmbulanceLo.setOnClickListener(View.OnClickListener {
//            startActivity(Intent(requireContext(), RequestAmbulanceActivity::class.java))
//        })
//    }
//
//    private fun handleHospitalTarrifsLo() {
//        binding.hospitalTariffsLo.setOnClickListener { view ->
//            startActivity(Intent(requireContext(), HospitalTariffsListActivity::class.java))
//        }
//    }
//
//    private fun handleWhiteBoardLo() {
//        binding.whiteBoardLo.setOnClickListener { view ->
//            startActivity(Intent(requireContext(), WhiteBoardFeedBackActivity::class.java))
//        }
//    }
//
//    private fun handleSurgeriesLo() {
//        binding.surgicalPackagesLo.setOnClickListener { view ->
//            startActivity(Intent(requireContext(), SurgeriesActivity::class.java))
//        }
//    }
//
//    private fun handleHospitalTieupsLo() {
//        binding.hospitalTieupsLo.setOnClickListener { view ->
//            startActivity(Intent(requireContext(), HospitalTieupsActivity::class.java))
//        }
//    }
//
//    private fun handleHospitalFecilitiesLo() {
//        binding.hospitalFacilitiesLo.setOnClickListener { view ->
//            startActivity(Intent(requireContext(), HospitalFecilitiesActivity::class.java))
//        }
//
//    }
//
//    private fun handleRewardsLo() {
//        binding.rewardsLo.setOnClickListener { view ->
//            startActivity(Intent(requireContext(), RewardsActivity::class.java))
//        }
//    }
//
//    private fun handlePromoCouponsLo() {
//        binding.promoCouponsLo.setOnClickListener { view ->
//            startActivity(Intent(requireContext(), PromoCouponsActivity::class.java))
//        }
//    }
//
//    private fun handleDailyReportsLo() {
//        binding.dailyReportsLo.setOnClickListener { view ->
//            startActivity(Intent(requireContext(), AddDailyReportActivity::class.java))
//        }
//    }
//
//    private fun handleAddTodoListLo() {
//        binding.toDoListLo.setOnClickListener { view ->
//            startActivity(Intent(requireContext(), ToDoListsActivity::class.java))
//        }
//    }
//
//    private fun handleEventsLo() {
//        binding.eventsLo.setOnClickListener { view ->
//            startActivity(Intent(requireContext(), EventCategoriesActivity::class.java))
//        }
//    }
//
//    private fun handleMyHealthAdvisorsLo() {
//        binding.myHealthAdvisorsLo.setOnClickListener { view ->
//            startActivity(Intent(requireContext(), MyHealthAdvisorsActivity::class.java))
//        }
//    }
//
//    private fun handleTeamConnectLo() {
//        binding.teamConnectLo.setOnClickListener { view ->
//            startActivity(Intent(requireContext(), TeamConnectActivity::class.java))
//        }
//    }
//
//    private fun handleMyTaskLo() {
//        binding.taskVsPerformanceLo.setOnClickListener { view ->
//            startActivity(Intent(requireContext(), MyTasksActivity::class.java))
//        }
//    }
//
//    private fun handleHospitalHodsLo() {
//        binding.hospitalHodsLo.setOnClickListener { view ->
//            startActivity(Intent(requireContext(), HospitalHodsActivity::class.java))
//        }
//    }
//
//    private fun handleHospitalDoctorsLo() {
//        binding.hospitalDoctorsLo.setOnClickListener { view ->
//            startActivity(Intent(requireContext(), HospitalDoctorsActivity::class.java))
//        }
//    }
//
//    private fun handleMyLeadsLo() {
//        binding.myLeadsLo.setOnClickListener { view ->
//            startActivity(Intent(requireContext(), MyLeadsActivity::class.java))
//        }
//    }

    private fun handleAddUSersLo() {
        binding.addUsersLo.setOnClickListener(View.OnClickListener {
            startActivity(Intent(requireContext(), AddUsersActivity::class.java))
        })
    }

}