package n4;

import android.content.Context;
import d7.t;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s4.j f12221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f12222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f12223c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s4.j f12224d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t4.f f12225e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i4.e f12226f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f12227g;

    public l(s4.j jVar, List list, int i10, s4.j jVar2, t4.f fVar, i4.e eVar, boolean z10) {
        this.f12221a = jVar;
        this.f12222b = list;
        this.f12223c = i10;
        this.f12224d = jVar2;
        this.f12225e = fVar;
        this.f12226f = eVar;
        this.f12227g = z10;
    }

    public final void a(s4.j jVar, j jVar2) {
        Context context = jVar.f13995a;
        s4.j jVar3 = this.f12221a;
        if (context != jVar3.f13995a) {
            throw new IllegalStateException(("Interceptor '" + jVar2 + "' cannot modify the request's context.").toString());
        }
        if (jVar.f13996b == s4.l.f14021a) {
            throw new IllegalStateException(("Interceptor '" + jVar2 + "' cannot set the request's data to null.").toString());
        }
        if (jVar.f13997c != jVar3.f13997c) {
            throw new IllegalStateException(("Interceptor '" + jVar2 + "' cannot modify the request's target.").toString());
        }
        if (jVar.A != jVar3.A) {
            throw new IllegalStateException(("Interceptor '" + jVar2 + "' cannot modify the request's lifecycle.").toString());
        }
        if (jVar.B == jVar3.B) {
            return;
        }
        throw new IllegalStateException(("Interceptor '" + jVar2 + "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.").toString());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(s4.j jVar, u8.e eVar) throws Throwable {
        k kVar;
        l lVar;
        j jVar2;
        if (eVar instanceof k) {
            kVar = (k) eVar;
            int i10 = kVar.f12220e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                kVar.f12220e = i10 - Integer.MIN_VALUE;
            } else {
                kVar = new k(this, eVar);
            }
        } else {
            kVar = new k(this, eVar);
        }
        Object objD = kVar.f12218c;
        v8.a aVar = v8.a.f15963a;
        int i11 = kVar.f12220e;
        if (i11 == 0) {
            t.v0(objD);
            List list = this.f12222b;
            int i12 = this.f12223c;
            if (i12 > 0) {
                a(jVar, (j) list.get(i12 - 1));
            }
            j jVar3 = (j) list.get(i12);
            l lVar2 = new l(this.f12221a, this.f12222b, i12 + 1, jVar, this.f12225e, this.f12226f, this.f12227g);
            kVar.f12216a = this;
            kVar.f12217b = jVar3;
            kVar.f12220e = 1;
            i iVar = (i) jVar3;
            objD = iVar.d(lVar2, kVar);
            if (objD == aVar) {
                return aVar;
            }
            lVar = this;
            jVar2 = iVar;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j jVar4 = kVar.f12217b;
            l lVar3 = kVar.f12216a;
            t.v0(objD);
            lVar = lVar3;
            jVar2 = jVar4;
        }
        s4.k kVar2 = (s4.k) objD;
        lVar.a(kVar2.b(), jVar2);
        return kVar2;
    }
}
