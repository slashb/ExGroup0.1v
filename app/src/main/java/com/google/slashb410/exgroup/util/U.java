package com.google.slashb410.exgroup.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

/**
 * Created by Tacademy on 2017-01-20.
 */
public class U {
    private static U ourInstance = new U();

    public static U getInstance() {
        return ourInstance;
    }

    private U() {
    }

    public void myLog(String msg){
        Log.i("U*", "=====================================");
        Log.i("U*", ""+msg); //null 출력하면 죽으니까 ""+
        Log.i("U*", "=====================================");
    }

    //통신큐
    RequestQueue requestQueue;
    public RequestQueue getRequestQueue(Context context){
        if(requestQueue == null) requestQueue = Volley.newRequestQueue(context);
        return requestQueue;
    }



    //다음 액티비티로 + 슬라이드 애니메이션(true, false)
    public void goNext(Context context, Class nextActivity, boolean isSliding){
        Intent intent = new Intent(context, nextActivity);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);


        context.startActivity(intent);
        if(isSliding){
            ((Activity) context).overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        }
    }
}
