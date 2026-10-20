package com.google.android.recaptcha.internal;

import android.webkit.WebView;
import java.util.Arrays;
import m9.d0;
import z6.a;

/* JADX INFO: loaded from: classes.dex */
public final class zzcd {
    private final WebView zza;
    private final d0 zzb;

    public zzcd(WebView webView, d0 d0Var) {
        this.zza = webView;
        this.zzb = d0Var;
    }

    public final void zzb(String str, String... strArr) {
        a.Q(this.zzb, null, 0, new zzcc((String[]) Arrays.copyOf(strArr, strArr.length), this, str, null), 3);
    }
}
