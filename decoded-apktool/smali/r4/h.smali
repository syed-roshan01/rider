.class public final Lr4/h;
.super Landroid/net/ConnectivityManager$NetworkCallback;


# static fields
.field public static final synthetic c:I


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lf8/b;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Lr4/h;->a:I

    .line 2
    invoke-direct {p0, p1, v0}, Lr4/h;-><init>(Ljava/lang/Object;I)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lr4/h;->a:I

    iput-object p1, p0, Lr4/h;->b:Ljava/lang/Object;

    .line 1
    invoke-direct {p0}, Landroid/net/ConnectivityManager$NetworkCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAvailable(Landroid/net/Network;)V
    .locals 3

    iget v0, p0, Lr4/h;->a:I

    const-string v1, "network"

    iget-object v2, p0, Lr4/h;->b:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v2, Lf8/b;

    iget-object p1, v2, Lf8/b;->a:Le8/c1;

    invoke-virtual {p1}, Le8/c1;->t()V

    return-void

    :pswitch_0
    invoke-static {p1, v1}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Lm0/g1;

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {v2, p1}, Lm0/g1;->setValue(Ljava/lang/Object;)V

    return-void

    :pswitch_1
    invoke-static {p1, v1}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Lcom/auto/accept/service/OverlayService;

    invoke-static {v2}, Lcom/auto/accept/service/OverlayService;->access$getNetworkStatusText$p(Lcom/auto/accept/service/OverlayService;)Landroid/widget/TextView;

    move-result-object p1

    if-eqz p1, :cond_0

    new-instance v0, Lb5/f;

    const/4 v1, 0x0

    invoke-direct {v0, v2, v1}, Lb5/f;-><init>(Lcom/auto/accept/service/OverlayService;I)V

    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void

    :pswitch_2
    check-cast v2, Lr4/i;

    const/4 v0, 0x1

    invoke-static {v2, p1, v0}, Lr4/i;->b(Lr4/i;Landroid/net/Network;Z)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final onBlockedStatusChanged(Landroid/net/Network;Z)V
    .locals 1

    iget v0, p0, Lr4/h;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1, p2}, Landroid/net/ConnectivityManager$NetworkCallback;->onBlockedStatusChanged(Landroid/net/Network;Z)V

    return-void

    :pswitch_0
    if-nez p2, :cond_0

    iget-object p1, p0, Lr4/h;->b:Ljava/lang/Object;

    check-cast p1, Lf8/b;

    iget-object p1, p1, Lf8/b;->a:Le8/c1;

    invoke-virtual {p1}, Le8/c1;->t()V

    :cond_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
.end method

.method public final onCapabilitiesChanged(Landroid/net/Network;Landroid/net/NetworkCapabilities;)V
    .locals 1

    iget v0, p0, Lr4/h;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1, p2}, Landroid/net/ConnectivityManager$NetworkCallback;->onCapabilitiesChanged(Landroid/net/Network;Landroid/net/NetworkCapabilities;)V

    return-void

    :pswitch_0
    const-string v0, "network"

    invoke-static {p1, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "caps"

    invoke-static {p2, p1}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lr4/h;->b:Ljava/lang/Object;

    check-cast p1, Lm0/g1;

    const/16 v0, 0xc

    invoke-virtual {p2, v0}, Landroid/net/NetworkCapabilities;->hasCapability(I)Z

    move-result p2

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-interface {p1, p2}, Lm0/g1;->setValue(Ljava/lang/Object;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public final onLost(Landroid/net/Network;)V
    .locals 3

    iget v0, p0, Lr4/h;->a:I

    const-string v1, "network"

    iget-object v2, p0, Lr4/h;->b:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1}, Landroid/net/ConnectivityManager$NetworkCallback;->onLost(Landroid/net/Network;)V

    return-void

    :pswitch_0
    invoke-static {p1, v1}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Lm0/g1;

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {v2, p1}, Lm0/g1;->setValue(Ljava/lang/Object;)V

    return-void

    :pswitch_1
    invoke-static {p1, v1}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Lcom/auto/accept/service/OverlayService;

    invoke-static {v2}, Lcom/auto/accept/service/OverlayService;->access$getNetworkStatusText$p(Lcom/auto/accept/service/OverlayService;)Landroid/widget/TextView;

    move-result-object p1

    if-eqz p1, :cond_0

    new-instance v0, Lb5/f;

    const/4 v1, 0x1

    invoke-direct {v0, v2, v1}, Lb5/f;-><init>(Lcom/auto/accept/service/OverlayService;I)V

    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void

    :pswitch_2
    check-cast v2, Lr4/i;

    const/4 v0, 0x0

    invoke-static {v2, p1, v0}, Lr4/i;->b(Lr4/i;Landroid/net/Network;Z)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
