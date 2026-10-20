package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.Constants;

/* JADX INFO: loaded from: classes.dex */
final class av extends at {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p6.v f3455c;

    public av(ax axVar, TaskCompletionSource taskCompletionSource) {
        super(axVar, taskCompletionSource);
        this.f3455c = new p6.v("OnWarmUpIntegrityTokenCallback");
    }

    @Override // com.google.android.play.core.integrity.at, p6.p
    public final void e(Bundle bundle) {
        super.e(bundle);
        this.f3455c.b("onWarmUpExpressIntegrityToken", new Object[0]);
        int i10 = bundle.getInt(Constants.IPC_BUNDLE_KEY_SEND_ERROR);
        if (i10 != 0) {
            this.f3452a.trySetException(new StandardIntegrityException(i10, null));
        } else {
            this.f3452a.trySetResult(Long.valueOf(bundle.getLong("warm.up.sid")));
        }
    }
}
