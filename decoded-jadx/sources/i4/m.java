package i4;

import android.graphics.Bitmap;
import d7.t;
import m9.d0;

/* JADX INFO: loaded from: classes.dex */
public final class m extends w8.i implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f8050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s4.j f8051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f8052c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t4.f f8053d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e f8054e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Bitmap f8055f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(s4.j jVar, o oVar, t4.f fVar, e eVar, Bitmap bitmap, u8.e eVar2) {
        super(2, eVar2);
        this.f8051b = jVar;
        this.f8052c = oVar;
        this.f8053d = fVar;
        this.f8054e = eVar;
        this.f8055f = bitmap;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        return new m(this.f8051b, this.f8052c, this.f8053d, this.f8054e, this.f8055f, eVar);
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((d0) obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        v8.a aVar = v8.a.f15963a;
        int i10 = this.f8050a;
        if (i10 == 0) {
            t.v0(obj);
            s4.j jVar = this.f8051b;
            n4.l lVar = new n4.l(jVar, this.f8052c.f8061e, 0, jVar, this.f8053d, this.f8054e, this.f8055f != null);
            this.f8050a = 1;
            obj = lVar.b(jVar, this);
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
