package n8;

import com.google.firebase.messaging.Constants;
import e8.c2;
import e8.v0;
import e8.x0;
import g8.j4;

/* JADX INFO: loaded from: classes.dex */
public final class c extends z6.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f12251s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f12252t;

    public c(c2 c2Var) {
        this.f12252t = c2Var;
    }

    @Override // z6.a
    public final v0 Y(j4 j4Var) {
        int i10 = this.f12251s;
        Object obj = this.f12252t;
        switch (i10) {
            case 0:
                return v0.a((c2) obj);
            default:
                v0 v0VarY = ((z6.a) obj).Y(j4Var);
                x0 x0Var = v0VarY.f5379a;
                if (x0Var == null) {
                    return v0VarY;
                }
                e8.c cVarC = x0Var.c();
                return v0.b(x0Var, new m((g) cVarC.f5207a.get(p.f12296k), v0VarY.f5380b));
        }
    }

    public final String toString() {
        switch (this.f12251s) {
            case 0:
                q6.g gVar = new q6.g(c.class.getSimpleName());
                gVar.a((c2) this.f12252t, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
                return gVar.toString();
            default:
                return super.toString();
        }
    }

    public c(z6.a aVar) {
        this.f12252t = aVar;
    }
}
