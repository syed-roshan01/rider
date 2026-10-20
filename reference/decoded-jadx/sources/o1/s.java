package o1;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Shader;
import android.os.Binder;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.text.Layout;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.h1;
import androidx.lifecycle.x0;
import b3.w0;
import com.ride.accepter.R;
import e1.k0;
import h0.p0;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.UUID;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import m0.g1;
import m0.l2;
import m0.x1;
import m9.m0;
import m9.y1;
import org.xmlpull.v1.XmlPullParser;
import t.q0;
import t1.r1;
import u1.s1;
import u1.y0;

/* JADX INFO: loaded from: classes.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f12411a = new a(1000);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f12412b = 0;

    public static final androidx.lifecycle.w A(View view) {
        d7.a.m(view, "<this>");
        return (androidx.lifecycle.w) k9.k.G0(k9.k.H0(k9.l.F0(h1.f2140b, view), h1.f2141c));
    }

    public static final int B(f2.l lVar, int i10) {
        boolean z10 = d7.a.o(lVar.f6122a, f2.l.f6114b.f6122a) >= 0;
        boolean zA = f2.j.a(i10, 1);
        if (zA && z10) {
            return 3;
        }
        if (z10) {
            return 1;
        }
        return zA ? 2 : 0;
    }

    public static int C(Context context, int i10, int i11) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i10, typedValue, true);
        return typedValue.resourceId != 0 ? i10 : i11;
    }

    public static SharedPreferences D(Context context) {
        return context.getSharedPreferences(context.getPackageName() + "_preferences", 0);
    }

    public static final float E(Layout layout, int i10, Paint paint) {
        float fAbs;
        float width;
        float lineLeft = layout.getLineLeft(i10);
        b2.u uVar = b2.w.f2590a;
        if (layout.getEllipsisCount(i10) <= 0 || layout.getParagraphDirection(i10) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float fMeasureText = paint.measureText("\u2026") + (layout.getPrimaryHorizontal(layout.getEllipsisStart(i10) + layout.getLineStart(i10)) - lineLeft);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i10);
        if (paragraphAlignment != null && d2.d.f4350a[paragraphAlignment.ordinal()] == 1) {
            fAbs = Math.abs(lineLeft);
            width = (layout.getWidth() - fMeasureText) / 2.0f;
        } else {
            fAbs = Math.abs(lineLeft);
            width = layout.getWidth() - fMeasureText;
        }
        return width + fAbs;
    }

    public static final float F(Layout layout, int i10, Paint paint) {
        float width;
        float width2;
        b2.u uVar = b2.w.f2590a;
        if (layout.getEllipsisCount(i10) <= 0 || layout.getParagraphDirection(i10) != -1 || layout.getWidth() >= layout.getLineRight(i10)) {
            return 0.0f;
        }
        float fMeasureText = paint.measureText("\u2026") + (layout.getLineRight(i10) - layout.getPrimaryHorizontal(layout.getEllipsisStart(i10) + layout.getLineStart(i10)));
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i10);
        if (paragraphAlignment != null && d2.d.f4350a[paragraphAlignment.ordinal()] == 1) {
            width = layout.getWidth() - layout.getLineRight(i10);
            width2 = (layout.getWidth() - fMeasureText) / 2.0f;
        } else {
            width = layout.getWidth() - layout.getLineRight(i10);
            width2 = layout.getWidth() - fMeasureText;
        }
        return width - width2;
    }

    public static final int G(Layout layout, int i10, boolean z10) {
        if (i10 <= 0) {
            return 0;
        }
        if (i10 >= layout.getText().length()) {
            return layout.getLineCount() - 1;
        }
        int lineForOffset = layout.getLineForOffset(i10);
        int lineStart = layout.getLineStart(lineForOffset);
        int lineEnd = layout.getLineEnd(lineForOffset);
        if (lineStart != i10 && lineEnd != i10) {
            return lineForOffset;
        }
        if (lineStart == i10) {
            return z10 ? lineForOffset - 1 : lineForOffset;
        }
        return z10 ? lineForOffset : lineForOffset + 1;
    }

    public static ColorStateList H(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
        if (!S(xmlPullParser, "tint")) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(1, typedValue);
        int i10 = typedValue.type;
        if (i10 == 2) {
            throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
        }
        if (i10 >= 28 && i10 <= 31) {
            return ColorStateList.valueOf(typedValue.data);
        }
        Resources resources = typedArray.getResources();
        int resourceId = typedArray.getResourceId(1, 0);
        ThreadLocal threadLocal = t2.c.f14604a;
        try {
            return t2.c.a(resources, resources.getXml(resourceId), theme);
        } catch (Exception e4) {
            Log.e("CSLCompat", "Failed to inflate ColorStateList.", e4);
            return null;
        }
    }

    public static h0.i I(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i10) {
        h0.i iVarA;
        if (S(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i10, typedValue);
            int i11 = typedValue.type;
            if (i11 >= 28 && i11 <= 31) {
                return new h0.i((Shader) null, (ColorStateList) null, typedValue.data);
            }
            try {
                iVarA = h0.i.a(typedArray.getResources(), typedArray.getResourceId(i10, 0), theme);
            } catch (Exception e4) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e4);
                iVarA = null;
            }
            if (iVarA != null) {
                return iVarA;
            }
        }
        return new h0.i((Shader) null, (ColorStateList) null, 0);
    }

    public static final Object J(y1.j jVar, y1.u uVar) {
        Object obj = jVar.f16786a.get(uVar);
        if (obj == null) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x006a A[LOOP:0: B:4:0x000b->B:37:0x006a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:42:0x006d A[EDGE_INSN: B:42:0x006d->B:38:0x006d BREAK  A[LOOP:0: B:4:0x000b->B:37:0x006a], SYNTHETIC] */
    public static final r1 K(androidx.compose.ui.node.a aVar) {
        y0.n nVar = aVar.C.f14579e;
        Object obj = null;
        if ((nVar.f16733d & 8) != 0) {
            loop0: while (nVar != null) {
                if ((nVar.f16732c & 8) == 0) {
                    if ((nVar.f16733d & 8) != 0) {
                        break;
                        break;
                    }
                    nVar = nVar.f16735f;
                } else {
                    y0.n nVarF = nVar;
                    o0.i iVar = null;
                    while (nVarF != null) {
                        if (nVarF instanceof r1) {
                            if (((r1) nVarF).d0()) {
                                obj = nVarF;
                                break loop0;
                            }
                        } else if ((nVarF.f16732c & 8) != 0 && (nVarF instanceof t1.o)) {
                            int i10 = 0;
                            for (y0.n nVar2 = ((t1.o) nVarF).f14521v; nVar2 != null; nVar2 = nVar2.f16735f) {
                                if ((nVar2.f16732c & 8) != 0) {
                                    i10++;
                                    if (i10 == 1) {
                                        nVarF = nVar2;
                                    } else {
                                        if (iVar == null) {
                                            iVar = new o0.i(new y0.n[16]);
                                        }
                                        if (nVarF != null) {
                                            iVar.c(nVarF);
                                            nVarF = null;
                                        }
                                        iVar.c(nVar2);
                                    }
                                }
                            }
                            if (i10 == 1) {
                            }
                        }
                        nVarF = t1.g.f(iVar);
                    }
                    if ((nVar.f16733d & 8) != 0) {
                        break;
                    }
                    nVar = nVar.f16735f;
                }
            }
        }
        return (r1) obj;
    }

    public static final a2.e L(g2.a0 a0Var) {
        a2.e eVar = a0Var.f6509a;
        eVar.getClass();
        long j10 = a0Var.f6510b;
        return eVar.subSequence(a2.b0.e(j10), a2.b0.d(j10));
    }

    public static final long M(double d10) {
        return c0((float) d10, 4294967296L);
    }

    public static final long N(int i10) {
        return c0(i10, 4294967296L);
    }

    public static String O(TypedArray typedArray, int i10, int i11) {
        String string = typedArray.getString(i10);
        return string == null ? typedArray.getString(i11) : string;
    }

    public static final a2.e P(g2.a0 a0Var, int i10) {
        a2.e eVar = a0Var.f6509a;
        long j10 = a0Var.f6510b;
        return eVar.subSequence(a2.b0.d(j10), Math.min(a2.b0.d(j10) + i10, a0Var.f6509a.f918a.length()));
    }

    public static final a2.e Q(g2.a0 a0Var, int i10) {
        a2.e eVar = a0Var.f6509a;
        long j10 = a0Var.f6510b;
        return eVar.subSequence(Math.max(0, a2.b0.e(j10) - i10), a2.b0.e(j10));
    }

    public static final m9.d0 R(x0 x0Var) {
        m9.d0 d0Var = (m9.d0) x0Var.getTag("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY");
        if (d0Var != null) {
            return d0Var;
        }
        y1 y1VarK = d7.t.k();
        t9.d dVar = m0.f11969a;
        return (m9.d0) x0Var.setTagIfAbsent("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY", new androidx.lifecycle.e(y1VarK.O(((n9.d) r9.o.f13724a).f12323f)));
    }

    public static boolean S(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static int T(int i10) {
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 4) {
            return 2;
        }
        if (i10 == 8) {
            return 3;
        }
        if (i10 == 16) {
            return 4;
        }
        if (i10 == 32) {
            return 5;
        }
        if (i10 == 64) {
            return 6;
        }
        if (i10 == 128) {
            return 7;
        }
        if (i10 == 256) {
            return 8;
        }
        throw new IllegalArgumentException(l.q.g("type needs to be >= FIRST and <= LAST, type=", i10));
    }

    public static final boolean U(float[] fArr, float[] fArr2) {
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[2];
        float f13 = fArr[3];
        float f14 = fArr[4];
        float f15 = fArr[5];
        float f16 = fArr[6];
        float f17 = fArr[7];
        float f18 = fArr[8];
        float f19 = fArr[9];
        float f20 = fArr[10];
        float f21 = fArr[11];
        float f22 = fArr[12];
        float f23 = fArr[13];
        float f24 = fArr[14];
        float f25 = fArr[15];
        float f26 = (f10 * f15) - (f11 * f14);
        float f27 = (f10 * f16) - (f12 * f14);
        float f28 = (f10 * f17) - (f13 * f14);
        float f29 = (f11 * f16) - (f12 * f15);
        float f30 = (f11 * f17) - (f13 * f15);
        float f31 = (f12 * f17) - (f13 * f16);
        float f32 = (f18 * f23) - (f19 * f22);
        float f33 = (f18 * f24) - (f20 * f22);
        float f34 = (f18 * f25) - (f21 * f22);
        float f35 = (f19 * f24) - (f20 * f23);
        float f36 = (f19 * f25) - (f21 * f23);
        float f37 = (f20 * f25) - (f21 * f24);
        float f38 = (f31 * f32) + (((f29 * f34) + ((f28 * f35) + ((f26 * f37) - (f27 * f36)))) - (f30 * f33));
        if (f38 == 0.0f) {
            return false;
        }
        float f39 = 1.0f / f38;
        fArr2[0] = ((f17 * f35) + ((f15 * f37) - (f16 * f36))) * f39;
        fArr2[1] = (((f12 * f36) + ((-f11) * f37)) - (f13 * f35)) * f39;
        fArr2[2] = ((f25 * f29) + ((f23 * f31) - (f24 * f30))) * f39;
        fArr2[3] = (((f20 * f30) + ((-f19) * f31)) - (f21 * f29)) * f39;
        float f40 = -f14;
        fArr2[4] = (((f16 * f34) + (f40 * f37)) - (f17 * f33)) * f39;
        fArr2[5] = ((f13 * f33) + ((f37 * f10) - (f12 * f34))) * f39;
        float f41 = -f22;
        fArr2[6] = (((f24 * f28) + (f41 * f31)) - (f25 * f27)) * f39;
        fArr2[7] = ((f21 * f27) + ((f31 * f18) - (f20 * f28))) * f39;
        fArr2[8] = ((f17 * f32) + ((f14 * f36) - (f15 * f34))) * f39;
        fArr2[9] = (((f34 * f11) + ((-f10) * f36)) - (f13 * f32)) * f39;
        fArr2[10] = ((f25 * f26) + ((f22 * f30) - (f23 * f28))) * f39;
        fArr2[11] = (((f28 * f19) + ((-f18) * f30)) - (f21 * f26)) * f39;
        fArr2[12] = (((f15 * f33) + (f40 * f35)) - (f16 * f32)) * f39;
        fArr2[13] = ((f12 * f32) + ((f10 * f35) - (f11 * f33))) * f39;
        fArr2[14] = (((f23 * f27) + (f41 * f29)) - (f24 * f26)) * f39;
        fArr2[15] = ((f20 * f26) + ((f18 * f29) - (f19 * f27))) * f39;
        return true;
    }

    public static final boolean V(long j10) {
        m2.o[] oVarArr = m2.n.f11819b;
        return (j10 & 1095216660480L) == 0;
    }

    public static final float W(float f10, float f11, float f12) {
        return (f12 * f11) + ((1 - f12) * f10);
    }

    public static final int X(int i10, int i11, float f10) {
        return d7.t.o0(((double) (i11 - i10)) * ((double) f10)) + i10;
    }

    public static final s1.i Y(c9.a aVar) {
        return new s1.i(aVar);
    }

    public static TypedArray Z(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static final long a(int i10, int i11, int i12, int i13) {
        if (i11 < i10) {
            throw new IllegalArgumentException(("maxWidth(" + i11 + ") must be >= than minWidth(" + i10 + ')').toString());
        }
        if (i13 < i12) {
            throw new IllegalArgumentException(("maxHeight(" + i13 + ") must be >= than minHeight(" + i12 + ')').toString());
        }
        if (i10 >= 0 && i12 >= 0) {
            return l2.l.c(i10, i11, i12, i13);
        }
        throw new IllegalArgumentException(("minWidth(" + i10 + ") and minHeight(" + i12 + ") must be >= 0").toString());
    }

    public static final long a0(long j10, int i10, int i11) {
        int iK = m2.a.k(j10) + i10;
        if (iK < 0) {
            iK = 0;
        }
        int i12 = m2.a.i(j10);
        if (i12 != Integer.MAX_VALUE && (i12 = i12 + i10) < 0) {
            i12 = 0;
        }
        int iJ = m2.a.j(j10) + i11;
        if (iJ < 0) {
            iJ = 0;
        }
        int iH = m2.a.h(j10);
        if (iH != Integer.MAX_VALUE) {
            int i13 = iH + i11;
            iH = i13 >= 0 ? i13 : 0;
        }
        return a(iK, i12, iJ, iH);
    }

    public static /* synthetic */ long b(int i10, int i11, int i12) {
        if ((i12 & 2) != 0) {
            i10 = Integer.MAX_VALUE;
        }
        if ((i12 & 8) != 0) {
            i11 = Integer.MAX_VALUE;
        }
        return a(0, i10, 0, i11);
    }

    public static /* synthetic */ long b0(long j10, int i10, int i11, int i12) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return a0(j10, i10, i11);
    }

    public static final m2.d c(Context context) {
        n2.a aVarA;
        float f10 = context.getResources().getConfiguration().fontScale;
        if (((Boolean) m2.h.f11806a.getValue()).booleanValue() || (aVarA = n2.b.a(f10)) == null) {
            aVarA = new m2.m(f10);
        }
        return new m2.d(context.getResources().getDisplayMetrics().density, f10, aVarA);
    }

    public static final long c0(float f10, long j10) {
        long jFloatToIntBits = j10 | (((long) Float.floatToIntBits(f10)) & 4294967295L);
        m2.o[] oVarArr = m2.n.f11819b;
        return jFloatToIntBits;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:27:0x004e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0052  */
    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:40:0x0071  */
    /* JADX WARN: Code duplicated, block: B:42:0x0074  */
    /* JADX WARN: Code duplicated, block: B:43:0x007c  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:59:0x012c  */
    /* JADX WARN: Code duplicated, block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15, types: [boolean, int] */
    public static final void d(c9.a aVar, o2.o oVar, c9.e eVar, m0.m mVar, int i10, int i11) {
        int i12;
        o2.o oVar2;
        int i13;
        ?? r10;
        o2.o oVar3;
        View view;
        m2.b bVar;
        m2.l lVar;
        m0.o oVarK;
        g1 g1VarM0;
        UUID uuid;
        boolean zG;
        Object objP;
        o2.n nVar;
        o2.o oVar4;
        x1 x1VarX;
        m0.q qVar = (m0.q) mVar;
        qVar.a0(-2032877254);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (qVar.i(aVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i14 = i11 & 2;
        if (i14 == 0) {
            if ((i10 & 112) == 0) {
                oVar2 = oVar;
                i12 |= qVar.g(oVar2) ? 32 : 16;
            }
            if ((i11 & 4) != 0) {
                i12 |= 384;
            } else if ((i10 & 896) == 0) {
                if (qVar.i(eVar)) {
                    i13 = 256;
                } else {
                    i13 = 128;
                }
                i12 |= i13;
            }
            if ((i12 & 731) == 146 || !qVar.G()) {
                r10 = 0;
                if (i14 != 0) {
                    oVar3 = new o2.o(false, false, 7);
                } else {
                    oVar3 = oVar2;
                }
                view = (View) qVar.m(y0.f15381f);
                bVar = (m2.b) qVar.m(s1.f15275e);
                lVar = (m2.l) qVar.m(s1.f15281k);
                oVarK = m9.e0.K(qVar);
                g1VarM0 = d7.t.m0(eVar, qVar);
                uuid = (UUID) x3.c.d(new Object[0], null, o2.d.f12459b, qVar, 6);
                qVar.Z(511388516);
                zG = qVar.g(view) | qVar.g(bVar);
                objP = qVar.P();
                if (zG || objP == m0.l.f11578a) {
                    o2.p pVar = new o2.p(aVar, oVar3, view, lVar, bVar, uuid);
                    u0.b bVar2 = new u0.b(488261145, new o2.c(g1VarM0, 1), true);
                    nVar = pVar.f12493n;
                    nVar.setParentCompositionContext(oVarK);
                    nVar.f12484q.setValue(bVar2);
                    nVar.f12486s = true;
                    if (nVar.f15016d != null && !nVar.isAttachedToWindow()) {
                        throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.".toString());
                    }
                    nVar.c();
                    qVar.l0(pVar);
                    objP = pVar;
                    r10 = 0;
                }
                qVar.t(r10);
                o2.p pVar2 = (o2.p) objP;
                m0.s.a(pVar2, new o2.a(pVar2, r10), qVar);
                m0.s.d(new q0(pVar2, aVar, oVar3, lVar, 2), qVar);
                oVar4 = oVar3;
            } else {
                qVar.U();
                oVar4 = oVar2;
            }
            x1VarX = qVar.x();
            if (x1VarX != null) {
                x1VarX.f11756d = new a0.r(aVar, oVar4, eVar, i10, i11, 5);
            }
        }
        i12 |= 48;
        oVar2 = oVar;
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            if (qVar.i(eVar)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i12 |= i13;
        }
        if ((i12 & 731) == 146) {
            r10 = 0;
            if (i14 != 0) {
                oVar3 = new o2.o(false, false, 7);
            } else {
                oVar3 = oVar2;
            }
            view = (View) qVar.m(y0.f15381f);
            bVar = (m2.b) qVar.m(s1.f15275e);
            lVar = (m2.l) qVar.m(s1.f15281k);
            oVarK = m9.e0.K(qVar);
            g1VarM0 = d7.t.m0(eVar, qVar);
            uuid = (UUID) x3.c.d(new Object[0], null, o2.d.f12459b, qVar, 6);
            qVar.Z(511388516);
            zG = qVar.g(view) | qVar.g(bVar);
            objP = qVar.P();
            if (zG) {
                o2.p pVar3 = new o2.p(aVar, oVar3, view, lVar, bVar, uuid);
                u0.b bVar3 = new u0.b(488261145, new o2.c(g1VarM0, 1), true);
                nVar = pVar3.f12493n;
                nVar.setParentCompositionContext(oVarK);
                nVar.f12484q.setValue(bVar3);
                nVar.f12486s = true;
                if (nVar.f15016d != null) {
                }
                nVar.c();
                qVar.l0(pVar3);
                objP = pVar3;
                r10 = 0;
            } else {
                o2.p pVar4 = new o2.p(aVar, oVar3, view, lVar, bVar, uuid);
                u0.b bVar4 = new u0.b(488261145, new o2.c(g1VarM0, 1), true);
                nVar = pVar4.f12493n;
                nVar.setParentCompositionContext(oVarK);
                nVar.f12484q.setValue(bVar4);
                nVar.f12486s = true;
                if (nVar.f15016d != null) {
                }
                nVar.c();
                qVar.l0(pVar4);
                objP = pVar4;
                r10 = 0;
            }
            qVar.t(r10);
            o2.p pVar5 = (o2.p) objP;
            m0.s.a(pVar5, new o2.a(pVar5, r10), qVar);
            m0.s.d(new q0(pVar5, aVar, oVar3, lVar, 2), qVar);
            oVar4 = oVar3;
        } else {
            r10 = 0;
            if (i14 != 0) {
                oVar3 = new o2.o(false, false, 7);
            } else {
                oVar3 = oVar2;
            }
            view = (View) qVar.m(y0.f15381f);
            bVar = (m2.b) qVar.m(s1.f15275e);
            lVar = (m2.l) qVar.m(s1.f15281k);
            oVarK = m9.e0.K(qVar);
            g1VarM0 = d7.t.m0(eVar, qVar);
            uuid = (UUID) x3.c.d(new Object[0], null, o2.d.f12459b, qVar, 6);
            qVar.Z(511388516);
            zG = qVar.g(view) | qVar.g(bVar);
            objP = qVar.P();
            if (zG) {
                o2.p pVar6 = new o2.p(aVar, oVar3, view, lVar, bVar, uuid);
                u0.b bVar5 = new u0.b(488261145, new o2.c(g1VarM0, 1), true);
                nVar = pVar6.f12493n;
                nVar.setParentCompositionContext(oVarK);
                nVar.f12484q.setValue(bVar5);
                nVar.f12486s = true;
                if (nVar.f15016d != null) {
                }
                nVar.c();
                qVar.l0(pVar6);
                objP = pVar6;
                r10 = 0;
            } else {
                o2.p pVar7 = new o2.p(aVar, oVar3, view, lVar, bVar, uuid);
                u0.b bVar6 = new u0.b(488261145, new o2.c(g1VarM0, 1), true);
                nVar = pVar7.f12493n;
                nVar.setParentCompositionContext(oVarK);
                nVar.f12484q.setValue(bVar6);
                nVar.f12486s = true;
                if (nVar.f15016d != null) {
                }
                nVar.c();
                qVar.l0(pVar7);
                objP = pVar7;
                r10 = 0;
            }
            qVar.t(r10);
            o2.p pVar8 = (o2.p) objP;
            m0.s.a(pVar8, new o2.a(pVar8, r10), qVar);
            m0.s.d(new q0(pVar8, aVar, oVar3, lVar, 2), qVar);
            oVar4 = oVar3;
        }
        x1VarX = qVar.x();
        if (x1VarX != null) {
            x1VarX.f11756d = new a0.r(aVar, oVar4, eVar, i10, i11, 5);
        }
    }

    public static byte[] d0(InputStream inputStream, int i10) throws IOException {
        byte[] bArr = new byte[i10];
        int i11 = 0;
        while (i11 < i10) {
            int i12 = inputStream.read(bArr, i11, i10 - i11);
            if (i12 < 0) {
                throw new IllegalStateException(l.q.g("Not enough bytes to read: ", i10));
            }
            i11 += i12;
        }
        return bArr;
    }

    public static final long e(int i10, int i11) {
        return (((long) i11) & 4294967295L) | (((long) i10) << 32);
    }

    public static byte[] e0(FileInputStream fileInputStream, int i10, int i11) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i11];
            byte[] bArr2 = new byte[2048];
            int i12 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i12 < i10) {
                int i13 = fileInputStream.read(bArr2);
                if (i13 < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i10 + " bytes");
                }
                inflater.setInput(bArr2, 0, i13);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i11 - iInflate);
                    i12 += i13;
                } catch (DataFormatException e4) {
                    throw new IllegalStateException(e4.getMessage());
                }
            }
            if (i12 == i10) {
                if (!inflater.finished()) {
                    throw new IllegalStateException("Inflater did not finish");
                }
                inflater.end();
                return bArr;
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i10 + " actual=" + i12);
        } catch (Throwable th) {
            inflater.end();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0061 A[LOOP:0: B:4:0x000b->B:35:0x0061, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:40:0x0064 A[EDGE_INSN: B:40:0x0064->B:36:0x0064 BREAK  A[LOOP:0: B:4:0x000b->B:35:0x0061], SYNTHETIC] */
    public static final y1.o f(androidx.compose.ui.node.a aVar, boolean z10) {
        y0.n nVar = aVar.C.f14579e;
        t1.n nVar2 = null;
        if ((nVar.f16733d & 8) != 0) {
            loop0: while (nVar != null) {
                if ((nVar.f16732c & 8) == 0) {
                    if ((nVar.f16733d & 8) != 0) {
                        break;
                        break;
                    }
                    nVar = nVar.f16735f;
                } else {
                    y0.n nVarF = nVar;
                    o0.i iVar = null;
                    while (nVarF != null) {
                        if (nVarF instanceof r1) {
                            nVar2 = nVarF;
                            break loop0;
                        }
                        if ((nVarF.f16732c & 8) != 0 && (nVarF instanceof t1.o)) {
                            int i10 = 0;
                            for (y0.n nVar3 = ((t1.o) nVarF).f14521v; nVar3 != null; nVar3 = nVar3.f16735f) {
                                if ((nVar3.f16732c & 8) != 0) {
                                    i10++;
                                    if (i10 == 1) {
                                        nVarF = nVar3;
                                    } else {
                                        if (iVar == null) {
                                            iVar = new o0.i(new y0.n[16]);
                                        }
                                        if (nVarF != null) {
                                            iVar.c(nVarF);
                                            nVarF = null;
                                        }
                                        iVar.c(nVar3);
                                    }
                                }
                            }
                            if (i10 == 1) {
                            }
                        }
                        nVarF = t1.g.f(iVar);
                    }
                    if ((nVar.f16733d & 8) != 0) {
                        break;
                    }
                    nVar = nVar.f16735f;
                }
            }
        }
        d7.a.j(nVar2);
        y0.n nVar4 = ((y0.n) ((r1) nVar2)).f16730a;
        y1.j jVarN = aVar.n();
        d7.a.j(jVarN);
        return new y1.o(nVar4, z10, aVar, jVarN);
    }

    public static long f0(InputStream inputStream, int i10) throws IOException {
        byte[] bArrD0 = d0(inputStream, i10);
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j10 += ((long) (bArrD0[i11] & 255)) << (i11 * 8);
        }
        return j10;
    }

    public static final long g(int i10, int i11) {
        if (i10 < 0) {
            throw new IllegalArgumentException(("start cannot be negative. [start: " + i10 + ", end: " + i11 + ']').toString());
        }
        if (i11 >= 0) {
            long j10 = (((long) i11) & 4294967295L) | (((long) i10) << 32);
            int i12 = a2.b0.f904c;
            return j10;
        }
        throw new IllegalArgumentException(("end cannot be negative. [start: " + i10 + ", end: " + i11 + ']').toString());
    }

    public static final a2.c0 g0(a2.c0 c0Var, m2.l lVar) {
        int i10;
        a2.x xVar = c0Var.f911a;
        int i11 = a2.y.f1051e;
        l2.o cVar = xVar.f1031a;
        cVar.getClass();
        l2.m mVar = l2.m.f11216a;
        if (d7.a.d(cVar, mVar)) {
            long j10 = a2.y.f1050d;
            cVar = j10 != e1.r.f5065g ? new l2.c(j10) : mVar;
        }
        l2.o oVar = cVar;
        long j11 = xVar.f1032b;
        if (V(j11)) {
            j11 = a2.y.f1047a;
        }
        long j12 = j11;
        f2.l lVar2 = xVar.f1033c;
        if (lVar2 == null) {
            lVar2 = f2.l.f6115c;
        }
        f2.l lVar3 = lVar2;
        f2.j jVar = xVar.f1034d;
        f2.j jVar2 = new f2.j(jVar != null ? jVar.f6112a : 0);
        f2.k kVar = xVar.f1035e;
        f2.k kVar2 = new f2.k(kVar != null ? kVar.f6113a : 1);
        f2.e eVar = xVar.f1036f;
        if (eVar == null) {
            eVar = f2.e.f6101a;
        }
        f2.e eVar2 = eVar;
        String str = xVar.f1037g;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        long j13 = xVar.f1038h;
        if (V(j13)) {
            j13 = a2.y.f1048b;
        }
        l2.a aVar = xVar.f1039i;
        l2.a aVar2 = new l2.a(aVar != null ? aVar.f11194a : 0.0f);
        l2.p pVar = xVar.f1040j;
        if (pVar == null) {
            pVar = l2.p.f11219c;
        }
        l2.p pVar2 = pVar;
        h2.d dVarA = xVar.f1041k;
        if (dVarA == null) {
            dVarA = h2.f.f7541a.a();
        }
        h2.d dVar = dVarA;
        long j14 = e1.r.f5065g;
        long j15 = xVar.f1042l;
        if (j15 == j14) {
            j15 = a2.y.f1049c;
        }
        long j16 = j15;
        l2.j jVar3 = xVar.f1043m;
        if (jVar3 == null) {
            jVar3 = l2.j.f11211b;
        }
        l2.j jVar4 = jVar3;
        k0 k0Var = xVar.f1044n;
        if (k0Var == null) {
            k0Var = k0.f5038d;
        }
        k0 k0Var2 = k0Var;
        a2.s sVar = xVar.f1045o;
        g1.h hVar = xVar.f1046p;
        if (hVar == null) {
            hVar = g1.j.f6502a;
        }
        a2.x xVar2 = new a2.x(oVar, j12, lVar3, jVar2, kVar2, eVar2, str2, j13, aVar2, pVar2, dVar, j16, jVar4, k0Var2, sVar, hVar);
        int i12 = a2.q.f967b;
        a2.p pVar3 = c0Var.f912b;
        int i13 = 5;
        int i14 = l2.i.a(pVar3.f957a, Integer.MIN_VALUE) ? 5 : pVar3.f957a;
        int i15 = pVar3.f958b;
        if (l2.k.a(i15, 3)) {
            int iOrdinal = lVar.ordinal();
            if (iOrdinal == 0) {
                i13 = 4;
                i10 = 1;
            } else {
                if (iOrdinal != 1) {
                    throw new androidx.fragment.app.a0();
                }
                i10 = 1;
            }
        } else if (l2.k.a(i15, Integer.MIN_VALUE)) {
            int iOrdinal2 = lVar.ordinal();
            if (iOrdinal2 != 0) {
                i10 = 1;
                if (iOrdinal2 != 1) {
                    throw new androidx.fragment.app.a0();
                }
                i13 = 2;
            } else {
                i10 = 1;
                i13 = 1;
            }
        } else {
            i10 = 1;
            i13 = i15;
        }
        long j17 = pVar3.f959c;
        if (V(j17)) {
            j17 = a2.q.f966a;
        }
        l2.q qVar = pVar3.f960d;
        if (qVar == null) {
            qVar = l2.q.f11222c;
        }
        a2.r rVar = pVar3.f961e;
        l2.g gVar = pVar3.f962f;
        int i16 = pVar3.f963g;
        if (i16 == 0) {
            i16 = l2.e.f11199b;
        }
        int i17 = pVar3.f964h;
        if (l2.d.a(i17, Integer.MIN_VALUE)) {
            i17 = i10;
        }
        l2.r rVar2 = pVar3.f965i;
        if (rVar2 == null) {
            rVar2 = l2.r.f11225c;
        }
        return new a2.c0(xVar2, new a2.p(i14, i13, j17, qVar, rVar, gVar, i16, i17, rVar2), c0Var.f913c);
    }

    public static final void h(y0.o oVar, c9.e eVar, m0.m mVar, int i10, int i11) {
        int i12;
        m0.q qVar = (m0.q) mVar;
        qVar.a0(-1177876616);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (qVar.g(oVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            i12 |= qVar.i(eVar) ? 32 : 16;
        }
        if ((i12 & 91) == 18 && qVar.G()) {
            qVar.U();
        } else {
            if (i13 != 0) {
                oVar = y0.l.f16729b;
            }
            o2.e eVar2 = o2.e.f12463b;
            qVar.Z(-1323940314);
            int i14 = qVar.P;
            m0.r1 r1VarP = qVar.p();
            t1.l.f14477k.getClass();
            t1.j jVar = t1.k.f14458b;
            u0.b bVarI = androidx.compose.ui.layout.a.i(oVar);
            int i15 = (((((i12 << 3) & 112) | (((i12 >> 3) & 14) | 384)) << 9) & 7168) | 6;
            if (!(qVar.f11630a instanceof m0.d)) {
                m9.e0.C();
                throw null;
            }
            qVar.c0();
            if (qVar.O) {
                qVar.o(jVar);
            } else {
                qVar.o0();
            }
            d7.t.s0(qVar, eVar2, t1.k.f14461e);
            d7.t.s0(qVar, r1VarP, t1.k.f14460d);
            t1.i iVar = t1.k.f14462f;
            if (qVar.O || !d7.a.d(qVar.P(), Integer.valueOf(i14))) {
                l.q.r(i14, qVar, i14, iVar);
            }
            l.q.s((i15 >> 3) & 112, bVarI, new l2(qVar), qVar, 2058660585);
            l.q.q((i15 >> 9) & 14, eVar, qVar, false, true);
            qVar.t(false);
        }
        y0.o oVar2 = oVar;
        x1 x1VarX = qVar.x();
        if (x1VarX != null) {
            x1VarX.f11756d = new p0(oVar2, eVar, i10, i11, 2);
        }
    }

    public static final float h0(long j10, float f10, m2.b bVar) {
        float fC;
        long jB = m2.n.b(j10);
        if (m2.o.a(jB, 4294967296L)) {
            if (bVar.m() <= 1.05d) {
                return bVar.Z(j10);
            }
            fC = m2.n.c(j10) / m2.n.c(bVar.e0(f10));
        } else {
            if (!m2.o.a(jB, 8589934592L)) {
                return Float.NaN;
            }
            fC = m2.n.c(j10);
        }
        return fC * f10;
    }

    public static final boolean i(a2.c0 c0Var) {
        a2.r rVar;
        a2.t tVar = c0Var.f913c;
        a2.h hVar = (tVar == null || (rVar = tVar.f973b) == null) ? null : new a2.h(rVar.f970b);
        boolean z10 = false;
        if (hVar != null && hVar.f931a == 1) {
            z10 = true;
        }
        return !z10;
    }

    public static final void i0(View view, androidx.lifecycle.w wVar) {
        d7.a.m(view, "<this>");
        view.setTag(R.id.view_tree_lifecycle_owner, wVar);
    }

    public static androidx.concurrent.futures.m j(m9.i0 i0Var) {
        androidx.concurrent.futures.k kVar = new androidx.concurrent.futures.k();
        kVar.f1784c = new androidx.concurrent.futures.o();
        androidx.concurrent.futures.m mVar = new androidx.concurrent.futures.m(kVar);
        kVar.f1783b = mVar;
        kVar.f1782a = v3.a.class;
        try {
            i0Var.U(false, true, new u.s(28, kVar, i0Var));
            kVar.f1782a = "Deferred.asListenableFuture";
        } catch (Exception e4) {
            mVar.f1788b.setException(e4);
        }
        return mVar;
    }

    public static final void j0(Spannable spannable, long j10, int i10, int i11) {
        if (j10 != e1.r.f5065g) {
            spannable.setSpan(new ForegroundColorSpan(androidx.compose.ui.graphics.a.s(j10)), i10, i11, 33);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [r8.r] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v1 */
    public static final boolean k(ArrayList arrayList) {
        ?? arrayList2;
        long j10;
        if (arrayList.size() < 2) {
            return true;
        }
        if (arrayList.size() == 0 || arrayList.size() == 1) {
            arrayList2 = r8.r.f13661a;
        } else {
            arrayList2 = new ArrayList();
            Object obj = arrayList.get(0);
            int iY = d7.t.Y(arrayList);
            int i10 = 0;
            while (i10 < iY) {
                i10++;
                Object obj2 = arrayList.get(i10);
                y1.o oVar = (y1.o) obj2;
                y1.o oVar2 = (y1.o) obj;
                arrayList2.add(new d1.c(d9.i.f(Math.abs(d1.c.d(oVar2.e().a()) - d1.c.d(oVar.e().a())), Math.abs(d1.c.e(oVar2.e().a()) - d1.c.e(oVar.e().a())))));
                obj = obj2;
            }
        }
        if (((Collection) arrayList2).size() == 1) {
            j10 = ((d1.c) r8.p.F0(arrayList2)).f4330a;
        } else {
            if (arrayList2.isEmpty()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            Object objF0 = r8.p.F0(arrayList2);
            int iY2 = d7.t.Y(arrayList2);
            if (1 <= iY2) {
                int i11 = 1;
                while (true) {
                    objF0 = new d1.c(d1.c.g(((d1.c) objF0).f4330a, ((d1.c) arrayList2.get(i11)).f4330a));
                    if (i11 == iY2) {
                        break;
                    }
                    i11++;
                }
            }
            j10 = ((d1.c) objF0).f4330a;
        }
        return d1.c.e(j10) < d1.c.d(j10);
    }

    public static void k0(Window window, boolean z10) {
        if (Build.VERSION.SDK_INT >= 30) {
            b3.x0.a(window, z10);
        } else {
            w0.a(window, z10);
        }
    }

    public static void l(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static final void l0(Spannable spannable, long j10, m2.b bVar, int i10, int i11) {
        long jB = m2.n.b(j10);
        if (m2.o.a(jB, 4294967296L)) {
            spannable.setSpan(new AbsoluteSizeSpan(d7.t.p0(bVar.Z(j10)), false), i10, i11, 33);
        } else if (m2.o.a(jB, 8589934592L)) {
            spannable.setSpan(new RelativeSizeSpan(m2.n.c(j10)), i10, i11, 33);
        }
    }

    public static int m(Context context, String str) {
        int iC;
        int iMyPid = Process.myPid();
        int iMyUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, iMyPid, iMyUid) == -1) {
            return -1;
        }
        String strD = q2.j.d(str);
        if (strD != null) {
            if (packageName == null) {
                String[] packagesForUid = context.getPackageManager().getPackagesForUid(iMyUid);
                if (packagesForUid == null || packagesForUid.length <= 0) {
                    return -1;
                }
                packageName = packagesForUid[0];
            }
            int iMyUid2 = Process.myUid();
            String packageName2 = context.getPackageName();
            if (iMyUid2 == iMyUid && a3.b.a(packageName2, packageName) && Build.VERSION.SDK_INT >= 29) {
                AppOpsManager appOpsManagerC = q2.k.c(context);
                iC = q2.k.a(appOpsManagerC, strD, Binder.getCallingUid(), packageName);
                if (iC == 0) {
                    iC = q2.k.a(appOpsManagerC, strD, iMyUid, q2.k.b(context));
                }
            } else {
                iC = q2.j.c((AppOpsManager) q2.j.a(context, AppOpsManager.class), strD, packageName);
            }
            if (iC != 0) {
                return -2;
            }
        }
        return 0;
    }

    public static final long m0(long j10) {
        return d7.t.j((int) (j10 >> 32), (int) (j10 & 4294967295L));
    }

    public static byte[] n(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } catch (Throwable th) {
                try {
                    deflaterOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            deflater.end();
            throw th3;
        }
    }

    public static final long n0(long j10, long j11) {
        int iC;
        int iE = a2.b0.e(j10);
        int iD = a2.b0.d(j10);
        if (a2.b0.e(j11) >= a2.b0.d(j10) || a2.b0.e(j10) >= a2.b0.d(j11)) {
            if (iD > a2.b0.e(j11)) {
                iE -= a2.b0.c(j11);
                iC = a2.b0.c(j11);
                iD -= iC;
            }
        } else if (a2.b0.e(j11) > a2.b0.e(j10) || a2.b0.d(j10) > a2.b0.d(j11)) {
            if (a2.b0.e(j10) > a2.b0.e(j11) || a2.b0.d(j11) > a2.b0.d(j10)) {
                int iE2 = a2.b0.e(j11);
                if (iE >= a2.b0.d(j11) || iE2 > iE) {
                    iD = a2.b0.e(j11);
                } else {
                    iE = a2.b0.e(j11);
                    iC = a2.b0.c(j11);
                }
            } else {
                iC = a2.b0.c(j11);
            }
            iD -= iC;
        } else {
            iE = a2.b0.e(j11);
            iD = iE;
        }
        return g(iE, iD);
    }

    public static final long o(long j10, long j11) {
        return e(z6.a.r((int) (j11 >> 32), m2.a.k(j10), m2.a.i(j10)), z6.a.r((int) (j11 & 4294967295L), m2.a.j(j10), m2.a.h(j10)));
    }

    public static void o0(ByteArrayOutputStream byteArrayOutputStream, long j10, int i10) throws IOException {
        byte[] bArr = new byte[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            bArr[i11] = (byte) ((j10 >> (i11 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static final int p(int i10, long j10) {
        return z6.a.r(i10, m2.a.j(j10), m2.a.h(j10));
    }

    public static void p0(ByteArrayOutputStream byteArrayOutputStream, int i10) throws IOException {
        o0(byteArrayOutputStream, i10, 2);
    }

    public static final int q(int i10, long j10) {
        return z6.a.r(i10, m2.a.k(j10), m2.a.i(j10));
    }

    public static Handler r(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return m.d.a(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException e4) {
            e = e4;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InstantiationException e10) {
            e = e10;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (NoSuchMethodException e11) {
            e = e11;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InvocationTargetException e12) {
            Throwable cause = e12.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public static final void s(a2.i iVar, e1.p pVar, e1.n nVar, float f10, k0 k0Var, l2.j jVar, g1.h hVar, int i10) {
        ArrayList arrayList = iVar.f939h;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            a2.m mVar = (a2.m) arrayList.get(i11);
            ((a2.a) mVar.f947a).f(pVar, nVar, f10, k0Var, jVar, hVar, i10);
            pVar.e(0.0f, ((a2.a) mVar.f947a).b());
        }
    }

    public static final boolean t(int i10, int i11) {
        return i10 == i11;
    }

    public static final boolean u(int i10, int i11) {
        return i10 == i11;
    }

    public static final androidx.compose.ui.node.a v(androidx.compose.ui.node.a aVar, y1.n nVar) {
        for (androidx.compose.ui.node.a aVarQ = aVar.q(); aVarQ != null; aVarQ = aVarQ.q()) {
            if (((Boolean) nVar.invoke(aVarQ)).booleanValue()) {
                return aVarQ;
            }
        }
        return null;
    }

    public static final int w(int i10, ArrayList arrayList) {
        byte b10;
        int size = arrayList.size() - 1;
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) >>> 1;
            a2.m mVar = (a2.m) arrayList.get(i12);
            if (mVar.f948b > i10) {
                b10 = 1;
            } else {
                b10 = mVar.f949c <= i10 ? (byte) -1 : (byte) 0;
            }
            if (b10 < 0) {
                i11 = i12 + 1;
            } else {
                if (b10 <= 0) {
                    return i12;
                }
                size = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    public static final int x(int i10, ArrayList arrayList) {
        byte b10;
        int size = arrayList.size() - 1;
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) >>> 1;
            a2.m mVar = (a2.m) arrayList.get(i12);
            if (mVar.f950d > i10) {
                b10 = 1;
            } else {
                b10 = mVar.f951e <= i10 ? (byte) -1 : (byte) 0;
            }
            if (b10 < 0) {
                i11 = i12 + 1;
            } else {
                if (b10 <= 0) {
                    return i12;
                }
                size = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    public static final int y(ArrayList arrayList, float f10) {
        byte b10;
        int size = arrayList.size() - 1;
        int i10 = 0;
        while (i10 <= size) {
            int i11 = (i10 + size) >>> 1;
            a2.m mVar = (a2.m) arrayList.get(i11);
            if (mVar.f952f > f10) {
                b10 = 1;
            } else {
                b10 = mVar.f953g <= f10 ? (byte) -1 : (byte) 0;
            }
            if (b10 < 0) {
                i10 = i11 + 1;
            } else {
                if (b10 <= 0) {
                    return i11;
                }
                size = i11 - 1;
            }
        }
        return -(i10 + 1);
    }

    public static final void z(ArrayList arrayList, long j10, c9.c cVar) {
        int size = arrayList.size();
        for (int iW = w(a2.b0.e(j10), arrayList); iW < size; iW++) {
            a2.m mVar = (a2.m) arrayList.get(iW);
            if (mVar.f948b >= a2.b0.d(j10)) {
                return;
            }
            if (mVar.f948b != mVar.f949c) {
                cVar.invoke(mVar);
            }
        }
    }
}
