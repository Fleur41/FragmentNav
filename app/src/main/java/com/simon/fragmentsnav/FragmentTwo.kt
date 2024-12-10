package com.simon.fragmentsnav

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.simon.fragmentsnav.databinding.FragmentTwoBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [FragmentTwo.newInstance] factory method to
 * create an instance of this fragment.
 */
class FragmentTwo : Fragment() {
    // TODO: Rename and change types of parameters
    private var _binding: FragmentTwoBinding? = null
    private val binding get() = _binding!!



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //navigate to homepage
        binding.buttonToFragmentOne.setOnClickListener{
            Toast.makeText(requireContext(), "Go to homepage👈", Toast.LENGTH_SHORT).show()
            findNavController().navigate(R.id.action_fragmentTwo_to_fragmentOne)
        }

        //navigate to page3
        binding.buttonToFragmentThree.setOnClickListener{
            Toast.makeText(requireContext(), "Go to Fragment three 👉", Toast.LENGTH_SHORT).show()
            findNavController().navigate(R.id.action_fragmentTwo_to_fragmentThree)
        }
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}