package y5;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.cloudmessaging.zze;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.Constants;
import com.google.firebase.messaging.ServiceStarter;
import java.lang.ref.SoftReference;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends BroadcastReceiver {
    private static SoftReference zza;

    public final int a(Context context, Intent intent) {
        int i10;
        Task taskG;
        if (intent.getExtras() == null) {
            return ServiceStarter.ERROR_UNKNOWN;
        }
        a aVar = new a(intent);
        String stringExtra = intent.getStringExtra(Constants.MessagePayloadKeys.MSGID);
        if (stringExtra == null) {
            stringExtra = intent.getStringExtra(Constants.MessagePayloadKeys.MSGID_SERVER);
        }
        if (TextUtils.isEmpty(stringExtra)) {
            taskG = Tasks.forResult(null);
        } else {
            Bundle bundle = new Bundle();
            String stringExtra2 = intent.getStringExtra(Constants.MessagePayloadKeys.MSGID);
            if (stringExtra2 == null) {
                stringExtra2 = intent.getStringExtra(Constants.MessagePayloadKeys.MSGID_SERVER);
            }
            bundle.putString(Constants.MessagePayloadKeys.MSGID, stringExtra2);
            Integer numValueOf = intent.hasExtra(Constants.MessagePayloadKeys.PRODUCT_ID) ? Integer.valueOf(intent.getIntExtra(Constants.MessagePayloadKeys.PRODUCT_ID, 0)) : null;
            if (numValueOf != null) {
                bundle.putInt(Constants.MessagePayloadKeys.PRODUCT_ID, numValueOf.intValue());
            }
            bundle.putBoolean("supports_message_handled", true);
            o oVarF = o.f(context);
            synchronized (oVarF) {
                i10 = oVarF.f16982a;
                oVarF.f16982a = i10 + 1;
            }
            taskG = oVarF.g(new l(i10, 2, bundle, 0));
        }
        int iOnMessageReceive = onMessageReceive(context, aVar);
        try {
            Tasks.await(taskG, TimeUnit.SECONDS.toMillis(1L), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e4) {
            Log.w("CloudMessagingReceiver", "Message ack failed: ".concat(e4.toString()));
        }
        return iOnMessageReceive;
    }

    public final int b(Context context, Intent intent) {
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException unused) {
                Log.e("CloudMessagingReceiver", "Notification pending intent canceled");
            }
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            extras.remove("pending_intent");
        } else {
            extras = new Bundle();
        }
        String action = intent.getAction();
        if (action == "com.google.firebase.messaging.NOTIFICATION_DISMISS" || (action != null && action.equals("com.google.firebase.messaging.NOTIFICATION_DISMISS"))) {
            onNotificationDismissed(context, extras);
            return -1;
        }
        Log.e("CloudMessagingReceiver", "Unknown notification action");
        return ServiceStarter.ERROR_UNKNOWN;
    }

    public Executor getBroadcastExecutor() {
        ExecutorService executorServiceUnconfigurableExecutorService;
        synchronized (b.class) {
            try {
                SoftReference softReference = zza;
                executorServiceUnconfigurableExecutorService = softReference != null ? (ExecutorService) softReference.get() : null;
                if (executorServiceUnconfigurableExecutorService == null) {
                    zze.zza();
                    executorServiceUnconfigurableExecutorService = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new m.c("firebase-iid-executor")));
                    zza = new SoftReference(executorServiceUnconfigurableExecutorService);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return executorServiceUnconfigurableExecutorService;
    }

    public abstract int onMessageReceive(Context context, a aVar);

    public abstract void onNotificationDismissed(Context context, Bundle bundle);

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        getBroadcastExecutor().execute(new androidx.fragment.app.h(this, intent, context, isOrderedBroadcast(), goAsync()));
    }

    public final /* synthetic */ void zza(Intent intent, Context context, boolean z10, BroadcastReceiver.PendingResult pendingResult) {
        try {
            Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
            Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
            int iB = intent2 != null ? b(context, intent2) : a(context, intent);
            if (z10) {
                pendingResult.setResultCode(iB);
            }
        } finally {
            pendingResult.finish();
        }
    }
}
