package y1;

/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c9.e f16845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f16846c;

    public /* synthetic */ u(String str) {
        this(str, q.f16814t);
    }

    public final void a(v vVar, Object obj) {
        ((j) vVar).k(this, obj);
    }

    public final String toString() {
        return "AccessibilityKey: " + this.f16844a;
    }

    public u(String str, c9.e eVar) {
        this.f16844a = str;
        this.f16845b = eVar;
    }

    public u(String str, boolean z10, q qVar) {
        this(str, qVar);
        this.f16846c = z10;
    }
}
