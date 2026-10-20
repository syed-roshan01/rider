.class public final Lh0/s0;
.super Ljava/lang/Object;

# interfaces
.implements Lf0/k1;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lh0/v0;


# direct methods
.method public synthetic constructor <init>(Lh0/v0;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lh0/s0;->a:I

    iput-object p1, p0, Lh0/s0;->b:Lh0/v0;

    return-void
.end method


# virtual methods
.method public final c()V
    .locals 0

    return-void
.end method

.method public final d()V
    .locals 3

    iget v0, p0, Lh0/s0;->a:I

    const/4 v1, 0x0

    iget-object v2, p0, Lh0/s0;->b:Lh0/v0;

    packed-switch v0, :pswitch_data_0

    invoke-static {v2, v1}, Lh0/v0;->b(Lh0/v0;Lf0/n0;)V

    iget-object v0, v2, Lh0/v0;->p:Lm0/n1;

    invoke-virtual {v0, v1}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Lh0/v0;->p(Z)V

    iput-object v1, v2, Lh0/v0;->m:Ljava/lang/Integer;

    return-void

    :pswitch_0
    invoke-static {v2, v1}, Lh0/v0;->b(Lh0/v0;Lf0/n0;)V

    iget-object v0, v2, Lh0/v0;->p:Lm0/n1;

    invoke-virtual {v0, v1}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final e()V
    .locals 2

    iget v0, p0, Lh0/s0;->a:I

    packed-switch v0, :pswitch_data_0

    return-void

    :pswitch_0
    iget-object v0, p0, Lh0/s0;->b:Lh0/v0;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lh0/v0;->b(Lh0/v0;Lf0/n0;)V

    iget-object v0, v0, Lh0/v0;->p:Lm0/n1;

    invoke-virtual {v0, v1}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final f(J)V
    .locals 12

    iget v0, p0, Lh0/s0;->a:I

    const/4 v1, 0x1

    const/4 v2, 0x0

    iget-object v11, p0, Lh0/s0;->b:Lh0/v0;

    packed-switch v0, :pswitch_data_0

    iget-object v0, v11, Lh0/v0;->o:Lm0/n1;

    invoke-virtual {v0}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf0/n0;

    if-eqz v0, :cond_0

    goto/16 :goto_1

    :cond_0
    sget-object v0, Lf0/n0;->c:Lf0/n0;

    iget-object v3, v11, Lh0/v0;->o:Lm0/n1;

    invoke-virtual {v3, v0}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    const/4 v0, -0x1

    iput v0, v11, Lh0/v0;->q:I

    invoke-virtual {v11}, Lh0/v0;->l()V

    iget-object v0, v11, Lh0/v0;->d:Lf0/c2;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lf0/c2;->d()Lf0/d2;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0, p1, p2}, Lf0/d2;->c(J)Z

    move-result v0

    if-ne v0, v1, :cond_2

    invoke-virtual {v11}, Lh0/v0;->k()Lg2/a0;

    move-result-object v0

    iget-object v0, v0, Lg2/a0;->a:La2/e;

    iget-object v0, v0, La2/e;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v11, v2}, Lh0/v0;->h(Z)V

    invoke-virtual {v11}, Lh0/v0;->k()Lg2/a0;

    move-result-object v0

    sget-wide v1, La2/b0;->b:J

    const/4 v3, 0x5

    const/4 v4, 0x0

    invoke-static {v0, v4, v1, v2, v3}, Lg2/a0;->a(Lg2/a0;La2/e;JI)Lg2/a0;

    move-result-object v4

    const/4 v7, 0x1

    const/4 v8, 0x0

    sget-object v9, Lh0/r;->d:Lb0/l0;

    const/4 v10, 0x1

    move-object v3, v11

    move-wide v5, p1

    invoke-static/range {v3 .. v10}, Lh0/v0;->c(Lh0/v0;Lg2/a0;JZZLh0/s;Z)J

    move-result-wide v0

    const/16 v2, 0x20

    shr-long/2addr v0, v2

    long-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, v11, Lh0/v0;->m:Ljava/lang/Integer;

    goto :goto_0

    :cond_2
    iget-object v0, v11, Lh0/v0;->d:Lf0/c2;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lf0/c2;->d()Lf0/d2;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {v0, p1, p2, v1}, Lf0/d2;->b(JZ)I

    move-result v0

    iget-object v1, v11, Lh0/v0;->b:Lg2/s;

    invoke-interface {v1, v0}, Lg2/s;->a(I)I

    move-result v0

    invoke-virtual {v11}, Lh0/v0;->k()Lg2/a0;

    move-result-object v1

    iget-object v1, v1, Lg2/a0;->a:La2/e;

    invoke-static {v0, v0}, Lo1/s;->g(II)J

    move-result-wide v3

    invoke-static {v1, v3, v4}, Lh0/v0;->e(La2/e;J)Lg2/a0;

    move-result-object v0

    invoke-virtual {v11, v2}, Lh0/v0;->h(Z)V

    sget-object v1, Lf0/o0;->c:Lf0/o0;

    invoke-virtual {v11, v1}, Lh0/v0;->n(Lf0/o0;)V

    iget-object v1, v11, Lh0/v0;->i:Lk1/a;

    if-eqz v1, :cond_3

    check-cast v1, Lk1/c;

    sget v2, Lf6/a;->x:I

    invoke-virtual {v1, v2}, Lk1/c;->a(I)V

    :cond_3
    iget-object v1, v11, Lh0/v0;->c:Lc9/c;

    invoke-interface {v1, v0}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    :goto_0
    iput-wide p1, v11, Lh0/v0;->l:J

    new-instance v0, Ld1/c;

    invoke-direct {v0, p1, p2}, Ld1/c;-><init>(J)V

    iget-object p1, v11, Lh0/v0;->p:Lm0/n1;

    invoke-virtual {p1, v0}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    sget-wide p1, Ld1/c;->b:J

    iput-wide p1, v11, Lh0/v0;->n:J

    :goto_1
    return-void

    :pswitch_0
    invoke-virtual {v11, v1}, Lh0/v0;->j(Z)J

    move-result-wide p1

    sget v0, Lh0/d0;->a:F

    invoke-static {p1, p2}, Ld1/c;->d(J)F

    move-result v0

    invoke-static {p1, p2}, Ld1/c;->e(J)F

    move-result p1

    const/high16 p2, 0x3f800000    # 1.0f

    sub-float/2addr p1, p2

    invoke-static {v0, p1}, Ld9/i;->f(FF)J

    move-result-wide p1

    iget-object v0, v11, Lh0/v0;->d:Lf0/c2;

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Lf0/c2;->d()Lf0/d2;

    move-result-object v0

    if-nez v0, :cond_5

    goto :goto_2

    :cond_5
    invoke-virtual {v0, p1, p2}, Lf0/d2;->e(J)J

    move-result-wide p1

    iput-wide p1, v11, Lh0/v0;->l:J

    new-instance v0, Ld1/c;

    invoke-direct {v0, p1, p2}, Ld1/c;-><init>(J)V

    iget-object p1, v11, Lh0/v0;->p:Lm0/n1;

    invoke-virtual {p1, v0}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    sget-wide p1, Ld1/c;->b:J

    iput-wide p1, v11, Lh0/v0;->n:J

    sget-object p1, Lf0/n0;->a:Lf0/n0;

    iget-object p2, v11, Lh0/v0;->o:Lm0/n1;

    invoke-virtual {p2, p1}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    invoke-virtual {v11, v2}, Lh0/v0;->p(Z)V

    :cond_6
    :goto_2
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final g()V
    .locals 0

    return-void
