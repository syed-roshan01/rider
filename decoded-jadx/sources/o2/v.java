package o2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v f12516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ v[] f12517b;

    static {
        v vVar = new v("Inherit", 0);
        f12516a = vVar;
        f12517b = new v[]{vVar, new v("SecureOn", 1), new v("SecureOff", 2)};
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) f12517b.clone();
    }
}
