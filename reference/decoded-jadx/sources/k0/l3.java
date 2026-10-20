package k0;

import androidx.compose.ui.input.pointer.C0034;
import dagger.hilt.internal.aggregatedroot.codegen.C0245;
import f4.C0275;
import h7.C0310;
import p5.C0377;
import u0.C0430;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class l3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l3 f9183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l3 f9184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l3[] f9185c;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f497short = {2484, 2457, 2435, 2461, 2457, 2435, 2435, 2453, 2452, 3101, 3135, 3112, 3125, 3123, 3122, 3084, 3129, 3118, 3130, 3123, 3118, 3121, 3129, 3128};

    static {
        l3 l3Var = new l3(C0377.m7393(f497short, 0, C0034.f54 ^ 526, 2544), 0);
        f9183a = l3Var;
        l3 l3Var2 = new l3(C0245.m4713(f497short, 9, C0310.f458 ^ (-180), 3164), 1);
        f9184b = l3Var2;
        l3[] l3VarArr = new l3[2];
        l3VarArr[C0430.f701 ^ 990] = l3Var;
        l3VarArr[C0275.f391 ^ 986] = l3Var2;
        f9185c = l3VarArr;
    }

    public static l3 valueOf(String str) {
        return (l3) Enum.valueOf(l3.class, str);
    }

    public static l3[] values() {
        return (l3[]) f9185c.clone();
    }
}
