package r7;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class m extends AbstractSet {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f13617b;

    public /* synthetic */ m(p pVar, int i10) {
        this.f13616a = i10;
        this.f13617b = pVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        int i10 = this.f13616a;
        p pVar = this.f13617b;
        switch (i10) {
            case 0:
                pVar.clear();
                break;
            default:
                pVar.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        o oVarA;
        int i10 = this.f13616a;
        p pVar = this.f13617b;
        switch (i10) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                pVar.getClass();
                Object key = entry.getKey();
                o oVar = null;
                if (key != null) {
                    try {
                        oVarA = pVar.a(key, false);
                    } catch (ClassCastException unused) {
                        oVarA = null;
                    }
                    break;
                } else {
                    oVarA = null;
                }
                if (oVarA != null && Objects.equals(oVarA.f13629o, entry.getValue())) {
                    oVar = oVarA;
                }
                return oVar != null;
            default:
                return pVar.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f13616a) {
            case 0:
                return new l(this);
            default:
                return new l(this, 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        o oVarA;
        o oVarA2 = null;
        int i10 = this.f13616a;
        p pVar = this.f13617b;
        switch (i10) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                pVar.getClass();
                Object key = entry.getKey();
                if (key != null) {
                    try {
                        oVarA = pVar.a(key, false);
                    } catch (ClassCastException unused) {
                        oVarA = null;
                    }
                    break;
                } else {
                    oVarA = null;
                }
                if (oVarA != null && Objects.equals(oVarA.f13629o, entry.getValue())) {
                    oVarA2 = oVarA;
                }
                if (oVarA2 == null) {
                    return false;
                }
                pVar.c(oVarA2, true);
                return true;
            default:
                pVar.getClass();
                if (obj != null) {
                    try {
                        oVarA2 = pVar.a(obj, false);
                        break;
                    } catch (ClassCastException unused2) {
                    }
                }
                if (oVarA2 != null) {
                    pVar.c(oVarA2, true);
                }
                return oVarA2 != null;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i10 = this.f13616a;
        p pVar = this.f13617b;
        switch (i10) {
            case 0:
                break;
        }
        return pVar.f13635d;
    }
}
