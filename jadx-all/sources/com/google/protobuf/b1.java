package com.google.protobuf;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class b1 extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Iterator f4063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ByteBuffer f4064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4065c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4066d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4067e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f4068f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public byte[] f4069n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f4070o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f4071p;

    public final boolean a() {
        this.f4066d++;
        Iterator it = this.f4063a;
        if (!it.hasNext()) {
            return false;
        }
        ByteBuffer byteBuffer = (ByteBuffer) it.next();
        this.f4064b = byteBuffer;
        this.f4067e = byteBuffer.position();
        if (this.f4064b.hasArray()) {
            this.f4068f = true;
            this.f4069n = this.f4064b.array();
            this.f4070o = this.f4064b.arrayOffset();
        } else {
            this.f4068f = false;
            this.f4071p = z2.f4286c.j(this.f4064b, z2.f4290g);
            this.f4069n = null;
        }
        return true;
    }

    public final void b(int i10) {
        int i11 = this.f4067e + i10;
        this.f4067e = i11;
        if (i11 == this.f4064b.limit()) {
            a();
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.f4066d == this.f4065c) {
            return -1;
        }
        if (this.f4068f) {
            int i10 = this.f4069n[this.f4067e + this.f4070o] & 255;
            b(1);
            return i10;
        }
        int iE = z2.f4286c.e(((long) this.f4067e) + this.f4071p) & 255;
        b(1);
        return iE;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        if (this.f4066d == this.f4065c) {
            return -1;
        }
        int iLimit = this.f4064b.limit();
        int i12 = this.f4067e;
        int i13 = iLimit - i12;
        if (i11 > i13) {
            i11 = i13;
        }
        if (this.f4068f) {
            System.arraycopy(this.f4069n, i12 + this.f4070o, bArr, i10, i11);
            b(i11);
        } else {
            int iPosition = this.f4064b.position();
            this.f4064b.position(this.f4067e);
            this.f4064b.get(bArr, i10, i11);
            this.f4064b.position(iPosition);
            b(i11);
        }
        return i11;
    }
}
