package com.google.android.gms.common.api.internal;

import android.app.Activity;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f3215a;

    public i(Activity activity) {
        if (activity == null) {
            throw new NullPointerException("Activity must not be null");
        }
        this.f3215a = activity;
    }
}
