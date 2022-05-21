package com.example.a4notes

import android.os.Bundle
import android.view.*
import android.widget.*
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController

class ListScreen : Fragment() {

    private val viewModel: MyViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // layout is defined in "res/layouts/fragment_1.xml"
        val root = inflater.inflate(R.layout.fragment_listscreen, container, false)

        // add UI handles for navigation here
        val addBtn = root.findViewById<Button>(R.id.add)
        addBtn.setOnClickListener {
            // (setup navigation actions in "rs/navigation/navigation.xml")
            findNavController().navigate(R.id.action_list_to_edit)
        }

        val randomBtn = root.findViewById<Button>(R.id.random)
        randomBtn.setOnClickListener {

        }

        // add UI handlers that call your viewmodel here

        // observe viewModel properties here
        val nl = root.findViewById<LinearLayout>(R.id.notesList2)
        viewModel.notes.observe(this) { notes ->

            // update UI here
            for (n in notes) {
                nl.addView(TextView(context).apply{text = n.title})
//                nl.addView(TextView(context).apply{text = n.body})
            }
        }

        return root
    }
}