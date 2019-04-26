package com.callrecorder.receiver;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.callrecorder.service.RecService;
import com.facebook.react.HeadlessJsTaskService;
public final class RecReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        Intent recIntent = new Intent(context, RecService.class);
        context.startService(recIntent);
        HeadlessJsTaskService.acquireWakeLockNow(context);
    }
}