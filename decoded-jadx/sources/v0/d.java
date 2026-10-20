package v0;

import m0.h1;
import m0.h2;
import m0.i2;
import m0.o3;
import w0.s;

/* JADX INFO: loaded from: classes.dex */
public final class d implements i2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p f15848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l f15849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f15850c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f15851d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object[] f15852e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public m f15853f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final c f15854n = new c(this);

    public d(p pVar, l lVar, String str, Object obj, Object[] objArr) {
        this.f15848a = pVar;
        this.f15849b = lVar;
        this.f15850c = str;
        this.f15851d = obj;
        this.f15852e = objArr;
    }

    @Override // m0.i2
    public final void a() {
        c();
    }

    @Override // m0.i2
    public final void b() {
        m mVar = this.f15853f;
        if (mVar != null) {
            mVar.a();
        }
    }

    public final void c() {
        String str;
        l lVar = this.f15849b;
        if (this.f15853f != null) {
            throw new IllegalArgumentException(("entry(" + this.f15853f + ") is not null").toString());
        }
        if (lVar != null) {
            c cVar = this.f15854n;
            Object objInvoke = cVar.invoke();
            if (objInvoke == null || lVar.a(objInvoke)) {
                this.f15853f = lVar.e(this.f15850c, cVar);
                return;
            }
            if (objInvoke instanceof s) {
                s sVar = (s) objInvoke;
                if (sVar.a() == h1.f11552a || sVar.a() == o3.f11621a || sVar.a() == h2.f11553a) {
                    str = "MutableState containing " + sVar.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                } else {
                    str = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                }
            } else {
                str = objInvoke + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
            }
            throw new IllegalArgumentException(str);
        }
    }

    @Override // m0.i2
    public final void d() {
        m mVar = this.f15853f;
        if (mVar != null) {
            mVar.a();
        }
    }
}
