package r6;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class i extends AbstractMap implements Serializable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Object f13554q = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public transient Object f13555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient int[] f13556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient Object[] f13557c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient Object[] f13558d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public transient int f13559e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public transient int f13560f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public transient e f13561n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public transient e f13562o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public transient h f13563p;

    public static i a() {
        i iVar = new i();
        iVar.f13559e = y3.e.R(3, 1);
        return iVar;
    }

    public final Map b() {
        Object obj = this.f13555a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final int c() {
        return (1 << (this.f13559e & 31)) - 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (f()) {
            return;
        }
        this.f13559e += 32;
        Map mapB = b();
        if (mapB != null) {
            this.f13559e = y3.e.R(size(), 3);
            mapB.clear();
            this.f13555a = null;
            this.f13560f = 0;
            return;
        }
        Arrays.fill(j(), 0, this.f13560f, (Object) null);
        Arrays.fill(k(), 0, this.f13560f, (Object) null);
        Object obj = this.f13555a;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(i(), 0, this.f13560f, 0);
        this.f13560f = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map mapB = b();
        if (mapB != null) {
            return mapB.containsKey(obj);
        }
        return d(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map mapB = b();
        if (mapB != null) {
            return mapB.containsValue(obj);
        }
        for (int i10 = 0; i10 < this.f13560f; i10++) {
            if (y3.e.f0(obj, k()[i10])) {
                return true;
            }
        }
        return false;
    }

    public final int d(Object obj) {
        if (f()) {
            return -1;
        }
        int iI0 = z6.a.i0(obj);
        int iC = c();
        Object obj2 = this.f13555a;
        Objects.requireNonNull(obj2);
        int iK0 = z6.a.k0(iI0 & iC, obj2);
        if (iK0 == 0) {
            return -1;
        }
        int i10 = ~iC;
        int i11 = iI0 & i10;
        do {
            int i12 = iK0 - 1;
            int i13 = i()[i12];
            if ((i13 & i10) == i11 && y3.e.f0(obj, j()[i12])) {
                return i12;
            }
            iK0 = i13 & iC;
        } while (iK0 != 0);
        return -1;
    }

    public final void e(int i10, int i11) {
        Object obj = this.f13555a;
        Objects.requireNonNull(obj);
        int[] iArrI = i();
        Object[] objArrJ = j();
        Object[] objArrK = k();
        int size = size();
        int i12 = size - 1;
        if (i10 >= i12) {
            objArrJ[i10] = null;
            objArrK[i10] = null;
            iArrI[i10] = 0;
            return;
        }
        Object obj2 = objArrJ[i12];
        objArrJ[i10] = obj2;
        objArrK[i10] = objArrK[i12];
        objArrJ[i12] = null;
        objArrK[i12] = null;
        iArrI[i10] = iArrI[i12];
        iArrI[i12] = 0;
        int iI0 = z6.a.i0(obj2) & i11;
        int iK0 = z6.a.k0(iI0, obj);
        if (iK0 == size) {
            z6.a.l0(obj, iI0, i10 + 1);
            return;
        }
        while (true) {
            int i13 = iK0 - 1;
            int i14 = iArrI[i13];
            int i15 = i14 & i11;
            if (i15 == size) {
                iArrI[i13] = z6.a.U(i14, i10 + 1, i11);
                return;
            }
            iK0 = i15;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        e eVar = this.f13562o;
        if (eVar != null) {
            return eVar;
        }
        e eVar2 = new e(this, 0);
        this.f13562o = eVar2;
        return eVar2;
    }

    public final boolean f() {
        return this.f13555a == null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map mapB = b();
        if (mapB != null) {
            return mapB.get(obj);
        }
        int iD = d(obj);
        if (iD == -1) {
            return null;
        }
        return k()[iD];
    }

    public final Object h(Object obj) {
        boolean zF = f();
        Object obj2 = f13554q;
        if (zF) {
            return obj2;
        }
        int iC = c();
        Object obj3 = this.f13555a;
        Objects.requireNonNull(obj3);
        int iB0 = z6.a.b0(obj, null, iC, obj3, i(), j(), null);
        if (iB0 == -1) {
            return obj2;
        }
        Object obj4 = k()[iB0];
        e(iB0, iC);
        this.f13560f--;
        this.f13559e += 32;
        return obj4;
    }

    public final int[] i() {
        int[] iArr = this.f13556b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    public final Object[] j() {
        Object[] objArr = this.f13557c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final Object[] k() {
        Object[] objArr = this.f13558d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        e eVar = this.f13561n;
        if (eVar != null) {
            return eVar;
        }
        e eVar2 = new e(this, 1);
        this.f13561n = eVar2;
        return eVar2;
    }

    public final int l(int i10, int i11, int i12, int i13) {
        Object objW = z6.a.w(i11);
        int i14 = i11 - 1;
        if (i13 != 0) {
            z6.a.l0(objW, i12 & i14, i13 + 1);
        }
        Object obj = this.f13555a;
        Objects.requireNonNull(obj);
        int[] iArrI = i();
        for (int i15 = 0; i15 <= i10; i15++) {
            int iK0 = z6.a.k0(i15, obj);
            while (iK0 != 0) {
                int i16 = iK0 - 1;
                int i17 = iArrI[i16];
                int i18 = ((~i10) & i17) | i15;
                int i19 = i18 & i14;
                int iK1 = z6.a.k0(i19, objW);
                z6.a.l0(objW, i19, iK0);
                iArrI[i16] = z6.a.U(i18, iK1, i14);
                iK0 = i17 & i10;
            }
        }
        this.f13555a = objW;
        this.f13559e = z6.a.U(this.f13559e, 32 - Integer.numberOfLeadingZeros(i14), 31);
        return i14;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:41:0x00fe A[LOOP:1: B:38:0x00e7->B:41:0x00fe, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:62:0x00e2 A[EDGE_INSN: B:62:0x00e2->B:36:0x00e2 BREAK  A[LOOP:1: B:38:0x00e7->B:41:0x00fe], SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00fc -> B:36:0x00e2). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // java.util.AbstractMap, java.util.Map
    public final java.lang.Object put(java.lang.Object r21, java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r6.i.put(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map mapB = b();
        if (mapB != null) {
            return mapB.remove(obj);
        }
        Object objH = h(obj);
        if (objH == f13554q) {
            return null;
        }
        return objH;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map mapB = b();
        return mapB != null ? mapB.size() : this.f13560f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        h hVar = this.f13563p;
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h(this);
        this.f13563p = hVar2;
        return hVar2;
    }
}
