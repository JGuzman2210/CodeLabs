package com.example.android.codelabs.navigation


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavArgs
import androidx.navigation.fragment.navArgs
import androidx.navigation.navArgs

/**
 * A simple [Fragment] subclass.
 */
class settings_fragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        //var result:settings_fragmentArgs by navArgs()
        val result:settings_fragmentArgs by this.navArgs()



        return inflater.inflate(R.layout.fragment_settings_fragment, container, false)
    }


}
