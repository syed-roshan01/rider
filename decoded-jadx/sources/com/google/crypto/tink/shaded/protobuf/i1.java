package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class i1 implements v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f3559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f3561c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f3562d;

    public i1(b0 b0Var, String str, Object[] objArr) {
        this.f3559a = b0Var;
        this.f3560b = str;
        this.f3561c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < '\ud800') {
            this.f3562d = cCharAt;
            return;
        }
        int i10 = cCharAt & '\u1fff';
        int i11 = 1;
        int i12 = 13;
        while (true) {
            int i13 = i11 + 1;
            char cCharAt2 = str.charAt(i11);
            if (cCharAt2 < '\ud800') {
                this.f3562d = i10 | (cCharAt2 << i12);
                return;
            } else {
                i10 |= (cCharAt2 & '\u1fff') << i12;
                i12 += 13;
                i11 = i13;
            }
        }
    }

    public final b a() {
        return this.f3559a;
    }

    public final Object[] b() {
        return this.f3561c;
    }

    public final String c() {
        return this.f3560b;
    }

    public final int d() {
        return (this.f3562d & 1) == 1 ? 1 : 2;
    }
}
