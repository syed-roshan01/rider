package i8;

import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* JADX INFO: loaded from: classes.dex */
public final class e implements HostnameVerifier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f8137a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f8138b = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    public static List a(X509Certificate x509Certificate, int i10) {
        Integer num;
        String str;
        ArrayList arrayList = new ArrayList();
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.emptyList();
            }
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && (num = (Integer) list.get(0)) != null && num.intValue() == i10 && (str = (String) list.get(1)) != null) {
                    arrayList.add(str);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return Collections.emptyList();
        }
    }

    public static boolean b(String str, X509Certificate x509Certificate) {
        String str2;
        String str3;
        char[] cArr;
        char c10;
        int i10;
        char c11;
        if (f8138b.matcher(str).matches()) {
            List listA = a(x509Certificate, 7);
            int size = listA.size();
            for (int i11 = 0; i11 < size; i11++) {
                if (str.equalsIgnoreCase((String) listA.get(i11))) {
                    return true;
                }
            }
            return false;
        }
        String lowerCase = str.toLowerCase(Locale.US);
        int i12 = 2;
        List listA2 = a(x509Certificate, 2);
        int size2 = listA2.size();
        int i13 = 0;
        boolean z10 = false;
        while (i13 < size2) {
            if (c(lowerCase, (String) listA2.get(i13))) {
                return true;
            }
            i13++;
            z10 = true;
        }
        if (!z10) {
            c cVar = new c(x509Certificate.getSubjectX500Principal());
            cVar.f8131c = 0;
            cVar.f8132d = 0;
            cVar.f8133e = 0;
            cVar.f8134f = 0;
            String str4 = cVar.f8129a;
            cVar.f8135g = str4.toCharArray();
            String strC = cVar.c();
            if (strC == null) {
                str3 = null;
            } else {
                while (true) {
                    int i14 = cVar.f8131c;
                    int i15 = cVar.f8130b;
                    if (i14 == i15) {
                        break;
                    }
                    char c12 = cVar.f8135g[i14];
                    char c13 = '\\';
                    if (c12 == '\"') {
                        int i16 = i14 + 1;
                        cVar.f8131c = i16;
                        cVar.f8132d = i16;
                        cVar.f8133e = i16;
                        while (true) {
                            int i17 = cVar.f8131c;
                            if (i17 == i15) {
                                throw new IllegalStateException("Unexpected end of DN: ".concat(str4));
                            }
                            char[] cArr2 = cVar.f8135g;
                            char c14 = cArr2[i17];
                            if (c14 == '\"') {
                                cVar.f8131c = i17 + 1;
                                while (true) {
                                    int i18 = cVar.f8131c;
                                    if (i18 >= i15 || cVar.f8135g[i18] != ' ') {
                                        break;
                                    }
                                    cVar.f8131c = i18 + 1;
                                }
                                char[] cArr3 = cVar.f8135g;
                                int i19 = cVar.f8132d;
                                str2 = new String(cArr3, i19, cVar.f8133e - i19);
                                break;
                            }
                            if (c14 == '\\') {
                                cArr2[cVar.f8133e] = cVar.b();
                            } else {
                                cArr2[cVar.f8133e] = c14;
                            }
                            cVar.f8131c++;
                            cVar.f8133e++;
                            i12 = 2;
                        }
                    } else if (c12 == '#') {
                        if (i14 + 4 >= i15) {
                            throw new IllegalStateException("Unexpected end of DN: ".concat(str4));
                        }
                        cVar.f8132d = i14;
                        cVar.f8131c = i14 + 1;
                        while (true) {
                            int i20 = cVar.f8131c;
                            if (i20 == i15 || (c10 = (cArr = cVar.f8135g)[i20]) == '+' || c10 == ',' || c10 == ';') {
                                cVar.f8133e = i20;
                                break;
                            }
                            if (c10 == ' ') {
                                cVar.f8133e = i20;
                                cVar.f8131c = i20 + 1;
                                while (true) {
                                    int i21 = cVar.f8131c;
                                    if (i21 >= i15 || cVar.f8135g[i21] != ' ') {
                                        break;
                                    }
                                    cVar.f8131c = i21 + 1;
                                }
                            } else {
                                if (c10 >= 'A' && c10 <= 'F') {
                                    cArr[i20] = (char) (c10 + ' ');
                                }
                                cVar.f8131c = i20 + 1;
                            }
                        }
                        int i22 = cVar.f8133e;
                        int i23 = cVar.f8132d;
                        int i24 = i22 - i23;
                        if (i24 < 5 || (i24 & 1) == 0) {
                            throw new IllegalStateException("Unexpected end of DN: ".concat(str4));
                        }
                        int i25 = i24 / 2;
                        byte[] bArr = new byte[i25];
                        int i26 = i23 + 1;
                        for (int i27 = 0; i27 < i25; i27++) {
                            bArr[i27] = (byte) cVar.a(i26);
                            i26 += i12;
                        }
                        str2 = new String(cVar.f8135g, cVar.f8132d, i24);
                    } else if (c12 == '+' || c12 == ',' || c12 == ';') {
                        str2 = "";
                    } else {
                        cVar.f8132d = i14;
                        cVar.f8133e = i14;
                        while (true) {
                            int i28 = cVar.f8131c;
                            if (i28 >= i15) {
                                char[] cArr4 = cVar.f8135g;
                                int i29 = cVar.f8132d;
                                str2 = new String(cArr4, i29, cVar.f8133e - i29);
                                break;
                            }
                            char[] cArr5 = cVar.f8135g;
                            char c15 = cArr5[i28];
                            if (c15 != ' ') {
                                if (c15 != ';') {
                                    if (c15 == c13) {
                                        int i30 = cVar.f8133e;
                                        cVar.f8133e = i30 + 1;
                                        cArr5[i30] = cVar.b();
                                        cVar.f8131c++;
                                    } else if (c15 != '+' && c15 != ',') {
                                        int i31 = cVar.f8133e;
                                        cVar.f8133e = i31 + 1;
                                        cArr5[i31] = c15;
                                        cVar.f8131c = i28 + 1;
                                    }
                                    c13 = '\\';
                                }
                                int i32 = cVar.f8132d;
                                str2 = new String(cArr5, i32, cVar.f8133e - i32);
                                break;
                            }
                            int i33 = cVar.f8133e;
                            cVar.f8134f = i33;
                            cVar.f8131c = i28 + 1;
                            cVar.f8133e = i33 + 1;
                            cArr5[i33] = ' ';
                            while (true) {
                                i10 = cVar.f8131c;
                                if (i10 >= i15) {
                                    break;
                                }
                                char[] cArr6 = cVar.f8135g;
                                if (cArr6[i10] != ' ') {
                                    break;
                                }
                                int i34 = cVar.f8133e;
                                cVar.f8133e = i34 + 1;
                                cArr6[i34] = ' ';
                                cVar.f8131c = i10 + 1;
                            }
                            if (i10 == i15 || (c11 = cVar.f8135g[i10]) == ',' || c11 == '+' || c11 == ';') {
                                char[] cArr7 = cVar.f8135g;
                                int i35 = cVar.f8132d;
                                str2 = new String(cArr7, i35, cVar.f8134f - i35);
                                break;
                            }
                            c13 = '\\';
                        }
                    }
                    if ("cn".equalsIgnoreCase(strC)) {
                        str3 = str2;
                    } else {
                        int i36 = cVar.f8131c;
                        if (i36 >= i15) {
                            break;
                        }
                        char c16 = cVar.f8135g[i36];
                        if (c16 != ',' && c16 != ';' && c16 != '+') {
                            throw new IllegalStateException("Malformed DN: ".concat(str4));
                        }
                        cVar.f8131c = i36 + 1;
                        strC = cVar.c();
                        if (strC == null) {
                            throw new IllegalStateException("Malformed DN: ".concat(str4));
                        }
                    }
                }
                str3 = null;
            }
            if (str3 != null) {
                return c(lowerCase, str3);
            }
        }
        return false;
    }

    public static boolean c(String str, String str2) {
        if (str != null && str.length() != 0 && !str.startsWith(".") && !str.endsWith("..") && str2 != null && str2.length() != 0 && !str2.startsWith(".") && !str2.endsWith("..")) {
            if (!str.endsWith(".")) {
                str = str.concat(".");
            }
            if (!str2.endsWith(".")) {
                str2 = str2.concat(".");
            }
            String lowerCase = str2.toLowerCase(Locale.US);
            if (!lowerCase.contains("*")) {
                return str.equals(lowerCase);
            }
            if (!lowerCase.startsWith("*.") || lowerCase.indexOf(42, 1) != -1 || str.length() < lowerCase.length() || "*.".equals(lowerCase)) {
                return false;
            }
            String strSubstring = lowerCase.substring(1);
            if (!str.endsWith(strSubstring)) {
                return false;
            }
            int length = str.length() - strSubstring.length();
            return length <= 0 || str.lastIndexOf(46, length - 1) == -1;
        }
        return false;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        try {
            return b(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
        } catch (SSLException unused) {
            return false;
        }
    }
}
