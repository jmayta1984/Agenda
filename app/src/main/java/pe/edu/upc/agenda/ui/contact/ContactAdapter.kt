package pe.edu.upc.agenda.ui.contact

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import pe.edu.upc.agenda.R
import pe.edu.upc.agenda.data.Contact

class ContactAdapter(private val contacts: ArrayList<Contact>) : RecyclerView.Adapter<ContactPrototype>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactPrototype {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.prototype_contact, parent, false)
        return ContactPrototype(view)
    }

    override fun onBindViewHolder(holder: ContactPrototype, position: Int) {
        holder.bindTo(contacts[position])
    }

    override fun getItemCount(): Int {
        return contacts.size
    }
}

class ContactPrototype(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private lateinit var tvName: TextView
    private lateinit var tvTelephone: TextView

    fun bindTo(contact: Contact) {
        tvName = itemView.findViewById(R.id.tvName)
        tvTelephone = itemView.findViewById(R.id.tvTelephone)

        tvName.text = contact.name
        tvTelephone.text = contact.telephone
    }

}
