package k9;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class f implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f10637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f10638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c9.c f10639c;

    public f(h hVar) {
        n nVar = n.f10650a;
        this.f10637a = hVar;
        this.f10638b = false;
        this.f10639c = nVar;
    }

    @Override // k9.i
    public final Iterator iterator() {
        return new e(this);
    }
}
