package com.example.layoutbest.ui.anak

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.layoutbest.databinding.FragmentAnakBinding


class AnakFragment : Fragment() {
    private lateinit var anakViewModel: AnakViewModel
    private var _binding: FragmentAnakBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        anakViewModel =
            ViewModelProvider(this).get(AnakViewModel::class.java)

        _binding = FragmentAnakBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textAnak
        anakViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}