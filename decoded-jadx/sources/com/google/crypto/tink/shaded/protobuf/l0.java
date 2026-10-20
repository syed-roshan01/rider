package com.google.crypto.tink.shaded.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class l0 extends n0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Class f3574c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    public static List d(long j10, Object obj, int i10) {
        List list;
        List listA;
        List list2 = (List) w1.f3633c.i(obj, j10);
        if (list2.isEmpty()) {
            if (list2 instanceof k0) {
                listA = new j0(i10);
            } else {
                listA = ((list2 instanceof f1) && (list2 instanceof e0)) ? ((e0) list2).a(i10) : new ArrayList(i10);
            }
            w1.v(obj, j10, listA);
            return listA;
        }
        if (f3574c.isAssignableFrom(list2.getClass())) {
            ArrayList arrayList = new ArrayList(list2.size() + i10);
            arrayList.addAll(list2);
            w1.v(obj, j10, arrayList);
            list = arrayList;
        } else {
            if (!(list2 instanceof r1)) {
                if (!(list2 instanceof f1) || !(list2 instanceof e0)) {
                    return list2;
                }
                e0 e0Var = (e0) list2;
                if (((c) e0Var).f3525a) {
                    return list2;
                }
                e0 e0VarA = e0Var.a(list2.size() + i10);
                w1.v(obj, j10, e0VarA);
                return e0VarA;
            }
            j0 j0Var = new j0(list2.size() + i10);
            j0Var.addAll((r1) list2);
            w1.v(obj, j10, j0Var);
            list = j0Var;
        }
        return list;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n0
    public final void a(Object obj, long j10) {
        Object objUnmodifiableList;
        List list = (List) w1.f3633c.i(obj, j10);
        if (list instanceof k0) {
            objUnmodifiableList = ((k0) list).b();
        } else {
            if (f3574c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof f1) && (list instanceof e0)) {
                c cVar = (c) ((e0) list);
                if (cVar.f3525a) {
                    cVar.f3525a = false;
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        w1.v(obj, j10, objUnmodifiableList);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n0
    public final void b(Object obj, long j10, Object obj2) {
        List list = (List) w1.f3633c.i(obj2, j10);
        List listD = d(j10, obj, list.size());
        int size = listD.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            listD.addAll(list);
        }
        if (size > 0) {
            list = listD;
        }
        w1.v(obj, j10, list);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n0
    public final List c(Object obj, long j10) {
        return d(j10, obj, 10);
    }
}
