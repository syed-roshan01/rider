package u;

import android.text.Layout;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class t extends d9.j implements c9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f14931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Serializable f14933c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f14934d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(long j10, float[] fArr, d9.s sVar, d9.r rVar) {
        super(1);
        this.f14931a = j10;
        this.f14932b = fArr;
        this.f14933c = sVar;
        this.f14934d = rVar;
    }

    @Override // c9.c
    public final Object invoke(Object obj) {
        int i10;
        boolean z10;
        boolean z11;
        float fA;
        float fA2;
        q8.l lVar = q8.l.f13235a;
        a2.m mVar = (a2.m) obj;
        float[] fArr = (float[]) this.f14932b;
        d9.s sVar = (d9.s) this.f14933c;
        d9.r rVar = (d9.r) this.f14934d;
        int i11 = mVar.f948b;
        long j10 = this.f14931a;
        int iE = i11 > a2.b0.e(j10) ? mVar.f948b : a2.b0.e(j10);
        int iD = a2.b0.d(j10);
        int iD2 = mVar.f949c;
        if (iD2 >= iD) {
            iD2 = a2.b0.d(j10);
        }
        long jG = o1.s.g(mVar.a(iE), mVar.a(iD2));
        int i12 = sVar.f4950a;
        a2.a aVar = (a2.a) mVar.f947a;
        aVar.getClass();
        int iE2 = a2.b0.e(jG);
        int iD3 = a2.b0.d(jG);
        b2.v vVar = aVar.f889d;
        Layout layout = vVar.f2578d;
        int length = layout.getText().length();
        if (iE2 < 0) {
            throw new IllegalArgumentException("startOffset must be > 0".toString());
        }
        if (iE2 >= length) {
            throw new IllegalArgumentException("startOffset must be less than text length".toString());
        }
        if (iD3 <= iE2) {
            throw new IllegalArgumentException("endOffset must be greater than startOffset".toString());
        }
        if (iD3 > length) {
            throw new IllegalArgumentException("endOffset must be smaller or equal to text length".toString());
        }
        if (fArr.length - i12 < (iD3 - iE2) * 4) {
            throw new IllegalArgumentException("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4".toString());
        }
        int lineForOffset = layout.getLineForOffset(iE2);
        int lineForOffset2 = layout.getLineForOffset(iD3 - 1);
        b2.d dVar = new b2.d(vVar);
        if (lineForOffset <= lineForOffset2) {
            while (true) {
                int lineStart = layout.getLineStart(lineForOffset);
                int i13 = i12;
                int iE3 = vVar.e(lineForOffset);
                int iMax = Math.max(iE2, lineStart);
                int iMin = Math.min(iD3, iE3);
                float f10 = vVar.f(lineForOffset);
                float fD = vVar.d(lineForOffset);
                int i14 = iE2;
                int i15 = iD3;
                boolean z12 = false;
                boolean z13 = layout.getParagraphDirection(lineForOffset) == 1;
                boolean z14 = !z13;
                int i16 = iMax;
                int i17 = i13;
                while (i16 < iMin) {
                    boolean zIsRtlCharAt = layout.isRtlCharAt(i16);
                    if (!z13 || zIsRtlCharAt) {
                        i10 = iMin;
                        if (z13 && zIsRtlCharAt) {
                            z10 = z13;
                            fA = dVar.a(i16, false, false, false);
                            fA2 = dVar.a(i16 + 1, true, true, false);
                            z11 = false;
                        } else {
                            z10 = z13;
                            if (z14 && zIsRtlCharAt) {
                                float fA3 = dVar.a(i16, false, false, true);
                                fA2 = dVar.a(i16 + 1, true, true, true);
                                fA = fA3;
                                z11 = false;
                            } else {
                                z11 = false;
                                float fA4 = dVar.a(i16, false, false, false);
                                fA = dVar.a(i16 + 1, true, true, false);
                                fA2 = fA4;
                            }
                        }
                    } else {
                        i10 = iMin;
                        z10 = z13;
                        fA2 = dVar.a(i16, z12, z12, true);
                        z11 = false;
                        fA = dVar.a(i16 + 1, true, true, true);
                    }
                    fArr[i17] = fA2;
                    fArr[i17 + 1] = f10;
                    fArr[i17 + 2] = fA;
                    fArr[i17 + 3] = fD;
                    i17 += 4;
                    i16++;
                    iMin = i10;
                    z12 = z11;
                    z13 = z10;
                }
                if (lineForOffset == lineForOffset2) {
                    break;
                }
                lineForOffset++;
                i12 = i17;
                iE2 = i14;
                iD3 = i15;
            }
        }
        int iC = (a2.b0.c(jG) * 4) + sVar.f4950a;
        for (int i18 = sVar.f4950a; i18 < iC; i18 += 4) {
            int i19 = i18 + 1;
            float f11 = fArr[i19];
            float f12 = rVar.f4949a;
            fArr[i19] = f11 + f12;
            int i20 = i18 + 3;
            fArr[i20] = fArr[i20] + f12;
        }
        sVar.f4950a = iC;
        rVar.f4949a = aVar.b() + rVar.f4949a;
        return lVar;
    }
}
