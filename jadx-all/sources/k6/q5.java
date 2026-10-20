package k6;

import a7.C0008;
import android.support.v4.graphics.drawable.C0016;
import androidx.compose.ui.layout.C0035;
import com.google.android.gms.internal.tasks.C0102;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.gson.internal.bind.C0207;
import d1.C0213;
import d1.C0214;
import dagger.hilt.components.C0244;
import f4.C0277;
import r7.C0405;
import u3.C0435;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class q5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q5 f10320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q5 f10321c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final q5[] f10322d;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f577short = {2913, 2918, 2941, 2912, 2931, 2933, 2935, 2630, 2639, 2627};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r5[] f10323a;

    static {
        r5 r5Var = r5.f10341b;
        r5 r5Var2 = r5.f10342c;
        r5[] r5VarArr = new r5[2];
        r5VarArr[C0008.f28 ^ (-8)] = r5Var;
        r5VarArr[C0244.f323 ^ 113] = r5Var2;
        q5 q5Var = new q5(C0016.m329(f577short, 0, C0207.f231 ^ (-622), 2866), 0, r5VarArr);
        f10320b = q5Var;
        r5[] r5VarArr2 = new r5[1];
        r5VarArr2[C0277.f392 ^ (-122)] = r5.f10343d;
        q5 q5Var2 = new q5(C0035.m686(f577short, 7, C0435.f705 ^ 445, 2562), 1, r5VarArr2);
        f10321c = q5Var2;
        q5[] q5VarArr = new q5[2];
        q5VarArr[C0405.f675 ^ 806] = q5Var;
        q5VarArr[C0213.f236 ^ 233] = q5Var2;
        f10322d = q5VarArr;
    }

    public q5(String str, int i10, r5... r5VarArr) {
        super(str, i10);
        this.f10323a = r5VarArr;
        int iM4083 = C0214.m4083();
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case Code.UNAVAILABLE /* 14 */:
                    break;
                case 49:
                    if (iM4083 >= 0) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    System.out.println(Long.valueOf(C0102.m2004("MM3HpFIS")));
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i11 = 1678;
        }
    }

    public static q5[] values() {
        return (q5[]) f10322d.clone();
    }
}
