.class public abstract Lw6/a;
.super Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lw6/h;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lw6/h;-><init>(I)V

    new-instance v0, Lw6/h;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lw6/h;-><init>(I)V

    new-instance v0, Lw6/h;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lw6/h;-><init>(I)V

    new-instance v0, Lw6/h;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lw6/h;-><init>(I)V

    new-instance v0, Lw6/h;

    const/4 v1, 0x6

    invoke-direct {v0, v1}, Lw6/h;-><init>(I)V

    new-instance v0, Lw6/h;

    const/4 v1, 0x7

    invoke-direct {v0, v1}, Lw6/h;-><init>(I)V

    new-instance v0, Lw6/h;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Lw6/h;-><init>(I)V

    new-instance v0, Lw6/h;

    const/16 v1, 0x8

    invoke-direct {v0, v1}, Lw6/h;-><init>(I)V

    sget v0, Li7/u1;->CONFIG_NAME_FIELD_NUMBER:I

    :try_start_0
    invoke-static {}, Lw6/a;->a()V
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
    .locals 4

    sget-object v0, Lw6/e;->b:Lw6/e;

    invoke-static {v0}, Lv6/q;->h(Lv6/p;)V

    invoke-static {}, Le7/o;->a()V

    new-instance v0, Lw6/h;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lw6/h;-><init>(I)V

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lv6/q;->f(Ld7/f;Z)V

    new-instance v0, Lw6/h;

    const/4 v2, 0x3

    invoke-direct {v0, v2}, Lw6/h;-><init>(I)V

    invoke-static {v0, v1}, Lv6/q;->f(Ld7/f;Z)V

    sget-object v0, Lw6/p;->a:Ld7/m;

    sget-object v0, Ld7/k;->b:Ld7/k;

    sget-object v2, Lw6/p;->a:Ld7/m;

    invoke-virtual {v0, v2}, Ld7/k;->e(Ld7/m;)V

    sget-object v2, Lw6/p;->b:Ld7/l;

    invoke-virtual {v0, v2}, Ld7/k;->d(Ld7/l;)V

    sget-object v2, Lw6/p;->c:Ld7/d;

    invoke-virtual {v0, v2}, Ld7/k;->c(Ld7/d;)V

    sget-object v2, Lw6/p;->d:Ld7/b;

    invoke-virtual {v0, v2}, Ld7/k;->b(Ld7/b;)V

    sget-object v2, La7/b;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v2

    if-eqz v2, :cond_0

    return-void

    :cond_0
    new-instance v2, Lw6/h;

    const/4 v3, 0x2

    invoke-direct {v2, v3}, Lw6/h;-><init>(I)V

    invoke-static {v2, v1}, Lv6/q;->f(Ld7/f;Z)V

    sget-object v2, Lw6/l;->a:Ld7/m;

    invoke-virtual {v0, v2}, Ld7/k;->e(Ld7/m;)V

    sget-object v2, Lw6/l;->b:Ld7/l;

    invoke-virtual {v0, v2}, Ld7/k;->d(Ld7/l;)V

    sget-object v2, Lw6/l;->c:Ld7/d;

    invoke-virtual {v0, v2}, Ld7/k;->c(Ld7/d;)V

    sget-object v2, Lw6/l;->d:Ld7/b;

    invoke-virtual {v0, v2}, Ld7/k;->b(Ld7/b;)V

    :try_start_0
    const-string v2, "AES/GCM-SIV/NoPadding"

    invoke-static {v2}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljavax/crypto/NoSuchPaddingException; {:try_start_0 .. :try_end_0} :catch_0

    new-instance v2, Lw6/h;

    const/4 v3, 0x4

    invoke-direct {v2, v3}, Lw6/h;-><init>(I)V

    invoke-static {v2, v1}, Lv6/q;->f(Ld7/f;Z)V

    sget-object v2, Lw6/u;->a:Ld7/m;

    invoke-virtual {v0, v2}, Ld7/k;->e(Ld7/m;)V

    sget-object v2, Lw6/u;->b:Ld7/l;

    invoke-virtual {v0, v2}, Ld7/k;->d(Ld7/l;)V

    sget-object v2, Lw6/u;->c:Ld7/d;

    invoke-virtual {v0, v2}, Ld7/k;->c(Ld7/d;)V

    sget-object v2, Lw6/u;->d:Ld7/b;

    invoke-virtual {v0, v2}, Ld7/k;->b(Ld7/b;)V

    :catch_0
    new-instance v0, Lw6/h;

    const/4 v2, 0x5

    invoke-direct {v0, v2}, Lw6/h;-><init>(I)V

    invoke-static {v0, v1}, Lv6/q;->f(Ld7/f;Z)V

    sget-object v0, Lw6/y;->a:Ld7/m;

    sget-object v0, Ld7/k;->b:Ld7/k;

    sget-object v2, Lw6/y;->a:Ld7/m;

    invoke-virtual {v0, v2}, Ld7/k;->e(Ld7/m;)V

    sget-object v2, Lw6/y;->b:Ld7/l;

    invoke-virtual {v0, v2}, Ld7/k;->d(Ld7/l;)V

    sget-object v2, Lw6/y;->c:Ld7/d;

    invoke-virtual {v0, v2}, Ld7/k;->c(Ld7/d;)V

    sget-object v2, Lw6/y;->d:Ld7/b;

    invoke-virtual {v0, v2}, Ld7/k;->b(Ld7/b;)V

    new-instance v2, Lw6/h;

    const/4 v3, 0x6

    invoke-direct {v2, v3}, Lw6/h;-><init>(I)V

    invoke-static {v2, v1}, Lv6/q;->f(Ld7/f;Z)V

    new-instance v2, Lw6/h;

    const/4 v3, 0x7

    invoke-direct {v2, v3}, Lw6/h;-><init>(I)V

    invoke-static {v2, v1}, Lv6/q;->f(Ld7/f;Z)V

    new-instance v2, Lw6/h;

    const/16 v3, 0x8

    invoke-direct {v2, v3}, Lw6/h;-><init>(I)V

    invoke-static {v2, v1}, Lv6/q;->f(Ld7/f;Z)V

    sget-object v1, Lw6/d0;->a:Ld7/m;

    invoke-virtual {v0, v1}, Ld7/k;->e(Ld7/m;)V

    sget-object v1, Lw6/d0;->b:Ld7/l;

    invoke-virtual {v0, v1}, Ld7/k;->d(Ld7/l;)V

    sget-object v1, Lw6/d0;->c:Ld7/d;

    invoke-virtual {v0, v1}, Ld7/k;->c(Ld7/d;)V

    sget-object v1, Lw6/d0;->d:Ld7/b;

    invoke-virtual {v0, v1}, Ld7/k;->b(Ld7/b;)V

    return-void
.end method
