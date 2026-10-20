package w6;

import android.content.Context;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.crypto.tink.shaded.protobuf.h0;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.database.collection.ImmutableSortedMap;
import com.google.firebase.firestore.auth.FirebaseAppCheckTokenProvider;
import com.google.firebase.firestore.core.FirestoreClient;
import com.google.firebase.firestore.util.Listener;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import com.google.firebase.remoteconfig.internal.Code;
import i7.j0;
import i7.t0;
import i7.t1;
import i7.w1;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import k6.w4;
import l.v2;
import l.w2;
import l.x2;
import l.y2;
import l.z2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t implements d7.c, d7.o, LibraryVersionComponent.VersionExtractor, ImmutableSortedMap.Builder.KeyTranslator, Continuation, Listener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16240a;

    public /* synthetic */ t(int i10) {
        this.f16240a = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // d7.c
    public final v6.b a(d7.u uVar) throws GeneralSecurityException {
        r rVar;
        w wVar;
        b0 b0Var;
        v6.r rVar2 = v6.r.f15935a;
        w2 w2Var = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        switch (this.f16240a) {
            case 3:
                d7.s sVar = (d7.s) uVar;
                if (!sVar.f4912a.equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivParameters.parseParameters");
                }
                try {
                    i7.b0 b0VarC = i7.b0.C(sVar.f4914c, com.google.crypto.tink.shaded.protobuf.t.a());
                    if (b0VarC.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    v6.d dVar = new v6.d();
                    int size = b0VarC.z().size();
                    if (size != 16 && size != 32) {
                        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(size)));
                    }
                    dVar.f15907b = Integer.valueOf(size);
                    t1 t1Var = sVar.f4916e;
                    int iOrdinal = t1Var.ordinal();
                    if (iOrdinal == 1) {
                        rVar = r.f16234b;
                    } else if (iOrdinal == 2) {
                        rVar = r.f16235c;
                    } else if (iOrdinal == 3) {
                        rVar = r.f16236d;
                    } else {
                        if (iOrdinal != 4) {
                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + t1Var.b());
                        }
                        rVar = r.f16235c;
                    }
                    dVar.f15908c = rVar;
                    s sVarB = dVar.b();
                    z2 z2Var = new z2((v2) (objArr == true ? 1 : 0));
                    z2Var.f10983b = sVarB;
                    z2Var.f10984c = w4.c(b0VarC.z().o(), rVar2);
                    z2Var.f10985d = sVar.f4917f;
                    return z2Var.n();
                } catch (h0 unused) {
                    throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
                }
            case 7:
                d7.s sVar2 = (d7.s) uVar;
                d7.m mVar = y.f16249a;
                if (!sVar2.f4912a.equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
                    throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305Parameters.parseParameters");
                }
                try {
                    j0 j0VarC = j0.C(sVar2.f4914c, com.google.crypto.tink.shaded.protobuf.t.a());
                    if (j0VarC.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    t1 t1Var2 = sVar2.f4916e;
                    int iOrdinal2 = t1Var2.ordinal();
                    if (iOrdinal2 == 1) {
                        wVar = w.f16245b;
                    } else if (iOrdinal2 == 2) {
                        wVar = w.f16246c;
                    } else if (iOrdinal2 == 3) {
                        wVar = w.f16247d;
                    } else {
                        if (iOrdinal2 != 4) {
                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + t1Var2.b());
                        }
                        wVar = w.f16246c;
                    }
                    return v.b(wVar, w4.c(j0VarC.z().o(), rVar2), sVar2.f4917f);
                } catch (h0 unused2) {
                    throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
                }
            case 11:
                d7.s sVar3 = (d7.s) uVar;
                d7.m mVar2 = d0.f16200a;
                if (!sVar3.f4912a.equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
                    throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305Parameters.parseParameters");
                }
                try {
                    w1 w1VarC = w1.C(sVar3.f4914c, com.google.crypto.tink.shaded.protobuf.t.a());
                    if (w1VarC.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    t1 t1Var3 = sVar3.f4916e;
                    int iOrdinal3 = t1Var3.ordinal();
                    if (iOrdinal3 == 1) {
                        b0Var = b0.f16193b;
                    } else if (iOrdinal3 == 2) {
                        b0Var = b0.f16194c;
                    } else if (iOrdinal3 == 3) {
                        b0Var = b0.f16195d;
                    } else {
                        if (iOrdinal3 != 4) {
                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + t1Var3.b());
                        }
                        b0Var = b0.f16194c;
                    }
                    return a0.b(b0Var, w4.c(w1VarC.z().o(), rVar2), sVar3.f4917f);
                } catch (h0 unused3) {
                    throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
                }
            case Code.UNAUTHENTICATED /* 16 */:
                d7.s sVar4 = (d7.s) uVar;
                d7.m mVar3 = e7.e.f5162a;
                if (!sVar4.f4912a.equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesCmacParameters.parseParameters");
                }
                try {
                    i7.b bVarE = i7.b.E(sVar4.f4914c, com.google.crypto.tink.shaded.protobuf.t.a());
                    if (bVarE.C() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    z2 z2Var2 = new z2((y2) (objArr3 == true ? 1 : 0));
                    z2Var2.M(bVarE.A().size());
                    z2Var2.O(bVarE.B().z());
                    z2Var2.f10985d = e7.e.a(sVar4.f4916e);
                    e7.d dVarH = z2Var2.h();
                    z2 z2Var3 = new z2((x2) (objArr2 == true ? 1 : 0));
                    z2Var3.f10983b = dVarH;
                    z2Var3.f10984c = w4.c(bVarE.A().o(), rVar2);
                    z2Var3.f10985d = sVar4.f4917f;
                    return z2Var3.d();
                } catch (h0 | IllegalArgumentException unused4) {
                    throw new GeneralSecurityException("Parsing AesCmacKey failed");
                }
            default:
                d7.s sVar5 = (d7.s) uVar;
                d7.m mVar4 = e7.n.f5185a;
                if (!sVar5.f4912a.equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
                }
                try {
                    t0 t0VarF = t0.F(sVar5.f4914c, com.google.crypto.tink.shaded.protobuf.t.a());
                    if (t0VarF.D() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    i3.a0 a0Var = new i3.a0(10);
                    a0Var.f7941a = Integer.valueOf(t0VarF.B().size());
                    a0Var.f7942b = Integer.valueOf(t0VarF.C().B());
                    a0Var.f7943c = e7.n.a(t0VarF.C().A());
                    a0Var.f7944d = e7.n.b(sVar5.f4916e);
                    e7.m mVarB = a0Var.b();
                    z2 z2Var4 = new z2(w2Var);
                    z2Var4.f10983b = mVarB;
                    z2Var4.f10984c = w4.c(t0VarF.B().o(), rVar2);
                    z2Var4.f10985d = sVar5.f4917f;
                    return z2Var4.i();
                } catch (h0 | IllegalArgumentException unused5) {
                    throw new GeneralSecurityException("Parsing HmacKey failed");
                }
        }
    }

    @Override // com.google.firebase.platforminfo.LibraryVersionComponent.VersionExtractor
    public final String extract(Object obj) {
        Context context = (Context) obj;
        switch (this.f16240a) {
            case 22:
                return FirebaseCommonRegistrar.lambda$getComponents$0(context);
            case 23:
                return FirebaseCommonRegistrar.lambda$getComponents$1(context);
            case 24:
                return FirebaseCommonRegistrar.lambda$getComponents$2(context);
            default:
                return FirebaseCommonRegistrar.lambda$getComponents$3(context);
        }
    }

    @Override // com.google.firebase.firestore.util.Listener
    public final void onValue(Object obj) {
        FirestoreClient.lambda$new$3((String) obj);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        switch (this.f16240a) {
            case 27:
                return FirebaseAppCheckTokenProvider.lambda$getToken$2(task);
            default:
                return FirestoreClient.lambda$getDocumentFromLocalCache$10(task);
        }
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap.Builder.KeyTranslator
    public final Object translate(Object obj) {
        return ImmutableSortedMap.Builder.lambda$static$0(obj);
    }
}
