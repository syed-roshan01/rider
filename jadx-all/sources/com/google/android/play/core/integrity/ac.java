package com.google.android.play.core.integrity;

import android.app.PendingIntent;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.Constants;

/* JADX INFO: loaded from: classes.dex */
final class ac extends p6.t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ ad f3422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p6.v f3423b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TaskCompletionSource f3424c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac(ad adVar, TaskCompletionSource taskCompletionSource) {
        super("com.google.android.play.core.integrity.protocol.IIntegrityServiceCallback");
        this.f3422a = adVar;
        this.f3423b = new p6.v("OnRequestIntegrityTokenCallback");
        this.f3424c = taskCompletionSource;
    }

    @Override // p6.u
    public final void b(Bundle bundle) {
        this.f3422a.f3425a.c(this.f3424c);
        this.f3423b.b("onRequestIntegrityToken", new Object[0]);
        int i10 = bundle.getInt(Constants.IPC_BUNDLE_KEY_SEND_ERROR);
        if (i10 != 0) {
            this.f3424c.trySetException(new IntegrityServiceException(i10, null));
            return;
        }
        String string = bundle.getString("token");
        if (string == null) {
            this.f3424c.trySetException(new IntegrityServiceException(-100, null));
            return;
        }
        PendingIntent pendingIntent = Build.VERSION.SDK_INT >= 33 ? (PendingIntent) bundle.getParcelable("dialog.intent", PendingIntent.class) : (PendingIntent) bundle.getParcelable("dialog.intent");
        TaskCompletionSource taskCompletionSource = this.f3424c;
        a aVar = new a();
        aVar.c(string);
        aVar.b(this.f3423b);
        aVar.a(pendingIntent);
        taskCompletionSource.trySetResult(aVar.d());
    }
}
