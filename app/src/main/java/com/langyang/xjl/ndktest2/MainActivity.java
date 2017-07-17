package com.langyang.xjl.ndktest2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG=MainActivity.class.getSimpleName();

    //这一段必须要写！意思是加载这个native-lib里的函数和东西
    static {
        System.loadLibrary("native-lib");
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG,String.valueOf(maxFromJNI(2,3)));
    }

    //调用的时候就这么调就好了，这就是在native-lib里的函数
    public static native int maxFromJNI(int a, int b);

}
