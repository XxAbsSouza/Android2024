package br.listadecompras.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.listadecompras.model.ItemModel
import br.myapplication.R

class ItemsAdapter : RecyclerView.Adapter<ItemsAdapter.ItemViewHolder>() {
//Adapter é uma abstração, uma classe, ou um conjunto de classes ciradas, uma abstração do andorid que vai fazer a ponte entre o Dado e o Layout para o Recycleview
    private val items = mutableListOf<ItemModel>()

    fun addItem(newItem: ItemModel) {
        items.add(newItem)
        notifyDataSetChanged()
    }
    fun removeItem(item: ItemModel) {
        items.remove(item)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return ItemViewHolder(view)
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = items[position]
        holder.bind(item)
    }

    class ItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textView = view.findViewById<TextView>(R.id.textViewItem)
        //classe R = é uma classe do andorid que dá acesso aos recursos
        fun bind(item: ItemModel) {
            textView.text = item.name
        }
    }
}