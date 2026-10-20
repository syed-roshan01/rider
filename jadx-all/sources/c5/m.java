package c5;

import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.remoteconfig.internal.Code;
import m0.g1;
import o7.i2;

/* JADX INFO: loaded from: classes.dex */
public final class m extends d9.j implements c9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g1 f2996b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(int i10, g1 g1Var) {
        super(0);
        this.f2995a = i10;
        this.f2996b = g1Var;
    }

    @Override // c9.a
    public final /* bridge */ /* synthetic */ Object invoke() {
        q8.l lVar = q8.l.f13235a;
        switch (this.f2995a) {
            case 0:
                m1291invoke();
                break;
            case 1:
                m1291invoke();
                break;
            case 2:
                m1291invoke();
                break;
            case 3:
                m1291invoke();
                break;
            case 4:
                m1291invoke();
                break;
            case 5:
                m1291invoke();
                break;
            case 6:
                m1291invoke();
                break;
            case 7:
                m1291invoke();
                break;
            case 8:
                m1291invoke();
                break;
            case 9:
                m1291invoke();
                break;
            case 10:
                m1291invoke();
                break;
            case 11:
                m1291invoke();
                break;
            case 12:
                m1291invoke();
                break;
            case 13:
                m1291invoke();
                break;
            case Code.UNAVAILABLE /* 14 */:
                m1291invoke();
                break;
            case 15:
                m1291invoke();
                break;
            case Code.UNAUTHENTICATED /* 16 */:
                m1291invoke();
                break;
            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                m1291invoke();
                break;
            case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                m1291invoke();
                break;
            case 19:
                m1291invoke();
                break;
            case FirestoreIndexValueWriter.INDEX_TYPE_TIMESTAMP /* 20 */:
                m1291invoke();
                break;
            case 21:
                m1291invoke();
                break;
            default:
                m1291invoke();
                break;
        }
        return lVar;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m1291invoke() {
        int i10 = this.f2995a;
        g1 g1Var = this.f2996b;
        switch (i10) {
            case 0:
                g1Var.setValue(Boolean.FALSE);
                break;
            case 1:
                g1Var.setValue(Boolean.TRUE);
                break;
            case 2:
                g1Var.setValue(Boolean.valueOf(!((Boolean) g1Var.getValue()).booleanValue()));
                break;
            case 3:
                g1Var.setValue(Boolean.TRUE);
                break;
            case 4:
                g1Var.setValue(Boolean.FALSE);
                break;
            case 5:
                g1Var.setValue(Boolean.FALSE);
                break;
            case 6:
                g1Var.setValue(Boolean.valueOf(!((Boolean) g1Var.getValue()).booleanValue()));
                break;
            case 7:
                g1Var.setValue(Boolean.TRUE);
                break;
            case 8:
                g1Var.setValue(Boolean.FALSE);
                break;
            case 9:
                g1Var.setValue(Boolean.valueOf(!((Boolean) g1Var.getValue()).booleanValue()));
                break;
            case 10:
                g1Var.setValue(Boolean.valueOf(!((Boolean) g1Var.getValue()).booleanValue()));
                break;
            case 11:
                g1Var.setValue(Boolean.valueOf(!((Boolean) g1Var.getValue()).booleanValue()));
                break;
            case 12:
                g1Var.setValue(Boolean.FALSE);
                break;
            case 13:
                g1Var.setValue(Boolean.FALSE);
                break;
            case Code.UNAVAILABLE /* 14 */:
                g1Var.setValue(Boolean.TRUE);
                break;
            case 15:
                g1Var.setValue(Boolean.TRUE);
                break;
            case Code.UNAUTHENTICATED /* 16 */:
                g1Var.setValue(Boolean.FALSE);
                break;
            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                g1Var.setValue(Boolean.FALSE);
                break;
            case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                g1Var.setValue(Boolean.TRUE);
                break;
            case 19:
                g1Var.setValue(Boolean.FALSE);
                break;
            case FirestoreIndexValueWriter.INDEX_TYPE_TIMESTAMP /* 20 */:
                g1Var.setValue(Boolean.FALSE);
                break;
            case 21:
                g1Var.setValue(Boolean.FALSE);
                break;
            default:
                g1Var.setValue(Boolean.TRUE);
                break;
        }
    }
}
