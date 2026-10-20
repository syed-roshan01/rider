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
    */
    public final boolean l(i iVar, int i10) {
        boolean zC = e1.c(i10, 5);
        h1 h1Var = this.f830f;
        if (!zC && !e1.c(i10, 6)) {
            if (!e1.c(i10, 3) && !e1.c(i10, 4)) {
                if (!e1.c(i10, 1) && !e1.c(i10, 2)) {
                    throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction".toString());
                }
            }
            if (m(i10)) {
                if (iVar.f810b >= this.f826b.c() - 1) {
                    return false;
                }
            } else if (iVar.f809a <= 0) {
                return false;
            }
            return true;
        }
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
