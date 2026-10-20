package l4;

import ja.x;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import l.z2;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f11280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f11281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f11282c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f11283d;

    public e(String str, Charset charset, boolean z10, b8.a aVar) {
        this.f11281b = str;
        this.f11280a = z10;
        this.f11282c = new z7.d(str, charset);
        this.f11283d = aVar;
    }

    public static void a(c8.d[][][] dVarArr, int i10, c8.d dVar) {
        c8.d[] dVarArr2 = dVarArr[i10 + dVar.f3050d][dVar.f3049c];
        b8.b bVar = dVar.f3047a;
        char c10 = 0;
        if (bVar != null) {
            int iOrdinal = bVar.ordinal();
            if (iOrdinal == 1) {
                c10 = 2;
            } else if (iOrdinal == 2) {
                c10 = 1;
            } else if (iOrdinal == 4) {
                c10 = 3;
            } else if (iOrdinal != 6) {
                throw new IllegalStateException("Illegal mode " + bVar);
            }
        }
        c8.d dVar2 = dVarArr2[c10];
        if (dVar2 != null) {
            if (dVar2.f3052f <= dVar.f3052f) {
                return;
            }
        }
        dVarArr2[c10] = dVar;
    }

    public static boolean c(b8.b bVar, char c10) {
        int iOrdinal = bVar.ordinal();
        if (iOrdinal == 1) {
            return c10 >= '0' && c10 <= '9';
        }
        if (iOrdinal == 2) {
            if (c10 < '`') {
                return c8.b.f3041a[c10] != -1;
            }
            int[] iArr = c8.b.f3041a;
            return false;
        }
        if (iOrdinal == 4) {
            return true;
        }
        if (iOrdinal != 6) {
            return false;
        }
        return c8.b.b(String.valueOf(c10));
    }

    public static b8.c g(int i10) {
        if (i10 == 0) {
            throw null;
        }
        int i11 = i10 - 1;
        if (i11 != 0) {
            return i11 != 1 ? b8.c.b(40) : b8.c.b(26);
        }
        return b8.c.b(9);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0037  */
    public final void b(b8.c cVar, c8.d[][][] dVarArr, int i10, c8.d dVar) {
        int i11;
        z7.d dVar2 = (z7.d) this.f11282c;
        int length = dVar2.f17331a.length;
        int i12 = dVar2.f17332b;
        Object obj = this.f11281b;
        if (i12 >= 0) {
            char cCharAt = ((String) obj).charAt(i10);
            if (dVar2.f17331a[i12].canEncode("" + cCharAt)) {
                length = i12 + 1;
            } else {
                i12 = 0;
            }
        } else {
            i12 = 0;
        }
        int i13 = length;
        for (int i14 = i12; i14 < i13; i14++) {
            char cCharAt2 = ((String) obj).charAt(i10);
            if (dVar2.f17331a[i14].canEncode("" + cCharAt2)) {
                a(dVarArr, i10, new c8.d(this, b8.b.BYTE, i10, i14, 1, dVar, cVar));
            }
        }
        b8.b bVar = b8.b.KANJI;
        String str = (String) obj;
        if (c(bVar, str.charAt(i10))) {
            a(dVarArr, i10, new c8.d(this, bVar, i10, 0, 1, dVar, cVar));
        }
        int length2 = str.length();
        b8.b bVar2 = b8.b.ALPHANUMERIC;
        if (c(bVar2, str.charAt(i10))) {
            int i15 = i10 + 1;
            a(dVarArr, i10, new c8.d(this, bVar2, i10, 0, (i15 >= length2 || !c(bVar2, str.charAt(i15))) ? 1 : 2, dVar, cVar));
        }
        b8.b bVar3 = b8.b.NUMERIC;
        if (c(bVar3, str.charAt(i10))) {
            int i16 = i10 + 1;
            if (i16 >= length2 || !c(bVar3, str.charAt(i16))) {
                i11 = 1;
            } else {
                int i17 = i10 + 2;
                i11 = (i17 >= length2 || !c(bVar3, str.charAt(i17))) ? 2 : 3;
            }
            a(dVarArr, i10, new c8.d(this, bVar3, i10, 0, i11, dVar, cVar));
        }
    }

    public final void d(boolean z10) {
        Object obj = this.f11283d;
        j jVar = (j) obj;
        j jVar2 = (j) obj;
        synchronized (jVar) {
            try {
                if (!(!this.f11280a)) {
                    throw new IllegalStateException("editor is closed".toString());
                }
                if (d7.a.d(((f) this.f11281b).f11290g, this)) {
                    j.a(jVar2, this, z10);
                }
                this.f11280a = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final z2 e(b8.c cVar) throws y5.n {
        int i10;
        Object obj = this.f11281b;
        int length = ((String) obj).length();
        Object obj2 = this.f11282c;
        c8.d[][][] dVarArr = (c8.d[][][]) Array.newInstance((Class<?>) c8.d.class, length + 1, ((z7.d) obj2).f17331a.length, 4);
        b(cVar, dVarArr, 0, null);
        for (int i11 = 1; i11 <= length; i11++) {
            for (int i12 = 0; i12 < ((z7.d) obj2).f17331a.length; i12++) {
                for (int i13 = 0; i13 < 4; i13++) {
                    c8.d dVar = dVarArr[i11][i12][i13];
                    if (dVar != null && i11 < length) {
                        b(cVar, dVarArr, i11, dVar);
                    }
                }
            }
        }
        int i14 = -1;
        int i15 = Integer.MAX_VALUE;
        int i16 = -1;
        for (int i17 = 0; i17 < ((z7.d) obj2).f17331a.length; i17++) {
            for (int i18 = 0; i18 < 4; i18++) {
                c8.d dVar2 = dVarArr[length][i17][i18];
                if (dVar2 != null && (i10 = dVar2.f3052f) < i15) {
                    i14 = i17;
                    i16 = i18;
                    i15 = i10;
                }
            }
        }
        if (i14 >= 0) {
            return new z2(this, cVar, dVarArr[length][i14][i16]);
        }
        throw new y5.n(a7.a.p(new StringBuilder("Internal error: failed to encode \""), (String) obj, "\""));
    }

    public final x f(int i10) {
        x xVar;
        j jVar = (j) this.f11283d;
        synchronized (jVar) {
            if (!(!this.f11280a)) {
                throw new IllegalStateException("editor is closed".toString());
            }
            ((boolean[]) this.f11282c)[i10] = true;
            Object obj = ((f) this.f11281b).f11287d.get(i10);
            h hVar = jVar.f11314w;
            x xVar2 = (x) obj;
            if (!hVar.f(xVar2)) {
                w4.e.a(hVar.k(xVar2));
            }
            xVar = (x) obj;
        }
        return xVar;
    }

    public e(j jVar, f fVar) {
        this.f11283d = jVar;
        this.f11281b = fVar;
        jVar.getClass();
        this.f11282c = new boolean[2];
    }
}
