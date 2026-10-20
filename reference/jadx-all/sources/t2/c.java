package t2;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.ride.accepter.R;
import java.io.IOException;
import java.lang.reflect.Array;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f14604a = new ThreadLocal();

    public static ColorStateList a(Resources resources, XmlResourceParser xmlResourceParser, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return b(resources, xmlResourceParser, attributeSetAsAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0092  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.res.Resources] */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r33v0, types: [android.content.res.Resources] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r9v30 */
    /* JADX WARN: Type inference failed for: r9v31 */
    /* JADX WARN: Type inference failed for: r9v5, types: [android.content.res.TypedArray] */
    public static ColorStateList b(Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth;
        int color;
        int i10;
        int[] iArr;
        boolean z10;
        int iC;
        float f10;
        float f11;
        TypedValue typedValue;
        resources = resources;
        attributeSet = attributeSet;
        theme = theme;
        String name = xmlResourceParser.getName();
        if (!name.equals("selector")) {
            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": invalid color state list tag " + name);
        }
        ?? r10 = 1;
        int depth2 = xmlResourceParser.getDepth() + 1;
        Object[] objArr = new int[20][];
        int[] iArr2 = new int[20];
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == r10 || ((depth = xmlResourceParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlResourceParser.getName().equals("item")) {
                int[] iArr3 = p2.a.f12758a;
                ?? ObtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr3) : theme.obtainStyledAttributes(attributeSet, iArr3, i11, i11);
                int resourceId = ObtainAttributes.getResourceId(i11, -1);
                if (resourceId != -1) {
                    ThreadLocal threadLocal = f14604a;
                    TypedValue typedValue2 = (TypedValue) threadLocal.get();
                    if (typedValue2 == null) {
                        typedValue = new TypedValue();
                        threadLocal.set(typedValue);
                    } else {
                        typedValue = typedValue2;
                    }
                    resources.getValue(resourceId, typedValue, r10);
                    int i13 = typedValue.type;
                    if (i13 < 28 || i13 > 31) {
                        try {
                            color = a(resources, resources.getXml(resourceId), theme).getDefaultColor();
                        } catch (Exception unused) {
                            color = ObtainAttributes.getColor(i11, -65281);
                        }
                    } else {
                        color = ObtainAttributes.getColor(i11, -65281);
                    }
                } else {
                    color = ObtainAttributes.getColor(i11, -65281);
                }
                float f12 = ObtainAttributes.hasValue(r10) ? ObtainAttributes.getFloat(r10, 1.0f) : ObtainAttributes.hasValue(3) ? ObtainAttributes.getFloat(3, 1.0f) : 1.0f;
                float f13 = (Build.VERSION.SDK_INT < 31 || !ObtainAttributes.hasValue(2)) ? ObtainAttributes.getFloat(4, -1.0f) : ObtainAttributes.getFloat(2, -1.0f);
                ObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr4 = new int[attributeCount];
                int i14 = i11;
                for (int i15 = i14; i15 < attributeCount; i15++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i15);
                    if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != R.attr.alpha && attributeNameResource != R.attr.lStar) {
                        int i16 = i14 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i15, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr4[i14] = attributeNameResource;
                        i14 = i16;
                    }
                }
                int[] iArrTrimStateSet = StateSet.trimStateSet(iArr4, i14);
                float f14 = 0.0f;
                float f15 = 100.0f;
                boolean z11 = f13 >= 0.0f && f13 <= 100.0f;
                if (f12 != 1.0f || z11) {
                    int iAlpha = (int) ((Color.alpha(color) * f12) + 0.5f);
                    if (iAlpha < 0) {
                        i10 = 0;
                    } else {
                        i10 = 255;
                        if (iAlpha <= 255) {
                            i10 = iAlpha;
                        }
                    }
                    if (z11) {
                        a aVarA = a.a(color);
                        o oVar = o.f14625k;
                        float f16 = aVarA.f14595b;
                        if (f16 >= 1.0d && Math.round(f13) > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && Math.round(f13) < 100.0d) {
                            float f17 = aVarA.f14594a;
                            float fMin = f17 < 0.0f ? 0.0f : Math.min(360.0f, f17);
                            float f18 = 0.0f;
                            float f19 = f16;
                            a aVar = null;
                            boolean z12 = true;
                            while (true) {
                                if (Math.abs(f18 - f16) < 0.4f) {
                                    iArr = iArrTrimStateSet;
                                    depth2 = depth2;
                                    z10 = true;
                                    if (aVar != null) {
                                        iC = aVar.c(oVar);
                                        break;
                                    }
                                    iC = b.c(f13);
                                    break;
                                }
                                float f20 = 1000.0f;
                                float f21 = f14;
                                float f22 = f15;
                                float f23 = 1000.0f;
                                a aVar2 = null;
                                while (true) {
                                    if (Math.abs(f21 - f22) <= 0.01f) {
                                        depth2 = depth2;
                                        fMin = fMin;
                                        f15 = f15;
                                        z10 = true;
                                        float f24 = f14;
                                        iArr = iArrTrimStateSet;
                                        f10 = f24;
                                        break;
                                    }
                                    float f25 = ((f22 - f21) / 2.0f) + f21;
                                    int iC2 = a.b(f25, f19, fMin).c(o.f14625k);
                                    float fD = b.d(Color.red(iC2));
                                    float fD2 = b.d(Color.green(iC2));
                                    float fD3 = b.d(Color.blue(iC2));
                                    z10 = true;
                                    float[] fArr = b.f14603d[1];
                                    f15 = 100.0f;
                                    float f26 = ((fD3 * fArr[2]) + ((fD2 * fArr[1]) + (fD * fArr[0]))) / 100.0f;
                                    float fCbrt = f26 <= 0.008856452f ? f26 * 903.2963f : (((float) Math.cbrt(f26)) * 116.0f) - 16.0f;
                                    float fAbs = Math.abs(f13 - fCbrt);
                                    if (fAbs < 0.2f) {
                                        a aVarA2 = a.a(iC2);
                                        a aVarB = a.b(aVarA2.f14596c, aVarA2.f14595b, fMin);
                                        f11 = f25;
                                        float f27 = aVarA2.f14597d - aVarB.f14597d;
                                        fMin = fMin;
                                        float f28 = aVarA2.f14598e - aVarB.f14598e;
                                        float f29 = aVarA2.f14599f - aVarB.f14599f;
                                        double dSqrt = Math.sqrt((f29 * f29) + (f28 * f28) + (f27 * f27));
                                        iArr = iArrTrimStateSet;
                                        float fPow = (float) (Math.pow(dSqrt, 0.63d) * 1.41d);
                                        if (fPow <= 1.0f) {
                                            f23 = fPow;
                                            aVar2 = aVarA2;
                                            f20 = fAbs;
                                        }
                                    } else {
                                        f11 = f25;
                                        fMin = fMin;
                                        iArr = iArrTrimStateSet;
                                    }
                                    f10 = 0.0f;
                                    if (f20 == 0.0f && f23 == 0.0f) {
                                        break;
                                    }
                                    if (fCbrt < f13) {
                                        f21 = f11;
                                    } else {
                                        f22 = f11;
                                    }
                                    f15 = 100.0f;
                                    depth2 = depth2;
                                    fMin = fMin;
                                    int[] iArr5 = iArr;
                                    f14 = 0.0f;
                                    iArrTrimStateSet = iArr5;
                                }
                                a aVar3 = aVar2;
                                if (!z12) {
                                    if (aVar3 == null) {
                                        f16 = f19;
                                    } else {
                                        aVar = aVar3;
                                        f18 = f19;
                                    }
                                    f19 = ((f16 - f18) / 2.0f) + f18;
                                } else {
                                    if (aVar3 != null) {
                                        iC = aVar3.c(oVar);
                                        break;
                                    }
                                    f19 = ((f16 - f18) / 2.0f) + f18;
                                    z12 = false;
                                }
                                int[] iArr6 = iArr;
                                f14 = f10;
                                iArrTrimStateSet = iArr6;
                            }
                        } else {
                            iArr = iArrTrimStateSet;
                            depth2 = depth2;
                            z10 = true;
                            iC = b.c(f13);
                        }
                        color = iC;
                    } else {
                        iArr = iArrTrimStateSet;
                        depth2 = depth2;
                        z10 = true;
                    }
                    color = (16777215 & color) | (i10 << 24);
                } else {
                    iArr = iArrTrimStateSet;
                    depth2 = depth2;
                    z10 = true;
                }
                int i17 = i12 + 1;
                if (i17 > iArr2.length) {
                    int[] iArr7 = new int[i12 <= 4 ? 8 : i12 * 2];
                    System.arraycopy(iArr2, 0, iArr7, 0, i12);
                    iArr2 = iArr7;
                }
                iArr2[i12] = color;
                if (i17 > objArr.length) {
                    Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i12 > 4 ? i12 * 2 : 8);
                    System.arraycopy(objArr, 0, objArr2, 0, i12);
                    objArr = objArr2;
                }
                objArr[i12] = iArr;
                objArr = (int[][]) objArr;
                i12 = i17;
                r10 = z10;
                depth2 = depth2;
                i11 = 0;
            } else {
                int i18 = depth2;
                r10 = r10 == true ? 1 : 0;
                depth2 = i18;
                i11 = 0;
            }
        }
        int[] iArr8 = new int[i12];
        int[][] iArr9 = new int[i12][];
        System.arraycopy(iArr2, 0, iArr8, 0, i12);
        System.arraycopy(objArr, 0, iArr9, 0, i12);
        return new ColorStateList(iArr9, iArr8);
    }
}
