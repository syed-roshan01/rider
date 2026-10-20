package p5;

import android.content.Context;
import java.util.concurrent.Executor;
import q5.k;
import q5.l;

/* JADX INFO: loaded from: classes.dex */
public final class f implements n5.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p8.a f12784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p8.a f12785c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p8.a f12786d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p8.a f12787e;

    public /* synthetic */ f(p8.a aVar, p8.a aVar2, n5.b bVar, p8.a aVar3, int i10) {
        this.f12783a = i10;
        this.f12784b = aVar;
        this.f12785c = aVar2;
        this.f12786d = bVar;
        this.f12787e = aVar3;
    }

    @Override // p8.a
    public final Object get() {
        int i10 = this.f12783a;
        p8.a aVar = this.f12787e;
        p8.a aVar2 = this.f12786d;
        p8.a aVar3 = this.f12785c;
        p8.a aVar4 = this.f12784b;
        switch (i10) {
            case 0:
                Context context = (Context) aVar4.get();
                r5.d dVar = (r5.d) aVar3.get();
                q5.a aVar5 = (q5.a) aVar2.get();
                return new q5.c(context, dVar, aVar5);
            default:
                return new k((Executor) aVar4.get(), (r5.d) aVar3.get(), (l) aVar2.get(), (s5.c) aVar.get());
        }
    }
}
