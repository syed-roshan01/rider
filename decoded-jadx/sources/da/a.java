package da;

import ja.i;
import x9.p;
import x9.q;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f4954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f4955b = 262144;

    public a(i iVar) {
        this.f4954a = iVar;
    }

    public final q a() {
        p pVar = new p();
        while (true) {
            String strK = this.f4954a.K(this.f4955b);
            this.f4955b -= (long) strK.length();
            if (strK.length() == 0) {
                return pVar.c();
            }
            int iO0 = l9.i.O0(strK, ':', 1, false, 4);
            if (iO0 != -1) {
                String strSubstring = strK.substring(0, iO0);
                d7.a.l(strSubstring, "this as java.lang.String\u2026ing(startIndex, endIndex)");
                String strSubstring2 = strK.substring(iO0 + 1);
                d7.a.l(strSubstring2, "this as java.lang.String).substring(startIndex)");
                pVar.a(strSubstring, strSubstring2);
            } else if (strK.charAt(0) == ':') {
                String strSubstring3 = strK.substring(1);
                d7.a.l(strSubstring3, "this as java.lang.String).substring(startIndex)");
                pVar.a("", strSubstring3);
            } else {
                pVar.a("", strK);
            }
        }
    }
}
