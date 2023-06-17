package dev.joan.contact_list

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.helper.widget.Carousel.Adapter
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.floatingactionbutton.FloatingActionButton
import dev.joan.contact_list.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val button=findViewById<FloatingActionButton>(R.id.fabAddContact)
        button.setOnClickListener {
            val intent= Intent(this@MainActivity,NewContact::class.java)
            startActivity(intent)
        }
    }

    override fun onResume() {
        super.onResume()
        displayContacts()
    }
    fun displayContacts(){
        var contact1=ContactDetails("","Joy Linda","0796656168","linda@gmail.com")
        var contact2=ContactDetails("","Ian Mwiti","0728656168","ian@gmail.com")
        var contact3=ContactDetails("","Carol Mburu","0725656168","carol@gmail.com")
        var contact4=ContactDetails("","Ted Mukundi","0715656168","ted@gmail.com")
        var contact5=ContactDetails("","Florence Igoki","0727656168","florence@gmail.com")
        var contact6=ContactDetails("","Fredrick Njiru","0721656168","fredrick@gmail.com")
        var contact7=ContactDetails("","Ted Mukundi","0715656168","ted@gmail.com")
        var contact8=ContactDetails("","Ted Mukundi","0715656168","ted@gmail.com")
        var contact9=ContactDetails("","Ted Mukundi","0715656168","ted@gmail.com")
        var contact10=ContactDetails("","Ted Mukundi","0715656168","ted@gmail.com")

        var contacts= listOf<ContactDetails>(contact1,contact2,contact3,contact4,
            contact5,contact6,contact7,contact8,contact9,contact10)
        binding.rvContactList.layoutManager=LinearLayoutManager(this)
        var contAdapter=AdapterContact(contacts)
        binding.rvContactList.adapter=contAdapter
    }
}
