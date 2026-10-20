.class public final Lr1/n0;
.super Ljava/lang/Object;

# interfaces
.implements Lr1/i0;


# instance fields
.field public final synthetic a:I

.field public final b:Lr1/p;

.field public final c:Ljava/lang/Enum;

.field public final d:Ljava/lang/Enum;


# direct methods
.method public synthetic constructor <init>(Lr1/p;Ljava/lang/Enum;Ljava/lang/Enum;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p4, p0, Lr1/n0;->a:I

    iput-object p1, p0, Lr1/n0;->b:Lr1/p;

    iput-object p2, p0, Lr1/n0;->c:Ljava/lang/Enum;

    iput-object p3, p0, Lr1/n0;->d:Ljava/lang/Enum;

    return-void
.end method


# virtual methods
.method public final Q(I)I
    .locals 2

    iget v0, p0, Lr1/n0;->a:I

    iget-object v1, p0, Lr1/n0;->b:Lr1/p;

    packed-switch v0, :pswitch_data_0

    invoke-interface {v1, p1}, Lr1/p;->Q(I)I

    move-result p1

    return p1

    :pswitch_0
    invoke-interface {v1, p1}, Lr1/p;->Q(I)I

    move-result p1

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final V(I)I
    .locals 2

    iget v0, p0, Lr1/n0;->a:I

    iget-object v1, p0, Lr1/n0;->b:Lr1/p;

    packed-switch v0, :pswitch_data_0

    invoke-interface {v1, p1}, Lr1/p;->V(I)I

    move-result p1

    return p1

    :pswitch_0
    invoke-interface {v1, p1}, Lr1/p;->V(I)I

    move-result p1

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final X(I)I
    .locals 2

    iget v0, p0, Lr1/n0;->a:I

    iget-object v1, p0, Lr1/n0;->b:Lr1/p;

    packed-switch v0, :pswitch_data_0

    invoke-interface {v1, p1}, Lr1/p;->X(I)I

    move-result p1

    return p1

    :pswitch_0
    invoke-interface {v1, p1}, Lr1/p;->X(I)I

    move-result p1

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final a()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lr1/n0;->a:I

    iget-object v1, p0, Lr1/n0;->b:Lr1/p;

    packed-switch v0, :pswitch_data_0

    invoke-interface {v1}, Lr1/p;->a()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_0
    invoke-interface {v1}, Lr1/p;->a()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final f(J)Lr1/x0;
    .locals 7

    iget v0, p0, Lr1/n0;->a:I

    iget-object v1, p0, Lr1/n0;->b:Lr1/p;

    iget-object v2, p0, Lr1/n0;->c:Ljava/lang/Enum;

    const/16 v3, 0x7fff

    iget-object v4, p0, Lr1/n0;->d:Ljava/lang/Enum;

    packed-switch v0, :pswitch_data_0

    check-cast v4, Lt1/e1;

    sget-object v0, Lt1/e1;->a:Lt1/e1;

    sget-object v5, Lt1/d1;->b:Lt1/d1;

    const/4 v6, 0x2

    if-ne v4, v0, :cond_2

    check-cast v2, Lt1/d1;

    if-ne v2, v5, :cond_0

    invoke-static {p1, p2}, Lm2/a;->h(J)I

    move-result v0

    invoke-interface {v1, v0}, Lr1/p;->V(I)I

    move-result v0

    goto :goto_0

    :cond_0
    invoke-static {p1, p2}, Lm2/a;->h(J)I

    move-result v0

    invoke-interface {v1, v0}, Lr1/p;->Q(I)I

    move-result v0

    :goto_0
    invoke-static {p1, p2}, Lm2/a;->d(J)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {p1, p2}, Lm2/a;->h(J)I

    move-result v3

    :cond_1
    new-instance p1, Lr1/n;

    invoke-direct {p1, v0, v3, v6}, Lr1/n;-><init>(III)V

    goto :goto_2

    :cond_2
    check-cast v2, Lt1/d1;

    if-ne v2, v5, :cond_3

    invoke-static {p1, p2}, Lm2/a;->i(J)I

    move-result v0

    invoke-interface {v1, v0}, Lr1/p;->g(I)I

    move-result v0

    goto :goto_1

    :cond_3
    invoke-static {p1, p2}, Lm2/a;->i(J)I

    move-result v0

    invoke-interface {v1, v0}, Lr1/p;->X(I)I

    move-result v0

    :goto_1
    invoke-static {p1, p2}, Lm2/a;->e(J)Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-static {p1, p2}, Lm2/a;->i(J)I

    move-result v3

    :cond_4
    new-instance p1, Lr1/n;

    invoke-direct {p1, v3, v0, v6}, Lr1/n;-><init>(III)V

    :goto_2
    return-object p1

    :pswitch_0
    check-cast v4, Lr1/p0;

    sget-object v0, Lr1/p0;->a:Lr1/p0;

    sget-object v5, Lr1/o0;->b:Lr1/o0;

    const/4 v6, 0x1

    if-ne v4, v0, :cond_7

    check-cast v2, Lr1/o0;

    if-ne v2, v5, :cond_5

    invoke-static {p1, p2}, Lm2/a;->h(J)I

    move-result v0

    invoke-interface {v1, v0}, Lr1/p;->V(I)I

    move-result v0

    goto :goto_3

    :cond_5
    invoke-static {p1, p2}, Lm2/a;->h(J)I

    move-result v0

    invoke-interface {v1, v0}, Lr1/p;->Q(I)I

    move-result v0

    :goto_3
    invoke-static {p1, p2}, Lm2/a;->d(J)Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-static {p1, p2}, Lm2/a;->h(J)I

    move-result v3

    :cond_6
    new-instance p1, Lr1/n;

    invoke-direct {p1, v0, v3, v6}, Lr1/n;-><init>(III)V

    goto :goto_5

    :cond_7
    check-cast v2, Lr1/o0;

    if-ne v2, v5, :cond_8

    invoke-static {p1, p2}, Lm2/a;->i(J)I

    move-result v0

    invoke-interface {v1, v0}, Lr1/p;->g(I)I

    move-result v0

    goto :goto_4

    :cond_8
    invoke-static {p1, p2}, Lm2/a;->i(J)I

    move-result v0

    invoke-interface {v1, v0}, Lr1/p;->X(I)I

    move-result v0

    :goto_4
    invoke-static {p1, p2}, Lm2/a;->e(J)Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-static {p1, p2}, Lm2/a;->i(J)I

    move-result v3

    :cond_9
    new-instance p1, Lr1/n;

    invoke-direct {p1, v3, v0, v6}, Lr1/n;-><init>(III)V

    :goto_5
    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final g(I)I
    .locals 2

    iget v0, p0, Lr1/n0;->a:I

    iget-object v1, p0, Lr1/n0;->b:Lr1/p;

    packed-switch v0, :pswitch_data_0

    invoke-interface {v1, p1}, Lr1/p;->g(I)I

    move-result p1

    return p1

    :pswitch_0
    invoke-interface {v1, p1}, Lr1/p;->g(I)I

    move-result p1

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
