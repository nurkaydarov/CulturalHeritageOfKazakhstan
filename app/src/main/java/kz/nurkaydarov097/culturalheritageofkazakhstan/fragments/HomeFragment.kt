package kz.nurkaydarov097.culturalheritageofkazakhstan.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import kz.nurkaydarov097.culturalheritageofkazakhstan.R
import kz.nurkaydarov097.culturalheritageofkazakhstan.adapters.AcademicAdapter
import kz.nurkaydarov097.culturalheritageofkazakhstan.databinding.FragmentHomeBinding
import kz.nurkaydarov097.culturalheritageofkazakhstan.models.Datasource

class HomeFragment : Fragment(){

    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val myDataset = Datasource().loadAcademics()

        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter = context?.let { AcademicAdapter(it, myDataset) }
    }

}