package com.ivan.android_test.presentation.contributors

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

class ContributorsAdapter : RecyclerAdapter<UserResponse, ContributorsHolder>() {

    lateinit var callback: ((UserResponse, Int) -> Unit)

    override fun onCreateHolder(viewGroup: ViewGroup, viewType: Int): ContributorsHolder {
        return ContributorsHolder(viewGroup.inflate(R.layout.item_user))
    }

    override fun onBindHolder(holder: ContributorsHolder, item: UserResponse, pos: Int) {
        holder.apply {

            Glide.with(itemView)
                .load(item.avatar)
                .error(R.drawable.ic_baseline_accessible_forward_24)
                .into(imgAvatar)

            tvLogin.text = item.login
            tvId.text = item.id.toString()

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