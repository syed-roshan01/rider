package u0;

import m0.l3;
import m0.z;
import r0.r;

/* JADX INFO: loaded from: classes.dex */
public final class d extends r0.f {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public e f15007n;

    @Override // r0.f, p0.e
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final e build() {
        r rVar = this.f13311c;
        e eVar = this.f15007n;
        if (rVar != eVar.f13304a) {
            this.f13310b = new t0.b();
            eVar = new e(this.f13311c, this.f13314f);
        }
        this.f15007n = eVar;
        return eVar;
    }

    @Override // r0.f, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof z) {
            return super.containsKey((z) obj);
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof l3) {
            return super.containsValue((l3) obj);
        }
        return false;
    }

    @Override // r0.f, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof z) {
            return (l3) super.get((z) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof z) ? obj2 : (l3) super.getOrDefault((z) obj, (l3) obj2);
    }

    @Override // r0.f, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (obj instanceof z) {
            return (l3) super.remove((z) obj);
        }
        return null;
    }
}
