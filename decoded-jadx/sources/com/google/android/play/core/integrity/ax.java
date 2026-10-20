package com.google.android.play.core.integrity;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import o7.d0;
import p6.b0;

/* JADX INFO: loaded from: classes.dex */
final class ax {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final p6.c f3457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p6.v f3458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f3459c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final TaskCompletionSource f3460d;

    public ax(Context context, p6.v vVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f3460d = taskCompletionSource;
        this.f3459c = context.getPackageName();
        this.f3458b = vVar;
        p6.c cVar = new p6.c(context, vVar, "ExpressIntegrityService", ay.f3461a, new b0() { // from class: com.google.android.play.core.integrity.ap
            @Override // p6.b0
            public final Object a(IBinder iBinder) {
                int i10 = p6.m.f12817d;
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
                return iInterfaceQueryLocalInterface instanceof p6.n ? (p6.n) iInterfaceQueryLocalInterface : new p6.l(iBinder, "com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
            }
        });
        this.f3457a = cVar;
        cVar.a().post(new aq(this, taskCompletionSource, context));
    }

    public static Bundle a(ax axVar, String str, long j10, long j11) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", axVar.f3459c);
        bundle.putLong("cloud.prj", j10);
        bundle.putString("nonce", str);
        bundle.putLong("warm.up.sid", j11);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new p6.k(5, System.currentTimeMillis()));
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(d0.c(arrayList)));
        return bundle;
    }

    public static Bundle b(ax axVar, long j10) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", axVar.f3459c);
        bundle.putLong("cloud.prj", j10);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new p6.k(4, System.currentTimeMillis()));
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(d0.c(arrayList)));
        return bundle;
    }

    public static /* bridge */ /* synthetic */ boolean g(ax axVar) {
        return axVar.f3460d.getTask().isSuccessful() && !((Boolean) axVar.f3460d.getTask().getResult()).booleanValue();
    }

    public final Task c(String str, long j10, long j11) {
        this.f3458b.b("requestExpressIntegrityToken(%s)", Long.valueOf(j11));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        p6.c cVar = this.f3457a;
        as asVar = new as(this, taskCompletionSource, str, j10, j11, taskCompletionSource);
        cVar.getClass();
        cVar.a().post(new p6.z(cVar, asVar.c(), taskCompletionSource, asVar));
        return taskCompletionSource.getTask();
    }

    public final Task d(long j10) {
        this.f3458b.b("warmUpIntegrityToken(%s)", Long.valueOf(j10));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        p6.c cVar = this.f3457a;
        ar arVar = new ar(this, taskCompletionSource, j10, taskCompletionSource);
        cVar.getClass();
        cVar.a().post(new p6.z(cVar, arVar.c(), taskCompletionSource, arVar));
        return taskCompletionSource.getTask();
    }
}
