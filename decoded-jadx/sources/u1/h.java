package u1;

import java.text.BreakIterator;

/* JADX INFO: loaded from: classes.dex */
public final class h extends b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static h f15106d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public BreakIterator f15107c;

    @Override // u1.g
    public final int[] a(int i10) {
        int length = d().length();
        if (length <= 0 || i10 <= 0) {
            return null;
        }
        if (i10 > length) {
            i10 = length;
        }
        while (i10 > 0 && !g(i10 - 1) && !f(i10)) {
            BreakIterator breakIterator = this.f15107c;
            if (breakIterator == null) {
                d7.a.D("impl");
                throw null;
            }
            i10 = breakIterator.preceding(i10);
            if (i10 == -1) {
                return null;
            }
        }
        BreakIterator breakIterator2 = this.f15107c;
        if (breakIterator2 == null) {
            d7.a.D("impl");
            throw null;
        }
        int iPreceding = breakIterator2.preceding(i10);
        if (iPreceding == -1 || !g(iPreceding) || (iPreceding != 0 && g(iPreceding - 1))) {
            return null;
        }
        return c(iPreceding, i10);
    }

    @Override // u1.g
    public final int[] b(int i10) {
        if (d().length() <= 0 || i10 >= d().length()) {
            return null;
        }
        if (i10 < 0) {
            i10 = 0;
        }
        while (!g(i10) && (!g(i10) || (i10 != 0 && g(i10 - 1)))) {
            BreakIterator breakIterator = this.f15107c;
            if (breakIterator == null) {
                d7.a.D("impl");
                throw null;
            }
            i10 = breakIterator.following(i10);
            if (i10 == -1) {
                return null;
            }
        }
        BreakIterator breakIterator2 = this.f15107c;
        if (breakIterator2 == null) {
            d7.a.D("impl");
            throw null;
        }
        int iFollowing = breakIterator2.following(i10);
        if (iFollowing == -1 || !f(iFollowing)) {
            return null;
        }
        return c(i10, iFollowing);
    }

    public final void e(String str) {
        this.f15029a = str;
        BreakIterator breakIterator = this.f15107c;
        if (breakIterator != null) {
            breakIterator.setText(str);
        } else {
            d7.a.D("impl");
            throw null;
        }
    }

    public final boolean f(int i10) {
        return i10 > 0 && g(i10 + (-1)) && (i10 == d().length() || !g(i10));
    }

    public final boolean g(int i10) {
        if (i10 < 0 || i10 >= d().length()) {
            return false;
        }
        return Character.isLetterOrDigit(d().codePointAt(i10));
    }
}
