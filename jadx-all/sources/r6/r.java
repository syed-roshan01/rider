package r6;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f13576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13577b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public q f13578c;

    public r(int i10) {
        this.f13576a = new Object[i10 * 2];
    }

    public final void a(Object obj, Object obj2) {
        int i10 = (this.f13577b + 1) * 2;
        Object[] objArr = this.f13576a;
        if (i10 > objArr.length) {
            this.f13576a = Arrays.copyOf(objArr, o7.d0.w(objArr.length, i10));
        }
        z6.a.j(obj, obj2);
        Object[] objArr2 = this.f13576a;
        int i11 = this.f13577b;
        int i12 = i11 * 2;
        objArr2[i12] = obj;
        objArr2[i12 + 1] = obj2;
        this.f13577b = i11 + 1;
    }
}
