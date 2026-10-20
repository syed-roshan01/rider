package w0;

/* JADX INFO: loaded from: classes.dex */
public final class a extends d9.j implements c9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c9.c f16020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c9.c f16021c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(c9.c cVar, c9.c cVar2, int i10) {
        super(1);
        this.f16019a = i10;
        this.f16020b = cVar;
        this.f16021c = cVar2;
    }

    public final void a(Object obj) {
        int i10 = this.f16019a;
        c9.c cVar = this.f16021c;
        c9.c cVar2 = this.f16020b;
        switch (i10) {
            case 1:
                cVar2.invoke(obj);
                cVar.invoke(obj);
                break;
            case 2:
                cVar2.invoke(obj);
                cVar.invoke(obj);
                break;
            default:
                cVar2.invoke(obj);
                cVar.invoke(obj);
                break;
        }
    }

    @Override // c9.c
    public final Object invoke(Object obj) {
        int i10;
        switch (this.f16019a) {
            case 0:
                n nVar = (n) obj;
                synchronized (p.f16109b) {
                    i10 = p.f16111d;
                    p.f16111d = i10 + 1;
                }
                return new c(i10, nVar, this.f16020b, this.f16021c);
            case 1:
                a(obj);
                return q8.l.f13235a;
            case 2:
                a(obj);
                return q8.l.f13235a;
            default:
                a(obj);
                return q8.l.f13235a;
        }
    }
}
