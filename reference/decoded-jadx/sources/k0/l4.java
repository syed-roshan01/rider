package k0;

import androidx.appcompat.widget.C0020;
import androidx.core.app.C0040;
import androidx.core.content.C0041;
import dagger.hilt.internal.C0252;
import e2.C0262;
import e7.C0264;
import k3.C0334;
import n1.C0362;
import x0.C0466;
import x4.C0468;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class l4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l4 f9186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l4 f9187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l4 f9188c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l4[] f9189d;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f498short = {1469, 1416, 1419, 1434, 2586, 2615, 2600, 2615, 2618, 2619, 2604, 3015, 3040, 3050, 3047, 3053, 3055, 3066, 3041, 3068};

    static {
        l4 l4Var = new l4(C0362.m7110(f498short, 0, C0466.f737 ^ 336, 1513), 0);
        f9186a = l4Var;
        l4 l4Var2 = new l4(C0334.m6494(f498short, 4, C0252.f332 ^ 682, 2654), 1);
        f9187b = l4Var2;
        l4 l4Var3 = new l4(C0468.m9129(f498short, 11, C0020.f40 ^ (-660), 2958), C0040.f60 ^ (-83));
        f9188c = l4Var3;
        l4[] l4VarArr = new l4[3];
        l4VarArr[C0262.f342 ^ 189] = l4Var;
        l4VarArr[C0264.f344 ^ 574] = l4Var2;
        l4VarArr[C0041.f61 ^ (-324)] = l4Var3;
        f9189d = l4VarArr;
    }

    public static l4 valueOf(String str) {
        return (l4) Enum.valueOf(l4.class, str);
    }

    public static l4[] values() {
        return (l4[]) f9189d.clone();
    }
}
