package l4;

import ja.x;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f11285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f11286c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f11287d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f11288e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f11289f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public e f11290g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f11291h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ j f11292i;

    public f(j jVar, String str) {
        this.f11292i = jVar;
        this.f11284a = str;
        jVar.getClass();
        this.f11285b = new long[2];
        jVar.getClass();
        this.f11286c = new ArrayList(2);
        jVar.getClass();
        this.f11287d = new ArrayList(2);
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        jVar.getClass();
        for (int i10 = 0; i10 < 2; i10++) {
            sb.append(i10);
            this.f11286c.add(this.f11292i.f11299a.d(sb.toString()));
            sb.append(".tmp");
            this.f11287d.add(this.f11292i.f11299a.d(sb.toString()));
            sb.setLength(length);
        }
    }

    public final g a() {
        if (!this.f11288e || this.f11290g != null || this.f11289f) {
            return null;
        }
        ArrayList arrayList = this.f11286c;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            j jVar = this.f11292i;
            if (i10 >= size) {
                this.f11291h++;
                return new g(jVar, this);
            }
            if (!jVar.f11314w.f((x) arrayList.get(i10))) {
                try {
                    jVar.P(this);
                } catch (IOException unused) {
                }
                return null;
            }
            i10++;
        }
    }
}
