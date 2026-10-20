package l8;

import com.google.protobuf.b2;
import com.google.protobuf.t;
import com.google.protobuf.t1;
import com.google.protobuf.v;
import e8.f0;
import e8.t0;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class a extends InputStream implements f0, t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public t1 f11385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b2 f11386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ByteArrayInputStream f11387c;

    public a(t1 t1Var, b2 b2Var) {
        this.f11385a = t1Var;
        this.f11386b = b2Var;
    }

    @Override // java.io.InputStream
    public final int available() {
        t1 t1Var = this.f11385a;
        if (t1Var != null) {
            return t1Var.getSerializedSize();
        }
        ByteArrayInputStream byteArrayInputStream = this.f11387c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.available();
        }
        return 0;
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.f11385a != null) {
            this.f11387c = new ByteArrayInputStream(this.f11385a.toByteArray());
            this.f11385a = null;
        }
        ByteArrayInputStream byteArrayInputStream = this.f11387c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read();
        }
        return -1;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        t1 t1Var = this.f11385a;
        if (t1Var != null) {
            int serializedSize = t1Var.getSerializedSize();
            if (serializedSize == 0) {
                this.f11385a = null;
                this.f11387c = null;
                return -1;
            }
            if (i11 >= serializedSize) {
                Logger logger = v.f4248d;
                t tVar = new t(bArr, i10, serializedSize);
                this.f11385a.writeTo(tVar);
                if (tVar.q0() != 0) {
                    throw new IllegalStateException("Did not write as much data as expected.");
                }
                this.f11385a = null;
                this.f11387c = null;
                return serializedSize;
            }
            this.f11387c = new ByteArrayInputStream(this.f11385a.toByteArray());
            this.f11385a = null;
        }
        ByteArrayInputStream byteArrayInputStream = this.f11387c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read(bArr, i10, i11);
        }
        return -1;
    }
}
