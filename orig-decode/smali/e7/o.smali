.class public abstract Le7/o;
.super Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Le7/j;

    invoke-direct {v0}, Le7/j;-><init>()V

    sget v0, Li7/u1;->CONFIG_NAME_FIELD_NUMBER:I

    :try_start_0
    invoke-static {}, Le7/o;->a()V
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/ExceptionInInitializerError;

    invoke-direct {v1, v0}, Ljava/lang/ExceptionInInitializerError;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public static a()V
    .locals 8

    sget-object v0, Le7/r;->c:Le7/r;

    invoke-static {v0}, Lv6/q;->h(Lv6/p;)V

    sget-object v0, Le7/h;->a:Le7/h;

    invoke-static {v0}, Lv6/q;->h(Lv6/p;)V

    new-instance v0, Le7/j;

    invoke-direct {v0}, Le7/j;-><init>()V

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lv6/q;->f(Ld7/f;Z)V

    sget-object v0, Le7/n;->a:Ld7/m;

    sget-object v0, Ld7/k;->b:Ld7/k;

    sget-object v2, Le7/n;->a:Ld7/m;

    invoke-virtual {v0, v2}, Ld7/k;->e(Ld7/m;)V

    sget-object v2, Le7/n;->b:Ld7/l;

    invoke-virtual {v0, v2}, Ld7/k;->d(Ld7/l;)V

    sget-object v2, Le7/n;->c:Ld7/d;

    invoke-virtual {v0, v2}, Ld7/k;->c(Ld7/d;)V

    sget-object v2, Le7/n;->d:Ld7/b;

    invoke-virtual {v0, v2}, Ld7/k;->b(Ld7/b;)V

    sget-object v2, Ld7/j;->b:Ld7/j;

    sget-object v3, Le7/j;->d:Ld7/n;

    invoke-virtual {v2, v3}, Ld7/j;->b(Ld7/n;)V

    sget-object v3, La7/b;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v3

    if-eqz v3, :cond_0

    return-void

    :cond_0
    new-instance v3, Le7/b;

    new-array v4, v1, [Ld7/p;

    new-instance v5, Lw6/f;

    const-class v6, Lv6/m;

    const/16 v7, 0xa

    invoke-direct {v5, v6, v7}, Lw6/f;-><init>(Ljava/lang/Class;I)V

    const/4 v6, 0x0

    aput-object v5, v4, v6

    const-class v5, Li7/b;

    invoke-direct {v3, v5, v4}, Ld7/f;-><init>(Ljava/lang/Class;[Ld7/p;)V

    invoke-static {v3, v1}, Lv6/q;->f(Ld7/f;Z)V

    sget-object v1, Le7/e;->a:Ld7/m;

    invoke-virtual {v0, v1}, Ld7/k;->e(Ld7/m;)V

    sget-object v1, Le7/e;->b:Ld7/l;

    invoke-virtual {v0, v1}, Ld7/k;->d(Ld7/l;)V

    sget-object v1, Le7/e;->c:Ld7/d;

    invoke-virtual {v0, v1}, Ld7/k;->c(Ld7/d;)V

    sget-object v1, Le7/e;->d:Ld7/b;

    invoke-virtual {v0, v1}, Ld7/k;->b(Ld7/b;)V

    sget-object v0, Le7/b;->d:Ld7/n;

    invoke-virtual {v2, v0}, Ld7/j;->b(Ld7/n;)V

    return-void
.end method
