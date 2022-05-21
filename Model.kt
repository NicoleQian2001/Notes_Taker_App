package com.example.a4notes

class Model {
    // the list of notes, keep it private so views can only
    // get the filtered lit
    val allNotes = mutableListOf<Note>()
    // model's last message describing operation
    var message: String = ""

//    fun addNote(newNote: Note) {
//        val note = newNote.copy(id = generateID())
//        allNotes.add(note)
//        message = "Added Note #${note.id}"
//        notifyObservers()
//    }

}