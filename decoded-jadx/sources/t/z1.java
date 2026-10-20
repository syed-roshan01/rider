package t;

/* JADX INFO: loaded from: classes.dex */
public interface z1 {
    boolean a();

    long b(t tVar, t tVar2, t tVar3);

    t c(long j10, t tVar, t tVar2, t tVar3);

    t d(long j10, t tVar, t tVar2, t tVar3);

    default t g(t tVar, t tVar2, t tVar3) {
        return c(b(tVar, tVar2, tVar3), tVar, tVar2, tVar3);
    }
}
