package h8;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import l.z2;

/* JADX INFO: loaded from: classes.dex */
public final class p extends q {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final z2 f7700d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final z2 f7701e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final z2 f7702f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final z2 f7703g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final z2 f7704h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final z2 f7705i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Method f7706j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Method f7707k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Method f7708l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Method f7709m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Method f7710n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Method f7711o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Constructor f7712p;

    static {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Method method6;
        Constructor<?> constructor;
        Logger logger = q.f7713b;
        Class<?> cls = Boolean.TYPE;
        f7700d = new z2(null, "setUseSessionTickets", new Class[]{cls}, 23);
        f7701e = new z2(null, "setHostname", new Class[]{String.class}, 23);
        f7702f = new z2(byte[].class, "getAlpnSelectedProtocol", new Class[0], 23);
        f7703g = new z2(null, "setAlpnProtocols", new Class[]{byte[].class}, 23);
        f7704h = new z2(byte[].class, "getNpnSelectedProtocol", new Class[0], 23);
        f7705i = new z2(null, "setNpnProtocols", new Class[]{byte[].class}, 23);
        try {
            method = SSLParameters.class.getMethod("setApplicationProtocols", String[].class);
            try {
                method2 = SSLParameters.class.getMethod("getApplicationProtocols", new Class[0]);
                try {
                    method4 = SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]);
                    try {
                        Class<?> cls2 = Class.forName("android.net.ssl.SSLSockets");
                        method3 = cls2.getMethod("isSupportedSocket", SSLSocket.class);
                        try {
                            method5 = cls2.getMethod("setUseSessionTickets", SSLSocket.class, cls);
                        } catch (ClassNotFoundException e4) {
                            e = e4;
                            logger.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                            method5 = null;
                        } catch (NoSuchMethodException e10) {
                            e = e10;
                            logger.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                            method5 = null;
                        }
                    } catch (ClassNotFoundException e11) {
                        e = e11;
                        method3 = null;
                    } catch (NoSuchMethodException e12) {
                        e = e12;
                        method3 = null;
                    }
                } catch (ClassNotFoundException e13) {
                    e = e13;
                    method3 = null;
                    method4 = null;
                    logger.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                    method5 = null;
                    f7708l = method;
                    f7709m = method2;
                    f7710n = method4;
                    f7706j = method3;
                    f7707k = method5;
                    method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                    try {
                        constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                    } catch (ClassNotFoundException e14) {
                        e = e14;
                        logger.log(Level.FINER, "Failed to find Android 7.0+ APIs", (Throwable) e);
                        constructor = null;
                    } catch (NoSuchMethodException e15) {
                        e = e15;
                        logger.log(Level.FINER, "Failed to find Android 7.0+ APIs", (Throwable) e);
                        constructor = null;
                    }
                    f7711o = method6;
                    f7712p = constructor;
                } catch (NoSuchMethodException e16) {
                    e = e16;
                    method3 = null;
                    method4 = null;
                    logger.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                    method5 = null;
                    f7708l = method;
                    f7709m = method2;
                    f7710n = method4;
                    f7706j = method3;
                    f7707k = method5;
                    method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                    constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                    f7711o = method6;
                    f7712p = constructor;
                }
            } catch (ClassNotFoundException e17) {
                e = e17;
                method2 = null;
                method3 = null;
                method4 = null;
                logger.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                method5 = null;
                f7708l = method;
                f7709m = method2;
                f7710n = method4;
                f7706j = method3;
                f7707k = method5;
                method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                f7711o = method6;
                f7712p = constructor;
            } catch (NoSuchMethodException e18) {
                e = e18;
                method2 = null;
                method3 = null;
                method4 = null;
                logger.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                method5 = null;
                f7708l = method;
                f7709m = method2;
                f7710n = method4;
                f7706j = method3;
                f7707k = method5;
                method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                f7711o = method6;
                f7712p = constructor;
            }
        } catch (ClassNotFoundException e19) {
            e = e19;
            method = null;
        } catch (NoSuchMethodException e20) {
            e = e20;
            method = null;
        }
        f7708l = method;
        f7709m = method2;
        f7710n = method4;
        f7706j = method3;
        f7707k = method5;
        try {
            method6 = SSLParameters.class.getMethod("setServerNames", List.class);
            constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
        } catch (ClassNotFoundException e21) {
            e = e21;
            method6 = null;
        } catch (NoSuchMethodException e22) {
            e = e22;
            method6 = null;
        }
        f7711o = method6;
        f7712p = constructor;
    }

    @Override // h8.q
    public final void a(SSLSocket sSLSocket, String str, List list) {
        Constructor constructor;
        boolean z10;
        Method method;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((i8.l) it.next()).f8164a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        if (str != null) {
            try {
                try {
                    if (q.c(str)) {
                        Method method2 = f7706j;
                        if (method2 == null || !((Boolean) method2.invoke(null, sSLSocket)).booleanValue()) {
                            f7700d.F(sSLSocket, Boolean.TRUE);
                        } else {
                            f7707k.invoke(null, sSLSocket, Boolean.TRUE);
                        }
                        Method method3 = f7711o;
                        if (method3 == null || (constructor = f7712p) == null) {
                            f7701e.F(sSLSocket, str);
                        } else {
                            method3.invoke(sSLParameters, Collections.singletonList(constructor.newInstance(str)));
                        }
                    }
                } catch (InvocationTargetException e4) {
                    throw new RuntimeException(e4);
                }
            } catch (IllegalAccessException e10) {
                throw new RuntimeException(e10);
            } catch (InstantiationException e11) {
                throw new RuntimeException(e11);
            }
        }
        Method method4 = f7710n;
        if (method4 != null) {
            try {
                method4.invoke(sSLSocket, new Object[0]);
                f7708l.invoke(sSLParameters, strArr);
                z10 = true;
            } catch (InvocationTargetException e12) {
                if (!(e12.getTargetException() instanceof UnsupportedOperationException)) {
                    throw e12;
                }
                q.f7713b.log(Level.FINER, "setApplicationProtocol unsupported, will try old methods");
                z10 = false;
            }
        } else {
            z10 = false;
        }
        sSLSocket.setSSLParameters(sSLParameters);
        if (z10 && (method = f7709m) != null && Arrays.equals(strArr, (String[]) method.invoke(sSLSocket.getSSLParameters(), new Object[0]))) {
            return;
        }
        Object[] objArr = {i8.k.b(list)};
        i8.k kVar = this.f7715a;
        if (kVar.e() == 1) {
            f7703g.G(sSLSocket, objArr);
        }
        if (kVar.e() == 3) {
            throw new RuntimeException("We can not do TLS handshake on this Android version, please install the Google Play Services Dynamic Security Provider to use TLS");
        }
        f7705i.G(sSLSocket, objArr);
    }

    @Override // h8.q
    public final String b(SSLSocket sSLSocket) {
        Logger logger = q.f7713b;
        Method method = f7710n;
        if (method != null) {
            try {
                return (String) method.invoke(sSLSocket, new Object[0]);
            } catch (IllegalAccessException e4) {
                throw new RuntimeException(e4);
            } catch (InvocationTargetException e10) {
                if (!(e10.getTargetException() instanceof UnsupportedOperationException)) {
                    throw new RuntimeException(e10);
                }
                logger.log(Level.FINER, "Socket unsupported for getApplicationProtocol, will try old methods");
            }
        }
        i8.k kVar = this.f7715a;
        if (kVar.e() == 1) {
            try {
                byte[] bArr = (byte[]) f7702f.G(sSLSocket, new Object[0]);
                if (bArr != null) {
                    return new String(bArr, i8.n.f8173b);
                }
            } catch (Exception e11) {
                logger.log(Level.FINE, "Failed calling getAlpnSelectedProtocol()", (Throwable) e11);
            }
        }
        if (kVar.e() == 3) {
            return null;
        }
        try {
            byte[] bArr2 = (byte[]) f7704h.G(sSLSocket, new Object[0]);
            if (bArr2 != null) {
                return new String(bArr2, i8.n.f8173b);
            }
            return null;
        } catch (Exception e12) {
            logger.log(Level.FINE, "Failed calling getNpnSelectedProtocol()", (Throwable) e12);
            return null;
        }
    }

    @Override // h8.q
    public final String d(SSLSocket sSLSocket, String str, List list) {
        String strB = b(sSLSocket);
        return strB == null ? super.d(sSLSocket, str, list) : strB;
    }
}
