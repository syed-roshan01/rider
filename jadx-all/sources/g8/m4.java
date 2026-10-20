package g8;

import java.io.Closeable;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public interface m4 extends Closeable {
    void H(OutputStream outputStream, int i10);

    void U(ByteBuffer byteBuffer);

    void Z(byte[] bArr, int i10, int i11);

    int j();

    void k();

    boolean markSupported();

    int readUnsignedByte();

    void reset();

    void skipBytes(int i10);

    m4 t(int i10);
}
