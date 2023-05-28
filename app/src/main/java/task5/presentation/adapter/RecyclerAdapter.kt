package task5.presentation.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.task3.R
import com.squareup.picasso.Picasso
import de.hdodenhof.circleimageview.CircleImageView
import task5.domain.models.ListPost
import task5.domain.models.Post

class RecyclerAdapter (private val items: List<Post>,
                       private val onItemClickEvent: (View) -> Unit) :
    RecyclerView.Adapter<RecyclerAdapter.MyViewHolder>() {

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val titleTextView: TextView = itemView.findViewById(R.id.name_ru)
        val smallTextView: TextView = itemView.findViewById(R.id.name_en)
        val newsImage: CircleImageView = itemView.findViewById(R.id.title_image)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.resytler_item, parent, false)
        itemView.setOnClickListener{
            onItemClickEvent(it)
        }
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        holder.apply {

            titleTextView.text = items[position].title
            smallTextView.text = items[position].description
            Picasso
                .get()
                .load(items[position].urlToImage)
                .into(newsImage)
        }

    }
    override fun getItemCount() = items.size

}