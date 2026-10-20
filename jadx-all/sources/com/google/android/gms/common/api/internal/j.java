package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
public interface j {
    void a(String str, LifecycleCallback lifecycleCallback);

    LifecycleCallback b(Class cls, String str);

    Activity c();

    void startActivityForResult(Intent intent, int i10);
}
