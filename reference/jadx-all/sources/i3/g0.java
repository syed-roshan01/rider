package i3;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* JADX INFO: loaded from: classes.dex */
public final class g0 implements Spannable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f7963a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Spannable f7964b;

    public g0(Spannable spannable) {
        this.f7964b = spannable;
    }

    public final void a() {
        Spannable spannable = this.f7964b;
        int i10 = 1;
        if (!this.f7963a) {
            Object obj = null;
            if ((Build.VERSION.SDK_INT < 28 ? new x9.v(i10, obj) : new f0(i10, obj)).B(spannable)) {
                this.f7964b = new SpannableString(spannable);
            }
        }
        this.f7963a = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i10) {
        return this.f7964b.charAt(i10);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.f7964b.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.f7964b.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f7964b.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f7964b.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f7964b.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i10, int i11, Class cls) {
        return this.f7964b.getSpans(i10, i11, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f7964b.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i10, int i11, Class cls) {
        return this.f7964b.nextSpanTransition(i10, i11, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        a();
        this.f7964b.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i10, int i11, int i12) {
        a();
        this.f7964b.setSpan(obj, i10, i11, i12);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i10, int i11) {
        return this.f7964b.subSequence(i10, i11);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f7964b.toString();
    }
}
