package s4;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.drawable.Drawable;
import java.util.Arrays;
import java.util.List;
import m9.z;

/* JADX INFO: loaded from: classes.dex */
public final class j {
    public final androidx.lifecycle.r A;
    public final t4.g B;
    public final t4.e C;
    public final o D;
    public final q4.c E;
    public final Integer F;
    public final Drawable G;
    public final Integer H;
    public final Drawable I;
    public final Integer J;
    public final Drawable K;
    public final d L;
    public final c M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f13995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f13996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u4.a f13997c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f13998d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q4.c f13999e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f14000f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Bitmap.Config f14001g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ColorSpace f14002h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t4.d f14003i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final q8.f f14004j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final k4.c f14005k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List f14006l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final v4.b f14007m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final x9.q f14008n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final r f14009o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f14010p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f14011q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f14012r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f14013s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final b f14014t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final b f14015u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final b f14016v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final z f14017w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final z f14018x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final z f14019y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final z f14020z;

    public j(Context context, Object obj, u4.a aVar, i iVar, q4.c cVar, String str, Bitmap.Config config, ColorSpace colorSpace, t4.d dVar, q8.f fVar, k4.c cVar2, List list, v4.b bVar, x9.q qVar, r rVar, boolean z10, boolean z11, boolean z12, boolean z13, b bVar2, b bVar3, b bVar4, z zVar, z zVar2, z zVar3, z zVar4, androidx.lifecycle.r rVar2, t4.g gVar, t4.e eVar, o oVar, q4.c cVar3, Integer num, Drawable drawable, Integer num2, Drawable drawable2, Integer num3, Drawable drawable3, d dVar2, c cVar4) {
        this.f13995a = context;
        this.f13996b = obj;
        this.f13997c = aVar;
        this.f13998d = iVar;
        this.f13999e = cVar;
        this.f14000f = str;
        this.f14001g = config;
        this.f14002h = colorSpace;
        this.f14003i = dVar;
        this.f14004j = fVar;
        this.f14005k = cVar2;
        this.f14006l = list;
        this.f14007m = bVar;
        this.f14008n = qVar;
        this.f14009o = rVar;
        this.f14010p = z10;
        this.f14011q = z11;
        this.f14012r = z12;
        this.f14013s = z13;
        this.f14014t = bVar2;
        this.f14015u = bVar3;
        this.f14016v = bVar4;
        this.f14017w = zVar;
        this.f14018x = zVar2;
        this.f14019y = zVar3;
        this.f14020z = zVar4;
        this.A = rVar2;
        this.B = gVar;
        this.C = eVar;
        this.D = oVar;
        this.E = cVar3;
        this.F = num;
        this.G = drawable;
        this.H = num2;
        this.I = drawable2;
        this.J = num3;
        this.K = drawable3;
        this.L = dVar2;
        this.M = cVar4;
    }

