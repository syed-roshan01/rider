package e8;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final h f5266k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f5267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f5268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f5269c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f5270d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f5271e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object[][] f5272f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f5273g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Boolean f5274h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Integer f5275i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Integer f5276j;

    static {
        g gVar = new g();
        gVar.f5253f = (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 2);
        gVar.f5254g = Collections.emptyList();
        f5266k = new h(gVar);
    }

    public h(g gVar) {
        this.f5267a = gVar.f5248a;
        this.f5268b = gVar.f5249b;
        this.f5269c = gVar.f5250c;
        this.f5270d = gVar.f5251d;
        this.f5271e = gVar.f5252e;
        this.f5272f = gVar.f5253f;
        this.f5273g = gVar.f5254g;
        this.f5274h = gVar.f5255h;
        this.f5275i = gVar.f5256i;
        this.f5276j = gVar.f5257j;
    }

    public static g b(h hVar) {
        g gVar = new g();
        gVar.f5248a = hVar.f5267a;
        gVar.f5249b = hVar.f5268b;
        gVar.f5250c = hVar.f5269c;
        gVar.f5251d = hVar.f5270d;
        gVar.f5252e = hVar.f5271e;
        gVar.f5253f = hVar.f5272f;
        gVar.f5254g = hVar.f5273g;
        gVar.f5255h = hVar.f5274h;
        gVar.f5256i = hVar.f5275i;
        gVar.f5257j = hVar.f5276j;
        return gVar;
    }

    public final Object a(v6.d dVar) {
        y3.e.J(dVar, "key");
        int i10 = 0;
        while (true) {
            Object[][] objArr = this.f5272f;
            if (i10 >= objArr.length) {
                return dVar.f15908c;
            }
            if (dVar.equals(objArr[i10][0])) {
                return objArr[i10][1];
            }
            i10++;
        }
    }

    public final h c(v6.d dVar, Object obj) {
        Object[][] objArr;
        y3.e.J(dVar, "key");
        y3.e.J(obj, FirebaseAnalytics.Param.VALUE);
        g gVarB = b(this);
        int i10 = 0;
        while (true) {
            objArr = this.f5272f;
            if (i10 >= objArr.length) {
                i10 = -1;
                break;
            }
            if (dVar.equals(objArr[i10][0])) {
                break;
            }
            i10++;
        }
        Object[][] objArr2 = (Object[][]) Array.newInstance((Class<?>) Object.class, objArr.length + (i10 == -1 ? 1 : 0), 2);
        gVarB.f5253f = objArr2;
        System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        if (i10 == -1) {
            gVarB.f5253f[objArr.length] = new Object[]{dVar, obj};
        } else {
            gVarB.f5253f[i10] = new Object[]{dVar, obj};
        }
        return new h(gVarB);
    }

    public final String toString() {
        q6.g gVarJ0 = f6.a.j0(this);
        gVarJ0.a(this.f5267a, "deadline");
        gVarJ0.a(this.f5269c, "authority");
        gVarJ0.a(this.f5270d, "callCredentials");
        Executor executor = this.f5268b;
        gVarJ0.a(executor != null ? executor.getClass() : null, "executor");
        gVarJ0.a(this.f5271e, "compressorName");
        gVarJ0.a(Arrays.deepToString(this.f5272f), "customOptions");
        gVarJ0.c("waitForReady", Boolean.TRUE.equals(this.f5274h));
        gVarJ0.a(this.f5275i, "maxInboundMessageSize");
        gVarJ0.a(this.f5276j, "maxOutboundMessageSize");
        gVarJ0.a(this.f5273g, "streamTracerFactories");
        return gVarJ0.toString();
    }
}
