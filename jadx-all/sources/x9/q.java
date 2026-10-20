package x9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class q implements Iterable, e9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String[] f16445a;

    public q(String[] strArr) {
        this.f16445a = strArr;
    }

    public final String e(String str) {
        d7.a.m(str, "name");
        String[] strArr = this.f16445a;
        int length = strArr.length - 2;
        int iZ = d7.t.Z(length, 0, -2);
        if (iZ <= length) {
            while (!l9.i.K0(str, strArr[length])) {
                if (length != iZ) {
                    length -= 2;
                }
            }
            return strArr[length + 1];
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q) {
            if (Arrays.equals(this.f16445a, ((q) obj).f16445a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f16445a);
    }

    public final String i(int i10) {
        return this.f16445a[i10 * 2];
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        q8.f[] fVarArr = new q8.f[size];
        for (int i10 = 0; i10 < size; i10++) {
            fVarArr[i10] = new q8.f(i(i10), n(i10));
        }
        return new o0.b(fVarArr);
    }

    public final p k() {
        p pVar = new p();
        ArrayList arrayList = pVar.f16444a;
        d7.a.m(arrayList, "<this>");
        String[] strArr = this.f16445a;
        d7.a.m(strArr, "elements");
        arrayList.addAll(b9.b.E(strArr));
        return pVar;
    }

    public final String n(int i10) {
        return this.f16445a[(i10 * 2) + 1];
    }

    public final int size() {
        return this.f16445a.length / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            String strI = i(i10);
            String strN = n(i10);
            sb.append(strI);
            sb.append(": ");
            if (y9.b.o(strI)) {
                strN = "██";
            }
            sb.append(strN);
            sb.append("\n");
        }
        String string = sb.toString();
        d7.a.l(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
