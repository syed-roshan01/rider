package s0;

import java.util.Iterator;
import p0.g;
import r0.d;
import r8.j;

/* JADX INFO: loaded from: classes.dex */
public final class b extends j implements g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f13898d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f13899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f13900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f13901c;

    static {
        t0.b bVar = t0.b.f14367a;
        d dVar = d.f13303c;
        d7.a.k(dVar, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf>");
        f13898d = new b(bVar, bVar, dVar);
    }

    public b(Object obj, Object obj2, d dVar) {
        this.f13899a = obj;
        this.f13900b = obj2;
        this.f13901c = dVar;
    }

    @Override // r8.a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f13901c.containsKey(obj);
    }

    @Override // r8.a
    public final int e() {
        d dVar = this.f13901c;
        dVar.getClass();
        return dVar.f13305b;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new c(this.f13899a, this.f13901c);
    }
}
