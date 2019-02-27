package com.example.module4homework;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;

import java.util.List;

public class HolidaysAdapter extends RecyclerView.Adapter<HolidayHolder> {

    private List<Holiday> mHolidayList;
    private Context mContext;

   public HolidaysAdapter (List<Holiday> holidayList, Context context){

       mHolidayList = holidayList;
       mContext = context;
   }

    @NonNull
    @Override
    public HolidayHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.holidays_item, viewGroup, false);



        return new HolidayHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull HolidayHolder holidayHolder, int i) {

        Holiday currentHoliday = mHolidayList.get(i);
        holidayHolder.getTextViewName().setText(currentHoliday.getName());
        holidayHolder.getDestinationName().setText(currentHoliday.getDestination());



        Glide.with(mContext).load(currentHoliday.getImageUrl()).placeholder(R.drawable.android_1)
                .into(holidayHolder.getImagePictures());

    }

    @Override
    public int getItemCount() {
        return mHolidayList.size() ;
    }
}
