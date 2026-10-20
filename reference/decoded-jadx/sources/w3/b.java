package w3;

import android.net.Uri;
import android.view.InputEvent;
import c9.e;
import d7.t;
import m9.d0;
import q8.l;
import w8.i;

/* JADX INFO: loaded from: classes.dex */
public final class b extends i implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f16148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f16149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Uri f16150c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InputEvent f16151d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, Uri uri, InputEvent inputEvent, u8.e eVar) {
        super(2, eVar);
        this.f16149b = dVar;
        this.f16150c = uri;
        this.f16151d = inputEvent;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        return new b(this.f16149b, this.f16150c, this.f16151d, eVar);
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((d0) obj, (u8.e) obj2)).invokeSuspend(l.f13235a);
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        v8.a aVar = v8.a.f15963a;
        int i10 = this.f16148a;
        if (i10 == 0) {
            t.v0(obj);
            x3.c cVar = this.f16149b.f16155a;
            this.f16148a = 1;
            if (cVar.b(this.f16150c, this.f16151d, this) == aVar) {
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
