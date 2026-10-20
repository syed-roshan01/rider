package com.google.android.play.core.integrity;

import android.app.PendingIntent;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.Constants;

/* JADX INFO: loaded from: classes.dex */
final class au extends at {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p6.v f3454c;

    public au(ax axVar, TaskCompletionSource taskCompletionSource) {
        super(axVar, taskCompletionSource);
        this.f3454c = new p6.v("OnRequestIntegrityTokenCallback");
    }

    @Override // com.google.android.play.core.integrity.at, p6.p
    public final void c(Bundle bundle) {
        super.c(bundle);
        this.f3454c.b("onRequestExpressIntegrityToken", new Object[0]);
        int i10 = bundle.getInt(Constants.IPC_BUNDLE_KEY_SEND_ERROR);
        if (i10 != 0) {
            this.f3452a.trySetException(new StandardIntegrityException(i10, null));
            return;
        }
        PendingIntent pendingIntent = Build.VERSION.SDK_INT >= 33 ? (PendingIntent) bundle.getParcelable("dialog.intent", PendingIntent.class) : (PendingIntent) bundle.getParcelable("dialog.intent");
        TaskCompletionSource taskCompletionSource = this.f3452a;
        b bVar = new b();
        bVar.c(bundle.getString("token"));
        bVar.b(this.f3454c);
        bVar.a(pendingIntent);
        taskCompletionSource.trySetResult(bVar.d());
    }
}
