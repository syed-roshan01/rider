package e8;

import java.nio.charset.Charset;
import java.util.BitSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f5355a = Charset.forName("US-ASCII");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final s6.c f5356b = l1.f5304e;

    public static j1 a(String str, x9.v vVar) {
        boolean z10 = false;
        if (!str.isEmpty() && str.charAt(0) == ':') {
            z10 = true;
        }
        BitSet bitSet = i1.f5283d;
        return new j1(str, z10, vVar);
    }
}
