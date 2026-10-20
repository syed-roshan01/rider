package g2;

import com.google.crypto.tink.shaded.protobuf.j1;
import com.google.crypto.tink.shaded.protobuf.o0;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.protobuf.a1;
import com.google.protobuf.d2;
import com.google.protobuf.e1;
import com.google.protobuf.h3;
import com.google.protobuf.i1;
import com.google.protobuf.i2;
import com.google.protobuf.p0;
import com.google.protobuf.y0;
import com.google.protobuf.z0;
import java.nio.charset.Charset;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6579c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f6580d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f6581e;

    public m(char[] cArr, int i10, int i11) {
        this.f6577a = 0;
        this.f6578b = cArr.length;
        this.f6581e = cArr;
        this.f6579c = i10;
        this.f6580d = i11;
    }

    public final void A(List list) throws a1, com.google.crypto.tink.shaded.protobuf.h0 {
        int iX;
        int iX2;
        int iA;
        int iA2;
        switch (this.f6577a) {
            case 1:
                if (!(list instanceof com.google.crypto.tink.shaded.protobuf.c0)) {
                    int i10 = this.f6578b & 7;
                    if (i10 == 0) {
                        do {
                            list.add(Integer.valueOf(((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).p()));
                            if (((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).e()) {
                                return;
                            } else {
                                iX = ((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).x();
                            }
                        } while (iX == this.f6578b);
                        this.f6580d = iX;
                        return;
                    }
                    if (i10 != 2) {
                        throw com.google.crypto.tink.shaded.protobuf.h0.c();
                    }
                    int iD = ((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).d() + ((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).y();
                    do {
                        list.add(Integer.valueOf(((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).p()));
                    } while (((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).d() < iD);
                    T(iD);
                    return;
                }
                com.google.crypto.tink.shaded.protobuf.c0 c0Var = (com.google.crypto.tink.shaded.protobuf.c0) list;
                int i11 = this.f6578b & 7;
                if (i11 == 0) {
                    do {
                        c0Var.i(((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).p());
                        if (((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).e()) {
                            return;
                        } else {
                            iX2 = ((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).x();
                        }
                    } while (iX2 == this.f6578b);
                    this.f6580d = iX2;
                    return;
                }
                if (i11 != 2) {
                    throw com.google.crypto.tink.shaded.protobuf.h0.c();
                }
                int iD2 = ((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).d() + ((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).y();
                do {
                    c0Var.i(((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).p());
                } while (((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).d() < iD2);
                T(iD2);
                return;
            default:
                if (!(list instanceof p0)) {
                    int i12 = this.f6578b & 7;
                    if (i12 == 0) {
                        do {
                            list.add(Integer.valueOf(((com.google.protobuf.s) this.f6581e).r()));
                            if (((com.google.protobuf.s) this.f6581e).e()) {
                                return;
                            } else {
                                iA = ((com.google.protobuf.s) this.f6581e).A();
                            }
                        } while (iA == this.f6578b);
                        this.f6580d = iA;
                        return;
                    }
                    if (i12 != 2) {
                        throw a1.d();
                    }
                    int iD3 = ((com.google.protobuf.s) this.f6581e).d() + ((com.google.protobuf.s) this.f6581e).B();
                    do {
                        list.add(Integer.valueOf(((com.google.protobuf.s) this.f6581e).r()));
                    } while (((com.google.protobuf.s) this.f6581e).d() < iD3);
                    T(iD3);
                    return;
                }
                p0 p0Var = (p0) list;
                int i13 = this.f6578b & 7;
                if (i13 == 0) {
                    do {
                        p0Var.i(((com.google.protobuf.s) this.f6581e).r());
                        if (((com.google.protobuf.s) this.f6581e).e()) {
                            return;
                        } else {
                            iA2 = ((com.google.protobuf.s) this.f6581e).A();
                        }
                    } while (iA2 == this.f6578b);
                    this.f6580d = iA2;
                    return;
                }
                if (i13 != 2) {
                    throw a1.d();
                }
                int iD4 = ((com.google.protobuf.s) this.f6581e).d() + ((com.google.protobuf.s) this.f6581e).B();
                do {
                    p0Var.i(((com.google.protobuf.s) this.f6581e).r());
                } while (((com.google.protobuf.s) this.f6581e).d() < iD4);
                T(iD4);
                return;
        }
    }

    public final long B() throws z0, com.google.crypto.tink.shaded.protobuf.g0 {
        switch (this.f6577a) {
            case 1:
                U(0);
                return ((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).q();
            default:
                U(0);
                return ((com.google.protobuf.s) this.f6581e).s();
        }
    }

    public final void C(List list) throws a1, com.google.crypto.tink.shaded.protobuf.h0 {
        int iX;
        int iX2;
        int iA;
        int iA2;
        switch (this.f6577a) {
            case 1:
                if (!(list instanceof o0)) {
                    int i10 = this.f6578b & 7;
                    if (i10 == 0) {
                        do {
                            list.add(Long.valueOf(((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).q()));
                            if (((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).e()) {
                                return;
                            } else {
                                iX = ((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).x();
                            }
                        } while (iX == this.f6578b);
                        this.f6580d = iX;
                        return;
                    }
                    if (i10 != 2) {
                        throw com.google.crypto.tink.shaded.protobuf.h0.c();
                    }
                    int iD = ((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).d() + ((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).y();
                    do {
                        list.add(Long.valueOf(((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).q()));
                    } while (((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).d() < iD);
                    T(iD);
                    return;
                }
                o0 o0Var = (o0) list;
                int i11 = this.f6578b & 7;
                if (i11 == 0) {
                    do {
                        o0Var.i(((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).q());
                        if (((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).e()) {
                            return;
                        } else {
                            iX2 = ((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).x();
                        }
                    } while (iX2 == this.f6578b);
                    this.f6580d = iX2;
                    return;
                }
                if (i11 != 2) {
                    throw com.google.crypto.tink.shaded.protobuf.h0.c();
                }
                int iD2 = ((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).d() + ((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).y();
                do {
                    o0Var.i(((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).q());
                } while (((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).d() < iD2);
                T(iD2);
                return;
            default:
                if (!(list instanceof i1)) {
                    int i12 = this.f6578b & 7;
                    if (i12 == 0) {
                        do {
                            list.add(Long.valueOf(((com.google.protobuf.s) this.f6581e).s()));
                            if (((com.google.protobuf.s) this.f6581e).e()) {
                                return;
                            } else {
                                iA = ((com.google.protobuf.s) this.f6581e).A();
                            }
                        } while (iA == this.f6578b);
                        this.f6580d = iA;
                        return;
                    }
                    if (i12 != 2) {
                        throw a1.d();
                    }
                    int iD3 = ((com.google.protobuf.s) this.f6581e).d() + ((com.google.protobuf.s) this.f6581e).B();
                    do {
                        list.add(Long.valueOf(((com.google.protobuf.s) this.f6581e).s()));
                    } while (((com.google.protobuf.s) this.f6581e).d() < iD3);
                    T(iD3);
                    return;
                }
                i1 i1Var = (i1) list;
                int i13 = this.f6578b & 7;
                if (i13 == 0) {
                    do {
                        i1Var.i(((com.google.protobuf.s) this.f6581e).s());
                        if (((com.google.protobuf.s) this.f6581e).e()) {
                            return;
                        } else {
                            iA2 = ((com.google.protobuf.s) this.f6581e).A();
                        }
                    } while (iA2 == this.f6578b);
                    this.f6580d = iA2;
                    return;
                }
                if (i13 != 2) {
                    throw a1.d();
                }
                int iD4 = ((com.google.protobuf.s) this.f6581e).d() + ((com.google.protobuf.s) this.f6581e).B();
                do {
                    i1Var.i(((com.google.protobuf.s) this.f6581e).s());
                } while (((com.google.protobuf.s) this.f6581e).d() < iD4);
                T(iD4);
                return;
        }
    }

    public final Object D(Class cls, com.google.protobuf.z zVar) throws a1, com.google.crypto.tink.shaded.protobuf.g0 {
        U(2);
        i2 i2VarA = d2.f4094c.a(cls);
        Object objF = i2VarA.f();
        i(objF, i2VarA, zVar);
        i2VarA.b(objF);
        return objF;
    }

    public final int E() throws z0, com.google.crypto.tink.shaded.protobuf.g0 {
        switch (this.f6577a) {
            case 1:
                U(5);
                return ((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).r();
            default:
                U(5);
                return ((com.google.protobuf.s) this.f6581e).u();
        }
    }

    public final void F(List list) throws a1, com.google.crypto.tink.shaded.protobuf.h0 {
        int iX;
        int iX2;
        int iA;
        int iA2;
        switch (this.f6577a) {
            case 1:
                if (!(list instanceof com.google.crypto.tink.shaded.protobuf.c0)) {
                    int i10 = this.f6578b & 7;
                    if (i10 == 2) {
                        int iY = ((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).y();
                        W(iY);
                        int iD = ((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).d() + iY;
                        do {
                            list.add(Integer.valueOf(((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).r()));
                        } while (((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).d() < iD);
                        return;
                    }
                    if (i10 != 5) {
                        throw com.google.crypto.tink.shaded.protobuf.h0.c();
                    }
                    do {
                        list.add(Integer.valueOf(((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).r()));
                        if (((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).e()) {
                            return;
                        } else {
                            iX = ((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).x();
                        }
                    } while (iX == this.f6578b);
                    this.f6580d = iX;
                    return;
                }
                com.google.crypto.tink.shaded.protobuf.c0 c0Var = (com.google.crypto.tink.shaded.protobuf.c0) list;
                int i11 = this.f6578b & 7;
                if (i11 == 2) {
                    int iY2 = ((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).y();
                    W(iY2);
                    int iD2 = ((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).d() + iY2;
                    do {
                        c0Var.i(((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).r());
                    } while (((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).d() < iD2);
                    return;
                }
                if (i11 != 5) {
                    throw com.google.crypto.tink.shaded.protobuf.h0.c();
                }
                do {
                    c0Var.i(((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).r());
                    if (((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).e()) {
                        return;
                    } else {
                        iX2 = ((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).x();
                    }
                } while (iX2 == this.f6578b);
                this.f6580d = iX2;
                return;
            default:
                if (!(list instanceof p0)) {
                    int i12 = this.f6578b & 7;
                    if (i12 == 2) {
                        int iB = ((com.google.protobuf.s) this.f6581e).B();
                        W(iB);
                        int iD3 = iB + ((com.google.protobuf.s) this.f6581e).d();
                        do {
                            list.add(Integer.valueOf(((com.google.protobuf.s) this.f6581e).u()));
                        } while (((com.google.protobuf.s) this.f6581e).d() < iD3);
                        return;
                    }
                    if (i12 != 5) {
                        throw a1.d();
                    }
                    do {
                        list.add(Integer.valueOf(((com.google.protobuf.s) this.f6581e).u()));
                        if (((com.google.protobuf.s) this.f6581e).e()) {
                            return;
                        } else {
                            iA = ((com.google.protobuf.s) this.f6581e).A();
                        }
                    } while (iA == this.f6578b);
                    this.f6580d = iA;
                    return;
                }
                p0 p0Var = (p0) list;
                int i13 = this.f6578b & 7;
                if (i13 == 2) {
                    int iB2 = ((com.google.protobuf.s) this.f6581e).B();
                    W(iB2);
                    int iD4 = ((com.google.protobuf.s) this.f6581e).d() + iB2;
                    do {
                        p0Var.i(((com.google.protobuf.s) this.f6581e).u());
                    } while (((com.google.protobuf.s) this.f6581e).d() < iD4);
                    return;
                }
                if (i13 != 5) {
                    throw a1.d();
                }
                do {
                    p0Var.i(((com.google.protobuf.s) this.f6581e).u());
                    if (((com.google.protobuf.s) this.f6581e).e()) {
                        return;
                    } else {
                        iA2 = ((com.google.protobuf.s) this.f6581e).A();
                    }
                } while (iA2 == this.f6578b);
                this.f6580d = iA2;
                return;
        }
    }

    public final long G() throws z0, com.google.crypto.tink.shaded.protobuf.g0 {
        switch (this.f6577a) {
            case 1:
                U(1);
                return ((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).s();
            default:
                U(1);
                return ((com.google.protobuf.s) this.f6581e).v();
        }
    }

    public final void H(List list) throws a1, com.google.crypto.tink.shaded.protobuf.h0 {
        int iX;
        int iX2;
        int iA;
        int iA2;
        switch (this.f6577a) {
            case 1:
                if (!(list instanceof o0)) {
                    int i10 = this.f6578b & 7;
                    if (i10 == 1) {
                        do {
                            list.add(Long.valueOf(((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).s()));
                            if (((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).e()) {
                                return;
                            } else {
                                iX = ((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).x();
                            }
                        } while (iX == this.f6578b);
                        this.f6580d = iX;
                        return;
                    }
                    if (i10 != 2) {
                        throw com.google.crypto.tink.shaded.protobuf.h0.c();
                    }
                    int iY = ((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).y();
                    X(iY);
                    int iD = ((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).d() + iY;
                    do {
                        list.add(Long.valueOf(((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).s()));
                    } while (((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).d() < iD);
                    return;
                }
                o0 o0Var = (o0) list;
                int i11 = this.f6578b & 7;
                if (i11 == 1) {
                    do {
                        o0Var.i(((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).s());
                        if (((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).e()) {
                            return;
                        } else {
                            iX2 = ((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).x();
                        }
                    } while (iX2 == this.f6578b);
                    this.f6580d = iX2;
                    return;
                }
                if (i11 != 2) {
                    throw com.google.crypto.tink.shaded.protobuf.h0.c();
                }
                int iY2 = ((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).y();
                X(iY2);
                int iD2 = ((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).d() + iY2;
                do {
                    o0Var.i(((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).s());
                } while (((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).d() < iD2);
                return;
            default:
                if (!(list instanceof i1)) {
                    int i12 = this.f6578b & 7;
                    if (i12 == 1) {
                        do {
                            list.add(Long.valueOf(((com.google.protobuf.s) this.f6581e).v()));
                            if (((com.google.protobuf.s) this.f6581e).e()) {
                                return;
                            } else {
                                iA = ((com.google.protobuf.s) this.f6581e).A();
                            }
                        } while (iA == this.f6578b);
                        this.f6580d = iA;
                        return;
                    }
                    if (i12 != 2) {
                        throw a1.d();
                    }
                    int iB = ((com.google.protobuf.s) this.f6581e).B();
                    X(iB);
                    int iD3 = ((com.google.protobuf.s) this.f6581e).d() + iB;
                    do {
                        list.add(Long.valueOf(((com.google.protobuf.s) this.f6581e).v()));
                    } while (((com.google.protobuf.s) this.f6581e).d() < iD3);
                    return;
                }
                i1 i1Var = (i1) list;
                int i13 = this.f6578b & 7;
                if (i13 == 1) {
                    do {
                        i1Var.i(((com.google.protobuf.s) this.f6581e).v());
                        if (((com.google.protobuf.s) this.f6581e).e()) {
                            return;
                        } else {
                            iA2 = ((com.google.protobuf.s) this.f6581e).A();
                        }
                    } while (iA2 == this.f6578b);
                    this.f6580d = iA2;
                    return;
                }
                if (i13 != 2) {
                    throw a1.d();
                }
                int iB2 = ((com.google.protobuf.s) this.f6581e).B();
                X(iB2);
                int iD4 = ((com.google.protobuf.s) this.f6581e).d() + iB2;
                do {
                    i1Var.i(((com.google.protobuf.s) this.f6581e).v());
                } while (((com.google.protobuf.s) this.f6581e).d() < iD4);
                return;
        }
    }

    public final int I() throws z0, com.google.crypto.tink.shaded.protobuf.g0 {
        switch (this.f6577a) {
            case 1:
                U(0);
                return ((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).t();
            default:
                U(0);
                return ((com.google.protobuf.s) this.f6581e).w();
        }
    }

    public final void J(List list) throws a1, com.google.crypto.tink.shaded.protobuf.h0 {
        int iX;
        int iX2;
        int iA;
        int iA2;
        switch (this.f6577a) {
            case 1:
                if (!(list instanceof com.google.crypto.tink.shaded.protobuf.c0)) {
                    int i10 = this.f6578b & 7;
                    if (i10 == 0) {
                        do {
                            list.add(Integer.valueOf(((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).t()));
                            if (((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).e()) {
                                return;
                            } else {
                                iX = ((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).x();
                            }
                        } while (iX == this.f6578b);
                        this.f6580d = iX;
                        return;
                    }
                    if (i10 != 2) {
                        throw com.google.crypto.tink.shaded.protobuf.h0.c();
                    }
                    int iD = ((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).d() + ((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).y();
                    do {
                        list.add(Integer.valueOf(((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).t()));
                    } while (((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).d() < iD);
                    T(iD);
                    return;
                }
                com.google.crypto.tink.shaded.protobuf.c0 c0Var = (com.google.crypto.tink.shaded.protobuf.c0) list;
                int i11 = this.f6578b & 7;
                if (i11 == 0) {
                    do {
                        c0Var.i(((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).t());
                        if (((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).e()) {
                            return;
                        } else {
                            iX2 = ((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).x();
                        }
                    } while (iX2 == this.f6578b);
                    this.f6580d = iX2;
                    return;
                }
                if (i11 != 2) {
                    throw com.google.crypto.tink.shaded.protobuf.h0.c();
                }
                int iD2 = ((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).d() + ((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).y();
                do {
                    c0Var.i(((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).t());
                } while (((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).d() < iD2);
                T(iD2);
                return;
            default:
                if (!(list instanceof p0)) {
                    int i12 = this.f6578b & 7;
                    if (i12 == 0) {
                        do {
                            list.add(Integer.valueOf(((com.google.protobuf.s) this.f6581e).w()));
                            if (((com.google.protobuf.s) this.f6581e).e()) {
                                return;
                            } else {
                                iA = ((com.google.protobuf.s) this.f6581e).A();
                            }
                        } while (iA == this.f6578b);
                        this.f6580d = iA;
                        return;
                    }
                    if (i12 != 2) {
                        throw a1.d();
                    }
                    int iD3 = ((com.google.protobuf.s) this.f6581e).d() + ((com.google.protobuf.s) this.f6581e).B();
                    do {
                        list.add(Integer.valueOf(((com.google.protobuf.s) this.f6581e).w()));
                    } while (((com.google.protobuf.s) this.f6581e).d() < iD3);
                    T(iD3);
                    return;
                }
                p0 p0Var = (p0) list;
                int i13 = this.f6578b & 7;
                if (i13 == 0) {
                    do {
                        p0Var.i(((com.google.protobuf.s) this.f6581e).w());
                        if (((com.google.protobuf.s) this.f6581e).e()) {
                            return;
                        } else {
                            iA2 = ((com.google.protobuf.s) this.f6581e).A();
                        }
                    } while (iA2 == this.f6578b);
                    this.f6580d = iA2;
                    return;
                }
                if (i13 != 2) {
                    throw a1.d();
                }
                int iD4 = ((com.google.protobuf.s) this.f6581e).d() + ((com.google.protobuf.s) this.f6581e).B();
                do {
                    p0Var.i(((com.google.protobuf.s) this.f6581e).w());
                } while (((com.google.protobuf.s) this.f6581e).d() < iD4);
                T(iD4);
                return;
        }
    }

    public final long K() throws z0, com.google.crypto.tink.shaded.protobuf.g0 {
        switch (this.f6577a) {
            case 1:
                U(0);
                return ((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).u();
            default:
                U(0);
                return ((com.google.protobuf.s) this.f6581e).x();
        }
    }

    public final void L(List list) throws a1, com.google.crypto.tink.shaded.protobuf.h0 {
        int iX;
        int iX2;
        int iA;
        int iA2;
        switch (this.f6577a) {
            case 1:
                if (!(list instanceof o0)) {
                    int i10 = this.f6578b & 7;
                    if (i10 == 0) {
                        do {
                            list.add(Long.valueOf(((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).u()));
                            if (((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).e()) {
                                return;
                            } else {
                                iX = ((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).x();
                            }
                        } while (iX == this.f6578b);
                        this.f6580d = iX;
                        return;
                    }
                    if (i10 != 2) {
                        throw com.google.crypto.tink.shaded.protobuf.h0.c();
                    }
                    int iD = ((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).d() + ((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).y();
                    do {
                        list.add(Long.valueOf(((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).u()));
                    } while (((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).d() < iD);
                    T(iD);
                    return;
                }
                o0 o0Var = (o0) list;
                int i11 = this.f6578b & 7;
                if (i11 == 0) {
                    do {
                        o0Var.i(((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).u());
                        if (((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).e()) {
                            return;
                        } else {
                            iX2 = ((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).x();
                        }
                    } while (iX2 == this.f6578b);
                    this.f6580d = iX2;
                    return;
                }
                if (i11 != 2) {
                    throw com.google.crypto.tink.shaded.protobuf.h0.c();
                }
                int iD2 = ((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).d() + ((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).y();
                do {
                    o0Var.i(((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).u());
                } while (((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).d() < iD2);
                T(iD2);
                return;
            default:
                if (!(list instanceof i1)) {
                    int i12 = this.f6578b & 7;
                    if (i12 == 0) {
                        do {
                            list.add(Long.valueOf(((com.google.protobuf.s) this.f6581e).x()));
                            if (((com.google.protobuf.s) this.f6581e).e()) {
                                return;
                            } else {
                                iA = ((com.google.protobuf.s) this.f6581e).A();
                            }
                        } while (iA == this.f6578b);
                        this.f6580d = iA;
                        return;
                    }
                    if (i12 != 2) {
                        throw a1.d();
                    }
                    int iD3 = ((com.google.protobuf.s) this.f6581e).d() + ((com.google.protobuf.s) this.f6581e).B();
                    do {
                        list.add(Long.valueOf(((com.google.protobuf.s) this.f6581e).x()));
                    } while (((com.google.protobuf.s) this.f6581e).d() < iD3);
                    T(iD3);
                    return;
                }
                i1 i1Var = (i1) list;
                int i13 = this.f6578b & 7;
                if (i13 == 0) {
                    do {
                        i1Var.i(((com.google.protobuf.s) this.f6581e).x());
                        if (((com.google.protobuf.s) this.f6581e).e()) {
                            return;
                        } else {
                            iA2 = ((com.google.protobuf.s) this.f6581e).A();
                        }
                    } while (iA2 == this.f6578b);
                    this.f6580d = iA2;
                    return;
                }
                if (i13 != 2) {
                    throw a1.d();
                }
                int iD4 = ((com.google.protobuf.s) this.f6581e).d() + ((com.google.protobuf.s) this.f6581e).B();
                do {
                    i1Var.i(((com.google.protobuf.s) this.f6581e).x());
                } while (((com.google.protobuf.s) this.f6581e).d() < iD4);
                T(iD4);
                return;
        }
    }

    public final String M() throws z0, com.google.crypto.tink.shaded.protobuf.g0 {
        switch (this.f6577a) {
            case 1:
                U(2);
                return ((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).v();
            default:
                U(2);
                return ((com.google.protobuf.s) this.f6581e).y();
        }
    }

    public final void N(List list, boolean z10) throws z0, com.google.crypto.tink.shaded.protobuf.g0 {
        int iX;
        int iX2;
        int iA;
        int iA2;
        switch (this.f6577a) {
            case 1:
                if ((this.f6578b & 7) != 2) {
                    throw com.google.crypto.tink.shaded.protobuf.h0.c();
                }
                if (!(list instanceof com.google.crypto.tink.shaded.protobuf.k0) || z10) {
                    do {
                        list.add(z10 ? O() : M());
                        if (((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).e()) {
                            return;
                        } else {
                            iX = ((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).x();
                        }
                    } while (iX == this.f6578b);
                    this.f6580d = iX;
                    return;
                }
                com.google.crypto.tink.shaded.protobuf.k0 k0Var = (com.google.crypto.tink.shaded.protobuf.k0) list;
                do {
                    k0Var.l(l());
                    if (((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).e()) {
                        return;
                    } else {
                        iX2 = ((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).x();
                    }
                } while (iX2 == this.f6578b);
                this.f6580d = iX2;
                return;
            default:
                if ((this.f6578b & 7) != 2) {
                    throw a1.d();
                }
                if (!(list instanceof e1) || z10) {
                    do {
                        list.add(z10 ? O() : M());
                        if (((com.google.protobuf.s) this.f6581e).e()) {
                            return;
                        } else {
                            iA = ((com.google.protobuf.s) this.f6581e).A();
                        }
                    } while (iA == this.f6578b);
                    this.f6580d = iA;
                    return;
                }
                e1 e1Var = (e1) list;
                do {
                    e1Var.j(m());
                    if (((com.google.protobuf.s) this.f6581e).e()) {
                        return;
                    } else {
                        iA2 = ((com.google.protobuf.s) this.f6581e).A();
                    }
                } while (iA2 == this.f6578b);
                this.f6580d = iA2;
                return;
        }
    }

    public final String O() throws z0, com.google.crypto.tink.shaded.protobuf.g0 {
        switch (this.f6577a) {
            case 1:
                U(2);
                return ((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).w();
            default:
                U(2);
                return ((com.google.protobuf.s) this.f6581e).z();
        }
    }

    public final int P() throws z0, com.google.crypto.tink.shaded.protobuf.g0 {
        switch (this.f6577a) {
            case 1:
                U(0);
                return ((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).y();
            default:
                U(0);
                return ((com.google.protobuf.s) this.f6581e).B();
        }
    }

    public final void Q(List list) throws a1, com.google.crypto.tink.shaded.protobuf.h0 {
        int iX;
        int iX2;
        int iA;
        int iA2;
        switch (this.f6577a) {
            case 1:
                if (!(list instanceof com.google.crypto.tink.shaded.protobuf.c0)) {
                    int i10 = this.f6578b & 7;
                    if (i10 == 0) {
                        do {
                            list.add(Integer.valueOf(((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).y()));
                            if (((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).e()) {
                                return;
                            } else {
                                iX = ((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).x();
                            }
                        } while (iX == this.f6578b);
                        this.f6580d = iX;
                        return;
                    }
                    if (i10 != 2) {
                        throw com.google.crypto.tink.shaded.protobuf.h0.c();
                    }
                    int iD = ((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).d() + ((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).y();
                    do {
                        list.add(Integer.valueOf(((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).y()));
                    } while (((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).d() < iD);
                    T(iD);
                    return;
                }
                com.google.crypto.tink.shaded.protobuf.c0 c0Var = (com.google.crypto.tink.shaded.protobuf.c0) list;
                int i11 = this.f6578b & 7;
                if (i11 == 0) {
                    do {
                        c0Var.i(((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).y());
                        if (((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).e()) {
                            return;
                        } else {
                            iX2 = ((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).x();
                        }
                    } while (iX2 == this.f6578b);
                    this.f6580d = iX2;
                    return;
                }
                if (i11 != 2) {
                    throw com.google.crypto.tink.shaded.protobuf.h0.c();
                }
                int iD2 = ((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).d() + ((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).y();
                do {
                    c0Var.i(((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).y());
                } while (((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).d() < iD2);
                T(iD2);
                return;
            default:
                if (!(list instanceof p0)) {
                    int i12 = this.f6578b & 7;
                    if (i12 == 0) {
                        do {
                            list.add(Integer.valueOf(((com.google.protobuf.s) this.f6581e).B()));
                            if (((com.google.protobuf.s) this.f6581e).e()) {
                                return;
                            } else {
                                iA = ((com.google.protobuf.s) this.f6581e).A();
                            }
                        } while (iA == this.f6578b);
                        this.f6580d = iA;
                        return;
                    }
                    if (i12 != 2) {
                        throw a1.d();
                    }
                    int iD3 = ((com.google.protobuf.s) this.f6581e).d() + ((com.google.protobuf.s) this.f6581e).B();
                    do {
                        list.add(Integer.valueOf(((com.google.protobuf.s) this.f6581e).B()));
                    } while (((com.google.protobuf.s) this.f6581e).d() < iD3);
                    T(iD3);
                    return;
                }
                p0 p0Var = (p0) list;
                int i13 = this.f6578b & 7;
                if (i13 == 0) {
                    do {
                        p0Var.i(((com.google.protobuf.s) this.f6581e).B());
                        if (((com.google.protobuf.s) this.f6581e).e()) {
                            return;
                        } else {
                            iA2 = ((com.google.protobuf.s) this.f6581e).A();
                        }
                    } while (iA2 == this.f6578b);
                    this.f6580d = iA2;
                    return;
                }
                if (i13 != 2) {
                    throw a1.d();
                }
                int iD4 = ((com.google.protobuf.s) this.f6581e).d() + ((com.google.protobuf.s) this.f6581e).B();
                do {
                    p0Var.i(((com.google.protobuf.s) this.f6581e).B());
                } while (((com.google.protobuf.s) this.f6581e).d() < iD4);
                T(iD4);
                return;
        }
    }

    public final long R() throws z0, com.google.crypto.tink.shaded.protobuf.g0 {
        switch (this.f6577a) {
            case 1:
                U(0);
                return ((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).z();
            default:
                U(0);
                return ((com.google.protobuf.s) this.f6581e).C();
        }
    }

    public final void S(List list) throws a1, com.google.crypto.tink.shaded.protobuf.h0 {
        int iX;
        int iX2;
        int iA;
        int iA2;
        switch (this.f6577a) {
            case 1:
                if (!(list instanceof o0)) {
                    int i10 = this.f6578b & 7;
                    if (i10 == 0) {
                        do {
                            list.add(Long.valueOf(((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).z()));
                            if (((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).e()) {
                                return;
                            } else {
                                iX = ((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).x();
                            }
                        } while (iX == this.f6578b);
                        this.f6580d = iX;
                        return;
                    }
                    if (i10 != 2) {
                        throw com.google.crypto.tink.shaded.protobuf.h0.c();
                    }
                    int iD = ((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).d() + ((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).y();
                    do {
                        list.add(Long.valueOf(((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).z()));
                    } while (((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).d() < iD);
                    T(iD);
                    return;
                }
                o0 o0Var = (o0) list;
                int i11 = this.f6578b & 7;
                if (i11 == 0) {
                    do {
                        o0Var.i(((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).z());
                        if (((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).e()) {
                            return;
                        } else {
                            iX2 = ((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).x();
                        }
                    } while (iX2 == this.f6578b);
                    this.f6580d = iX2;
                    return;
                }
                if (i11 != 2) {
                    throw com.google.crypto.tink.shaded.protobuf.h0.c();
                }
                int iD2 = ((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).d() + ((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).y();
                do {
                    o0Var.i(((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).z());
                } while (((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).d() < iD2);
                T(iD2);
                return;
            default:
                if (!(list instanceof i1)) {
                    int i12 = this.f6578b & 7;
                    if (i12 == 0) {
                        do {
                            list.add(Long.valueOf(((com.google.protobuf.s) this.f6581e).C()));
                            if (((com.google.protobuf.s) this.f6581e).e()) {
                                return;
                            } else {
                                iA = ((com.google.protobuf.s) this.f6581e).A();
                            }
                        } while (iA == this.f6578b);
                        this.f6580d = iA;
                        return;
                    }
                    if (i12 != 2) {
                        throw a1.d();
                    }
                    int iD3 = ((com.google.protobuf.s) this.f6581e).d() + ((com.google.protobuf.s) this.f6581e).B();
                    do {
                        list.add(Long.valueOf(((com.google.protobuf.s) this.f6581e).C()));
                    } while (((com.google.protobuf.s) this.f6581e).d() < iD3);
                    T(iD3);
                    return;
                }
                i1 i1Var = (i1) list;
                int i13 = this.f6578b & 7;
                if (i13 == 0) {
                    do {
                        i1Var.i(((com.google.protobuf.s) this.f6581e).C());
                        if (((com.google.protobuf.s) this.f6581e).e()) {
                            return;
                        } else {
                            iA2 = ((com.google.protobuf.s) this.f6581e).A();
                        }
                    } while (iA2 == this.f6578b);
                    this.f6580d = iA2;
                    return;
                }
                if (i13 != 2) {
                    throw a1.d();
                }
                int iD4 = ((com.google.protobuf.s) this.f6581e).d() + ((com.google.protobuf.s) this.f6581e).B();
                do {
                    i1Var.i(((com.google.protobuf.s) this.f6581e).C());
                } while (((com.google.protobuf.s) this.f6581e).d() < iD4);
                T(iD4);
                return;
        }
    }

    public final void T(int i10) throws a1, com.google.crypto.tink.shaded.protobuf.h0 {
        switch (this.f6577a) {
            case 1:
                if (((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).d() != i10) {
                    throw com.google.crypto.tink.shaded.protobuf.h0.g();
                }
                return;
            default:
                if (((com.google.protobuf.s) this.f6581e).d() != i10) {
                    throw a1.h();
                }
                return;
        }
    }

    public final void U(int i10) throws z0, com.google.crypto.tink.shaded.protobuf.g0 {
        switch (this.f6577a) {
            case 1:
                if ((this.f6578b & 7) != i10) {
                    throw com.google.crypto.tink.shaded.protobuf.h0.c();
                }
                return;
            default:
                if ((this.f6578b & 7) != i10) {
                    throw a1.d();
                }
                return;
        }
    }

    public final boolean V() {
        int i10;
        int i11;
        switch (this.f6577a) {
            case 1:
                if (((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).e() || (i10 = this.f6578b) == this.f6579c) {
                    return false;
                }
                return ((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).A(i10);
            default:
                if (((com.google.protobuf.s) this.f6581e).e() || (i11 = this.f6578b) == this.f6579c) {
                    return false;
                }
                return ((com.google.protobuf.s) this.f6581e).D(i11);
        }
    }

    public final void W(int i10) throws a1, com.google.crypto.tink.shaded.protobuf.h0 {
        switch (this.f6577a) {
            case 1:
                if ((i10 & 3) != 0) {
                    throw com.google.crypto.tink.shaded.protobuf.h0.f();
                }
                return;
            default:
                if ((i10 & 3) != 0) {
                    throw a1.g();
                }
                return;
        }
    }

    public final void X(int i10) throws a1, com.google.crypto.tink.shaded.protobuf.h0 {
        switch (this.f6577a) {
            case 1:
                if ((i10 & 7) != 0) {
                    throw com.google.crypto.tink.shaded.protobuf.h0.f();
                }
                return;
            default:
                if ((i10 & 7) != 0) {
                    throw a1.g();
                }
                return;
        }
    }

    public final int a() {
        return this.f6580d - this.f6579c;
    }

    public final int b() {
        switch (this.f6577a) {
            case 1:
                int i10 = this.f6580d;
                if (i10 != 0) {
                    this.f6578b = i10;
                    this.f6580d = 0;
                } else {
                    this.f6578b = ((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).x();
                }
                int i11 = this.f6578b;
                if (i11 == 0 || i11 == this.f6579c) {
                    return Integer.MAX_VALUE;
                }
                return i11 >>> 3;
            default:
                int i12 = this.f6580d;
                if (i12 != 0) {
                    this.f6578b = i12;
                    this.f6580d = 0;
                } else {
                    this.f6578b = ((com.google.protobuf.s) this.f6581e).A();
                }
                int i13 = this.f6578b;
                if (i13 == 0 || i13 == this.f6579c) {
                    return Integer.MAX_VALUE;
                }
                return i13 >>> 3;
        }
    }

    public final int c() {
        switch (this.f6577a) {
            case 1:
                break;
        }
        return this.f6578b;
    }

    public final void d(com.google.crypto.tink.shaded.protobuf.b bVar, j1 j1Var, com.google.crypto.tink.shaded.protobuf.t tVar) throws z0, com.google.crypto.tink.shaded.protobuf.g0 {
        U(3);
        f(bVar, j1Var, tVar);
    }

    public final void e(Object obj, i2 i2Var, com.google.protobuf.z zVar) throws z0, com.google.crypto.tink.shaded.protobuf.g0 {
        U(3);
        g(obj, i2Var, zVar);
    }

    public final void f(Object obj, j1 j1Var, com.google.crypto.tink.shaded.protobuf.t tVar) {
        int i10 = this.f6579c;
        this.f6579c = ((this.f6578b >>> 3) << 3) | 4;
        try {
            j1Var.j(obj, this, tVar);
            if (this.f6578b != this.f6579c) {
                throw com.google.crypto.tink.shaded.protobuf.h0.f();
            }
            this.f6579c = i10;
        } catch (Throwable th) {
            this.f6579c = i10;
            throw th;
        }
    }

    public final void g(Object obj, i2 i2Var, com.google.protobuf.z zVar) {
        int i10 = this.f6579c;
        this.f6579c = ((this.f6578b >>> 3) << 3) | 4;
        try {
            i2Var.h(obj, this, zVar);
            if (this.f6578b != this.f6579c) {
                throw a1.g();
            }
            this.f6579c = i10;
        } catch (Throwable th) {
            this.f6579c = i10;
            throw th;
        }
    }

    public final void h(Object obj, j1 j1Var, com.google.crypto.tink.shaded.protobuf.t tVar) throws com.google.crypto.tink.shaded.protobuf.h0 {
        int iY = ((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).y();
        com.google.crypto.tink.shaded.protobuf.o oVar = (com.google.crypto.tink.shaded.protobuf.o) this.f6581e;
        if (oVar.f3598a >= oVar.f3599b) {
            throw new com.google.crypto.tink.shaded.protobuf.h0("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iH = oVar.h(iY);
        ((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).f3598a++;
        j1Var.j(obj, this, tVar);
        ((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).a(0);
        com.google.crypto.tink.shaded.protobuf.o oVar2 = (com.google.crypto.tink.shaded.protobuf.o) this.f6581e;
        oVar2.f3598a--;
        oVar2.g(iH);
    }

    public final void i(Object obj, i2 i2Var, com.google.protobuf.z zVar) throws a1 {
        int iB = ((com.google.protobuf.s) this.f6581e).B();
        com.google.protobuf.s sVar = (com.google.protobuf.s) this.f6581e;
        if (sVar.f4230a >= sVar.f4231b) {
            throw new a1("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iJ = sVar.j(iB);
        ((com.google.protobuf.s) this.f6581e).f4230a++;
        i2Var.h(obj, this, zVar);
        ((com.google.protobuf.s) this.f6581e).a(0);
        com.google.protobuf.s sVar2 = (com.google.protobuf.s) this.f6581e;
        sVar2.f4230a--;
        sVar2.i(iJ);
    }

    public final boolean j() throws z0, com.google.crypto.tink.shaded.protobuf.g0 {
        switch (this.f6577a) {
            case 1:
                U(0);
                return ((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).i();
            default:
                U(0);
                return ((com.google.protobuf.s) this.f6581e).k();
        }
    }

    public final void k(List list) throws a1, com.google.crypto.tink.shaded.protobuf.h0 {
        int iX;
        int iX2;
        int iA;
        int iA2;
        switch (this.f6577a) {
            case 1:
                if (!(list instanceof com.google.crypto.tink.shaded.protobuf.f)) {
                    int i10 = this.f6578b & 7;
                    if (i10 == 0) {
                        do {
                            list.add(Boolean.valueOf(((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).i()));
                            if (((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).e()) {
                                return;
                            } else {
                                iX = ((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).x();
                            }
                        } while (iX == this.f6578b);
                        this.f6580d = iX;
                        return;
                    }
                    if (i10 != 2) {
                        throw com.google.crypto.tink.shaded.protobuf.h0.c();
                    }
                    int iD = ((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).d() + ((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).y();
                    do {
                        list.add(Boolean.valueOf(((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).i()));
                    } while (((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).d() < iD);
                    T(iD);
                    return;
                }
                com.google.crypto.tink.shaded.protobuf.f fVar = (com.google.crypto.tink.shaded.protobuf.f) list;
                int i11 = this.f6578b & 7;
                if (i11 == 0) {
                    do {
                        fVar.i(((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).i());
                        if (((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).e()) {
                            return;
                        } else {
                            iX2 = ((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).x();
                        }
                    } while (iX2 == this.f6578b);
                    this.f6580d = iX2;
                    return;
                }
                if (i11 != 2) {
                    throw com.google.crypto.tink.shaded.protobuf.h0.c();
                }
                int iD2 = ((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).d() + ((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).y();
                do {
                    fVar.i(((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).i());
                } while (((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).d() < iD2);
                T(iD2);
                return;
            default:
                if (!(list instanceof com.google.protobuf.g)) {
                    int i12 = this.f6578b & 7;
                    if (i12 == 0) {
                        do {
                            list.add(Boolean.valueOf(((com.google.protobuf.s) this.f6581e).k()));
                            if (((com.google.protobuf.s) this.f6581e).e()) {
                                return;
                            } else {
                                iA = ((com.google.protobuf.s) this.f6581e).A();
                            }
                        } while (iA == this.f6578b);
                        this.f6580d = iA;
                        return;
                    }
                    if (i12 != 2) {
                        throw a1.d();
                    }
                    int iD3 = ((com.google.protobuf.s) this.f6581e).d() + ((com.google.protobuf.s) this.f6581e).B();
                    do {
                        list.add(Boolean.valueOf(((com.google.protobuf.s) this.f6581e).k()));
                    } while (((com.google.protobuf.s) this.f6581e).d() < iD3);
                    T(iD3);
                    return;
                }
                com.google.protobuf.g gVar = (com.google.protobuf.g) list;
                int i13 = this.f6578b & 7;
                if (i13 == 0) {
                    do {
                        gVar.i(((com.google.protobuf.s) this.f6581e).k());
                        if (((com.google.protobuf.s) this.f6581e).e()) {
                            return;
                        } else {
                            iA2 = ((com.google.protobuf.s) this.f6581e).A();
                        }
                    } while (iA2 == this.f6578b);
                    this.f6580d = iA2;
                    return;
                }
                if (i13 != 2) {
                    throw a1.d();
                }
                int iD4 = ((com.google.protobuf.s) this.f6581e).d() + ((com.google.protobuf.s) this.f6581e).B();
                do {
                    gVar.i(((com.google.protobuf.s) this.f6581e).k());
                } while (((com.google.protobuf.s) this.f6581e).d() < iD4);
                T(iD4);
                return;
        }
    }

    public final com.google.crypto.tink.shaded.protobuf.l l() throws z0, com.google.crypto.tink.shaded.protobuf.g0 {
        U(2);
        return ((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).j();
    }

    public final com.google.protobuf.n m() throws z0, com.google.crypto.tink.shaded.protobuf.g0 {
        U(2);
        return ((com.google.protobuf.s) this.f6581e).l();
    }

    public final void n(List list) throws z0, com.google.crypto.tink.shaded.protobuf.g0 {
        int iX;
        int iA;
        switch (this.f6577a) {
            case 1:
                if ((this.f6578b & 7) != 2) {
                    throw com.google.crypto.tink.shaded.protobuf.h0.c();
                }
                do {
                    list.add(l());
                    if (((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).e()) {
                        return;
                    } else {
                        iX = ((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).x();
                    }
                } while (iX == this.f6578b);
                this.f6580d = iX;
                return;
            default:
                if ((this.f6578b & 7) != 2) {
                    throw a1.d();
                }
                do {
                    list.add(m());
                    if (((com.google.protobuf.s) this.f6581e).e()) {
                        return;
                    } else {
                        iA = ((com.google.protobuf.s) this.f6581e).A();
                    }
                } while (iA == this.f6578b);
                this.f6580d = iA;
                return;
        }
    }

    public final double o() throws z0, com.google.crypto.tink.shaded.protobuf.g0 {
        switch (this.f6577a) {
            case 1:
                U(1);
                return ((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).k();
            default:
                U(1);
                return ((com.google.protobuf.s) this.f6581e).m();
        }
    }

    public final void p(List list) throws a1, com.google.crypto.tink.shaded.protobuf.h0 {
        int iX;
        int iX2;
        int iA;
        int iA2;
        switch (this.f6577a) {
            case 1:
                if (!(list instanceof com.google.crypto.tink.shaded.protobuf.r)) {
                    int i10 = this.f6578b & 7;
                    if (i10 == 1) {
                        do {
                            list.add(Double.valueOf(((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).k()));
                            if (((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).e()) {
                                return;
                            } else {
                                iX = ((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).x();
                            }
                        } while (iX == this.f6578b);
                        this.f6580d = iX;
                        return;
                    }
                    if (i10 != 2) {
                        throw com.google.crypto.tink.shaded.protobuf.h0.c();
                    }
                    int iY = ((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).y();
                    X(iY);
                    int iD = ((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).d() + iY;
                    do {
                        list.add(Double.valueOf(((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).k()));
                    } while (((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).d() < iD);
                    return;
                }
                com.google.crypto.tink.shaded.protobuf.r rVar = (com.google.crypto.tink.shaded.protobuf.r) list;
                int i11 = this.f6578b & 7;
                if (i11 == 1) {
                    do {
                        rVar.i(((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).k());
                        if (((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).e()) {
                            return;
                        } else {
                            iX2 = ((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).x();
                        }
                    } while (iX2 == this.f6578b);
                    this.f6580d = iX2;
                    return;
                }
                if (i11 != 2) {
                    throw com.google.crypto.tink.shaded.protobuf.h0.c();
                }
                int iY2 = ((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).y();
                X(iY2);
                int iD2 = ((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).d() + iY2;
                do {
                    rVar.i(((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).k());
                } while (((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).d() < iD2);
                return;
            default:
                if (!(list instanceof com.google.protobuf.w)) {
                    int i12 = this.f6578b & 7;
                    if (i12 == 1) {
                        do {
                            list.add(Double.valueOf(((com.google.protobuf.s) this.f6581e).m()));
                            if (((com.google.protobuf.s) this.f6581e).e()) {
                                return;
                            } else {
                                iA = ((com.google.protobuf.s) this.f6581e).A();
                            }
                        } while (iA == this.f6578b);
                        this.f6580d = iA;
                        return;
                    }
                    if (i12 != 2) {
                        throw a1.d();
                    }
                    int iB = ((com.google.protobuf.s) this.f6581e).B();
                    X(iB);
                    int iD3 = ((com.google.protobuf.s) this.f6581e).d() + iB;
                    do {
                        list.add(Double.valueOf(((com.google.protobuf.s) this.f6581e).m()));
                    } while (((com.google.protobuf.s) this.f6581e).d() < iD3);
                    return;
                }
                com.google.protobuf.w wVar = (com.google.protobuf.w) list;
                int i13 = this.f6578b & 7;
                if (i13 == 1) {
                    do {
                        wVar.i(((com.google.protobuf.s) this.f6581e).m());
                        if (((com.google.protobuf.s) this.f6581e).e()) {
                            return;
                        } else {
                            iA2 = ((com.google.protobuf.s) this.f6581e).A();
                        }
                    } while (iA2 == this.f6578b);
                    this.f6580d = iA2;
                    return;
                }
                if (i13 != 2) {
                    throw a1.d();
                }
                int iB2 = ((com.google.protobuf.s) this.f6581e).B();
                X(iB2);
                int iD4 = ((com.google.protobuf.s) this.f6581e).d() + iB2;
                do {
                    wVar.i(((com.google.protobuf.s) this.f6581e).m());
                } while (((com.google.protobuf.s) this.f6581e).d() < iD4);
                return;
        }
    }

    public final int q() throws z0, com.google.crypto.tink.shaded.protobuf.g0 {
        switch (this.f6577a) {
            case 1:
                U(0);
                return ((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).l();
            default:
                U(0);
                return ((com.google.protobuf.s) this.f6581e).n();
        }
    }

    public final void r(List list) throws a1, com.google.crypto.tink.shaded.protobuf.h0 {
        int iX;
        int iX2;
        int iA;
        int iA2;
        switch (this.f6577a) {
            case 1:
                if (!(list instanceof com.google.crypto.tink.shaded.protobuf.c0)) {
                    int i10 = this.f6578b & 7;
                    if (i10 == 0) {
                        do {
                            list.add(Integer.valueOf(((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).l()));
                            if (((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).e()) {
                                return;
                            } else {
                                iX = ((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).x();
                            }
                        } while (iX == this.f6578b);
                        this.f6580d = iX;
                        return;
                    }
                    if (i10 != 2) {
                        throw com.google.crypto.tink.shaded.protobuf.h0.c();
                    }
                    int iD = ((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).d() + ((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).y();
                    do {
                        list.add(Integer.valueOf(((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).l()));
                    } while (((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).d() < iD);
                    T(iD);
                    return;
                }
                com.google.crypto.tink.shaded.protobuf.c0 c0Var = (com.google.crypto.tink.shaded.protobuf.c0) list;
                int i11 = this.f6578b & 7;
                if (i11 == 0) {
                    do {
                        c0Var.i(((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).l());
                        if (((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).e()) {
                            return;
                        } else {
                            iX2 = ((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).x();
                        }
                    } while (iX2 == this.f6578b);
                    this.f6580d = iX2;
                    return;
                }
                if (i11 != 2) {
                    throw com.google.crypto.tink.shaded.protobuf.h0.c();
                }
                int iD2 = ((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).d() + ((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).y();
                do {
                    c0Var.i(((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).l());
                } while (((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).d() < iD2);
                T(iD2);
                return;
            default:
                if (!(list instanceof p0)) {
                    int i12 = this.f6578b & 7;
                    if (i12 == 0) {
                        do {
                            list.add(Integer.valueOf(((com.google.protobuf.s) this.f6581e).n()));
                            if (((com.google.protobuf.s) this.f6581e).e()) {
                                return;
                            } else {
                                iA = ((com.google.protobuf.s) this.f6581e).A();
                            }
                        } while (iA == this.f6578b);
                        this.f6580d = iA;
                        return;
                    }
                    if (i12 != 2) {
                        throw a1.d();
                    }
                    int iD3 = ((com.google.protobuf.s) this.f6581e).d() + ((com.google.protobuf.s) this.f6581e).B();
                    do {
                        list.add(Integer.valueOf(((com.google.protobuf.s) this.f6581e).n()));
                    } while (((com.google.protobuf.s) this.f6581e).d() < iD3);
                    T(iD3);
                    return;
                }
                p0 p0Var = (p0) list;
                int i13 = this.f6578b & 7;
                if (i13 == 0) {
                    do {
                        p0Var.i(((com.google.protobuf.s) this.f6581e).n());
                        if (((com.google.protobuf.s) this.f6581e).e()) {
                            return;
                        } else {
                            iA2 = ((com.google.protobuf.s) this.f6581e).A();
                        }
                    } while (iA2 == this.f6578b);
                    this.f6580d = iA2;
                    return;
                }
                if (i13 != 2) {
                    throw a1.d();
                }
                int iD4 = ((com.google.protobuf.s) this.f6581e).d() + ((com.google.protobuf.s) this.f6581e).B();
                do {
                    p0Var.i(((com.google.protobuf.s) this.f6581e).n());
                } while (((com.google.protobuf.s) this.f6581e).d() < iD4);
                T(iD4);
                return;
        }
    }

    public final Object s(h3 h3Var, Class cls, com.google.protobuf.z zVar) {
        switch (h3Var.ordinal()) {
            case 0:
                return Double.valueOf(o());
            case 1:
                return Float.valueOf(x());
            case 2:
                return Long.valueOf(B());
            case 3:
                return Long.valueOf(R());
            case 4:
                return Integer.valueOf(z());
            case 5:
                return Long.valueOf(v());
            case 6:
                return Integer.valueOf(t());
            case 7:
                return Boolean.valueOf(j());
            case 8:
                return O();
            case 9:
            default:
                throw new IllegalArgumentException("unsupported field type.");
            case 10:
                return D(cls, zVar);
            case 11:
                return m();
            case 12:
                return Integer.valueOf(P());
            case 13:
                return Integer.valueOf(q());
            case Code.UNAVAILABLE /* 14 */:
                return Integer.valueOf(E());
            case 15:
                return Long.valueOf(G());
            case Code.UNAUTHENTICATED /* 16 */:
                return Integer.valueOf(I());
            case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                return Long.valueOf(K());
        }
    }

    public final int t() throws z0, com.google.crypto.tink.shaded.protobuf.g0 {
        switch (this.f6577a) {
            case 1:
                U(5);
                return ((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).m();
            default:
                U(5);
                return ((com.google.protobuf.s) this.f6581e).o();
        }
    }

    public final String toString() {
        switch (this.f6577a) {
            case 0:
                return "";
            default:
                return super.toString();
        }
    }

    public final void u(List list) throws a1, com.google.crypto.tink.shaded.protobuf.h0 {
        int iX;
        int iX2;
        int iA;
        int iA2;
        switch (this.f6577a) {
            case 1:
                if (!(list instanceof com.google.crypto.tink.shaded.protobuf.c0)) {
                    int i10 = this.f6578b & 7;
                    if (i10 == 2) {
                        int iY = ((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).y();
                        W(iY);
                        int iD = ((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).d() + iY;
                        do {
                            list.add(Integer.valueOf(((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).m()));
                        } while (((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).d() < iD);
                        return;
                    }
                    if (i10 != 5) {
                        throw com.google.crypto.tink.shaded.protobuf.h0.c();
                    }
                    do {
                        list.add(Integer.valueOf(((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).m()));
                        if (((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).e()) {
                            return;
                        } else {
                            iX = ((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).x();
                        }
                    } while (iX == this.f6578b);
                    this.f6580d = iX;
                    return;
                }
                com.google.crypto.tink.shaded.protobuf.c0 c0Var = (com.google.crypto.tink.shaded.protobuf.c0) list;
                int i11 = this.f6578b & 7;
                if (i11 == 2) {
                    int iY2 = ((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).y();
                    W(iY2);
                    int iD2 = ((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).d() + iY2;
                    do {
                        c0Var.i(((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).m());
                    } while (((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).d() < iD2);
                    return;
                }
                if (i11 != 5) {
                    throw com.google.crypto.tink.shaded.protobuf.h0.c();
                }
                do {
                    c0Var.i(((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).m());
                    if (((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).e()) {
                        return;
                    } else {
                        iX2 = ((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).x();
                    }
                } while (iX2 == this.f6578b);
                this.f6580d = iX2;
                return;
            default:
                if (!(list instanceof p0)) {
                    int i12 = this.f6578b & 7;
                    if (i12 == 2) {
                        int iB = ((com.google.protobuf.s) this.f6581e).B();
                        W(iB);
                        int iD3 = iB + ((com.google.protobuf.s) this.f6581e).d();
                        do {
                            list.add(Integer.valueOf(((com.google.protobuf.s) this.f6581e).o()));
                        } while (((com.google.protobuf.s) this.f6581e).d() < iD3);
                        return;
                    }
                    if (i12 != 5) {
                        throw a1.d();
                    }
                    do {
                        list.add(Integer.valueOf(((com.google.protobuf.s) this.f6581e).o()));
                        if (((com.google.protobuf.s) this.f6581e).e()) {
                            return;
                        } else {
                            iA = ((com.google.protobuf.s) this.f6581e).A();
                        }
                    } while (iA == this.f6578b);
                    this.f6580d = iA;
                    return;
                }
                p0 p0Var = (p0) list;
                int i13 = this.f6578b & 7;
                if (i13 == 2) {
                    int iB2 = ((com.google.protobuf.s) this.f6581e).B();
                    W(iB2);
                    int iD4 = ((com.google.protobuf.s) this.f6581e).d() + iB2;
                    do {
                        p0Var.i(((com.google.protobuf.s) this.f6581e).o());
                    } while (((com.google.protobuf.s) this.f6581e).d() < iD4);
                    return;
                }
                if (i13 != 5) {
                    throw a1.d();
                }
                do {
                    p0Var.i(((com.google.protobuf.s) this.f6581e).o());
                    if (((com.google.protobuf.s) this.f6581e).e()) {
                        return;
                    } else {
                        iA2 = ((com.google.protobuf.s) this.f6581e).A();
                    }
                } while (iA2 == this.f6578b);
                this.f6580d = iA2;
                return;
        }
    }

    public final long v() throws z0, com.google.crypto.tink.shaded.protobuf.g0 {
        switch (this.f6577a) {
            case 1:
                U(1);
                return ((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).n();
            default:
                U(1);
                return ((com.google.protobuf.s) this.f6581e).p();
        }
    }

    public final void w(List list) throws a1, com.google.crypto.tink.shaded.protobuf.h0 {
        int iX;
        int iX2;
        int iA;
        int iA2;
        switch (this.f6577a) {
            case 1:
                if (!(list instanceof o0)) {
                    int i10 = this.f6578b & 7;
                    if (i10 == 1) {
                        do {
                            list.add(Long.valueOf(((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).n()));
                            if (((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).e()) {
                                return;
                            } else {
                                iX = ((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).x();
                            }
                        } while (iX == this.f6578b);
                        this.f6580d = iX;
                        return;
                    }
                    if (i10 != 2) {
                        throw com.google.crypto.tink.shaded.protobuf.h0.c();
                    }
                    int iY = ((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).y();
                    X(iY);
                    int iD = ((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).d() + iY;
                    do {
                        list.add(Long.valueOf(((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).n()));
                    } while (((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).d() < iD);
                    return;
                }
                o0 o0Var = (o0) list;
                int i11 = this.f6578b & 7;
                if (i11 == 1) {
                    do {
                        o0Var.i(((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).n());
                        if (((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).e()) {
                            return;
                        } else {
                            iX2 = ((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).x();
                        }
                    } while (iX2 == this.f6578b);
                    this.f6580d = iX2;
                    return;
                }
                if (i11 != 2) {
                    throw com.google.crypto.tink.shaded.protobuf.h0.c();
                }
                int iY2 = ((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).y();
                X(iY2);
                int iD2 = ((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).d() + iY2;
                do {
                    o0Var.i(((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).n());
                } while (((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).d() < iD2);
                return;
            default:
                if (!(list instanceof i1)) {
                    int i12 = this.f6578b & 7;
                    if (i12 == 1) {
                        do {
                            list.add(Long.valueOf(((com.google.protobuf.s) this.f6581e).p()));
                            if (((com.google.protobuf.s) this.f6581e).e()) {
                                return;
                            } else {
                                iA = ((com.google.protobuf.s) this.f6581e).A();
                            }
                        } while (iA == this.f6578b);
                        this.f6580d = iA;
                        return;
                    }
                    if (i12 != 2) {
                        throw a1.d();
                    }
                    int iB = ((com.google.protobuf.s) this.f6581e).B();
                    X(iB);
                    int iD3 = ((com.google.protobuf.s) this.f6581e).d() + iB;
                    do {
                        list.add(Long.valueOf(((com.google.protobuf.s) this.f6581e).p()));
                    } while (((com.google.protobuf.s) this.f6581e).d() < iD3);
                    return;
                }
                i1 i1Var = (i1) list;
                int i13 = this.f6578b & 7;
                if (i13 == 1) {
                    do {
                        i1Var.i(((com.google.protobuf.s) this.f6581e).p());
                        if (((com.google.protobuf.s) this.f6581e).e()) {
                            return;
                        } else {
                            iA2 = ((com.google.protobuf.s) this.f6581e).A();
                        }
                    } while (iA2 == this.f6578b);
                    this.f6580d = iA2;
                    return;
                }
                if (i13 != 2) {
                    throw a1.d();
                }
                int iB2 = ((com.google.protobuf.s) this.f6581e).B();
                X(iB2);
                int iD4 = ((com.google.protobuf.s) this.f6581e).d() + iB2;
                do {
                    i1Var.i(((com.google.protobuf.s) this.f6581e).p());
                } while (((com.google.protobuf.s) this.f6581e).d() < iD4);
                return;
        }
    }

    public final float x() throws z0, com.google.crypto.tink.shaded.protobuf.g0 {
        switch (this.f6577a) {
            case 1:
                U(5);
                return ((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).o();
            default:
                U(5);
                return ((com.google.protobuf.s) this.f6581e).q();
        }
    }

    public final void y(List list) throws a1, com.google.crypto.tink.shaded.protobuf.h0 {
        int iX;
        int iX2;
        int iA;
        int iA2;
        switch (this.f6577a) {
            case 1:
                if (!(list instanceof com.google.crypto.tink.shaded.protobuf.x)) {
                    int i10 = this.f6578b & 7;
                    if (i10 == 2) {
                        int iY = ((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).y();
                        W(iY);
                        int iD = ((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).d() + iY;
                        do {
                            list.add(Float.valueOf(((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).o()));
                        } while (((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).d() < iD);
                        return;
                    }
                    if (i10 != 5) {
                        throw com.google.crypto.tink.shaded.protobuf.h0.c();
                    }
                    do {
                        list.add(Float.valueOf(((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).o()));
                        if (((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).e()) {
                            return;
                        } else {
                            iX = ((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).x();
                        }
                    } while (iX == this.f6578b);
                    this.f6580d = iX;
                    return;
                }
                com.google.crypto.tink.shaded.protobuf.x xVar = (com.google.crypto.tink.shaded.protobuf.x) list;
                int i11 = this.f6578b & 7;
                if (i11 == 2) {
                    int iY2 = ((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).y();
                    W(iY2);
                    int iD2 = ((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).d() + iY2;
                    do {
                        xVar.i(((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).o());
                    } while (((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).d() < iD2);
                    return;
                }
                if (i11 != 5) {
                    throw com.google.crypto.tink.shaded.protobuf.h0.c();
                }
                do {
                    xVar.i(((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).o());
                    if (((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).e()) {
                        return;
                    } else {
                        iX2 = ((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).x();
                    }
                } while (iX2 == this.f6578b);
                this.f6580d = iX2;
                return;
            default:
                if (!(list instanceof com.google.protobuf.e0)) {
                    int i12 = this.f6578b & 7;
                    if (i12 == 2) {
                        int iB = ((com.google.protobuf.s) this.f6581e).B();
                        W(iB);
                        int iD3 = iB + ((com.google.protobuf.s) this.f6581e).d();
                        do {
                            list.add(Float.valueOf(((com.google.protobuf.s) this.f6581e).q()));
                        } while (((com.google.protobuf.s) this.f6581e).d() < iD3);
                        return;
                    }
                    if (i12 != 5) {
                        throw a1.d();
                    }
                    do {
                        list.add(Float.valueOf(((com.google.protobuf.s) this.f6581e).q()));
                        if (((com.google.protobuf.s) this.f6581e).e()) {
                            return;
                        } else {
                            iA = ((com.google.protobuf.s) this.f6581e).A();
                        }
                    } while (iA == this.f6578b);
                    this.f6580d = iA;
                    return;
                }
                com.google.protobuf.e0 e0Var = (com.google.protobuf.e0) list;
                int i13 = this.f6578b & 7;
                if (i13 == 2) {
                    int iB2 = ((com.google.protobuf.s) this.f6581e).B();
                    W(iB2);
                    int iD4 = ((com.google.protobuf.s) this.f6581e).d() + iB2;
                    do {
                        e0Var.i(((com.google.protobuf.s) this.f6581e).q());
                    } while (((com.google.protobuf.s) this.f6581e).d() < iD4);
                    return;
                }
                if (i13 != 5) {
                    throw a1.d();
                }
                do {
                    e0Var.i(((com.google.protobuf.s) this.f6581e).q());
                    if (((com.google.protobuf.s) this.f6581e).e()) {
                        return;
                    } else {
                        iA2 = ((com.google.protobuf.s) this.f6581e).A();
                    }
                } while (iA2 == this.f6578b);
                this.f6580d = iA2;
                return;
        }
    }

    public final int z() throws z0, com.google.crypto.tink.shaded.protobuf.g0 {
        switch (this.f6577a) {
            case 1:
                U(0);
                return ((com.google.crypto.tink.shaded.protobuf.o) this.f6581e).p();
            default:
                U(0);
                return ((com.google.protobuf.s) this.f6581e).r();
        }
    }

    public m(com.google.crypto.tink.shaded.protobuf.o oVar) {
        this.f6577a = 1;
        this.f6580d = 0;
        Charset charset = com.google.crypto.tink.shaded.protobuf.f0.f3534a;
        if (oVar != null) {
            this.f6581e = oVar;
            oVar.f3601d = this;
            return;
        }
        throw new NullPointerException("input");
    }

    public m(com.google.protobuf.s sVar) {
        this.f6577a = 2;
        this.f6580d = 0;
        Charset charset = y0.f4276a;
        if (sVar != null) {
            this.f6581e = sVar;
            sVar.f4233d = this;
            return;
        }
        throw new NullPointerException("input");
    }
}
