package dev.joan.contact_list

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Toast
import dev.joan.contact_list.databinding.ActivityNewContactBinding


class NewContact : AppCompatActivity() {
    lateinit var binding:ActivityNewContactBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNewContactBinding.inflate(layoutInflater)
//        setContentView(R.layout.activity_new_contact)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
//        binding.btnAddContact.setOnClickListener {
            validateContact()
            clearErrorOnType()


    }

    fun validateContact(){
        val name = binding.etFirstName.text.toString()
        val email = binding.etemail.text.toString()
        val phone = binding.etPhoneNumber.text.toString()
        var error = false

        if (name.isBlank()){
            binding.tilFirstName.error = "Name field cannot be empty"
            error = true
        }else{
            binding.tilFirstName.error=null
        }
        if (name.isBlank()){
            binding.tilLastName.error = "Name field cannot be empty"
            error = true
        }else{
            binding.tilLastName.error=null
        }
        if (email.isBlank()){
            binding.tilEmailAddress.error = "Email field cannot be empty"
            error = true
        }else{
            binding.tilEmailAddress.error=null
        }


        if (phone.isEmpty()){
            binding.tilPhoneNumber.error = "Phone number field cannot be empty"
            error = true
        }else{
            binding.tilPhoneNumber.error=null
        }

        if (!error){
            Toast.makeText(this, "Contact Successfully added", Toast.LENGTH_LONG).show()
        }
    }
    fun clearErrorOnType() {
        binding.tilFirstName.editText?.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                binding.tilFirstName.error = null
            }

            override fun afterTextChanged(s: Editable?) {

            }
        })




//
            binding.tilPhoneNumber.editText?.addTextChangedListener(object : TextWatcher {
                override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

                }

                override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                    binding.tilPhoneNumber.error = null
                }

                override fun afterTextChanged(s: Editable?) {

                }
            })

            binding.tilEmailAddress.editText?.addTextChangedListener(object : TextWatcher {override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

                override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                    binding.tilEmailAddress.error = null
                }

                override fun afterTextChanged(s: Editable?) {
                }
            })
        }
}