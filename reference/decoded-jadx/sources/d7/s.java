package d7;

import i7.t1;
import i7.z0;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class s implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k7.a f4913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.google.crypto.tink.shaded.protobuf.l f4914c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z0 f4915d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t1 f4916e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Integer f4917f;

    public s(String str, com.google.crypto.tink.shaded.protobuf.l lVar, z0 z0Var, t1 t1Var, Integer num) {
        this.f4912a = str;
        this.f4913b = y.b(str);
        this.f4914c = lVar;
        this.f4915d = z0Var;
        this.f4916e = t1Var;
        this.f4917f = num;
    }

    public static s a(String str, com.google.crypto.tink.shaded.protobuf.l lVar, z0 z0Var, t1 t1Var, Integer num) throws GeneralSecurityException {
        if (t1Var == t1.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new s(str, lVar, z0Var, t1Var, num);
    }
}
