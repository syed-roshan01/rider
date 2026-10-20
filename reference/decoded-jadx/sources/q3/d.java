package q3;

/* JADX INFO: loaded from: classes.dex */
public final class d extends c {
    public d() {
        this(a.f13124b);
    }

    @Override // q3.c
    public final Object a(b bVar) {
        d7.a.m(bVar, "key");
        return this.f13125a.get(bVar);
    }

    public final void b(b bVar, Object obj) {
        this.f13125a.put(bVar, obj);
    }

    public d(c cVar) {
        d7.a.m(cVar, "initialExtras");
        this.f13125a.putAll(cVar.f13125a);
    }
}