    public static h a(j jVar) {
        Context context = jVar.f13995a;
        jVar.getClass();
        return new h(jVar, context);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (d7.a.d(this.f13995a, jVar.f13995a) && d7.a.d(this.f13996b, jVar.f13996b) && d7.a.d(this.f13997c, jVar.f13997c) && d7.a.d(this.f13998d, jVar.f13998d) && d7.a.d(this.f13999e, jVar.f13999e) && d7.a.d(this.f14000f, jVar.f14000f) && this.f14001g == jVar.f14001g && d7.a.d(this.f14002h, jVar.f14002h) && this.f14003i == jVar.f14003i && d7.a.d(this.f14004j, jVar.f14004j) && d7.a.d(this.f14005k, jVar.f14005k) && d7.a.d(this.f14006l, jVar.f14006l) && d7.a.d(this.f14007m, jVar.f14007m) && d7.a.d(this.f14008n, jVar.f14008n) && d7.a.d(this.f14009o, jVar.f14009o) && this.f14010p == jVar.f14010p && this.f14011q == jVar.f14011q && this.f14012r == jVar.f14012r && this.f14013s == jVar.f14013s && this.f14014t == jVar.f14014t && this.f14015u == jVar.f14015u && this.f14016v == jVar.f14016v && d7.a.d(this.f14017w, jVar.f14017w) && d7.a.d(this.f14018x, jVar.f14018x) && d7.a.d(this.f14019y, jVar.f14019y) && d7.a.d(this.f14020z, jVar.f14020z) && d7.a.d(this.E, jVar.E) && d7.a.d(this.F, jVar.F) && d7.a.d(this.G, jVar.G) && d7.a.d(this.H, jVar.H) && d7.a.d(this.I, jVar.I) && d7.a.d(this.J, jVar.J) && d7.a.d(this.K, jVar.K) && d7.a.d(this.A, jVar.A) && d7.a.d(this.B, jVar.B) && this.C == jVar.C && d7.a.d(this.D, jVar.D) && d7.a.d(this.L, jVar.L) && d7.a.d(this.M, jVar.M)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f13996b.hashCode() + (this.f13995a.hashCode() * 31)) * 31;
        u4.a aVar = this.f13997c;
        int iHashCode2 = (iHashCode + (aVar != null ? aVar.hashCode() : 0)) * 31;
        i iVar = this.f13998d;
        int iHashCode3 = (iHashCode2 + (iVar != null ? iVar.hashCode() : 0)) * 31;
        q4.c cVar = this.f13999e;
        int iHashCode4 = (iHashCode3 + (cVar != null ? cVar.hashCode() : 0)) * 31;
        String str = this.f14000f;
        int iHashCode5 = (this.f14001g.hashCode() + ((iHashCode4 + (str != null ? str.hashCode() : 0)) * 31)) * 31;
        ColorSpace colorSpace = this.f14002h;
        int iHashCode6 = (this.f14003i.hashCode() + ((iHashCode5 + (colorSpace != null ? colorSpace.hashCode() : 0)) * 31)) * 31;
        q8.f fVar = this.f14004j;
        int iHashCode7 = (this.f14006l.hashCode() + ((((iHashCode6 + (fVar != null ? fVar.hashCode() : 0)) * 31) + (this.f14005k != null ? k4.c.class.hashCode() : 0)) * 31)) * 31;
        ((v4.a) this.f14007m).getClass();
        int iHashCode8 = (this.D.f14038a.hashCode() + ((this.C.hashCode() + ((this.B.hashCode() + ((this.A.hashCode() + ((this.f14020z.hashCode() + ((this.f14019y.hashCode() + ((this.f14018x.hashCode() + ((this.f14017w.hashCode() + ((this.f14016v.hashCode() + ((this.f14015u.hashCode() + ((this.f14014t.hashCode() + l.q.c(this.f14013s, l.q.c(this.f14012r, l.q.c(this.f14011q, l.q.c(this.f14010p, (this.f14009o.f14047a.hashCode() + ((((v4.a.class.hashCode() + iHashCode7) * 31) + Arrays.hashCode(this.f14008n.f16445a)) * 31)) * 31, 31), 31), 31), 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        q4.c cVar2 = this.E;
        int iHashCode9 = (iHashCode8 + (cVar2 != null ? cVar2.hashCode() : 0)) * 31;
        Integer num = this.F;
        int iHashCode10 = (iHashCode9 + (num != null ? num.hashCode() : 0)) * 31;
        Drawable drawable = this.G;
        int iHashCode11 = (iHashCode10 + (drawable != null ? drawable.hashCode() : 0)) * 31;
        Integer num2 = this.H;
        int iHashCode12 = (iHashCode11 + (num2 != null ? num2.hashCode() : 0)) * 31;
        Drawable drawable2 = this.I;
        int iHashCode13 = (iHashCode12 + (drawable2 != null ? drawable2.hashCode() : 0)) * 31;
        Integer num3 = this.J;
        int iHashCode14 = (iHashCode13 + (num3 != null ? num3.hashCode() : 0)) * 31;
        Drawable drawable3 = this.K;
        return this.M.hashCode() + ((this.L.hashCode() + ((iHashCode14 + (drawable3 != null ? drawable3.hashCode() : 0)) * 31)) * 31);
    }
}
