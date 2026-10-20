package fa;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class h implements InvocationHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f6403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f6404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f6405c;

    public h(ArrayList arrayList) {
        this.f6403a = arrayList;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        d7.a.m(obj, "proxy");
        d7.a.m(method, FirebaseAnalytics.Param.METHOD);
        if (objArr == null) {
            objArr = new Object[0];
        }
        String name = method.getName();
        Class<?> returnType = method.getReturnType();
        if (d7.a.d(name, "supports") && d7.a.d(Boolean.TYPE, returnType)) {
            return Boolean.TRUE;
        }
        if (d7.a.d(name, "unsupported") && d7.a.d(Void.TYPE, returnType)) {
            this.f6404b = true;
            return null;
        }
        boolean zD = d7.a.d(name, "protocols");
        List list = this.f6403a;
        if (zD && objArr.length == 0) {
            return list;
        }
        if ((d7.a.d(name, "selectProtocol") || d7.a.d(name, "select")) && d7.a.d(String.class, returnType) && objArr.length == 1) {
            Object obj2 = objArr[0];
            if (obj2 instanceof List) {
                d7.a.k(obj2, "null cannot be cast to non-null type kotlin.collections.List<*>");
                List list2 = (List) obj2;
                int size = list2.size();
                if (size >= 0) {
                    int i10 = 0;
                    while (true) {
                        Object obj3 = list2.get(i10);
                        d7.a.k(obj3, "null cannot be cast to non-null type kotlin.String");
                        String str = (String) obj3;
                        if (list.contains(str)) {
                            this.f6405c = str;
                            return str;
                        }
                        if (i10 != size) {
                            i10++;
                        }
                    }
                }
                String str2 = (String) list.get(0);
                this.f6405c = str2;
                return str2;
            }
        }
        if ((!d7.a.d(name, "protocolSelected") && !d7.a.d(name, "selected")) || objArr.length != 1) {
            return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
        }
        Object obj4 = objArr[0];
        d7.a.k(obj4, "null cannot be cast to non-null type kotlin.String");
        this.f6405c = (String) obj4;
        return null;
    }
}
