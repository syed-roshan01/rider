.class public final Lt/e1;
.super Ld9/j;

# interfaces
.implements Lc9/c;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    iput p1, p0, Lt/e1;->a:I

    iput-object p2, p0, Lt/e1;->b:Ljava/lang/Object;

    iput-object p3, p0, Lt/e1;->c:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lm0/o0;)Lm0/n0;
    .locals 3

    iget p1, p0, Lt/e1;->a:I

    iget-object v0, p0, Lt/e1;->c:Ljava/lang/Object;

    iget-object v1, p0, Lt/e1;->b:Ljava/lang/Object;

    packed-switch p1, :pswitch_data_0

    check-cast v1, Lt/u1;

    check-cast v0, Lt/q1;

    iget-object p1, v1, Lt/u1;->h:Lw0/u;

    invoke-virtual {p1, v0}, Lw0/u;->add(Ljava/lang/Object;)Z

    new-instance p1, Lt/r0;

    const/4 v2, 0x3

    invoke-direct {p1, v2, v1, v0}, Lt/r0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    return-object p1

    :pswitch_0
    check-cast v1, Lt/u1;

    check-cast v0, Lt/n1;

    new-instance p1, Lt/r0;

    const/4 v2, 0x2

    invoke-direct {p1, v2, v1, v0}, Lt/r0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    return-object p1

    :pswitch_1
    check-cast v1, Lt/u1;

    check-cast v0, Lt/u1;

    iget-object p1, v1, Lt/u1;->i:Lw0/u;

    invoke-virtual {p1, v0}, Lw0/u;->add(Ljava/lang/Object;)Z

    new-instance p1, Lt/r0;

    const/4 v2, 0x1

    invoke-direct {p1, v2, v1, v0}, Lt/r0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    return-object p1

    :pswitch_2
    check-cast v1, Lt/p0;

    check-cast v0, Lt/k0;

    iget-object p1, v1, Lt/p0;->a:Lo0/i;

    invoke-virtual {p1, v0}, Lo0/i;->c(Ljava/lang/Object;)V

    iget-object p1, v1, Lt/p0;->b:Lm0/n1;

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p1, v2}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    new-instance p1, Lt/r0;

    const/4 v2, 0x0

    invoke-direct {p1, v2, v1, v0}, Lt/r0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lt/e1;->a:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lm0/o0;

    invoke-virtual {p0, p1}, Lt/e1;->a(Lm0/o0;)Lm0/n0;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lm0/o0;

    invoke-virtual {p0, p1}, Lt/e1;->a(Lm0/o0;)Lm0/n0;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Lm0/o0;

    invoke-virtual {p0, p1}, Lt/e1;->a(Lm0/o0;)Lm0/n0;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Lm0/o0;

    invoke-virtual {p0, p1}, Lt/e1;->a(Lm0/o0;)Lm0/n0;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Lt/m;

    iget-object v0, p0, Lt/e1;->b:Ljava/lang/Object;

    check-cast v0, Lc9/e;

    iget-object v1, p1, Lt/m;->e:Lm0/n1;

    invoke-virtual {v1}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v1

    iget-object v2, p0, Lt/e1;->c:Ljava/lang/Object;

    check-cast v2, Lt/x1;

    iget-object v2, v2, Lt/x1;->b:Lc9/c;

    iget-object p1, p1, Lt/m;->f:Lt/t;

    invoke-interface {v2, p1}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Lc9/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Lq8/l;->a:Lq8/l;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
