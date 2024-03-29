package com.example.kinoapp.ui.tickets

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.kinoapp.R

class TicketsFragment : Fragment() {

    private lateinit var ticketsViewModel: TicketsViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        ticketsViewModel =
                ViewModelProvider(this).get(TicketsViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_tickets, container, false)
//        val textView: TextView = root.findViewById(R.id.text_gallery)
        ticketsViewModel.text.observe(viewLifecycleOwner, Observer {
//            textView.text = it
        })
        return root
    }
}