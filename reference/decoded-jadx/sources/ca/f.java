package ca;

import ba.i;
import java.util.List;
import l.r;
import x9.b0;
import x9.s;
import x9.t;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f3063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f3064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3065c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ba.d f3066d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r f3067e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f3068f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f3069g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f3070h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f3071i;

    public f(i iVar, List list, int i10, ba.d dVar, r rVar, int i11, int i12, int i13) {
        d7.a.m(iVar, "call");
        d7.a.m(list, "interceptors");
        d7.a.m(rVar, "request");
        this.f3063a = iVar;
        this.f3064b = list;
        this.f3065c = i10;
        this.f3066d = dVar;
        this.f3067e = rVar;
        this.f3068f = i11;
        this.f3069g = i12;
        this.f3070h = i13;
    }

    public static f a(f fVar, int i10, ba.d dVar, r rVar, int i11) {
        if ((i11 & 1) != 0) {
            i10 = fVar.f3065c;
        }
        int i12 = i10;
        if ((i11 & 2) != 0) {
            dVar = fVar.f3066d;
        }
        ba.d dVar2 = dVar;
        if ((i11 & 4) != 0) {
            rVar = fVar.f3067e;
        }
        r rVar2 = rVar;
        int i13 = (i11 & 8) != 0 ? fVar.f3068f : 0;
        int i14 = (i11 & 16) != 0 ? fVar.f3069g : 0;
        int i15 = (i11 & 32) != 0 ? fVar.f3070h : 0;
        fVar.getClass();
        d7.a.m(rVar2, "request");
        return new f(fVar.f3063a, fVar.f3064b, i12, dVar2, rVar2, i13, i14, i15);
    }

    public final b0 b(r rVar) {
        d7.a.m(rVar, "request");
        List list = this.f3064b;
        int size = list.size();
        int i10 = this.f3065c;
        if (i10 >= size) {
            throw new IllegalStateException("Check failed.".toString());
        }
        this.f3071i++;
        ba.d dVar = this.f3066d;
        if (dVar != null) {
            if (!dVar.f2770c.b((s) rVar.f10910b)) {
                throw new IllegalStateException(("network interceptor " + list.get(i10 - 1) + " must retain the same host and port").toString());
            }
            if (this.f3071i != 1) {
                throw new IllegalStateException(("network interceptor " + list.get(i10 - 1) + " must call proceed() exactly once").toString());
            }
        }
        int i11 = i10 + 1;
        f fVarA = a(this, i11, null, rVar, 58);
        t tVar = (t) list.get(i10);
        b0 b0VarA = tVar.a(fVarA);
        if (b0VarA == null) {
            throw new NullPointerException("interceptor " + tVar + " returned null");
        }
        if (dVar != null && i11 < list.size() && fVarA.f3071i != 1) {
            throw new IllegalStateException(("network interceptor " + tVar + " must call proceed() exactly once").toString());
        }
        if (b0VarA.f16350n != null) {
            return b0VarA;
        }
        throw new IllegalStateException(("interceptor " + tVar + " returned a response with no body").toString());
    }
}
