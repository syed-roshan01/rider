package a0;

import r1.e1;
import v.h1;

/* JADX INFO: loaded from: classes.dex */
public final class m implements s1.g, r1.f {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final k f825g = new k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f827c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f828d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m2.l f829e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h1 f830f;

    public m(n nVar, j jVar, boolean z10, m2.l lVar, h1 h1Var) {
        this.f826b = nVar;
        this.f827c = jVar;
        this.f828d = z10;
        this.f829e = lVar;
        this.f830f = h1Var;
    }

    @Override // s1.g
    public final s1.i getKey() {
        return r1.h.f13381a;
    }

    @Override // s1.g
    public final Object getValue() {
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0029, code lost:
    
        if (r3 == v.h1.f15593a) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0015, code lost:
    
        if (r3 == v.h1.f15594b) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean l(a0.i r5, int r6) {
        /*
            r4 = this;
            r0 = 5
            boolean r0 = r1.e1.c(r6, r0)
            r1 = 0
            r2 = 1
            v.h1 r3 = r4.f830f
            if (r0 == 0) goto Lc
            goto L13
        Lc:
            r0 = 6
            boolean r0 = r1.e1.c(r6, r0)
            if (r0 == 0) goto L18
        L13:
            v.h1 r0 = v.h1.f15594b
            if (r3 != r0) goto L3a
            goto L2b
        L18:
            r0 = 3
            boolean r0 = r1.e1.c(r6, r0)
            if (r0 == 0) goto L20
            goto L27
        L20:
            r0 = 4
            boolean r0 = r1.e1.c(r6, r0)
            if (r0 == 0) goto L2c
        L27:
            v.h1 r0 = v.h1.f15593a
            if (r3 != r0) goto L3a
        L2b:
            return r1
        L2c:
            boolean r0 = r1.e1.c(r6, r2)
            if (r0 == 0) goto L33
            goto L3a
        L33:
            r0 = 2
            boolean r0 = r1.e1.c(r6, r0)
            if (r0 == 0) goto L53
        L3a:
            boolean r6 = r4.m(r6)
            if (r6 == 0) goto L4d
            int r5 = r5.f810b
            a0.n r6 = r4.f826b
            int r6 = r6.c()
            int r6 = r6 - r2
            if (r5 >= r6) goto L52
        L4b:
            r1 = r2
            goto L52
        L4d:
            int r5 = r5.f809a
            if (r5 <= 0) goto L52
            goto L4b
        L52:
            return r1
        L53:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Lazy list does not support beyond bounds layout for the specified direction"
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.m.l(a0.i, int):boolean");
    }

    public final boolean m(int i10) {
        if (!e1.c(i10, 1)) {
            if (e1.c(i10, 2)) {
                return true;
            }
            boolean zC = e1.c(i10, 5);
            boolean z10 = this.f828d;
            if (!zC) {
                if (!e1.c(i10, 6)) {
                    boolean zC2 = e1.c(i10, 3);
                    m2.l lVar = this.f829e;
                    if (zC2) {
                        int iOrdinal = lVar.ordinal();
                        if (iOrdinal != 0) {
                            if (iOrdinal != 1) {
                                throw new androidx.fragment.app.a0();
                            }
                            if (!z10) {
                                return true;
                            }
                        }
                    } else {
                        if (!e1.c(i10, 4)) {
                            throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction".toString());
                        }
                        int iOrdinal2 = lVar.ordinal();
                        if (iOrdinal2 != 0) {
                            if (iOrdinal2 != 1) {
                                throw new androidx.fragment.app.a0();
                            }
                        } else if (!z10) {
                            return true;
                        }
                    }
                } else if (!z10) {
                    return true;
                }
            }
            return z10;
        }
        return false;
    }
}
