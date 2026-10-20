package n0;

import com.google.firebase.messaging.Constants;
import m0.n2;
import m0.q2;

/* JADX INFO: loaded from: classes.dex */
public final class r extends g0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r f12091c = new r(0, 3, 1);

    @Override // n0.g0
    public final void a(h0 h0Var, m0.d dVar, q2 q2Var, m0.w wVar) {
        n2 n2Var = (n2) h0Var.b(1);
        m0.c cVar = (m0.c) h0Var.b(0);
        c cVar2 = (c) h0Var.b(2);
        q2 q2VarK = n2Var.k();
        try {
            if (!cVar2.f12058b.d()) {
                m0.s.g("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?".toString());
                throw null;
            }
            cVar2.f12057a.c(dVar, q2VarK, wVar);
            q2VarK.e();
            q2Var.d();
            cVar.getClass();
            q2Var.u(n2Var, n2Var.e(cVar));
            q2Var.j();
        } catch (Throwable th) {
            q2VarK.e();
            throw th;
        }
    }

    @Override // n0.g0
    public final String c(int i10) {
        if (d9.i.o(i10, 0)) {
            return "anchor";
        }
        if (d9.i.o(i10, 1)) {
            return Constants.MessagePayloadKeys.FROM;
        }
        return d9.i.o(i10, 2) ? "fixups" : super.c(i10);
    }
}
