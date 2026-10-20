package j7;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes.dex */
public final class n extends ThreadLocal {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f8424a;

    public n(o oVar) {
        this.f8424a = oVar;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        o oVar = this.f8424a;
        try {
            Mac mac = (Mac) j.f8419c.a(oVar.f8426b);
            mac.init(oVar.f8427c);
            return mac;
        } catch (GeneralSecurityException e4) {
            throw new IllegalStateException(e4);
        }
    }
}
