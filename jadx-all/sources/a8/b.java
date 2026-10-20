package a8;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f1333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f1334b;

    public b(a aVar, int[] iArr) {
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        this.f1333a = aVar;
        int length = iArr.length;
        int i10 = 1;
        if (length <= 1 || iArr[0] != 0) {
            this.f1334b = iArr;
            return;
        }
        while (i10 < length && iArr[i10] == 0) {
            i10++;
        }
        if (i10 == length) {
            this.f1334b = new int[]{0};
            return;
        }
        int i11 = length - i10;
        int[] iArr2 = new int[i11];
        this.f1334b = iArr2;
        System.arraycopy(iArr, i10, iArr2, 0, i11);
    }

    public final b a(b bVar) {
        a aVar = bVar.f1333a;
        a aVar2 = this.f1333a;
        if (!aVar2.equals(aVar)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (c()) {
            return bVar;
        }
        if (bVar.c()) {
            return this;
        }
        int[] iArr = this.f1334b;
        int length = iArr.length;
        int[] iArr2 = bVar.f1334b;
        if (length <= iArr2.length) {
            iArr = iArr2;
            iArr2 = iArr;
        }
        int[] iArr3 = new int[iArr.length];
        int length2 = iArr.length - iArr2.length;
        System.arraycopy(iArr, 0, iArr3, 0, length2);
        for (int i10 = length2; i10 < iArr.length; i10++) {
            iArr3[i10] = iArr2[i10 - length2] ^ iArr[i10];
        }
        return new b(aVar2, iArr3);
    }

    public final int b() {
        return this.f1334b.length - 1;
    }

    public final boolean c() {
        return this.f1334b[0] == 0;
    }

    public final String toString() {
        if (c()) {
            return "0";
        }
        StringBuilder sb = new StringBuilder(b() * 8);
        for (int iB = b(); iB >= 0; iB--) {
            int[] iArr = this.f1334b;
            int i10 = iArr[(iArr.length - 1) - iB];
            if (i10 != 0) {
                if (i10 < 0) {
                    if (iB == b()) {
                        sb.append("-");
                    } else {
                        sb.append(" - ");
                    }
                    i10 = -i10;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (iB == 0 || i10 != 1) {
                    a aVar = this.f1333a;
                    if (i10 == 0) {
                        aVar.getClass();
                        throw new IllegalArgumentException();
                    }
                    int i11 = aVar.f1328b[i10];
                    if (i11 == 0) {
                        sb.append('1');
                    } else if (i11 == 1) {
                        sb.append('a');
                    } else {
                        sb.append("a^");
                        sb.append(i11);
                    }
                }
                if (iB != 0) {
                    if (iB == 1) {
                        sb.append('x');
                    } else {
                        sb.append("x^");
                        sb.append(iB);
                    }
                }
            }
        }
        return sb.toString();
    }
}
