package p5;

import android.content.Context;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import l.z2;

/* JADX INFO: loaded from: classes.dex */
public final class e implements n5.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p8.a f12782b;

    public /* synthetic */ e(p8.a aVar, int i10) {
        this.f12781a = i10;
        this.f12782b = aVar;
    }

    @Override // p8.a
    public final Object get() {
        int i10 = this.f12781a;
        p8.a aVar = this.f12782b;
        switch (i10) {
            case 0:
                t5.a aVar2 = (t5.a) aVar.get();
                HashMap map = new HashMap();
                i5.d dVar = i5.d.f8066a;
                z2 z2Var = new z2(6);
                Set setEmptySet = Collections.emptySet();
                if (setEmptySet == null) {
                    throw new NullPointerException("Null flags");
                }
                z2Var.f10985d = setEmptySet;
                z2Var.f10983b = 30000L;
                z2Var.f10984c = 86400000L;
                map.put(dVar, z2Var.k());
                i5.d dVar2 = i5.d.f8068c;
                z2 z2Var2 = new z2(6);
                Set setEmptySet2 = Collections.emptySet();
                if (setEmptySet2 == null) {
                    throw new NullPointerException("Null flags");
                }
                z2Var2.f10985d = setEmptySet2;
                z2Var2.f10983b = 1000L;
                z2Var2.f10984c = 86400000L;
                map.put(dVar2, z2Var2.k());
                i5.d dVar3 = i5.d.f8067b;
                z2 z2Var3 = new z2(6);
                Set setEmptySet3 = Collections.emptySet();
                if (setEmptySet3 == null) {
                    throw new NullPointerException("Null flags");
                }
                z2Var3.f10985d = setEmptySet3;
                z2Var3.f10983b = 86400000L;
                z2Var3.f10984c = 86400000L;
                Set setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(q5.d.f13160b)));
                if (setUnmodifiableSet == null) {
                    throw new NullPointerException("Null flags");
                }
                z2Var3.f10985d = setUnmodifiableSet;
                map.put(dVar3, z2Var3.k());
                if (aVar2 == null) {
                    throw new NullPointerException("missing required property: clock");
                }
                if (map.keySet().size() < i5.d.values().length) {
                    throw new IllegalStateException("Not all priorities have been configured");
                }
                new HashMap();
                return new q5.a(aVar2, map);
            default:
                String packageName = ((Context) aVar.get()).getPackageName();
                if (packageName != null) {
                    return packageName;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }
}
