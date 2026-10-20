package a4;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import u1.o3;
import v.r1;

/* JADX INFO: loaded from: classes.dex */
public final class c0 implements y0, f0.u0, p9.f, t.u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f1080b;

    public /* synthetic */ c0(int i10, Object[] objArr) {
        this.f1079a = i10;
        this.f1080b = objArr;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004e  */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0220, code lost:
    
        if (m1.a.a(r0, f0.i1.f5771q) != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0133, code lost:
    
        if (m1.a.a(androidx.compose.ui.input.key.a.a(r12.getKeyCode()), f0.i1.f5761g) != false) goto L72;
     */
    @Override // f0.u0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public f0.t0 c(android.view.KeyEvent r12) {
        /*
            Method dump skipped, instruction units count: 728
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a4.c0.c(android.view.KeyEvent):f0.t0");
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001d  */
    @Override // p9.f
    public Object collect(p9.g gVar, u8.e eVar) throws Throwable {
        p9.a aVar;
        Throwable th;
        q9.u uVar;
        q8.l lVar = q8.l.f13235a;
        int i10 = this.f1079a;
        int i11 = 1;
        Object obj = this.f1080b;
        switch (i10) {
            case 0:
                Object objCollect = ((p9.f) obj).collect(new o3(gVar, i11), eVar);
                return objCollect == v8.a.f15963a ? objCollect : lVar;
            case 1:
                Object objEmit = gVar.emit(obj, eVar);
                return objEmit == v8.a.f15963a ? objEmit : lVar;
            default:
                if (eVar instanceof p9.a) {
                    aVar = (p9.a) eVar;
                    int i12 = aVar.f12853d;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        aVar.f12853d = i12 - Integer.MIN_VALUE;
                    } else {
                        aVar = new p9.a(this, eVar);
                    }
                } else {
                    aVar = new p9.a(this, eVar);
                }
                Object obj2 = aVar.f12851b;
                v8.a aVar2 = v8.a.f15963a;
                int i13 = aVar.f12853d;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uVar = aVar.f12850a;
                    try {
                        d7.t.v0(obj2);
                        uVar.releaseIntercepted();
                        return lVar;
                    } catch (Throwable th2) {
                        th = th2;
                        uVar.releaseIntercepted();
                        throw th;
                    }
                }
                d7.t.v0(obj2);
                q9.u uVar2 = new q9.u(gVar, aVar.getContext());
                try {
                    aVar.f12850a = uVar2;
                    aVar.f12853d = 1;
                    Object objInvoke = ((c9.e) obj).invoke(uVar2, aVar);
                    if (objInvoke != aVar2) {
                        objInvoke = lVar;
                    }
                    if (objInvoke == aVar2) {
                        return aVar2;
                    }
                    uVar = uVar2;
                    uVar.releaseIntercepted();
                    return lVar;
                } catch (Throwable th3) {
                    th = th3;
                    uVar = uVar2;
                    uVar.releaseIntercepted();
                    throw th;
                }
        }
    }

    public Object d() {
        int i10 = this.f1079a;
        if (i10 <= 0) {
            return null;
        }
        int i11 = i10 - 1;
        Object obj = this.f1080b;
        Object obj2 = ((Object[]) obj)[i11];
        ((Object[]) obj)[i11] = null;
        this.f1079a = i10 - 1;
        return obj2;
    }

    public Object e(r1 r1Var, float f10, float f11, w.c cVar, w.g gVar) {
        int i10 = this.f1079a;
        Object obj = this.f1080b;
        switch (i10) {
            case 0:
                Object objA = w.l.a(r1Var, f10, t.e.b(0.0f, f11), (t.y) obj, cVar, gVar);
                return objA == v8.a.f15963a ? objA : (w.a) objA;
            default:
                Object objB = w.l.b(r1Var, Math.signum(f11) * Math.abs(f10), f10, t.e.b(0.0f, f11), (t.n) obj, cVar, gVar);
                return objB == v8.a.f15963a ? objB : (w.a) objB;
        }
    }

    public t.f0 g(int i10) {
        Object obj = this.f1080b;
        int i11 = this.f1079a;
        switch (i11) {
            case 0:
                switch (i11) {
                    case 0:
                        return (t.h0) ((List) obj).get(i10);
                    default:
                        return (t.h0) obj;
                }
            case 1:
                switch (i11) {
                    case 0:
                        return (t.h0) ((List) obj).get(i10);
                    default:
                        return (t.h0) obj;
                }
            default:
                return (t.f0) obj;
        }
    }

    public int h(View view) {
        int i10 = this.f1079a;
        Object obj = this.f1080b;
        switch (i10) {
            case 0:
                f0 f0Var = (f0) view.getLayoutParams();
                ((e0) obj).getClass();
                return view.getRight() + ((f0) view.getLayoutParams()).f1108a.right + ((ViewGroup.MarginLayoutParams) f0Var).rightMargin;
            default:
                f0 f0Var2 = (f0) view.getLayoutParams();
                ((e0) obj).getClass();
                return view.getBottom() + ((f0) view.getLayoutParams()).f1108a.bottom + ((ViewGroup.MarginLayoutParams) f0Var2).bottomMargin;
        }
    }

    public int i(View view) {
        int i10 = this.f1079a;
        Object obj = this.f1080b;
        switch (i10) {
            case 0:
                f0 f0Var = (f0) view.getLayoutParams();
                ((e0) obj).getClass();
                return (view.getLeft() - ((f0) view.getLayoutParams()).f1108a.left) - ((ViewGroup.MarginLayoutParams) f0Var).leftMargin;
            default:
                f0 f0Var2 = (f0) view.getLayoutParams();
                ((e0) obj).getClass();
                return (view.getTop() - ((f0) view.getLayoutParams()).f1108a.top) - ((ViewGroup.MarginLayoutParams) f0Var2).topMargin;
        }
    }

    public boolean j() {
        return this.f1079a < ((List) this.f1080b).size();
    }

    public int k() {
        int[] iArr = (int[]) this.f1080b;
        int i10 = this.f1079a - 1;
        this.f1079a = i10;
        return iArr[i10];
    }

    public void l(int i10, int i11, int i12) {
        int i13 = this.f1079a;
        int i14 = i13 + 3;
        Object obj = this.f1080b;
        if (i14 >= ((int[]) obj).length) {
            int[] iArrCopyOf = Arrays.copyOf((int[]) obj, ((int[]) obj).length * 2);
            d7.a.l(iArrCopyOf, "copyOf(this, newSize)");
            this.f1080b = iArrCopyOf;
        }
        int[] iArr = (int[]) this.f1080b;
        iArr[i13] = i10 + i12;
        iArr[i13 + 1] = i11 + i12;
        iArr[i13 + 2] = i12;
        this.f1079a = i14;
    }

    public void m(int i10, int i11, int i12, int i13) {
        int i14 = this.f1079a;
        int i15 = i14 + 4;
        Object obj = this.f1080b;
        if (i15 >= ((int[]) obj).length) {
            int[] iArrCopyOf = Arrays.copyOf((int[]) obj, ((int[]) obj).length * 2);
            d7.a.l(iArrCopyOf, "copyOf(this, newSize)");
            this.f1080b = iArrCopyOf;
        }
        int[] iArr = (int[]) this.f1080b;
        iArr[i14] = i10;
        iArr[i14 + 1] = i11;
        iArr[i14 + 2] = i12;
        iArr[i14 + 3] = i13;
        this.f1079a = i15;
    }

    public void n(int i10, int i11) {
        if (i10 < i11) {
            int i12 = i10 - 3;
            for (int i13 = i10; i13 < i11; i13 += 3) {
                int[] iArr = (int[]) this.f1080b;
                int i14 = iArr[i13];
                int i15 = iArr[i11];
                if (i14 < i15 || (i14 == i15 && iArr[i13 + 1] <= iArr[i11 + 1])) {
                    i12 += 3;
                    p(i12, i13);
                }
            }
            p(i12 + 3, i11);
            n(i10, i12);
            n(i12 + 6, i11);
        }
    }

    public void o(Object obj) {
        int i10 = 0;
        while (true) {
            int i11 = this.f1079a;
            if (i10 >= i11) {
                Object[] objArr = (Object[]) this.f1080b;
                if (i11 < objArr.length) {
                    objArr[i11] = obj;
                    this.f1079a = i11 + 1;
                    return;
                }
                return;
            }
            if (((Object[]) this.f1080b)[i10] == obj) {
                throw new IllegalStateException("Already in the pool!");
            }
            i10++;
        }
    }

    public void p(int i10, int i11) {
        int[] iArr = (int[]) this.f1080b;
        int i12 = iArr[i10];
        iArr[i10] = iArr[i11];
        iArr[i11] = i12;
        int i13 = i10 + 1;
        int i14 = i11 + 1;
        int i15 = iArr[i13];
        iArr[i13] = iArr[i14];
        iArr[i14] = i15;
        int i16 = i10 + 2;
        int i17 = i11 + 2;
        int i18 = iArr[i16];
        iArr[i16] = iArr[i17];
        iArr[i17] = i18;
    }

    public /* synthetic */ c0(Object obj) {
        this.f1079a = 2;
        this.f1080b = obj;
    }

    public /* synthetic */ c0(Object obj, int i10) {
        this.f1079a = i10;
        this.f1080b = obj;
    }

    public /* synthetic */ c0(int i10, int i11) {
        if (i11 != 2) {
            this.f1080b = new int[i10];
        } else {
            if (i10 > 0) {
                this.f1080b = new Object[i10];
                return;
            }
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
    }

    public /* synthetic */ c0(float f10, float f11, t.t tVar) {
        this.f1079a = 0;
        i9.g gVarS0 = z6.a.s0(0, tVar.b());
        ArrayList arrayList = new ArrayList(f9.a.y0(gVarS0));
        i9.f it = gVarS0.iterator();
        while (it.f8188c) {
            arrayList.add(new t.h0(f10, f11, tVar.a(it.b())));
        }
        this.f1080b = arrayList;
    }

    public /* synthetic */ c0(float f10, float f11) {
        this.f1079a = 1;
        this.f1080b = new t.h0(f10, f11, 0.01f);
    }
}
