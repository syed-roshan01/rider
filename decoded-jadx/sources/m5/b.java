package m5;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f11865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t5.a f11866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t5.a f11867c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f11868d;

    public b(Context context, t5.a aVar, t5.a aVar2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.f11865a = context;
        if (aVar == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.f11866b = aVar;
        if (aVar2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.f11867c = aVar2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f11868d = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f11865a.equals(((b) cVar).f11865a)) {
            b bVar = (b) cVar;
            if (this.f11866b.equals(bVar.f11866b) && this.f11867c.equals(bVar.f11867c) && this.f11868d.equals(bVar.f11868d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f11865a.hashCode() ^ 1000003) * 1000003) ^ this.f11866b.hashCode()) * 1000003) ^ this.f11867c.hashCode()) * 1000003) ^ this.f11868d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreationContext{applicationContext=");
        sb.append(this.f11865a);
        sb.append(", wallClock=");
        sb.append(this.f11866b);
        sb.append(", monotonicClock=");
        sb.append(this.f11867c);
        sb.append(", backendName=");
        return a7.a.p(sb, this.f11868d, "}");
    }
}
