package p9;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class q0 extends q9.b implements y, f, q9.q {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f12947f = AtomicReferenceFieldUpdater.newUpdater(q0.class, Object.class, "_state");
    private volatile Object _state;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12948e;

    public q0(Object obj) {
        this._state = obj;
    }

    @Override // p9.x
    public final void a() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override // q9.q
    public final f b(u8.j jVar, int i10, o9.a aVar) {
        return ((((i10 < 0 || i10 >= 2) && i10 != -2) || aVar != o9.a.f12669b) && !((i10 == 0 || i10 == -3) && aVar == o9.a.f12668a)) ? new q9.j(i10, jVar, aVar, this) : this;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00ec A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:14:0x0039, B:28:0x007d, B:30:0x0085, B:33:0x008c, B:34:0x0092, B:36:0x0095, B:46:0x00b6, B:49:0x00c9, B:50:0x00e1, B:56:0x00f5, B:53:0x00ec, B:55:0x00f2, B:38:0x009b, B:42:0x00a2, B:21:0x0053, B:24:0x005d, B:27:0x006e), top: B:63:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x00f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:? A[LOOP:0: B:50:0x00e1->B:68:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00c8 -> B:28:0x007d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p9.f
    public final java.lang.Object collect(p9.g r17, u8.e r18) {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p9.q0.collect(p9.g, u8.e):java.lang.Object");
    }

    @Override // q9.b
    public final q9.d d() {
        return new r0();
    }

    @Override // q9.b
    public final q9.d[] e() {
        return new r0[2];
    }

    @Override // p9.g
    public final Object emit(Object obj, u8.e eVar) {
        i(obj);
        return q8.l.f13235a;
    }

    @Override // p9.x
    public final boolean f(Object obj) {
        i(obj);
        return true;
    }

    @Override // p9.o0
    public final Object getValue() {
        i3.u uVar = q9.c.f13247b;
        Object obj = f12947f.get(this);
        if (obj == uVar) {
            return null;
        }
        return obj;
    }

    public final void i(Object obj) {
        if (obj == null) {
            obj = q9.c.f13247b;
        }
        j(null, obj);
    }

    public final boolean j(Object obj, Object obj2) throws IllegalAccessException, InvocationTargetException {
        int i10;
        q9.d[] dVarArr;
        i3.u uVar;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12947f;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !d7.a.d(obj3, obj)) {
                return false;
            }
            if (d7.a.d(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i11 = this.f12948e;
            if ((i11 & 1) != 0) {
                this.f12948e = i11 + 2;
                return true;
            }
            int i12 = i11 + 1;
            this.f12948e = i12;
            q9.d[] dVarArr2 = this.f13242a;
            while (true) {
                r0[] r0VarArr = (r0[]) dVarArr2;
                if (r0VarArr != null) {
                    for (r0 r0Var : r0VarArr) {
                        if (r0Var != null) {
                            while (true) {
                                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = r0.f12951a;
                                Object obj4 = atomicReferenceFieldUpdater2.get(r0Var);
                                if (obj4 == null || obj4 == (uVar = d0.f12884c)) {
                                    break;
                                }
                                i3.u uVar2 = d0.f12883b;
                                if (obj4 != uVar2) {
                                    do {
                                        if (atomicReferenceFieldUpdater2.compareAndSet(r0Var, obj4, uVar2)) {
                                            ((m9.l) obj4).resumeWith(q8.l.f13235a);
                                            break;
                                        }
                                    } while (atomicReferenceFieldUpdater2.get(r0Var) == obj4);
                                } else {
                                    do {
                                        if (atomicReferenceFieldUpdater2.compareAndSet(r0Var, obj4, uVar)) {
                                            break;
                                        }
                                    } while (atomicReferenceFieldUpdater2.get(r0Var) == obj4);
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i10 = this.f12948e;
                    if (i10 == i12) {
                        this.f12948e = i12 + 1;
                        return true;
                    }
                    dVarArr = this.f13242a;
                }
                dVarArr2 = dVarArr;
                i12 = i10;
            }
        }
    }
}
