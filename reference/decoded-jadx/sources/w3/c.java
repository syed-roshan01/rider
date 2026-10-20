package w3;

import android.net.Uri;
import c9.e;
import d7.t;
import m9.d0;
import q8.l;
import w8.i;

/* JADX INFO: loaded from: classes.dex */
public final class c extends i implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f16152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f16153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Uri f16154c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, Uri uri, u8.e eVar) {
        super(2, eVar);
        this.f16153b = dVar;
        this.f16154c = uri;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        return new c(this.f16153b, this.f16154c, eVar);
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((d0) obj, (u8.e) obj2)).invokeSuspend(l.f13235a);
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        v8.a aVar = v8.a.f15963a;
        int i10 = this.f16152a;
        if (i10 == 0) {
            t.v0(obj);
            x3.c cVar = this.f16153b.f16155a;
            this.f16152a = 1;
            if (cVar.c(this.f16154c, this) == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.v0(obj);
        }
        return l.f13235a;
    }
}
