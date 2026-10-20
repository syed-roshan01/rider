.class public final Ls/t;
.super Ld9/j;

# interfaces
.implements Lc9/c;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:J

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(JLy/t0;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Ls/t;->a:I

    iput-wide p1, p0, Ls/t;->b:J

    iput-object p3, p0, Ls/t;->c:Ljava/lang/Object;

    const/4 p1, 0x1

    .line 1
    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method

.method public synthetic constructor <init>(Lr1/x0;J)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Ls/t;->a:I

    iput-object p1, p0, Ls/t;->c:Ljava/lang/Object;

    iput-wide p2, p0, Ls/t;->b:J

    const/4 p1, 0x1

    .line 2
    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    move-object/from16 v0, p0

    sget-object v1, Lq8/l;->a:Lq8/l;

    iget v2, v0, Ls/t;->a:I

    iget-wide v3, v0, Ls/t;->b:J

    iget-object v5, v0, Ls/t;->c:Ljava/lang/Object;

    packed-switch v2, :pswitch_data_0

    move-object/from16 v2, p1

    check-cast v2, Lg1/e;

    invoke-static {v3, v4}, Ld1/f;->d(J)F

    move-result v6

    const/4 v7, 0x0

    cmpl-float v8, v6, v7

    if-lez v8, :cond_2

    sget v8, Lk0/s1;->a:F

    check-cast v2, Lt1/i0;

    invoke-virtual {v2, v8}, Lt1/i0;->v(F)F

    move-result v8

    check-cast v5, Ly/t0;

    invoke-virtual {v2}, Lt1/i0;->getLayoutDirection()Lm2/l;

    move-result-object v9

    invoke-interface {v5, v9}, Ly/t0;->a(Lm2/l;)F

    move-result v5

    invoke-virtual {v2, v5}, Lt1/i0;->v(F)F

    move-result v5

    sub-float/2addr v5, v8

    add-float/2addr v6, v5

    const/4 v9, 0x2

    int-to-float v9, v9

    mul-float/2addr v8, v9

    add-float/2addr v8, v6

    invoke-virtual {v2}, Lt1/i0;->getLayoutDirection()Lm2/l;

    move-result-object v6

    sget-object v10, Lk0/r1;->a:[I

    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    aget v6, v10, v6

    iget-object v11, v2, Lt1/i0;->a:Lg1/c;

    const/4 v12, 0x1

    if-ne v6, v12, :cond_0

    invoke-interface {v11}, Lg1/g;->e()J

    move-result-wide v13

    invoke-static {v13, v14}, Ld1/f;->d(J)F

    move-result v6

    sub-float/2addr v6, v8

    :goto_0
    move v14, v6

    goto :goto_1

    :cond_0
    invoke-static {v5, v7}, Lz6/a;->m(FF)F

    move-result v6

    goto :goto_0

    :goto_1
    invoke-virtual {v2}, Lt1/i0;->getLayoutDirection()Lm2/l;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    aget v6, v10, v6

    if-ne v6, v12, :cond_1

    invoke-interface {v11}, Lg1/g;->e()J

    move-result-wide v12

    invoke-static {v12, v13}, Ld1/f;->d(J)F

    move-result v6

    invoke-static {v5, v7}, Lz6/a;->m(FF)F

    move-result v5

    sub-float v8, v6, v5

    :cond_1
    move/from16 v16, v8

    invoke-static {v3, v4}, Ld1/f;->b(J)F

    move-result v3

    neg-float v4, v3

    div-float v15, v4, v9

    div-float v17, v3, v9

    const/16 v18, 0x0

    iget-object v3, v11, Lg1/c;->b:Lg1/b;

    invoke-virtual {v3}, Lg1/b;->b()J

    move-result-wide v4

    invoke-virtual {v3}, Lg1/b;->a()Le1/p;

    move-result-object v6

    invoke-interface {v6}, Le1/p;->j()V

    iget-object v6, v3, Lg1/b;->a:Lg1/d;

    iget-object v6, v6, Lg1/d;->a:Lg1/b;

    invoke-virtual {v6}, Lg1/b;->a()Le1/p;

    move-result-object v13

    invoke-interface/range {v13 .. v18}, Le1/p;->d(FFFFI)V

    invoke-virtual {v2}, Lt1/i0;->a()V

    invoke-virtual {v3}, Lg1/b;->a()Le1/p;

    move-result-object v2

    invoke-interface {v2}, Le1/p;->h()V

    invoke-virtual {v3, v4, v5}, Lg1/b;->c(J)V

    goto :goto_2

    :cond_2
    check-cast v2, Lt1/i0;

    invoke-virtual {v2}, Lt1/i0;->a()V

    :goto_2
    return-object v1

    :pswitch_0
    move-object/from16 v2, p1

    check-cast v2, Lr1/w0;

    check-cast v5, Lr1/x0;

    invoke-static {v2, v5, v3, v4}, Lr1/w0;->f(Lr1/w0;Lr1/x0;J)V

    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
