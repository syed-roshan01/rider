package l9;

import f5.f0;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class c implements k9.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f11400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11402c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c9.e f11403d;

    public c(CharSequence charSequence, int i10, int i11, f0 f0Var) {
        d7.a.m(charSequence, "input");
        this.f11400a = charSequence;
        this.f11401b = i10;
        this.f11402c = i11;
        this.f11403d = f0Var;
    }

    @Override // k9.i
    public final Iterator iterator() {
        return new b(this);
    }
}
