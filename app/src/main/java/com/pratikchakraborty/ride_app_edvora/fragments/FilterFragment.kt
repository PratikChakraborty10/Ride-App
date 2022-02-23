package com.pratikchakraborty.ride_app_edvora.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.pratikchakraborty.ride_app_edvora.R
import com.pratikchakraborty.ride_app_edvora.data.MyAdapter
import com.pratikchakraborty.ride_app_edvora.data.Rides
import kotlinx.android.synthetic.main.fragment_filter.*
import kotlinx.android.synthetic.main.fragment_nearest.*

class FilterFragment : Fragment() {

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

        return inflater.inflate(R.layout.fragment_filter, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        imageId = arrayOf(
            R.drawable.map_panvel_a,
            R.drawable.map_panvel_b,
            R.drawable.map_borivalli,
            R.drawable.map_thane,
            R.drawable.map_bangalore_a,
            R.drawable.map_bangalore_b,
            R.drawable.map_bangalore_c,
            R.drawable.map_guwahati,
            R.drawable.map_newtown_a,
            R.drawable.map_newtown_b,
            R.drawable.map_newtown_c,
            R.drawable.map_delhi_a,
            R.drawable.map_delhi_b
        )
        cityId = arrayOf(
            "Panvel",
            "Panvel",
            "Borivalli",
            "Thane",
            "Bangalore",
            "Bangalore",
            "Bangalore",
            "Guwahati",
            "Kolkata",
            "Kolkata",
            "Kolkata",
            "New Delhi",
            "New Delhi"
        )
        stateId = arrayOf(
            "Maharashtra",
            "Maharashtra",
            "Maharashtra",
            "Maharashtra",
            "Karnataka",
            "Karnataka",
            "Karnataka",
            "Assam",
            "West Bengal",
            "West Bengal",
            "West Bengal",
            "New Delhi",
            "New Delhi"
        )
        rideId = arrayOf(
            "Ride ID : 001",
            "Ride ID : 002",
            "Ride ID : 003",
            "Ride ID : 004",
            "Ride ID : 005",
            "Ride ID : 006",
            "Ride ID : 007",
            "Ride ID : 008",
            "Ride ID : 009",
            "Ride ID : 010",
            "Ride ID : 011",
            "Ride ID : 012",
            "Ride ID : 013"
        )
        originStationId = arrayOf(
            "Origin Station : 20",
            "Origin Station : 34",
            "Origin Station : 28",
            "Origin Station : 49",
            "Origin Station : 11",
            "Origin Station : 31",
            "Origin Station : 78",
            "Origin Station : 41",
            "Origin Station : 66",
            "Origin Station : 21",
            "Origin Station : 69",
            "Origin Station : 13",
            "Origin Station : 90"
        )
        stationPathId = arrayOf(
            "Station Path : [20, 39, 40, 42, 54, 63, 72, 88, 98]",
            "Station Path : [10, 19, 66, 83, 54, 43, 35, 21, 09]",
            "Station Path : [29, 69, 57, 67, 12, 45, 81, 19, 34]",
            "Station Path : [58, 33, 11, 45, 14, 29, 17, 58, 34]",
            "Station Path : [20, 39, 40, 42, 54, 63, 72, 88, 98]",
            "Station Path : [10, 19, 66, 83, 54, 43, 35, 21, 09]",
            "Station Path : [29, 69, 57, 67, 12, 45, 81, 19, 34]",
            "Station Path : [58, 33, 11, 45, 14, 29, 17, 58, 34]",
            "Station Path : [20, 39, 40, 42, 54, 63, 72, 88, 98]",
            "Station Path : [10, 19, 66, 83, 54, 43, 35, 21, 09]",
            "Station Path : [29, 69, 57, 67, 12, 45, 81, 19, 34]",
            "Station Path : [58, 33, 11, 45, 14, 29, 17, 58, 34]",
            "Station Path : [58, 33, 11, 45, 14, 29, 17, 58, 34]"
        )
        dateId = arrayOf(
            "Date : 15th Feb 2022 16:33",
            "Date : 17th Feb 2022 12:17",
            "Date : 18th Feb 2022 20:12",
            "Date : 22nd Feb 2022 21:56",
            "Date : 15th Feb 2022 16:33",
            "Date : 17th Feb 2022 12:17",
            "Date : 18th Feb 2022 20:12",
            "Date : 22nd Feb 2022 21:56",
            "Date : 15th Feb 2022 16:33",
            "Date : 17th Feb 2022 12:17",
            "Date : 18th Feb 2022 20:12",
            "Date : 22nd Feb 2022 21:56",
            "Date : 22nd Feb 2022 21:56"
        )
        distanceId = arrayOf(
            "Distance : 2",
            "Distance : 5",
            "Distance : 1",
            "Distance : 4",
            "Distance : 2",
            "Distance : 5",
            "Distance : 1",
            "Distance : 4",
            "Distance : 2",
            "Distance : 5",
            "Distance : 1",
            "Distance : 4",
            "Distance : 4"
        )

        newRecyclerView = filterRecyclerView
        //newRecyclerView.Li = LinearLayoutManager(requireActivity())
        newRecyclerView.layoutManager = LinearLayoutManager(requireActivity())
        //newRecyclerView.adapter = adapter
        newRecyclerView.hasFixedSize()
        newArrayList = arrayListOf<Rides>()
        getUserData()
        super.onViewCreated(view, savedInstanceState)
    }
}