package com.pratikchakraborty.ride_app_edvora.data

import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.Filter
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.makeramen.roundedimageview.RoundedImageView
import com.pratikchakraborty.ride_app_edvora.R

class MyAdapter(private val rideList: ArrayList<Rides>)
    : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(
            R.layout.list_item, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = rideList[position]
        holder.mapImageView.setImageResource(currentItem.mapImage)
        holder.cityTextView.text = currentItem.cityTv
        holder.stateTextView.text = currentItem.stateTv
        holder.rideIDTextView.text = currentItem.rideIdTv
        holder.originStationTextView.text = currentItem.originStationTv
        holder.stationPathTextView.text = currentItem.stationPathTv
        holder.dateTextView.text = currentItem.dateTv
        holder.distanceTextView.text = currentItem.distanceTv
    }

    override fun getItemCount(): Int {
        return rideList.size
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val mapImageView : RoundedImageView = itemView.findViewById(R.id.map_image)
        val cityTextView : TextView = itemView.findViewById(R.id.city_tv)
        val stateTextView : TextView = itemView.findViewById(R.id.state_tv)
        val rideIDTextView : TextView = itemView.findViewById(R.id.ride_id_tv)
        val originStationTextView : TextView = itemView.findViewById(R.id.origin_station_tv)
        val stationPathTextView : TextView = itemView.findViewById(R.id.station_path_tv)
        val dateTextView : TextView = itemView.findViewById(R.id.date_tv)
        val distanceTextView : TextView = itemView.findViewById(R.id.distance_tv)
    }
}