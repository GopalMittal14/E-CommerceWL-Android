package com.example.ecommercewlsdk;

import android.util.Log;

public class LogDebug {
    private static final String TAG="Message";

    public static void d(String message)
    {
        Log.d(TAG,message);
    }
}
