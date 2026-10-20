package g2;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a0 f6569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k f6570b;

    public final a0 a(List list) {
        i iVar;
        Exception e4;
        try {
            int size = list.size();
            int i10 = 0;
            iVar = null;
            while (i10 < size) {
                try {
                    i iVar2 = (i) list.get(i10);
                    try {
                        iVar2.a(this.f6570b);
                        i10++;
                        iVar = iVar2;
                    } catch (Exception e10) {
                        e4 = e10;
                        iVar = iVar2;
                        StringBuilder sb = new StringBuilder();
                        StringBuilder sb2 = new StringBuilder("Error while applying EditCommand batch to buffer (length=");
                        sb2.append(this.f6570b.f6571a.a());
                        sb2.append(", composition=");
                        sb2.append(this.f6570b.c());
                        sb2.append(", selection=");
                        k kVar = this.f6570b;
                        sb2.append((Object) a2.b0.g(o1.s.g(kVar.f6572b, kVar.f6573c)));
                        sb2.append("):");
                        sb.append(sb2.toString());
                        sb.append('\n');
                        r8.p.I0(list, sb, (124 & 2) != 0 ? ", " : "\n", (124 & 4) != 0 ? "" : null, (124 & 8) != 0 ? "" : null, (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : new u.s(26, iVar, this));
                        String string = sb.toString();
                        d7.a.l(string, "StringBuilder().apply(builderAction).toString()");
                        throw new RuntimeException(string, e4);
                    }
                } catch (Exception e11) {
                    e4 = e11;
                }
            }
            a2.e eVar = new a2.e(this.f6570b.f6571a.toString(), null, 6);
            k kVar2 = this.f6570b;
            long jG = o1.s.g(kVar2.f6572b, kVar2.f6573c);
            a2.b0 b0Var = a2.b0.f(this.f6569a.f6510b) ? null : new a2.b0(jG);
            a0 a0Var = new a0(eVar, b0Var != null ? b0Var.f905a : o1.s.g(a2.b0.d(jG), a2.b0.e(jG)), this.f6570b.c());
            this.f6569a = a0Var;
            return a0Var;
        } catch (Exception e12) {
            iVar = null;
            e4 = e12;
        }
    }
}
