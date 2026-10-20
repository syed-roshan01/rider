package m0;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f11441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f11442b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f11443c;

    public a(Object obj) {
        this.f11441a = obj;
        this.f11443c = obj;
    }

    @Override // m0.d
    public final void b(Object obj) {
        this.f11442b.add(this.f11443c);
        this.f11443c = obj;
    }

    @Override // m0.d
    public final void clear() {
        this.f11442b.clear();
        this.f11443c = this.f11441a;
        ((androidx.compose.ui.node.a) ((t1.w1) this).f11441a).K();
    }

    @Override // m0.d
    public final Object f() {
        return this.f11443c;
    }

    @Override // m0.d
    public final void h() {
        ArrayList arrayList = this.f11442b;
        if (!(!arrayList.isEmpty())) {
            throw new IllegalStateException("empty stack".toString());
        }
        this.f11443c = arrayList.remove(arrayList.size() - 1);
    }
}
