package com.example.assignmentwork

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class ContactAdapter(private val context: Context, private val contacts: List<Contact>)
    : RecyclerView.Adapter<ContactAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val data = itemView.findViewById<TextView>(R.id.item_main_name)
       val image = itemView.findViewById<ImageView>(R.id.item_main_imageView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_contact, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {


//        holder.bind(contact)
        holder.data.text = contacts[position].name
        holder.image.setImageResource(contacts[position].pictures)
//        Glide.with(context).load(contact)

    // can be change to holder.bind(contact)
     //   holder.image.setImageResource(contacts[position].)

    }

    // return the total count of item in the list
    override fun getItemCount(): Int {
        return contacts.size
    }
}