.class public final Lb0/c;
.super Ld9/j;

# interfaces
.implements Lc9/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lb0/h0;


# direct methods
.method public synthetic constructor <init>(ILb0/h0;)V
    .locals 0

    iput p1, p0, Lb0/c;->a:I

    iput-object p2, p0, Lb0/c;->b:Lb0/h0;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Integer;
    .locals 6

    iget v0, p0, Lb0/c;->a:I

    iget-object v1, p0, Lb0/c;->b:Lb0/h0;

    packed-switch v0, :pswitch_data_0

    iget-object v0, v1, Lb0/h0;->k:Lv/y;

    invoke-virtual {v0}, Lv/y;->b()Z

    move-result v0

    iget-object v2, v1, Lb0/h0;->e:Lb0/a0;

    if-nez v0, :cond_0

    iget-object v0, v2, Lb0/a0;->b:Lm0/l1;

    invoke-virtual {v0}, Lm0/u2;->d()I

    move-result v0

    goto/16 :goto_0

    :cond_0
    iget-object v0, v1, Lb0/h0;->s:Lm0/l1;

    invoke-virtual {v0}, Lm0/u2;->d()I

    move-result v3

    const/4 v4, -0x1

    if-eq v3, v4, :cond_1

    invoke-virtual {v0}, Lm0/u2;->d()I

    move-result v0

    goto :goto_0

    :cond_1
    iget-object v0, v1, Lb0/h0;->b:Lm0/k1;

    invoke-virtual {v0}, Lm0/s2;->d()F

    move-result v3

    const/4 v4, 0x0

    cmpg-float v3, v3, v4

    if-nez v3, :cond_4

    iget-object v0, v2, Lb0/a0;->c:Lm0/k1;

    invoke-virtual {v0}, Lm0/s2;->d()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    iget-object v3, v1, Lb0/h0;->q:Lm2/b;

    sget v4, Lb0/o0;->a:F

    invoke-interface {v3, v4}, Lm2/b;->v(F)F

    move-result v3

    invoke-virtual {v1}, Lb0/h0;->l()I

    move-result v4

    int-to-float v4, v4

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v4, v5

    invoke-static {v3, v4}, Ljava/lang/Math;->min(FF)F

    move-result v3

    invoke-virtual {v1}, Lb0/h0;->l()I

    move-result v4

    int-to-float v4, v4

    div-float/2addr v3, v4

    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    move-result v3

    cmpl-float v0, v0, v3

    if-ltz v0, :cond_3

    iget-object v0, v1, Lb0/h0;->d:Lm0/n1;

    invoke-virtual {v0}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    iget v0, v1, Lb0/h0;->f:I

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    iget v0, v1, Lb0/h0;->f:I

    goto :goto_0

    :cond_3
    iget-object v0, v2, Lb0/a0;->b:Lm0/l1;

    invoke-virtual {v0}, Lm0/u2;->d()I

    move-result v0

    goto :goto_0

    :cond_4
    invoke-virtual {v0}, Lm0/s2;->d()F

    move-result v0

    invoke-virtual {v1}, Lb0/h0;->m()I

    move-result v3

    int-to-float v3, v3

    div-float/2addr v0, v3

    iget-object v2, v2, Lb0/a0;->b:Lm0/l1;

    invoke-virtual {v2}, Lm0/u2;->d()I

    move-result v2

    invoke-static {v0}, Ld7/t;->p0(F)I

    move-result v0

    add-int/2addr v0, v2

    :goto_0
    invoke-virtual {v1, v0}, Lb0/h0;->i(I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, v1, Lb0/h0;->k:Lv/y;

    invoke-virtual {v0}, Lv/y;->b()Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, v1, Lb0/h0;->t:Lm0/l1;

    invoke-virtual {v0}, Lm0/u2;->d()I

    move-result v0

    goto :goto_1

    :cond_5
    iget-object v0, v1, Lb0/h0;->e:Lb0/a0;

    iget-object v0, v0, Lb0/a0;->b:Lm0/l1;

    invoke-virtual {v0}, Lm0/u2;->d()I

    move-result v0

    :goto_1
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :pswitch_1
    invoke-virtual {v1}, Lb0/h0;->k()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :pswitch_2
    invoke-virtual {v1}, Lb0/h0;->k()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lb0/c;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0}, Lb0/c;->a()Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :pswitch_0
    invoke-virtual {p0}, Lb0/c;->a()Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :pswitch_1
    invoke-virtual {p0}, Lb0/c;->a()Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :pswitch_2
    invoke-virtual {p0}, Lb0/c;->a()Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
