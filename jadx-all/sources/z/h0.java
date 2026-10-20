package z;

import java.util.Map;
import r1.k0;

/* JADX INFO: loaded from: classes.dex */
public final class h0 implements k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f17072c;

    public h0(int i10, int i11, Map map) {
        this.f17070a = i10;
        this.f17071b = i11;
        this.f17072c = map;
    }

    @Override // r1.k0
    public final int a() {
        return this.f17071b;
    }

    @Override // r1.k0
    public final int b() {
        return this.f17070a;
    }

    @Override // r1.k0
    public final Map d() {
        return this.f17072c;
    }

    @Override // r1.k0
    public final void e() {
    }

    public h0(int i10) {
        r8.s sVar = r8.s.f13662a;
        if (i10 != 1) {
            this.f17072c = sVar;
        } else {
            this.f17072c = sVar;
        }
    }
}
