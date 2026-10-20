.class public final Lz9/a;
.super Ljava/lang/Object;

# interfaces
.implements Lx9/t;


# static fields
.field public static final synthetic a:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method


# virtual methods
.method public final a(Lca/f;)Lx9/b0;
    .locals 19

    move-object/from16 v0, p1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    iget-object v1, v0, Lca/f;->e:Ll/r;

    const-string v2, "request"

    invoke-static {v1, v2}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lz9/b;

    const/4 v3, 0x0

    invoke-direct {v2, v1, v3}, Lz9/b;-><init>(Ll/r;Lx9/b0;)V

    invoke-virtual {v1}, Ll/r;->d()Lx9/c;

    move-result-object v4

    iget-boolean v4, v4, Lx9/c;->j:Z

    if-eqz v4, :cond_0

    new-instance v2, Lz9/b;

    invoke-direct {v2, v3, v3}, Lz9/b;-><init>(Ll/r;Lx9/b0;)V

    :cond_0
    iget-object v4, v0, Lca/f;->a:Lba/i;

    instance-of v5, v4, Lba/i;

    if-eqz v5, :cond_1

    move-object v5, v4

    goto :goto_0

    :cond_1
    move-object v5, v3

    :goto_0
    if-eqz v5, :cond_2

    iget-object v5, v5, Lba/i;->e:Lx9/n;

    :cond_2
    const-string v5, "call"

    iget-object v6, v2, Lz9/b;->a:Ll/r;

    iget-object v2, v2, Lz9/b;->b:Lx9/b0;

    if-nez v6, :cond_3

    if-nez v2, :cond_3

    new-instance v0, Lx9/a0;

    invoke-direct {v0}, Lx9/a0;-><init>()V

    iput-object v1, v0, Lx9/a0;->a:Ll/r;

    sget-object v1, Lx9/x;->c:Lx9/x;

    iput-object v1, v0, Lx9/a0;->b:Lx9/x;

    const/16 v1, 0x1f8

    iput v1, v0, Lx9/a0;->c:I

    const-string v1, "Unsatisfiable Request (only-if-cached)"

    iput-object v1, v0, Lx9/a0;->d:Ljava/lang/String;

    sget-object v1, Ly9/b;->c:Lx9/c0;

    iput-object v1, v0, Lx9/a0;->g:Lk4/o;

    const-wide/16 v1, -0x1

    iput-wide v1, v0, Lx9/a0;->k:J

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    iput-wide v1, v0, Lx9/a0;->l:J

    invoke-virtual {v0}, Lx9/a0;->a()Lx9/b0;

    move-result-object v0

    invoke-static {v4, v5}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0

    :cond_3
    const-string v1, "cacheResponse"

    if-nez v6, :cond_4

    invoke-static {v2}, Ld7/a;->j(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lx9/b0;->e()Lx9/a0;

    move-result-object v0

    invoke-static {v2}, Lx9/v;->g(Lx9/b0;)Lx9/b0;

    move-result-object v2

    invoke-static {v1, v2}, Lx9/a0;->b(Ljava/lang/String;Lx9/b0;)V

    iput-object v2, v0, Lx9/a0;->i:Lx9/b0;

    invoke-virtual {v0}, Lx9/a0;->a()Lx9/b0;

    move-result-object v0

    invoke-static {v4, v5}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0

    :cond_4
    if-eqz v2, :cond_5

    invoke-static {v4, v5}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_5
    invoke-virtual {v0, v6}, Lca/f;->b(Ll/r;)Lx9/b0;

    move-result-object v0

    const-string v4, "networkResponse"

    if-eqz v2, :cond_10

    const/16 v5, 0x130

    iget v6, v0, Lx9/b0;->d:I

    if-ne v6, v5, :cond_f

    invoke-virtual {v2}, Lx9/b0;->e()Lx9/a0;

    move-result-object v5

    new-instance v6, Ljava/util/ArrayList;

    const/16 v7, 0x14

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    iget-object v7, v2, Lx9/b0;->f:Lx9/q;

    invoke-virtual {v7}, Lx9/q;->size()I

    move-result v8

    const/4 v10, 0x0

    :goto_1
    const-string v11, "value"

    const-string v12, "name"

    const-string v13, "Content-Type"

    const-string v14, "Content-Encoding"

    const-string v15, "Content-Length"

    iget-object v3, v0, Lx9/b0;->f:Lx9/q;

    if-ge v10, v8, :cond_b

    invoke-virtual {v7, v10}, Lx9/q;->i(I)Ljava/lang/String;

    move-result-object v9

    move/from16 v16, v8

    invoke-virtual {v7, v10}, Lx9/q;->n(I)Ljava/lang/String;

    move-result-object v8

    move-object/from16 v17, v7

    const-string v7, "Warning"

    invoke-static {v7, v9}, Ll9/i;->K0(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_6

    const-string v7, "1"

    move-object/from16 v18, v4

    const/4 v4, 0x0

    invoke-static {v8, v7, v4}, Ll9/i;->h1(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v7

    if-eqz v7, :cond_7

    goto :goto_3

    :cond_6
    move-object/from16 v18, v4

    :cond_7
    invoke-static {v15, v9}, Ll9/i;->K0(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_9

    invoke-static {v14, v9}, Ll9/i;->K0(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_9

    invoke-static {v13, v9}, Ll9/i;->K0(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_8

    goto :goto_2

    :cond_8
    invoke-static {v9}, Lx9/v;->A(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_9

    invoke-virtual {v3, v9}, Lx9/q;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_a

    :cond_9
    :goto_2
    invoke-static {v9, v12}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v8, v11}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {v8}, Ll9/i;->o1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_a
    :goto_3
    add-int/lit8 v10, v10, 0x1

    move/from16 v8, v16

    move-object/from16 v7, v17

    move-object/from16 v4, v18

    const/4 v3, 0x0

    goto :goto_1

    :cond_b
    move-object/from16 v18, v4

    invoke-virtual {v3}, Lx9/q;->size()I

    move-result v4

    const/4 v7, 0x0

    :goto_4
    if-ge v7, v4, :cond_e

    invoke-virtual {v3, v7}, Lx9/q;->i(I)Ljava/lang/String;

    move-result-object v8

    invoke-static {v15, v8}, Ll9/i;->K0(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v9

    if-nez v9, :cond_d

    invoke-static {v14, v8}, Ll9/i;->K0(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v9

    if-nez v9, :cond_d

    invoke-static {v13, v8}, Ll9/i;->K0(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_c

    goto :goto_5

    :cond_c
    invoke-static {v8}, Lx9/v;->A(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_d

    invoke-virtual {v3, v7}, Lx9/q;->n(I)Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v12}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v9, v11}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {v9}, Ll9/i;->o1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_d
    :goto_5
    add-int/lit8 v7, v7, 0x1

    goto :goto_4

    :cond_e
    new-instance v3, Lx9/q;

    const/4 v4, 0x0

    new-array v4, v4, [Ljava/lang/String;

    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v4

    check-cast v4, [Ljava/lang/String;

    invoke-direct {v3, v4}, Lx9/q;-><init>([Ljava/lang/String;)V

    invoke-virtual {v3}, Lx9/q;->k()Lx9/p;

    move-result-object v3

    iput-object v3, v5, Lx9/a0;->f:Lx9/p;

    iget-wide v3, v0, Lx9/b0;->r:J

    iput-wide v3, v5, Lx9/a0;->k:J

    iget-wide v3, v0, Lx9/b0;->s:J

    iput-wide v3, v5, Lx9/a0;->l:J

    invoke-static {v2}, Lx9/v;->g(Lx9/b0;)Lx9/b0;

    move-result-object v2

    invoke-static {v1, v2}, Lx9/a0;->b(Ljava/lang/String;Lx9/b0;)V

    iput-object v2, v5, Lx9/a0;->i:Lx9/b0;

    invoke-static {v0}, Lx9/v;->g(Lx9/b0;)Lx9/b0;

    move-result-object v1

    move-object/from16 v3, v18

    invoke-static {v3, v1}, Lx9/a0;->b(Ljava/lang/String;Lx9/b0;)V

    iput-object v1, v5, Lx9/a0;->h:Lx9/b0;

    invoke-virtual {v5}, Lx9/a0;->a()Lx9/b0;

    iget-object v0, v0, Lx9/b0;->n:Lk4/o;

    invoke-static {v0}, Ld7/a;->j(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lk4/o;->close()V

    const/4 v0, 0x0

    invoke-static {v0}, Ld7/a;->j(Ljava/lang/Object;)V

    throw v0

    :cond_f
    move-object v3, v4

    iget-object v4, v2, Lx9/b0;->n:Lk4/o;

    if-eqz v4, :cond_11

    invoke-static {v4}, Ly9/b;->b(Ljava/io/Closeable;)V

    goto :goto_6

    :cond_10
    move-object v3, v4

    :cond_11
    :goto_6
    invoke-virtual {v0}, Lx9/b0;->e()Lx9/a0;

    move-result-object v4

    invoke-static {v2}, Lx9/v;->g(Lx9/b0;)Lx9/b0;

    move-result-object v2

    invoke-static {v1, v2}, Lx9/a0;->b(Ljava/lang/String;Lx9/b0;)V

    iput-object v2, v4, Lx9/a0;->i:Lx9/b0;

    invoke-static {v0}, Lx9/v;->g(Lx9/b0;)Lx9/b0;

    move-result-object v0

    invoke-static {v3, v0}, Lx9/a0;->b(Ljava/lang/String;Lx9/b0;)V

    iput-object v0, v4, Lx9/a0;->h:Lx9/b0;

    invoke-virtual {v4}, Lx9/a0;->a()Lx9/b0;

    move-result-object v0

    return-object v0
.end method
