package l5;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class v implements n5.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p8.a f11375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p8.a f11376c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p8.a f11377d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p8.a f11378e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p8.a f11379f;

    public /* synthetic */ v(p8.a aVar, p8.a aVar2, n5.b bVar, p8.a aVar3, p8.a aVar4, int i10) {
        this.f11374a = i10;
        this.f11375b = aVar;
        this.f11376c = aVar2;
        this.f11377d = bVar;
        this.f11378e = aVar3;
        this.f11379f = aVar4;
    }

    @Override // p8.a
    public final Object get() {
        int i10 = this.f11374a;
        p8.a aVar = this.f11379f;
        p8.a aVar2 = this.f11378e;
        p8.a aVar3 = this.f11377d;
        p8.a aVar4 = this.f11376c;
        p8.a aVar5 = this.f11375b;
        switch (i10) {
            case 0:
                return new u((t5.a) aVar5.get(), (t5.a) aVar4.get(), (p5.d) aVar3.get(), (q5.i) aVar2.get(), (q5.k) aVar.get());
            case 1:
                return new p5.c((Executor) aVar5.get(), (m5.f) aVar4.get(), (q5.l) aVar3.get(), (r5.d) aVar2.get(), (s5.c) aVar.get());
            default:
                t5.a aVar6 = (t5.a) aVar5.get();
                t5.a aVar7 = (t5.a) aVar4.get();
                Object obj = aVar3.get();
                return new r5.m(aVar6, aVar7, (r5.a) obj, (r5.p) aVar2.get(), this.f11379f);
        }
    }
}
