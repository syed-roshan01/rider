package com.google.android.recaptcha.internal;

import android.content.Context;
import d7.a;
import d7.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Timer;
import k9.j;
import m9.d0;
import r8.q;
import r8.y;

/* JADX INFO: loaded from: classes.dex */
public final class zzbm implements zzbh {
    public static final zzbi zza = new zzbi(null);
    private static Timer zzb;
    private final zzbn zzc;
    private final d0 zzd;
    private final zzaz zze;

    /* JADX WARN: Multi-variable type inference failed */
    public zzbm(Context context, zzbn zzbnVar, d0 d0Var) {
        this.zzc = zzbnVar;
        this.zzd = d0Var;
        zzaz zzazVar = null;
        Object[] objArr = 0;
        try {
            zzaz zzazVar2 = zzaz.zzc;
            zzazVar2 = zzazVar2 == null ? new zzaz(context, objArr == true ? 1 : 0) : zzazVar2;
            zzaz.zzc = zzazVar2;
            zzazVar = zzazVar2;
        } catch (Exception unused) {
        }
        this.zze = zzazVar;
        zzh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzg() {
        Iterator it;
        ArrayList<List> arrayList;
        zzaz zzazVar;
        zzaz zzazVar2 = this.zze;
        if (zzazVar2 != null) {
            List listZzd = zzazVar2.zzd();
            a.m(listZzd, "<this>");
            if ((listZzd instanceof RandomAccess) && (listZzd instanceof List)) {
                List list = listZzd;
                int size = list.size();
                arrayList = new ArrayList((size / 20) + (size % 20 == 0 ? 0 : 1));
                for (int i10 = 0; i10 >= 0 && i10 < size; i10 += 20) {
                    int i11 = size - i10;
                    if (20 <= i11) {
                        i11 = 20;
                    }
                    ArrayList arrayList2 = new ArrayList(i11);
                    for (int i12 = 0; i12 < i11; i12++) {
                        arrayList2.add(list.get(i12 + i10));
                    }
                    arrayList.add(arrayList2);
                }
            } else {
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = listZzd.iterator();
                a.m(it2, "iterator");
                if (it2.hasNext()) {
                    y yVar = new y(20, 20, it2, false, true, null);
                    j jVar = new j();
                    jVar.f10648c = t.M(jVar, jVar, yVar);
                    it = jVar;
                } else {
                    it = q.f13660a;
                }
                while (it.hasNext()) {
                    arrayList3.add((List) it.next());
                }
                arrayList = arrayList3;
            }
            for (List<zzba> list2 : arrayList) {
                zznh zznhVarZzi = zzni.zzi();
                ArrayList arrayList4 = new ArrayList();
                for (zzba zzbaVar : list2) {
                    try {
                        zzpd zzpdVarZzk = zzpd.zzk(zzfy.zzg().zzj(zzbaVar.zzc()));
                        int iZzJ = zzpdVarZzk.zzJ();
                        int i13 = iZzJ - 1;
                        if (iZzJ == 0) {
                            throw null;
                        }
                        if (i13 == 0) {
                            zznhVarZzi.zzp(zzpdVarZzk.zzf());
                        } else if (i13 == 1) {
                            zznhVarZzi.zzq(zzpdVarZzk.zzg());
                        }
                        arrayList4.add(zzbaVar);
                    } catch (Exception unused) {
                        zzaz zzazVar3 = this.zze;
                        if (zzazVar3 != null) {
                            zzazVar3.zzf(zzbaVar);
                        }
                    }
                }
                if (zznhVarZzi.zze() + zznhVarZzi.zzd() != 0) {
                    if (this.zzc.zza(((zzni) zznhVarZzi.zzj()).zzd()) && (zzazVar = this.zze) != null) {
                        zzazVar.zza(arrayList4);
                    }
                }
            }
        }
    }

    private final void zzh() {
        if (zzb == null) {
            Timer timer = new Timer();
            zzb = timer;
            timer.schedule(new zzbj(this), 120000L, 120000L);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzbh
    public final void zza(zzpd zzpdVar) {
        z6.a.Q(this.zzd, null, 0, new zzbl(this, zzpdVar, null), 3);
        zzh();
    }
}
