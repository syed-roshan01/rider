package v6;

import com.google.crypto.tink.shaded.protobuf.b0;
import com.google.crypto.tink.shaded.protobuf.h0;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.internal.Code;
import e8.g0;
import e8.g2;
import e8.x;
import e8.x0;
import e8.y;
import e8.y0;
import i7.a1;
import i7.z0;
import java.io.IOException;
import java.io.Serializable;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Locale;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;
import java.util.logging.Logger;
import k6.w4;
import n8.t;
import n8.v;
import r7.z;
import u.k1;

/* JADX INFO: loaded from: classes.dex */
public final class d implements r7.q, y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f15907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f15908c;

    public /* synthetic */ d(int i10, Object obj, Serializable serializable) {
        this.f15906a = i10;
        this.f15907b = obj;
        this.f15908c = serializable;
    }

    public static String o(ja.g gVar) {
        long j10 = gVar.f8534b;
        if (j10 <= 64) {
            return gVar.T().e();
        }
        return gVar.c0((int) Math.min(j10, 64L)).e() + "...";
    }

    @Override // e8.y0
    public final void a(y yVar) {
        switch (this.f15906a) {
            case Code.UNAUTHENTICATED /* 16 */:
                n8.n nVar = (n8.n) this.f15908c;
                nVar.f12292d = yVar;
                if (!nVar.f12291c) {
                    ((y0) this.f15907b).a(yVar);
                }
                break;
            default:
                v vVar = (v) this.f15908c;
                x0 x0Var = (x0) this.f15907b;
                if (vVar.f12313d.get(new g0(x0Var.a().f5259a, e8.c.f5206b)) == x0Var) {
                    x xVar = yVar.f5403a;
                    x xVar2 = x.f5396c;
                    x xVar3 = x.f5397d;
                    if (xVar == xVar2 || xVar == xVar3) {
                        vVar.f12312c.o();
                    }
                    x xVar4 = yVar.f5403a;
                    if (xVar4 == xVar3) {
                        x0Var.f();
                    }
                    t tVarG = v.g(x0Var);
                    if (!((y) tVarG.f12309a).f5403a.equals(xVar2) || (!xVar4.equals(x.f5394a) && !xVar4.equals(xVar3))) {
                        tVarG.f12309a = yVar;
                        vVar.h();
                    }
                    break;
                }
                break;
        }
    }

    public final w6.s b() {
        Integer num = (Integer) this.f15907b;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (((w6.r) this.f15908c) != null) {
            return new w6.s(num.intValue(), (w6.r) this.f15908c);
        }
        throw new GeneralSecurityException("Variant is not set");
    }

    public final void c() {
        ((g2) this.f15907b).f5264b = true;
        ((ScheduledFuture) this.f15908c).cancel(false);
    }

    public final void d(String str, String str2) {
        i8.d dVar = (i8.d) this.f15908c;
        dVar.getClass();
        if (str.isEmpty()) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = str.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = str.charAt(i11);
            if (cCharAt <= 31 || cCharAt >= '\u007f') {
                throw new IllegalArgumentException(String.format(Locale.US, "Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i11), str));
            }
        }
        if (str2 == null) {
            throw new IllegalArgumentException("value == null");
        }
        int length2 = str2.length();
        for (int i12 = 0; i12 < length2; i12++) {
            char cCharAt2 = str2.charAt(i12);
            if (cCharAt2 <= 31 || cCharAt2 >= '\u007f') {
                throw new IllegalArgumentException(String.format(Locale.US, "Unexpected char %#04x at %d in header value: %s", Integer.valueOf(cCharAt2), Integer.valueOf(i12), str2));
            }
        }
        while (true) {
            ArrayList arrayList = dVar.f8136a;
            if (i10 >= arrayList.size()) {
                arrayList.add(str);
                arrayList.add(str2.trim());
                return;
            } else {
                if (str.equalsIgnoreCase((String) arrayList.get(i10))) {
                    arrayList.remove(i10);
                    arrayList.remove(i10);
                    i10 -= 2;
                }
                i10 += 2;
            }
        }
    }

    @Override // r7.q
    public final Object e() {
        try {
            return z.f13647a.a((Class) this.f15908c);
        } catch (Exception e4) {
            throw new RuntimeException("Unable to create instance of " + ((Class) this.f15908c) + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e4);
        }
    }

    public final boolean f() {
        return ((Logger) this.f15907b).isLoggable((Level) this.f15908c);
    }

    public final void g(int i10, int i11, ja.g gVar, int i12, boolean z10) {
        if (f()) {
            ((Logger) this.f15907b).log((Level) this.f15908c, a7.a.H(i10) + " DATA: streamId=" + i11 + " endStream=" + z10 + " length=" + i12 + " bytes=" + o(gVar));
        }
    }

    public final void h(int i10, int i11, j8.a aVar, ja.j jVar) {
        if (f()) {
            Logger logger = (Logger) this.f15907b;
            Level level = (Level) this.f15908c;
            StringBuilder sb = new StringBuilder();
            sb.append(a7.a.H(i10));
            sb.append(" GO_AWAY: lastStreamId=");
            sb.append(i11);
            sb.append(" errorCode=");
            sb.append(aVar);
            sb.append(" length=");
            sb.append(jVar.d());
            sb.append(" bytes=");
            ja.g gVar = new ja.g();
            gVar.e0(jVar);
            sb.append(o(gVar));
            logger.log(level, sb.toString());
        }
    }

    public final void i(int i10, long j10) {
        if (f()) {
            ((Logger) this.f15907b).log((Level) this.f15908c, a7.a.H(i10) + " PING: ack=false bytes=" + j10);
        }
    }

    public final void j(int i10, int i11, j8.a aVar) {
        if (f()) {
            ((Logger) this.f15907b).log((Level) this.f15908c, a7.a.H(i10) + " RST_STREAM: streamId=" + i11 + " errorCode=" + aVar);
        }
    }

    public final void k(int i10, a4.k kVar) {
        if (f()) {
            Logger logger = (Logger) this.f15907b;
            Level level = (Level) this.f15908c;
            StringBuilder sb = new StringBuilder();
            sb.append(a7.a.H(i10));
            sb.append(" SETTINGS: ack=false settings=");
            EnumMap enumMap = new EnumMap(h8.o.class);
            for (h8.o oVar : h8.o.values()) {
                if (kVar.a(oVar.f7699a)) {
                    enumMap.put(oVar, Integer.valueOf(kVar.f1142d[oVar.f7699a]));
                }
            }
            sb.append(enumMap.toString());
            logger.log(level, sb.toString());
        }
    }

    public final void l(int i10, int i11, long j10) {
        if (f()) {
            ((Logger) this.f15907b).log((Level) this.f15908c, a7.a.H(i10) + " WINDOW_UPDATE: streamId=" + i11 + " windowSizeIncrement=" + j10);
        }
    }

    public final a1 m(com.google.crypto.tink.shaded.protobuf.l lVar) throws GeneralSecurityException {
        try {
            w6.g gVarD = ((d7.f) this.f15907b).d();
            b0 b0VarE = gVarD.e(lVar);
            gVarD.g(b0VarE);
            b0 b0VarB = gVarD.b(b0VarE);
            i7.y0 y0VarE = a1.E();
            String strB = ((d7.f) this.f15907b).b();
            y0VarE.d();
            a1.x((a1) y0VarE.f3641b, strB);
            b0VarB.getClass();
            try {
                d dVar = new d(b0VarB.a(null), (Object) null);
                b0VarB.e((com.google.crypto.tink.shaded.protobuf.p) dVar.f15907b);
                com.google.crypto.tink.shaded.protobuf.p pVar = (com.google.crypto.tink.shaded.protobuf.p) dVar.f15907b;
                if (pVar.B - pVar.C != 0) {
                    throw new IllegalStateException("Did not write as much data as expected.");
                }
                com.google.crypto.tink.shaded.protobuf.k kVar = new com.google.crypto.tink.shaded.protobuf.k((byte[]) dVar.f15908c);
                y0VarE.d();
                a1.y((a1) y0VarE.f3641b, kVar);
                z0 z0VarE = ((d7.f) this.f15907b).e();
                y0VarE.d();
                a1.z((a1) y0VarE.f3641b, z0VarE);
                return (a1) y0VarE.a();
            } catch (IOException e4) {
                throw new RuntimeException(b0VarB.b("ByteString"), e4);
            }
        } catch (h0 e10) {
            throw new GeneralSecurityException("Unexpected proto", e10);
        }
    }

    public final void n() {
        ((AtomicLong) this.f15907b).set(0L);
        ((AtomicLong) this.f15908c).set(0L);
    }

    public final String toString() {
        switch (this.f15906a) {
            case 8:
                return (String) this.f15907b;
            case Code.UNAVAILABLE /* 14 */:
                return "Request{url=" + ((k8.a) this.f15907b) + '}';
            default:
                return super.toString();
        }
    }

    public /* synthetic */ d(Object obj, Object obj2, int i10) {
        this.f15906a = i10;
        this.f15908c = obj;
        this.f15907b = obj2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(d dVar, int i10) {
        this(dVar);
        this.f15906a = 14;
    }

    public d(d dVar) {
        this.f15906a = 14;
        this.f15907b = (k8.a) dVar.f15907b;
        i8.d dVar2 = (i8.d) dVar.f15908c;
        dVar2.getClass();
        this.f15908c = new w4(dVar2, 0);
    }

    public d(d7.f fVar, Class cls) {
        this.f15906a = 0;
        if (!fVar.f4891b.keySet().contains(cls) && !Void.class.equals(cls)) {
            throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", fVar.toString(), cls.getName()));
        }
        this.f15907b = fVar;
        this.f15908c = cls;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(Level level) {
        this(level, Logger.getLogger(h8.n.class.getName()));
        this.f15906a = 12;
    }

    public d(Level level, Logger logger) {
        this.f15906a = 12;
        y3.e.J(level, FirebaseAnalytics.Param.LEVEL);
        this.f15908c = level;
        y3.e.J(logger, "logger");
        this.f15907b = logger;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d() {
        this(1);
        this.f15906a = 1;
    }

    public d(int i10) {
        this.f15906a = i10;
        if (i10 == 2) {
            this.f15907b = null;
            this.f15908c = null;
            Object obj = c7.d.f3036c;
            try {
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                this.f15908c = keyStore;
                keyStore.load(null);
                return;
            } catch (IOException | GeneralSecurityException e4) {
                throw new IllegalStateException(e4);
            }
        }
        if (i10 != 10) {
            if (i10 == 13) {
                this.f15908c = new i8.d();
            } else if (i10 != 15) {
                this.f15907b = null;
                this.f15908c = w6.r.f16236d;
            } else {
                this.f15907b = new AtomicLong();
                this.f15908c = new AtomicLong();
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj) {
        this(10);
        this.f15906a = 10;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(g2 g2Var, ScheduledFuture scheduledFuture, int i10) {
        this(g2Var, scheduledFuture);
        this.f15906a = 11;
    }

    public d(g2 g2Var, ScheduledFuture scheduledFuture) {
        this.f15906a = 11;
        this.f15907b = g2Var;
        y3.e.J(scheduledFuture, "future");
        this.f15908c = scheduledFuture;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(k1 k1Var) {
        this(15);
        this.f15906a = 15;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i10, Object obj) {
        this(i10, 4);
        this.f15906a = 4;
    }

    public d(int i10, int i11) {
        this.f15906a = i11;
        if (i11 != 6) {
            byte[] bArr = new byte[i10];
            this.f15908c = bArr;
            this.f15907b = new com.google.crypto.tink.shaded.protobuf.p(bArr, i10);
        } else {
            byte[] bArr2 = new byte[i10];
            this.f15908c = bArr2;
            Logger logger = com.google.protobuf.v.f4248d;
            this.f15907b = new com.google.protobuf.t(bArr2, 0, i10);
        }
    }
}
