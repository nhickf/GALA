package com.diyinc.gala;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;


import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.diyinc.gala.entities.Trips;
import com.google.android.material.card.MaterialCardView;

import java.util.ArrayList;


public class GalaRecyclerViewAdapter extends RecyclerView.Adapter<GalaRecyclerViewAdapter.ViewHolder> {

    private ArrayList<Trips> mGalaList = new ArrayList<>();
    private Context context;
    private int minHeight;
    public GalaRecyclerViewAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_recycler_view_layout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        if (mGalaList != null){

            Trips gala = mGalaList.get(position);

            String date = gala.getTripStartDate() +" - "+gala.getTripEndDate();

            Log.e("ImageUrl", gala.getTripImageUrl());

            Glide.with(context).load(gala.getTripImageUrl()).centerCrop().
                    into(holder.imageView);

            holder.textViewTitle.setText(gala.getTripName());
            holder.textViewLocation.setText(gala.getTripLocation());
            holder.textViewDate.setText(date);
            holder.textViewMaker.setText(gala.getTripMaker());
            holder.textViewBio.setText(gala.getTripBio());

        }
    }

    @Override
    public int getItemCount() {

        if (mGalaList != null){
            return mGalaList.size();
        }
        return 0;

    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private MaterialCardView materialCardView;
        private AppCompatImageView imageView;
        private AppCompatTextView textViewTitle , textViewLocation , textViewMaker , textViewDate ,textViewBio;

        private ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView_gala);
            textViewTitle = itemView.findViewById(R.id.textView_title);
            textViewDate = itemView.findViewById(R.id.textView_timeDate);
            textViewLocation = itemView.findViewById(R.id.textView_location);
            textViewMaker = itemView.findViewById(R.id.textView_Maker);
            materialCardView = itemView.findViewById(R.id.containerMaterialCardView);
            textViewBio = itemView.findViewById(R.id.textView_bio);

//            WindowManager windowmanager = (WindowManager)context.getSystemService(Context.WINDOW_SERVICE);
//            DisplayMetrics dimension = new DisplayMetrics();
//            windowmanager.getDefaultDisplay().getMetrics(dimension);

            textViewBio.measure(0,0);
            final int height = textViewBio.getMeasuredHeight();

            materialCardView.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
                @Override
                public boolean onPreDraw() {

                    materialCardView.getViewTreeObserver().removeOnPreDrawListener(this);
                    minHeight = materialCardView.getHeight();
                    ViewGroup.LayoutParams layoutParams = materialCardView.getLayoutParams();
                    layoutParams.height = minHeight;
                    materialCardView.setLayoutParams(layoutParams);
                    return false;
                }
            });


            materialCardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    toggleCardViewHeight(height);
                }
            });
        }

        private void toggleCardViewHeight(int height) {

            if (materialCardView.getHeight() == minHeight) {
                // expand
                expandView(height + minHeight); //'height' is the height of screen which we have measured already.

            } else {
                // collapse
                collapseView();

            }
        }

         void collapseView() {

            ValueAnimator anim = ValueAnimator.ofInt(materialCardView.getMeasuredHeightAndState(),
                    minHeight);
            anim.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    int val = (Integer) valueAnimator.getAnimatedValue();
                    ViewGroup.LayoutParams layoutParams = materialCardView.getLayoutParams();
                    layoutParams.height = val;
                    materialCardView.setLayoutParams(layoutParams);
                }
            });
            anim.start();
        }

        void expandView(int height) {
            ValueAnimator anim = ValueAnimator.ofInt(materialCardView.getMeasuredHeightAndState(),
                    height);
            anim.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    int val = (Integer) valueAnimator.getAnimatedValue();
                    ViewGroup.LayoutParams layoutParams = materialCardView.getLayoutParams();
                    layoutParams.height = val;
                    materialCardView.setLayoutParams(layoutParams);
                    textViewBio.setVisibility(View.VISIBLE);
                }
            });
            anim.start();

        }
    }



    public void setGalaList(ArrayList<Trips> galaList){
        mGalaList = galaList;
    }
}
