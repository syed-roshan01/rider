package i4;

import android.graphics.Bitmap;
import s4.p;

/* JADX INFO: loaded from: classes.dex */
public final class l extends w8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o f8042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p f8043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public s4.j f8044c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e f8045d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Bitmap f8046e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f8047f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ o f8048n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f8049o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(o oVar, u8.e eVar) {
        super(eVar);
        this.f8048n = oVar;
    }

    @Override // w8.a
    public final Object invokeSuspend(Object obj) {
        this.f8047f = obj;
        this.f8049o |= Integer.MIN_VALUE;
        return o.a(this.f8048n, null, 0, this);
    }
}
