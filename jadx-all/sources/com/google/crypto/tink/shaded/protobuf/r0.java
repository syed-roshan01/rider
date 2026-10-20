package com.google.crypto.tink.shaded.protobuf;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class r0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p0 f3612b = new p0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w0 f3613a;

    public r0() {
        w0 w0Var;
        w0[] w0VarArr = new w0[2];
        w0VarArr[0] = y.f3639a;
        try {
            w0Var = (w0) Class.forName("com.google.crypto.tink.shaded.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            w0Var = f3612b;
        }
        w0VarArr[1] = w0Var;
        q0 q0Var = new q0();
        q0Var.f3609a = w0VarArr;
        Charset charset = f0.f3534a;
        this.f3613a = q0Var;
    }
}
