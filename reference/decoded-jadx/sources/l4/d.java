package l4;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.r;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import x9.p;
import x9.q;

/* JADX INFO: loaded from: classes.dex */
public final class d implements r, h6.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11279a;

    public /* synthetic */ d(int i10) {
        this.f11279a = i10;
    }

    public static q a(q qVar, q qVar2) {
        p pVar = new p();
        int size = qVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            String strI = qVar.i(i10);
            String strN = qVar.n(i10);
            if ((!l9.i.K0("Warning", strI) || !l9.i.h1(strN, "1", false)) && (l9.i.K0("Content-Length", strI) || l9.i.K0("Content-Encoding", strI) || l9.i.K0("Content-Type", strI) || !b(strI) || qVar2.e(strI) == null)) {
                pVar.b(strI, strN);
            }
        }
        int size2 = qVar2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            String strI2 = qVar2.i(i11);
            if (!l9.i.K0("Content-Length", strI2) && !l9.i.K0("Content-Encoding", strI2) && !l9.i.K0("Content-Type", strI2) && b(strI2)) {
                pVar.b(strI2, qVar2.n(i11));
            }
        }
        return pVar.c();
    }

    public static boolean b(String str) {
        return (l9.i.K0("Connection", str) || l9.i.K0("Keep-Alive", str) || l9.i.K0("Proxy-Authenticate", str) || l9.i.K0("Proxy-Authorization", str) || l9.i.K0("TE", str) || l9.i.K0("Trailers", str) || l9.i.K0("Transfer-Encoding", str) || l9.i.K0("Upgrade", str)) ? false : true;
    }

    @Override // h6.c
    public final int c(Context context, String str) {
        return h6.e.a(context, str);
    }

    public final h6.d d(Context context, String str, h6.c cVar) {
        int iF;
        int i10 = 0;
        switch (this.f11279a) {
            case FirestoreIndexValueWriter.INDEX_TYPE_STRING /* 25 */:
                h6.d dVar = new h6.d();
                int iF2 = cVar.f(context, str, true);
                dVar.f7562b = iF2;
                if (iF2 != 0) {
                    dVar.f7563c = 1;
                } else {
                    int iC = cVar.c(context, str);
                    dVar.f7561a = iC;
                    if (iC != 0) {
                        dVar.f7563c = -1;
                    }
                }
                return dVar;
            case 26:
                h6.d dVar2 = new h6.d();
                int iC2 = cVar.c(context, str);
                dVar2.f7561a = iC2;
                if (iC2 != 0) {
                    dVar2.f7563c = -1;
                } else {
                    int iF3 = cVar.f(context, str, true);
                    dVar2.f7562b = iF3;
                    if (iF3 != 0) {
                        dVar2.f7563c = 1;
                    }
                }
                return dVar2;
            case 27:
                h6.d dVar3 = new h6.d();
                int iF4 = cVar.f(context, str, false);
                dVar3.f7562b = iF4;
                if (iF4 == 0) {
                    dVar3.f7563c = 0;
                } else {
                    dVar3.f7563c = 1;
                }
                return dVar3;
            case 28:
                h6.d dVar4 = new h6.d();
                dVar4.f7561a = cVar.c(context, str);
                int iF5 = cVar.f(context, str, true);
                dVar4.f7562b = iF5;
                int i11 = dVar4.f7561a;
                if (i11 == 0) {
                    if (iF5 == 0) {
                        dVar4.f7563c = 0;
                    }
                    return dVar4;
                }
                i10 = i11;
                if (i10 >= iF5) {
                    dVar4.f7563c = -1;
                } else {
                    dVar4.f7563c = 1;
                }
                return dVar4;
            default:
                h6.d dVar5 = new h6.d();
                int iC3 = cVar.c(context, str);
                dVar5.f7561a = iC3;
                if (iC3 != 0) {
                    iF = cVar.f(context, str, false);
                    dVar5.f7562b = iF;
                } else {
                    iF = cVar.f(context, str, true);
                    dVar5.f7562b = iF;
                }
                int i12 = dVar5.f7561a;
                if (i12 == 0) {
                    if (iF == 0) {
                        dVar5.f7563c = 0;
                    }
                    return dVar5;
                }
                i10 = i12;
                if (i10 >= iF) {
                    dVar5.f7563c = -1;
                } else {
                    dVar5.f7563c = 1;
                }
                return dVar5;
        }
    }

    @Override // h6.c
    public final int f(Context context, String str, boolean z10) {
        return h6.e.d(context, str, z10);
    }

    @Override // com.google.android.gms.common.api.internal.r
    public final Exception getException(Status status) {
        return status.f3152d != null ? new com.google.android.gms.common.api.m(status) : new com.google.android.gms.common.api.g(status);
    }
}
