package g8;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class q0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f7041b;

    public /* synthetic */ q0(Object obj, int i10) {
        this.f7040a = i10;
        this.f7041b = obj;
    }

    public abstract void a();

    public abstract void b();

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f7040a;
        Object obj = this.f7041b;
        switch (i10) {
            case 0:
                e8.b0 b0Var = (e8.b0) obj;
                e8.b0 b0VarA = b0Var.a();
                try {
                    b();
                    return;
                } finally {
                    b0Var.c(b0VarA);
                }
            default:
                try {
                    if (((h8.c) obj).f7611p == null) {
                        throw new IOException("Unable to perform write due to unavailable sink.");
                    }
                    a();
                    return;
                } catch (Exception e4) {
                    ((h8.n) ((h8.c) obj).f7606d).p(e4);
                    return;
                }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q0(h8.c cVar) {
        this(cVar, 1);
        this.f7040a = 1;
    }
}
