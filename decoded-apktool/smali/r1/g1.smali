.class public final Lr1/g1;
.super Ld9/j;

# interfaces
.implements Lc9/e;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lr1/h1;


# direct methods
.method public synthetic constructor <init>(Lr1/h1;I)V
    .locals 0

    iput p2, p0, Lr1/g1;->a:I

    iput-object p1, p0, Lr1/g1;->b:Lr1/h1;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    sget-object v0, Lq8/l;->a:Lq8/l;

    iget v1, p0, Lr1/g1;->a:I

    iget-object v2, p0, Lr1/g1;->b:Lr1/h1;

    packed-switch v1, :pswitch_data_0

    check-cast p1, Landroidx/compose/ui/node/a;

    check-cast p2, Lr1/h1;

    iget-object p2, p1, Landroidx/compose/ui/node/a;->E:Lr1/f0;

    if-nez p2, :cond_0

    new-instance p2, Lr1/f0;

    iget-object v1, v2, Lr1/h1;->a:Lr1/k1;

    invoke-direct {p2, p1, v1}, Lr1/f0;-><init>(Landroidx/compose/ui/node/a;Lr1/k1;)V

    iput-object p2, p1, Landroidx/compose/ui/node/a;->E:Lr1/f0;

    :cond_0
    iput-object p2, v2, Lr1/h1;->b:Lr1/f0;

    invoke-virtual {v2}, Lr1/h1;->a()Lr1/f0;

    move-result-object p1

    invoke-virtual {p1}, Lr1/f0;->e()V

    invoke-virtual {v2}, Lr1/h1;->a()Lr1/f0;

    move-result-object p1

    iget-object p2, p1, Lr1/f0;->c:Lr1/k1;

    iget-object v1, v2, Lr1/h1;->a:Lr1/k1;

    if-eq p2, v1, :cond_1

    iput-object v1, p1, Lr1/f0;->c:Lr1/k1;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lr1/f0;->f(Z)V

    const/4 v1, 0x3

    iget-object p1, p1, Lr1/f0;->a:Landroidx/compose/ui/node/a;

    invoke-static {p1, p2, v1}, Landroidx/compose/ui/node/a;->Q(Landroidx/compose/ui/node/a;ZI)V

    :cond_1
    return-object v0

    :pswitch_0
    check-cast p1, Landroidx/compose/ui/node/a;

    check-cast p2, Lc9/e;

    invoke-virtual {v2}, Lr1/h1;->a()Lr1/f0;

    move-result-object v1

    new-instance v2, Lr1/c0;

    iget-object v3, v1, Lr1/f0;->w:Ljava/lang/String;

    invoke-direct {v2, v1, p2, v3}, Lr1/c0;-><init>(Lr1/f0;Lc9/e;Ljava/lang/String;)V

    invoke-virtual {p1, v2}, Landroidx/compose/ui/node/a;->W(Lr1/j0;)V

    return-object v0

    :pswitch_1
    check-cast p1, Landroidx/compose/ui/node/a;

    check-cast p2, Lm0/u;

    invoke-virtual {v2}, Lr1/h1;->a()Lr1/f0;

    move-result-object p1

    iput-object p2, p1, Lr1/f0;->b:Lm0/u;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
