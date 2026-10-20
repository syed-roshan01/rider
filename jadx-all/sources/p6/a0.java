package p6;

/* JADX INFO: loaded from: classes.dex */
public final class a0 extends w {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f12790n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f12791o;

    public /* synthetic */ a0(Object obj, int i10) {
        this.f12790n = i10;
        this.f12791o = obj;
    }

    @Override // p6.w
    public final void b() {
        switch (this.f12790n) {
            case 0:
                synchronized (((c) this.f12791o).f12799f) {
                    try {
                        if (((c) this.f12791o).f12805l.get() > 0 && ((c) this.f12791o).f12805l.decrementAndGet() > 0) {
                            ((c) this.f12791o).f12795b.b("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        c cVar = (c) this.f12791o;
                        if (cVar.f12807n != null) {
                            cVar.f12795b.b("Unbind from service.", new Object[0]);
                            c cVar2 = (c) this.f12791o;
                            cVar2.f12794a.unbindService(cVar2.f12806m);
                            Object obj = this.f12791o;
                            ((c) obj).f12800g = false;
                            ((c) obj).f12807n = null;
                            ((c) obj).f12806m = null;
                        }
                        ((c) this.f12791o).d();
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            default:
                b bVar = (b) this.f12791o;
                c cVar3 = bVar.f12792a;
                cVar3.f12795b.b("unlinkToDeath", new Object[0]);
                cVar3.f12807n.asBinder().unlinkToDeath(cVar3.f12804k, 0);
                c cVar4 = bVar.f12792a;
                cVar4.f12807n = null;
                cVar4.f12800g = false;
                return;
        }
    }
}
