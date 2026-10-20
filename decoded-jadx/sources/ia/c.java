package ia;

import h6.g;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import l.q;
import l9.i;
import r8.r;

/* JADX INFO: loaded from: classes.dex */
public final class c implements HostnameVerifier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f8193a = new c();

    public static List a(X509Certificate x509Certificate, int i10) {
        Object obj;
        r rVar = r.f13661a;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return rVar;
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && d7.a.d(list.get(0), Integer.valueOf(i10)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return rVar;
        }
    }

    public static boolean b(String str) {
        int i10;
        int length = str.length();
        int length2 = str.length();
        if (length2 < 0) {
            throw new IllegalArgumentException(q.h("endIndex < beginIndex: ", length2, " < 0").toString());
        }
        if (length2 > str.length()) {
            StringBuilder sbQ = a7.a.q("endIndex > string.length: ", length2, " > ");
            sbQ.append(str.length());
            throw new IllegalArgumentException(sbQ.toString().toString());
        }
        long j10 = 0;
        int i11 = 0;
        while (i11 < length2) {
            char cCharAt = str.charAt(i11);
            if (cCharAt < '\u0080') {
                j10++;
            } else {
                if (cCharAt < '\u0800') {
                    i10 = 2;
                } else if (cCharAt < '\ud800' || cCharAt > '\udfff') {
                    i10 = 3;
                } else {
                    int i12 = i11 + 1;
                    char cCharAt2 = i12 < length2 ? str.charAt(i12) : (char) 0;
                    if (cCharAt > '\udbff' || cCharAt2 < '\udc00' || cCharAt2 > '\udfff') {
                        j10++;
                        i11 = i12;
                    } else {
                        j10 += (long) 4;
                        i11 += 2;
                    }
                }
                j10 += (long) i10;
            }
            i11++;
        }
        return length == ((int) j10);
    }

    public static boolean c(String str, X509Certificate x509Certificate) {
        int length;
        d7.a.m(str, "host");
        byte[] bArr = y9.b.f17000a;
        if (y9.b.f17004e.a(str)) {
            String strX0 = g.x0(str);
            List listA = a(x509Certificate, 7);
            if (!(listA instanceof Collection) || !listA.isEmpty()) {
                Iterator it = listA.iterator();
                while (it.hasNext()) {
                    if (d7.a.d(strX0, g.x0((String) it.next()))) {
                        return true;
                    }
                }
            }
        } else {
            if (b(str)) {
                Locale locale = Locale.US;
                d7.a.l(locale, "US");
                str = str.toLowerCase(locale);
                d7.a.l(str, "this as java.lang.String).toLowerCase(locale)");
            }
            List<String> listA2 = a(x509Certificate, 2);
            if (!(listA2 instanceof Collection) || !listA2.isEmpty()) {
                for (String lowerCase : listA2) {
                    if (str.length() != 0 && !i.h1(str, ".", false) && !i.H0(str, "..", false) && lowerCase != null && lowerCase.length() != 0 && !i.h1(lowerCase, ".", false) && !i.H0(lowerCase, "..", false)) {
                        String strConcat = !i.H0(str, ".", false) ? str.concat(".") : str;
                        if (!i.H0(lowerCase, ".", false)) {
                            lowerCase = lowerCase.concat(".");
                        }
                        if (b(lowerCase)) {
                            Locale locale2 = Locale.US;
                            d7.a.l(locale2, "US");
                            lowerCase = lowerCase.toLowerCase(locale2);
                            d7.a.l(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                        }
                        if (!i.F0(lowerCase, "*", false)) {
                            if (d7.a.d(strConcat, lowerCase)) {
                                return true;
                            }
                        } else if (i.h1(lowerCase, "*.", false) && i.O0(lowerCase, '*', 1, false, 4) == -1 && strConcat.length() >= lowerCase.length() && !d7.a.d("*.", lowerCase)) {
                            String strSubstring = lowerCase.substring(1);
                            d7.a.l(strSubstring, "this as java.lang.String).substring(startIndex)");
                            if (i.H0(strConcat, strSubstring, false) && ((length = strConcat.length() - strSubstring.length()) <= 0 || i.S0(strConcat, '.', length - 1, 4) == -1)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        d7.a.m(str, "host");
        d7.a.m(sSLSession, "session");
        if (!b(str)) {
            return false;
        }
        try {
            Certificate certificate = sSLSession.getPeerCertificates()[0];
            d7.a.k(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            return c(str, (X509Certificate) certificate);
        } catch (SSLException unused) {
            return false;
        }
    }
}
