package v6;

import java.security.GeneralSecurityException;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final CopyOnWriteArrayList f15921a = new CopyOnWriteArrayList();

    public static k a(String str) throws GeneralSecurityException {
        boolean z10;
        for (k kVar : f15921a) {
            c7.d dVar = (c7.d) kVar;
            synchronized (dVar) {
                String str2 = dVar.f3037a;
                z10 = true;
                if (str2 == null || !str2.equals(str)) {
                    z10 = dVar.f3037a == null && str.toLowerCase(Locale.US).startsWith("android-keystore://");
                }
            }
            if (z10) {
                return kVar;
            }
        }
        throw new GeneralSecurityException(l.q.x("No KMS client does support: ", str));
    }
}
