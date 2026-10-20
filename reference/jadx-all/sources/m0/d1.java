package m0;

/* JADX INFO: loaded from: classes.dex */
public interface d1 extends g1, l3 {
    @Override // m0.l3
    default Object getValue() {
        return Float.valueOf(((s2) this).d());
    }

    @Override // m0.g1
    default void setValue(Object obj) {
        ((s2) this).f(((Number) obj).floatValue());
    }
}
