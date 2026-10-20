package c1;

import java.util.LinkedHashSet;
import t.l0;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c9.c f2876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f2877b = new LinkedHashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f2878c = new LinkedHashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f2879d = new LinkedHashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l0 f2880e = new l0(this, 18);

    public d(u1.r rVar) {
        this.f2876a = rVar;
    }

    public final void a(LinkedHashSet linkedHashSet, Object obj) {
        if (linkedHashSet.add(obj)) {
            if (this.f2879d.size() + this.f2878c.size() + this.f2877b.size() == 1) {
                this.f2876a.invoke(this.f2880e);
            }
        }
    }
}
