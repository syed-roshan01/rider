package q5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f13159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f13160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f13161c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ d[] f13162d;

    static {
        d dVar = new d("NETWORK_UNMETERED", 0);
        f13159a = dVar;
        d dVar2 = new d("DEVICE_IDLE", 1);
        f13160b = dVar2;
        d dVar3 = new d("DEVICE_CHARGING", 2);
        f13161c = dVar3;
        f13162d = new d[]{dVar, dVar2, dVar3};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f13162d.clone();
    }
}
