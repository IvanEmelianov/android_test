package com.ivan.android_test.presentation.contributors

import android.net.Uri
import android.util.Log
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.ivan.android_test.R
import com.ivan.android_test.data.UserResponse
import com.ivan.android_test.domain.entity.User
import com.ivan.android_test.extension.inflate
import com.ivan.android_test.presentation.base.adapter.RecyclerAdapter

class ContributorsAdapter : RecyclerAdapter<User, ContributorsHolder>() {


    lateinit var callback: ((User, Int) -> Unit)

    override fun onCreateHolder(viewGroup: ViewGroup, viewType: Int): ContributorsHolder {
        return ContributorsHolder(viewGroup.inflate(R.layout.item_user))
    }

    override fun onBindHolder(holder: ContributorsHolder, item: User, pos: Int) {
        holder.apply {

            val uri = "https://avatars0.githubusercontent.com/u/${item.id}?v=4.png"

            Glide.with(itemView)
                .load(uri)
                .error(R.drawable.ic_baseline_accessible_forward_24)
                .into(imgAvatar)

            tvLogin.text = item.login
            tvId.text = item.id.toString()

            Log.d("getId", tvId.toString())
            Log.d("getLogin", tvLogin.toString())
            Log.d("getAvatar", imgAvatar.toString())

            itemView.setOnClickListener {
                callback.invoke(item, pos)
            }
        }
    }
}


class ContributorsHolder(view: View) : RecyclerView.ViewHolder(view){

    val imgAvatar: ImageView = view.findViewById(R.id.imgAvatar)
    val tvLogin: TextView = view.findViewById(R.id.tvLogin)
    val tvId: TextView = view.findViewById(R.id.tvId)

}