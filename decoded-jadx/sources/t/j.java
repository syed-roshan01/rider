package t;

/* JADX INFO: loaded from: classes.dex */
public interface j {
    boolean a();

    Object b(long j10);

    long c();

    x1 d();

    Object e();

    t f(long j10);

    default boolean g(long j10) {
        return j10 >= c();
    }
}
