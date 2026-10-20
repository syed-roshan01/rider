.class public final Ls/u;
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

    iput p1, p0, Ls/u;->a:I

    iput-object p2, p0, Ls/u;->b:Ljava/lang/Object;

    iput-object p3, p0, Ls/u;->c:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Ls/u;->a:I

    iget-object v1, p0, Ls/u;->c:Ljava/lang/Object;

    iget-object v2, p0, Ls/u;->b:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lr1/w0;

    check-cast v2, Lr1/x0;

    check-cast v1, Ls/i0;

    iget-object v0, v1, Ls/i0;->c:Lm0/k1;

    invoke-virtual {v0}, Lm0/s2;->d()F

    move-result v0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x0

    invoke-static {v2, p1, p1, v0}, Lr1/w0;->c(Lr1/x0;IIF)V

    sget-object p1, Lq8/l;->a:Lq8/l;

    return-object p1

    :pswitch_0
    check-cast p1, Lt/o1;

    check-cast v2, Ls/w;

    iget-object v0, v2, Ls/w;->d:Ljava/util/LinkedHashMap;

    invoke-interface {p1}, Lt/o1;->a()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm0/l3;

    const-wide/16 v3, 0x0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm2/k;

    iget-wide v5, v0, Lm2/k;->a:J

    goto :goto_0

    :cond_0
    move-wide v5, v3

    :goto_0
    iget-object v0, v2, Ls/w;->d:Ljava/util/LinkedHashMap;

    invoke-interface {p1}, Lt/o1;->c()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lm0/l3;

    if-eqz p1, :cond_1

    invoke-interface {p1}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lm2/k;

    iget-wide v3, p1, Lm2/k;->a:J

    :cond_1
    check-cast v1, Ls/v;

    iget-object p1, v1, Ls/v;->c:Lm0/l3;

    invoke-interface {p1}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ls/y0;

    if-eqz p1, :cond_2

    new-instance v0, Lm2/k;

    invoke-direct {v0, v5, v6}, Lm2/k;-><init>(J)V

    new-instance v1, Lm2/k;

    invoke-direct {v1, v3, v4}, Lm2/k;-><init>(J)V

    iget-object p1, p1, Ls/y0;->b:Lc9/e;

    invoke-interface {p1, v0, v1}, Lc9/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lt/e0;

    if-nez p1, :cond_3

    :cond_2
    const/4 p1, 0x7

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {v0, v1, p1}, Lt/e;->r(FLjava/lang/Object;I)Lt/d1;

    move-result-object p1

    :cond_3
    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
