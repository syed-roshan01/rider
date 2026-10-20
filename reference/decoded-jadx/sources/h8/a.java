package h8;

import g8.q0;

/* JADX INFO: loaded from: classes.dex */
public final class a extends q0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f7599c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c f7600d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, int i10) {
        super(cVar);
        this.f7599c = i10;
        if (i10 != 1) {
            this.f7600d = cVar;
            o8.b.c();
        } else {
            this.f7600d = cVar;
            super(cVar);
            o8.b.c();
        }
    }

    @Override // g8.q0
    public final void a() {
        c cVar;
        int i10;
        c cVar2;
        switch (this.f7599c) {
            case 0:
                ja.g gVar = new ja.g();
                o8.b.d();
                try {
                    o8.b.b();
                    synchronized (this.f7600d.f7603a) {
                        ja.g gVar2 = this.f7600d.f7604b;
                        gVar.b0(gVar2, gVar2.b());
                        cVar = this.f7600d;
                        cVar.f7608f = false;
                        i10 = cVar.f7615t;
                        break;
                    }
                    cVar.f7611p.b0(gVar, gVar.f8534b);
                    synchronized (this.f7600d.f7603a) {
                        this.f7600d.f7615t -= i10;
                        break;
                    }
                    o8.b.f12664a.getClass();
                    return;
                } catch (Throwable th) {
                    try {
                        o8.b.f12664a.getClass();
                        break;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            default:
                ja.g gVar3 = new ja.g();
                o8.b.d();
                try {
                    o8.b.b();
                    synchronized (this.f7600d.f7603a) {
                        ja.g gVar4 = this.f7600d.f7604b;
                        gVar3.b0(gVar4, gVar4.f8534b);
                        cVar2 = this.f7600d;
                        cVar2.f7609n = false;
                        break;
                    }
                    cVar2.f7611p.b0(gVar3, gVar3.f8534b);
                    this.f7600d.f7611p.flush();
                    o8.b.f12664a.getClass();
                    return;
                } catch (Throwable th3) {
                    try {
                        o8.b.f12664a.getClass();
                        break;
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
        }
    }
}
