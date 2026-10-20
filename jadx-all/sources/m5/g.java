package m5;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class g implements n5.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p8.a f11879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p8.a f11880b;

    public g(n5.c cVar, e eVar) {
        this.f11879a = cVar;
        this.f11880b = eVar;
    }

    @Override // p8.a
    public final Object get() {
        return new f((Context) this.f11879a.get(), (d) this.f11880b.get());
    }
}
