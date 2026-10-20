package r7;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumMap;
import java.util.EnumSet;

/* JADX INFO: loaded from: classes.dex */
public final class g implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Type f13602b;

    public /* synthetic */ g(Type type, int i10) {
        this.f13601a = i10;
        this.f13602b = type;
    }

    @Override // r7.q
    public final Object e() {
        int i10 = this.f13601a;
        Type type = this.f13602b;
        switch (i10) {
            case 0:
                if (!(type instanceof ParameterizedType)) {
                    throw new p7.q("Invalid EnumSet type: " + type.toString());
                }
                Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                if (type2 instanceof Class) {
                    return EnumSet.noneOf((Class) type2);
                }
                throw new p7.q("Invalid EnumSet type: " + type.toString());
            default:
                if (!(type instanceof ParameterizedType)) {
                    throw new p7.q("Invalid EnumMap type: " + type.toString());
                }
                Type type3 = ((ParameterizedType) type).getActualTypeArguments()[0];
                if (type3 instanceof Class) {
                    return new EnumMap((Class) type3);
                }
                throw new p7.q("Invalid EnumMap type: " + type.toString());
        }
    }
}
