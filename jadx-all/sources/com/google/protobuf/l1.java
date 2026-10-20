package com.google.protobuf;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class l1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j1 f4175b = new j1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r1 f4176a;

    public l1() {
        r1 r1Var;
        r1[] r1VarArr = new r1[2];
        r1VarArr[0] = f0.f4105a;
        try {
            r1Var = (r1) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            r1Var = f4175b;
        }
        r1VarArr[1] = r1Var;
        k1 k1Var = new k1();
        k1Var.f4167a = r1VarArr;
        Charset charset = y0.f4276a;
        this.f4176a = k1Var;
    }
}
