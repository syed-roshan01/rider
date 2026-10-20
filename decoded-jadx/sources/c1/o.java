package c1;

import androidx.fragment.app.a0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class o implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f2907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o f2908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o f2909c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ o[] f2910d;

    static {
        o oVar = new o("Active", 0);
        f2907a = oVar;
        o oVar2 = new o("ActiveParent", 1);
        f2908b = oVar2;
        o oVar3 = new o("Captured", 2);
        o oVar4 = new o("Inactive", 3);
        f2909c = oVar4;
        f2910d = new o[]{oVar, oVar2, oVar3, oVar4};
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) f2910d.clone();
    }

    public final boolean a() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                return true;
            }
            if (iOrdinal != 3) {
                throw new a0();
            }
        }
        return false;
    }
}
