package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import h4.a;
import h4.b;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(a aVar) {
        IconCompat iconCompat = new IconCompat();
        int i10 = iconCompat.f1803a;
        if (aVar.e(1)) {
            i10 = ((b) aVar).f7548e.readInt();
        }
        iconCompat.f1803a = i10;
        byte[] bArr = iconCompat.f1805c;
        if (aVar.e(2)) {
            Parcel parcel = ((b) aVar).f7548e;
            int i11 = parcel.readInt();
            if (i11 < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[i11];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f1805c = bArr;
        iconCompat.f1806d = aVar.f(iconCompat.f1806d, 3);
        int i12 = iconCompat.f1807e;
        if (aVar.e(4)) {
            i12 = ((b) aVar).f7548e.readInt();
        }
        iconCompat.f1807e = i12;
        int i13 = iconCompat.f1808f;
        if (aVar.e(5)) {
            i13 = ((b) aVar).f7548e.readInt();
        }
        iconCompat.f1808f = i13;
        iconCompat.f1809g = (ColorStateList) aVar.f(iconCompat.f1809g, 6);
        String string = iconCompat.f1811i;
        if (aVar.e(7)) {
            string = ((b) aVar).f7548e.readString();
        }
        iconCompat.f1811i = string;
        String string2 = iconCompat.f1812j;
        if (aVar.e(8)) {
            string2 = ((b) aVar).f7548e.readString();
        }
        iconCompat.f1812j = string2;
        iconCompat.f1810h = PorterDuff.Mode.valueOf(iconCompat.f1811i);
        switch (iconCompat.f1803a) {
            case -1:
                Parcelable parcelable = iconCompat.f1806d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f1804b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f1806d;
                if (parcelable2 != null) {
                    iconCompat.f1804b = parcelable2;
                } else {
                    byte[] bArr3 = iconCompat.f1805c;
                    iconCompat.f1804b = bArr3;
                    iconCompat.f1803a = 3;
                    iconCompat.f1807e = 0;
                    iconCompat.f1808f = bArr3.length;
                }
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str = new String(iconCompat.f1805c, Charset.forName("UTF-16"));
                iconCompat.f1804b = str;
                if (iconCompat.f1803a == 2 && iconCompat.f1812j == null) {
                    iconCompat.f1812j = str.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f1804b = iconCompat.f1805c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, a aVar) {
        aVar.getClass();
        iconCompat.f1811i = iconCompat.f1810h.name();
        switch (iconCompat.f1803a) {
            case -1:
                iconCompat.f1806d = (Parcelable) iconCompat.f1804b;
                break;
            case 1:
            case 5:
                iconCompat.f1806d = (Parcelable) iconCompat.f1804b;
                break;
            case 2:
                iconCompat.f1805c = ((String) iconCompat.f1804b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f1805c = (byte[]) iconCompat.f1804b;
                break;
            case 4:
            case 6:
                iconCompat.f1805c = iconCompat.f1804b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i10 = iconCompat.f1803a;
        if (-1 != i10) {
            aVar.h(1);
            ((b) aVar).f7548e.writeInt(i10);
        }
        byte[] bArr = iconCompat.f1805c;
        if (bArr != null) {
            aVar.h(2);
            int length = bArr.length;
            Parcel parcel = ((b) aVar).f7548e;
            parcel.writeInt(length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f1806d;
        if (parcelable != null) {
            aVar.h(3);
            ((b) aVar).f7548e.writeParcelable(parcelable, 0);
        }
        int i11 = iconCompat.f1807e;
        if (i11 != 0) {
            aVar.h(4);
            ((b) aVar).f7548e.writeInt(i11);
        }
        int i12 = iconCompat.f1808f;
        if (i12 != 0) {
            aVar.h(5);
            ((b) aVar).f7548e.writeInt(i12);
        }
        ColorStateList colorStateList = iconCompat.f1809g;
        if (colorStateList != null) {
            aVar.h(6);
            ((b) aVar).f7548e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.f1811i;
        if (str != null) {
            aVar.h(7);
            ((b) aVar).f7548e.writeString(str);
        }
        String str2 = iconCompat.f1812j;
        if (str2 != null) {
            aVar.h(8);
            ((b) aVar).f7548e.writeString(str2);
        }
    }
}
