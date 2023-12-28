package com.example.aidlservertemplate

import android.app.IntentService
import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.os.IInterface
import android.os.Parcel
import android.util.Log
import com.sunyard.vi218asu806.appserver.aidl.IDeviceServiceStub
import java.io.FileDescriptor

class MyService : IntentService("MyIntentService") {
    companion object{
        private var TAG = MyService.javaClass.name
    }

    override fun onBind(intent: Intent): IBinder {
        return IDeviceServiceStub
    }

    override fun onHandleIntent(intent: Intent?) {
        while(true) {
            Log.d(TAG,"appServer is running")
            Thread.sleep(100000)
        }
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        return super.onStartCommand(intent, flags, startId)
        return START_REDELIVER_INTENT
    }
}