package pe.edu.upc.agenda.ui.contact

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import pe.edu.upc.agenda.R
import pe.edu.upc.agenda.data.Contact

class ContactActivity : AppCompatActivity() {
    lateinit var rvContact: RecyclerView
    private lateinit var contacts: ArrayList<Contact>
    lateinit var contactAdapter: ContactAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rvContact = findViewById(R.id.rvContact)
        loadContacts()

        contactAdapter = ContactAdapter(contacts)
        rvContact.adapter = contactAdapter
        rvContact.layoutManager = LinearLayoutManager(this)
    }

    private fun loadContacts() {
        contacts = ArrayList()
        contacts.add(Contact("Jorge Enrique", "987456321"))
        contacts.add(Contact("Mariana Bedoya", "978623514"))
        contacts.add(Contact("Miguel Estrada", "957846132"))

    }
}