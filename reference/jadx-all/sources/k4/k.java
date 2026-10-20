package k4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f9766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ k[] f9767b;

    /* JADX INFO: Fake field, exist only in values array */
    k EF0;

    static {
        k kVar = new k("IGNORE", 0);
        k kVar2 = new k("RESPECT_PERFORMANCE", 1);
        f9766a = kVar2;
        k[] kVarArr = {kVar, kVar2, new k("RESPECT_ALL", 2)};
        f9767b = kVarArr;
        z6.a.y(kVarArr);
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f9767b.clone();
    }
}
