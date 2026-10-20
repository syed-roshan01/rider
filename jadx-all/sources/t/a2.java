package t;

/* JADX INFO: loaded from: classes.dex */
public interface a2 extends b2 {
    @Override // t.z1
    default long b(t tVar, t tVar2, t tVar3) {
        return ((long) (f() + e())) * 1000000;
    }

    int e();

    int f();
}
