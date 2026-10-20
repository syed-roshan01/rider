package i1;

import e1.n0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f7765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f7766c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f7767d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f7768e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f7769f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f7770g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f7771h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f7772i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d f7773j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f7774k;

    public e(String str, float f10, float f11, float f12, float f13, long j10, int i10, boolean z10, int i11) {
        String str2 = (i11 & 1) != 0 ? "" : str;
        long j11 = (i11 & 32) != 0 ? e1.r.f5065g : j10;
        int i12 = (i11 & 64) != 0 ? 5 : i10;
        boolean z11 = (i11 & 128) != 0 ? false : z10;
        this.f7764a = str2;
        this.f7765b = f10;
        this.f7766c = f11;
        this.f7767d = f12;
        this.f7768e = f13;
        this.f7769f = j11;
        this.f7770g = i12;
        this.f7771h = z11;
        ArrayList arrayList = new ArrayList();
        this.f7772i = arrayList;
        d dVar = new d(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 1023);
        this.f7773j = dVar;
        arrayList.add(dVar);
    }

    public static void a(e eVar, ArrayList arrayList, n0 n0Var) {
        eVar.c();
        ((d) a7.a.k(eVar.f7772i, 1)).f7761j.add(new k0("", arrayList, 0, n0Var, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 1.0f, 0.0f));
    }

    public final f b() {
        c();
        while (true) {
            ArrayList arrayList = this.f7772i;
            if (arrayList.size() <= 1) {
                String str = this.f7764a;
                float f10 = this.f7765b;
                float f11 = this.f7766c;
                float f12 = this.f7767d;
                float f13 = this.f7768e;
                d dVar = this.f7773j;
                f fVar = new f(str, f10, f11, f12, f13, new g0(dVar.f7752a, dVar.f7753b, dVar.f7754c, dVar.f7755d, dVar.f7756e, dVar.f7757f, dVar.f7758g, dVar.f7759h, dVar.f7760i, dVar.f7761j), this.f7769f, this.f7770g, this.f7771h);
                this.f7774k = true;
                return fVar;
            }
            c();
            d dVar2 = (d) arrayList.remove(arrayList.size() - 1);
            ((d) a7.a.k(arrayList, 1)).f7761j.add(new g0(dVar2.f7752a, dVar2.f7753b, dVar2.f7754c, dVar2.f7755d, dVar2.f7756e, dVar2.f7757f, dVar2.f7758g, dVar2.f7759h, dVar2.f7760i, dVar2.f7761j));
        }
    }

    public final void c() {
        if (!(!this.f7774k)) {
            throw new IllegalStateException("ImageVector.Builder is single use, create a new instance to create a new ImageVector".toString());
        }
    }
}
