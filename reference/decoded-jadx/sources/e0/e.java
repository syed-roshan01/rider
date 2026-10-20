package e0;

/* JADX INFO: loaded from: classes.dex */
public final class e extends a {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (!d7.a.d(this.f4982a, eVar.f4982a)) {
            return false;
        }
        if (!d7.a.d(this.f4983b, eVar.f4983b)) {
            return false;
        }
        if (d7.a.d(this.f4984c, eVar.f4984c)) {
            return d7.a.d(this.f4985d, eVar.f4985d);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4985d.hashCode() + ((this.f4984c.hashCode() + ((this.f4983b.hashCode() + (this.f4982a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.f4982a + ", topEnd = " + this.f4983b + ", bottomEnd = " + this.f4984c + ", bottomStart = " + this.f4985d + ')';
    }
}
