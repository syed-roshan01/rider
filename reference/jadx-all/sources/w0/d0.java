package w0;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class d0 implements Map.Entry, e9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f16052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f16053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e0 f16054c;

    public d0(e0 e0Var) {
        this.f16054c = e0Var;
        Map.Entry entry = e0Var.f16061d;
        d7.a.j(entry);
        this.f16052a = entry.getKey();
        Map.Entry entry2 = e0Var.f16061d;
        d7.a.j(entry2);
        this.f16053b = entry2.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f16052a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f16053b;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        e0 e0Var = this.f16054c;
        if (e0Var.f16058a.a().f16127d != e0Var.f16060c) {
            throw new ConcurrentModificationException();
        }
        Object obj2 = this.f16053b;
        e0Var.f16058a.put(this.f16052a, obj);
        this.f16053b = obj;
        return obj2;
    }
}
