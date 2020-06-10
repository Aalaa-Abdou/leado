package com.example.leado

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.leado.models.Mission
import kotlinx.android.synthetic.main.item_mission.view.*

class MissionAdapter(val missionList : List<Mission>) :
    RecyclerView.Adapter<MissionAdapter.MissionViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MissionViewHolder {
        val missionView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_mission, parent, false)
        return MissionViewHolder(missionView)
    }

    override fun getItemCount(): Int {
        return missionList.size
    }

    override fun onBindViewHolder(holder: MissionViewHolder, position: Int) {
        holder.titleName.text = missionList[position].titleName
        holder.missionDesc.text = missionList[position].missionDesc
        holder.missionImg.setImageResource(missionList[position].missionImage)


    }
    class MissionViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val titleName : TextView = itemView.item_title
        val missionDesc : TextView = itemView.item_mission_desc
        val missionImg : ImageView = itemView.item_mission_img
    }


}