.end method

.method public final h(J)V
    .locals 11

    const/4 v0, 0x1

    iget v1, p0, Lh0/s0;->a:I

    iget-object v10, p0, Lh0/s0;->b:Lh0/v0;

    packed-switch v1, :pswitch_data_0

    invoke-virtual {v10}, Lh0/v0;->k()Lg2/a0;

    move-result-object v1

    iget-object v1, v1, Lg2/a0;->a:La2/e;

    iget-object v1, v1, La2/e;->a:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_0

    goto/16 :goto_2

    :cond_0
    iget-wide v1, v10, Lh0/v0;->n:J

    invoke-static {v1, v2, p1, p2}, Ld1/c;->g(JJ)J

    move-result-wide p1

    iput-wide p1, v10, Lh0/v0;->n:J

    iget-object p1, v10, Lh0/v0;->d:Lf0/c2;

    const/4 p2, 0x0

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Lf0/c2;->d()Lf0/d2;

    move-result-object p1

    if-eqz p1, :cond_5

    iget-wide v1, v10, Lh0/v0;->l:J

    iget-wide v3, v10, Lh0/v0;->n:J

    invoke-static {v1, v2, v3, v4}, Ld1/c;->g(JJ)J

    move-result-wide v1

    new-instance v3, Ld1/c;

    invoke-direct {v3, v1, v2}, Ld1/c;-><init>(J)V

    iget-object v1, v10, Lh0/v0;->p:Lm0/n1;

    invoke-virtual {v1, v3}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    iget-object v1, v10, Lh0/v0;->m:Ljava/lang/Integer;

    sget-object v8, Lh0/r;->d:Lb0/l0;

    if-nez v1, :cond_2

    invoke-virtual {v10}, Lh0/v0;->i()Ld1/c;

    move-result-object v1

    invoke-static {v1}, Ld7/a;->j(Ljava/lang/Object;)V

    iget-wide v1, v1, Ld1/c;->a:J

    invoke-virtual {p1, v1, v2}, Lf0/d2;->c(J)Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, v10, Lh0/v0;->b:Lg2/s;

    iget-wide v2, v10, Lh0/v0;->l:J

    invoke-virtual {p1, v2, v3, v0}, Lf0/d2;->b(JZ)I

    move-result v2

    invoke-interface {v1, v2}, Lg2/s;->a(I)I

    move-result v1

    iget-object v2, v10, Lh0/v0;->b:Lg2/s;

    invoke-virtual {v10}, Lh0/v0;->i()Ld1/c;

    move-result-object v3

    invoke-static {v3}, Ld7/a;->j(Ljava/lang/Object;)V

    iget-wide v3, v3, Ld1/c;->a:J

    invoke-virtual {p1, v3, v4, v0}, Lf0/d2;->b(JZ)I

    move-result p1

    invoke-interface {v2, p1}, Lg2/s;->a(I)I

    move-result p1

    if-ne v1, p1, :cond_1

    sget-object p1, Lh0/r;->a:Lb0/l0;

    move-object v8, p1

    :cond_1
    invoke-virtual {v10}, Lh0/v0;->k()Lg2/a0;

    move-result-object v3

    invoke-virtual {v10}, Lh0/v0;->i()Ld1/c;

    move-result-object p1

    invoke-static {p1}, Ld7/a;->j(Ljava/lang/Object;)V

    iget-wide v4, p1, Ld1/c;->a:J

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x1

    move-object v2, v10

    invoke-static/range {v2 .. v9}, Lh0/v0;->c(Lh0/v0;Lg2/a0;JZZLh0/s;Z)J

    goto :goto_1

    :cond_2
    iget-object v0, v10, Lh0/v0;->m:Ljava/lang/Integer;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_0

    :cond_3
    iget-wide v0, v10, Lh0/v0;->l:J

    invoke-virtual {p1, v0, v1, p2}, Lf0/d2;->b(JZ)I

    move-result v0

    :goto_0
    invoke-virtual {v10}, Lh0/v0;->i()Ld1/c;

    move-result-object v1

    invoke-static {v1}, Ld7/a;->j(Ljava/lang/Object;)V

    iget-wide v1, v1, Ld1/c;->a:J

    invoke-virtual {p1, v1, v2, p2}, Lf0/d2;->b(JZ)I

    move-result p1

    iget-object v1, v10, Lh0/v0;->m:Ljava/lang/Integer;

    if-nez v1, :cond_4

    if-ne v0, p1, :cond_4

    goto :goto_2

    :cond_4
    invoke-virtual {v10}, Lh0/v0;->k()Lg2/a0;

    move-result-object v3

    invoke-virtual {v10}, Lh0/v0;->i()Ld1/c;

    move-result-object p1

    invoke-static {p1}, Ld7/a;->j(Ljava/lang/Object;)V

    iget-wide v4, p1, Ld1/c;->a:J

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x1

    move-object v2, v10

    invoke-static/range {v2 .. v9}, Lh0/v0;->c(Lh0/v0;Lg2/a0;JZZLh0/s;Z)J

    :goto_1
    sget p1, La2/b0;->c:I

    :cond_5
    invoke-virtual {v10, p2}, Lh0/v0;->p(Z)V

    :goto_2
    return-void

    :pswitch_0
    iget-wide v1, v10, Lh0/v0;->n:J

    invoke-static {v1, v2, p1, p2}, Ld1/c;->g(JJ)J

    move-result-wide p1

    iput-wide p1, v10, Lh0/v0;->n:J

    iget-object p1, v10, Lh0/v0;->d:Lf0/c2;

    if-eqz p1, :cond_9

    invoke-virtual {p1}, Lf0/c2;->d()Lf0/d2;

    move-result-object p1

    if-eqz p1, :cond_9

    iget-wide v1, v10, Lh0/v0;->l:J

    iget-wide v3, v10, Lh0/v0;->n:J

    invoke-static {v1, v2, v3, v4}, Ld1/c;->g(JJ)J

    move-result-wide v1

    new-instance p2, Ld1/c;

    invoke-direct {p2, v1, v2}, Ld1/c;-><init>(J)V

    iget-object v1, v10, Lh0/v0;->p:Lm0/n1;

    invoke-virtual {v1, p2}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    iget-object p2, v10, Lh0/v0;->b:Lg2/s;

    invoke-virtual {v10}, Lh0/v0;->i()Ld1/c;

    move-result-object v1

    invoke-static {v1}, Ld7/a;->j(Ljava/lang/Object;)V

    iget-wide v1, v1, Ld1/c;->a:J

    invoke-virtual {p1, v1, v2, v0}, Lf0/d2;->b(JZ)I

    move-result p1

    invoke-interface {p2, p1}, Lg2/s;->a(I)I

    move-result p1

    invoke-static {p1, p1}, Lo1/s;->g(II)J

    move-result-wide p1

    invoke-virtual {v10}, Lh0/v0;->k()Lg2/a0;

    move-result-object v0

    iget-wide v0, v0, Lg2/a0;->b:J

    invoke-static {p1, p2, v0, v1}, La2/b0;->a(JJ)Z

    move-result v0

    if-eqz v0, :cond_6

    goto :goto_4

    :cond_6
    iget-object v0, v10, Lh0/v0;->d:Lf0/c2;

    if-eqz v0, :cond_7

    iget-object v0, v0, Lf0/c2;->q:Lm0/n1;

    invoke-virtual {v0}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_7

    goto :goto_3

    :cond_7
    iget-object v0, v10, Lh0/v0;->i:Lk1/a;

    if-eqz v0, :cond_8

    check-cast v0, Lk1/c;

    sget v1, Lf6/a;->x:I

    invoke-virtual {v0, v1}, Lk1/c;->a(I)V

    :cond_8
    :goto_3
    iget-object v0, v10, Lh0/v0;->c:Lc9/c;

    invoke-virtual {v10}, Lh0/v0;->k()Lg2/a0;

    move-result-object v1

    iget-object v1, v1, Lg2/a0;->a:La2/e;

    invoke-static {v1, p1, p2}, Lh0/v0;->e(La2/e;J)Lg2/a0;

    move-result-object p1

    invoke-interface {v0, p1}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_9
    :goto_4
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
