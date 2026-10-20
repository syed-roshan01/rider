package u1;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Parcel;
import android.text.Annotation;
import android.text.SpannableString;
import android.util.Base64;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class l implements p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClipboardManager f15156a;

    public l(Context context) {
        Object systemService = context.getSystemService("clipboard");
        d7.a.k(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        this.f15156a = (ClipboardManager) systemService;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00b0  */
    public final void a(a2.e eVar) {
        List list = r8.r.f13661a;
        List list2 = eVar.f919b;
        boolean zIsEmpty = (list2 == null ? list : list2).isEmpty();
        CharSequence charSequence = eVar.f918a;
        if (!zIsEmpty) {
            SpannableString spannableString = new SpannableString(charSequence);
            t1 t1Var = new t1();
            t1Var.f15301a = Parcel.obtain();
            if (list2 != null) {
                list = list2;
            }
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                a2.d dVar = (a2.d) list.get(i10);
                a2.x xVar = (a2.x) dVar.f914a;
                t1Var.f15301a.recycle();
                t1Var.f15301a = Parcel.obtain();
                long jD = xVar.f1031a.d();
                long j10 = e1.r.f5065g;
                if (!e1.r.c(jD, j10)) {
                    t1Var.b((byte) 1);
                    t1Var.f15301a.writeLong(xVar.f1031a.d());
                }
                long j11 = m2.n.f11820c;
                long j12 = xVar.f1032b;
                byte b10 = 2;
                if (!m2.n.a(j12, j11)) {
                    t1Var.b((byte) 2);
                    t1Var.d(j12);
                }
                f2.l lVar = xVar.f1033c;
                if (lVar != null) {
                    t1Var.b((byte) 3);
                    t1Var.f15301a.writeInt(lVar.f6122a);
                }
                f2.j jVar = xVar.f1034d;
                if (jVar != null) {
                    t1Var.b((byte) 4);
                    int i11 = jVar.f6112a;
                    t1Var.b((!f2.j.a(i11, 0) && f2.j.a(i11, 1)) ? (byte) 1 : (byte) 0);
                }
                f2.k kVar = xVar.f1035e;
                if (kVar != null) {
                    t1Var.b((byte) 5);
                    int i12 = kVar.f6113a;
                    if (f2.k.a(i12, 0)) {
                        b10 = 0;
                    } else if (f2.k.a(i12, 1)) {
                        b10 = 1;
                    } else if (!f2.k.a(i12, 2)) {
                        if (f2.k.a(i12, 3)) {
                            b10 = 3;
                        } else {
                            b10 = 0;
                        }
                    }
                    t1Var.b(b10);
                }
                String str = xVar.f1037g;
                if (str != null) {
                    t1Var.b((byte) 6);
                    t1Var.f15301a.writeString(str);
                }
                long j13 = xVar.f1038h;
                if (!m2.n.a(j13, j11)) {
                    t1Var.b((byte) 7);
                    t1Var.d(j13);
                }
                l2.a aVar = xVar.f1039i;
                if (aVar != null) {
                    t1Var.b((byte) 8);
                    t1Var.c(aVar.f11194a);
                }
                l2.p pVar = xVar.f1040j;
                if (pVar != null) {
                    t1Var.b((byte) 9);
                    t1Var.c(pVar.f11220a);
                    t1Var.c(pVar.f11221b);
                }
                long j14 = xVar.f1042l;
                if (!e1.r.c(j14, j10)) {
                    t1Var.b((byte) 10);
                    t1Var.f15301a.writeLong(j14);
                }
                l2.j jVar2 = xVar.f1043m;
                if (jVar2 != null) {
                    t1Var.b((byte) 11);
                    t1Var.f15301a.writeInt(jVar2.f11214a);
                }
                e1.k0 k0Var = xVar.f1044n;
                if (k0Var != null) {
                    t1Var.b((byte) 12);
                    t1Var.f15301a.writeLong(k0Var.f5039a);
                    long j15 = k0Var.f5040b;
                    t1Var.c(d1.c.d(j15));
                    t1Var.c(d1.c.e(j15));
                    t1Var.c(k0Var.f5041c);
                }
                spannableString.setSpan(new Annotation("androidx.compose.text.SpanStyle", Base64.encodeToString(t1Var.f15301a.marshall(), 0)), dVar.f915b, dVar.f916c, 33);
            }
            charSequence = spannableString;
        }
        this.f15156a.setPrimaryClip(ClipData.newPlainText("plain text", charSequence));
    }
}
