package com.google.firebase.analytics.ktx;

import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import d7.a;

/* JADX INFO: loaded from: classes.dex */
public final class ParametersBuilder {
    private final Bundle zza = new Bundle();

    public final Bundle getBundle() {
        return this.zza;
    }

    public final void param(String str, double d10) {
        a.m(str, "key");
        this.zza.putDouble(str, d10);
    }

    public final void param(String str, long j10) {
        a.m(str, "key");
        this.zza.putLong(str, j10);
    }

    public final void param(String str, Bundle bundle) {
        a.m(str, "key");
        a.m(bundle, FirebaseAnalytics.Param.VALUE);
        this.zza.putBundle(str, bundle);
    }

    public final void param(String str, String str2) {
        a.m(str, "key");
        a.m(str2, FirebaseAnalytics.Param.VALUE);
        this.zza.putString(str, str2);
    }

    public final void param(String str, Bundle[] bundleArr) {
        a.m(str, "key");
        a.m(bundleArr, FirebaseAnalytics.Param.VALUE);
        this.zza.putParcelableArray(str, bundleArr);
    }
}
