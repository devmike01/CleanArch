package io.devmike01.cleanarchanndroid.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.widget.SwitchCompat
import androidx.recyclerview.widget.RecyclerView
import io.devmike01.cleanarchanndroid.R

data class TestRecycler(val title: String, var isChecked: Boolean)
class TestRecyclerViewAdapter : RecyclerView.Adapter<TestRecyclerViewAdapter.TestRecyclerViewAdapterHolder>() {

    var itemList : List<TestRecycler>? = null

    fun submit(itemList : List<TestRecycler>){
        this.itemList = itemList
        notifyItemChanged(itemList.size)
    }

    inner class TestRecyclerViewAdapterHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        var switchView : SwitchCompat
        var textView : TextView

        init {
            with(itemView){
                switchView = findViewById(R.id.view_switch)
                textView = findViewById(R.id.text_view)
            }
        }

        fun bind(testRec : TestRecycler){
            switchView.isClickable = false
            switchView.isChecked = testRec.isChecked
            textView.text = testRec.title
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): TestRecyclerViewAdapterHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recyclerview_item, parent, false);
        return TestRecyclerViewAdapterHolder(view)
    }

    override fun onBindViewHolder(holder: TestRecyclerViewAdapterHolder, position: Int) {
        itemList?.get(position)?.run {
            holder.bind(this)
            holder.itemView.setOnClickListener { buttonView ->
                this.isChecked = !isChecked
                notifyItemChanged(position)
            }
        }
    }

    override fun getItemCount(): Int {
        return if(itemList == null){0}else{itemList!!.size}
    }
}