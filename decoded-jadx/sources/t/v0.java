package t;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class v0 implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u0 f14333a;

    public v0(u0 u0Var) {
        this.f14333a = u0Var;
    }

    @Override // t.n
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final f2 a(x1 x1Var) {
        int i10;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        u0 u0Var = this.f14333a;
        q.p pVar = u0Var.f14338b;
        int[] iArr = pVar.f13011b;
        Object[] objArr = pVar.f13012c;
        long[] jArr = pVar.f13010a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j10 = jArr[i11];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8;
                    int i13 = 8 - ((~(i11 - length)) >>> 31);
                    int i14 = 0;
                    while (i14 < i13) {
                        if ((255 & j10) < 128) {
                            int i15 = (i11 << 3) + i14;
                            int i16 = iArr[i15];
                            t0 t0Var = (t0) objArr[i15];
                            linkedHashMap.put(Integer.valueOf(i16), new q8.f(x1Var.f14351a.invoke(t0Var.f14310a), t0Var.f14311b));
                            i10 = 8;
                        } else {
                            i10 = i12;
                        }
                        j10 >>= i10;
                        i14++;
                        i12 = i10;
                    }
                    if (i13 != i12) {
                        break;
                    }
                }
                if (i11 == length) {
                    break;
                }
                i11++;
            }
        }
        return new f2(u0Var.f14337a, linkedHashMap);
    }
}
