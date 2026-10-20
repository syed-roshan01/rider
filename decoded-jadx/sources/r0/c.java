package r0;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class c extends b implements e9.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f13301c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f13302d;

    public c(i iVar, Object obj, Object obj2) {
        super(obj, obj2);
        this.f13301c = iVar;
        this.f13302d = obj2;
    }

    @Override // r0.b, java.util.Map.Entry
    public final Object getValue() {
        return this.f13302d;
    }

    @Override // r0.b, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.f13302d;
        this.f13302d = obj;
        g gVar = this.f13301c.f13320a;
        f fVar = gVar.f13315d;
        Object obj3 = this.f13299a;
        if (fVar.containsKey(obj3)) {
            boolean z10 = gVar.f13308c;
            if (!z10) {
                fVar.put(obj3, obj);
            } else {
                if (!z10) {
                    throw new NoSuchElementException();
                }
                s sVar = gVar.f13306a[gVar.f13307b];
                Object obj4 = sVar.f13333a[sVar.f13335c];
                fVar.put(obj3, obj);
                gVar.c(obj4 != null ? obj4.hashCode() : 0, fVar.f13311c, obj4, 0);
            }
            gVar.f13318n = fVar.f13313e;
        }
        return obj2;
    }
}
