package ea;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c[] f5450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f5451b;

    static {
        c cVar = new c(c.f5444i, "");
        ja.j jVar = c.f5441f;
        c cVar2 = new c(jVar, "GET");
        c cVar3 = new c(jVar, "POST");
        ja.j jVar2 = c.f5442g;
        c cVar4 = new c(jVar2, "/");
        c cVar5 = new c(jVar2, "/index.html");
        ja.j jVar3 = c.f5443h;
        c cVar6 = new c(jVar3, "http");
        c cVar7 = new c(jVar3, "https");
        ja.j jVar4 = c.f5440e;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, new c(jVar4, "200"), new c(jVar4, "204"), new c(jVar4, "206"), new c(jVar4, "304"), new c(jVar4, "400"), new c(jVar4, "404"), new c(jVar4, "500"), new c("accept-charset", ""), new c("accept-encoding", "gzip, deflate"), new c("accept-language", ""), new c("accept-ranges", ""), new c("accept", ""), new c("access-control-allow-origin", ""), new c("age", ""), new c("allow", ""), new c("authorization", ""), new c("cache-control", ""), new c("content-disposition", ""), new c("content-encoding", ""), new c("content-language", ""), new c("content-length", ""), new c("content-location", ""), new c("content-range", ""), new c("content-type", ""), new c("cookie", ""), new c("date", ""), new c("etag", ""), new c("expect", ""), new c("expires", ""), new c(Constants.MessagePayloadKeys.FROM, ""), new c("host", ""), new c("if-match", ""), new c("if-modified-since", ""), new c("if-none-match", ""), new c("if-range", ""), new c("if-unmodified-since", ""), new c("last-modified", ""), new c("link", ""), new c(FirebaseAnalytics.Param.LOCATION, ""), new c("max-forwards", ""), new c("proxy-authenticate", ""), new c("proxy-authorization", ""), new c("range", ""), new c("referer", ""), new c("refresh", ""), new c("retry-after", ""), new c("server", ""), new c("set-cookie", ""), new c("strict-transport-security", ""), new c("transfer-encoding", ""), new c("user-agent", ""), new c("vary", ""), new c("via", ""), new c("www-authenticate", "")};
        f5450a = cVarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        for (int i10 = 0; i10 < 61; i10++) {
            if (!linkedHashMap.containsKey(cVarArr[i10].f5445a)) {
                linkedHashMap.put(cVarArr[i10].f5445a, Integer.valueOf(i10));
            }
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        d7.a.l(mapUnmodifiableMap, "unmodifiableMap(result)");
        f5451b = mapUnmodifiableMap;
    }

    public static void a(ja.j jVar) throws IOException {
        d7.a.m(jVar, "name");
        int iD = jVar.d();
        for (int i10 = 0; i10 < iD; i10++) {
            byte bI = jVar.i(i10);
            if (65 <= bI && bI < 91) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(jVar.t()));
            }
        }
    }
}
