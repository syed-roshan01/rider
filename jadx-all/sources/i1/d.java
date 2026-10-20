package i1;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f7753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f7754c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f7755d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f7756e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f7757f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f7758g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f7759h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f7760i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f7761j;

    public d(String str, float f10, float f11, float f12, float f13, float f14, float f15, float f16, List list, int i10) {
        str = (i10 & 1) != 0 ? "" : str;
        f10 = (i10 & 2) != 0 ? 0.0f : f10;
        f11 = (i10 & 4) != 0 ? 0.0f : f11;
        f12 = (i10 & 8) != 0 ? 0.0f : f12;
        f13 = (i10 & 16) != 0 ? 1.0f : f13;
        f14 = (i10 & 32) != 0 ? 1.0f : f14;
        f15 = (i10 & 64) != 0 ? 0.0f : f15;
        f16 = (i10 & 128) != 0 ? 0.0f : f16;
        if ((i10 & 256) != 0) {
            int i11 = h0.f7832a;
            list = r8.r.f13661a;
        }
        ArrayList arrayList = (i10 & 512) != 0 ? new ArrayList() : null;
        this.f7752a = str;
        this.f7753b = f10;
        this.f7754c = f11;
        this.f7755d = f12;
        this.f7756e = f13;
        this.f7757f = f14;
        this.f7758g = f15;
        this.f7759h = f16;
        this.f7760i = list;
        this.f7761j = arrayList;
    }
}
