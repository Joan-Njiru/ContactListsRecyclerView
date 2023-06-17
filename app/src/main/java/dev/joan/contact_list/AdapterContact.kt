package dev.joan.contact_list

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import dev.joan.contact_list.databinding.NewContactsBinding
//import dev.joan.contact_list.databinding.new

class AdapterContact(var contacts:List<ContactDetails>):RecyclerView.Adapter<ContactsViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsViewHolder {
        var binding = NewContactsBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ContactsViewHolder(binding)
    }
    override fun onBindViewHolder(holder:ContactsViewHolder, position: Int) {
        var myPeople = contacts[position]
       holder.binding.apply {
           tvfirstName.text=myPeople.contactName
           tvemail.text=myPeople.contactEmail
           tvnumber.text=myPeople.contactNumber



       }
    }
    override fun getItemCount(): Int {
        return contacts.size
    }
    }
class ContactsViewHolder(var binding:NewContactsBinding): RecyclerView.ViewHolder(binding.root){
}
