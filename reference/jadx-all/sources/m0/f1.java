package m0;

/* JADX INFO: loaded from: classes.dex */
public interface f1 extends g1, l3 {
    @Override // m0.l3
    default Object getValue() {
        return Long.valueOf(((w2) this).d());
    }

    @Override // m0.g1
    default void setValue(Object obj) {
        ((w2) this).f(((Number) obj).longValue());
    }
}
