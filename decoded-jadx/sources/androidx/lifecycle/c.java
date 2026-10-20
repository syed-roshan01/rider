package androidx.lifecycle;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Method f2116b;

    public c(int i10, Method method) {
        this.f2115a = i10;
        this.f2116b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f2115a == cVar.f2115a && this.f2116b.getName().equals(cVar.f2116b.getName());
    }

    public final int hashCode() {
        return this.f2116b.getName().hashCode() + (this.f2115a * 31);
    }
}
