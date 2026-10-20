package q4;

import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzb;
import com.google.android.gms.internal.measurement.zzfc;
import k6.t4;
import q.n;

/* JADX INFO: loaded from: classes.dex */
public final class h extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13141a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13142b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(t4 t4Var) {
        super(20);
        this.f13142b = t4Var;
    }

    @Override // q.n
    public final Object create(Object obj) throws Throwable {
        switch (this.f13141a) {
            case 1:
                String str = (String) obj;
                f6.a.u(str);
                t4 t4Var = (t4) this.f13142b;
                t4Var.p();
                f6.a.u(str);
                if (!TextUtils.isEmpty(str)) {
                    q.f fVar = t4Var.f10384h;
                    zzfc.zzd zzdVar = (zzfc.zzd) fVar.get(str);
                    if (zzdVar != null && zzdVar.zza() != 0) {
                        if (!fVar.containsKey(str) || fVar.get(str) == null) {
                            t4Var.H(str);
                        } else {
                            t4Var.x(str, (zzfc.zzd) fVar.get(str));
                        }
                        return (zzb) t4Var.f10386j.snapshot().get(str);
                    }
                }
                return null;
            default:
                return super.create(obj);
        }
    }

    @Override // q.n
    public final void entryRemoved(boolean z10, Object obj, Object obj2, Object obj3) {
        switch (this.f13141a) {
            case 0:
                g gVar = (g) obj2;
                ((i) this.f13142b).f13143a.c((c) obj, gVar.f13138a, gVar.f13139b, gVar.f13140c);
                break;
            default:
                super.entryRemoved(z10, obj, obj2, obj3);
                break;
        }
    }

    @Override // q.n
    public final int sizeOf(Object obj, Object obj2) {
        switch (this.f13141a) {
            case 0:
                return ((g) obj2).f13140c;
            default:
                return super.sizeOf(obj, obj2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(int i10, i iVar) {
        super(i10);
        this.f13142b = iVar;
    }
}
