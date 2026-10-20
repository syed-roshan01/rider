package b;

import u1.w;

/* JADX INFO: loaded from: classes.dex */
public final class f extends d9.j implements c9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f2304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2305c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i10, Object obj, boolean z10) {
        super(0);
        this.f2303a = i10;
        this.f2305c = obj;
        this.f2304b = z10;
    }

    @Override // c9.a
    public final /* bridge */ /* synthetic */ Object invoke() {
        q8.l lVar = q8.l.f13235a;
        switch (this.f2303a) {
            case 0:
                m944invoke();
                break;
            case 1:
                m944invoke();
                break;
            default:
                m944invoke();
                break;
        }
        return lVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(w wVar, boolean z10) {
        super(0);
        this.f2303a = 2;
        this.f2304b = z10;
        this.f2305c = wVar;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m944invoke() {
        int i10 = this.f2303a;
        Object obj = this.f2305c;
        boolean z10 = this.f2304b;
        switch (i10) {
            case 0:
                h hVar = (h) obj;
                hVar.f1428a = z10;
                c9.a aVar = hVar.f1430c;
                if (aVar != null) {
                    aVar.invoke();
                }
                break;
            case 1:
                ((c9.c) obj).invoke(Boolean.valueOf(!z10));
                break;
            default:
                w wVar = (w) obj;
                if (!z10) {
                    wVar.requestFocus();
                } else {
                    wVar.clearFocus();
                }
                break;
        }
    }
}
