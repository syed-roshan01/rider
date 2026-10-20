package g8;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f6918a = Logger.getLogger(l2.class.getName());

    public static Object a(v7.a aVar) throws IOException {
        y3.e.N("unexpected end of JSON", aVar.M());
        int iE = t.k.e(aVar.k0());
        if (iE == 0) {
            aVar.a();
            ArrayList arrayList = new ArrayList();
            while (aVar.M()) {
                arrayList.add(a(aVar));
            }
            y3.e.N("Bad token: " + aVar.u(false), aVar.k0() == 2);
            aVar.g();
            return Collections.unmodifiableList(arrayList);
        }
        if (iE == 2) {
            aVar.b();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (aVar.M()) {
                linkedHashMap.put(aVar.e0(), a(aVar));
            }
            y3.e.N("Bad token: " + aVar.u(false), aVar.k0() == 4);
            aVar.p();
            return Collections.unmodifiableMap(linkedHashMap);
        }
        if (iE == 5) {
            return aVar.i0();
        }
        if (iE == 6) {
            return Double.valueOf(aVar.T());
        }
        if (iE == 7) {
            return Boolean.valueOf(aVar.Q());
        }
        if (iE == 8) {
            aVar.g0();
            return null;
        }
        throw new IllegalStateException("Bad token: " + aVar.u(false));
    }
}
