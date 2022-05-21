package com.example.a4notes

import androidx.lifecycle.*
import kotlin.random.Random

class MyViewModel() : ViewModel() {
    val model = Model()
    // add all observable properties here
    val notes: MutableLiveData<MutableList<Note>> = MutableLiveData<MutableList<Note>>(model.allNotes)

    init {

    }

    // add modelview update functions here
//    fun newRandomNote() {
////        debug("newRandomNote")
//
//        // title is 1 to 3 words in Title Case
//        val title = LoremIpsum.getRandomSequence(Random.nextInt(1, 3))
//            .split(" ")
//            .joinToString(" ") { it.replaceFirstChar { it.uppercase() } }
//
//        // body is 2 to 5 sentences, each 3 to 10 words long
//        var body = ""
//        for (i in 0..Random.nextInt(2, 5)) {
//            val sentence = LoremIpsum.getRandomSequence(Random.nextInt(3, 10))
//                .replaceFirstChar { it.uppercase() }
//                .plus(". ")
//            body = body.plus(sentence)
//        }
//
//        // create the new note and pick random importance with prob 20%
//        val note = Note(null, title, body, important = (Random.nextDouble() < 0.2))
//
//        // add the new random note to the model
//        saveNote(note)
//    }

    // handles hiding the overlay and saving the note
//    fun saveNote(note: Note?) {
////        debug("saveNote")
////        dialogOverlay.children.clear()
////        dialogOverlay.isVisible = false
//        if (note != null) {
//            if (note.id == null)
//                model.addNote(note)
//            else
//                model.updateNote(note)
//        }
//    }
}