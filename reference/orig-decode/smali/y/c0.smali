.class public final Ly/c0;
.super Ljava/lang/Object;


# direct methods
.method public static final a(ILjava/lang/String;)Ly/c;
    .locals 1

    sget-object v0, Ly/j1;->u:Ljava/util/WeakHashMap;

    new-instance v0, Ly/c;

    invoke-direct {v0, p0, p1}, Ly/c;-><init>(ILjava/lang/String;)V

    return-object v0
.end method

.method public static final b(ILjava/lang/String;)Ly/g1;
    .locals 2

    sget-object p0, Ly/j1;->u:Ljava/util/WeakHashMap;

    new-instance p0, Ly/g1;

    new-instance v0, Ly/k0;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1, v1, v1}, Ly/k0;-><init>(IIII)V

    invoke-direct {p0, v0, p1}, Ly/g1;-><init>(Ly/k0;Ljava/lang/String;)V

    return-object p0
.end method

.method public static c(Lm0/m;)Ly/j1;
    .locals 4

    check-cast p0, Lm0/q;

    const v0, -0x5173c916

    invoke-virtual {p0, v0}, Lm0/q;->Z(I)V

    sget-object v0, Lu1/y0;->f:Lm0/m3;

    invoke-virtual {p0, v0}, Lm0/q;->m(Lm0/u1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    sget-object v1, Ly/j1;->u:Ljava/util/WeakHashMap;

    monitor-enter v1

    :try_start_0
    invoke-virtual {v1, v0}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_0

    new-instance v2, Ly/j1;

    invoke-direct {v2, v0}, Ly/j1;-><init>(Landroid/view/View;)V

    invoke-virtual {v1, v0, v2}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    :goto_0
    check-cast v2, Ly/j1;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    new-instance v1, Lu/s;

    const/4 v3, 0x6

    invoke-direct {v1, v3, v2, v0}, Lu/s;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v2, v1, p0}, Lm0/s;->a(Ljava/lang/Object;Lc9/c;Lm0/m;)V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lm0/q;->t(Z)V

    return-object v2

    :goto_1
    monitor-exit v1

    throw p0
.end method
