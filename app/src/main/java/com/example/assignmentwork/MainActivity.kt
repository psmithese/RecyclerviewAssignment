package com.example.assignmentwork

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val contacts = createContacts()
        val recyclerView: RecyclerView = findViewById(R.id.activity_main_contact_rv)
        recyclerView.adapter = ContactAdapter(this, contacts)
        recyclerView.layoutManager = LinearLayoutManager(this)
    }

    private fun createContacts(): List<Contact> {
       return generateContacts(10)
    }

    fun generateContacts(num: Int): List<Contact> {
        val contacts = mutableListOf<Contact>()

        for(i in 1..num) {
            contacts.add(Contact(name = names.random(), pictures = pictures.random()))
        }
        return contacts
    }

    val names : List<String> = listOf("Mike Smith", "Ese Mike", "Noel Jones","Samuel Smith", "Ekene David")
    val pictures : List<Int> = listOf(
        R.drawable.johnsmith,
        R.drawable.pic1,
        R.drawable.pic2,
        R.drawable.sam1,
        R.drawable.vector1
    )
}