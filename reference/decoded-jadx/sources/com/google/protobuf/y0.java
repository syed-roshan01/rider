package com.google.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public abstract class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f4276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f4277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ByteBuffer f4278c;

    static {
        Charset.forName("US-ASCII");
        f4276a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f4277b = bArr;
        f4278c = ByteBuffer.wrap(bArr);
        s.f(bArr, 0, 0, false);
    }

    public static int a(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }
}
