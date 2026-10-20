package j7;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Iterator;
import x9.v;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j f8418b = new j(new v(9));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j f8419c = new j(new v(13));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f8420a;

    static {
        new j(new v(15));
        new j(new v(14));
        new j(new v(10));
        new j(new v(12));
        new j(new v(11));
    }

    public j(v vVar) {
        if (a7.b.f1325b.get()) {
            this.f8420a = new i(vVar, 2);
        } else if ("The Android Project".equals(System.getProperty("java.vendor"))) {
            this.f8420a = new i(vVar, 0);
        } else {
            this.f8420a = new i(vVar, 1);
        }
    }

    public final Object a(String str) throws GeneralSecurityException {
        i iVar = this.f8420a;
        int i10 = iVar.f8416a;
        int i11 = 0;
        k kVar = iVar.f8417b;
        Exception exc = null;
        switch (i10) {
            case 0:
                String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL"};
                ArrayList arrayList = new ArrayList();
                while (i11 < 2) {
                    Provider provider = Security.getProvider(strArr[i11]);
                    if (provider != null) {
                        arrayList.add(provider);
                    }
                    i11++;
                }
                Iterator it = arrayList.iterator();
                Exception exc2 = null;
                while (it.hasNext()) {
                    try {
                        return ((v) kVar).t(str, (Provider) it.next());
                    } catch (Exception e4) {
                        if (exc2 == null) {
                            exc2 = e4;
                        }
                    }
                }
                return ((v) kVar).t(str, null);
            case 1:
                return ((v) kVar).t(str, null);
            default:
                String[] strArr2 = {"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"};
                ArrayList arrayList2 = new ArrayList();
                while (i11 < 3) {
                    Provider provider2 = Security.getProvider(strArr2[i11]);
                    if (provider2 != null) {
                        arrayList2.add(provider2);
                    }
                    i11++;
                }
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    try {
                        return ((v) kVar).t(str, (Provider) it2.next());
                    } catch (Exception e10) {
                        if (exc == null) {
                            exc = e10;
                        }
                    }
                }
                throw new GeneralSecurityException("No good Provider found.", exc);
        }
    }
}
