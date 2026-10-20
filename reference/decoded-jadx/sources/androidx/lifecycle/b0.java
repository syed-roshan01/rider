package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public abstract class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.fragment.app.w f2111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f2112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2113c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c0 f2114d;

    public b0(c0 c0Var, androidx.fragment.app.w wVar) {
        this.f2114d = c0Var;
        this.f2111a = wVar;
    }

    public final void a(boolean z10) {
        if (z10 == this.f2112b) {
            return;
        }
        this.f2112b = z10;
        int i10 = z10 ? 1 : -1;
        c0 c0Var = this.f2114d;
        int i11 = c0Var.f2120c;
        c0Var.f2120c = i10 + i11;
        if (!c0Var.f2121d) {
            c0Var.f2121d = true;
            while (true) {
                try {
                    int i12 = c0Var.f2120c;
                    if (i11 == i12) {
                        break;
                    } else {
                        i11 = i12;
                    }
                } catch (Throwable th) {
                    c0Var.f2121d = false;
                    throw th;
                }
            }
            c0Var.f2121d = false;
        }
        if (this.f2112b) {
            c0Var.c(this);
        }
    }
}
