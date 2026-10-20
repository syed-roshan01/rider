.class public final Lw6/d;
.super Ljava/lang/Object;

# interfaces
.implements Lv6/a;


# instance fields
.field public final a:Lj0/b0;

.field public final b:Lx9/v;

.field public final c:Lx9/v;


# direct methods
.method public constructor <init>(Lj0/b0;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw6/d;->a:Lj0/b0;

    iget-object v0, p1, Lj0/b0;->e:Ljava/lang/Object;

    check-cast v0, Lg7/a;

    iget-object v0, v0, Lg7/a;->a:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    sget-object v1, Ld7/a;->a:Lx9/v;

    if-eqz v0, :cond_1

    sget-object v0, Ld7/i;->b:Ld7/i;

    iget-object v0, v0, Ld7/i;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ld7/h;

    if-nez v0, :cond_0

    sget-object v0, Ld7/i;->c:Ld7/h;

    :cond_0
    invoke-static {p1}, Ld7/a;->v(Lj0/b0;)V

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object v1, p0, Lw6/d;->b:Lx9/v;

    iput-object v1, p0, Lw6/d;->c:Lx9/v;

    goto :goto_0

    :cond_1
    iput-object v1, p0, Lw6/d;->b:Lx9/v;

    iput-object v1, p0, Lw6/d;->c:Lx9/v;

    :goto_0
    return-void
.end method


# virtual methods
.method public final a([B[B)[B
    .locals 5

    iget-object v0, p0, Lw6/d;->b:Lx9/v;

    iget-object v1, p0, Lw6/d;->a:Lj0/b0;

    const/4 v2, 0x2

    :try_start_0
    new-array v2, v2, [[B

    iget-object v3, v1, Lj0/b0;->c:Ljava/lang/Object;

    check-cast v3, Lv6/n;

    iget-object v3, v3, Lv6/n;->c:[B

    if-nez v3, :cond_0

    const/4 v3, 0x0

    goto :goto_0

    :cond_0
    array-length v4, v3

    invoke-static {v3, v4}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v3

    :goto_0
    const/4 v4, 0x0

    aput-object v3, v2, v4

    iget-object v3, v1, Lj0/b0;->c:Ljava/lang/Object;

    check-cast v3, Lv6/n;

    iget-object v3, v3, Lv6/n;->b:Ljava/lang/Object;

    check-cast v3, Lv6/a;

    invoke-interface {v3, p1, p2}, Lv6/a;->a([B[B)[B

    move-result-object p2

    const/4 v3, 0x1

    aput-object p2, v2, v3

    invoke-static {v2}, Lz6/a;->u([[B)[B

    move-result-object p2

    iget-object v1, v1, Lj0/b0;->c:Ljava/lang/Object;

    check-cast v1, Lv6/n;

    iget v1, v1, Lv6/n;->f:I

    array-length p1, p1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p2

    :catch_0
    move-exception p1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    throw p1
.end method

.method public final b([B[B)[B
    .locals 8

    array-length v0, p1

    iget-object v1, p0, Lw6/d;->a:Lj0/b0;

    iget-object v2, p0, Lw6/d;->c:Lx9/v;

    const/4 v3, 0x5

    if-le v0, v3, :cond_0

    invoke-static {p1, v3}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    array-length v4, p1

    invoke-static {p1, v3, v4}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object v3

    invoke-virtual {v1, v0}, Lj0/b0;->b([B)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lv6/n;

    :try_start_0
    iget-object v4, v4, Lv6/n;->b:Ljava/lang/Object;

    check-cast v4, Lv6/a;

    invoke-interface {v4, v3, p2}, Lv6/a;->b([B[B)[B

    move-result-object v4

    array-length v5, v3

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v4

    :catch_0
    move-exception v4

    sget-object v5, Lw6/e;->a:Ljava/util/logging/Logger;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "ciphertext prefix matches a key, but cannot decrypt: "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v4}, Ljava/util/logging/Logger;->info(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    sget-object v0, Lv6/b;->a:[B

    invoke-virtual {v1, v0}, Lj0/b0;->b([B)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :catch_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lv6/n;

    :try_start_1
    iget-object v1, v1, Lv6/n;->b:Ljava/lang/Object;

    check-cast v1, Lv6/a;

    invoke-interface {v1, p1, p2}, Lv6/a;->b([B[B)[B

    move-result-object v1

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_1
    .catch Ljava/security/GeneralSecurityException; {:try_start_1 .. :try_end_1} :catch_1

    return-object v1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "decryption failed"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
