package com.google.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class f2 implements q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t1 f4107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f4109c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4110d;

    public f2(t1 t1Var, String str, Object[] objArr) {
        this.f4107a = t1Var;
        this.f4108b = str;
        this.f4109c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f4110d = cCharAt;
            return;
        }
        int i10 = cCharAt & 8191;
        int i11 = 13;
        int i12 = 1;
        while (true) {
            int i13 = i12 + 1;
            char cCharAt2 = str.charAt(i12);
            if (cCharAt2 < 55296) {
                this.f4110d = i10 | (cCharAt2 << i11);
                return;
            } else {
                i10 |= (cCharAt2 & 8191) << i11;
                i11 += 13;
                i12 = i13;
            }
        }
    }

    public final t1 a() {
        return this.f4107a;
    }

    public final Object[] b() {
        return this.f4109c;
    }

    public final String c() {
        return this.f4108b;
    }

    public final int d() {
        return (this.f4110d & 1) == 1 ? 1 : 2;
    }
}
