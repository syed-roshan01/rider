package j4;

import android.graphics.drawable.Drawable;
import androidx.fragment.app.a0;
import d7.t;
import s4.q;

/* JADX INFO: loaded from: classes.dex */
public final class g extends w8.i implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l f8346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f8348c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(l lVar, u8.e eVar) {
        super(2, eVar);
        this.f8348c = lVar;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        return new g(this.f8348c, eVar);
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((s4.j) obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        l lVar;
        v8.a aVar = v8.a.f15963a;
        int i10 = this.f8347b;
        if (i10 == 0) {
            t.v0(obj);
            l lVar2 = this.f8348c;
            i4.i iVar = (i4.i) lVar2.A.getValue();
            s4.j jVar = (s4.j) lVar2.f8369z.getValue();
            s4.h hVarA = s4.j.a(jVar);
            hVarA.f13972d = new j(lVar2);
            hVarA.M = null;
            hVarA.N = null;
            hVarA.O = null;
            s4.d dVar = jVar.L;
            if (dVar.f13950b == null) {
                hVarA.K = new j(lVar2);
                hVarA.M = null;
                hVarA.N = null;
                hVarA.O = null;
            }
            if (dVar.f13951c == null) {
                r1.l lVar3 = lVar2.f8365v;
                int i11 = p.f8372a;
                hVarA.L = (d7.a.d(lVar3, r1.k.f13392b) || d7.a.d(lVar3, r1.k.f13394d)) ? t4.e.f14655b : t4.e.f14654a;
            }
            if (dVar.f13957i != t4.d.f14650a) {
                hVarA.f13978j = t4.d.f14651b;
            }
            s4.j jVarA = hVarA.a();
            this.f8346a = lVar2;
            this.f8347b = 1;
            i4.o oVar = (i4.o) iVar;
            oVar.getClass();
            Object objQ = d7.a.q(new i4.k(oVar, jVarA, null), this);
            if (objQ == aVar) {
                return aVar;
            }
            lVar = lVar2;
            obj = objQ;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lVar = this.f8346a;
            t.v0(obj);
        }
        s4.k kVar = (s4.k) obj;
        lVar.getClass();
        if (kVar instanceof q) {
            q qVar = (q) kVar;
            return new e(lVar.j(qVar.f14039a), qVar);
        }
        if (!(kVar instanceof s4.e)) {
            throw new a0();
        }
        Drawable drawableA = kVar.a();
        return new c(drawableA != null ? lVar.j(drawableA) : null, (s4.e) kVar);
    }
}
