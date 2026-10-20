package ja;

import java.nio.channels.WritableByteChannel;

/* JADX INFO: loaded from: classes.dex */
public interface h extends e0, WritableByteChannel {
    h C(int i10);

    h F(byte[] bArr);

    h V(String str);

    h W(long j10);

    @Override // ja.e0, java.io.Flushable
    void flush();

    h h(long j10);

    h m(int i10);

    h s(int i10);

    h z(j jVar);
}
