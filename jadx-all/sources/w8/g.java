package w8;

import u8.j;
import u8.k;

/* JADX INFO: loaded from: classes.dex */
public abstract class g extends a {
    public g(u8.e eVar) {
        super(eVar);
        if (eVar != null && eVar.getContext() != k.f15438a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
        }
    }

    @Override // u8.e
    public final j getContext() {
        return k.f15438a;
    }
}
