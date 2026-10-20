package e8;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a2 implements k1 {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e8.k1
    public final byte[] a(Serializable serializable) {
        return ((c2) serializable).f5227a.f5426b;
    }

    @Override // e8.k1
    public final Object b(byte[] bArr) {
        int i10;
        byte b10;
        char c10 = 0;
        if (bArr.length == 1 && bArr[0] == 48) {
            return c2.f5216e;
        }
        int length = bArr.length;
        if (length != 1) {
            if (length == 2 && (b10 = bArr[0]) >= 48 && b10 <= 57) {
                i10 = (b10 - 48) * 10;
                c10 = 1;
            }
            return c2.f5218g.g("Unknown code ".concat(new String(bArr, q6.d.f13203a)));
        }
        i10 = 0;
        byte b11 = bArr[c10];
        if (b11 >= 48 && b11 <= 57) {
            int i11 = (b11 - 48) + i10;
            List list = c2.f5215d;
            if (i11 < list.size()) {
                return (c2) list.get(i11);
            }
        }
        return c2.f5218g.g("Unknown code ".concat(new String(bArr, q6.d.f13203a)));
    }
}
