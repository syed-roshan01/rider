package l;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class t2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f10940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f10941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f10942c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Serializable f10943d;

    public t2(boolean z10) {
        this.f10940a = z10;
    }

    public final void a(i8.a... aVarArr) {
        if (!this.f10940a) {
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }
        String[] strArr = new String[aVarArr.length];
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            strArr[i10] = aVarArr[i10].f8123a;
        }
        this.f10942c = strArr;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.io.Serializable, java.lang.String[]] */
    public final void b(i8.m... mVarArr) {
        if (!this.f10940a) {
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }
        if (mVarArr.length == 0) {
            throw new IllegalArgumentException("At least one TlsVersion is required");
        }
        ?? r10 = new String[mVarArr.length];
        for (int i10 = 0; i10 < mVarArr.length; i10++) {
            r10[i10] = mVarArr[i10].f8171a;
        }
        this.f10943d = r10;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.Serializable, java.lang.String[]] */
    public t2(i8.b bVar) {
        this.f10940a = bVar.f8125a;
        this.f10942c = bVar.f8126b;
        this.f10943d = bVar.f8127c;
        this.f10941b = bVar.f8128d;
    }
}
