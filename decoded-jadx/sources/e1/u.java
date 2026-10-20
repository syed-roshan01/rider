package e1;

import android.graphics.ColorSpace;
import java.util.function.DoubleUnaryOperator;

/* JADX INFO: loaded from: classes.dex */
public abstract class u {
    public static final ColorSpace a(f1.d dVar) {
        if (d7.a.d(dVar, f1.e.f6030c)) {
            return ColorSpace.get(ColorSpace.Named.SRGB);
        }
        if (d7.a.d(dVar, f1.e.f6042o)) {
            return ColorSpace.get(ColorSpace.Named.ACES);
        }
        if (d7.a.d(dVar, f1.e.f6043p)) {
            return ColorSpace.get(ColorSpace.Named.ACESCG);
        }
        if (d7.a.d(dVar, f1.e.f6040m)) {
            return ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        }
        if (d7.a.d(dVar, f1.e.f6035h)) {
            return ColorSpace.get(ColorSpace.Named.BT2020);
        }
        if (d7.a.d(dVar, f1.e.f6034g)) {
            return ColorSpace.get(ColorSpace.Named.BT709);
        }
        if (d7.a.d(dVar, f1.e.f6045r)) {
            return ColorSpace.get(ColorSpace.Named.CIE_LAB);
        }
        if (d7.a.d(dVar, f1.e.f6044q)) {
            return ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        }
        if (d7.a.d(dVar, f1.e.f6036i)) {
            return ColorSpace.get(ColorSpace.Named.DCI_P3);
        }
        if (d7.a.d(dVar, f1.e.f6037j)) {
            return ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        }
        if (d7.a.d(dVar, f1.e.f6032e)) {
            return ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        }
        if (d7.a.d(dVar, f1.e.f6033f)) {
            return ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        }
        if (d7.a.d(dVar, f1.e.f6031d)) {
            return ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        }
        if (d7.a.d(dVar, f1.e.f6038k)) {
            return ColorSpace.get(ColorSpace.Named.NTSC_1953);
        }
        if (d7.a.d(dVar, f1.e.f6041n)) {
            return ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        }
        if (d7.a.d(dVar, f1.e.f6039l)) {
            return ColorSpace.get(ColorSpace.Named.SMPTE_C);
        }
        if (!(dVar instanceof f1.q)) {
            return ColorSpace.get(ColorSpace.Named.SRGB);
        }
        f1.q qVar = (f1.q) dVar;
        float[] fArrA = qVar.f6077d.a();
        f1.r rVar = qVar.f6080g;
        ColorSpace.Rgb.TransferParameters transferParameters = rVar != null ? new ColorSpace.Rgb.TransferParameters(rVar.f6092b, rVar.f6093c, rVar.f6094d, rVar.f6095e, rVar.f6096f, rVar.f6097g, rVar.f6091a) : null;
        if (transferParameters != null) {
            return new ColorSpace.Rgb(dVar.f6025a, ((f1.q) dVar).f6081h, fArrA, transferParameters);
        }
        String str = dVar.f6025a;
        f1.q qVar2 = (f1.q) dVar;
        float[] fArr = qVar2.f6081h;
        final int i10 = 0;
        final f1.p pVar = qVar2.f6085l;
        DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: e1.s
            @Override // java.util.function.DoubleUnaryOperator
            public final double applyAsDouble(double d10) {
                int i11 = i10;
                c9.c cVar = pVar;
                switch (i11) {
                    case 0:
                        break;
                }
                return ((Number) cVar.invoke(Double.valueOf(d10))).doubleValue();
            }
        };
        final int i11 = 1;
        final f1.p pVar2 = qVar2.f6088o;
        return new ColorSpace.Rgb(str, fArr, fArrA, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: e1.s
            @Override // java.util.function.DoubleUnaryOperator
            public final double applyAsDouble(double d10) {
                int i12 = i11;
                c9.c cVar = pVar2;
                switch (i12) {
                    case 0:
                        break;
                }
                return ((Number) cVar.invoke(Double.valueOf(d10))).doubleValue();
            }
        }, dVar.b(0), dVar.a(0));
    }

    public static final f1.d b(final ColorSpace colorSpace) {
        f1.s sVar;
        int id = colorSpace.getId();
        if (id == ColorSpace.Named.SRGB.ordinal()) {
            return f1.e.f6030c;
        }
        if (id == ColorSpace.Named.ACES.ordinal()) {
            return f1.e.f6042o;
        }
        if (id == ColorSpace.Named.ACESCG.ordinal()) {
            return f1.e.f6043p;
        }
        if (id == ColorSpace.Named.ADOBE_RGB.ordinal()) {
            return f1.e.f6040m;
        }
        if (id == ColorSpace.Named.BT2020.ordinal()) {
            return f1.e.f6035h;
        }
        if (id == ColorSpace.Named.BT709.ordinal()) {
            return f1.e.f6034g;
        }
        if (id == ColorSpace.Named.CIE_LAB.ordinal()) {
            return f1.e.f6045r;
        }
        if (id == ColorSpace.Named.CIE_XYZ.ordinal()) {
            return f1.e.f6044q;
        }
        if (id == ColorSpace.Named.DCI_P3.ordinal()) {
            return f1.e.f6036i;
        }
        if (id == ColorSpace.Named.DISPLAY_P3.ordinal()) {
            return f1.e.f6037j;
        }
        if (id == ColorSpace.Named.EXTENDED_SRGB.ordinal()) {
            return f1.e.f6032e;
        }
        if (id == ColorSpace.Named.LINEAR_EXTENDED_SRGB.ordinal()) {
            return f1.e.f6033f;
        }
        if (id == ColorSpace.Named.LINEAR_SRGB.ordinal()) {
            return f1.e.f6031d;
        }
        if (id == ColorSpace.Named.NTSC_1953.ordinal()) {
            return f1.e.f6038k;
        }
        if (id == ColorSpace.Named.PRO_PHOTO_RGB.ordinal()) {
            return f1.e.f6041n;
        }
        if (id == ColorSpace.Named.SMPTE_C.ordinal()) {
            return f1.e.f6039l;
        }
        if (!(colorSpace instanceof ColorSpace.Rgb)) {
            return f1.e.f6030c;
        }
        ColorSpace.Rgb rgb = (ColorSpace.Rgb) colorSpace;
        ColorSpace.Rgb.TransferParameters transferParameters = rgb.getTransferParameters();
        if (rgb.getWhitePoint().length == 3) {
            float f10 = rgb.getWhitePoint()[0];
            float f11 = rgb.getWhitePoint()[1];
            float f12 = f10 + f11 + rgb.getWhitePoint()[2];
            sVar = new f1.s(f10 / f12, f11 / f12);
        } else {
            sVar = new f1.s(rgb.getWhitePoint()[0], rgb.getWhitePoint()[1]);
        }
        f1.s sVar2 = sVar;
        f1.r rVar = transferParameters != null ? new f1.r(transferParameters.g, transferParameters.a, transferParameters.b, transferParameters.c, transferParameters.d, transferParameters.e, transferParameters.f) : null;
        final int i10 = 0;
        final int i11 = 1;
        return new f1.q(rgb.getName(), rgb.getPrimaries(), sVar2, rgb.getTransform(), new f1.i() { // from class: e1.t
            @Override // f1.i
            public final double b(double d10) {
                int i12 = i10;
                ColorSpace colorSpace2 = colorSpace;
                switch (i12) {
                    case 0:
                        return ((ColorSpace.Rgb) colorSpace2).getOetf().applyAsDouble(d10);
                    default:
                        return ((ColorSpace.Rgb) colorSpace2).getEotf().applyAsDouble(d10);
                }
            }
        }, new f1.i() { // from class: e1.t
            @Override // f1.i
            public final double b(double d10) {
                int i12 = i11;
                ColorSpace colorSpace2 = colorSpace;
                switch (i12) {
                    case 0:
                        return ((ColorSpace.Rgb) colorSpace2).getOetf().applyAsDouble(d10);
                    default:
                        return ((ColorSpace.Rgb) colorSpace2).getEotf().applyAsDouble(d10);
                }
            }
        }, colorSpace.getMinValue(0), colorSpace.getMaxValue(0), rVar, rgb.getId());
    }
}
