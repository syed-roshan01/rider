package z5;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.base.zaq;
import com.google.android.gms.internal.common.zzd;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class m extends zaq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f17265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f17266b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(e eVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.f17266b = eVar;
        this.f17265a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 != 1) {
            StringBuilder sb = new StringBuilder(50);
            sb.append("Don't know how to handle this message: ");
            sb.append(i10);
            Log.w("GoogleApiAvailability", sb.toString());
            return;
        }
        int i11 = f.f17252a;
        e eVar = this.f17266b;
        Context context = this.f17265a;
        int iC = eVar.c(context, i11);
        AtomicBoolean atomicBoolean = j.f17255a;
        if (iC == 1 || iC == 2 || iC == 3 || iC == 9) {
            Intent intentA = eVar.a(iC, context, "n");
            eVar.g(context, iC, intentA == null ? null : PendingIntent.getActivity(context, 0, intentA, zzd.zza | 134217728));
        }
    }
}
