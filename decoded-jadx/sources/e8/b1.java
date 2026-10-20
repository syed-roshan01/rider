package e8;

import g8.i4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class b1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Logger f5200c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static b1 f5201d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final List f5202e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f5203a = new LinkedHashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f5204b = new LinkedHashMap();

    static {
        Logger logger = Logger.getLogger(b1.class.getName());
        f5200c = logger;
        ArrayList arrayList = new ArrayList();
        try {
            boolean z10 = i4.f6854d;
            arrayList.add(i4.class);
        } catch (ClassNotFoundException e4) {
            logger.log(Level.WARNING, "Unable to find pick-first LoadBalancer", (Throwable) e4);
        }
        try {
            arrayList.add(n8.w.class);
        } catch (ClassNotFoundException e10) {
            logger.log(Level.FINE, "Unable to find round-robin LoadBalancer", (Throwable) e10);
        }
        f5202e = Collections.unmodifiableList(arrayList);
    }

    public static synchronized b1 a() {
        try {
            if (f5201d == null) {
                List<a1> listS = z6.a.S(a1.class, f5202e, a1.class.getClassLoader(), new r7.e(10, 0));
                f5201d = new b1();
                for (a1 a1Var : listS) {
                    f5200c.fine("Service loader found " + a1Var);
                    b1 b1Var = f5201d;
                    synchronized (b1Var) {
                        y3.e.G("isAvailable() returned false", a1Var.h());
                        b1Var.f5203a.add(a1Var);
                    }
                }
                f5201d.c();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f5201d;
    }

    public final synchronized a1 b(String str) {
        LinkedHashMap linkedHashMap;
        linkedHashMap = this.f5204b;
        y3.e.J(str, "policy");
        return (a1) linkedHashMap.get(str);
    }

    public final synchronized void c() {
        try {
            this.f5204b.clear();
            for (a1 a1Var : this.f5203a) {
                String strF = a1Var.f();
                a1 a1Var2 = (a1) this.f5204b.get(strF);
                if (a1Var2 == null || a1Var2.g() < a1Var.g()) {
                    this.f5204b.put(strF, a1Var);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
