package com.example.a4notes

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels

class ViewScreen : Fragment() {

    private val viewModel: MyViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // layout is defined in "res/layouts/fragment_2.xml"
        val root = inflater.inflate(R.layout.fragment_viewscreen, container, false)

        // add UI handlers that call your viewmodel here

        // observe viewModel properties here

        viewModel.notes.observe(this) {
            println("observe property $it")
            // update UI here

        }

        return root
    }
}