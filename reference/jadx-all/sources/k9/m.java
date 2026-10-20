package k9;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class m implements Iterable, e9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f10649a;

    public m(l9.c cVar) {
        this.f10649a = cVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f10649a.iterator();
    }
}
