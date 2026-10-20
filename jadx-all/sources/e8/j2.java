package e8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class j2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j2 f5290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j2 f5291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ j2[] f5292c;

    /* JADX INFO: Fake field, exist only in values array */
    j2 EF0;

    static {
        j2 j2Var = new j2("FAKE", 0);
        j2 j2Var2 = new j2("MTLS", 1);
        f5290a = j2Var2;
        j2 j2Var3 = new j2("CUSTOM_MANAGERS", 2);
        f5291b = j2Var3;
        f5292c = new j2[]{j2Var, j2Var2, j2Var3};
    }

    public static j2 valueOf(String str) {
        return (j2) Enum.valueOf(j2.class, str);
    }

    public static j2[] values() {
        return (j2[]) f5292c.clone();
    }
}
