package g8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e1 f6739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ e1[] f6740b;

    static {
        e1 e1Var = new e1("INSTANCE", 0);
        f6739a = e1Var;
        f6740b = new e1[]{e1Var};
    }

    public static e1 valueOf(String str) {
        return (e1) Enum.valueOf(e1.class, str);
    }

    public static e1[] values() {
        return (e1[]) f6740b.clone();
    }
}
