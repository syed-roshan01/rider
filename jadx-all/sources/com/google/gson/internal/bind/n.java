package com.google.gson.internal.bind;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;
import p7.a0;
import p7.q;

/* JADX INFO: loaded from: classes.dex */
public final class n extends a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4014a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f4015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f4016c;

    public n(TypeAdapters$34 typeAdapters$34, Class cls) {
        this.f4016c = typeAdapters$34;
        this.f4015b = cls;
    }

    @Override // p7.a0
    public final Object b(v7.a aVar) {
        int i10 = this.f4014a;
        Object obj = this.f4015b;
        Object obj2 = this.f4016c;
        switch (i10) {
            case 0:
                Object objB = ((TypeAdapters$34) obj2).f3971b.b(aVar);
                if (objB != null) {
                    Class cls = (Class) obj;
                    if (!cls.isInstance(objB)) {
                        throw new q("Expected a " + cls.getName() + " but was " + objB.getClass().getName() + "; at path " + aVar.u(true));
                    }
                }
                return objB;
            default:
                if (aVar.k0() == 9) {
                    aVar.g0();
                    return null;
                }
                Collection collection = (Collection) ((r7.q) obj2).e();
                aVar.a();
                while (aVar.M()) {
                    collection.add(((a0) obj).b(aVar));
                }
                aVar.g();
                return collection;
        }
    }

    @Override // p7.a0
    public final void c(v7.b bVar, Object obj) throws IOException {
        switch (this.f4014a) {
            case 0:
                ((TypeAdapters$34) this.f4016c).f3971b.c(bVar, obj);
                break;
            default:
                Collection collection = (Collection) obj;
                if (collection != null) {
                    bVar.b();
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        ((a0) this.f4015b).c(bVar, it.next());
                    }
                    bVar.g();
                } else {
                    bVar.M();
                }
                break;
        }
    }

    public n(p7.n nVar, Type type, a0 a0Var, r7.q qVar) {
        this.f4015b = new m(nVar, a0Var, type);
        this.f4016c = qVar;
    }
}
