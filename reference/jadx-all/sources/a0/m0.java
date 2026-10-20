package a0;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class m0 extends d9.j implements c9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v0.l f832b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m0(v0.l lVar, int i10) {
        super(1);
        this.f831a = i10;
        this.f832b = lVar;
    }

    @Override // c9.c
    public final Object invoke(Object obj) {
        int i10 = this.f831a;
        v0.l lVar = this.f832b;
        switch (i10) {
            case 0:
                return Boolean.valueOf(lVar != null ? lVar.a(obj) : true);
            default:
                return new o0(lVar, (Map) obj);
        }
    }
}
