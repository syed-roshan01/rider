package ka;

import d9.j;
import d9.q;
import d9.t;
import ja.a0;
import ja.i;
import java.io.IOException;
import q8.l;

/* JADX INFO: loaded from: classes.dex */
public final class h extends j implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f10677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f10678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f10679c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i f10680d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t f10681e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ t f10682f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(q qVar, long j10, t tVar, a0 a0Var, t tVar2, t tVar3) {
        super(2);
        this.f10677a = qVar;
        this.f10678b = j10;
        this.f10679c = tVar;
        this.f10680d = a0Var;
        this.f10681e = tVar2;
        this.f10682f = tVar3;
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) throws IOException {
        int iIntValue = ((Number) obj).intValue();
        long jLongValue = ((Number) obj2).longValue();
        if (iIntValue == 1) {
            q qVar = this.f10677a;
            if (qVar.f4948a) {
                throw new IOException("bad zip: zip64 extra repeated");
            }
            qVar.f4948a = true;
            if (jLongValue < this.f10678b) {
                throw new IOException("bad zip: zip64 extra too short");
            }
            t tVar = this.f10679c;
            long J = tVar.f4951a;
            i iVar = this.f10680d;
            if (J == 4294967295L) {
                J = iVar.J();
            }
            tVar.f4951a = J;
            t tVar2 = this.f10681e;
            tVar2.f4951a = tVar2.f4951a == 4294967295L ? iVar.J() : 0L;
            t tVar3 = this.f10682f;
            tVar3.f4951a = tVar3.f4951a == 4294967295L ? iVar.J() : 0L;
        }
        return l.f13235a;
    }
}
