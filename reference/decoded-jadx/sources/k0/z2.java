package k0;

import com.google.firebase.annotations.concurrent.C0124;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.gson.internal.bind.C0206;
import j3.C0325;
import k2.C0333;
import t8.C0426;
import x8.C0473;

/* JADX INFO: loaded from: classes.dex */
public final class z2 extends w8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a3 f9696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public y2 f9697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public u9.a f9698c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f9699d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a3 f9700e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f9701f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2(a3 a3Var, u8.e eVar) {
        super(eVar);
        this.f9700e = a3Var;
        int iM6472 = C0333.m6472();
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM6472 >= 0) {
                        i10 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Float.decode(C0426.m8366("i7QorA32oTbfY6OnxBY0")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i10 = 1678;
        }
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        String str = "\u06e0\u06e3\u06e2";
        Object objM6289 = null;
        a3 a3VarM3937 = null;
        int i10 = 0;
        int i11 = 0;
        int iM9223 = 0;
        int i12 = 0;
        while (true) {
            switch (C0124.m2383(str)) {
                case 56351:
                    return objM6289;
                case 1747775:
                    this.f9699d = obj;
                    str = "\u06e3\u06e6";
                    break;
                case 1749603:
                    str = "\u06e8\u06e4\u06df";
                    i12 = iM9223 ^ Integer.MIN_VALUE;
                    break;
                case 1749857:
                    a3VarM3937 = C0206.m3937(this);
                    str = "\u06e6\u06e6\u06e7";
                    break;
                case 1752524:
                    i10 = iM9223 & Integer.MIN_VALUE;
                    str = "\u06e2\u06e0\u06e1";
                    break;
                case 1753639:
                    objM6289 = C0325.m6289(a3VarM3937, null, this);
                    str = "\u06e1\u06e0";
                    break;
                case 1754383:
                    this.f9701f = i11;
                    str = "\u06e2\u06e8\u06e7";
                    break;
                case 1755491:
                    str = "\u06e7\u06df\u06e7";
                    i11 = i12 | i10;
                    break;
                default:
                    str = "\u06e5\u06e1\u06e8";
                    iM9223 = C0473.m9223(this);
                    break;
            }
        }
    }
}
