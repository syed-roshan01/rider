package e8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x f5394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final x f5395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final x f5396c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x f5397d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final x f5398e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ x[] f5399f;

    static {
        x xVar = new x("CONNECTING", 0);
        f5394a = xVar;
        x xVar2 = new x("READY", 1);
        f5395b = xVar2;
        x xVar3 = new x("TRANSIENT_FAILURE", 2);
        f5396c = xVar3;
        x xVar4 = new x("IDLE", 3);
        f5397d = xVar4;
        x xVar5 = new x("SHUTDOWN", 4);
        f5398e = xVar5;
        f5399f = new x[]{xVar, xVar2, xVar3, xVar4, xVar5};
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) f5399f.clone();
    }
}
