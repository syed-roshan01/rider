package w6;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class s extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f16239c;

    public s(int i10, r rVar) {
        this.f16238b = i10;
        this.f16239c = rVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return sVar.f16238b == this.f16238b && sVar.f16239c == this.f16239c;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f16238b), this.f16239c);
    }

    public final String toString() {
        return "AesGcmSiv Parameters (variant: " + this.f16239c + ", " + this.f16238b + "-byte key)";
    }
}
