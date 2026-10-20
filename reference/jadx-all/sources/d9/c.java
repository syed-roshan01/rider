package d9;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public abstract class c implements j9.a, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public transient j9.a f4934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f4935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Class f4936c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f4937d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f4938e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f4939f;

    public c(Object obj, Class cls, String str, String str2, boolean z10) {
        this.f4935b = obj;
        this.f4936c = cls;
        this.f4937d = str;
        this.f4938e = str2;
        this.f4939f = z10;
    }

    public abstract j9.a a();

    public final d b() {
        Class cls = this.f4936c;
        if (cls == null) {
            return null;
        }
        if (!this.f4939f) {
            return v.a(cls);
        }
        v.f4953a.getClass();
        return new m(cls);
    }
}
