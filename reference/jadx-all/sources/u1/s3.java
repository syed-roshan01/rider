package u1;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class s3 extends w8.i implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o9.b f15291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f15293c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ContentResolver f15294d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Uri f15295e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ t3 f15296f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ o9.g f15297n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Context f15298o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3(ContentResolver contentResolver, Uri uri, t3 t3Var, o9.g gVar, Context context, u8.e eVar) {
        super(2, eVar);
        this.f15294d = contentResolver;
        this.f15295e = uri;
        this.f15296f = t3Var;
        this.f15297n = gVar;
        this.f15298o = context;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        s3 s3Var = new s3(this.f15294d, this.f15295e, this.f15296f, this.f15297n, this.f15298o, eVar);
        s3Var.f15293c = obj;
        return s3Var;
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((s3) create((p9.g) obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0053 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x0054  */
    /* JADX WARN: Code duplicated, block: B:25:0x005f A[Catch: all -> 0x0084, TRY_LEAVE, TryCatch #0 {all -> 0x0084, blocks: (B:19:0x0047, B:23:0x0057, B:25:0x005f), top: B:35:0x0047 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0081 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x0082  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0082 -> B:35:0x0047). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // w8.a
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            v8.a r0 = v8.a.f15963a
            int r1 = r9.f15292b
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L2f
            if (r1 == r3) goto L23
            if (r1 != r2) goto L1b
            o9.b r1 = r9.f15291a
            java.lang.Object r4 = r9.f15293c
            p9.g r4 = (p9.g) r4
            d7.t.v0(r10)     // Catch: java.lang.Throwable -> L17
            r10 = r4
            goto L46
        L17:
            r10 = move-exception
            r4 = r9
            goto L90
        L1b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L23:
            o9.b r1 = r9.f15291a
            java.lang.Object r4 = r9.f15293c
            p9.g r4 = (p9.g) r4
            d7.t.v0(r10)     // Catch: java.lang.Throwable -> L17
            r5 = r4
            r4 = r9
            goto L57
        L2f:
            d7.t.v0(r10)
            java.lang.Object r10 = r9.f15293c
            p9.g r10 = (p9.g) r10
            android.content.ContentResolver r1 = r9.f15294d
            android.net.Uri r4 = r9.f15295e
            r5 = 0
            u1.t3 r6 = r9.f15296f
            r1.registerContentObserver(r4, r5, r6)
            o9.g r1 = r9.f15297n     // Catch: java.lang.Throwable -> L17
            o9.b r1 = r1.iterator()     // Catch: java.lang.Throwable -> L17
        L46:
            r4 = r9
        L47:
            r4.f15293c = r10     // Catch: java.lang.Throwable -> L84
            r4.f15291a = r1     // Catch: java.lang.Throwable -> L84
            r4.f15292b = r3     // Catch: java.lang.Throwable -> L84
            java.lang.Object r5 = r1.b(r4)     // Catch: java.lang.Throwable -> L84
            if (r5 != r0) goto L54
            return r0
        L54:
            r8 = r5
            r5 = r10
            r10 = r8
        L57:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L84
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L84
            if (r10 == 0) goto L86
            r1.c()     // Catch: java.lang.Throwable -> L84
            android.content.Context r10 = r4.f15298o     // Catch: java.lang.Throwable -> L84
            android.content.ContentResolver r10 = r10.getContentResolver()     // Catch: java.lang.Throwable -> L84
            java.lang.String r6 = "animator_duration_scale"
            r7 = 1065353216(0x3f800000, float:1.0)
            float r10 = android.provider.Settings.Global.getFloat(r10, r6, r7)     // Catch: java.lang.Throwable -> L84
            java.lang.Float r6 = new java.lang.Float     // Catch: java.lang.Throwable -> L84
            r6.<init>(r10)     // Catch: java.lang.Throwable -> L84
            r4.f15293c = r5     // Catch: java.lang.Throwable -> L84
            r4.f15291a = r1     // Catch: java.lang.Throwable -> L84
            r4.f15292b = r2     // Catch: java.lang.Throwable -> L84
            java.lang.Object r10 = r5.emit(r6, r4)     // Catch: java.lang.Throwable -> L84
            if (r10 != r0) goto L82
            return r0
        L82:
            r10 = r5
            goto L47
        L84:
            r10 = move-exception
            goto L90
        L86:
            android.content.ContentResolver r10 = r4.f15294d
            u1.t3 r0 = r4.f15296f
            r10.unregisterContentObserver(r0)
            q8.l r10 = q8.l.f13235a
            return r10
        L90:
            android.content.ContentResolver r0 = r4.f15294d
            u1.t3 r1 = r4.f15296f
            r0.unregisterContentObserver(r1)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: u1.s3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
