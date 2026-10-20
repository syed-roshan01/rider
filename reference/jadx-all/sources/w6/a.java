package w6;

import i7.u1;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    static {
        new h(0);
        new h(3);
        new h(4);
        new h(2);
        new h(6);
        new h(7);
        new h(5);
        new h(8);
        int i10 = u1.CONFIG_NAME_FIELD_NUMBER;
        try {
            a();
        } catch (GeneralSecurityException e4) {
            throw new ExceptionInInitializerError(e4);
        }
    }

    public static void a() {
        v6.q.h(e.f16205b);
        e7.o.a();
        v6.q.f(new h(0), true);
        v6.q.f(new h(3), true);
        d7.m mVar = p.f16230a;
        d7.k kVar = d7.k.f4898b;
        kVar.e(p.f16230a);
        kVar.d(p.f16231b);
        kVar.c(p.f16232c);
        kVar.b(p.f16233d);
        if (a7.b.f1325b.get()) {
            return;
        }
        v6.q.f(new h(2), true);
        kVar.e(l.f16218a);
        kVar.d(l.f16219b);
        kVar.c(l.f16220c);
        kVar.b(l.f16221d);
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            v6.q.f(new h(4), true);
            kVar.e(u.f16241a);
            kVar.d(u.f16242b);
            kVar.c(u.f16243c);
            kVar.b(u.f16244d);
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
        }
        v6.q.f(new h(5), true);
        d7.m mVar2 = y.f16249a;
        d7.k kVar2 = d7.k.f4898b;
        kVar2.e(y.f16249a);
        kVar2.d(y.f16250b);
        kVar2.c(y.f16251c);
        kVar2.b(y.f16252d);
        v6.q.f(new h(6), true);
        v6.q.f(new h(7), true);
        v6.q.f(new h(8), true);
        kVar2.e(d0.f16200a);
        kVar2.d(d0.f16201b);
        kVar2.c(d0.f16202c);
        kVar2.b(d0.f16203d);
    }
}
