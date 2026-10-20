package v6;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f15905a = new byte[0];

    public static h a(String str) throws GeneralSecurityException {
        Map mapUnmodifiableMap;
        AtomicReference atomicReference = q.f15931a;
        synchronized (q.class) {
            mapUnmodifiableMap = Collections.unmodifiableMap(q.f15934d);
        }
        h hVar = (h) mapUnmodifiableMap.get(str);
        if (hVar != null) {
            return hVar;
        }
        throw new GeneralSecurityException("cannot find key template: ".concat(str));
    }
}
