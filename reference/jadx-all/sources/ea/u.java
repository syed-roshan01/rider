package ea;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class u implements Closeable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final x9.v f5527e = new x9.v(20, 0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Logger f5528f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ja.i f5529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f5530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f5531c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j8.d f5532d;

    static {
        Logger logger = Logger.getLogger(e.class.getName());
        d7.a.l(logger, "getLogger(Http2::class.java.name)");
        f5528f = logger;
    }

    public u(ja.i iVar, boolean z10) {
        this.f5529a = iVar;
        this.f5530b = z10;
        t tVar = new t(iVar);
        this.f5531c = tVar;
        this.f5532d = new j8.d(tVar);
    }

    public final boolean a(boolean z10, l lVar) throws IOException {
        b bVar;
        b bVar2;
        Object[] array;
        d7.a.m(lVar, "handler");
        int i10 = 0;
        try {
            this.f5529a.S(9L);
            int iQ = y9.b.q(this.f5529a);
            if (iQ > 16384) {
                throw new IOException(l.q.g("FRAME_SIZE_ERROR: ", iQ));
            }
            int i11 = this.f5529a.readByte() & 255;
            byte b10 = this.f5529a.readByte();
            int i12 = b10 & 255;
            int i13 = this.f5529a.readInt();
            int i14 = i13 & Integer.MAX_VALUE;
            Logger logger = f5528f;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(e.a(i14, iQ, i11, i12, true));
            }
            if (z10 && i11 != 4) {
                StringBuilder sb = new StringBuilder("Expected a SETTINGS frame but was ");
                String[] strArr = e.f5454b;
                sb.append(i11 < strArr.length ? strArr[i11] : y9.b.g("0x%02x", Integer.valueOf(i11)));
                throw new IOException(sb.toString());
            }
            switch (i11) {
                case 0:
                    e(lVar, iQ, i12, i14);
                    return true;
                case 1:
                    f(lVar, iQ, i12, i14);
                    return true;
                case 2:
                    if (iQ != 5) {
                        throw new IOException(l.q.h("TYPE_PRIORITY length: ", iQ, " != 5"));
                    }
                    if (i14 == 0) {
                        throw new IOException("TYPE_PRIORITY streamId == 0");
                    }
                    ja.i iVar = this.f5529a;
                    iVar.readInt();
                    iVar.readByte();
                    return true;
                case 3:
                    if (iQ != 4) {
                        throw new IOException(l.q.h("TYPE_RST_STREAM length: ", iQ, " != 4"));
                    }
                    if (i14 == 0) {
                        throw new IOException("TYPE_RST_STREAM streamId == 0");
                    }
                    int i15 = this.f5529a.readInt();
                    b[] bVarArrValues = b.values();
                    int length = bVarArrValues.length;
                    while (true) {
                        if (i10 < length) {
                            b bVar3 = bVarArrValues[i10];
                            if (bVar3.f5437a == i15) {
                                bVar = bVar3;
                            } else {
                                i10++;
                            }
                        } else {
                            bVar = null;
                        }
                    }
                    if (bVar == null) {
                        throw new IOException(l.q.g("TYPE_RST_STREAM unexpected error code: ", i15));
                    }
                    r rVar = lVar.f5477b;
                    rVar.getClass();
                    if (i14 == 0 || (i13 & 1) != 0) {
                        y yVarF = rVar.f(i14);
                        if (yVarF == null) {
                            return true;
                        }
                        yVarF.j(bVar);
                        return true;
                    }
                    rVar.f5503q.c(new o(rVar.f5497d + '[' + i14 + "] onReset", rVar, i14, bVar, 0), 0L);
                    return true;
                case 4:
                    if (i14 != 0) {
                        throw new IOException("TYPE_SETTINGS streamId != 0");
                    }
                    if ((b10 & 1) == 0) {
                        if (iQ % 6 != 0) {
                            throw new IOException(l.q.g("TYPE_SETTINGS length % 6 != 0: ", iQ));
                        }
                        c0 c0Var = new c0();
                        i9.e eVarJ0 = z6.a.j0(z6.a.s0(0, iQ), 6);
                        int i16 = eVarJ0.f8183a;
                        int i17 = eVarJ0.f8184b;
                        int i18 = eVarJ0.f8185c;
                        if ((i18 > 0 && i16 <= i17) || (i18 < 0 && i17 <= i16)) {
                            while (true) {
                                ja.i iVar2 = this.f5529a;
                                short s9 = iVar2.readShort();
                                byte[] bArr = y9.b.f17000a;
                                int i19 = s9 & 65535;
                                int i20 = iVar2.readInt();
                                if (i19 != 2) {
                                    if (i19 == 3) {
                                        i19 = 4;
                                    } else if (i19 == 4) {
                                        if (i20 < 0) {
                                            throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                        }
                                        i19 = 7;
                                    } else if (i19 == 5 && (i20 < 16384 || i20 > 16777215)) {
                                        throw new IOException(l.q.g("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: ", i20));
                                    }
                                } else if (i20 != 0 && i20 != 1) {
                                    throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                                }
                                c0Var.c(i19, i20);
                                if (i16 != i17) {
                                    i16 += i18;
                                }
                            }
                        }
                        r rVar2 = lVar.f5477b;
                        rVar2.f5502p.c(new k(a7.a.p(new StringBuilder(), rVar2.f5497d, " applyAndAckSettings"), lVar, c0Var), 0L);
                    } else if (iQ != 0) {
                        throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
                    }
                    break;
                    break;
                case 5:
                    g(lVar, iQ, i12, i14);
                    break;
                case 6:
                    if (iQ != 8) {
                        throw new IOException(l.q.g("TYPE_PING length != 8: ", iQ));
                    }
                    if (i14 != 0) {
                        throw new IOException("TYPE_PING streamId != 0");
                    }
                    int i21 = this.f5529a.readInt();
                    int i22 = this.f5529a.readInt();
                    if ((b10 & 1) == 0) {
                        lVar.f5477b.f5502p.c(new j(a7.a.p(new StringBuilder(), lVar.f5477b.f5497d, " ping"), lVar.f5477b, i21, i22), 0L);
                    } else {
                        r rVar3 = lVar.f5477b;
                        synchronized (rVar3) {
                            try {
                                if (i21 == 1) {
                                    rVar3.f5507u++;
                                } else if (i21 == 2) {
                                    rVar3.f5509w++;
                                } else if (i21 == 3) {
                                    rVar3.notifyAll();
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    break;
                    break;
                case 7:
                    if (iQ < 8) {
                        throw new IOException(l.q.g("TYPE_GOAWAY length < 8: ", iQ));
                    }
                    if (i14 != 0) {
                        throw new IOException("TYPE_GOAWAY streamId != 0");
                    }
                    int i23 = this.f5529a.readInt();
                    int i24 = this.f5529a.readInt();
                    int i25 = iQ - 8;
                    b[] bVarArrValues2 = b.values();
                    int length2 = bVarArrValues2.length;
                    int i26 = 0;
                    while (true) {
                        if (i26 < length2) {
                            b bVar4 = bVarArrValues2[i26];
                            if (bVar4.f5437a == i24) {
                                bVar2 = bVar4;
                            } else {
                                i26++;
                            }
                        } else {
                            bVar2 = null;
                        }
                    }
                    if (bVar2 == null) {
                        throw new IOException(l.q.g("TYPE_GOAWAY unexpected error code: ", i24));
                    }
                    ja.j jVarI = ja.j.f8539d;
                    if (i25 > 0) {
                        jVarI = this.f5529a.i(i25);
                    }
                    d7.a.m(jVarI, "debugData");
                    jVarI.d();
                    r rVar4 = lVar.f5477b;
                    synchronized (rVar4) {
                        array = rVar4.f5496c.values().toArray(new y[0]);
                        rVar4.f5500n = true;
                    }
                    y[] yVarArr = (y[]) array;
                    int length3 = yVarArr.length;
                    while (i10 < length3) {
                        y yVar = yVarArr[i10];
                        if (yVar.f5544a > i23 && yVar.g()) {
                            yVar.j(b.REFUSED_STREAM);
                            lVar.f5477b.f(yVar.f5544a);
                        }
                        i10++;
                    }
                    break;
                    break;
                case 8:
                    if (iQ != 4) {
                        throw new IOException(l.q.g("TYPE_WINDOW_UPDATE length !=4: ", iQ));
                    }
                    long j10 = ((long) this.f5529a.readInt()) & 2147483647L;
                    if (j10 == 0) {
                        throw new IOException("windowSizeIncrement was 0");
                    }
                    if (i14 != 0) {
                        y yVarE = lVar.f5477b.e(i14);
                        if (yVarE != null) {
                            synchronized (yVarE) {
                                yVarE.f5549f += j10;
                                if (j10 > 0) {
                                    yVarE.notifyAll();
                                }
                            }
                        }
                    } else {
                        r rVar5 = lVar.f5477b;
                        synchronized (rVar5) {
                            rVar5.D += j10;
                            rVar5.notifyAll();
                        }
                    }
                    break;
                    break;
                default:
                    this.f5529a.l(iQ);
                    break;
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public final void b(l lVar) throws IOException {
        d7.a.m(lVar, "handler");
        if (this.f5530b) {
            if (!a(true, lVar)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            return;
        }
        ja.j jVar = e.f5453a;
        ja.j jVarI = this.f5529a.i(jVar.f8540a.length);
        Level level = Level.FINE;
        Logger logger = f5528f;
        if (logger.isLoggable(level)) {
            logger.fine(y9.b.g("<< CONNECTION " + jVarI.e(), new Object[0]));
        }
        if (!d7.a.d(jVar, jVarI)) {
            throw new IOException("Expected a connection header but was ".concat(jVarI.t()));
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f5529a.close();
    }

    public final void e(l lVar, int i10, int i11, int i12) throws IOException {
        int i13;
        boolean z10;
        boolean z11;
        long j10;
        if (i12 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
        }
        boolean z12 = (i11 & 1) != 0;
        if ((i11 & 32) != 0) {
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        if ((i11 & 8) != 0) {
            byte b10 = this.f5529a.readByte();
            byte[] bArr = y9.b.f17000a;
            i13 = b10 & 255;
        } else {
            i13 = 0;
        }
        int iD = x9.v.D(i10, i11, i13);
        ja.i iVar = this.f5529a;
        lVar.getClass();
        d7.a.m(iVar, "source");
        lVar.f5477b.getClass();
        long j11 = 0;
        if (i12 != 0 && (i12 & 1) == 0) {
            r rVar = lVar.f5477b;
            rVar.getClass();
            ja.g gVar = new ja.g();
            long j12 = iD;
            iVar.S(j12);
            iVar.I(gVar, j12);
            rVar.f5503q.c(new m(rVar.f5497d + '[' + i12 + "] onData", rVar, i12, gVar, iD, z12), 0L);
        } else {
            y yVarE = lVar.f5477b.e(i12);
            if (yVarE == null) {
                lVar.f5477b.u(i12, b.PROTOCOL_ERROR);
                long j13 = iD;
                lVar.f5477b.p(j13);
                iVar.l(j13);
            } else {
                byte[] bArr2 = y9.b.f17000a;
                w wVar = yVarE.f5552i;
                long j14 = iD;
                wVar.getClass();
                long j15 = j14;
                while (true) {
                    if (j15 <= j11) {
                        byte[] bArr3 = y9.b.f17000a;
                        wVar.f5542f.f5545b.p(j14);
                        break;
                    }
                    synchronized (wVar.f5542f) {
                        z10 = wVar.f5538b;
                        z11 = wVar.f5540d.f8534b + j15 > wVar.f5537a;
                    }
                    if (z11) {
                        iVar.l(j15);
                        wVar.f5542f.e(b.FLOW_CONTROL_ERROR);
                        break;
                    }
                    if (z10) {
                        iVar.l(j15);
                        break;
                    }
                    long jI = iVar.I(wVar.f5539c, j15);
                    if (jI == -1) {
                        throw new EOFException();
                    }
                    j15 -= jI;
                    y yVar = wVar.f5542f;
                    synchronized (yVar) {
                        try {
                            if (wVar.f5541e) {
                                wVar.f5539c.a();
                                j10 = 0;
                            } else {
                                ja.g gVar2 = wVar.f5540d;
                                j10 = 0;
                                boolean z13 = gVar2.f8534b == 0;
                                gVar2.g0(wVar.f5539c);
                                if (z13) {
                                    yVar.notifyAll();
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    j11 = j10;
                }
                if (z12) {
                    yVarE.i(y9.b.f17001b, true);
                }
            }
        }
        this.f5529a.l(i13);
    }

    public final void f(l lVar, int i10, int i11, int i12) throws IOException {
        int i13;
        List arrayList;
        if (i12 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        boolean z10 = false;
        int i14 = 1;
        boolean z11 = (i11 & 1) != 0;
        if ((i11 & 8) != 0) {
            byte b10 = this.f5529a.readByte();
            byte[] bArr = y9.b.f17000a;
            i13 = b10 & 255;
        } else {
            i13 = 0;
        }
        if ((i11 & 32) != 0) {
            ja.i iVar = this.f5529a;
            iVar.readInt();
            iVar.readByte();
            byte[] bArr2 = y9.b.f17000a;
            lVar.getClass();
            i10 -= 5;
        }
        int iD = x9.v.D(i10, i11, i13);
        t tVar = this.f5531c;
        tVar.f5525e = iD;
        tVar.f5522b = iD;
        tVar.f5526f = i13;
        tVar.f5523c = i11;
        tVar.f5524d = i12;
        j8.d dVar = this.f5532d;
        dVar.k();
        ArrayList arrayList2 = dVar.f8457d;
        switch (dVar.f8454a) {
            case 0:
                arrayList = new ArrayList(arrayList2);
                arrayList2.clear();
                break;
            default:
                arrayList = r8.p.W0(arrayList2);
                arrayList2.clear();
                break;
        }
        List list = arrayList;
        lVar.getClass();
        lVar.f5477b.getClass();
        if (i12 != 0 && (i12 & 1) == 0) {
            z10 = true;
        }
        if (z10) {
            r rVar = lVar.f5477b;
            rVar.getClass();
            rVar.f5503q.c(new n(rVar.f5497d + '[' + i12 + "] onHeaders", rVar, i12, list, z11), 0L);
            return;
        }
        r rVar2 = lVar.f5477b;
        synchronized (rVar2) {
            y yVarE = rVar2.e(i12);
            if (yVarE != null) {
                yVarE.i(y9.b.s(list), z11);
                return;
            }
            if (rVar2.f5500n) {
                return;
            }
            if (i12 <= rVar2.f5498e) {
                return;
            }
            if (i12 % 2 == rVar2.f5499f % 2) {
                return;
            }
            y yVar = new y(i12, rVar2, false, z11, y9.b.s(list));
            rVar2.f5498e = i12;
            rVar2.f5496c.put(Integer.valueOf(i12), yVar);
            rVar2.f5501o.f().c(new i(rVar2.f5497d + '[' + i12 + "] onStream", rVar2, yVar, i14), 0L);
        }
    }

    public final void g(l lVar, int i10, int i11, int i12) throws IOException {
        int i13;
        Object arrayList;
        if (i12 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        if ((i11 & 8) != 0) {
            byte b10 = this.f5529a.readByte();
            byte[] bArr = y9.b.f17000a;
            i13 = b10 & 255;
        } else {
            i13 = 0;
        }
        int i14 = this.f5529a.readInt() & Integer.MAX_VALUE;
        int iD = x9.v.D(i10 - 4, i11, i13);
        t tVar = this.f5531c;
        tVar.f5525e = iD;
        tVar.f5522b = iD;
        tVar.f5526f = i13;
        tVar.f5523c = i11;
        tVar.f5524d = i12;
        j8.d dVar = this.f5532d;
        dVar.k();
        ArrayList arrayList2 = dVar.f8457d;
        switch (dVar.f8454a) {
            case 0:
                arrayList = new ArrayList(arrayList2);
                arrayList2.clear();
                break;
            default:
                arrayList = r8.p.W0(arrayList2);
                arrayList2.clear();
                break;
        }
        Object obj = arrayList;
        lVar.getClass();
        r rVar = lVar.f5477b;
        rVar.getClass();
        synchronized (rVar) {
            if (rVar.H.contains(Integer.valueOf(i14))) {
                rVar.u(i14, b.PROTOCOL_ERROR);
                return;
            }
            rVar.H.add(Integer.valueOf(i14));
            rVar.f5503q.c(new o(rVar.f5497d + '[' + i14 + "] onRequest", rVar, i14, obj, 2), 0L);
        }
    }
}
