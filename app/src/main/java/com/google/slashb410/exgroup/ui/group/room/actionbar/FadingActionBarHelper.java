package com.google.slashb410.exgroup.ui.group.room.actionbar;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;

import com.manuelpeinado.fadingactionbar.FadingActionBarHelperBase;


/**
 * Created by Tacademy on 2017-02-03.
 */

public class FadingActionBarHelper extends FadingActionBarHelperBase {

    private ActionBar mActionBar;



    @Override

    protected int getActionBarHeight() {

        return mActionBar.getHeight();

    }



    @Override

    protected boolean isActionBarNull() {

        return mActionBar == null;

    }



    @Override

    protected void setActionBarBackgroundDrawable(Drawable drawable) {

        mActionBar.setBackgroundDrawable(drawable);

    }



    @Override

    public void initActionBar(Activity activity) {

        mActionBar = ((ActionBarActivity) activity).getSupportActionBar();

        super.initActionBar(activity);

    }
}
