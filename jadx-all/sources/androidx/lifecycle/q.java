package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f2169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q f2170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q f2171c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final q f2172d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final q f2173e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ q[] f2174f;

    static {
        q qVar = new q("DESTROYED", 0);
        f2169a = qVar;
        q qVar2 = new q("INITIALIZED", 1);
        f2170b = qVar2;
        q qVar3 = new q("CREATED", 2);
        f2171c = qVar3;
        q qVar4 = new q("STARTED", 3);
        f2172d = qVar4;
        q qVar5 = new q("RESUMED", 4);
        f2173e = qVar5;
        f2174f = new q[]{qVar, qVar2, qVar3, qVar4, qVar5};
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) f2174f.clone();
    }
}
