.class public final Lba/a;
.super Ljava/lang/Object;

# interfaces
.implements Lx9/t;


# static fields
.field public static final a:Lba/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lba/a;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lba/a;->a:Lba/a;

    return-void
.end method


# virtual methods
.method public final a(Lca/f;)Lx9/b0;
    .locals 10

    iget-object v0, p1, Lca/f;->a:Lba/i;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, v0, Lba/i;->v:Z

    if-eqz v1, :cond_3

    iget-boolean v1, v0, Lba/i;->u:Z

    const/4 v2, 0x1

    xor-int/2addr v1, v2

    if-eqz v1, :cond_2

    iget-boolean v1, v0, Lba/i;->t:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    xor-int/2addr v1, v2

    if-eqz v1, :cond_1

    monitor-exit v0

    iget-object v1, v0, Lba/i;->p:Lba/e;

    invoke-static {v1}, Ld7/a;->j(Ljava/lang/Object;)V

    iget-object v9, v0, Lba/i;->a:Lx9/w;

    const-string v3, "client"

    invoke-static {v9, v3}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_1
    iget v4, p1, Lca/f;->f:I

    iget v5, p1, Lca/f;->g:I

    iget v6, p1, Lca/f;->h:I

    iget-boolean v7, v9, Lx9/w;->f:Z

    iget-object v3, p1, Lca/f;->e:Ll/r;

    iget-object v3, v3, Ll/r;->c:Ljava/io/Serializable;

    check-cast v3, Ljava/lang/String;

    const-string v8, "GET"

    invoke-static {v3, v8}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    xor-int/lit8 v8, v3, 0x1

    move-object v3, v1

    invoke-virtual/range {v3 .. v8}, Lba/e;->a(IIIZZ)Lba/k;

    move-result-object v3

    invoke-virtual {v3, v9, p1}, Lba/k;->j(Lx9/w;Lca/f;)Lca/d;

    move-result-object v3
    :try_end_1
    .catch Lba/m; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    new-instance v4, Lba/d;

    iget-object v5, v0, Lba/i;->e:Lx9/n;

    invoke-direct {v4, v0, v5, v1, v3}, Lba/d;-><init>(Lba/i;Lx9/n;Lba/e;Lca/d;)V

    iput-object v4, v0, Lba/i;->s:Lba/d;

    iput-object v4, v0, Lba/i;->x:Lba/d;

    monitor-enter v0

    :try_start_2
    iput-boolean v2, v0, Lba/i;->t:Z

    iput-boolean v2, v0, Lba/i;->u:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v0

    iget-boolean v0, v0, Lba/i;->w:Z

    if-nez v0, :cond_0

    const/4 v0, 0x0

    const/16 v1, 0x3d

    const/4 v2, 0x0

    invoke-static {p1, v2, v4, v0, v1}, Lca/f;->a(Lca/f;ILba/d;Ll/r;I)Lca/f;

    move-result-object v0

    iget-object p1, p1, Lca/f;->e:Ll/r;

    invoke-virtual {v0, p1}, Lca/f;->b(Ll/r;)Lx9/b0;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Canceled"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    goto :goto_1

    :goto_0
    invoke-virtual {v1, p1}, Lba/e;->c(Ljava/io/IOException;)V

    new-instance v0, Lba/m;

    invoke-direct {v0, p1}, Lba/m;-><init>(Ljava/io/IOException;)V

    throw v0

    :goto_1
    iget-object v0, p1, Lba/m;->b:Ljava/io/IOException;

    invoke-virtual {v1, v0}, Lba/e;->c(Ljava/io/IOException;)V

    throw p1

    :cond_1
    :try_start_3
    const-string p1, "Check failed."

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_1
    move-exception p1

    goto :goto_2

    :cond_2
    const-string p1, "Check failed."

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_3
    const-string p1, "released"

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :goto_2
    monitor-exit v0

    throw p1
.end method
