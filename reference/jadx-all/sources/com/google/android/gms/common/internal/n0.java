package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class n0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Uri f3344e = new Uri.Builder().scheme(FirebaseAnalytics.Param.CONTENT).authority("com.google.android.gms.chimera").build();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3347c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f3348d;

    public n0(int i10, String str, String str2, boolean z10) {
        f6.a.u(str);
        this.f3345a = str;
        f6.a.u(str2);
        this.f3346b = str2;
        this.f3347c = i10;
        this.f3348d = z10;
    }

    public final Intent a(Context context) {
        Bundle bundleCall;
        Intent intent = null;
        String str = this.f3345a;
        if (str == null) {
            return new Intent().setComponent(null);
        }
        if (this.f3348d) {
            Bundle bundle = new Bundle();
            bundle.putString("serviceActionBundleKey", str);
            try {
                bundleCall = context.getContentResolver().call(f3344e, "serviceIntentCall", (String) null, bundle);
            } catch (IllegalArgumentException e4) {
                Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e4.toString()));
                bundleCall = null;
            }
            intent = bundleCall != null ? (Intent) bundleCall.getParcelable("serviceResponseIntentKey") : null;
            if (intent == null) {
                Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action: ".concat(String.valueOf(str)));
            }
        }
        return intent != null ? intent : new Intent(str).setPackage(this.f3346b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return y3.e.g0(this.f3345a, n0Var.f3345a) && y3.e.g0(this.f3346b, n0Var.f3346b) && y3.e.g0(null, null) && this.f3347c == n0Var.f3347c && this.f3348d == n0Var.f3348d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3345a, this.f3346b, null, Integer.valueOf(this.f3347c), Boolean.valueOf(this.f3348d)});
    }

    public final String toString() {
        String str = this.f3345a;
        if (str != null) {
            return str;
        }
        f6.a.x(null);
        throw null;
    }
}
