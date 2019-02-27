package com.example.module4homework;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;

public class HolidayHolder extends RecyclerView.ViewHolder {

    private TextView mTextViewName;
    private TextView mDestinationName;
    private ImageView mImagePictures;

    public HolidayHolder(@NonNull View itemView) {
        super(itemView);

        mTextViewName = itemView.findViewById(R.id.text_name);
        mDestinationName = itemView.findViewById(R.id.text_destination);
        mImagePictures = itemView.findViewById(R.id.image_holidays);



    }

    public TextView getTextViewName() {
        return mTextViewName;
    }

    public void setTextViewName(TextView textViewName) {
        mTextViewName = textViewName;
    }

    public TextView getDestinationName() {
        return mDestinationName;
    }

    public void setDestinationName(TextView destinationName) {
        mDestinationName = destinationName;
    }

    public ImageView getImagePictures() {
        return mImagePictures;
    }

    public void setImagePictures(ImageView imagePictures) {
        mImagePictures = imagePictures;
    }
}
