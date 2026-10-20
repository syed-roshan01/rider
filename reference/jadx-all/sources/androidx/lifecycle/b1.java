package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public interface b1 {
    default x0 create(Class cls) {
        d7.a.m(cls, "modelClass");
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    default x0 create(Class cls, q3.c cVar) {
        d7.a.m(cls, "modelClass");
        d7.a.m(cVar, "extras");
        return create(cls);
    }
}
