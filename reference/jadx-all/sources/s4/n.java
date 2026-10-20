package s4;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f14022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bitmap.Config f14023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ColorSpace f14024c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t4.f f14025d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t4.e f14026e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f14027f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f14028g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f14029h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f14030i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final x9.q f14031j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final r f14032k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final o f14033l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final b f14034m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final b f14035n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final b f14036o;

    public n(Context context, Bitmap.Config config, ColorSpace colorSpace, t4.f fVar, t4.e eVar, boolean z10, boolean z11, boolean z12, String str, x9.q qVar, r rVar, o oVar, b bVar, b bVar2, b bVar3) {
        this.f14022a = context;
        this.f14023b = config;
        this.f14024c = colorSpace;
        this.f14025d = fVar;
        this.f14026e = eVar;
        this.f14027f = z10;
        this.f14028g = z11;
        this.f14029h = z12;
        this.f14030i = str;
        this.f14031j = qVar;
        this.f14032k = rVar;
        this.f14033l = oVar;
        this.f14034m = bVar;
        this.f14035n = bVar2;
        this.f14036o = bVar3;
    }

    public static n a(n nVar, Bitmap.Config config) {
        Context context = nVar.f14022a;
        ColorSpace colorSpace = nVar.f14024c;
        t4.f fVar = nVar.f14025d;
        t4.e eVar = nVar.f14026e;
        boolean z10 = nVar.f14027f;
        boolean z11 = nVar.f14028g;
        boolean z12 = nVar.f14029h;
        String str = nVar.f14030i;
        x9.q qVar = nVar.f14031j;
        r rVar = nVar.f14032k;
        o oVar = nVar.f14033l;
        b bVar = nVar.f14034m;
        b bVar2 = nVar.f14035n;
        b bVar3 = nVar.f14036o;
        nVar.getClass();
        return new n(context, config, colorSpace, fVar, eVar, z10, z11, z12, str, qVar, rVar, oVar, bVar, bVar2, bVar3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (d7.a.d(this.f14022a, nVar.f14022a) && this.f14023b == nVar.f14023b && d7.a.d(this.f14024c, nVar.f14024c) && d7.a.d(this.f14025d, nVar.f14025d) && this.f14026e == nVar.f14026e && this.f14027f == nVar.f14027f && this.f14028g == nVar.f14028g && this.f14029h == nVar.f14029h && d7.a.d(this.f14030i, nVar.f14030i) && d7.a.d(this.f14031j, nVar.f14031j) && d7.a.d(this.f14032k, nVar.f14032k) && d7.a.d(this.f14033l, nVar.f14033l) && this.f14034m == nVar.f14034m && this.f14035n == nVar.f14035n && this.f14036o == nVar.f14036o) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f14023b.hashCode() + (this.f14022a.hashCode() * 31)) * 31;
        ColorSpace colorSpace = this.f14024c;
        int iC = l.q.c(this.f14029h, l.q.c(this.f14028g, l.q.c(this.f14027f, (this.f14026e.hashCode() + ((this.f14025d.hashCode() + ((iHashCode + (colorSpace != null ? colorSpace.hashCode() : 0)) * 31)) * 31)) * 31, 31), 31), 31);
        String str = this.f14030i;
        return this.f14036o.hashCode() + ((this.f14035n.hashCode() + ((this.f14034m.hashCode() + ((this.f14033l.f14038a.hashCode() + ((this.f14032k.f14047a.hashCode() + ((((iC + (str != null ? str.hashCode() : 0)) * 31) + Arrays.hashCode(this.f14031j.f16445a)) * 31)) * 31)) * 31)) * 31)) * 31);
    }
}
