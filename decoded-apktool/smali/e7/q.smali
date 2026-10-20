.class public final Le7/q;
.super Ljava/lang/Object;

# interfaces
.implements Lv6/m;


# instance fields
.field public final a:Lj0/b0;

.field public final b:Lx9/v;

.field public final c:Lx9/v;


# direct methods
.method public constructor <init>(Lj0/b0;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le7/q;->a:Lj0/b0;

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

    iput-object v1, p0, Le7/q;->b:Lx9/v;

    iput-object v1, p0, Le7/q;->c:Lx9/v;

    goto :goto_0

    :cond_1
    iput-object v1, p0, Le7/q;->b:Lx9/v;

    iput-object v1, p0, Le7/q;->c:Lx9/v;

    :goto_0
    return-void
.end method


# virtual methods
.method public final a([B[B)V
    .locals 8

    array-length v0, p1

    iget-object v1, p0, Le7/q;->c:Lx9/v;

    const/4 v2, 0x5

    if-le v0, v2, :cond_3

    invoke-static {p1, v2}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    array-length v3, p1

    invoke-static {p1, v2, v3}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object v2

    iget-object v3, p0, Le7/q;->a:Lj0/b0;

    invoke-virtual {v3, v0}, Lj0/b0;->b([B)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lv6/n;

    iget-object v5, v4, Lv6/n;->e:Li7/t1;

    sget-object v6, Li7/t1;->d:Li7/t1;

    invoke-virtual {v5, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    const/4 v5, 0x2

    new-array v5, v5, [[B

    const/4 v6, 0x0

    aput-object p2, v5, v6

    sget-object v6, Le7/r;->b:[B

    const/4 v7, 0x1

    aput-object v6, v5, v7

    invoke-static {v5}, Lz6/a;->u([[B)[B

    move-result-object v5

    goto :goto_1

    :cond_0
    move-object v5, p2

    :goto_1
    :try_start_0
    iget-object v4, v4, Lv6/n;->b:Ljava/lang/Object;

    check-cast v4, Lv6/m;

    invoke-interface {v4, v2, v5}, Lv6/m;->a([B[B)V

    array-length v4, v5

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v4

    sget-object v5, Le7/r;->a:Ljava/util/logging/Logger;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "tag prefix matches a key, but cannot verify: "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v4}, Ljava/util/logging/Logger;->info(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    sget-object v0, Lv6/b;->a:[B

    invoke-virtual {v3, v0}, Lj0/b0;->b([B)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :catch_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lv6/n;

    :try_start_1
    iget-object v2, v2, Lv6/n;->b:Ljava/lang/Object;

    check-cast v2, Lv6/m;

    invoke-interface {v2, p1, p2}, Lv6/m;->a([B[B)V

    array-length v2, p2

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_1
    .catch Ljava/security/GeneralSecurityException; {:try_start_1 .. :try_end_1} :catch_1

    return-void

    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "invalid MAC"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "tag too short"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final b([B)[B
    .locals 7

    iget-object v0, p0, Le7/q;->b:Lx9/v;

    iget-object v1, p0, Le7/q;->a:Lj0/b0;

    iget-object v2, v1, Lj0/b0;->c:Ljava/lang/Object;

    check-cast v2, Lv6/n;

    iget-object v2, v2, Lv6/n;->e:Li7/t1;

    sget-object v3, Li7/t1;->d:Li7/t1;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x2

    if-eqz v2, :cond_0

    new-array v2, v5, [[B

    aput-object p1, v2, v4

    sget-object p1, Le7/r;->b:[B

    aput-object p1, v2, v3

    invoke-static {v2}, Lz6/a;->u([[B)[B

    move-result-object p1

    :cond_0
    :try_start_0
    new-array v2, v5, [[B

    iget-object v5, v1, Lj0/b0;->c:Ljava/lang/Object;

    check-cast v5, Lv6/n;

    iget-object v5, v5, Lv6/n;->c:[B

    if-nez v5, :cond_1

    const/4 v5, 0x0

    goto :goto_0

    :cond_1
    array-length v6, v5

    invoke-static {v5, v6}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v5

    :goto_0
    aput-object v5, v2, v4

    iget-object v4, v1, Lj0/b0;->c:Ljava/lang/Object;

    check-cast v4, Lv6/n;

    iget-object v4, v4, Lv6/n;->b:Ljava/lang/Object;

    check-cast v4, Lv6/m;

    invoke-interface {v4, p1}, Lv6/m;->b([B)[B

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v2}, Lz6/a;->u([[B)[B

    move-result-object v2

    iget-object v1, v1, Lj0/b0;->c:Ljava/lang/Object;

    check-cast v1, Lv6/n;

    iget v1, v1, Lv6/n;->f:I

    array-length p1, p1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v2

    :catch_0
    move-exception p1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    throw p1
.end method
