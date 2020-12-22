package be.vives.mytodo.screens.utils

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import be.vives.mytodo.models.ToDo
import be.vives.mytodo.models.User
import java.util.*

class MockupToDo {

    companion object {
        private val assignedUser = User(2, "Dirk", "Hostens", "password", true)
        private val createduser = User(1, "Frank", "Debaere", "password", true)

        private val toDo = ToDo(
            1,
            "Afwerken detailscherm ToDo",
            "Afwerken van detailscherm ToDo inclusief LiveData, ModelView en Databinding",
            createduser,
            Date(),
            assignedUser,
            Date(),
            2000L,
            "Geen opmerkingen"
        )
        private val toDo2 = ToDo(
            2,
            "Afwerken detailscherm ToDo",
            "Afwerken van detailscherm ToDo inclusief LiveData, ModelView en Databinding",
            createduser,
            Date(),
            null,
            null,
            null,
            null
        )
        private val toDo3 = ToDo(
            3,
            "Afwerken detailscherm ToDo",
            "Afwerken van detailscherm ToDo inclusief LiveData, ModelView en Databinding",
            createduser,
            Date(),
            assignedUser,
            null,
            null,
            null
        )
        private val toDos :Array<ToDo> = arrayOf(toDo,toDo2, toDo3)

        fun getToDos(): LiveData<List<ToDo>> {
            var toDoList = MutableLiveData<List<ToDo>>()
            toDoList.value = toDos.toList()
            return toDoList
        }
    }
}