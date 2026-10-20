package ja;

import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f8550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f8551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f8552c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Long f8553d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Long f8554e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Long f8555f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Long f8556g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Map f8557h;

    public /* synthetic */ l(boolean z10, boolean z11, x xVar, Long l10, Long l11, Long l12, Long l13) {
        this(z10, z11, xVar, l10, l11, l12, l13, r8.s.f13662a);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.f8550a) {
            arrayList.add("isRegularFile");
        }
        if (this.f8551b) {
            arrayList.add("isDirectory");
        }
        Long l10 = this.f8553d;
        if (l10 != null) {
            arrayList.add("byteCount=" + l10);
        }
        Long l11 = this.f8554e;
        if (l11 != null) {
            arrayList.add("createdAt=" + l11);
        }
        Long l12 = this.f8555f;
        if (l12 != null) {
            arrayList.add("lastModifiedAt=" + l12);
        }
        Long l13 = this.f8556g;
        if (l13 != null) {
            arrayList.add("lastAccessedAt=" + l13);
        }
        Map map = this.f8557h;
        if (!map.isEmpty()) {
            arrayList.add("extras=" + map);
        }
        return r8.p.K0(arrayList, ", ", "FileMetadata(", ")", null, 56);
    }

    public l(boolean z10, boolean z11, x xVar, Long l10, Long l11, Long l12, Long l13, Map map) {
        d7.a.m(map, "extras");
        this.f8550a = z10;
        this.f8551b = z11;
        this.f8552c = xVar;
        this.f8553d = l10;
        this.f8554e = l11;
        this.f8555f = l12;
        this.f8556g = l13;
        this.f8557h = r8.v.G0(map);
    }
}
