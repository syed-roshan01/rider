package g8;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class b4 implements p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4 f6665a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public h8.t f6667c;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a4.q f6672h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final y5 f6673i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f6674j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f6675k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f6677m;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6666b = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e8.s f6668d = e8.r.f5354a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f6669e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final z3 f6670f = new z3(this);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ByteBuffer f6671g = ByteBuffer.allocate(5);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f6676l = -1;

    public b4(a4 a4Var, a4.q qVar, y5 y5Var) {
        y3.e.J(a4Var, "sink");
        this.f6665a = a4Var;
        this.f6672h = qVar;
        this.f6673i = y5Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int j(InputStream inputStream, OutputStream outputStream) throws IOException {
        long j10 = 0;
        if (!(inputStream instanceof e8.f0)) {
            int i10 = s6.g.f14060a;
            inputStream.getClass();
            outputStream.getClass();
            byte[] bArr = new byte[8192];
            while (true) {
                int i11 = inputStream.read(bArr);
                if (i11 == -1) {
                    break;
                }
                outputStream.write(bArr, 0, i11);
                j10 += (long) i11;
            }
            y3.e.D(j10, "Message size overflow: %s", j10 <= 2147483647L);
            return (int) j10;
        }
        l8.a aVar = (l8.a) ((e8.f0) inputStream);
        com.google.protobuf.t1 t1Var = aVar.f11385a;
        if (t1Var != null) {
            int serializedSize = t1Var.getSerializedSize();
            aVar.f11385a.writeTo(outputStream);
            aVar.f11385a = null;
            return serializedSize;
        }
        ByteArrayInputStream byteArrayInputStream = aVar.f11387c;
        if (byteArrayInputStream == null) {
            return 0;
        }
        com.google.protobuf.z zVar = l8.c.f11392a;
        y3.e.J(outputStream, "outputStream cannot be null!");
        byte[] bArr2 = new byte[8192];
        while (true) {
            int i12 = byteArrayInputStream.read(bArr2);
            if (i12 == -1) {
                int i13 = (int) j10;
                aVar.f11387c = null;
                return i13;
            }
            outputStream.write(bArr2, 0, i12);
            j10 += (long) i12;
        }
    }

    public final void a(boolean z10, boolean z11) {
        h8.t tVar = this.f6667c;
        this.f6667c = null;
        ((b) this.f6665a).A(tVar, z10, z11, this.f6675k);
        this.f6675k = 0;
    }

    public final void b(y3 y3Var, boolean z10) {
        ArrayList arrayList = y3Var.f7289a;
        Iterator it = arrayList.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 += ((h8.t) it.next()).f7720c;
        }
        ByteBuffer byteBuffer = this.f6671g;
        byteBuffer.clear();
        byteBuffer.put(z10 ? (byte) 1 : (byte) 0).putInt(i10);
        this.f6672h.getClass();
        h8.t tVarE = a4.q.e(5);
        tVarE.a(byteBuffer.array(), 0, byteBuffer.position());
        if (i10 == 0) {
            this.f6667c = tVarE;
            return;
        }
        int i11 = this.f6675k - 1;
        b bVar = (b) this.f6665a;
        bVar.A(tVarE, false, false, i11);
        this.f6675k = 1;
        for (int i12 = 0; i12 < arrayList.size() - 1; i12++) {
            bVar.A((h8.t) arrayList.get(i12), false, false, 0);
        }
        this.f6667c = (h8.t) a7.a.k(arrayList, 1);
        this.f6677m = i10;
    }

    @Override // g8.p1
    public final p1 c(boolean z10) {
        this.f6669e = z10;
        return this;
    }

    @Override // g8.p1
    public final void close() {
        if (this.f6674j) {
            return;
        }
        this.f6674j = true;
        h8.t tVar = this.f6667c;
        if (tVar != null && tVar.f7720c == 0) {
            this.f6667c = null;
        }
        a(true, true);
    }

    @Override // g8.p1
    public final p1 d(e8.s sVar) {
        y3.e.J(sVar, "Can't pass an empty compressor");
        this.f6668d = sVar;
        return this;
    }

    @Override // g8.p1
    public final void e(int i10) {
        y3.e.N("max size already set", this.f6666b == -1);
        this.f6666b = i10;
    }

    @Override // g8.p1
    public final boolean f() {
        return this.f6674j;
    }

    @Override // g8.p1
    public final void flush() {
        h8.t tVar = this.f6667c;
        if (tVar == null || tVar.f7720c <= 0) {
            return;
        }
        a(false, true);
    }

    @Override // g8.p1
    public final void g(InputStream inputStream) {
        if (this.f6674j) {
            throw new IllegalStateException("Framer already closed");
        }
        this.f6675k++;
        int i10 = this.f6676l + 1;
        this.f6676l = i10;
        this.f6677m = 0L;
        y5 y5Var = this.f6673i;
        for (o7.d0 d0Var : y5Var.f7292a) {
            d0Var.c0(i10);
        }
        boolean z10 = this.f6669e && this.f6668d != e8.r.f5354a;
        try {
            int iAvailable = ((inputStream instanceof e8.t0) || (inputStream instanceof ByteArrayInputStream)) ? inputStream.available() : -1;
            int iK = (iAvailable == 0 || !z10) ? k(inputStream, iAvailable) : h(inputStream);
            if (iAvailable != -1 && iK != iAvailable) {
                throw new e8.e2(e8.c2.f5223l.g(String.format("Message length inaccurate %s != %s", Integer.valueOf(iK), Integer.valueOf(iAvailable))));
            }
            long j10 = iK;
            o7.d0[] d0VarArr = y5Var.f7292a;
            for (o7.d0 d0Var2 : d0VarArr) {
                d0Var2.e0(j10);
            }
            long j11 = this.f6677m;
            for (o7.d0 d0Var3 : d0VarArr) {
                d0Var3.f0(j11);
            }
            int i11 = this.f6676l;
            long j12 = this.f6677m;
            for (o7.d0 d0Var4 : y5Var.f7292a) {
                d0Var4.d0(j12, j10, i11);
            }
        } catch (IOException e4) {
            throw new e8.e2(e8.c2.f5223l.g("Failed to frame message").f(e4));
        } catch (RuntimeException e10) {
            throw new e8.e2(e8.c2.f5223l.g("Failed to frame message").f(e10));
        }
    }

    public final int h(InputStream inputStream) throws IOException {
        y3 y3Var = new y3(this);
        OutputStream outputStreamA = this.f6668d.a(y3Var);
        try {
            int iJ = j(inputStream, outputStreamA);
            outputStreamA.close();
            int i10 = this.f6666b;
            if (i10 >= 0 && iJ > i10) {
                throw new e8.e2(e8.c2.f5222k.g(String.format(Locale.US, "message too large %d > %d", Integer.valueOf(iJ), Integer.valueOf(this.f6666b))));
            }
            b(y3Var, true);
            return iJ;
        } catch (Throwable th) {
            outputStreamA.close();
            throw th;
        }
    }

    public final void i(byte[] bArr, int i10, int i11) {
        while (i11 > 0) {
            h8.t tVar = this.f6667c;
            if (tVar != null && tVar.f7719b == 0) {
                a(false, false);
            }
            if (this.f6667c == null) {
                this.f6672h.getClass();
                this.f6667c = a4.q.e(i11);
            }
            int iMin = Math.min(i11, this.f6667c.f7719b);
            this.f6667c.a(bArr, i10, iMin);
            i10 += iMin;
            i11 -= iMin;
        }
    }

    public final int k(InputStream inputStream, int i10) throws IOException {
        if (i10 == -1) {
            y3 y3Var = new y3(this);
            int iJ = j(inputStream, y3Var);
            int i11 = this.f6666b;
            if (i11 >= 0 && iJ > i11) {
                throw new e8.e2(e8.c2.f5222k.g(String.format(Locale.US, "message too large %d > %d", Integer.valueOf(iJ), Integer.valueOf(this.f6666b))));
            }
            b(y3Var, false);
            return iJ;
        }
        this.f6677m = i10;
        int i12 = this.f6666b;
        if (i12 >= 0 && i10 > i12) {
            throw new e8.e2(e8.c2.f5222k.g(String.format(Locale.US, "message too large %d > %d", Integer.valueOf(i10), Integer.valueOf(this.f6666b))));
        }
        ByteBuffer byteBuffer = this.f6671g;
        byteBuffer.clear();
        byteBuffer.put((byte) 0).putInt(i10);
        if (this.f6667c == null) {
            int iPosition = byteBuffer.position() + i10;
            this.f6672h.getClass();
            this.f6667c = a4.q.e(iPosition);
        }
        i(byteBuffer.array(), 0, byteBuffer.position());
        return j(inputStream, this.f6670f);
    }
}
