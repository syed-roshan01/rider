package c2;

import b2.c;
import java.text.BreakIterator;
import java.util.Locale;
import u1.x1;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f2924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2926c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final BreakIterator f2927d;

    public b(CharSequence charSequence, int i10, Locale locale) {
        this.f2924a = charSequence;
        if (charSequence.length() < 0) {
            throw new IllegalArgumentException("input start index is outside the CharSequence".toString());
        }
        if (i10 < 0 || i10 > charSequence.length()) {
            throw new IllegalArgumentException("input end index is outside the CharSequence".toString());
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        this.f2927d = wordInstance;
        this.f2925b = Math.max(0, -50);
        this.f2926c = Math.min(charSequence.length(), i10 + 50);
        wordInstance.setText(new c(charSequence, i10));
    }

    public final void a(int i10) {
        int i11 = this.f2925b;
        int i12 = this.f2926c;
        if (i10 > i12 || i11 > i10) {
            StringBuilder sb = new StringBuilder("Invalid offset: ");
            sb.append(i10);
            sb.append(". Valid range is [");
            sb.append(i11);
            sb.append(" , ");
            throw new IllegalArgumentException(a7.a.o(sb, i12, ']').toString());
        }
    }

    public final boolean b(int i10) {
        return i10 <= this.f2926c && this.f2925b + 1 <= i10 && Character.isLetterOrDigit(Character.codePointBefore(this.f2924a, i10));
    }

    public final boolean c(int i10) {
        int i11 = this.f2925b + 1;
        if (i10 > this.f2926c || i11 > i10) {
            return false;
        }
        return x1.r(Character.codePointBefore(this.f2924a, i10));
    }

    public final boolean d(int i10) {
        return i10 < this.f2926c && this.f2925b <= i10 && Character.isLetterOrDigit(Character.codePointAt(this.f2924a, i10));
    }

    public final boolean e(int i10) {
        if (i10 >= this.f2926c || this.f2925b > i10) {
            return false;
        }
        return x1.r(Character.codePointAt(this.f2924a, i10));
    }
}
