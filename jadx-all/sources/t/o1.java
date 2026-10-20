package t;

/* JADX INFO: loaded from: classes.dex */
public interface o1 {
    Object a();

    default boolean b(Object obj, Object obj2) {
        return d7.a.d(obj, a()) && d7.a.d(obj2, c());
    }

    Object c();
}
