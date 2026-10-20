.class public final Lt/a;
.super Ld9/j;

# interfaces
.implements Lc9/c;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    iput p5, p0, Lt/a;->a:I

    iput-object p1, p0, Lt/a;->b:Ljava/lang/Object;

    iput-object p2, p0, Lt/a;->c:Ljava/lang/Object;

    iput-object p3, p0, Lt/a;->d:Ljava/lang/Object;

    iput-object p4, p0, Lt/a;->e:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lt/m;)V
    .locals 6

    iget v0, p0, Lt/a;->a:I

    iget-object v1, p0, Lt/a;->e:Ljava/lang/Object;

    iget-object v2, p0, Lt/a;->d:Ljava/lang/Object;

    iget-object v3, p0, Lt/a;->c:Ljava/lang/Object;

    iget-object v4, p0, Lt/a;->b:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    iget-object v0, p1, Lt/m;->e:Lm0/n1;

    invoke-virtual {v0}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    check-cast v4, Ld9/r;

    iget v5, v4, Ld9/r;->a:F

    sub-float/2addr v0, v5

    check-cast v3, Lv/r1;

    invoke-interface {v3, v0}, Lv/r1;->a(F)F

    move-result v3

    iget-object v5, p1, Lt/m;->e:Lm0/n1;

    invoke-virtual {v5}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->floatValue()F

    move-result v5

    iput v5, v4, Ld9/r;->a:F

    check-cast v2, Ld9/r;

    iget-object v4, p1, Lt/m;->a:Lt/x1;

    iget-object v4, v4, Lt/x1;->b:Lc9/c;

    iget-object v5, p1, Lt/m;->f:Lt/t;

    invoke-interface {v4, v5}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    move-result v4

    iput v4, v2, Ld9/r;->a:F

    sub-float/2addr v0, v3

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const/high16 v2, 0x3f000000    # 0.5f

    cmpl-float v0, v0, v2

    if-lez v0, :cond_0

    iget-object v0, p1, Lt/m;->i:Lm0/n1;

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, v2}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    iget-object p1, p1, Lt/m;->d:Lc9/a;

    invoke-interface {p1}, Lc9/a;->invoke()Ljava/lang/Object;

    :cond_0
    check-cast v1, Lv/u;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :pswitch_0
    check-cast v4, Lt/d;

    iget-object v0, v4, Lt/d;->c:Lt/o;

    invoke-static {p1, v0}, Lt/e;->t(Lt/m;Lt/o;)V

    iget-object v0, p1, Lt/m;->e:Lm0/n1;

    invoke-virtual {v0}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v4, v5}, Lt/d;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v0}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v5, v0}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, v4, Lt/d;->c:Lt/o;

    iget-object v0, v0, Lt/o;->b:Lm0/n1;

    invoke-virtual {v0, v5}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    check-cast v3, Lt/o;

    iget-object v0, v3, Lt/o;->b:Lm0/n1;

    invoke-virtual {v0, v5}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    check-cast v2, Lc9/c;

    if-eqz v2, :cond_1

    invoke-interface {v2, v4}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    iget-object v0, p1, Lt/m;->i:Lm0/n1;

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, v2}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    iget-object p1, p1, Lt/m;->d:Lc9/a;

    invoke-interface {p1}, Lc9/a;->invoke()Ljava/lang/Object;

    check-cast v1, Ld9/q;

    const/4 p1, 0x1

    iput-boolean p1, v1, Ld9/q;->a:Z

    goto :goto_0

    :cond_2
    check-cast v2, Lc9/c;

    if-eqz v2, :cond_3

    invoke-interface {v2, v4}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    sget-object v0, Lq8/l;->a:Lq8/l;

    iget v1, p0, Lt/a;->a:I

    iget-object v2, p0, Lt/a;->e:Ljava/lang/Object;

    iget-object v3, p0, Lt/a;->d:Ljava/lang/Object;

    iget-object v4, p0, Lt/a;->c:Ljava/lang/Object;

    iget-object v5, p0, Lt/a;->b:Ljava/lang/Object;

    packed-switch v1, :pswitch_data_0

    check-cast p1, Lm0/o0;

    move-object v6, v5

    check-cast v6, Lg2/b0;

    if-eqz v6, :cond_0

    check-cast v4, Lf0/c2;

    invoke-virtual {v4}, Lf0/c2;->b()Z

    move-result p1

    if-eqz p1, :cond_0

    move-object v7, v3

    check-cast v7, Lg2/a0;

    iget-object v8, v4, Lf0/c2;->d:Lg2/j;

    move-object v9, v2

    check-cast v9, Lg2/o;

    iget-object v10, v4, Lf0/c2;->t:Lf0/v;

    iget-object v11, v4, Lf0/c2;->u:Lf0/v;

    invoke-static/range {v6 .. v11}, La/a;->d(Lg2/b0;Lg2/a0;Lg2/j;Lg2/o;Lf0/v;Lf0/v;)Lg2/h0;

    move-result-object p1

    iput-object p1, v4, Lf0/c2;->e:Lg2/h0;

    :cond_0
    new-instance p1, Lf0/q;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    return-object p1

    :pswitch_0
    check-cast p1, Lt/m;

    invoke-virtual {p0, p1}, Lt/a;->a(Lt/m;)V

    return-object v0

    :pswitch_1
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v6

    check-cast v5, Lm0/g1;

    invoke-interface {v5}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lm0/l3;

    if-eqz p1, :cond_1

    invoke-interface {p1}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v8

    goto :goto_0

    :cond_1
    move-wide v8, v6

    :goto_0
    check-cast v4, Lt/p0;

    iget-wide v10, v4, Lt/p0;->c:J

    const-wide/high16 v12, -0x8000000000000000L

    cmp-long p1, v10, v12

    const/4 v1, 0x1

    const/4 v5, 0x0

    iget-object v10, v4, Lt/p0;->a:Lo0/i;

    if-eqz p1, :cond_2

    move-object p1, v3

    check-cast p1, Ld9/r;

    iget p1, p1, Ld9/r;->a:F

    move-object v11, v2

    check-cast v11, Lm9/d0;

    invoke-interface {v11}, Lm9/d0;->q()Lu8/j;

    move-result-object v11

    invoke-static {v11}, Lt/e;->o(Lu8/j;)F

    move-result v11

    cmpg-float p1, p1, v11

    if-nez p1, :cond_2

    goto :goto_1

    :cond_2
    iput-wide v6, v4, Lt/p0;->c:J

    iget p1, v10, Lo0/i;->c:I

    if-lez p1, :cond_4

    iget-object v6, v10, Lo0/i;->a:[Ljava/lang/Object;

    move v7, v5

    :cond_3
    aget-object v11, v6, v7

    check-cast v11, Lt/k0;

    iput-boolean v1, v11, Lt/k0;->n:Z

    add-int/lit8 v7, v7, 0x1

    if-lt v7, p1, :cond_3

    :cond_4
    move-object p1, v3

    check-cast p1, Ld9/r;

    check-cast v2, Lm9/d0;

    invoke-interface {v2}, Lm9/d0;->q()Lu8/j;

    move-result-object v2

    invoke-static {v2}, Lt/e;->o(Lu8/j;)F

    move-result v2

    iput v2, p1, Ld9/r;->a:F

    :goto_1
    check-cast v3, Ld9/r;

    iget p1, v3, Ld9/r;->a:F

    const/4 v2, 0x0

    cmpg-float v2, p1, v2

    if-nez v2, :cond_6

    iget p1, v10, Lo0/i;->c:I

    if-lez p1, :cond_c

    iget-object v2, v10, Lo0/i;->a:[Ljava/lang/Object;

    :cond_5
    aget-object v3, v2, v5

    check-cast v3, Lt/k0;

    iget-object v4, v3, Lt/k0;->e:Lt/l1;

    iget-object v4, v4, Lt/l1;->d:Ljava/lang/Object;

    iget-object v6, v3, Lt/k0;->d:Lm0/n1;

    invoke-virtual {v6, v4}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    iput-boolean v1, v3, Lt/k0;->n:Z

    add-int/lit8 v5, v5, 0x1

    if-lt v5, p1, :cond_5

    goto :goto_3

    :cond_6
    iget-wide v2, v4, Lt/p0;->c:J

    sub-long/2addr v8, v2

    long-to-float v2, v8

    div-float/2addr v2, p1

    float-to-long v2, v2

    iget p1, v10, Lo0/i;->c:I

    if-lez p1, :cond_b

    iget-object v6, v10, Lo0/i;->a:[Ljava/lang/Object;

    move v8, v1

    move v7, v5

    :cond_7
    aget-object v9, v6, v7

    check-cast v9, Lt/k0;

    iget-boolean v10, v9, Lt/k0;->f:Z

    if-nez v10, :cond_9

    iget-object v10, v9, Lt/k0;->p:Lt/p0;

    iget-object v10, v10, Lt/p0;->b:Lm0/n1;

    sget-object v11, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v10, v11}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    iget-boolean v10, v9, Lt/k0;->n:Z

    if-eqz v10, :cond_8

    iput-boolean v5, v9, Lt/k0;->n:Z

    iput-wide v2, v9, Lt/k0;->o:J

    :cond_8
    iget-wide v10, v9, Lt/k0;->o:J

    sub-long v10, v2, v10

    iget-object v12, v9, Lt/k0;->e:Lt/l1;

    invoke-virtual {v12, v10, v11}, Lt/l1;->b(J)Ljava/lang/Object;

    move-result-object v12

    iget-object v13, v9, Lt/k0;->d:Lm0/n1;

    invoke-virtual {v13, v12}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    iget-object v12, v9, Lt/k0;->e:Lt/l1;

    invoke-interface {v12, v10, v11}, Lt/j;->g(J)Z

    move-result v10

    iput-boolean v10, v9, Lt/k0;->f:Z

    :cond_9
    iget-boolean v9, v9, Lt/k0;->f:Z

    if-nez v9, :cond_a

    move v8, v5

    :cond_a
    add-int/lit8 v7, v7, 0x1

    if-lt v7, p1, :cond_7

    goto :goto_2

    :cond_b
    move v8, v1

    :goto_2
    xor-int/lit8 p1, v8, 0x1

    iget-object v1, v4, Lt/p0;->d:Lm0/n1;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v1, p1}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    :cond_c
    :goto_3
    return-object v0

    :pswitch_2
    check-cast p1, Lt/m;

    invoke-virtual {p0, p1}, Lt/a;->a(Lt/m;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
