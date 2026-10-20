package com.google.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class f1 extends h1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Class f4106c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    public static List d(long j10, Object obj, int i10) {
        List list;
        List listA;
        List list2 = (List) z2.f4286c.k(obj, j10);
        if (list2.isEmpty()) {
            if (list2 instanceof e1) {
                listA = new d1(i10);
            } else {
                listA = ((list2 instanceof c2) && (list2 instanceof x0)) ? ((x0) list2).a(i10) : new ArrayList(i10);
            }
            z2.v(obj, j10, listA);
            return listA;
        }
        if (f4106c.isAssignableFrom(list2.getClass())) {
            ArrayList arrayList = new ArrayList(list2.size() + i10);
            arrayList.addAll(list2);
            z2.v(obj, j10, arrayList);
            list = arrayList;
        } else {
            if (!(list2 instanceof u2)) {
                if (!(list2 instanceof c2) || !(list2 instanceof x0)) {
                    return list2;
                }
                x0 x0Var = (x0) list2;
                if (((d) x0Var).f4087a) {
                    return list2;
                }
                x0 x0VarA = x0Var.a(list2.size() + i10);
                z2.v(obj, j10, x0VarA);
                return x0VarA;
            }
            d1 d1Var = new d1(list2.size() + i10);
            d1Var.addAll((u2) list2);
            z2.v(obj, j10, d1Var);
            list = d1Var;
        }
        return list;
    }

    @Override // com.google.protobuf.h1
    public final void a(Object obj, long j10) {
        Object objUnmodifiableList;
        List list = (List) z2.f4286c.k(obj, j10);
        if (list instanceof e1) {
            objUnmodifiableList = ((e1) list).b();
        } else {
            if (f4106c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof c2) && (list instanceof x0)) {
                d dVar = (d) ((x0) list);
                if (dVar.f4087a) {
                    dVar.f4087a = false;
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        z2.v(obj, j10, objUnmodifiableList);
    }

    @Override // com.google.protobuf.h1
    public final void b(Object obj, long j10, Object obj2) {
        List list = (List) z2.f4286c.k(obj2, j10);
        List listD = d(j10, obj, list.size());
        int size = listD.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            listD.addAll(list);
        }
        if (size > 0) {
            list = listD;
        }
        z2.v(obj, j10, list);
    }

    @Override // com.google.protobuf.h1
    public final List c(Object obj, long j10) {
        return d(j10, obj, 10);
    }
}
