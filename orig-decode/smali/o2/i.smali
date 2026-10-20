.class public final Lo2/i;
.super Ld9/j;

# interfaces
.implements Lc9/c;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lo2/r;


# direct methods
.method public synthetic constructor <init>(Lo2/r;I)V
    .locals 0

    iput p2, p0, Lo2/i;->a:I

    iput-object p1, p0, Lo2/i;->b:Lo2/r;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    sget-object v0, Lq8/l;->a:Lq8/l;

    iget v1, p0, Lo2/i;->a:I

    iget-object v2, p0, Lo2/i;->b:Lo2/r;

    packed-switch v1, :pswitch_data_0

    check-cast p1, Lc9/a;

    invoke-virtual {v2}, Landroid/view/View;->getHandler()Landroid/os/Handler;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v3

    if-ne v1, v3, :cond_1

    invoke-interface {p1}, Lc9/a;->invoke()Ljava/lang/Object;

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Landroid/view/View;->getHandler()Landroid/os/Handler;

    move-result-object v1

    if-eqz v1, :cond_2

    new-instance v2, Lu1/v;

    const/4 v3, 0x1

    invoke-direct {v2, p1, v3}, Lu1/v;-><init>(Lc9/a;I)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_2
    :goto_1
    return-object v0

    :pswitch_0
    check-cast p1, Lm2/k;

    iget-wide v3, p1, Lm2/k;->a:J

    new-instance p1, Lm2/k;

    invoke-direct {p1, v3, v4}, Lm2/k;-><init>(J)V

    invoke-virtual {v2, p1}, Lo2/r;->setPopupContentSize-fhxjrPA(Lm2/k;)V

    invoke-virtual {v2}, Lo2/r;->l()V

    return-object v0

    :pswitch_1
    check-cast p1, Lr1/s;

    invoke-interface {p1}, Lr1/s;->j()Lr1/s;

    move-result-object p1

    invoke-static {p1}, Ld7/a;->j(Ljava/lang/Object;)V

    invoke-virtual {v2, p1}, Lo2/r;->k(Lr1/s;)V

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
