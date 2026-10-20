package k0;

import androidx.compose.foundation.C0026;
import com.google.firebase.firestore.ktx.C0156;
import h5.C0308;
import i4.C0318;
import r5.C0400;
import v7.C0450;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class a5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a5 f8721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a5[] f8722b;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f482short = {1960, 1927, 1922, 1922, 1931, 1930, 1838, 1812, 1813, 1805, 1800, 1807, 1796, 1797};

    static {
        a5 a5Var = new a5(C0308.m5933(f482short, 0, C0318.f465 ^ 339, 2030), 0);
        a5 a5Var2 = new a5(C0400.m7813(f482short, 6, C0026.f46 ^ (-305), 1889), 1);
        f8721a = a5Var2;
        a5[] a5VarArr = new a5[2];
        a5VarArr[C0450.f720 ^ 360] = a5Var;
        a5VarArr[C0156.f180 ^ 395] = a5Var2;
        f8722b = a5VarArr;
    }

    public static a5 valueOf(String str) {
        return (a5) Enum.valueOf(a5.class, str);
    }

    public static a5[] values() {
        return (a5[]) f8722b.clone();
    }
}
