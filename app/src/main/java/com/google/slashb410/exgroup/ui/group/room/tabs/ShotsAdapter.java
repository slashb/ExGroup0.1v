package com.google.slashb410.exgroup.ui.group.room.tabs;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.slashb410.exgroup.R;

/**
 * Created by Tacademy on 2017-02-03.
 */

public class ShotsAdapter extends RecyclerView.Adapter {
//
//    ShotRes.results.Data data = new ArrayList<ShotRes.results.Data>();
//
//    public ShotsAdapter(ShotRes.results.Data shotRes) {
////        if(shotRes==null) throw new IllegalFormatCodePointException("DATA IS NULL");
//        this.data = shotRes;
//    }
//
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cell_shot_card, parent, false);
        return new ShotsHolder(itemView);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
//       ShotRes.results.Data mData = data.get(position);
    }

    @Override
    public int getItemCount() {
        return 0;
    }
}

