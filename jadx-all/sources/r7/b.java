package r7;

import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class b implements ParameterizedType, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Type f13591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Type f13592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Type[] f13593c;

    public b(Type type, Type type2, Type... typeArr) {
        Objects.requireNonNull(type2);
        if (type2 instanceof Class) {
            Class cls = (Class) type2;
            boolean z10 = true;
            boolean z11 = Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null;
            if (type == null && !z11) {
                z10 = false;
            }
            d7.t.H(z10);
        }
        this.f13591a = type == null ? null : d.a(type);
        this.f13592b = d.a(type2);
        Type[] typeArr2 = (Type[]) typeArr.clone();
        this.f13593c = typeArr2;
        int length = typeArr2.length;
        for (int i10 = 0; i10 < length; i10++) {
            Objects.requireNonNull(this.f13593c[i10]);
            d.b(this.f13593c[i10]);
            Type[] typeArr3 = this.f13593c;
            typeArr3[i10] = d.a(typeArr3[i10]);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && d.c(this, (ParameterizedType) obj);
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.f13593c.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f13591a;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f13592b;
    }

    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.f13593c) ^ this.f13592b.hashCode();
        Type type = this.f13591a;
        return iHashCode ^ (type != null ? type.hashCode() : 0);
    }

    public final String toString() {
        Type[] typeArr = this.f13593c;
        int length = typeArr.length;
        Type type = this.f13592b;
        if (length == 0) {
            return d.g(type);
        }
        StringBuilder sb = new StringBuilder((length + 1) * 30);
        sb.append(d.g(type));
        sb.append("<");
        sb.append(d.g(typeArr[0]));
        for (int i10 = 1; i10 < length; i10++) {
            sb.append(", ");
            sb.append(d.g(typeArr[i10]));
        }
        sb.append(">");
        return sb.toString();
    }
}
