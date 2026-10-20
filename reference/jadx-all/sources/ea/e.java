package ea;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ja.j f5453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f5454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f5455c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String[] f5456d;

    static {
        ja.j jVar = ja.j.f8539d;
        f5453a = fa.l.h("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        f5454b = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        f5455c = new String[64];
        String[] strArr = new String[256];
        for (int i10 = 0; i10 < 256; i10++) {
            String binaryString = Integer.toBinaryString(i10);
            d7.a.l(binaryString, "toBinaryString(it)");
            String strReplace = y9.b.g("%8s", binaryString).replace(' ', '0');
            d7.a.l(strReplace, "replace(...)");
            strArr[i10] = strReplace;
        }
        f5456d = strArr;
        String[] strArr2 = f5455c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i11 = iArr[0];
        strArr2[i11 | 8] = a7.a.p(new StringBuilder(), strArr2[i11], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i12 = 0; i12 < 3; i12++) {
            int i13 = iArr2[i12];
            int i14 = iArr[0];
            String[] strArr3 = f5455c;
            int i15 = i14 | i13;
            strArr3[i15] = strArr3[i14] + '|' + strArr3[i13];
            StringBuilder sb = new StringBuilder();
            sb.append(strArr3[i14]);
            sb.append('|');
            strArr3[i15 | 8] = a7.a.p(sb, strArr3[i13], "|PADDED");
        }
        int length = f5455c.length;
        for (int i16 = 0; i16 < length; i16++) {
            String[] strArr4 = f5455c;
            if (strArr4[i16] == null) {
                strArr4[i16] = f5456d[i16];
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0067  */
    public static String a(int i10, int i11, int i12, int i13, boolean z10) {
        String strC1;
        String str;
        String[] strArr = f5454b;
        String strG = i12 < strArr.length ? strArr[i12] : y9.b.g("0x%02x", Integer.valueOf(i12));
        if (i13 == 0) {
            strC1 = "";
        } else {
            String[] strArr2 = f5456d;
            if (i12 == 2 || i12 == 3) {
                strC1 = strArr2[i13];
            } else if (i12 == 4 || i12 == 6) {
                strC1 = i13 == 1 ? "ACK" : strArr2[i13];
            } else if (i12 == 7 || i12 == 8) {
                strC1 = strArr2[i13];
            } else {
                String[] strArr3 = f5455c;
                if (i13 < strArr3.length) {
                    str = strArr3[i13];
                    d7.a.j(str);
                } else {
                    str = strArr2[i13];
                }
                if (i12 != 5 || (i13 & 4) == 0) {
                    strC1 = (i12 != 0 || (i13 & 32) == 0) ? str : l9.i.c1(str, "PRIORITY", "COMPRESSED");
                } else {
                    strC1 = l9.i.c1(str, "HEADERS", "PUSH_PROMISE");
                }
            }
        }
        return y9.b.g("%s 0x%08x %5d %-13s %s", z10 ? "<<" : ">>", Integer.valueOf(i10), Integer.valueOf(i11), strG, strC1);
    }
}
