package c6;

import android.util.Log;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3025c;

    public a(String str, String... strArr) {
        String string;
        if (strArr.length == 0) {
            string = "";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for (String str2 : strArr) {
                if (sb.length() > 1) {
                    sb.append(",");
                }
                sb.append(str2);
            }
            sb.append("] ");
            string = sb.toString();
        }
        this.f3024b = string;
        this.f3023a = str;
        boolean z10 = str.length() <= 23;
        Object[] objArr = {str, 23};
        if (!z10) {
            throw new IllegalArgumentException(String.format("tag \"%s\" is longer than the %d character maximum", objArr));
        }
        int i10 = 2;
        while (i10 <= 7 && !Log.isLoggable(this.f3023a, i10)) {
            i10++;
        }
        this.f3025c = i10;
    }

    public final void a(Exception exc, String str, Object... objArr) {
        Log.e(this.f3023a, c(str, objArr), exc);
    }

    public final void b(String str, Object... objArr) {
        Log.e(this.f3023a, c(str, objArr));
    }

    public final String c(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.f3024b.concat(str);
    }

    public final void d(String str, Object... objArr) {
        if (this.f3025c <= 2) {
            Log.v(this.f3023a, c(str, objArr));
        }
    }

    public final void e(String str, Object... objArr) {
        Log.w(this.f3023a, c(str, objArr));
    }
}
