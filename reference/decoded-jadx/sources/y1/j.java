package y1;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class j implements v, Iterable, e9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f16786a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f16787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f16788c;

    public final Object e(u uVar) {
        Object obj = this.f16786a.get(uVar);
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException("Key not present: " + uVar + " - consider getOrElse or getOrNull");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return d7.a.d(this.f16786a, jVar.f16786a) && this.f16787b == jVar.f16787b && this.f16788c == jVar.f16788c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f16788c) + l.q.c(this.f16787b, this.f16786a.hashCode() * 31, 31);
    }

    public final Object i(u uVar, c9.a aVar) {
        Object obj = this.f16786a.get(uVar);
        return obj == null ? aVar.invoke() : obj;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f16786a.entrySet().iterator();
    }

    public final void k(u uVar, Object obj) {
        boolean z10 = obj instanceof a;
        LinkedHashMap linkedHashMap = this.f16786a;
        if (!z10 || !linkedHashMap.containsKey(uVar)) {
            linkedHashMap.put(uVar, obj);
            return;
        }
        Object obj2 = linkedHashMap.get(uVar);
        d7.a.k(obj2, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
        a aVar = (a) obj2;
        a aVar2 = (a) obj;
        String str = aVar2.f16745a;
        if (str == null) {
            str = aVar.f16745a;
        }
        q8.a aVar3 = aVar2.f16746b;
        if (aVar3 == null) {
            aVar3 = aVar.f16746b;
        }
        linkedHashMap.put(uVar, new a(str, aVar3));
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.f16787b) {
            sb.append("mergeDescendants=true");
            str = ", ";
        } else {
            str = "";
        }
        if (this.f16788c) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = ", ";
        }
        for (Map.Entry entry : this.f16786a.entrySet()) {
            u uVar = (u) entry.getKey();
            Object value = entry.getValue();
            sb.append(str);
            sb.append(uVar.f16844a);
            sb.append(" : ");
            sb.append(value);
            str = ", ";
        }
        return i1.b.I(this) + "{ " + ((Object) sb) + " }";
    }
}
