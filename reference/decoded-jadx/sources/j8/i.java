package j8;

import e8.c2;
import e8.l1;
import e8.z1;
import g8.i0;
import g8.o2;
import g8.r1;
import g8.w1;
import g8.y1;
import h8.n;
import i3.v;
import ja.a0;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import k6.v6;
import r8.p;
import y5.o;

/* JADX INFO: loaded from: classes.dex */
public final class i implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ja.i f8485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f8486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f8487c;

    public i(a0 a0Var) {
        this.f8485a = a0Var;
        g gVar = new g(a0Var);
        this.f8486b = gVar;
        this.f8487c = new d(gVar, 0);
    }

    public final boolean a(v6 v6Var) throws IOException {
        y1 y1Var;
        a aVar;
        boolean z10;
        v vVar;
        int i10 = 0;
        try {
            this.f8485a.S(9L);
            int iA = k.a(this.f8485a);
            if (iA < 0 || iA > 16384) {
                k.c("FRAME_SIZE_ERROR: %s", Integer.valueOf(iA));
                throw null;
            }
            byte b10 = (byte) (this.f8485a.readByte() & 255);
            byte b11 = (byte) (this.f8485a.readByte() & 255);
            int i11 = this.f8485a.readInt() & Integer.MAX_VALUE;
            Logger logger = k.f8494a;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(h.a(true, i11, iA, b10, b11));
            }
            switch (b10) {
                case 0:
                    b(v6Var, iA, b11, i11);
                    return true;
                case 1:
                    e(v6Var, iA, b11, i11);
                    return true;
                case 2:
                    if (iA != 5) {
                        k.c("TYPE_PRIORITY length: %d != 5", Integer.valueOf(iA));
                        throw null;
                    }
                    if (i11 == 0) {
                        k.c("TYPE_PRIORITY streamId == 0", new Object[0]);
                        throw null;
                    }
                    ja.i iVar = this.f8485a;
                    iVar.readInt();
                    iVar.readByte();
                    v6Var.getClass();
                    return true;
                case 3:
                    g(v6Var, iA, i11);
                    return true;
                case 4:
                    p(v6Var, iA, b11, i11);
                    return true;
                case 5:
                    f(v6Var, iA, b11, i11);
                    return true;
                case 6:
                    if (iA != 8) {
                        k.c("TYPE_PING length != 8: %s", Integer.valueOf(iA));
                        throw null;
                    }
                    if (i11 != 0) {
                        k.c("TYPE_PING streamId != 0", new Object[0]);
                        throw null;
                    }
                    int i12 = this.f8485a.readInt();
                    int i13 = this.f8485a.readInt();
                    boolean z11 = (b11 & 1) != 0;
                    long j10 = (((long) i12) << 32) | (((long) i13) & 4294967295L);
                    ((v6.d) v6Var.f10442c).i(1, j10);
                    if (!z11) {
                        synchronized (((n) v6Var.f10444e).f7682k) {
                            ((n) v6Var.f10444e).f7680i.X(i12, true, i13);
                            break;
                        }
                        return true;
                    }
                    synchronized (((n) v6Var.f10444e).f7682k) {
                        try {
                            Object obj = v6Var.f10444e;
                            if (((n) obj).f7695x == null) {
                                n.T.warning("Received unexpected ping ack. No ping outstanding");
                            } else if (((n) obj).f7695x.f7257a == j10) {
                                y1Var = ((n) obj).f7695x;
                                ((n) obj).f7695x = null;
                            } else {
                                n.T.log(Level.WARNING, String.format(Locale.US, "Received unexpected ping ack. Expecting %d, got %d", Long.valueOf(((n) obj).f7695x.f7257a), Long.valueOf(j10)));
                            }
                            y1Var = null;
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    if (y1Var == null) {
                        return true;
                    }
                    synchronized (y1Var) {
                        try {
                            if (!y1Var.f7260d) {
                                y1Var.f7260d = true;
                                long jA = y1Var.f7258b.a(TimeUnit.NANOSECONDS);
                                y1Var.f7262f = jA;
                                LinkedHashMap linkedHashMap = y1Var.f7259c;
                                y1Var.f7259c = null;
                                for (Map.Entry entry : linkedHashMap.entrySet()) {
                                    try {
                                        ((Executor) entry.getValue()).execute(new w1((o2) entry.getKey(), jA, 0));
                                    } catch (Throwable th2) {
                                        y1.f7256g.log(Level.SEVERE, "Failed to execute PingCallback", th2);
                                    }
                                }
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    return true;
                case 7:
                    if (iA < 8) {
                        k.c("TYPE_GOAWAY length < 8: %s", Integer.valueOf(iA));
                        throw null;
                    }
                    if (i11 != 0) {
                        k.c("TYPE_GOAWAY streamId != 0", new Object[0]);
                        throw null;
                    }
                    ja.i iVar2 = this.f8485a;
                    int i14 = iVar2.readInt();
                    int i15 = iVar2.readInt();
                    int i16 = iA - 8;
                    a[] aVarArrValues = a.values();
                    int length = aVarArrValues.length;
                    while (true) {
                        if (i10 < length) {
                            aVar = aVarArrValues[i10];
                            if (aVar.f8445a != i15) {
                                i10++;
                            }
                        } else {
                            aVar = null;
                        }
                    }
                    if (aVar == null) {
                        k.c("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(i15));
                        throw null;
                    }
                    ja.j jVarI = ja.j.f8539d;
                    if (i16 > 0) {
                        jVarI = iVar2.i(i16);
                    }
                    ((v6.d) v6Var.f10442c).h(1, i14, aVar, jVarI);
                    a aVar2 = a.ENHANCE_YOUR_CALM;
                    Object obj2 = v6Var.f10444e;
                    if (aVar == aVar2) {
                        String strT = jVarI.t();
                        n.T.log(Level.WARNING, String.format("%s: Received GOAWAY with ENHANCE_YOUR_CALM. Debug data: %s", v6Var, strT));
                        if ("too_many_pings".equals(strT)) {
                            ((n) obj2).L.run();
                        }
                    }
                    long j11 = aVar.f8445a;
                    r1[] r1VarArr = r1.f7068d;
                    r1 r1Var = (j11 >= ((long) r1VarArr.length) || j11 < 0) ? null : r1VarArr[(int) j11];
                    c2 c2VarA = (r1Var == null ? c2.c(r1.f7067c.f7071b.f5227a.f5425a).g("Unrecognized HTTP/2 error code: " + j11) : r1Var.f7071b).a("Received Goaway");
                    if (jVarI.d() > 0) {
                        c2VarA = c2VarA.a(jVarI.t());
                    }
                    Map map = n.S;
                    ((n) obj2).s(i14, null, c2VarA);
                    return true;
                case 8:
                    if (iA != 4) {
                        k.c("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(iA));
                        throw null;
                    }
                    long j12 = ((long) this.f8485a.readInt()) & 2147483647L;
                    if (j12 == 0) {
                        k.c("windowSizeIncrement was 0", new Object[0]);
                        throw null;
                    }
                    ((v6.d) v6Var.f10442c).l(1, i11, j12);
                    if (j12 != 0) {
                        z10 = true;
                        synchronized (((n) v6Var.f10444e).f7682k) {
                            try {
                                if (i11 == 0) {
                                    ((n) v6Var.f10444e).f7681j.d(null, (int) j12);
                                } else {
                                    h8.l lVar = (h8.l) ((n) v6Var.f10444e).f7685n.get(Integer.valueOf(i11));
                                    if (lVar != null) {
                                        o oVar = ((n) v6Var.f10444e).f7681j;
                                        h8.k kVar = lVar.f7668n;
                                        synchronized (kVar.f7660x) {
                                            vVar = kVar.K;
                                            break;
                                        }
                                        oVar.d(vVar, (int) j12);
                                    } else if (!((n) v6Var.f10444e).n(i11)) {
                                        i10 = 1;
                                    }
                                    if (i10 != 0) {
                                        n.g((n) v6Var.f10444e, "Received window_update for unknown stream: " + i11);
                                    }
                                }
                            } catch (Throwable th4) {
                                throw th4;
                            }
                        }
                    } else if (i11 == 0) {
                        n.g((n) v6Var.f10444e, "Received 0 flow control window increment.");
                        z10 = true;
                    } else {
                        z10 = true;
                        ((n) v6Var.f10444e).j(i11, c2.f5223l.g("Received 0 flow control window increment."), i0.f6839a, false, a.PROTOCOL_ERROR, null);
                    }
                    return z10;
                default:
                    this.f8485a.l(iA);
                    return true;
            }
        } catch (IOException unused) {
            return false;
        }
    }

    public final void b(v6 v6Var, int i10, byte b10, int i11) throws IOException {
        h8.l lVar;
        boolean z10 = (b10 & 1) != 0;
        if ((b10 & 32) != 0) {
            k.c("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
            throw null;
        }
        short s9 = (b10 & 8) != 0 ? (short) (this.f8485a.readByte() & 255) : (short) 0;
        int iB = k.b(i10, b10, s9);
        ja.i iVar = this.f8485a;
        ((v6.d) v6Var.f10442c).g(1, i11, iVar.A(), iB, z10);
        n nVar = (n) v6Var.f10444e;
        synchronized (nVar.f7682k) {
            lVar = (h8.l) nVar.f7685n.get(Integer.valueOf(i11));
        }
        if (lVar == null) {
            if (((n) v6Var.f10444e).n(i11)) {
                synchronized (((n) v6Var.f10444e).f7682k) {
                    ((n) v6Var.f10444e).f7680i.o(i11, a.STREAM_CLOSED);
                }
                iVar.l(iB);
            } else {
                n.g((n) v6Var.f10444e, "Received data for unknown stream: " + i11);
            }
            this.f8485a.l(s9);
        }
        long j10 = iB;
        iVar.S(j10);
        ja.g gVar = new ja.g();
        gVar.b0(iVar.A(), j10);
        o8.c cVar = lVar.f7668n.J;
        o8.b.f12664a.getClass();
        synchronized (((n) v6Var.f10444e).f7682k) {
            lVar.f7668n.p(gVar, z10);
        }
        n nVar2 = (n) v6Var.f10444e;
        int i12 = nVar2.f7690s + iB;
        nVar2.f7690s = i12;
        if (i12 >= nVar2.f7677f * 0.5f) {
            synchronized (nVar2.f7682k) {
                Object obj = v6Var.f10444e;
                ((n) obj).f7680i.N(0, ((n) obj).f7690s);
            }
            ((n) v6Var.f10444e).f7690s = 0;
        }
        this.f8485a.l(s9);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f8485a.close();
    }

    public final void e(v6 v6Var, int i10, byte b10, int i11) throws IOException {
        List arrayList;
        c2 c2VarG = null;
        boolean z10 = false;
        if (i11 == 0) {
            k.c("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
            throw null;
        }
        boolean z11 = (b10 & 1) != 0;
        short s9 = (b10 & 8) != 0 ? (short) (this.f8485a.readByte() & 255) : (short) 0;
        if ((b10 & 32) != 0) {
            ja.i iVar = this.f8485a;
            iVar.readInt();
            iVar.readByte();
            v6Var.getClass();
            i10 -= 5;
        }
        int iB = k.b(i10, b10, s9);
        g gVar = this.f8486b;
        gVar.f8480e = iB;
        gVar.f8477b = iB;
        gVar.f8481f = s9;
        gVar.f8478c = b10;
        gVar.f8479d = i11;
        d dVar = this.f8487c;
        dVar.k();
        ArrayList arrayList2 = dVar.f8457d;
        switch (dVar.f8454a) {
            case 0:
                arrayList = new ArrayList(arrayList2);
                arrayList2.clear();
                break;
            default:
                arrayList = p.W0(arrayList2);
                arrayList2.clear();
                break;
        }
        v6.d dVar2 = (v6.d) v6Var.f10442c;
        if (dVar2.f()) {
            ((Logger) dVar2.f15907b).log((Level) dVar2.f15908c, a7.a.H(1) + " HEADERS: streamId=" + i11 + " headers=" + arrayList + " endStream=" + z11);
        }
        if (((n) v6Var.f10444e).M != Integer.MAX_VALUE) {
            long jD = 0;
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                c cVar = (c) arrayList.get(i12);
                jD += (long) (cVar.f8452b.d() + cVar.f8451a.d() + 32);
            }
            int iMin = (int) Math.min(jD, 2147483647L);
            int i13 = ((n) v6Var.f10444e).M;
            if (iMin > i13) {
                c2 c2Var = c2.f5222k;
                Locale locale = Locale.US;
                Object[] objArr = new Object[3];
                objArr[0] = z11 ? "trailer" : "header";
                objArr[1] = Integer.valueOf(i13);
                objArr[2] = Integer.valueOf(iMin);
                c2VarG = c2Var.g(String.format(locale, "Response %s metadata larger than %d: %d", objArr));
            }
        }
        synchronized (((n) v6Var.f10444e).f7682k) {
            try {
                h8.l lVar = (h8.l) ((n) v6Var.f10444e).f7685n.get(Integer.valueOf(i11));
                if (lVar == null) {
                    if (((n) v6Var.f10444e).n(i11)) {
                        ((n) v6Var.f10444e).f7680i.o(i11, a.STREAM_CLOSED);
                    } else {
                        z10 = true;
                    }
                } else if (c2VarG == null) {
                    o8.c cVar2 = lVar.f7668n.J;
                    o8.b.f12664a.getClass();
                    lVar.f7668n.q(arrayList, z11);
                } else {
                    if (!z11) {
                        ((n) v6Var.f10444e).f7680i.o(i11, a.CANCEL);
                    }
                    lVar.f7668n.h(new l1(), c2VarG, false);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z10) {
            n.g((n) v6Var.f10444e, "Received header for unknown stream: " + i11);
        }
    }

    public final void f(v6 v6Var, int i10, byte b10, int i11) throws IOException {
        Object arrayList;
        if (i11 == 0) {
            k.c("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
            throw null;
        }
        short s9 = (b10 & 8) != 0 ? (short) (this.f8485a.readByte() & 255) : (short) 0;
        int i12 = this.f8485a.readInt() & Integer.MAX_VALUE;
        int iB = k.b(i10 - 4, b10, s9);
        g gVar = this.f8486b;
        gVar.f8480e = iB;
        gVar.f8477b = iB;
        gVar.f8481f = s9;
        gVar.f8478c = b10;
        gVar.f8479d = i11;
        d dVar = this.f8487c;
        dVar.k();
        ArrayList arrayList2 = dVar.f8457d;
        switch (dVar.f8454a) {
            case 0:
                arrayList = new ArrayList(arrayList2);
                arrayList2.clear();
                break;
            default:
                arrayList = p.W0(arrayList2);
                arrayList2.clear();
                break;
        }
        v6.d dVar2 = (v6.d) v6Var.f10442c;
        if (dVar2.f()) {
            ((Logger) dVar2.f15907b).log((Level) dVar2.f15908c, a7.a.H(1) + " PUSH_PROMISE: streamId=" + i11 + " promisedStreamId=" + i12 + " headers=" + arrayList);
        }
        synchronized (((n) v6Var.f10444e).f7682k) {
            ((n) v6Var.f10444e).f7680i.o(i11, a.PROTOCOL_ERROR);
        }
    }

    public final void g(v6 v6Var, int i10, int i11) throws IOException {
        a aVar;
        if (i10 != 4) {
            k.c("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(i10));
            throw null;
        }
        if (i11 == 0) {
            k.c("TYPE_RST_STREAM streamId == 0", new Object[0]);
            throw null;
        }
        int i12 = this.f8485a.readInt();
        a[] aVarArrValues = a.values();
        int length = aVarArrValues.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                aVar = null;
                break;
            }
            aVar = aVarArrValues[i13];
            if (aVar.f8445a == i12) {
                break;
            } else {
                i13++;
            }
        }
        if (aVar == null) {
            k.c("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(i12));
            throw null;
        }
        boolean z10 = true;
        ((v6.d) v6Var.f10442c).j(1, i11, aVar);
        c2 c2VarA = n.w(aVar).a("Rst Stream");
        z1 z1Var = c2VarA.f5227a;
        if (z1Var != z1.CANCELLED && z1Var != z1.DEADLINE_EXCEEDED) {
            z10 = false;
        }
        synchronized (((n) v6Var.f10444e).f7682k) {
            try {
                h8.l lVar = (h8.l) ((n) v6Var.f10444e).f7685n.get(Integer.valueOf(i11));
                if (lVar != null) {
                    o8.c cVar = lVar.f7668n.J;
                    o8.b.f12664a.getClass();
                    ((n) v6Var.f10444e).j(i11, c2VarA, aVar == a.REFUSED_STREAM ? i0.f6840b : i0.f6839a, z10, null, null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void p(v6 v6Var, int i10, byte b10, int i11) throws IOException {
        int i12;
        if (i11 != 0) {
            k.c("TYPE_SETTINGS streamId != 0", new Object[0]);
            throw null;
        }
        if ((b10 & 1) != 0) {
            if (i10 == 0) {
                v6Var.getClass();
                return;
            } else {
                k.c("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
                throw null;
            }
        }
        if (i10 % 6 != 0) {
            k.c("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(i10));
            throw null;
        }
        a4.k kVar = new a4.k(1);
        int i13 = 0;
        while (true) {
            short s9 = 4;
            if (i13 >= i10) {
                ((v6.d) v6Var.f10442c).k(1, kVar);
                synchronized (((n) v6Var.f10444e).f7682k) {
                    try {
                        if (kVar.a(4)) {
                            ((n) v6Var.f10444e).D = kVar.f1142d[4];
                        }
                        boolean zC = kVar.a(7) ? ((n) v6Var.f10444e).f7681j.c(kVar.f1142d[7]) : false;
                        if (v6Var.f10441b) {
                            ((n) v6Var.f10444e).f7679h.c();
                            v6Var.f10441b = false;
                        }
                        ((n) v6Var.f10444e).f7680i.D(kVar);
                        if (zC) {
                            ((n) v6Var.f10444e).f7681j.e();
                        }
                        ((n) v6Var.f10444e).t();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                int i14 = kVar.f1139a;
                if ((i14 & 2) == 0 || (i12 = kVar.f1142d[1]) < 0) {
                    return;
                }
                d dVar = this.f8487c;
                if ((i14 & 2) == 0) {
                    i12 = -1;
                }
                dVar.f8455b = i12;
                dVar.f8456c = i12;
                dVar.a();
                return;
            }
            short s10 = this.f8485a.readShort();
            int i15 = this.f8485a.readInt();
            switch (s10) {
                case 1:
                case 6:
                    s9 = s10;
                    break;
                case 2:
                    if (i15 != 0 && i15 != 1) {
                        k.c("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                        throw null;
                    }
                    s9 = s10;
                    break;
                    break;
                case 3:
                    break;
                case 4:
                    if (i15 < 0) {
                        k.c("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                        throw null;
                    }
                    s9 = 7;
                    break;
                    break;
                case 5:
                    if (i15 < 16384 || i15 > 16777215) {
                        k.c("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(i15));
                        throw null;
                    }
                    s9 = s10;
                    break;
                default:
                    continue;
                    i13 += 6;
                    break;
            }
            kVar.b(s9, i15);
            i13 += 6;
        }
    }
}
