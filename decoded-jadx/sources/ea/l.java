package ea;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class l implements c9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f5476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f5477b;

    public l(r rVar, u uVar) {
        this.f5477b = rVar;
        this.f5476a = uVar;
    }

    @Override // c9.a
    public final Object invoke() throws Throwable {
        b bVar;
        r rVar = this.f5477b;
        u uVar = this.f5476a;
        b bVar2 = b.INTERNAL_ERROR;
        IOException e4 = null;
        try {
            try {
                uVar.b(this);
                while (uVar.a(false, this)) {
                }
                bVar = b.NO_ERROR;
                try {
                    bVar2 = b.CANCEL;
                    rVar.a(bVar, bVar2, null);
                } catch (IOException e10) {
                    e4 = e10;
                    bVar2 = b.PROTOCOL_ERROR;
                    rVar.a(bVar2, bVar2, e4);
                }
            } catch (Throwable th) {
                th = th;
                rVar.a(bVar, bVar2, e4);
                y9.b.b(uVar);
                throw th;
            }
        } catch (IOException e11) {
            e4 = e11;
            bVar = bVar2;
        } catch (Throwable th2) {
            th = th2;
            bVar = bVar2;
            rVar.a(bVar, bVar2, e4);
            y9.b.b(uVar);
            throw th;
        }
        y9.b.b(uVar);
        return q8.l.f13235a;
    }
}
