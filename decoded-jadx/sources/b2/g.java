package b2;

import android.text.Layout;
import android.text.TextUtils;
import java.text.Bidi;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Layout f2538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f2539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f2540c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean[] f2541d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public char[] f2542e;

    public g(Layout layout) {
        this.f2538a = layout;
        ArrayList arrayList = new ArrayList();
        int length = 0;
        do {
            int iO0 = l9.i.O0(this.f2538a.getText(), '\n', length, false, 4);
            length = iO0 < 0 ? this.f2538a.getText().length() : iO0 + 1;
            arrayList.add(Integer.valueOf(length));
        } while (length < this.f2538a.getText().length());
        this.f2539b = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            arrayList2.add(null);
        }
        this.f2540c = arrayList2;
        this.f2541d = new boolean[this.f2539b.size()];
        this.f2539b.size();
    }

    public final float a(int i10, boolean z10) {
        Layout layout = this.f2538a;
        int lineEnd = layout.getLineEnd(layout.getLineForOffset(i10));
        if (i10 > lineEnd) {
            i10 = lineEnd;
        }
        return z10 ? layout.getPrimaryHorizontal(i10) : layout.getSecondaryHorizontal(i10);
    }

    /* JADX WARN: Code duplicated, block: B:112:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:114:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:61:0x0124  */
    /* JADX WARN: Code duplicated, block: B:63:0x0128  */
    /* JADX WARN: Code duplicated, block: B:64:0x012b  */
    public final float b(int i10, boolean z10, boolean z11) {
        int i11;
        boolean z12;
        Bidi bidi;
        char[] cArr;
        boolean z13;
        int i12;
        int i13;
        boolean z14;
        int iC = i10;
        if (!z11) {
            return a(i10, z10);
        }
        Layout layout = this.f2538a;
        int iG = o1.s.G(layout, iC, z11);
        int lineStart = layout.getLineStart(iG);
        int lineEnd = layout.getLineEnd(iG);
        if (iC != lineStart && iC != lineEnd) {
            return a(i10, z10);
        }
        if (iC == 0 || iC == layout.getText().length()) {
            return a(i10, z10);
        }
        ArrayList arrayList = this.f2539b;
        int iF = d7.t.F(arrayList, Integer.valueOf(i10));
        int i14 = iF < 0 ? -(iF + 1) : iF + 1;
        if (z11 && i14 > 0) {
            int i15 = i14 - 1;
            if (iC == ((Number) arrayList.get(i15)).intValue()) {
                i14 = i15;
            }
        }
        boolean z15 = layout.getParagraphDirection(layout.getLineForOffset(i14 == 0 ? 0 : ((Number) arrayList.get(i14 + (-1))).intValue())) == -1;
        int iC2 = c(lineEnd, lineStart);
        int iIntValue = i14 == 0 ? 0 : ((Number) arrayList.get(i14 - 1)).intValue();
        int i16 = lineStart - iIntValue;
        int i17 = iC2 - iIntValue;
        boolean[] zArr = this.f2541d;
        boolean z16 = zArr[i14];
        ArrayList arrayList2 = this.f2540c;
        if (z16) {
            bidi = (Bidi) arrayList2.get(i14);
            i11 = -1;
        } else {
            int iIntValue2 = i14 == 0 ? 0 : ((Number) arrayList.get(i14 - 1)).intValue();
            int iIntValue3 = ((Number) arrayList.get(i14)).intValue();
            int i18 = iIntValue3 - iIntValue2;
            char[] cArr2 = this.f2542e;
            if (cArr2 == null || cArr2.length < i18) {
                cArr2 = new char[i18];
            }
            TextUtils.getChars(layout.getText(), iIntValue2, iIntValue3, cArr2, 0);
            if (Bidi.requiresBidi(cArr2, 0, i18)) {
                int iIntValue4 = i14 == 0 ? 0 : ((Number) arrayList.get(i14 - 1)).intValue();
                i11 = -1;
                bidi = new Bidi(cArr2, 0, null, 0, i18, layout.getParagraphDirection(layout.getLineForOffset(iIntValue4)) == -1 ? 1 : 0);
                z12 = true;
                if (bidi.getRunCount() == 1) {
                }
                arrayList2.set(i14, bidi);
                zArr[i14] = z12;
                if (bidi != null) {
                    cArr = this.f2542e;
                    if (cArr2 == cArr) {
                        cArr2 = null;
                    } else {
                        cArr2 = cArr;
                    }
                }
                this.f2542e = cArr2;
            } else {
                i11 = -1;
                z12 = true;
            }
            bidi = null;
            arrayList2.set(i14, bidi);
            zArr[i14] = z12;
            if (bidi != null) {
                cArr = this.f2542e;
                if (cArr2 == cArr) {
                    cArr2 = null;
                } else {
                    cArr2 = cArr;
                }
            }
            this.f2542e = cArr2;
        }
        Bidi bidiCreateLineBidi = bidi != null ? bidi.createLineBidi(i16, i17) : null;
        if (bidiCreateLineBidi == null) {
            z13 = true;
        } else {
            if (bidiCreateLineBidi.getRunCount() != 1) {
                int runCount = bidiCreateLineBidi.getRunCount();
                f[] fVarArr = new f[runCount];
                for (int i19 = 0; i19 < runCount; i19++) {
                    fVarArr[i19] = new f(bidiCreateLineBidi.getRunStart(i19) + lineStart, bidiCreateLineBidi.getRunLevel(i19) % 2 == 1, bidiCreateLineBidi.getRunLimit(i19) + lineStart);
                }
                int runCount2 = bidiCreateLineBidi.getRunCount();
                byte[] bArr = new byte[runCount2];
                for (int i20 = 0; i20 < runCount2; i20++) {
                    bArr[i20] = (byte) bidiCreateLineBidi.getRunLevel(i20);
                }
                Bidi.reorderVisually(bArr, 0, fVarArr, 0, runCount);
                if (iC != lineStart) {
                    boolean z17 = z15;
                    if (iC > iC2) {
                        iC = c(iC, lineStart);
                    }
                    int i21 = 0;
                    while (true) {
                        if (i21 >= runCount) {
                            i12 = i11;
                            break;
                        }
                        if (fVarArr[i21].f2536b == iC) {
                            i12 = i21;
                            break;
                        }
                        i21++;
                    }
                    f fVar = fVarArr[i12];
                    if (!z10 && z17 != fVar.f2537c) {
                        z17 = !z17;
                    }
                    if (i12 == 0 && z17) {
                        return layout.getLineLeft(iG);
                    }
                    if (i12 != runCount - 1 || z17) {
                        return z17 ? layout.getPrimaryHorizontal(fVarArr[i12 - 1].f2536b) : layout.getPrimaryHorizontal(fVarArr[i12 + 1].f2536b);
                    }
                    return layout.getLineRight(iG);
                }
                int i22 = 0;
                while (true) {
                    if (i22 >= runCount) {
                        i13 = i11;
                        break;
                    }
                    if (fVarArr[i22].f2535a == iC) {
                        i13 = i22;
                        break;
                    }
                    i22++;
                }
                f fVar2 = fVarArr[i13];
                if (!z10) {
                    z14 = z15;
                    if (z14 == fVar2.f2537c) {
                    }
                    if (i13 != 0 && z14) {
                        return layout.getLineLeft(iG);
                    }
                    if (i13 == runCount - 1 || z14) {
                        return z14 ? layout.getPrimaryHorizontal(fVarArr[i13 - 1].f2535a) : layout.getPrimaryHorizontal(fVarArr[i13 + 1].f2535a);
                    }
                    return layout.getLineRight(iG);
                }
                z14 = z15;
                z14 = !z14;
                if (i13 != 0) {
                }
                if (i13 == runCount - 1) {
                }
                if (z14) {
                }
            }
            z13 = true;
        }
        boolean z18 = (z10 || z15 == layout.isRtlCharAt(lineStart)) ? z15 == 0 ? z13 : false : z15;
        return (iC != lineStart ? z18 : !z18) ? layout.getLineRight(iG) : layout.getLineLeft(iG);
    }

    public final int c(int i10, int i11) {
        while (i10 > i11) {
            char cCharAt = this.f2538a.getText().charAt(i10 - 1);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\u1680' && ((d7.a.o(cCharAt, 8192) < 0 || d7.a.o(cCharAt, 8202) > 0 || cCharAt == '\u2007') && cCharAt != '\u205f' && cCharAt != '\u3000')) {
                break;
            }
            i10--;
        }
        return i10;
    }
}
