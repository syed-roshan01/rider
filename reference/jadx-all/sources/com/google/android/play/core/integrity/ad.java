package com.google.android.play.core.integrity;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;
import o7.d0;
import p6.b0;

/* JADX INFO: loaded from: classes.dex */
final class ad {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final p6.c f3425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p6.v f3426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f3427c;

    public ad(Context context, p6.v vVar) {
        this.f3427c = context.getPackageName();
        this.f3426b = vVar;
        if (p6.e.a(context)) {
            this.f3425a = new p6.c(context, vVar, "IntegrityService", ae.f3428a, new b0() { // from class: com.google.android.play.core.integrity.aa
                @Override // p6.b0
                public final Object a(IBinder iBinder) {
                    int i10 = p6.r.f12818d;
                    if (iBinder == null) {
                        return null;
                    }
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IIntegrityService");
                    return iInterfaceQueryLocalInterface instanceof p6.s ? (p6.s) iInterfaceQueryLocalInterface : new p6.q(iBinder, "com.google.android.play.core.integrity.protocol.IIntegrityService");
                }
            });
            return;
        }
        Object[] objArr = new Object[0];
        vVar.getClass();
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", p6.v.c(vVar.f12819a, "Phonesky is not installed.", objArr));
        }
        this.f3425a = null;
    }

    public static Bundle a(ad adVar, byte[] bArr, Long l10, Parcelable parcelable) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", adVar.f3427c);
        bundle.putByteArray("nonce", bArr);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 2);
        bundle.putInt("playcore.integrity.version.patch", 0);
        if (l10 != null) {
            bundle.putLong("cloud.prj", l10.longValue());
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new p6.k(3, System.currentTimeMillis()));
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(d0.c(arrayList)));
        return bundle;
    }

    public final Task b(IntegrityTokenRequest integrityTokenRequest) {
        if (this.f3425a == null) {
            return Tasks.forException(new IntegrityServiceException(-2, null));
        }
        try {
            byte[] bArrDecode = Base64.decode(integrityTokenRequest.nonce(), 10);
            Long lCloudProjectNumber = integrityTokenRequest.cloudProjectNumber();
            integrityTokenRequest.a();
            this.f3426b.b("requestIntegrityToken(%s)", integrityTokenRequest);
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            p6.c cVar = this.f3425a;
            ab abVar = new ab(this, taskCompletionSource, bArrDecode, lCloudProjectNumber, null, taskCompletionSource, integrityTokenRequest);
            cVar.getClass();
            cVar.a().post(new p6.z(cVar, abVar.c(), taskCompletionSource, abVar));
            return taskCompletionSource.getTask();
        } catch (IllegalArgumentException e4) {
            return Tasks.forException(new IntegrityServiceException(-13, e4));
        }
    }
}
