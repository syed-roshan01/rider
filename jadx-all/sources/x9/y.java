package x9;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public s f16501a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public LinkedHashMap f16504d = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f16502b = "GET";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p f16503c = new p();

    public final l.r a() {
        Map mapUnmodifiableMap;
        s sVar = this.f16501a;
        if (sVar == null) {
            throw new IllegalStateException("url == null".toString());
        }
        String str = this.f16502b;
        q qVarC = this.f16503c.c();
        LinkedHashMap linkedHashMap = this.f16504d;
        byte[] bArr = y9.b.f17000a;
        d7.a.m(linkedHashMap, "<this>");
        if (linkedHashMap.isEmpty()) {
            mapUnmodifiableMap = r8.s.f13662a;
        } else {
            mapUnmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap));
            d7.a.l(mapUnmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
        }
        return new l.r(sVar, str, qVarC, null, mapUnmodifiableMap);
    }

    public final void b(c cVar) {
        d7.a.m(cVar, "cacheControl");
        String string = cVar.toString();
        if (string.length() == 0) {
            this.f16503c.d("Cache-Control");
        } else {
            c("Cache-Control", string);
        }
    }

    public final void c(String str, String str2) {
        d7.a.m(str2, FirebaseAnalytics.Param.VALUE);
        p pVar = this.f16503c;
        pVar.getClass();
        q8.k.c(str);
        q8.k.e(str2, str);
        pVar.d(str);
        pVar.a(str, str2);
    }

    public final void d(String str, z zVar) {
        if (str.length() <= 0) {
            throw new IllegalArgumentException("method.isEmpty() == true".toString());
        }
        if (!(!(d7.a.d(str, "POST") || d7.a.d(str, "PUT") || d7.a.d(str, "PATCH") || d7.a.d(str, "PROPPATCH") || d7.a.d(str, "REPORT")))) {
            throw new IllegalArgumentException(l.q.k("method ", str, " must have a request body.").toString());
        }
        this.f16502b = str;
    }
}
