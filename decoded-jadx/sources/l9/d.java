package l9;

import java.io.Serializable;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Pattern f11404a;

    public d(String str) {
        Pattern patternCompile = Pattern.compile(str);
        d7.a.l(patternCompile, "compile(...)");
        this.f11404a = patternCompile;
    }

    public final boolean a(CharSequence charSequence) {
        d7.a.m(charSequence, "input");
        return this.f11404a.matcher(charSequence).matches();
    }

    public final String toString() {
        String string = this.f11404a.toString();
        d7.a.l(string, "toString(...)");
        return string;
    }
}
