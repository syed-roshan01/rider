package y0;

/* JADX INFO: loaded from: classes.dex */
public interface m extends o {
    @Override // y0.o
    default boolean c(c9.c cVar) {
        return ((Boolean) cVar.invoke(this)).booleanValue();
    }

    @Override // y0.o
    default Object e(Object obj, c9.e eVar) {
        return eVar.invoke(obj, this);
    }
}
