package l9;

import l.q;

/* JADX INFO: loaded from: classes.dex */
public abstract class j extends i {
    public static String p1(int i10, String str) {
        if (i10 < 0) {
            throw new IllegalArgumentException(q.h("Requested character count ", i10, " is less than zero.").toString());
        }
        int length = str.length();
        if (i10 > length) {
            i10 = length;
        }
        String strSubstring = str.substring(0, i10);
        d7.a.l(strSubstring, "substring(...)");
        return strSubstring;
    }
}
