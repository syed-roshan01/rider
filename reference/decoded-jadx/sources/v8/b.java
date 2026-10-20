package v8;

import c9.e;
import d7.t;
import w8.g;

/* JADX INFO: loaded from: classes.dex */
public final class b extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f15968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15969c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Object obj, u8.e eVar, e eVar2) {
        super(eVar);
        this.f15968b = eVar2;
        this.f15969c = obj;
        d7.a.k(eVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f15967a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.f15967a = 2;
            t.v0(obj);
            return obj;
        }
        this.f15967a = 1;
        t.v0(obj);
        e eVar = this.f15968b;
        d7.a.k(eVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
        z6.a.f(2, eVar);
        return eVar.invoke(this.f15969c, this);
    }
}
