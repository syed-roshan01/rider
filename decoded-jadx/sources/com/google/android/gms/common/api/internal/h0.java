package com.google.android.gms.common.api.internal;

import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.internal.base.zaq;

/* JADX INFO: loaded from: classes.dex */
public final class h0 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f3213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.fragment.app.x f3214b;

    public h0(androidx.fragment.app.x xVar) {
        this.f3214b = xVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            androidx.fragment.app.x xVar = this.f3214b;
            x xVar2 = (x) ((v0) xVar.f2047b).f3258c;
            xVar2.f3266b.set(null);
            zaq zaqVar = xVar2.f3270f.f3205n;
            zaqVar.sendMessage(zaqVar.obtainMessage(3));
            Dialog dialog = (Dialog) xVar.f2046a;
            if (dialog.isShowing()) {
                dialog.dismiss();
            }
            synchronized (this) {
                try {
                    Context context2 = this.f3213a;
                    if (context2 != null) {
                        context2.unregisterReceiver(this);
                    }
                    this.f3213a = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
