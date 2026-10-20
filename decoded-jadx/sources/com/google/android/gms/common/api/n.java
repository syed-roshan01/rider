package com.google.android.gms.common.api;

/* JADX INFO: loaded from: classes.dex */
public final class n extends UnsupportedOperationException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z5.d f3278a;

    public n(z5.d dVar) {
        this.f3278a = dVar;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Missing ".concat(String.valueOf(this.f3278a));
    }
}
