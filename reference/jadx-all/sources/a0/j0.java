package a0;

/* JADX INFO: loaded from: classes.dex */
public final class j0 extends d9.j implements c9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c9.a f815b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(c9.a aVar, int i10) {
        super(1);
        this.f814a = i10;
        this.f815b = aVar;
    }

    @Override // c9.c
    public final Object invoke(Object obj) {
        int i10 = this.f814a;
        c9.a aVar = this.f815b;
        switch (i10) {
            case 0:
                s sVar = (s) aVar.invoke();
                int iC = sVar.c();
                int i11 = 0;
                while (i11 < iC) {
                    if (d7.a.d(sVar.a(i11), obj)) {
                        return Integer.valueOf(i11);
                    }
                    i11++;
                }
                i11 = -1;
                return Integer.valueOf(i11);
            default:
                return new d1.c(((d1.c) aVar.invoke()).f4330a);
        }
    }
}
