package z4;

import d9.j;

/* JADX INFO: loaded from: classes.dex */
public final class a extends j implements c9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f17202b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(b bVar, int i10) {
        super(0);
        this.f17201a = i10;
        this.f17202b = bVar;
    }

    @Override // c9.a
    public final Object invoke() {
        int i10 = this.f17201a;
        b bVar = this.f17202b;
        switch (i10) {
            case 0:
                try {
                    return c4.b.a(bVar.f17203a, (c4.d) bVar.f17205c.getValue());
                } catch (Exception e4) {
                    a7.a.t("EncryptedSharedPreferences creation failed, fallback to secure private prefs: ", e4.getMessage(), bVar.f17204b);
                    return bVar.f17203a.getSharedPreferences("encrypted_app_data_secure", 0);
                }
            default:
                c4.c cVar = new c4.c(bVar.f17203a);
                cVar.b();
                return cVar.a();
        }
    }
}
