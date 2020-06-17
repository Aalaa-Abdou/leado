package com.example.leado

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.leado.data.models.Mission
import com.example.leado.data.repositories.CourseRepository
import kotlinx.android.synthetic.main.fragment_account.*

/**
 * A simple [Fragment] subclass.
 */
class AccountFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //to access the toolbar from a fragment
        var toolbar = requireActivity().findViewById<Toolbar>(R.id.tool_bar)
        toolbar.visibility = View.VISIBLE
        return inflater.inflate(R.layout.fragment_account, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val missionList : List<Mission> = getMissionList()
        mission_recycler.layoutManager = LinearLayoutManager(this.context, LinearLayoutManager.VERTICAL, false)
        mission_recycler.adapter = MissionAdapter(missionList)
    }
    private fun getMissionList(): List<Mission> {
        val missionList: MutableList<Mission> = mutableListOf()
        missionList.add(Mission("Quick Learner", "Complete 1 Course", R.drawable.ic_launcher_background))
        missionList.add(Mission("Master Mind", "Got 1st Place", R.drawable.ic_launcher_background))
        missionList.add(Mission("The achiever", "Logged in everyday", R.drawable.ic_launcher_background))
        missionList.add(Mission("Super Learner", "Complete more than 5 courses", R.drawable.ic_launcher_background))
        return missionList
    }

}
