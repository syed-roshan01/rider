package com.google.crypto.tink.shaded.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public abstract class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f3534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f3535b;

    static {
        Charset.forName("US-ASCII");
        f3534a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f3535b = bArr;
        ByteBuffer.wrap(bArr);
        o.f(bArr, 0, 0, false);
    }

    public static int a(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }
}
