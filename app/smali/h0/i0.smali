.class public final Lh0/i0;
.super Ljava/lang/Object;

# interfaces
.implements Lp9/g;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lh0/i0;->a:I

    iput-object p2, p0, Lh0/i0;->c:Ljava/lang/Object;

    iput-object p3, p0, Lh0/i0;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final b(ILu8/e;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p2, Lp9/j0;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lp9/j0;

    iget v1, v0, Lp9/j0;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lp9/j0;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lp9/j0;

    invoke-direct {v0, p0, p2}, Lp9/j0;-><init>(Lh0/i0;Lu8/e;)V

    :goto_0
    iget-object p2, v0, Lp9/j0;->a:Ljava/lang/Object;

    sget-object v1, Lv8/a;->a:Lv8/a;

    iget v2, v0, Lp9/j0;->c:I

    sget-object v3, Lq8/l;->a:Lq8/l;

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    invoke-static {p2}, Ld7/t;->v0(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Ld7/t;->v0(Ljava/lang/Object;)V

    if-lez p1, :cond_3

    iget-object p1, p0, Lh0/i0;->c:Ljava/lang/Object;

    move-object p2, p1

    check-cast p2, Ld9/q;

    iget-boolean p2, p2, Ld9/q;->a:Z

    if-nez p2, :cond_3

    check-cast p1, Ld9/q;

    iput-boolean v4, p1, Ld9/q;->a:Z

    iget-object p1, p0, Lh0/i0;->b:Ljava/lang/Object;

    check-cast p1, Lp9/g;

    sget-object p2, Lp9/f0;->a:Lp9/f0;

    iput v4, v0, Lp9/j0;->c:I

    invoke-interface {p1, p2, v0}, Lp9/g;->emit(Ljava/lang/Object;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    return-object v3
.end method

.method public final emit(Ljava/lang/Object;Lu8/e;)Ljava/lang/Object;
    .locals 11

    sget-object v0, Lq8/l;->a:Lq8/l;

    const/4 v1, 0x0

    const/4 v2, 0x3

    iget v3, p0, Lh0/i0;->a:I

    const/4 v4, 0x0

    iget-object v5, p0, Lh0/i0;->c:Ljava/lang/Object;

    iget-object v6, p0, Lh0/i0;->b:Ljava/lang/Object;

    packed-switch v3, :pswitch_data_0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {p0, p1, p2}, Lh0/i0;->b(ILu8/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lx/k;

    instance-of p2, p1, Lx/o;

    if-eqz p2, :cond_0

    check-cast v5, Lj0/u;

    check-cast p1, Lx/o;

    check-cast v6, Lm9/d0;

    invoke-virtual {v5, p1, v6}, Lj0/u;->e(Lx/o;Lm9/d0;)V

    goto/16 :goto_5

    :cond_0
    instance-of p2, p1, Lx/p;

    if-eqz p2, :cond_1

    check-cast v5, Lj0/u;

    check-cast p1, Lx/p;

    iget-object p1, p1, Lx/p;->a:Lx/o;

    invoke-virtual {v5, p1}, Lj0/u;->g(Lx/o;)V

    goto/16 :goto_5

    :cond_1
    instance-of p2, p1, Lx/n;

    if-eqz p2, :cond_2

    check-cast v5, Lj0/u;

    check-cast p1, Lx/n;

    iget-object p1, p1, Lx/n;->a:Lx/o;

    invoke-virtual {v5, p1}, Lj0/u;->g(Lx/o;)V

    goto/16 :goto_5

    :cond_2
    check-cast v5, Lj0/u;

    check-cast v6, Lm9/d0;

    iget-object p2, v5, Lj0/u;->a:Lj0/b0;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    instance-of v3, p1, Lx/h;

    if-eqz v3, :cond_3

    iget-object v5, p2, Lj0/b0;->d:Ljava/lang/Object;

    check-cast v5, Ljava/util/List;

    invoke-interface {v5, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    instance-of v5, p1, Lx/i;

    if-eqz v5, :cond_4

    iget-object v5, p2, Lj0/b0;->d:Ljava/lang/Object;

    check-cast v5, Ljava/util/List;

    move-object v7, p1

    check-cast v7, Lx/i;

    iget-object v7, v7, Lx/i;->a:Lx/h;

    invoke-interface {v5, v7}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_4
    instance-of v5, p1, Lx/d;

    if-eqz v5, :cond_5

    iget-object v5, p2, Lj0/b0;->d:Ljava/lang/Object;

    check-cast v5, Ljava/util/List;

    invoke-interface {v5, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_5
    instance-of v5, p1, Lx/e;

    if-eqz v5, :cond_6

    iget-object v5, p2, Lj0/b0;->d:Ljava/lang/Object;

    check-cast v5, Ljava/util/List;

    move-object v7, p1

    check-cast v7, Lx/e;

    iget-object v7, v7, Lx/e;->a:Lx/d;

    invoke-interface {v5, v7}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_6
    instance-of v5, p1, Lx/b;

    if-eqz v5, :cond_7

    iget-object v5, p2, Lj0/b0;->d:Ljava/lang/Object;

    check-cast v5, Ljava/util/List;

    invoke-interface {v5, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_7
    instance-of v5, p1, Lx/c;

    if-eqz v5, :cond_8

    iget-object v5, p2, Lj0/b0;->d:Ljava/lang/Object;

    check-cast v5, Ljava/util/List;

    move-object v7, p1

    check-cast v7, Lx/c;

    iget-object v7, v7, Lx/c;->a:Lx/b;

    invoke-interface {v5, v7}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_8
    instance-of v5, p1, Lx/a;

    if-eqz v5, :cond_13

    iget-object v5, p2, Lj0/b0;->d:Ljava/lang/Object;

    check-cast v5, Ljava/util/List;

    move-object v7, p1

    check-cast v7, Lx/a;

    iget-object v7, v7, Lx/a;->a:Lx/b;

    invoke-interface {v5, v7}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    :goto_0
    iget-object v5, p2, Lj0/b0;->d:Ljava/lang/Object;

    check-cast v5, Ljava/util/List;

    invoke-static {v5}, Lr8/p;->M0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lx/k;

    iget-object v7, p2, Lj0/b0;->e:Ljava/lang/Object;

    check-cast v7, Lx/k;

    invoke-static {v7, v5}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_13

    const/4 v7, 0x2

    if-eqz v5, :cond_f

    if-eqz v3, :cond_9

    iget-object p1, p2, Lj0/b0;->b:Ljava/lang/Object;

    check-cast p1, Lm0/l3;

    invoke-interface {p1}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lj0/h;

    iget p1, p1, Lj0/h;->c:F

    goto :goto_1

    :cond_9
    instance-of v3, p1, Lx/d;

    if-eqz v3, :cond_a

    iget-object p1, p2, Lj0/b0;->b:Ljava/lang/Object;

    check-cast p1, Lm0/l3;

    invoke-interface {p1}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lj0/h;

    iget p1, p1, Lj0/h;->b:F

    goto :goto_1

    :cond_a
    instance-of p1, p1, Lx/b;

    if-eqz p1, :cond_b

    iget-object p1, p2, Lj0/b0;->b:Ljava/lang/Object;

    check-cast p1, Lm0/l3;

    invoke-interface {p1}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lj0/h;

    iget p1, p1, Lj0/h;->a:F

    goto :goto_1

    :cond_b
    const/4 p1, 0x0

    :goto_1
    sget-object v3, Lj0/v;->a:Lt/w1;

    instance-of v3, v5, Lx/h;

    sget-object v8, Lj0/v;->a:Lt/w1;

    if-eqz v3, :cond_c

    goto :goto_2

    :cond_c
    instance-of v3, v5, Lx/d;

    const/16 v9, 0x2d

    if-eqz v3, :cond_d

    new-instance v8, Lt/w1;

    sget-object v3, Lt/d0;->c:Lt/b0;

    invoke-direct {v8, v9, v3, v7}, Lt/w1;-><init>(ILt/a0;I)V

    goto :goto_2

    :cond_d
    instance-of v3, v5, Lx/b;

    if-eqz v3, :cond_e

    new-instance v8, Lt/w1;

    sget-object v3, Lt/d0;->c:Lt/b0;

    invoke-direct {v8, v9, v3, v7}, Lt/w1;-><init>(ILt/a0;I)V

    :cond_e
    :goto_2
    new-instance v3, Lj0/z;

    invoke-direct {v3, p2, p1, v8, v4}, Lj0/z;-><init>(Lj0/b0;FLt/n;Lu8/e;)V

    invoke-static {v6, v4, v1, v3, v2}, Lz6/a;->Q(Lm9/d0;Ln9/d;ILc9/e;I)Lm9/x1;

    goto :goto_4

    :cond_f
    iget-object p1, p2, Lj0/b0;->e:Ljava/lang/Object;

    check-cast p1, Lx/k;

    sget-object v3, Lj0/v;->a:Lt/w1;

    instance-of v3, p1, Lx/h;

    sget-object v8, Lj0/v;->a:Lt/w1;

    if-eqz v3, :cond_10

    goto :goto_3

    :cond_10
    instance-of v3, p1, Lx/d;

    if-eqz v3, :cond_11

    goto :goto_3

    :cond_11
    instance-of p1, p1, Lx/b;

    if-eqz p1, :cond_12

    new-instance v8, Lt/w1;

    sget-object p1, Lt/d0;->c:Lt/b0;

    const/16 v3, 0x96

    invoke-direct {v8, v3, p1, v7}, Lt/w1;-><init>(ILt/a0;I)V

    :cond_12
    :goto_3
    new-instance p1, Lj0/a0;

    invoke-direct {p1, p2, v8, v4}, Lj0/a0;-><init>(Lj0/b0;Lt/n;Lu8/e;)V

    invoke-static {v6, v4, v1, p1, v2}, Lz6/a;->Q(Lm9/d0;Ln9/d;ILc9/e;I)Lm9/x1;

    :goto_4
    iput-object v5, p2, Lj0/b0;->e:Ljava/lang/Object;

    :cond_13
    :goto_5
    return-object v0

    :pswitch_1
    check-cast p1, Ld1/c;

    iget-wide v7, p1, Ld1/c;->a:J

    check-cast v5, Lt/d;

    invoke-virtual {v5}, Lt/d;->d()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ld1/c;

    iget-wide v9, p1, Ld1/c;->a:J

    invoke-static {v9, v10}, Ld9/i;->u(J)Z

    move-result p1

    if-eqz p1, :cond_15

    invoke-static {v7, v8}, Ld9/i;->u(J)Z

    move-result p1

    if-eqz p1, :cond_15

    invoke-virtual {v5}, Lt/d;->d()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ld1/c;

    iget-wide v9, p1, Ld1/c;->a:J

    invoke-static {v9, v10}, Ld1/c;->e(J)F

    move-result p1

    invoke-static {v7, v8}, Ld1/c;->e(J)F

    move-result v3

    cmpg-float p1, p1, v3

    if-nez p1, :cond_14

    goto :goto_6

    :cond_14
    check-cast v6, Lm9/d0;

    new-instance p1, Lh0/h0;

    invoke-direct {p1, v5, v7, v8, v4}, Lh0/h0;-><init>(Lt/d;JLu8/e;)V

    invoke-static {v6, v4, v1, p1, v2}, Lz6/a;->Q(Lm9/d0;Ln9/d;ILc9/e;I)Lm9/x1;

    goto :goto_7

    :cond_15
    :goto_6
    new-instance p1, Ld1/c;

    invoke-direct {p1, v7, v8}, Ld1/c;-><init>(J)V

    invoke-virtual {v5, p1, p2}, Lt/d;->e(Ljava/lang/Object;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lv8/a;->a:Lv8/a;

    if-ne p1, p2, :cond_16

    move-object v0, p1

    :cond_16
    :goto_7
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
