package s4;

import android.graphics.Bitmap;
import m9.z;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.lifecycle.r f13949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t4.g f13950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t4.e f13951c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z f13952d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final z f13953e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final z f13954f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final z f13955g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final v4.b f13956h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t4.d f13957i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Bitmap.Config f13958j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Boolean f13959k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Boolean f13960l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final b f13961m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final b f13962n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final b f13963o;

    public d(androidx.lifecycle.r rVar, t4.g gVar, t4.e eVar, z zVar, z zVar2, z zVar3, z zVar4, v4.b bVar, t4.d dVar, Bitmap.Config config, Boolean bool, Boolean bool2, b bVar2, b bVar3, b bVar4) {
        this.f13949a = rVar;
        this.f13950b = gVar;
        this.f13951c = eVar;
        this.f13952d = zVar;
        this.f13953e = zVar2;
        this.f13954f = zVar3;
        this.f13955g = zVar4;
        this.f13956h = bVar;
        this.f13957i = dVar;
        this.f13958j = config;
        this.f13959k = bool;
        this.f13960l = bool2;
        this.f13961m = bVar2;
        this.f13962n = bVar3;
        this.f13963o = bVar4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (d7.a.d(this.f13949a, dVar.f13949a) && d7.a.d(this.f13950b, dVar.f13950b) && this.f13951c == dVar.f13951c && d7.a.d(this.f13952d, dVar.f13952d) && d7.a.d(this.f13953e, dVar.f13953e) && d7.a.d(this.f13954f, dVar.f13954f) && d7.a.d(this.f13955g, dVar.f13955g) && d7.a.d(this.f13956h, dVar.f13956h) && this.f13957i == dVar.f13957i && this.f13958j == dVar.f13958j && d7.a.d(this.f13959k, dVar.f13959k) && d7.a.d(this.f13960l, dVar.f13960l) && this.f13961m == dVar.f13961m && this.f13962n == dVar.f13962n && this.f13963o == dVar.f13963o) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        androidx.lifecycle.r rVar = this.f13949a;
        int iHashCode = (rVar != null ? rVar.hashCode() : 0) * 31;
        t4.g gVar = this.f13950b;
        int iHashCode2 = (iHashCode + (gVar != null ? gVar.hashCode() : 0)) * 31;
        t4.e eVar = this.f13951c;
        int iHashCode3 = (iHashCode2 + (eVar != null ? eVar.hashCode() : 0)) * 31;
        z zVar = this.f13952d;
        int iHashCode4 = (iHashCode3 + (zVar != null ? zVar.hashCode() : 0)) * 31;
        z zVar2 = this.f13953e;
        int iHashCode5 = (iHashCode4 + (zVar2 != null ? zVar2.hashCode() : 0)) * 31;
        z zVar3 = this.f13954f;
        int iHashCode6 = (iHashCode5 + (zVar3 != null ? zVar3.hashCode() : 0)) * 31;
        z zVar4 = this.f13955g;
        int iHashCode7 = (((iHashCode6 + (zVar4 != null ? zVar4.hashCode() : 0)) * 31) + (this.f13956h != null ? v4.a.class.hashCode() : 0)) * 31;
        t4.d dVar = this.f13957i;
        int iHashCode8 = (iHashCode7 + (dVar != null ? dVar.hashCode() : 0)) * 31;
        Bitmap.Config config = this.f13958j;
        int iHashCode9 = (iHashCode8 + (config != null ? config.hashCode() : 0)) * 31;
        Boolean bool = this.f13959k;
        int iHashCode10 = (iHashCode9 + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.f13960l;
        int iHashCode11 = (iHashCode10 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        b bVar = this.f13961m;
        int iHashCode12 = (iHashCode11 + (bVar != null ? bVar.hashCode() : 0)) * 31;
        b bVar2 = this.f13962n;
        int iHashCode13 = (iHashCode12 + (bVar2 != null ? bVar2.hashCode() : 0)) * 31;
        b bVar3 = this.f13963o;
        return iHashCode13 + (bVar3 != null ? bVar3.hashCode() : 0);
    }
}
