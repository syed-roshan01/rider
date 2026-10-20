package u1;

import android.os.Parcel;
import android.util.Base64;

/* JADX INFO: loaded from: classes.dex */
public final class t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Parcel f15301a;

    public t1(String str) {
        Parcel parcelObtain = Parcel.obtain();
        this.f15301a = parcelObtain;
        byte[] bArrDecode = Base64.decode(str, 0);
        parcelObtain.unmarshall(bArrDecode, 0, bArrDecode.length);
        parcelObtain.setDataPosition(0);
    }

    public long a() {
        long j10;
        Parcel parcel = this.f15301a;
        byte b10 = parcel.readByte();
        if (b10 == 1) {
            j10 = 4294967296L;
        } else {
            j10 = b10 == 2 ? 8589934592L : 0L;
        }
        if (!m2.o.a(j10, 0L)) {
            return o1.s.c0(parcel.readFloat(), j10);
        }
        m2.o[] oVarArr = m2.n.f11819b;
        return m2.n.f11820c;
    }

    public void b(byte b10) {
        this.f15301a.writeByte(b10);
    }

    public void c(float f10) {
        this.f15301a.writeFloat(f10);
    }

    public void d(long j10) {
        long jB = m2.n.b(j10);
        byte b10 = 0;
        if (!m2.o.a(jB, 0L)) {
            if (m2.o.a(jB, 4294967296L)) {
                b10 = 1;
            } else if (m2.o.a(jB, 8589934592L)) {
                b10 = 2;
            }
        }
        b(b10);
        if (m2.o.a(m2.n.b(j10), 0L)) {
            return;
        }
        c(m2.n.c(j10));
    }
}
