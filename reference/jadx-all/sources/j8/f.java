package j8;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ja.j f8473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c[] f8474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Map f8475c;

    static {
        ja.j jVar = ja.j.f8539d;
        f8473a = fa.l.h(":");
        c cVar = new c(c.f8450h, "");
        ja.j jVar2 = c.f8447e;
        c cVar2 = new c(jVar2, "GET");
        c cVar3 = new c(jVar2, "POST");
        ja.j jVar3 = c.f8448f;
        c cVar4 = new c(jVar3, "/");
        c cVar5 = new c(jVar3, "/index.html");
        ja.j jVar4 = c.f8449g;
        c cVar6 = new c(jVar4, "http");
        c cVar7 = new c(jVar4, "https");
        ja.j jVar5 = c.f8446d;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, new c(jVar5, "200"), new c(jVar5, "204"), new c(jVar5, "206"), new c(jVar5, "304"), new c(jVar5, "400"), new c(jVar5, "404"), new c(jVar5, "500"), new c("accept-charset", ""), new c("accept-encoding", "gzip, deflate"), new c("accept-language", ""), new c("accept-ranges", ""), new c("accept", ""), new c("access-control-allow-origin", ""), new c("age", ""), new c("allow", ""), new c("authorization", ""), new c("cache-control", ""), new c("content-disposition", ""), new c("content-encoding", ""), new c("content-language", ""), new c("content-length", ""), new c("content-location", ""), new c("content-range", ""), new c("content-type", ""), new c("cookie", ""), new c("date", ""), new c("etag", ""), new c("expect", ""), new c("expires", ""), new c(Constants.MessagePayloadKeys.FROM, ""), new c("host", ""), new c("if-match", ""), new c("if-modified-since", ""), new c("if-none-match", ""), new c("if-range", ""), new c("if-unmodified-since", ""), new c("last-modified", ""), new c("link", ""), new c(FirebaseAnalytics.Param.LOCATION, ""), new c("max-forwards", ""), new c("proxy-authenticate", ""), new c("proxy-authorization", ""), new c("range", ""), new c("referer", ""), new c("refresh", ""), new c("retry-after", ""), new c("server", ""), new c("set-cookie", ""), new c("strict-transport-security", ""), new c("transfer-encoding", ""), new c("user-agent", ""), new c("vary", ""), new c("via", ""), new c("www-authenticate", "")};
        f8474b = cVarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        for (int i10 = 0; i10 < 61; i10++) {
            if (!linkedHashMap.containsKey(cVarArr[i10].f8451a)) {
                linkedHashMap.put(cVarArr[i10].f8451a, Integer.valueOf(i10));
            }
        }
        f8475c = Collections.unmodifiableMap(linkedHashMap);
    }

    public static void a(ja.j jVar) throws IOException {
        int iD = jVar.d();
        for (int i10 = 0; i10 < iD; i10++) {
            byte bI = jVar.i(i10);
            if (bI >= 65 && bI <= 90) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(jVar.t()));
            }
        }
    }
}
