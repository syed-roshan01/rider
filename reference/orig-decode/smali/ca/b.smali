.class public final Lca/b;
.super Ljava/lang/Object;

# interfaces
.implements Lx9/t;


# instance fields
.field public final a:Z


# direct methods
.method public constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lca/b;->a:Z

    return-void
.end method


# virtual methods
.method public final a(Lca/f;)Lx9/b0;
    .locals 17

    move-object/from16 v0, p1

    const-string v1, "Connection"

    const-string v2, "close"

    const-string v3, "call"

    const-string v4, "HTTP "

    iget-object v5, v0, Lca/f;->d:Lba/d;

    invoke-static {v5}, Ld7/a;->j(Ljava/lang/Object;)V

    iget-object v6, v5, Lba/d;->d:Lca/d;

    iget-object v7, v5, Lba/d;->b:Lx9/n;

    iget-object v8, v5, Lba/d;->a:Lba/i;

    iget-object v9, v5, Lba/d;->g:Lba/k;

    iget-object v10, v0, Lca/f;->e:Ll/r;

    iget-object v0, v10, Ll/r;->e:Ljava/lang/Object;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v11

    const/4 v0, 0x1

    const/4 v13, 0x0

    const/4 v14, 0x0

    :try_start_0
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v8, v3}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v6, v10}, Lca/d;->f(Ll/r;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2

    :try_start_1
    iget-object v15, v10, Ll/r;->c:Ljava/io/Serializable;

    check-cast v15, Ljava/lang/String;

    invoke-static {v15}, Lz6/a;->X(Ljava/lang/String;)Z

    invoke-virtual {v8, v5, v0, v14, v13}, Lba/i;->g(Lba/d;ZZLjava/io/IOException;)Ljava/io/IOException;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    :try_start_2
    invoke-interface {v6}, Lca/d;->c()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    move-object v15, v13

    goto :goto_1

    :catch_0
    move-exception v0

    move-object v15, v0

    :try_start_3
    invoke-virtual {v5, v15}, Lba/d;->d(Ljava/io/IOException;)V

    throw v15

    :catch_1
    move-exception v0

    goto :goto_0

    :catch_2
    move-exception v0

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v8, v3}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Lba/d;->d(Ljava/io/IOException;)V

    throw v0
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    :goto_0
    instance-of v15, v0, Lea/a;

    if-nez v15, :cond_b

    iget-boolean v15, v5, Lba/d;->f:Z

    if-eqz v15, :cond_a

    move-object v15, v0

    :goto_1
    :try_start_4
    invoke-virtual {v5, v14}, Lba/d;->c(Z)Lx9/a0;

    move-result-object v0

    invoke-static {v0}, Ld7/a;->j(Ljava/lang/Object;)V

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v8, v3}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v10, v0, Lx9/a0;->a:Ll/r;

    iget-object v13, v9, Lba/k;->e:Lx9/o;

    iput-object v13, v0, Lx9/a0;->e:Lx9/o;

    iput-wide v11, v0, Lx9/a0;->k:J
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_5

    move-object/from16 v16, v15

    :try_start_5
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v14

    iput-wide v14, v0, Lx9/a0;->l:J

    invoke-virtual {v0}, Lx9/a0;->a()Lx9/b0;

    move-result-object v0

    iget v14, v0, Lx9/b0;->d:I

    const/16 v15, 0x64

    if-ne v14, v15, :cond_0

    :goto_2
    const/4 v13, 0x0

    goto :goto_3

    :cond_0
    const/16 v15, 0x66

    if-gt v15, v14, :cond_1

    const/16 v15, 0xc8

    if-ge v14, v15, :cond_1

    goto :goto_2

    :goto_3
    invoke-virtual {v5, v13}, Lba/d;->c(Z)Lx9/a0;

    move-result-object v0

    invoke-static {v0}, Ld7/a;->j(Ljava/lang/Object;)V

    iput-object v10, v0, Lx9/a0;->a:Ll/r;

    iget-object v9, v9, Lba/k;->e:Lx9/o;

    iput-object v9, v0, Lx9/a0;->e:Lx9/o;

    iput-wide v11, v0, Lx9/a0;->k:J

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9

    iput-wide v9, v0, Lx9/a0;->l:J

    invoke-virtual {v0}, Lx9/a0;->a()Lx9/b0;

    move-result-object v0

    iget v14, v0, Lx9/b0;->d:I

    goto :goto_5

    :goto_4
    move-object/from16 v3, p0

    goto/16 :goto_9

    :catch_3
    move-exception v0

    goto :goto_4

    :cond_1
    :goto_5
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v8, v3}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3

    move-object/from16 v3, p0

    :try_start_6
    iget-boolean v7, v3, Lca/b;->a:Z

    if-eqz v7, :cond_2

    const/16 v7, 0x65

    if-ne v14, v7, :cond_2

    invoke-virtual {v0}, Lx9/b0;->e()Lx9/a0;

    move-result-object v0

    sget-object v5, Ly9/b;->c:Lx9/c0;

    iput-object v5, v0, Lx9/a0;->g:Lk4/o;

    invoke-virtual {v0}, Lx9/a0;->a()Lx9/b0;

    move-result-object v0

    goto :goto_6

    :catch_4
    move-exception v0

    goto/16 :goto_9

    :cond_2
    invoke-virtual {v0}, Lx9/b0;->e()Lx9/a0;

    move-result-object v7

    invoke-virtual {v5, v0}, Lba/d;->b(Lx9/b0;)Lx9/c0;

    move-result-object v0

    iput-object v0, v7, Lx9/a0;->g:Lk4/o;

    invoke-virtual {v7}, Lx9/a0;->a()Lx9/b0;

    move-result-object v0

    :goto_6
    iget-object v5, v0, Lx9/b0;->a:Ll/r;

    iget-object v5, v5, Ll/r;->d:Ljava/lang/Object;

    check-cast v5, Lx9/q;

    invoke-virtual {v5, v1}, Lx9/q;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v5}, Ll9/i;->K0(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_3

    invoke-static {v0, v1}, Lx9/b0;->b(Lx9/b0;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Ll9/i;->K0(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_4

    :cond_3
    invoke-interface {v6}, Lca/d;->h()Lba/k;

    move-result-object v1

    invoke-virtual {v1}, Lba/k;->k()V

    :cond_4
    const/16 v1, 0xcc

    if-eq v14, v1, :cond_5

    const/16 v1, 0xcd

    if-ne v14, v1, :cond_8

    :cond_5
    iget-object v1, v0, Lx9/b0;->n:Lk4/o;

    if-eqz v1, :cond_6

    check-cast v1, Lx9/c0;

    iget-wide v1, v1, Lx9/c0;->b:J

    goto :goto_7

    :cond_6
    const-wide/16 v1, -0x1

    :goto_7
    const-wide/16 v5, 0x0

    cmp-long v1, v1, v5

    if-lez v1, :cond_8

    new-instance v1, Ljava/net/ProtocolException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, " had non-zero Content-Length: "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, v0, Lx9/b0;->n:Lk4/o;

    if-eqz v0, :cond_7

    check-cast v0, Lx9/c0;

    iget-wide v4, v0, Lx9/c0;->b:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v13

    goto :goto_8

    :cond_7
    const/4 v13, 0x0

    :goto_8
    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_4

    :cond_8
    return-object v0

    :catch_5
    move-exception v0

    move-object/from16 v3, p0

    move-object/from16 v16, v15

    :goto_9
    if-eqz v16, :cond_9

    move-object/from16 v13, v16

    invoke-static {v13, v0}, Ld7/a;->c(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    throw v13

    :cond_9
    throw v0

    :cond_a
    move-object/from16 v3, p0

    throw v0

    :cond_b
    move-object/from16 v3, p0

    throw v0
.end method
