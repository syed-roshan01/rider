package o7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m1 f12642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m1 f12643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m1 f12644c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m1 f12645d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ m1[] f12646e;

    static {
        m1 m1Var = new m1("COMPOSITE_FILTER", 0);
        f12642a = m1Var;
        m1 m1Var2 = new m1("FIELD_FILTER", 1);
        f12643b = m1Var2;
        m1 m1Var3 = new m1("UNARY_FILTER", 2);
        f12644c = m1Var3;
        m1 m1Var4 = new m1("FILTERTYPE_NOT_SET", 3);
        f12645d = m1Var4;
        f12646e = new m1[]{m1Var, m1Var2, m1Var3, m1Var4};
    }

    public static m1 valueOf(String str) {
        return (m1) Enum.valueOf(m1.class, str);
    }

    public static m1[] values() {
        return (m1[]) f12646e.clone();
    }
}
