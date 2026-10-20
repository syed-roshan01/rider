package w;

import d9.r;

/* JADX INFO: loaded from: classes.dex */
public final class c extends d9.j implements c9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f15982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c9.c f15983c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(r rVar, c9.c cVar, int i10) {
        super(1);
        this.f15981a = i10;
        this.f15982b = rVar;
        this.f15983c = cVar;
    }

    public final void a(float f10) {
        int i10 = this.f15981a;
        c9.c cVar = this.f15983c;
        r rVar = this.f15982b;
        switch (i10) {
            case 0:
                float f11 = rVar.f4949a - f10;
                rVar.f4949a = f11;
                cVar.invoke(Float.valueOf(f11));
                break;
            default:
                float f12 = rVar.f4949a - f10;
                rVar.f4949a = f12;
                cVar.invoke(Float.valueOf(f12));
                break;
        }
    }

    @Override // c9.c
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        q8.l lVar = q8.l.f13235a;
        switch (this.f15981a) {
            case 0:
                a(((Number) obj).floatValue());
                break;
            default:
                a(((Number) obj).floatValue());
                break;
        }
        return lVar;
    }
}
