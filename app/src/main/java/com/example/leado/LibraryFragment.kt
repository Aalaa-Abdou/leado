package com.example.leado

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.leado.models.User
import kotlinx.android.synthetic.main.fragment_library.*

/**
 * A simple [Fragment] subclass.
 */
class LibraryFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_library, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        user_recycler.layoutManager = LinearLayoutManager(this.context, LinearLayoutManager.VERTICAL, false)
        user_recycler.adapter = UserAdapter(getLibraryList())
    }
    private fun getLibraryList(): List<User> {
        val usersList: MutableList<User> = mutableListOf()
        usersList.add(User("Hannah", 152889, R.drawable.ic_launcher_background, "1"))
        usersList.add(User("Muhammad", 25445, R.drawable.ic_launcher_background, "2"))
        usersList.add(User("Maha", 122, R.drawable.ic_launcher_background, "6"))
        usersList.add(User("Super Learner", 96635, R.drawable.ic_launcher_background, "10"))
        return usersList
    }
}
