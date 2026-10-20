package a0;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class n0 extends d9.j implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n0 f833a = new n0(2);

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        Map mapB = ((o0) obj2).b();
        if (mapB.isEmpty()) {
            return null;
        }
        return mapB;
    }
}
