package com.google.slashb410.exgroup.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import com.google.slashb410.exgroup.R;
import com.google.slashb410.exgroup.ui.mypage.MyHomeActivity;
import com.google.slashb410.exgroup.ui.settings.AccountSettingActivity;
import com.google.slashb410.exgroup.ui.settings.PushSettingActivity;
import com.google.slashb410.exgroup.ui.settings.ToDeveloperActivity;
import com.google.slashb410.exgroup.util.U;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_home, menu);

        return true;
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        return super.onPrepareOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();


        switch(id) {
            case R.id.action_push:
                U.getInstance().goNext(this, PushSettingActivity.class, false);
                return true;
            case R.id.action_account:
                U.getInstance().goNext(this, AccountSettingActivity.class, false);
                return true;
            case R.id.action_to_developers:
                U.getInstance().goNext(this, ToDeveloperActivity.class, false);
                return true;
        }
        return super.onOptionsItemSelected(item);

    }

    @OnClick(R.id.profile_box)
    public void goMyPage(){
        U.getInstance().goNext(this, MyHomeActivity.class, false);
    }

    @OnClick(R.id.tmp_group_in)
    public void goGroup(){

    }

    @OnClick(R.id.tmp_add_group)
    public void addGroup(){
        
    }

}
