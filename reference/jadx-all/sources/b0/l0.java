package b0;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.core.Transaction;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.firestore.util.Util;
import com.google.firebase.messaging.FcmBroadcastProcessor;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.internal.Code;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import i7.t1;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayList;
import java.util.List;
import k6.w4;
import l.z2;
import o7.i2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l0 implements h0.s, f1.i, r5.k, d7.c, Continuation, OnSuccessListener, SuccessContinuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2427a;

    public /* synthetic */ l0(int i10) {
        this.f2427a = i10;
    }

    @Override // d7.c
    public v6.b a(d7.u uVar) throws GeneralSecurityException {
        Integer num = 16;
        switch (this.f2427a) {
            case FirestoreIndexValueWriter.INDEX_TYPE_STRING /* 25 */:
                d7.s sVar = (d7.s) uVar;
                d7.m mVar = w6.l.f16218a;
                if (!sVar.f4912a.equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesEaxParameters.parseParameters");
                }
                try {
                    i7.r rVarE = i7.r.E(sVar.f4914c, com.google.crypto.tink.shaded.protobuf.t.a());
                    if (rVarE.C() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    w6.j jVar = w6.j.f16212d;
                    int size = rVarE.A().size();
                    if (size != 16 && size != 24 && size != 32) {
                        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(size)));
                    }
                    Integer numValueOf = Integer.valueOf(size);
                    int iZ = rVarE.B().z();
                    if (iZ != 12 && iZ != 16) {
                        throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", Integer.valueOf(iZ)));
                    }
                    Integer numValueOf2 = Integer.valueOf(iZ);
                    t1 t1Var = sVar.f4916e;
                    int iOrdinal = t1Var.ordinal();
                    if (iOrdinal == 1) {
                        jVar = w6.j.f16210b;
                    } else if (iOrdinal == 2) {
                        jVar = w6.j.f16211c;
                    } else if (iOrdinal != 3) {
                        if (iOrdinal != 4) {
                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + t1Var.b());
                        }
                        jVar = w6.j.f16211c;
                    }
                    if (numValueOf == null) {
                        throw new GeneralSecurityException("Key size is not set");
                    }
                    if (numValueOf2 == null) {
                        throw new GeneralSecurityException("IV size is not set");
                    }
                    if (num == null) {
                        throw new GeneralSecurityException("Tag size is not set");
                    }
                    w6.k kVar = new w6.k(numValueOf.intValue(), numValueOf2.intValue(), num.intValue(), jVar);
                    z2 z2Var = new z2((Object) null);
                    z2Var.f10983b = kVar;
                    z2Var.f10984c = new w4(k7.a.a(rVarE.A().o()), 11);
                    z2Var.f10985d = sVar.f4917f;
                    return z2Var.l();
                } catch (com.google.crypto.tink.shaded.protobuf.h0 unused) {
                    throw new GeneralSecurityException("Parsing AesEaxcKey failed");
                }
            default:
                d7.s sVar2 = (d7.s) uVar;
                d7.m mVar2 = w6.p.f16230a;
                if (!sVar2.f4912a.equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmParameters.parseParameters");
                }
                try {
                    i7.x xVarC = i7.x.C(sVar2.f4914c, com.google.crypto.tink.shaded.protobuf.t.a());
                    if (xVarC.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    w6.n nVar = w6.n.f16224d;
                    int size2 = xVarC.z().size();
                    if (size2 != 16 && size2 != 24 && size2 != 32) {
                        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(size2)));
                    }
                    Integer numValueOf3 = Integer.valueOf(size2);
                    Integer num2 = 12;
                    t1 t1Var2 = sVar2.f4916e;
                    int iOrdinal2 = t1Var2.ordinal();
                    if (iOrdinal2 == 1) {
                        nVar = w6.n.f16222b;
                    } else if (iOrdinal2 == 2) {
                        nVar = w6.n.f16223c;
                    } else if (iOrdinal2 != 3) {
                        if (iOrdinal2 != 4) {
                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + t1Var2.b());
                        }
                        nVar = w6.n.f16223c;
                    }
                    if (numValueOf3 == null) {
                        throw new GeneralSecurityException("Key size is not set");
                    }
                    if (num2 == null) {
                        throw new GeneralSecurityException("IV size is not set");
                    }
                    if (num == null) {
                        throw new GeneralSecurityException("Tag size is not set");
                    }
                    w6.o oVar = new w6.o(numValueOf3.intValue(), num2.intValue(), num.intValue(), nVar);
                    z2 z2Var2 = new z2((l.q) null);
                    z2Var2.f10983b = oVar;
                    z2Var2.f10984c = new w4(k7.a.a(xVarC.z().o()), 11);
                    z2Var2.f10985d = sVar2.f4917f;
                    return z2Var2.m();
                } catch (com.google.crypto.tink.shaded.protobuf.h0 unused2) {
                    throw new GeneralSecurityException("Parsing AesGcmKey failed");
                }
        }
    }

    @Override // r5.k
    public Object apply(Object obj) {
        switch (this.f2427a) {
            case 13:
                i5.c cVar = r5.m.f13502f;
                return (List) r5.m.q(((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new l0(17));
            case Code.UNAVAILABLE /* 14 */:
                i5.c cVar2 = r5.m.f13502f;
                throw new s5.a("Timed out while trying to open db.", (Throwable) obj);
            case 15:
                Cursor cursor = (Cursor) obj;
                i5.c cVar3 = r5.m.f13502f;
                if (cursor.moveToNext()) {
                    return Long.valueOf(cursor.getLong(0));
                }
                return 0L;
            case Code.UNAUTHENTICATED /* 16 */:
                i5.c cVar4 = r5.m.f13502f;
                throw new s5.a("Timed out while trying to acquire the lock.", (Throwable) obj);
            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                Cursor cursor2 = (Cursor) obj;
                i5.c cVar5 = r5.m.f13502f;
                ArrayList arrayList = new ArrayList();
                while (cursor2.moveToNext()) {
                    z2 z2VarA = l5.j.a();
                    z2VarA.L(cursor2.getString(1));
                    z2VarA.N(u5.a.b(cursor2.getInt(2)));
                    String string = cursor2.getString(3);
                    z2VarA.f10984c = string == null ? null : Base64.decode(string, 0);
                    arrayList.add(z2VarA.j());
                }
                return arrayList;
            case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                i5.c cVar6 = r5.m.f13502f;
                return Boolean.valueOf(((Cursor) obj).getCount() > 0);
            case 19:
                return Boolean.valueOf(((Cursor) obj).moveToNext());
            case FirestoreIndexValueWriter.INDEX_TYPE_TIMESTAMP /* 20 */:
                Cursor cursor3 = (Cursor) obj;
                i5.c cVar7 = r5.m.f13502f;
                if (cursor3.moveToNext()) {
                    return Long.valueOf(cursor3.getLong(0));
                }
                return null;
            default:
                Cursor cursor4 = (Cursor) obj;
                i5.c cVar8 = r5.m.f13502f;
                ArrayList arrayList2 = new ArrayList();
                int length = 0;
                while (cursor4.moveToNext()) {
                    byte[] blob = cursor4.getBlob(0);
                    arrayList2.add(blob);
                    length += blob.length;
                }
                byte[] bArr = new byte[length];
                int length2 = 0;
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    byte[] bArr2 = (byte[]) arrayList2.get(i10);
                    System.arraycopy(bArr2, 0, bArr, length2, bArr2.length);
                    length2 += bArr2.length;
                }
                return bArr;
        }
    }

    @Override // f1.i
    public double b(double d10) {
        switch (this.f2427a) {
            case 6:
                float[] fArr = f1.e.f6028a;
                double d11 = d10 < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? -d10 : d10;
                return Math.copySign(d11 >= 0.0031308049535603718d ? (Math.pow(d11, 0.4166666666666667d) - 0.05213270142180095d) / 0.9478672985781991d : d11 / 0.07739938080495357d, d10);
            case 7:
                float[] fArr2 = f1.e.f6028a;
                double d12 = d10 < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? -d10 : d10;
                return Math.copySign(d12 >= 0.04045d ? Math.pow((0.9478672985781991d * d12) + 0.05213270142180095d, 2.4d) : 0.07739938080495357d * d12, d10);
            default:
                return d10;
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0081  */
    public h0.p c(h0.q0 q0Var) {
        h0.o oVarF;
        h0.o oVar;
        h0.o oVar2;
        h0.p pVarA;
        h0.n nVar = q0Var.f7449c;
        switch (this.f2427a) {
            case 1:
                return new h0.p(nVar.a(nVar.f7427a), nVar.a(nVar.f7428b), nVar.b() == 1);
            case 2:
            default:
                h0.p pVar = q0Var.f7448b;
                if (pVar == null) {
                    return h0.r.f7451b.c(q0Var);
                }
                boolean z10 = q0Var.f7447a;
                h0.o oVar3 = pVar.f7437b;
                h0.o oVar4 = pVar.f7436a;
                if (z10) {
                    oVarF = o7.d0.f(q0Var, nVar, oVar4);
                    oVar = oVarF;
                    oVar2 = oVar3;
                    oVar3 = oVar4;
                } else {
                    oVarF = o7.d0.f(q0Var, nVar, oVar3);
                    oVar = oVar4;
                    oVar2 = oVarF;
                }
                if (!d7.a.d(oVarF, oVar3)) {
                    boolean z11 = nVar.b() == 1 || (nVar.b() == 3 && oVar.f7433b > oVar2.f7433b);
                    h0.p pVar2 = new h0.p(oVar, oVar2, z11);
                    if (oVar.f7434c != oVar2.f7434c) {
                        if ((z11 ? oVar : oVar2).f7433b == 0) {
                            if (nVar.f7430d.f893a.f1052a.f918a.length() == (z11 ? oVar2 : oVar).f7433b) {
                                String str = nVar.f7430d.f893a.f1052a.f918a;
                                if (pVar == null) {
                                }
                            }
                        }
                    } else if (oVar.f7433b == oVar2.f7433b) {
                        String str2 = nVar.f7430d.f893a.f1052a.f918a;
                        if (pVar == null && str2.length() != 0) {
                            String str3 = nVar.f7430d.f893a.f1052a.f918a;
                            int length = str3.length();
                            int i10 = nVar.f7427a;
                            if (i10 == 0) {
                                int iT = d7.t.T(0, str3);
                                pVarA = z10 ? h0.p.a(pVar2, o7.d0.l(oVar, nVar, iT), null, true, 2) : h0.p.a(pVar2, null, o7.d0.l(oVar2, nVar, iT), false, 1);
                            } else if (i10 == length) {
                                int iU = d7.t.U(length, str3);
                                pVarA = z10 ? h0.p.a(pVar2, o7.d0.l(oVar, nVar, iU), null, false, 2) : h0.p.a(pVar2, null, o7.d0.l(oVar2, nVar, iU), true, 1);
                            } else {
                                boolean z12 = pVar.f7438c;
                                int iU2 = z10 ^ z12 ? d7.t.U(i10, str3) : d7.t.T(i10, str3);
                                pVarA = z10 ? h0.p.a(pVar2, o7.d0.l(oVar, nVar, iU2), null, z12, 2) : h0.p.a(pVar2, null, o7.d0.l(oVar2, nVar, iU2), z12, 1);
                            }
                            pVar = pVarA;
                        }
                    }
                    pVar = pVar2;
                }
                return pVar;
            case 3:
                return o7.d0.d(q0Var, h0.q.f7445c);
            case 4:
                return o7.d0.d(q0Var, h0.q.f7444b);
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        ((e8.k) obj).halfClose();
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        switch (this.f2427a) {
            case 6:
                return FirebaseRemoteConfig.lambda$setDefaultsWithStringsMapAsync$7((ConfigContainer) obj);
            case 7:
                return FirebaseRemoteConfig.lambda$fetch$4((ConfigFetchHandler.FetchResponse) obj);
            default:
                return FirebaseRemoteConfig.lambda$fetch$3((ConfigFetchHandler.FetchResponse) obj);
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        switch (this.f2427a) {
            case 0:
                return Transaction.lambda$commit$1(task);
            case 1:
            default:
                return FcmBroadcastProcessor.lambda$bindToMessagingService$3(task);
            case 2:
                return Util.lambda$static$0(task);
            case 3:
                return FcmBroadcastProcessor.lambda$startMessagingService$1(task);
        }
    }
}
