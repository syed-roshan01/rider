package k9;

import java.util.Iterator;
import u1.z0;

/* JADX INFO: loaded from: classes.dex */
public final class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10643a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c9.c f10644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f10645c;

    public h(i iVar, c9.c cVar) {
        this.f10645c = iVar;
        this.f10644b = cVar;
    }

    @Override // k9.i
    public final Iterator iterator() {
        switch (this.f10643a) {
            case 0:
                return new g(this);
            default:
                return new o(this);
        }
    }

    public h(z0 z0Var, c9.c cVar) {
        this.f10645c = z0Var;
        this.f10644b = cVar;
    }
}
