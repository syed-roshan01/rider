package b8;

import a4.c0;
import b3.s;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c[] f2752d = a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0[] f2754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2755c;

    public c(int i10, c0... c0VarArr) {
        this.f2753a = i10;
        this.f2754b = c0VarArr;
        c0 c0Var = c0VarArr[0];
        int i11 = c0Var.f1079a;
        int i12 = 0;
        for (s sVar : (s[]) c0Var.f1080b) {
            i12 += (sVar.f2677b + i11) * sVar.f2676a;
        }
        this.f2755c = i12;
    }

    public static c[] a() {
        int i10 = 10;
        c cVar = new c(1, new c0(7, new s[]{new s(1, 19)}), new c0(i10, new s[]{new s(1, 16)}), new c0(13, new s[]{new s(1, 13)}), new c0(17, new s[]{new s(1, 9)}));
        int i11 = 22;
        c cVar2 = new c(2, new c0(i10, new s[]{new s(1, 34)}), new c0(16, new s[]{new s(1, 28)}), new c0(i11, new s[]{new s(1, 22)}), new c0(28, new s[]{new s(1, 16)}));
        int i12 = 26;
        int i13 = 18;
        c cVar3 = new c(3, new c0(15, new s[]{new s(1, 55)}), new c0(i12, new s[]{new s(1, 44)}), new c0(i13, new s[]{new s(2, 17)}), new c0(i11, new s[]{new s(2, 13)}));
        int i14 = 24;
        c cVar4 = new c(4, new c0(20, new s[]{new s(1, 80)}), new c0(i13, new s[]{new s(2, 32)}), new c0(i12, new s[]{new s(2, 24)}), new c0(16, new s[]{new s(4, 9)}));
        c cVar5 = new c(5, new c0(i12, new s[]{new s(1, 108)}), new c0(i14, new s[]{new s(2, 43)}), new c0(18, new s[]{new s(2, 15), new s(2, 16)}), new c0(22, new s[]{new s(2, 11), new s(2, 12)}));
        c cVar6 = new c(6, new c0(18, new s[]{new s(2, 68)}), new c0(16, new s[]{new s(4, 27)}), new c0(i14, new s[]{new s(4, 19)}), new c0(28, new s[]{new s(4, 15)}));
        int i15 = 18;
        c cVar7 = new c(7, new c0(20, new s[]{new s(2, 78)}), new c0(i15, new s[]{new s(4, 31)}), new c0(i15, new s[]{new s(2, 14), new s(4, 15)}), new c0(26, new s[]{new s(4, 13), new s(1, 14)}));
        c cVar8 = new c(8, new c0(24, new s[]{new s(2, 97)}), new c0(22, new s[]{new s(2, 38), new s(2, 39)}), new c0(22, new s[]{new s(4, 18), new s(2, 19)}), new c0(26, new s[]{new s(4, 14), new s(2, 15)}));
        c cVar9 = new c(9, new c0(30, new s[]{new s(2, 116)}), new c0(22, new s[]{new s(3, 36), new s(2, 37)}), new c0(20, new s[]{new s(4, 16), new s(4, 17)}), new c0(24, new s[]{new s(4, 12), new s(4, 13)}));
        c cVar10 = new c(10, new c0(18, new s[]{new s(2, 68), new s(2, 69)}), new c0(26, new s[]{new s(4, 43), new s(1, 44)}), new c0(24, new s[]{new s(6, 19), new s(2, 20)}), new c0(28, new s[]{new s(6, 15), new s(2, 16)}));
        c cVar11 = new c(11, new c0(20, new s[]{new s(4, 81)}), new c0(30, new s[]{new s(1, 50), new s(4, 51)}), new c0(28, new s[]{new s(4, 22), new s(4, 23)}), new c0(24, new s[]{new s(3, 12), new s(8, 13)}));
        c cVar12 = new c(12, new c0(24, new s[]{new s(2, 92), new s(2, 93)}), new c0(22, new s[]{new s(6, 36), new s(2, 37)}), new c0(26, new s[]{new s(4, 20), new s(6, 21)}), new c0(28, new s[]{new s(7, 14), new s(4, 15)}));
        c cVar13 = new c(13, new c0(26, new s[]{new s(4, 107)}), new c0(22, new s[]{new s(8, 37), new s(1, 38)}), new c0(24, new s[]{new s(8, 20), new s(4, 21)}), new c0(22, new s[]{new s(12, 11), new s(4, 12)}));
        c cVar14 = new c(14, new c0(30, new s[]{new s(3, 115), new s(1, 116)}), new c0(24, new s[]{new s(4, 40), new s(5, 41)}), new c0(20, new s[]{new s(11, 16), new s(5, 17)}), new c0(24, new s[]{new s(11, 12), new s(5, 13)}));
        c cVar15 = new c(15, new c0(22, new s[]{new s(5, 87), new s(1, 88)}), new c0(24, new s[]{new s(5, 41), new s(5, 42)}), new c0(30, new s[]{new s(5, 24), new s(7, 25)}), new c0(24, new s[]{new s(11, 12), new s(7, 13)}));
        c cVar16 = new c(16, new c0(24, new s[]{new s(5, 98), new s(1, 99)}), new c0(28, new s[]{new s(7, 45), new s(3, 46)}), new c0(24, new s[]{new s(15, 19), new s(2, 20)}), new c0(30, new s[]{new s(3, 15), new s(13, 16)}));
        int i16 = 28;
        c cVar17 = new c(17, new c0(i16, new s[]{new s(1, 107), new s(5, 108)}), new c0(i16, new s[]{new s(10, 46), new s(1, 47)}), new c0(i16, new s[]{new s(1, 22), new s(15, 23)}), new c0(28, new s[]{new s(2, 14), new s(17, 15)}));
        c cVar18 = new c(18, new c0(30, new s[]{new s(5, 120), new s(1, 121)}), new c0(26, new s[]{new s(9, 43), new s(4, 44)}), new c0(28, new s[]{new s(17, 22), new s(1, 23)}), new c0(28, new s[]{new s(2, 14), new s(19, 15)}));
        int i17 = 26;
        c cVar19 = new c(19, new c0(28, new s[]{new s(3, 113), new s(4, 114)}), new c0(i17, new s[]{new s(3, 44), new s(11, 45)}), new c0(i17, new s[]{new s(17, 21), new s(4, 22)}), new c0(26, new s[]{new s(9, 13), new s(16, 14)}));
        c cVar20 = new c(20, new c0(28, new s[]{new s(3, 107), new s(5, 108)}), new c0(26, new s[]{new s(3, 41), new s(13, 42)}), new c0(30, new s[]{new s(15, 24), new s(5, 25)}), new c0(28, new s[]{new s(15, 15), new s(10, 16)}));
        c cVar21 = new c(21, new c0(28, new s[]{new s(4, 116), new s(4, 117)}), new c0(26, new s[]{new s(17, 42)}), new c0(28, new s[]{new s(17, 22), new s(6, 23)}), new c0(30, new s[]{new s(19, 16), new s(6, 17)}));
        int i18 = 28;
        c cVar22 = new c(22, new c0(i18, new s[]{new s(2, 111), new s(7, 112)}), new c0(i18, new s[]{new s(17, 46)}), new c0(30, new s[]{new s(7, 24), new s(16, 25)}), new c0(24, new s[]{new s(34, 13)}));
        c cVar23 = new c(23, new c0(30, new s[]{new s(4, 121), new s(5, 122)}), new c0(28, new s[]{new s(4, 47), new s(14, 48)}), new c0(30, new s[]{new s(11, 24), new s(14, 25)}), new c0(30, new s[]{new s(16, 15), new s(14, 16)}));
        c cVar24 = new c(24, new c0(30, new s[]{new s(6, 117), new s(4, 118)}), new c0(28, new s[]{new s(6, 45), new s(14, 46)}), new c0(30, new s[]{new s(11, 24), new s(16, 25)}), new c0(30, new s[]{new s(30, 16), new s(2, 17)}));
        c cVar25 = new c(25, new c0(26, new s[]{new s(8, 106), new s(4, 107)}), new c0(28, new s[]{new s(8, 47), new s(13, 48)}), new c0(30, new s[]{new s(7, 24), new s(22, 25)}), new c0(30, new s[]{new s(22, 15), new s(13, 16)}));
        int i19 = 28;
        c cVar26 = new c(26, new c0(i19, new s[]{new s(10, 114), new s(2, 115)}), new c0(i19, new s[]{new s(19, 46), new s(4, 47)}), new c0(i19, new s[]{new s(28, 22), new s(6, 23)}), new c0(30, new s[]{new s(33, 16), new s(4, 17)}));
        c cVar27 = new c(27, new c0(30, new s[]{new s(8, 122), new s(4, 123)}), new c0(28, new s[]{new s(22, 45), new s(3, 46)}), new c0(30, new s[]{new s(8, 23), new s(26, 24)}), new c0(30, new s[]{new s(12, 15), new s(28, 16)}));
        int i20 = 30;
        c cVar28 = new c(28, new c0(30, new s[]{new s(3, 117), new s(10, 118)}), new c0(28, new s[]{new s(3, 45), new s(23, 46)}), new c0(30, new s[]{new s(4, 24), new s(31, 25)}), new c0(i20, new s[]{new s(11, 15), new s(31, 16)}));
        c cVar29 = new c(29, new c0(i20, new s[]{new s(7, 116), new s(7, 117)}), new c0(28, new s[]{new s(21, 45), new s(7, 46)}), new c0(30, new s[]{new s(1, 23), new s(37, 24)}), new c0(30, new s[]{new s(19, 15), new s(26, 16)}));
        int i21 = 30;
        c cVar30 = new c(30, new c0(30, new s[]{new s(5, 115), new s(10, 116)}), new c0(28, new s[]{new s(19, 47), new s(10, 48)}), new c0(30, new s[]{new s(15, 24), new s(25, 25)}), new c0(i21, new s[]{new s(23, 15), new s(25, 16)}));
        int i22 = 30;
        c cVar31 = new c(31, new c0(i21, new s[]{new s(13, 115), new s(3, 116)}), new c0(28, new s[]{new s(2, 46), new s(29, 47)}), new c0(30, new s[]{new s(42, 24), new s(1, 25)}), new c0(i22, new s[]{new s(23, 15), new s(28, 16)}));
        int i23 = 30;
        return new c[]{cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10, cVar11, cVar12, cVar13, cVar14, cVar15, cVar16, cVar17, cVar18, cVar19, cVar20, cVar21, cVar22, cVar23, cVar24, cVar25, cVar26, cVar27, cVar28, cVar29, cVar30, cVar31, new c(32, new c0(i22, new s[]{new s(17, 115)}), new c0(28, new s[]{new s(10, 46), new s(23, 47)}), new c0(30, new s[]{new s(10, 24), new s(35, 25)}), new c0(i23, new s[]{new s(19, 15), new s(35, 16)})), new c(33, new c0(i23, new s[]{new s(17, 115), new s(1, 116)}), new c0(28, new s[]{new s(14, 46), new s(21, 47)}), new c0(30, new s[]{new s(29, 24), new s(19, 25)}), new c0(30, new s[]{new s(11, 15), new s(46, 16)})), new c(34, new c0(30, new s[]{new s(13, 115), new s(6, 116)}), new c0(28, new s[]{new s(14, 46), new s(23, 47)}), new c0(30, new s[]{new s(44, 24), new s(7, 25)}), new c0(30, new s[]{new s(59, 16), new s(1, 17)})), new c(35, new c0(30, new s[]{new s(12, 121), new s(7, 122)}), new c0(28, new s[]{new s(12, 47), new s(26, 48)}), new c0(30, new s[]{new s(39, 24), new s(14, 25)}), new c0(30, new s[]{new s(22, 15), new s(41, 16)})), new c(36, new c0(30, new s[]{new s(6, 121), new s(14, 122)}), new c0(28, new s[]{new s(6, 47), new s(34, 48)}), new c0(30, new s[]{new s(46, 24), new s(10, 25)}), new c0(30, new s[]{new s(2, 15), new s(64, 16)})), new c(37, new c0(30, new s[]{new s(17, 122), new s(4, 123)}), new c0(28, new s[]{new s(29, 46), new s(14, 47)}), new c0(30, new s[]{new s(49, 24), new s(10, 25)}), new c0(30, new s[]{new s(24, 15), new s(46, 16)})), new c(38, new c0(30, new s[]{new s(4, 122), new s(18, 123)}), new c0(28, new s[]{new s(13, 46), new s(32, 47)}), new c0(30, new s[]{new s(48, 24), new s(14, 25)}), new c0(30, new s[]{new s(42, 15), new s(32, 16)})), new c(39, new c0(30, new s[]{new s(20, 117), new s(4, 118)}), new c0(28, new s[]{new s(40, 47), new s(7, 48)}), new c0(30, new s[]{new s(43, 24), new s(22, 25)}), new c0(30, new s[]{new s(10, 15), new s(67, 16)})), new c(40, new c0(30, new s[]{new s(19, 118), new s(6, 119)}), new c0(28, new s[]{new s(18, 47), new s(31, 48)}), new c0(30, new s[]{new s(34, 24), new s(34, 25)}), new c0(30, new s[]{new s(20, 15), new s(61, 16)}))};
    }

    public static c b(int i10) {
        if (i10 < 1 || i10 > 40) {
            throw new IllegalArgumentException();
        }
        return f2752d[i10 - 1];
    }

    public final String toString() {
        return String.valueOf(this.f2753a);
    }
}
