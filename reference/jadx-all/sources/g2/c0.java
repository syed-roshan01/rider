package g2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c0 f6514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c0 f6515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c0 f6516c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c0 f6517d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ c0[] f6518e;

    static {
        c0 c0Var = new c0("StartInput", 0);
        f6514a = c0Var;
        c0 c0Var2 = new c0("StopInput", 1);
        f6515b = c0Var2;
        c0 c0Var3 = new c0("ShowKeyboard", 2);
        f6516c = c0Var3;
        c0 c0Var4 = new c0("HideKeyboard", 3);
        f6517d = c0Var4;
        f6518e = new c0[]{c0Var, c0Var2, c0Var3, c0Var4};
    }

    public static c0 valueOf(String str) {
        return (c0) Enum.valueOf(c0.class, str);
    }

    public static c0[] values() {
        return (c0[]) f6518e.clone();
    }
}
