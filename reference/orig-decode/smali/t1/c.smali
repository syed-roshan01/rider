.class public final Lt1/c;
.super Ld9/j;

# interfaces
.implements Lc9/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lt1/d;


# direct methods
.method public synthetic constructor <init>(Lt1/d;I)V
    .locals 0

    iput p2, p0, Lt1/c;->a:I

    iput-object p1, p0, Lt1/c;->b:Lt1/d;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    sget-object v0, Lq8/l;->a:Lq8/l;

    const-string v1, "null cannot be cast to non-null type androidx.compose.ui.modifier.ModifierLocalConsumer"

    iget-object v2, p0, Lt1/c;->b:Lt1/d;

    iget v3, p0, Lt1/c;->a:I

    packed-switch v3, :pswitch_data_0

    packed-switch v3, :pswitch_data_1

    iget-object v3, v2, Lt1/d;->u:Ly0/m;

    invoke-static {v3, v1}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Ls1/d;

    invoke-interface {v3, v2}, Ls1/d;->g(Ls1/h;)V

    goto :goto_0

    :pswitch_0
    invoke-virtual {v2}, Lt1/d;->I0()V

    :goto_0
    return-object v0

    :pswitch_1
    packed-switch v3, :pswitch_data_2

    iget-object v3, v2, Lt1/d;->u:Ly0/m;

    invoke-static {v3, v1}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Ls1/d;

    invoke-interface {v3, v2}, Ls1/d;->g(Ls1/h;)V

    goto :goto_1

    :pswitch_2
    invoke-virtual {v2}, Lt1/d;->I0()V

    :goto_1
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_2
    .end packed-switch
.end method
