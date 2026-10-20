package m0;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class f2 extends w8.i implements c9.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f11496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f11497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f11498c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Set f11499d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Set f11500e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public o0.d f11501f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public o0.d f11502n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f11503o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ a1 f11504p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ g2 f11505q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(g2 g2Var, u8.e eVar) {
        super(3, eVar);
        this.f11505q = g2Var;
    }

    public static final void h(List list, List list2, List list3, Set set, Set set2, o0.d dVar, o0.d dVar2) {
        list.clear();
        list2.clear();
        list3.clear();
        set.clear();
        set2.clear();
        dVar.clear();
        dVar2.clear();
    }

    public static final void i(List list, g2 g2Var) {
        list.clear();
        synchronized (g2Var.f11520b) {
            try {
                ArrayList arrayList = g2Var.f11528j;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    list.add((c1) arrayList.get(i10));
                }
                g2Var.f11528j.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // c9.f
    public final Object e(Object obj, Object obj2, Object obj3) {
        f2 f2Var = new f2(this.f11505q, (u8.e) obj3);
        f2Var.f11504p = (a1) obj2;
        return f2Var.invokeSuspend(q8.l.f13235a);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x00a1 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:16:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:20:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:21:0x00e2 A[Catch: all -> 0x00f9, TRY_LEAVE, TryCatch #0 {, blocks: (B:18:0x00da, B:21:0x00e2), top: B:66:0x00da }] */
    /* JADX WARN: Code duplicated, block: B:25:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:29:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:33:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:35:0x0100 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x0101  */
    /* JADX WARN: Code duplicated, block: B:39:0x0117  */
    /* JADX WARN: Code duplicated, block: B:41:0x015c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:42:0x015d  */
    /* JADX WARN: Code duplicated, block: B:65:0x0212  */
    /* JADX WARN: Code duplicated, block: B:66:0x00da A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x015d -> B:43:0x0168). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x0212 -> B:11:0x009c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // w8.a
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 551
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.f2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
