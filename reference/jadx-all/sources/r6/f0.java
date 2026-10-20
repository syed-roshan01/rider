package r6;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class f0 extends s {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final f0 f13537n = new f0(null, new Object[0], 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Object f13538d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient Object[] f13539e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient int f13540f;

    public f0(Object obj, Object[] objArr, int i10) {
        this.f13538d = obj;
        this.f13539e = objArr;
        this.f13540f = i10;
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [short[], byte[]], vars: [r6v3 ??, r6v5 ??, r6v4 ??, r6v6 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.rerun(InitCodeVariables.java:36)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.trySplitConstInsns(FixTypesVisitor.java:580)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        */
    public static r6.f0 b(int r16, java.lang.Object[] r17, r6.r r18) {
        /*
            Method dump skipped, instruction units count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r6.f0.b(int, java.lang.Object[], r6.r):r6.f0");
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0003  */
    @Override // r6.s, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        if (obj == null) {
            obj2 = null;
        } else {
            Object[] objArr = this.f13539e;
            if (this.f13540f == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                if (obj3.equals(obj)) {
                    obj2 = objArr[1];
                    Objects.requireNonNull(obj2);
                } else {
                    obj2 = null;
                }
            } else {
                Object obj4 = this.f13538d;
                if (obj4 == null) {
                    obj2 = null;
                } else if (obj4 instanceof byte[]) {
                    byte[] bArr = (byte[]) obj4;
                    int length = bArr.length - 1;
                    int iH0 = z6.a.h0(obj.hashCode());
                    while (true) {
                        int i10 = iH0 & length;
                        int i11 = bArr[i10] & 255;
                        if (i11 == 255) {
                            break;
                        }
                        if (obj.equals(objArr[i11])) {
                            obj2 = objArr[i11 ^ 1];
                        } else {
                            iH0 = i10 + 1;
                        }
                    }
                    obj2 = null;
                } else if (obj4 instanceof short[]) {
                    short[] sArr = (short[]) obj4;
                    int length2 = sArr.length - 1;
                    int iH1 = z6.a.h0(obj.hashCode());
                    while (true) {
                        int i12 = iH1 & length2;
                        int i13 = sArr[i12] & 65535;
                        if (i13 == 65535) {
                            break;
                        }
                        if (obj.equals(objArr[i13])) {
                            obj2 = objArr[i13 ^ 1];
                        } else {
                            iH1 = i12 + 1;
                        }
                    }
                    obj2 = null;
                } else {
                    int[] iArr = (int[]) obj4;
                    int length3 = iArr.length - 1;
                    int iH2 = z6.a.h0(obj.hashCode());
                    while (true) {
                        int i14 = iH2 & length3;
                        int i15 = iArr[i14];
                        if (i15 == -1) {
                            break;
                        }
                        if (obj.equals(objArr[i15])) {
                            obj2 = objArr[i15 ^ 1];
                        } else {
                            iH2 = i14 + 1;
                        }
                    }
                    obj2 = null;
                }
            }
        }
        if (obj2 == null) {
            return null;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f13540f;
    }
}
