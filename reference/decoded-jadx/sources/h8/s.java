package h8;

import java.io.IOException;
import java.net.Socket;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import l.t2;

/* JADX INFO: loaded from: classes.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f7717a = Collections.unmodifiableList(Arrays.asList(i8.l.HTTP_2));

    /* JADX WARN: Type inference failed for: r8v8, types: [java.io.Serializable, java.lang.String[]] */
    public static SSLSocket a(SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, Socket socket, String str, int i10, i8.b bVar) throws IOException {
        i8.l lVar;
        y3.e.J(sSLSocketFactory, "sslSocketFactory");
        y3.e.J(socket, "socket");
        y3.e.J(bVar, "spec");
        SSLSocket sSLSocket = (SSLSocket) sSLSocketFactory.createSocket(socket, str, i10, true);
        String[] strArr = bVar.f8126b;
        String[] strArr2 = strArr != null ? (String[]) i8.n.a(strArr, sSLSocket.getEnabledCipherSuites()) : null;
        String[] strArr3 = (String[]) i8.n.a(bVar.f8127c, sSLSocket.getEnabledProtocols());
        t2 t2Var = new t2(bVar);
        if (!t2Var.f10940a) {
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }
        if (strArr2 == null) {
            t2Var.f10942c = null;
        } else {
            t2Var.f10942c = (String[]) strArr2.clone();
        }
        if (!t2Var.f10940a) {
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }
        if (strArr3 == null) {
            t2Var.f10943d = null;
        } else {
            t2Var.f10943d = (String[]) strArr3.clone();
        }
        i8.b bVar2 = new i8.b(t2Var);
        sSLSocket.setEnabledProtocols(bVar2.f8127c);
        String[] strArr4 = bVar2.f8126b;
        if (strArr4 != null) {
            sSLSocket.setEnabledCipherSuites(strArr4);
        }
        q qVar = q.f7714c;
        boolean z10 = bVar.f8128d;
        List list = f7717a;
        String strD = qVar.d(sSLSocket, str, z10 ? list : null);
        if (strD.equals("http/1.0")) {
            lVar = i8.l.HTTP_1_0;
        } else if (strD.equals("http/1.1")) {
            lVar = i8.l.HTTP_1_1;
        } else if (strD.equals("h2")) {
            lVar = i8.l.HTTP_2;
        } else {
            if (!strD.equals("spdy/3.1")) {
                throw new IOException("Unexpected protocol: ".concat(strD));
            }
            lVar = i8.l.SPDY_3;
        }
        y3.e.M(strD, "Only " + list + " are supported, but negotiated protocol is %s", list.contains(lVar));
        if (hostnameVerifier == null) {
            hostnameVerifier = i8.e.f8137a;
        }
        if (hostnameVerifier.verify((str.startsWith("[") && str.endsWith("]")) ? str.substring(1, str.length() - 1) : str, sSLSocket.getSession())) {
            return sSLSocket;
        }
        throw new SSLPeerUnverifiedException("Cannot verify hostname: ".concat(str));
    }
}
