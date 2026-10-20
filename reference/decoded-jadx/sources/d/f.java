package d;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class f extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Serializable f4300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e.b f4301c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f4302d;

    public /* synthetic */ f(Object obj, Serializable serializable, e.b bVar, int i10) {
        this.f4299a = i10;
        this.f4302d = obj;
        this.f4300b = serializable;
        this.f4301c = bVar;
    }

    @Override // d.d
    public final void a(Object obj) {
        int i10 = this.f4299a;
        e.b bVar = this.f4301c;
        Object obj2 = this.f4302d;
        Serializable serializable = this.f4300b;
        switch (i10) {
            case 0:
                i iVar = (i) obj2;
                String str = (String) serializable;
                Integer num = (Integer) iVar.f4308b.get(str);
                if (num != null) {
                    iVar.f4310d.add(str);
                    try {
                        ((i) obj2).b(num.intValue(), bVar, obj);
                        return;
                    } catch (Exception e4) {
                        iVar.f4310d.remove(str);
                        throw e4;
                    }
                }
                throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + bVar + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
            case 1:
                i iVar2 = (i) obj2;
                String str2 = (String) serializable;
                Integer num2 = (Integer) iVar2.f4308b.get(str2);
                if (num2 != null) {
                    iVar2.f4310d.add(str2);
                    try {
                        ((i) obj2).b(num2.intValue(), bVar, obj);
                        return;
                    } catch (Exception e10) {
                        iVar2.f4310d.remove(str2);
                        throw e10;
                    }
                }
                throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + bVar + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
            default:
                d dVar = (d) ((AtomicReference) serializable).get();
                if (dVar == null) {
                    throw new IllegalStateException("Operation cannot be started before fragment is in created state");
                }
                dVar.a(obj);
                return;
        }
    }

    @Override // d.d
    public final void b() {
        int i10 = this.f4299a;
        Object obj = this.f4302d;
        Serializable serializable = this.f4300b;
        switch (i10) {
            case 0:
                ((i) obj).f((String) serializable);
                break;
            case 1:
                ((i) obj).f((String) serializable);
                break;
            default:
                d dVar = (d) ((AtomicReference) serializable).getAndSet(null);
                if (dVar != null) {
                    dVar.b();
                }
                break;
        }
    }
}
