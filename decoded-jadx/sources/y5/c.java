package y5;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.internal.cloudmessaging.zza;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import q.z;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f16949h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static PendingIntent f16950i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Pattern f16951j = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f16953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k3.b f16954c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f16955d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Messenger f16957f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public h f16958g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f16952a = new z(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Messenger f16956e = new Messenger(new f(this, Looper.getMainLooper()));

    public c(Context context) {
        this.f16953b = context;
        this.f16954c = new k3.b(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f16955d = scheduledThreadPoolExecutor;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:42:0x00de  */
    public final Task a(Bundle bundle) {
        final String string;
        synchronized (c.class) {
            int i10 = f16949h;
            f16949h = i10 + 1;
            string = Integer.toString(i10);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        synchronized (this.f16952a) {
            this.f16952a.put(string, taskCompletionSource);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.f16954c.f() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        Context context = this.f16953b;
        synchronized (c.class) {
            try {
                if (f16950i == null) {
                    Intent intent2 = new Intent();
                    intent2.setPackage("com.google.example.invalidpackage");
                    f16950i = PendingIntent.getBroadcast(context, 0, intent2, zza.zza);
                }
                intent.putExtra("app", f16950i);
            } catch (Throwable th) {
                throw th;
            }
        }
        intent.putExtra("kid", "|ID|" + string + "|");
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Sending ".concat(String.valueOf(intent.getExtras())));
        }
        intent.putExtra("google.messenger", this.f16956e);
        if (this.f16957f != null || this.f16958g != null) {
            Message messageObtain = Message.obtain();
            messageObtain.obj = intent;
            try {
                Messenger messenger = this.f16957f;
                if (messenger != null) {
                    messenger.send(messageObtain);
                } else {
                    Messenger messenger2 = this.f16958g.f16965a;
                    messenger2.getClass();
                    messenger2.send(messageObtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
                if (this.f16954c.f() == 2) {
                    this.f16953b.sendBroadcast(intent);
                } else {
                    this.f16953b.startService(intent);
                }
            }
        } else if (this.f16954c.f() == 2) {
            this.f16953b.sendBroadcast(intent);
        } else {
            this.f16953b.startService(intent);
        }
        final ScheduledFuture<?> scheduledFutureSchedule = this.f16955d.schedule(new h.a(taskCompletionSource, 7), 30L, TimeUnit.SECONDS);
        taskCompletionSource.getTask().addOnCompleteListener(p.f16986a, new OnCompleteListener() { // from class: y5.e
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                c cVar = this.f16961a;
                String str = string;
                ScheduledFuture scheduledFuture = scheduledFutureSchedule;
                synchronized (cVar.f16952a) {
                    cVar.f16952a.remove(str);
                }
                scheduledFuture.cancel(false);
            }
        });
        return taskCompletionSource.getTask();
    }

    public final void b(String str, Bundle bundle) {
        synchronized (this.f16952a) {
            try {
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f16952a.remove(str);
                if (taskCompletionSource != null) {
                    taskCompletionSource.setResult(bundle);
                    return;
                }
                Log.w("Rpc", "Missing callback for " + str);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
