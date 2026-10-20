package e8;

/* JADX INFO: loaded from: classes.dex */
public enum z1 {
    OK(0),
    CANCELLED(1),
    UNKNOWN(2),
    INVALID_ARGUMENT(3),
    DEADLINE_EXCEEDED(4),
    NOT_FOUND(5),
    ALREADY_EXISTS(6),
    PERMISSION_DENIED(7),
    RESOURCE_EXHAUSTED(8),
    FAILED_PRECONDITION(9),
    ABORTED(10),
    OUT_OF_RANGE(11),
    UNIMPLEMENTED(12),
    INTERNAL(13),
    UNAVAILABLE(14),
    DATA_LOSS(15),
    UNAUTHENTICATED(16);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f5426b;

    z1(int i10) {
        this.f5425a = i10;
        this.f5426b = Integer.toString(i10).getBytes(q6.d.f13203a);
    }

    public final c2 a() {
        return (c2) c2.f5215d.get(this.f5425a);
    }
}
