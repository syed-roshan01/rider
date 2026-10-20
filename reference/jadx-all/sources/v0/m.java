package v0;

import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f15872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f15873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c9.a f15874c;

    public m(n nVar, String str, c cVar) {
        this.f15872a = nVar;
        this.f15873b = str;
        this.f15874c = cVar;
    }

    public final void a() {
        n nVar = this.f15872a;
        LinkedHashMap linkedHashMap = nVar.f15877c;
        String str = this.f15873b;
        List list = (List) linkedHashMap.remove(str);
        if (list != null) {
            list.remove(this.f15874c);
        }
        if (list == null || !(!list.isEmpty())) {
            return;
        }
        nVar.f15877c.put(str, list);
    }
}
