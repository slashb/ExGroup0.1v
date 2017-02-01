package com.google.slashb410.exgroup.ui;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.TextView;

import com.google.slashb410.exgroup.R;
import com.google.slashb410.exgroup.ui.group.create.GroupAddActivity;
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
        final String[] groupName = {"슬비네그룹", "소담이네그룹", "혜원이네", "승옥이네", "추가"};


        GridAdapter gridAdapter = new GridAdapter(this, R.layout.group_card_view, groupName);
        GridView gridView = (GridView) findViewById(R.id.group_grid);
        gridView.setAdapter(gridAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(position==groupName.length-1){
                    U.getInstance().goNext(getApplicationContext(), GroupAddActivity.class, false);
                }
            }
        });


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



}

class GridAdapter extends BaseAdapter{

    Context context;
    String[] groupName;
    int layout;
    LayoutInflater inflater;

    public GridAdapter(Context context, int layout, String[] groupName) {
        this.context = context;
        this.layout = layout;
        this.groupName = groupName;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return (groupName.length);
    }

    @Override
    public Object getItem(int position) {

        return groupName[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView==null)
            convertView = inflater.inflate(layout, null);

        TextView textView = (TextView) convertView.findViewById(R.id.group_name);
            textView.setText(groupName[position]);



        return convertView;

    }
}
