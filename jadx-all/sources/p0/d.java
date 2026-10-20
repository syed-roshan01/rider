package p0;

import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public interface d extends b, Collection, e9.a {
    @Override // java.util.List
    d add(int i10, Object obj);

    @Override // java.util.List, java.util.Collection
    d add(Object obj);

    @Override // java.util.List, java.util.Collection
    d addAll(Collection collection);

    q0.f builder();

    d h(q0.b bVar);

    d m(int i10);

    @Override // java.util.List
    d set(int i10, Object obj);
}
