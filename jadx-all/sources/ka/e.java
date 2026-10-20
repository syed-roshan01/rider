package ka;

import ja.g0;
import ja.o;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class e extends o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f10662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f10663c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f10664d;

    public e(g0 g0Var, long j10, boolean z10) {
        super(g0Var);
        this.f10662b = j10;
        this.f10663c = z10;
    }

    @Override // ja.o, ja.g0
    public final long I(ja.g gVar, long j10) throws IOException {
        d7.a.m(gVar, "sink");
        long j11 = this.f10664d;
        long j12 = this.f10662b;
        if (j11 > j12) {
            j10 = 0;
        } else if (this.f10663c) {
            long j13 = j12 - j11;
            if (j13 == 0) {
                return -1L;
            }
            j10 = Math.min(j10, j13);
        }
        long jI = super.I(gVar, j10);
        if (jI != -1) {
            this.f10664d += jI;
        }
        long j14 = this.f10664d;
        if ((j14 >= j12 || jI != -1) && j14 <= j12) {
            return jI;
        }
        if (jI > 0 && j14 > j12) {
            long j15 = gVar.f8534b - (j14 - j12);
            ja.g gVar2 = new ja.g();
            gVar2.g0(gVar);
            gVar.b0(gVar2, j15);
            gVar2.a();
        }
        throw new IOException("expected " + j12 + " bytes but got " + this.f10664d);
    }
}
