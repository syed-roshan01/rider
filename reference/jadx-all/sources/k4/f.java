package k4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f9754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f9755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f9756c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f f9757d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ f[] f9758e;

    static {
        f fVar = new f("MEMORY_CACHE", 0);
        f9754a = fVar;
        f fVar2 = new f("MEMORY", 1);
        f9755b = fVar2;
        f fVar3 = new f("DISK", 2);
        f9756c = fVar3;
        f fVar4 = new f("NETWORK", 3);
        f9757d = fVar4;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4};
        f9758e = fVarArr;
        z6.a.y(fVarArr);
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f9758e.clone();
    }
}
