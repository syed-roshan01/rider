package r7;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class c implements WildcardType, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Type f13594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Type f13595b;

    public c(Type[] typeArr, Type[] typeArr2) {
        d7.t.H(typeArr2.length <= 1);
        d7.t.H(typeArr.length == 1);
        if (typeArr2.length != 1) {
            Objects.requireNonNull(typeArr[0]);
            d.b(typeArr[0]);
            this.f13595b = null;
            this.f13594a = d.a(typeArr[0]);
            return;
        }
        Objects.requireNonNull(typeArr2[0]);
        d.b(typeArr2[0]);
        d7.t.H(typeArr[0] == Object.class);
        this.f13595b = d.a(typeArr2[0]);
        this.f13594a = Object.class;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && d.c(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f13595b;
        return type != null ? new Type[]{type} : d.f13596a;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.f13594a};
    }

    public final int hashCode() {
        Type type = this.f13595b;
        return (type != null ? type.hashCode() + 31 : 1) ^ (this.f13594a.hashCode() + 31);
    }

    public final String toString() {
        Type type = this.f13595b;
        if (type != null) {
            return "? super " + d.g(type);
        }
        Type type2 = this.f13594a;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + d.g(type2);
    }
}
