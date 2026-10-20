package u1;

/* JADX INFO: loaded from: classes.dex */
public final class f extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static f f15086c;

    @Override // u1.g
    public final int[] a(int i10) {
        int length = d().length();
        if (length <= 0 || i10 <= 0) {
            return null;
        }
        if (i10 > length) {
            i10 = length;
        }
        while (i10 > 0 && d().charAt(i10 - 1) == '\n' && !e(i10)) {
            i10--;
        }
        if (i10 <= 0) {
            return null;
        }
        int i11 = i10 - 1;
        while (i11 > 0 && !f(i11)) {
            i11--;
        }
        return c(i11, i10);
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
        while (i10 < length && d().charAt(i10) == '\n' && !f(i10)) {
            i10++;
        }
        if (i10 >= length) {
            return null;
        }
        int i11 = i10 + 1;
        while (i11 < length && !e(i11)) {
            i11++;
        }
        return c(i10, i11);
    }

    public final boolean e(int i10) {
        return i10 > 0 && d().charAt(i10 + (-1)) != '\n' && (i10 == d().length() || d().charAt(i10) == '\n');
    }

    public final boolean f(int i10) {
        return d().charAt(i10) != '\n' && (i10 == 0 || d().charAt(i10 - 1) == '\n');
    }
}
