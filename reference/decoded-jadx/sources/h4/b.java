package h4;

import android.os.Parcel;
import android.util.SparseIntArray;
import q.f;

/* JADX INFO: loaded from: classes.dex */
public final class b extends a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SparseIntArray f7547d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Parcel f7548e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f7549f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f7550g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f7551h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f7552i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f7553j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f7554k;

    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new f(), new f(), new f());
    }

    @Override // h4.a
    public final b a() {
        Parcel parcel = this.f7548e;
        int iDataPosition = parcel.dataPosition();
        int i10 = this.f7553j;
        if (i10 == this.f7549f) {
            i10 = this.f7550g;
        }
        return new b(parcel, iDataPosition, i10, a7.a.p(new StringBuilder(), this.f7551h, "  "), this.f7544a, this.f7545b, this.f7546c);
    }

    @Override // h4.a
    public final boolean e(int i10) {
        while (this.f7553j < this.f7550g) {
            int i11 = this.f7554k;
            if (i11 == i10) {
                return true;
            }
            if (String.valueOf(i11).compareTo(String.valueOf(i10)) > 0) {
                return false;
            }
            int i12 = this.f7553j;
            Parcel parcel = this.f7548e;
            parcel.setDataPosition(i12);
            int i13 = parcel.readInt();
            this.f7554k = parcel.readInt();
            this.f7553j += i13;
        }
        return this.f7554k == i10;
    }

    @Override // h4.a
    public final void h(int i10) {
        int i11 = this.f7552i;
        SparseIntArray sparseIntArray = this.f7547d;
        Parcel parcel = this.f7548e;
        if (i11 >= 0) {
            int i12 = sparseIntArray.get(i11);
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i12);
            parcel.writeInt(iDataPosition - i12);
            parcel.setDataPosition(iDataPosition);
        }
        this.f7552i = i10;
        sparseIntArray.put(i10, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i10);
    }

    public b(Parcel parcel, int i10, int i11, String str, f fVar, f fVar2, f fVar3) {
        super(fVar, fVar2, fVar3);
        this.f7547d = new SparseIntArray();
        this.f7552i = -1;
        this.f7554k = -1;
        this.f7548e = parcel;
        this.f7549f = i10;
        this.f7550g = i11;
        this.f7553j = i10;
        this.f7551h = str;
    }
}
