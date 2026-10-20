package f0;

import androidx.compose.ui.draw.C0029;
import com.google.android.play.core.integrity.client.C0107;
import com.google.firebase.firestore.core.C0151;
import com.google.firebase.firestore.proto.C0162;
import com.google.firebase.messaging.C0192;
import e0.C0256;
import j6.C0328;
import j9.C0329;
import p0.C0373;
import s.C0407;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o0 f5836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o0 f5837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o0 f5838c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final o0[] f5839d;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f370short = {3194, 3163, 3162, 3153, 1741, 1787, 1778, 1787, 1789, 1770, 1783, 1777, 1776, 3017, 3071, 3064, 3065, 3045, 3064};

    static {
        o0 o0Var = new o0(C0029.m565(f370short, 0, C0256.f336 ^ (-852), 3124), 0);
        f5836a = o0Var;
        o0 o0Var2 = new o0(C0151.m2908(f370short, 4, C0107.f133 ^ (-735), 1694), 1);
        f5837b = o0Var2;
        o0 o0Var3 = new o0(C0329.m6355(f370short, 13, C0162.f186 ^ 834, 2954), C0328.f476 ^ 741);
        f5838c = o0Var3;
        o0[] o0VarArr = new o0[3];
        o0VarArr[C0192.f216 ^ (-802)] = o0Var;
        o0VarArr[C0407.f678 ^ (-493)] = o0Var2;
        o0VarArr[C0373.f644 ^ (-857)] = o0Var3;
        f5839d = o0VarArr;
    }

    public static o0 valueOf(String str) {
        return (o0) Enum.valueOf(o0.class, str);
    }

    public static o0[] values() {
        return (o0[]) f5839d.clone();
    }
}
