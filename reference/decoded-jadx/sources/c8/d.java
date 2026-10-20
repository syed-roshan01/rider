package c8;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b8.b f3047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3049c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f3050d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f3051e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f3052f;

    public d(l4.e eVar, b8.b bVar, int i10, int i11, int i12, d dVar, b8.c cVar) {
        this.f3047a = bVar;
        this.f3048b = i10;
        b8.b bVar2 = b8.b.BYTE;
        int i13 = (bVar == bVar2 || dVar == null) ? i11 : dVar.f3049c;
        this.f3049c = i13;
        this.f3050d = i12;
        this.f3051e = dVar;
        boolean z10 = false;
        int iA = dVar != null ? dVar.f3052f : 0;
        if ((bVar == bVar2 && dVar == null && i13 != 0) || (dVar != null && i13 != dVar.f3049c)) {
            z10 = true;
        }
        iA = (dVar == null || bVar != dVar.f3047a || z10) ? iA + bVar.a(cVar) + 4 : iA;
        int iOrdinal = bVar.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                iA += i12 != 1 ? 11 : 6;
            } else if (iOrdinal == 4) {
                iA += ((String) eVar.f11281b).substring(i10, i12 + i10).getBytes(((z7.d) eVar.f11282c).f17331a[i11].charset()).length * 8;
                if (z10) {
                    iA += 12;
                }
            } else if (iOrdinal == 6) {
                iA += 13;
            }
        } else {
            iA += i12 != 1 ? i12 == 2 ? 7 : 10 : 4;
        }
        this.f3052f = iA;
    }
}
