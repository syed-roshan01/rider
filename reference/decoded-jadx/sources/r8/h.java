package r8;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class h extends AbstractMap implements Map, e9.d {
    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return new r0.h((r0.f) this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return new r0.j((r0.f) this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return ((r0.f) this).f13314f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        return new r0.l((r0.f) this);
    }
}
