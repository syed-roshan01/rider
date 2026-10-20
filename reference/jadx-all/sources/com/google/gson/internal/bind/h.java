package com.google.gson.internal.bind;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p7.a0;
import p7.q;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field f3992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f3993c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f3994d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f3995e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f3996f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Method f3997g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f3998h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ a0 f3999i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p7.n f4000j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ u7.a f4001k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f4002l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f4003m;

    public h(String str, Field field, boolean z10, boolean z11, boolean z12, Method method, boolean z13, a0 a0Var, p7.n nVar, u7.a aVar, boolean z14, boolean z15) {
        this.f3996f = z12;
        this.f3997g = method;
        this.f3998h = z13;
        this.f3999i = a0Var;
        this.f4000j = nVar;
        this.f4001k = aVar;
        this.f4002l = z14;
        this.f4003m = z15;
        this.f3991a = str;
        this.f3992b = field;
        this.f3993c = field.getName();
        this.f3994d = z10;
        this.f3995e = z11;
    }

    public final void a(v7.b bVar, Object obj) {
        Object objInvoke;
        if (this.f3994d) {
            boolean z10 = this.f3996f;
            Field field = this.f3992b;
            Method method = this.f3997g;
            if (z10) {
                if (method == null) {
                    ReflectiveTypeAdapterFactory.b(obj, field);
                } else {
                    ReflectiveTypeAdapterFactory.b(obj, method);
                }
            }
            if (method != null) {
                try {
                    objInvoke = method.invoke(obj, new Object[0]);
                } catch (InvocationTargetException e4) {
                    throw new q(l.q.k("Accessor ", t7.c.d(method, false), " threw exception"), e4.getCause());
                }
            } else {
                objInvoke = field.get(obj);
            }
            if (objInvoke == obj) {
                return;
            }
            bVar.q(this.f3991a);
            boolean z11 = this.f3998h;
            a0 mVar = this.f3999i;
            if (!z11) {
                mVar = new m(this.f4000j, mVar, this.f4001k.f15426b);
            }
            mVar.c(bVar, objInvoke);
        }
    }
}
