package l5;

import android.util.Base64;
import java.util.Arrays;
import l.z2;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f11349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i5.d f11350c;

    public j(String str, byte[] bArr, i5.d dVar) {
        this.f11348a = str;
        this.f11349b = bArr;
        this.f11350c = dVar;
    }

    public static z2 a() {
        z2 z2Var = new z2(5);
        z2Var.N(i5.d.f8066a);
        return z2Var;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final String toString() {
        Object[] objArr = new Object[3];
        objArr[0] = this.f11348a;
        objArr[1] = this.f11350c;
        byte[] bArr = this.f11349b;
        objArr[2] = bArr == null ? "" : Base64.encodeToString(bArr, 2);
        return String.format("TransportContext(%s, %s, %s)", objArr);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f11348a.equals(jVar.f11348a) && Arrays.equals(this.f11349b, jVar.f11349b) && this.f11350c.equals(jVar.f11350c);
    }

    public final int hashCode() {
        return ((((this.f11348a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f11349b)) * 1000003) ^ this.f11350c.hashCode();
    }
}
