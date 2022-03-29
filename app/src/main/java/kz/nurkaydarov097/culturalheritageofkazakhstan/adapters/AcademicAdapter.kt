package kz.nurkaydarov097.culturalheritageofkazakhstan.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kz.nurkaydarov097.culturalheritageofkazakhstan.R
import kz.nurkaydarov097.culturalheritageofkazakhstan.models.Academic

class AcademicAdapter(
    val context:Context ,private val dataset:List<Academic>
    ) :RecyclerView.Adapter<AcademicAdapter.AcademicItemViewHolder>() {

    class AcademicItemViewHolder(private val view: View): RecyclerView.ViewHolder(view){
        val imageView:ImageView = view.findViewById(R.id.academic_home_image)
        val textViewName: TextView = view.findViewById(R.id.home_academic_name)
        val textViewDesc: TextView = view.findViewById(R.id.home_academic_desc)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AcademicItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.academic_item_list, parent, false)
        return AcademicItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: AcademicItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.imageView.setImageResource(item.academicImage)
        holder.textViewName.text = context.resources.getString(item.academicName)
        holder.textViewDesc.text = context.resources.getString(item.academicDesc)

    }

    override fun getItemCount(): Int {
        return dataset.size
    }
}