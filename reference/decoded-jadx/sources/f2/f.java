package f2;

/* JADX INFO: loaded from: classes.dex */
public final class f implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f6104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f6105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u f6106c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f6107d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n f6108e;

    public f(a4.q qVar, a aVar) {
        u uVar = g.f6109a;
        i iVar = new i(g.f6110b);
        n nVar = new n();
        this.f6104a = qVar;
        this.f6105b = aVar;
        this.f6106c = uVar;
        this.f6107d = iVar;
        this.f6108e = nVar;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x003c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final w a(t tVar) {
        w wVar;
        u uVar = this.f6106c;
        u.s sVar = new u.s(24, this, tVar);
        synchronized (uVar.f6132a) {
            wVar = (w) uVar.f6133b.a(tVar);
            if (wVar == null) {
                try {
                    wVar = (w) sVar.invoke(new u.s(25, uVar, tVar));
                    synchronized (uVar.f6132a) {
                        if (uVar.f6133b.a(tVar) == null && ((v) wVar).f6135b) {
                            uVar.f6133b.b(tVar, wVar);
                        }
                    }
                } catch (Exception e4) {
                    throw new IllegalStateException("Could not load font", e4);
                }
            } else if (!((v) wVar).f6135b) {
                wVar = (w) sVar.invoke(new u.s(25, uVar, tVar));
                synchronized (uVar.f6132a) {
                    if (uVar.f6133b.a(tVar) == null) {
                        uVar.f6133b.b(tVar, wVar);
                    }
                }
            }
        }
        return wVar;
    }

    public final w b(e eVar, l lVar, int i10, int i11) {
        r rVar = this.f6105b;
        rVar.getClass();
        l lVarA = rVar.a(lVar);
        this.f6104a.getClass();
        return a(new t(eVar, lVarA, i10, i11, null));
    }
}
