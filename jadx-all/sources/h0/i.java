package h0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.util.Xml;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParserException;
import u1.y2;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f7404c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f7405d;

    public i(i8.l lVar, int i10, String str) {
        this.f7402a = 2;
        this.f7404c = lVar;
        this.f7403b = i10;
        this.f7405d = str;
    }

    public static i a(Resources resources, int i10, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        float f10;
        float f11;
        float f12;
        int i11;
        Shader radialGradient;
        Shader.TileMode tileMode;
        Shader.TileMode tileMode2;
        XmlResourceParser xml = resources.getXml(i10);
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        name.getClass();
        if (!name.equals("gradient")) {
            if (name.equals("selector")) {
                ColorStateList colorStateListB = t2.c.b(resources, xml, attributeSetAsAttributeSet, theme);
                return new i((Shader) null, colorStateListB, colorStateListB.getDefaultColor());
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        String name2 = xml.getName();
        if (!name2.equals("gradient")) {
            throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
        }
        TypedArray typedArrayZ = o1.s.Z(resources, theme, attributeSetAsAttributeSet, p2.a.f12761d);
        float f13 = !o1.s.S(xml, "startX") ? 0.0f : typedArrayZ.getFloat(8, 0.0f);
        float f14 = !o1.s.S(xml, "startY") ? 0.0f : typedArrayZ.getFloat(9, 0.0f);
        float f15 = !o1.s.S(xml, "endX") ? 0.0f : typedArrayZ.getFloat(10, 0.0f);
        float f16 = !o1.s.S(xml, "endY") ? 0.0f : typedArrayZ.getFloat(11, 0.0f);
        float f17 = !o1.s.S(xml, "centerX") ? 0.0f : typedArrayZ.getFloat(3, 0.0f);
        float f18 = !o1.s.S(xml, "centerY") ? 0.0f : typedArrayZ.getFloat(4, 0.0f);
        int i12 = !o1.s.S(xml, "type") ? 0 : typedArrayZ.getInt(2, 0);
        int color = !o1.s.S(xml, "startColor") ? 0 : typedArrayZ.getColor(0, 0);
        boolean zS = o1.s.S(xml, "centerColor");
        int color2 = !o1.s.S(xml, "centerColor") ? 0 : typedArrayZ.getColor(7, 0);
        int color3 = !o1.s.S(xml, "endColor") ? 0 : typedArrayZ.getColor(1, 0);
        int i13 = !o1.s.S(xml, "tileMode") ? 0 : typedArrayZ.getInt(6, 0);
        float f19 = !o1.s.S(xml, "gradientRadius") ? 0.0f : typedArrayZ.getFloat(5, 0.0f);
        typedArrayZ.recycle();
        int depth = xml.getDepth() + 1;
        float f20 = f19;
        ArrayList arrayList = new ArrayList(20);
        float f21 = f16;
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next2 = xml.next();
            f10 = f15;
            if (next2 == 1) {
                f11 = f14;
                break;
            }
            int depth2 = xml.getDepth();
            f11 = f14;
            if (depth2 < depth && next2 == 3) {
                break;
            }
            if (next2 == 2 && depth2 <= depth && xml.getName().equals("item")) {
                TypedArray typedArrayZ2 = o1.s.Z(resources, theme, attributeSetAsAttributeSet, p2.a.f12762e);
                boolean zHasValue = typedArrayZ2.hasValue(0);
                boolean zHasValue2 = typedArrayZ2.hasValue(1);
                if (!zHasValue || !zHasValue2) {
                    throw new XmlPullParserException(xml.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
                }
                int color4 = typedArrayZ2.getColor(0, 0);
                float f22 = typedArrayZ2.getFloat(1, 0.0f);
                typedArrayZ2.recycle();
                arrayList2.add(Integer.valueOf(color4));
                arrayList.add(Float.valueOf(f22));
            }
            f15 = f10;
            f14 = f11;
        }
        l.t tVar = arrayList2.size() > 0 ? new l.t(arrayList2, arrayList) : null;
        if (tVar == null) {
            tVar = zS ? new l.t(color, color2, color3) : new l.t(color, color3);
        }
        if (i12 == 1) {
            float f23 = f17;
            i11 = 0;
            if (f20 <= 0.0f) {
                f12 = f18;
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            }
            int[] iArr = (int[]) tVar.f10928b;
            float[] fArr = (float[]) tVar.f10929c;
            if (i13 == 1) {
                f12 = f18;
                tileMode = Shader.TileMode.REPEAT;
            } else if (i13 != 2) {
                f12 = f18;
                tileMode = Shader.TileMode.CLAMP;
            } else {
                f12 = f18;
                tileMode = Shader.TileMode.MIRROR;
            }
            radialGradient = new RadialGradient(f23, f12, f20, iArr, fArr, tileMode);
        } else if (i12 != 2) {
            int[] iArr2 = (int[]) tVar.f10928b;
            float[] fArr2 = (float[]) tVar.f10929c;
            if (i13 != 1) {
                tileMode2 = i13 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
            } else {
                tileMode2 = Shader.TileMode.REPEAT;
            }
            i11 = 0;
            radialGradient = new LinearGradient(f13, f11, f10, f21, iArr2, fArr2, tileMode2);
        } else {
            i11 = 0;
            radialGradient = new SweepGradient(f17, f18, (int[]) tVar.f10928b, (float[]) tVar.f10929c);
        }
        return new i(radialGradient, (ColorStateList) null, i11);
    }

    public static i b(String str) throws ProtocolException {
        int i10;
        String strSubstring;
        boolean zStartsWith = str.startsWith("HTTP/1.");
        i8.l lVar = i8.l.HTTP_1_0;
        if (zStartsWith) {
            i10 = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int iCharAt = str.charAt(7) - '0';
            if (iCharAt != 0) {
                if (iCharAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                lVar = i8.l.HTTP_1_1;
            }
        } else {
            if (!str.startsWith("ICY ")) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            i10 = 4;
        }
        int i11 = i10 + 3;
        if (str.length() < i11) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        try {
            int i12 = Integer.parseInt(str.substring(i10, i11));
            if (str.length() <= i11) {
                strSubstring = "";
            } else {
                if (str.charAt(i11) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                strSubstring = str.substring(i10 + 4);
            }
            return new i(lVar, i12, strSubstring);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
    }

    public final String toString() {
        switch (this.f7402a) {
            case 2:
                StringBuilder sb = new StringBuilder();
                sb.append(((i8.l) this.f7404c) == i8.l.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
                sb.append(' ');
                sb.append(this.f7403b);
                if (((String) this.f7405d) != null) {
                    sb.append(' ');
                    sb.append((String) this.f7405d);
                }
                return sb.toString();
            case 3:
                StringBuilder sb2 = new StringBuilder();
                sb2.append((String) this.f7404c);
                sb2.append("://");
                int i10 = -1;
                if (((String) this.f7405d).indexOf(58) != -1) {
                    sb2.append('[');
                    sb2.append((String) this.f7405d);
                    sb2.append(']');
                } else {
                    sb2.append((String) this.f7405d);
                }
                int i11 = this.f7403b;
                if (i11 == -1) {
                    String str = (String) this.f7404c;
                    if (str.equals("http")) {
                        i11 = 80;
                    } else {
                        i11 = str.equals("https") ? 443 : -1;
                    }
                }
                String str2 = (String) this.f7404c;
                if (str2.equals("http")) {
                    i10 = 80;
                } else if (str2.equals("https")) {
                    i10 = 443;
                }
                if (i11 != i10) {
                    sb2.append(':');
                    sb2.append(i11);
                }
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public i(Shader shader, ColorStateList colorStateList, int i10) {
        this.f7402a = 1;
        this.f7404c = shader;
        this.f7405d = colorStateList;
        this.f7403b = i10;
    }

    public i() {
        this.f7402a = 3;
        this.f7403b = -1;
    }

    public i(y2 y2Var) {
        this.f7402a = 0;
        this.f7404c = y2Var;
    }
}
