package i3;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f7996c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f7997d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f7998e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public z f7999f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f8000g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f8001h;

    public v(y5.o oVar, int i10, int i11, h8.k kVar) {
        this.f8001h = oVar;
        this.f7998e = new ja.g();
        this.f7997d = false;
        this.f7994a = i10;
        this.f7995b = i11;
        this.f8000g = kVar;
    }

    public final boolean a() {
        return ((ja.g) this.f7998e).f8534b > 0;
    }

    public final int b(int i10) {
        if (i10 <= 0 || Integer.MAX_VALUE - i10 >= this.f7995b) {
            int i11 = this.f7995b + i10;
            this.f7995b = i11;
            return i11;
        }
        throw new IllegalArgumentException("Window size overflow for stream: " + this.f7994a);
    }

    public final void c() {
        this.f7994a = 1;
        this.f7999f = (z) this.f7998e;
        this.f7996c = 0;
    }

    public final boolean d() {
        int[] iArr;
        j3.a aVarC = this.f7999f.f8015b.c();
        int iA = aVarC.a(6);
        if ((iA == 0 || aVarC.f8336b.get(iA + aVarC.f8335a) == 0) && this.f7995b != 65039) {
            return this.f7997d && ((iArr = (int[]) this.f8001h) == null || Arrays.binarySearch(iArr, this.f7999f.f8015b.a(0)) < 0);
        }
        return true;
    }

    public final int e() {
        return Math.min(this.f7995b, ((v) ((y5.o) this.f8001h).f16985d).f7995b);
    }

    public final void f(int i10, ja.g gVar, boolean z10) {
        boolean zE;
        do {
            int iMin = Math.min(i10, ((j8.b) ((y5.o) this.f8001h).f16984c).R());
            int i11 = -iMin;
            ((v) ((y5.o) this.f8001h).f16985d).b(i11);
            b(i11);
            try {
                boolean z11 = false;
                ((j8.b) ((y5.o) this.f8001h).f16984c).r(this.f7994a, iMin, gVar, gVar.f8534b == ((long) iMin) && z10);
                g8.f fVar = (g8.f) ((h8.u) this.f8000g);
                synchronized (fVar.f6750b) {
                    y3.e.N("onStreamAllocated was not called, but it seems the stream is active", fVar.f6754f);
                    int i12 = fVar.f6753e;
                    boolean z12 = i12 < 32768;
                    int i13 = i12 - iMin;
                    fVar.f6753e = i13;
                    boolean z13 = i13 < 32768;
                    if (!z12 && z13) {
                        z11 = true;
                    }
                }
                if (z11) {
                    synchronized (fVar.f6750b) {
                        zE = fVar.e();
                    }
                    if (zE) {
                        ((g8.a) fVar).f6632j.b();
                    }
                }
                i10 -= iMin;
            } catch (IOException e4) {
                throw new RuntimeException(e4);
            }
        } while (i10 > 0);
    }

    public final void g(int i10, x9.v vVar) {
        Runnable runnable;
        int iMin = Math.min(i10, e());
        int i11 = 0;
        while (a() && iMin > 0) {
            long j10 = iMin;
            ja.g gVar = (ja.g) this.f7998e;
            long j11 = gVar.f8534b;
            if (j10 >= j11) {
                i11 += (int) j11;
                f((int) j11, gVar, this.f7997d);
            } else {
                i11 += iMin;
                f(iMin, gVar, false);
            }
            vVar.f16473a++;
            iMin = Math.min(i10 - i11, e());
        }
        if (a() || (runnable = (Runnable) this.f7999f) == null) {
            return;
        }
        runnable.run();
        this.f7999f = null;
    }

    public v(z zVar, boolean z10, int[] iArr) {
        this.f7994a = 1;
        this.f7998e = zVar;
        this.f7999f = zVar;
        this.f7997d = z10;
        this.f8001h = iArr;
    }
}
