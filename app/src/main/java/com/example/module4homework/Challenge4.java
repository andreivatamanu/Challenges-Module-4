package com.example.module4homework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Challenge4 extends AppCompatActivity {

    private RecyclerView mRecyclerViewHolidays;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_challenge4);

        initView();
    }

    private void initView() {

        mRecyclerViewHolidays = findViewById(R.id.recycle_view_holidays);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        mRecyclerViewHolidays.setLayoutManager(layoutManager);
        HolidaysAdapter holidaysAdapter = new HolidaysAdapter(getHoliday(), Challenge4.this);
        mRecyclerViewHolidays.setAdapter(holidaysAdapter);
    }

    private List<Holiday> getHoliday() {

        List<Holiday> holidayList = new ArrayList<>();

        Holiday destination;

        destination = new Holiday();
        destination.setName("Holiday 2017");
        destination.setDestination("Islands");
        destination.setImageUrl(R.drawable.islands);
        holidayList.add(destination);

        destination = new Holiday();
        destination.setName("Fall 2017");
        destination.setDestination("Rome");
        destination.setImageUrl(R.drawable.rome);
        holidayList.add(destination);

        destination = new Holiday();
        destination.setName("Summer 2017");
        destination.setDestination("London");
        destination.setImageUrl(R.drawable.london);
        holidayList.add(destination);

        destination = new Holiday();
        destination.setName("Winter 2017");
        destination.setDestination("Paris");
        destination.setImageUrl(R.drawable.paris);
        holidayList.add(destination);


        destination = new Holiday();
        destination.setName("Spring 2018");
        destination.setDestination("San Francisco");
        destination.setImageUrl(R.drawable.san_francisco);
        holidayList.add(destination);

        destination = new Holiday();
        destination.setName("Summer 2018");
        destination.setDestination("Cairo");
        destination.setImageUrl(R.drawable.cairo);
        holidayList.add(destination);

        destination = new Holiday();
        destination.setName("Summer 2018");
        destination.setDestination("Greece");
        destination.setImageUrl(R.drawable.greece);
        holidayList.add(destination);




        return holidayList;

    }
}
