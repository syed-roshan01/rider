package s;

/* JADX INFO: loaded from: classes.dex */
public final class r0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r0 f13859b = new r0(new b1(null, null, false, null, 63));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r0 f13860c = new r0(new b1(null, null, true, null, 47));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b1 f13861a;

    public r0(b1 b1Var) {
        this.f13861a = b1Var;
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final boolean equals(Object obj) {
        return (obj instanceof r0) && d7.a.d(((r0) obj).f13861a, this.f13861a);
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final String toString() {
        if (d7.a.d(this, f13859b)) {
            return "ExitTransition.None";
        }
        if (d7.a.d(this, f13860c)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        StringBuilder sb = new StringBuilder("ExitTransition: \nFade - ");
        b1 b1Var = this.f13861a;
        s0 s0Var = b1Var.f13754a;
        sb.append(s0Var != null ? s0Var.toString() : null);
        sb.append(",\nSlide - ");
        sb.append((String) null);
        sb.append(",\nShrink - ");
        sb.append((String) null);
        sb.append(",\nScale - ");
        w0 w0Var = b1Var.f13755b;
        sb.append(w0Var != null ? w0Var.toString() : null);
        sb.append(",\nKeepUntilTransitionsFinished - ");
        sb.append(b1Var.f13756c);
        return sb.toString();
    }

    public final int hashCode() {
        return this.f13861a.hashCode();
    }
}
