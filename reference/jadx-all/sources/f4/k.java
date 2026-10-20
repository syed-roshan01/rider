package f4;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class k extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f6181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f6182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6183c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f6184d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f6185e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ArrayList f6186f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ m f6187g;

    public k(m mVar, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.f6187g = mVar;
        this.f6181a = obj;
        this.f6182b = arrayList;
        this.f6185e = obj2;
        this.f6186f = arrayList2;
    }

    @Override // f4.r, f4.p
    public final void a(q qVar) {
        m mVar = this.f6187g;
        Object obj = this.f6181a;
        if (obj != null) {
            mVar.s(obj, this.f6182b, null);
        }
        Object obj2 = this.f6183c;
        if (obj2 != null) {
            mVar.s(obj2, this.f6184d, null);
        }
        Object obj3 = this.f6185e;
        if (obj3 != null) {
            mVar.s(obj3, this.f6186f, null);
        }
    }

    @Override // f4.p
    public final void c(q qVar) {
        qVar.w(this);
    }
}
