package com.google.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i3.a0 f4178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f4179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f4180c;

    public m1(d3 d3Var, h3 h3Var, Object obj) {
        i3.a0 a0Var = new i3.a0();
        a0Var.f7941a = d3Var;
        a0Var.f7942b = "";
        a0Var.f7943c = h3Var;
        a0Var.f7944d = obj;
        this.f4178a = a0Var;
        this.f4180c = obj;
    }

    public static int a(i3.a0 a0Var, Object obj, Object obj2) {
        return c0.a((h3) a0Var.f7943c, 2, obj2) + c0.a((h3) a0Var.f7941a, 1, obj);
    }
}
