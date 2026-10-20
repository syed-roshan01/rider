package u1;

import java.text.BreakIterator;

/* JADX INFO: loaded from: classes.dex */
public final class c extends b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static c f15052d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public BreakIterator f15053c;

    @Override // u1.g
    public final int[] a(int i10) {
        int length = d().length();
        if (length <= 0 || i10 <= 0) {
            return null;
        }
        if (i10 > length) {
            i10 = length;
        }
        do {
            BreakIterator breakIterator = this.f15053c;
            if (breakIterator == null) {
                d7.a.D("impl");
                throw null;
            }
            if (breakIterator.isBoundary(i10)) {
                BreakIterator breakIterator2 = this.f15053c;
                if (breakIterator2 == null) {
                    d7.a.D("impl");
                    throw null;
                }
                int iPreceding = breakIterator2.preceding(i10);
                if (iPreceding == -1) {
                    return null;
                }
                return c(iPreceding, i10);
            }
            BreakIterator breakIterator3 = this.f15053c;
            if (breakIterator3 == null) {
                d7.a.D("impl");
                throw null;
            }
            i10 = breakIterator3.preceding(i10);
        } while (i10 != -1);
        return null;
    }

    @Override // u1.g
    public final int[] b(int i10) {
        int length = d().length();
        if (length <= 0 || i10 >= length) {
            return null;
        }
        if (i10 < 0) {
            i10 = 0;
        }
        do {
            BreakIterator breakIterator = this.f15053c;
            if (breakIterator == null) {
                d7.a.D("impl");
                throw null;
            }
            if (breakIterator.isBoundary(i10)) {
                BreakIterator breakIterator2 = this.f15053c;
                if (breakIterator2 == null) {
                    d7.a.D("impl");
                    throw null;
                }
                int iFollowing = breakIterator2.following(i10);
                if (iFollowing == -1) {
                    return null;
                }
                return c(i10, iFollowing);
            }
            BreakIterator breakIterator3 = this.f15053c;
            if (breakIterator3 == null) {
                d7.a.D("impl");
                throw null;
            }
            i10 = breakIterator3.following(i10);
        } while (i10 != -1);
        return null;
    }

    public final void e(String str) {
        this.f15029a = str;
        BreakIterator breakIterator = this.f15053c;
        if (breakIterator != null) {
            breakIterator.setText(str);
        } else {
            d7.a.D("impl");
            throw null;
        }
    }
}
