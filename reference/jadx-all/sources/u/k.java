package u;

import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class k extends d9.j implements c9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f14832c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(int i10, Collection collection) {
        super(1);
        this.f14830a = 3;
        this.f14832c = i10;
        this.f14831b = collection;
    }

    public final void a(r1.w0 w0Var) {
        int i10 = this.f14830a;
        int i11 = this.f14832c;
        Object obj = this.f14831b;
        switch (i10) {
            case 0:
                r1.x0 x0Var = (r1.x0) obj;
                int i12 = (-i11) / 2;
                r1.w0.k(w0Var, x0Var, i12 - ((x0Var.f13423a - x0Var.b0()) / 2), i12 - ((x0Var.f13424b - x0Var.a0()) / 2), null, 12);
                break;
            case 1:
                int i13 = i11 / 2;
                w0Var.getClass();
                r1.w0.c((r1.x0) obj, i13, i13, 0.0f);
                break;
            default:
                w0Var.getClass();
                r1.w0.c((r1.x0) obj, 0, -i11, 0.0f);
                break;
        }
    }

    @Override // c9.c
    public final Object invoke(Object obj) {
        q8.l lVar = q8.l.f13235a;
        switch (this.f14830a) {
            case 0:
                a((r1.w0) obj);
                return lVar;
            case 1:
                a((r1.w0) obj);
                return lVar;
            case 2:
                a((r1.w0) obj);
                return lVar;
            default:
                return Boolean.valueOf(((List) obj).addAll(this.f14832c, (Collection) this.f14831b));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(r1.x0 x0Var, int i10, int i11) {
        super(1);
        this.f14830a = i11;
        this.f14831b = x0Var;
        this.f14832c = i10;
    }
}
