.class public final Lo1/y;
.super Ljava/lang/Object;


# instance fields
.field public final a:Landroidx/compose/ui/node/a;

.field public final b:Lo1/e;

.field public final c:Lk/f;

.field public final d:Lt1/v;

.field public e:Z


# direct methods
.method public constructor <init>(Landroidx/compose/ui/node/a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo1/y;->a:Landroidx/compose/ui/node/a;

    new-instance v0, Lo1/e;

    iget-object p1, p1, Landroidx/compose/ui/node/a;->C:Lt1/x0;

    iget-object p1, p1, Lt1/x0;->b:Lt1/x;

    invoke-direct {v0, p1}, Lo1/e;-><init>(Lt1/x;)V

    iput-object v0, p0, Lo1/y;->b:Lo1/e;

    new-instance p1, Lk/f;

    const/16 v0, 0x8

    invoke-direct {p1, v0}, Lk/f;-><init>(I)V

    iput-object p1, p0, Lo1/y;->c:Lk/f;

    new-instance p1, Lt1/v;

    invoke-direct {p1}, Lt1/v;-><init>()V

    iput-object p1, p0, Lo1/y;->d:Lt1/v;

    return-void
.end method


# virtual methods
.method public final a(Lo1/w;Lo1/b0;Z)I
    .locals 18

    move-object/from16 v1, p0

    iget-object v0, v1, Lo1/y;->d:Lt1/v;

    iget-boolean v2, v1, Lo1/y;->e:Z

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    return v3

    :cond_0
    const/4 v2, 0x1

    :try_start_0
    iput-boolean v2, v1, Lo1/y;->e:Z

    iget-object v4, v1, Lo1/y;->c:Lk/f;

    move-object/from16 v5, p1

    move-object/from16 v6, p2

    invoke-virtual {v4, v5, v6}, Lk/f;->E(Lo1/w;Lo1/b0;)Lo1/f;

    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v5, v4, Lo1/f;->a:Lq/l;

    :try_start_1
    invoke-virtual {v5}, Lq/l;->g()I

    move-result v6

    move v7, v3

    :goto_0
    if-ge v7, v6, :cond_3

    invoke-virtual {v5, v7}, Lq/l;->h(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lo1/u;

    iget-boolean v9, v8, Lo1/u;->d:Z

    if-nez v9, :cond_2

    iget-boolean v8, v8, Lo1/u;->h:Z

    if-eqz v8, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    move v6, v3

    goto :goto_2

    :catchall_0
    move-exception v0

    goto/16 :goto_6

    :cond_3
    move v6, v2

    :goto_2
    invoke-virtual {v5}, Lq/l;->g()I

    move-result v7
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move v8, v3

    :goto_3
    iget-object v9, v1, Lo1/y;->b:Lo1/e;

    if-ge v8, v7, :cond_6

    :try_start_2
    invoke-virtual {v5, v8}, Lq/l;->h(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lo1/u;

    if-nez v6, :cond_4

    invoke-static {v10}, Lm9/e0;->r(Lo1/u;)Z

    move-result v11

    if-eqz v11, :cond_5

    :cond_4
    iget v11, v10, Lo1/u;->i:I

    invoke-static {v11, v2}, Lo1/s;->u(II)Z

    move-result v16

    iget-object v12, v1, Lo1/y;->a:Landroidx/compose/ui/node/a;

    iget-wide v13, v10, Lo1/u;->c:J

    iget-object v15, v1, Lo1/y;->d:Lt1/v;

    const/16 v17, 0x1

    invoke-virtual/range {v12 .. v17}, Landroidx/compose/ui/node/a;->u(JLt1/v;ZZ)V

    invoke-virtual {v0}, Lt1/v;->isEmpty()Z

    move-result v11

    xor-int/2addr v11, v2

    if-eqz v11, :cond_5

    iget-wide v10, v10, Lo1/u;->a:J

    invoke-virtual {v9, v10, v11, v0}, Lo1/e;->a(JLt1/v;)V

    invoke-virtual {v0}, Lt1/v;->clear()V

    :cond_5
    add-int/lit8 v8, v8, 0x1

    goto :goto_3

    :cond_6
    iget-object v0, v9, Lo1/e;->b:Lo1/j;

    invoke-virtual {v0}, Lo1/j;->c()V

    move/from16 v0, p3

    invoke-virtual {v9, v4, v0}, Lo1/e;->b(Lo1/f;Z)Z

    move-result v0

    invoke-virtual {v5}, Lq/l;->g()I

    move-result v4

    move v6, v3

    :goto_4
    if-ge v6, v4, :cond_8

    invoke-virtual {v5, v6}, Lq/l;->h(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lo1/u;

    invoke-static {v7, v2}, Lm9/e0;->I(Lo1/u;Z)J

    move-result-wide v8

    sget-wide v10, Ld1/c;->b:J

    invoke-static {v8, v9, v10, v11}, Ld1/c;->b(JJ)Z

    move-result v8

    xor-int/2addr v8, v2

    if-eqz v8, :cond_7

    invoke-virtual {v7}, Lo1/u;->b()Z

    move-result v7
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v7, :cond_7

    const/4 v2, 0x2

    goto :goto_5

    :cond_7
    add-int/lit8 v6, v6, 0x1

    goto :goto_4

    :cond_8
    move v2, v3

    :goto_5
    or-int/2addr v0, v2

    iput-boolean v3, v1, Lo1/y;->e:Z

    return v0

    :goto_6
    iput-boolean v3, v1, Lo1/y;->e:Z

    throw v0
.end method

.method public final b()V
    .locals 5

    iget-boolean v0, p0, Lo1/y;->e:Z

    if-nez v0, :cond_2

    iget-object v0, p0, Lo1/y;->c:Lk/f;

    iget-object v0, v0, Lk/f;->b:Ljava/lang/Object;

    check-cast v0, Lq/l;

    invoke-virtual {v0}, Lq/l;->a()V

    iget-object v0, p0, Lo1/y;->b:Lo1/e;

    iget-object v0, v0, Lo1/e;->b:Lo1/j;

    iget-object v1, v0, Lo1/j;->a:Lo0/i;

    iget v2, v1, Lo0/i;->c:I

    if-lez v2, :cond_1

    iget-object v1, v1, Lo0/i;->a:[Ljava/lang/Object;

    const/4 v3, 0x0

    :cond_0
    aget-object v4, v1, v3

    check-cast v4, Lo1/i;

    invoke-virtual {v4}, Lo1/i;->d()V

    add-int/lit8 v3, v3, 0x1

    if-lt v3, v2, :cond_0

    :cond_1
    iget-object v0, v0, Lo1/j;->a:Lo0/i;

    invoke-virtual {v0}, Lo0/i;->g()V

    :cond_2
    return-void
.end method
