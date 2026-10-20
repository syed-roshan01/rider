package g8;

import com.google.firebase.remoteconfig.internal.Code;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;
import java.util.ArrayDeque;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class n0 extends d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final r7.e f6970e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final r7.e f6971f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final r7.e f6972n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final r7.e f6973o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final r7.e f6974p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayDeque f6975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayDeque f6976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6977c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f6978d;

    static {
        int i10 = 0;
        f6970e = new r7.e(15, i10);
        f6971f = new r7.e(16, i10);
        f6972n = new r7.e(17, i10);
        f6973o = new r7.e(18, i10);
        f6974p = new r7.e(19, i10);
    }

    public n0(int i10) {
        this.f6975a = new ArrayDeque(i10);
    }

    @Override // g8.m4
    public final void H(OutputStream outputStream, int i10) throws IOException {
        f(f6974p, i10, outputStream, 0);
    }

    @Override // g8.m4
    public final void U(ByteBuffer byteBuffer) {
        g(f6973o, byteBuffer.remaining(), byteBuffer, 0);
    }

    @Override // g8.m4
    public final void Z(byte[] bArr, int i10, int i11) {
        g(f6972n, i11, bArr, i10);
    }

    public final void b(m4 m4Var) throws IOException {
        boolean z10 = this.f6978d;
        ArrayDeque arrayDeque = this.f6975a;
        boolean z11 = z10 && arrayDeque.isEmpty();
        if (m4Var instanceof n0) {
            n0 n0Var = (n0) m4Var;
            while (!n0Var.f6975a.isEmpty()) {
                arrayDeque.add((m4) n0Var.f6975a.remove());
            }
            this.f6977c += n0Var.f6977c;
            n0Var.f6977c = 0;
            n0Var.close();
        } else {
            arrayDeque.add(m4Var);
            this.f6977c = m4Var.j() + this.f6977c;
        }
        if (z11) {
            ((m4) arrayDeque.peek()).k();
        }
    }

    @Override // g8.d, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        while (true) {
            ArrayDeque arrayDeque = this.f6975a;
            if (arrayDeque.isEmpty()) {
                break;
            } else {
                ((m4) arrayDeque.remove()).close();
            }
        }
        if (this.f6976b != null) {
            while (!this.f6976b.isEmpty()) {
                ((m4) this.f6976b.remove()).close();
            }
        }
    }

    public final void e() throws IOException {
        boolean z10 = this.f6978d;
        ArrayDeque arrayDeque = this.f6975a;
        if (!z10) {
            ((m4) arrayDeque.remove()).close();
            return;
        }
        this.f6976b.add((m4) arrayDeque.remove());
        m4 m4Var = (m4) arrayDeque.peek();
        if (m4Var != null) {
            m4Var.k();
        }
    }

    public final int f(r7.e eVar, int i10, Object obj, int i11) throws IOException {
        a(i10);
        ArrayDeque arrayDeque = this.f6975a;
        if (!arrayDeque.isEmpty() && ((m4) arrayDeque.peek()).j() == 0) {
            e();
        }
        while (i10 > 0 && !arrayDeque.isEmpty()) {
            m4 m4Var = (m4) arrayDeque.peek();
            int iMin = Math.min(i10, m4Var.j());
            int unsignedByte = 0;
            int i12 = eVar.f13598a;
            switch (i12) {
                case 15:
                    switch (i12) {
                        case 15:
                            unsignedByte = m4Var.readUnsignedByte();
                            break;
                        default:
                            m4Var.skipBytes(iMin);
                            break;
                    }
                    i11 = unsignedByte;
                    break;
                case Code.UNAUTHENTICATED /* 16 */:
                    switch (i12) {
                        case 15:
                            unsignedByte = m4Var.readUnsignedByte();
                            break;
                        default:
                            m4Var.skipBytes(iMin);
                            break;
                    }
                    i11 = unsignedByte;
                    break;
                case o7.i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    m4Var.Z((byte[]) obj, i11, iMin);
                    i11 += iMin;
                    break;
                case o7.i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                    ByteBuffer byteBuffer = (ByteBuffer) obj;
                    int iLimit = byteBuffer.limit();
                    byteBuffer.limit(byteBuffer.position() + iMin);
                    m4Var.U(byteBuffer);
                    byteBuffer.limit(iLimit);
                    i11 = unsignedByte;
                    break;
                default:
                    m4Var.H((OutputStream) obj, iMin);
                    i11 = unsignedByte;
                    break;
            }
            i10 -= iMin;
            this.f6977c -= iMin;
            if (((m4) arrayDeque.peek()).j() == 0) {
                e();
            }
        }
        if (i10 <= 0) {
            return i11;
        }
        throw new AssertionError("Failed executing read operation");
    }

    public final int g(r7.e eVar, int i10, Object obj, int i11) {
        try {
            return f(eVar, i10, obj, i11);
        } catch (IOException e4) {
            throw new AssertionError(e4);
        }
    }

    @Override // g8.m4
    public final int j() {
        return this.f6977c;
    }

    @Override // g8.d, g8.m4
    public final void k() throws IOException {
        ArrayDeque arrayDeque = this.f6976b;
        ArrayDeque arrayDeque2 = this.f6975a;
        if (arrayDeque == null) {
            this.f6976b = new ArrayDeque(Math.min(arrayDeque2.size(), 16));
        }
        while (!this.f6976b.isEmpty()) {
            ((m4) this.f6976b.remove()).close();
        }
        this.f6978d = true;
        m4 m4Var = (m4) arrayDeque2.peek();
        if (m4Var != null) {
            m4Var.k();
        }
    }

    @Override // g8.d, g8.m4
    public final boolean markSupported() {
        Iterator it = this.f6975a.iterator();
        while (it.hasNext()) {
            if (!((m4) it.next()).markSupported()) {
                return false;
            }
        }
        return true;
    }

    @Override // g8.m4
    public final int readUnsignedByte() {
        return g(f6970e, 1, null, 0);
    }

    @Override // g8.d, g8.m4
    public final void reset() {
        if (!this.f6978d) {
            throw new InvalidMarkException();
        }
        ArrayDeque arrayDeque = this.f6975a;
        m4 m4Var = (m4) arrayDeque.peek();
        if (m4Var != null) {
            int iJ = m4Var.j();
            m4Var.reset();
            this.f6977c = (m4Var.j() - iJ) + this.f6977c;
        }
        while (true) {
            m4 m4Var2 = (m4) this.f6976b.pollLast();
            if (m4Var2 == null) {
                return;
            }
            m4Var2.reset();
            arrayDeque.addFirst(m4Var2);
            this.f6977c = m4Var2.j() + this.f6977c;
        }
    }

    @Override // g8.m4
    public final void skipBytes(int i10) {
        g(f6971f, i10, null, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
    
        r1 = r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [g8.m4] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [g8.m4] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [g8.n0] */
    /* JADX WARN: Type inference failed for: r1v3, types: [g8.n0] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    @Override // g8.m4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final m4 t(int i10) throws IOException {
        m4 m4VarT;
        int i11;
        m4 m4VarT2;
        ?? r10;
        ?? r11;
        if (i10 <= 0) {
            return p4.f7038a;
        }
        a(i10);
        this.f6977c -= i10;
        ?? r12 = 0;
        ?? n0Var = 0;
        while (true) {
            ArrayDeque arrayDeque = this.f6975a;
            m4 m4Var = (m4) arrayDeque.peek();
            int iJ = m4Var.j();
            if (iJ > i10) {
                m4VarT2 = m4Var.t(i10);
                i11 = 0;
            } else {
                if (this.f6978d) {
                    m4VarT = m4Var.t(iJ);
                    e();
                } else {
                    m4VarT = (m4) arrayDeque.poll();
                }
                m4 m4Var2 = m4VarT;
                i11 = i10 - iJ;
                m4VarT2 = m4Var2;
            }
            if (r12 == 0) {
                r11 = m4VarT2;
            } else {
                if (n0Var == 0) {
                    n0Var = new n0(i11 != 0 ? Math.min(arrayDeque.size() + 2, 16) : 2);
                    n0Var.b(r12);
                    r12 = n0Var;
                }
                n0Var.b(m4VarT2);
                r11 = r12;
                r10 = n0Var;
            }
            if (i11 <= 0) {
                break;
            }
            r10 = n0Var;
            i10 = i11;
            r12 = r11;
            n0Var = r10;
        }
        return r11;
    }

    public n0() {
        this.f6975a = new ArrayDeque();
    }
}
