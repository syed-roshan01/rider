package h0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f7416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k f7417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k f7418c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ k[] f7419d;

    static {
        k kVar = new k("TopLeft", 0);
        f7416a = kVar;
        k kVar2 = new k("TopRight", 1);
        f7417b = kVar2;
        k kVar3 = new k("TopMiddle", 2);
        f7418c = kVar3;
        f7419d = new k[]{kVar, kVar2, kVar3};
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f7419d.clone();
    }
}
