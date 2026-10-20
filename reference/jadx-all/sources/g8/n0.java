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
        To view partially-correct add '--show-bad-code' argument
    */
    public final g8.m4 t(int r8) throws java.io.IOException {
        /*
            r7 = this;
            if (r8 > 0) goto L5
            g8.o4 r8 = g8.p4.f7038a
            return r8
        L5:
            r7.a(r8)
            int r0 = r7.f6977c
            int r0 = r0 - r8
            r7.f6977c = r0
            r0 = 0
            r1 = r0
        Lf:
            java.util.ArrayDeque r2 = r7.f6975a
            java.lang.Object r3 = r2.peek()
            g8.m4 r3 = (g8.m4) r3
            int r4 = r3.j()
            if (r4 <= r8) goto L23
            g8.m4 r8 = r3.t(r8)
            r3 = 0
            goto L39
        L23:
            boolean r5 = r7.f6978d
            if (r5 == 0) goto L2f
            g8.m4 r3 = r3.t(r4)
            r7.e()
            goto L35
        L2f:
            java.lang.Object r3 = r2.poll()
            g8.m4 r3 = (g8.m4) r3
        L35:
            int r8 = r8 - r4
            r6 = r3
            r3 = r8
            r8 = r6
        L39:
            if (r0 != 0) goto L3d
            r0 = r8
            goto L5a
        L3d:
            if (r1 != 0) goto L57
            g8.n0 r1 = new g8.n0
            r4 = 2
            if (r3 != 0) goto L45
            goto L50
        L45:
            int r2 = r2.size()
            int r2 = r2 + r4
            r4 = 16
            int r4 = java.lang.Math.min(r2, r4)
        L50:
            r1.<init>(r4)
            r1.b(r0)
            r0 = r1
        L57:
            r1.b(r8)
        L5a:
            if (r3 > 0) goto L5d
            return r0
        L5d:
            r8 = r3
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: g8.n0.t(int):g8.m4");
    }

    public n0() {
        this.f6975a = new ArrayDeque();
    }
}
