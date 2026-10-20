package u0;

import m0.l3;
import m0.r1;
import m0.z;
import r0.r;

/* JADX INFO: loaded from: classes.dex */
public final class e extends r0.d implements r1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f15008d = new e(r.f13328e, 0);

    @Override // r0.d
    /* JADX INFO: renamed from: a */
    public final r0.f builder() {
        d dVar = new d(this);
        dVar.f15007n = this;
        return dVar;
    }

    @Override // r0.d, p0.f
    public final p0.e builder() {
        d dVar = new d(this);
        dVar.f15007n = this;
        return dVar;
    }

    @Override // r0.d, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof z) {
            return super.containsKey((z) obj);
        }
        return false;
    }

    @Override // r8.e, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof l3) {
            return super.containsValue((l3) obj);
        }
        return false;
    }

    @Override // r0.d, java.util.Map
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
}
