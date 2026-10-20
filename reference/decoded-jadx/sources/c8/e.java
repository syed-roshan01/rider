package c8;

import l.z2;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b8.b f3053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3055c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f3056d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z2 f3057e;

    public e(z2 z2Var, b8.b bVar, int i10, int i11, int i12) {
        this.f3057e = z2Var;
        this.f3053a = bVar;
        this.f3054b = i10;
        this.f3055c = i11;
        this.f3056d = i12;
    }

    public final int a() {
        b8.b bVar = b8.b.BYTE;
        b8.b bVar2 = this.f3053a;
        int i10 = this.f3056d;
        if (bVar2 != bVar) {
            return i10;
        }
        l4.e eVar = (l4.e) this.f3057e.f10985d;
        z7.d dVar = (z7.d) eVar.f11282c;
        String str = (String) eVar.f11281b;
        int i11 = this.f3054b;
        return str.substring(i11, i10 + i11).getBytes(dVar.f17331a[this.f3055c].charset()).length;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        b8.b bVar = this.f3053a;
        sb.append(bVar);
        sb.append('(');
        b8.b bVar2 = b8.b.ECI;
        z2 z2Var = this.f3057e;
        if (bVar == bVar2) {
            sb.append(((z7.d) ((l4.e) z2Var.f10985d).f11282c).f17331a[this.f3055c].charset().displayName());
        } else {
            String str = (String) ((l4.e) z2Var.f10985d).f11281b;
            int i10 = this.f3054b;
            String strSubstring = str.substring(i10, this.f3056d + i10);
            StringBuilder sb2 = new StringBuilder();
            for (int i11 = 0; i11 < strSubstring.length(); i11++) {
                if (strSubstring.charAt(i11) < ' ' || strSubstring.charAt(i11) > '~') {
                    sb2.append('.');
                } else {
                    sb2.append(strSubstring.charAt(i11));
                }
            }
            sb.append(sb2.toString());
        }
        sb.append(')');
        return sb.toString();
    }
}
