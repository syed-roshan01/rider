package g5;

import android.support.v4.app.C0014;
import androidx.compose.foundation.layout.C0021;
import b.C0049;
import b7.C0054;
import com.google.android.datatransport.cct.C0076;
import com.google.firebase.analytics.ktx.ktxtesting.C0119;
import com.google.firebase.database.collection.C0138;
import com.google.firebase.firestore.bundle.C0148;
import com.google.firebase.ktx.C0180;
import dagger.hilt.components.C0244;
import j5.C0327;
import n1.C0362;
import s.C0408;
import z0.C0482;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f6618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f6619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f6620c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f6621d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c[] f6622e;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f437short = {1695, 1694, 1669, 1678, 1688, 1695, 1666, 1669, 1680, 1693, 1693, 1684, 1685, 2628, 2629, 2654, 2645, 2648, 2655, 2628, 2628, 2627, 2628, 2637, 1522, 1511, 1520, 1519, 1515, 1521, 1521, 1515, 1517, 1516, 1533, 1510, 1511, 1516, 1515, 1511, 1510, 2168, 2159, 2155, 2158, 2163};

    static {
        c cVar = new c(C0408.m8010(f437short, 0, C0327.f475 ^ (-808), 1745), 0);
        f6618a = cVar;
        c cVar2 = new c(C0244.m4690(f437short, 13, C0138.f164 ^ (-575), 2570), 1);
        f6619b = cVar2;
        c cVar3 = new c(C0119.m2300(f437short, 24, C0021.f41 ^ 989, 1442), C0482.f756 ^ 941);
        f6620c = cVar3;
        c cVar4 = new c(C0076.m1657(f437short, 41, C0148.f173 ^ (-245), 2090), C0014.f34 ^ 961);
        f6621d = cVar4;
        c[] cVarArr = new c[4];
        cVarArr[C0362.f633 ^ 126] = cVar;
        cVarArr[C0049.f69 ^ 302] = cVar2;
        cVarArr[C0054.f74 ^ 332] = cVar3;
        cVarArr[C0180.f204 ^ (-373)] = cVar4;
        f6622e = cVarArr;
        z6.a.y(cVarArr);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f6622e.clone();
    }
}
