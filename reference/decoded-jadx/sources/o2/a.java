package o2;

/* JADX INFO: loaded from: classes.dex */
public final class a extends d9.j implements c9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f12449b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(p pVar, int i10) {
        super(1);
        this.f12448a = i10;
        this.f12449b = pVar;
    }

    @Override // c9.c
    public final Object invoke(Object obj) {
        int i10 = this.f12448a;
        p pVar = this.f12449b;
        switch (i10) {
            case 0:
                pVar.show();
                return new b.c(pVar, 7);
            default:
                if (pVar.f12491e.f12487a) {
                    pVar.f12490d.invoke();
                }
                return q8.l.f13235a;
        }
    }
}
