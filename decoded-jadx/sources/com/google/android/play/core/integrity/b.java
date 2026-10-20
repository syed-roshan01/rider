package com.google.android.play.core.integrity;

import android.app.PendingIntent;

/* JADX INFO: loaded from: classes.dex */
final class b extends ba {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f3464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private p6.v f3465b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private PendingIntent f3466c;

    @Override // com.google.android.play.core.integrity.ba
    public final ba a(PendingIntent pendingIntent) {
        this.f3466c = pendingIntent;
        return this;
    }

    @Override // com.google.android.play.core.integrity.ba
    public final ba b(p6.v vVar) {
        if (vVar == null) {
            throw new NullPointerException("Null logger");
        }
        this.f3465b = vVar;
        return this;
    }

    @Override // com.google.android.play.core.integrity.ba
    public final ba c(String str) {
        if (str == null) {
            throw new NullPointerException("Null token");
        }
        this.f3464a = str;
        return this;
    }

    @Override // com.google.android.play.core.integrity.ba
    public final bb d() {
        p6.v vVar;
        String str = this.f3464a;
        if (str != null && (vVar = this.f3465b) != null) {
            return new bb(str, vVar, this.f3466c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f3464a == null) {
            sb.append(" token");
        }
        if (this.f3465b == null) {
            sb.append(" logger");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
