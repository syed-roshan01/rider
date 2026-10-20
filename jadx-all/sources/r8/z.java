package r8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z f13683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final z f13684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final z f13685c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final z f13686d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ z[] f13687e;

    static {
        z zVar = new z("Ready", 0);
        f13683a = zVar;
        z zVar2 = new z("NotReady", 1);
        f13684b = zVar2;
        z zVar3 = new z("Done", 2);
        f13685c = zVar3;
        z zVar4 = new z("Failed", 3);
        f13686d = zVar4;
        z[] zVarArr = {zVar, zVar2, zVar3, zVar4};
        f13687e = zVarArr;
        z6.a.y(zVarArr);
    }

    public static z valueOf(String str) {
        return (z) Enum.valueOf(z.class, str);
    }

    public static z[] values() {
        return (z[]) f13687e.clone();
    }
}
