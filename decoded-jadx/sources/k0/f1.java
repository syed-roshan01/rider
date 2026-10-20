package k0;

import androidx.activity.C0017;
import androidx.compose.foundation.layout.C0021;
import c7.C0068;
import com.google.firebase.C0205;
import dagger.hilt.android.internal.modules.C0233;
import dagger.hilt.codegen.C0241;
import h5.C0308;
import m3.C0352;
import u.C0428;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f1 f8913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f1 f8914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f1 f8915c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f1[] f8916d;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f492short = {3017, 3040, 3052, 3066, 3068, 3050, 3051, 667, 672, 680, 673, 685, 699, 701, 683, 682, 651, 675, 702, 698, 695, 1373, 1382, 1390, 1383, 1387, 1405, 1403, 1389, 1388, 1350, 1383, 1404, 1357, 1381, 1400, 1404, 1393};

    static {
        f1 f1Var = new f1(C0021.m421(f492short, 0, C0308.f456 ^ (-235), 2959), 0);
        f8913a = f1Var;
        f1 f1Var2 = new f1(C0241.m4619(f492short, 7, C0352.f623 ^ (-637), 718), 1);
        f8914b = f1Var2;
        f1 f1Var3 = new f1(C0233.m4496(f492short, 21, C0205.f229 ^ 444, 1288), C0233.f313 ^ 316);
        f8915c = f1Var3;
        f1[] f1VarArr = new f1[3];
        f1VarArr[C0068.f88 ^ (-762)] = f1Var;
        f1VarArr[C0428.f699 ^ 198] = f1Var2;
        f1VarArr[C0017.f37 ^ (-435)] = f1Var3;
        f8916d = f1VarArr;
    }

    public static f1 valueOf(String str) {
        return (f1) Enum.valueOf(f1.class, str);
    }

    public static f1[] values() {
        return (f1[]) f8916d.clone();
    }
}
