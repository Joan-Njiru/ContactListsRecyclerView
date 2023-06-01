package dev.joan.contact_list

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import dev.joan.contact_list.databinding.ContactListBinding

class AdapterContact(var contacts:List<ContactDetails>):RecyclerView.Adapter<ContactsViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsViewHolder {
        var binding = ContactListBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ContactsViewHolder(binding)
    }

    override fun onBindViewHolder(holder:ContactsViewHolder, position: Int) {
        var myPeople =contacts.get(position)
        holder.binding.tvContactName.text = myPeople.contactName
        holder.binding.tvContactNumber.text =myPeople.contactNumber
        holder.binding.tvContactEmail.text =myPeople.contactEmail
//        holder.binding.ivAvatar.text=myPeople.avatar
}
    override fun getItemCount(): Int {
        return contacts.size
    }
    }
class ContactsViewHolder(var binding:ContactListBinding): RecyclerView.ViewHolder(binding.root)