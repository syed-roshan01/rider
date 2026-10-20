package g8;

import java.io.InputStream;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class u implements a6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f7147b;

    public /* synthetic */ u(Object obj, int i10) {
        this.f7146a = i10;
        this.f7147b = obj;
    }

    public static void a(u uVar, int i10) {
        int i11;
        t1 t1Var = (t1) uVar.f7147b;
        int i12 = t1Var.f7131f - t1Var.f7130e;
        if (i12 > 0) {
            int iMin = Math.min(i12, i10);
            t1 t1Var2 = (t1) uVar.f7147b;
            t1Var2.f7127b.update(t1Var2.f7129d, t1Var2.f7130e, iMin);
            ((t1) uVar.f7147b).f7130e += iMin;
            i11 = i10 - iMin;
        } else {
            i11 = i10;
        }
        if (i11 > 0) {
            byte[] bArr = new byte[512];
            int i13 = 0;
            while (i13 < i11) {
                int iMin2 = Math.min(i11 - i13, 512);
                ((t1) uVar.f7147b).f7126a.Z(bArr, 0, iMin2);
                ((t1) uVar.f7147b).f7127b.update(bArr, 0, iMin2);
                i13 += iMin2;
            }
        }
        ((t1) uVar.f7147b).f7138t += i10;
    }

    public final void b(Object obj) {
        ((ArrayList) this.f7147b).add(String.valueOf(obj));
    }

    public final void c(Object obj, String str) {
        ((ArrayList) this.f7147b).add(str + "=" + obj);
    }

    public final void d() {
        if (((w) this.f7147b).f7180b.decrementAndGet() == 0) {
            w.h((w) this.f7147b);
        }
    }

    public final int e() {
        int unsignedByte;
        t1 t1Var = (t1) this.f7147b;
        int i10 = t1Var.f7131f;
        int i11 = t1Var.f7130e;
        if (i10 - i11 > 0) {
            unsignedByte = t1Var.f7129d[i11] & 255;
            t1Var.f7130e = i11 + 1;
        } else {
            unsignedByte = t1Var.f7126a.readUnsignedByte();
        }
        ((t1) this.f7147b).f7127b.update(unsignedByte);
        ((t1) this.f7147b).f7138t++;
        return unsignedByte;
    }

    public final int f() {
        return e() | (e() << 8);
    }

    public final int g() {
        Object obj = this.f7147b;
        return (((t1) obj).f7131f - ((t1) obj).f7130e) + ((t1) obj).f7126a.f6977c;
    }

    @Override // g8.a6
    public final InputStream next() {
        InputStream inputStream = (InputStream) this.f7147b;
        this.f7147b = null;
        return inputStream;
    }

    public final String toString() {
        switch (this.f7146a) {
            case 3:
                return ((ArrayList) this.f7147b).toString();
            default:
                return super.toString();
        }
    }

    public u() {
        this.f7146a = 3;
        this.f7147b = new ArrayList();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(t1 t1Var) {
        this(t1Var, 2);
        this.f7146a = 2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(g0 g0Var) {
        this(g0Var, 1);
        this.f7146a = 1;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(InputStream inputStream) {
        this(inputStream, 4);
        this.f7146a = 4;
    }
}
