package i8;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes.dex */
public final class h extends k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Method f8145e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Method f8146f;

    public h(Provider provider, Method method, Method method2) {
        super(provider);
        this.f8145e = method;
        this.f8146f = method2;
    }

    @Override // i8.k
    public final void c(SSLSocket sSLSocket, String str, List list) {
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            l lVar = (l) it.next();
            if (lVar != l.HTTP_1_0) {
                arrayList.add(lVar.f8164a);
            }
        }
        try {
            this.f8145e.invoke(sSLParameters, arrayList.toArray(new String[arrayList.size()]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalAccessException e4) {
            throw new RuntimeException(e4);
        } catch (InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // i8.k
    public final String d(SSLSocket sSLSocket) {
        try {
            return (String) this.f8146f.invoke(sSLSocket, new Object[0]);
        } catch (IllegalAccessException e4) {
            throw new RuntimeException(e4);
        } catch (InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // i8.k
    public final int e() {
        return 1;
    }
}
