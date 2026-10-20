package g8;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class r4 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s4 f7076b;

    public /* synthetic */ r4(s4 s4Var, int i10) {
        this.f7075a = i10;
        this.f7076b = s4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f7075a;
        int i11 = 0;
        s4 s4Var = this.f7076b;
        switch (i10) {
            case 0:
                if (!s4Var.f7114f) {
                    s4Var.f7115g = null;
                } else {
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    long jA = s4Var.f7113e - s4Var.f7112d.a(timeUnit);
                    if (jA <= 0) {
                        s4Var.f7114f = false;
                        s4Var.f7115g = null;
                        s4Var.f7111c.run();
                    } else {
                        s4Var.f7115g = s4Var.f7109a.schedule(new r4(s4Var, 1, i11), jA, timeUnit);
                    }
                }
                break;
            default:
                s4Var.f7110b.execute(new r4(s4Var, i11, i11));
                break;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r4(s4 s4Var, int i10, int i11) {
        this(s4Var, 0);
        this.f7075a = i10;
        int i12 = 1;
        if (i10 != 1) {
        } else {
            this(s4Var, i12);
        }
    }
}
