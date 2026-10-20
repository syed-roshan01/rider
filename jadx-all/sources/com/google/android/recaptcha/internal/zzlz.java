package com.google.android.recaptcha.internal;

import l.q;

/* JADX INFO: loaded from: classes.dex */
final class zzlz extends IllegalArgumentException {
    public zzlz(int i10, int i11) {
        super(q.i("Unpaired surrogate at index ", i10, " of ", i11));
    }
}
