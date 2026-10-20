package i4;

import java.util.ArrayList;
import r8.p;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f8018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f8019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f8020c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f8021d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f8022e;

    public b(c cVar) {
        this.f8018a = p.Y0(cVar.f8023a);
        this.f8019b = p.Y0(cVar.f8024b);
        this.f8020c = p.Y0(cVar.f8025c);
        this.f8021d = p.Y0(cVar.f8026d);
        this.f8022e = p.Y0(cVar.f8027e);
    }

    public final void a(m4.f fVar, Class cls) {
        this.f8021d.add(new q8.f(fVar, cls));
    }

    public final void b(p4.a aVar, Class cls) {
        this.f8019b.add(new q8.f(aVar, cls));
    }
}
