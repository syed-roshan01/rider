package p7;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class j extends a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12829a;

    public j(int i10) {
        this.f12829a = i10;
    }

    @Override // p7.a0
    public final Object b(v7.a aVar) {
        switch (this.f12829a) {
            case 0:
                if (aVar.k0() != 9) {
                    return Double.valueOf(aVar.T());
                }
                aVar.g0();
                return null;
            default:
                if (aVar.k0() != 9) {
                    return Float.valueOf((float) aVar.T());
                }
                aVar.g0();
                return null;
        }
    }

    @Override // p7.a0
    public final /* bridge */ /* synthetic */ void c(v7.b bVar, Object obj) throws IOException {
        switch (this.f12829a) {
            case 0:
                d(bVar, (Number) obj);
                break;
            default:
                d(bVar, (Number) obj);
                break;
        }
    }

    public final void d(v7.b bVar, Number number) throws IOException {
        switch (this.f12829a) {
            case 0:
                if (number != null) {
                    double dDoubleValue = number.doubleValue();
                    n.a(dDoubleValue);
                    bVar.Q(dDoubleValue);
                } else {
                    bVar.M();
                }
                break;
            default:
                if (number != null) {
                    float fFloatValue = number.floatValue();
                    n.a(fFloatValue);
                    if (!(number instanceof Float)) {
                        number = Float.valueOf(fFloatValue);
                    }
                    bVar.d0(number);
                } else {
                    bVar.M();
                }
                break;
        }
    }
}
