package n4;

import d7.t;
import d9.u;
import m4.n;
import m9.d0;

/* JADX INFO: loaded from: classes.dex */
public final class d extends w8.i implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f12171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u f12172c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u f12173d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s4.j f12174e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f12175f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ u f12176n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ i4.e f12177o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(i iVar, u uVar, u uVar2, s4.j jVar, Object obj, u uVar3, i4.e eVar, u8.e eVar2) {
        super(2, eVar2);
        this.f12171b = iVar;
        this.f12172c = uVar;
        this.f12173d = uVar2;
        this.f12174e = jVar;
        this.f12175f = obj;
        this.f12176n = uVar3;
        this.f12177o = eVar;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        return new d(this.f12171b, this.f12172c, this.f12173d, this.f12174e, this.f12175f, this.f12176n, this.f12177o, eVar);
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((d0) obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        v8.a aVar = v8.a.f15963a;
        int i10 = this.f12170a;
        if (i10 == 0) {
            t.v0(obj);
            i iVar = this.f12171b;
            n nVar = (n) this.f12172c.f4952a;
            i4.c cVar = (i4.c) this.f12173d.f4952a;
            s4.j jVar = this.f12174e;
            Object obj2 = this.f12175f;
            s4.n nVar2 = (s4.n) this.f12176n.f4952a;
            i4.e eVar = this.f12177o;
            this.f12170a = 1;
            obj = i.a(iVar, nVar, cVar, jVar, obj2, nVar2, eVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.v0(obj);
        }
        return obj;
    }
}
