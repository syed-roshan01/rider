package i9;

/* JADX INFO: loaded from: classes.dex */
public final class c extends a {
    static {
        new c((char) 1, (char) 0);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            char c10 = this.f8174a;
            char c11 = this.f8175b;
            if (d7.a.o(c10, c11) > 0) {
                c cVar = (c) obj;
                if (d7.a.o(cVar.f8174a, cVar.f8175b) <= 0) {
                }
                return true;
            }
            c cVar2 = (c) obj;
            if (c10 == cVar2.f8174a && c11 == cVar2.f8175b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        char c10 = this.f8174a;
        char c11 = this.f8175b;
        if (d7.a.o(c10, c11) > 0) {
            return -1;
        }
        return (c10 * 31) + c11;
    }

    public final String toString() {
        return this.f8174a + ".." + this.f8175b;
    }
}
