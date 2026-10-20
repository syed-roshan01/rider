package m0;

/* JADX INFO: loaded from: classes.dex */
public interface e1 extends g1, l3 {
    @Override // m0.l3
    default Object getValue() {
        return Integer.valueOf(((u2) this).d());
    }

    @Override // m0.g1
    default void setValue(Object obj) {
        ((u2) this).f(((Number) obj).intValue());
    }
}
