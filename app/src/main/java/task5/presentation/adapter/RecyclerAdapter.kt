package task5.presentation.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.task3.R
import de.hdodenhof.circleimageview.CircleImageView
import task5.domain.models.ListPost

class RecyclerAdapter (private val items: ListPost,
                       private val onItemClickEvent: (View) -> Unit) :
    RecyclerView.Adapter<RecyclerAdapter.MyViewHolder>() {

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val titleTextView: TextView = itemView.findViewById(R.id.name_ru)
        val smallTextView: TextView = itemView.findViewById(R.id.name_en)
      //  val newsImage: CircleImageView = itemView.findViewById(R.id.title_image)

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
     //   val pokemon = items.posts[position]
        holder.apply {
            titleTextView.text = items.posts[position].title
            smallTextView.text = items.posts[position].description
        }
      //  holder.titleTextView.text = items.posts!![position].title
      //  holder.newsImage.setImageResource(pokemon.imageResourceId)
      //  holder.smallTextView.text = items.posts[position].description
       // holder.itemView.setOnClickListener(onItemClickEvent)
    }
    override fun getItemCount() = items.posts.size

}