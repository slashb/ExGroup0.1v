package com.google.slashb410.exgroup.ui.group.create;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.google.slashb410.exgroup.R;
import com.google.slashb410.exgroup.util.U;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class GroupAddActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group_add);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.group_add)
    public void goAdd(){
        U.getInstance().goNext(this, WeightCheckActivity.class, false);
    }

}
