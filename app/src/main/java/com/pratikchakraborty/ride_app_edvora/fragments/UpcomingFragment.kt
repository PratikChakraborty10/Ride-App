package com.pratikchakraborty.ride_app_edvora.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.pratikchakraborty.ride_app_edvora.R
import com.pratikchakraborty.ride_app_edvora.data.MyAdapter
import com.pratikchakraborty.ride_app_edvora.data.Rides
import kotlinx.android.synthetic.main.fragment_nearest.*
import kotlinx.android.synthetic.main.fragment_upcoming.*


class UpcomingFragment : Fragment() {


    private lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<Rides>
    lateinit var imageId: Array<Int>
    lateinit var cityId: Array<String>
    lateinit var stateId: Array<String>
    lateinit var rideId: Array<String>
    lateinit var originStationId: Array<String>
    lateinit var stationPathId: Array<String>
    lateinit var dateId: Array<String>
    lateinit var distanceId: Array<String>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
    private fun getUserData() {
        for(i in imageId.indices) {
            val rides = Rides(imageId[i],
                cityId[i],
                stateId[i],
                rideId[i],
                originStationId[i],
                stationPathId[i],
                dateId[i],
                distanceId[i])
            newArrayList.add(rides)
        }
        newRecyclerView.adapter = MyAdapter(newArrayList)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_upcoming, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        imageId = arrayOf(
            R.drawable.map_guwahati,
            R.drawable.map_bangalore_c

        )
        cityId = arrayOf(
            "Guwahati",
            "Banglore"

        )
        stateId = arrayOf(
            "Assam",
            "Karnataka"
        )
        rideId = arrayOf(
            "Ride ID : 001",
            "Ride ID : 002"
        )
        originStationId = arrayOf(
            "Origin Station : 20",
            "Origin Station : 34"
        )
        stationPathId = arrayOf(
            "Station Path : [20, 39, 40, 42, 54, 63, 72, 88, 98]",
            "Station Path : [10, 19, 66, 83, 54, 43, 35, 21, 09]"
        )
        dateId = arrayOf(
            "Date : 24th Feb 2022 09:11",
            "Date : 28th Feb 2022 17:02"
        )
        distanceId = arrayOf(
            "Distance : 2",
            "Distance : 5"
        )

        newRecyclerView = upcomingRecyclerView
        //newRecyclerView.Li = LinearLayoutManager(requireActivity())
        newRecyclerView.layoutManager = LinearLayoutManager(requireActivity())
        //newRecyclerView.adapter = adapter
        newRecyclerView.hasFixedSize()
        newArrayList = arrayListOf<Rides>()
        getUserData()
        super.onViewCreated(view, savedInstanceState)
    }
}