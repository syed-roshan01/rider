package r4;

import d9.j;
import java.util.regex.Pattern;
import q8.k;
import x9.u;

/* JADX INFO: loaded from: classes.dex */
public final class a extends j implements c9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f13448b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(b bVar, int i10) {
        super(0);
        this.f13447a = i10;
        this.f13448b = bVar;
    }

    @Override // c9.a
    public final Object invoke() {
        int i10 = this.f13447a;
        b bVar = this.f13448b;
        switch (i10) {
            case 0:
                x9.c cVar = x9.c.f16358n;
                return k.l(bVar.f13454f);
            default:
                String strE = bVar.f13454f.e("Content-Type");
                if (strE == null) {
                    return null;
                }
                Pattern pattern = u.f16465b;
                try {
                    return k.i(strE);
                } catch (IllegalArgumentException unused) {
                    return null;
                }
        }
    }
}
