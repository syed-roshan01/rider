package g8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i0 f6839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i0 f6840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i0 f6841c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i0 f6842d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ i0[] f6843e;

    static {
        i0 i0Var = new i0("PROCESSED", 0);
        f6839a = i0Var;
        i0 i0Var2 = new i0("REFUSED", 1);
        f6840b = i0Var2;
        i0 i0Var3 = new i0("DROPPED", 2);
        f6841c = i0Var3;
        i0 i0Var4 = new i0("MISCARRIED", 3);
        f6842d = i0Var4;
        f6843e = new i0[]{i0Var, i0Var2, i0Var3, i0Var4};
    }

    public static i0 valueOf(String str) {
        return (i0) Enum.valueOf(i0.class, str);
    }

    public static i0[] values() {
        return (i0[]) f6843e.clone();
    }
}
