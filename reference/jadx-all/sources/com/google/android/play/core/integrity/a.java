package com.google.android.play.core.integrity;

import android.app.PendingIntent;

/* JADX INFO: loaded from: classes.dex */
final class a extends ag {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f3413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private p6.v f3414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private PendingIntent f3415c;

    @Override // com.google.android.play.core.integrity.ag
    public final ag a(PendingIntent pendingIntent) {
        this.f3415c = pendingIntent;
        return this;
    }

    @Override // com.google.android.play.core.integrity.ag
    public final ag b(p6.v vVar) {
        if (vVar == null) {
            throw new NullPointerException("Null logger");
        }
        this.f3414b = vVar;
        return this;
    }

    @Override // com.google.android.play.core.integrity.ag
    public final ag c(String str) {
        this.f3413a = str;
        return this;
    }

    @Override // com.google.android.play.core.integrity.ag
    public final ah d() {
        p6.v vVar;
        String str = this.f3413a;
        if (str != null && (vVar = this.f3414b) != null) {
            return new ah(str, vVar, this.f3415c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f3413a == null) {
            sb.append(" token");
        }
        if (this.f3414b == null) {
            sb.append(" logger");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
