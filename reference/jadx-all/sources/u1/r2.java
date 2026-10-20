package u1;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class r2 implements t1.m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f15251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Float f15252c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Float f15253d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public y1.h f15254e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public y1.h f15255f = null;

    public r2(int i10, ArrayList arrayList) {
        this.f15250a = i10;
        this.f15251b = arrayList;
    }

    @Override // t1.m1
    public final boolean w() {
        return this.f15251b.contains(this);
    }
}
