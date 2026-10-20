package y2;

import android.content.Context;
import java.util.concurrent.Callable;
import l.p;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f16853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f16854c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p f16855d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f16856e;

    public /* synthetic */ d(String str, Context context, p pVar, int i10, int i11) {
        this.f16852a = i11;
        this.f16853b = str;
        this.f16854c = context;
        this.f16855d = pVar;
        this.f16856e = i10;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str = this.f16853b;
        Context context = this.f16854c;
        p pVar = this.f16855d;
        int i10 = this.f16856e;
        int i11 = this.f16852a;
        switch (i11) {
            case 0:
                switch (i11) {
                    case 0:
                        return g.a(str, context, pVar, i10);
                    default:
                        try {
                            return g.a(str, context, pVar, i10);
                        } catch (Throwable unused) {
                            return new f(-3);
                        }
                }
            default:
                switch (i11) {
                    case 0:
                        return g.a(str, context, pVar, i10);
                    default:
                        try {
                            return g.a(str, context, pVar, i10);
                        } catch (Throwable unused2) {
                            return new f(-3);
                        }
                }
        }
    }
}
