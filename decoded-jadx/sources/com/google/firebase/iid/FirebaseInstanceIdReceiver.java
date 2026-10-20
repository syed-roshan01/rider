package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FcmBroadcastProcessor;
import com.google.firebase.messaging.MessagingAnalytics;
import com.google.firebase.messaging.ServiceStarter;
import java.util.concurrent.ExecutionException;
import y5.a;
import y5.b;

/* JADX INFO: loaded from: classes.dex */
public final class FirebaseInstanceIdReceiver extends b {
    private static final String TAG = "FirebaseMessaging";

    private static Intent createServiceIntent(Context context, String str, Bundle bundle) {
        return new Intent(str).putExtras(bundle);
    }

    @Override // y5.b
    public int onMessageReceive(Context context, a aVar) {
        try {
            return ((Integer) Tasks.await(new FcmBroadcastProcessor(context).process(aVar.f16948a))).intValue();
        } catch (InterruptedException | ExecutionException e4) {
            Log.e("FirebaseMessaging", "Failed to send message to service.", e4);
            return ServiceStarter.ERROR_UNKNOWN;
        }
    }

    @Override // y5.b
    public void onNotificationDismissed(Context context, Bundle bundle) {
        Intent intentCreateServiceIntent = createServiceIntent(context, "com.google.firebase.messaging.NOTIFICATION_DISMISS", bundle);
        if (MessagingAnalytics.shouldUploadScionMetrics(intentCreateServiceIntent)) {
            MessagingAnalytics.logNotificationDismiss(intentCreateServiceIntent);
        }
    }
}
