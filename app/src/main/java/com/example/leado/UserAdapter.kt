package com.example.leado

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.leado.data.models.User
import kotlinx.android.synthetic.main.item_user.view.*

class UserAdapter (private val usersList: List<User>) :
    RecyclerView.Adapter<UserAdapter.UserViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val userView = LayoutInflater.from(parent.context).inflate(R.layout.item_user, parent, false)
        return UserViewHolder(userView)
    }

    override fun getItemCount(): Int {
       return usersList.size
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.username.text = usersList[position].username
        holder.userPoints.text= usersList[position].userPoints.toString()
        holder.userRank.text=usersList[position].userRank
        holder.userImage.setImageResource(usersList[position].userImg)
    }
    class UserViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val username: TextView = itemView.item_user_name
        val userPoints: TextView = itemView.item_user_points
        val userImage: ImageView = itemView.item_user_img
        val userRank : TextView = itemView.item_txtCircularRank
    }
}

