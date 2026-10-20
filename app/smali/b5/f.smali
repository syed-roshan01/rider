.class public final synthetic Lb5/f;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/auto/accept/service/OverlayService;


# direct methods
.method public synthetic constructor <init>(Lcom/auto/accept/service/OverlayService;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lb5/f;->a:I

    iput-object p1, p0, Lb5/f;->b:Lcom/auto/accept/service/OverlayService;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget v0, p0, Lb5/f;->a:I

    iget-object v1, p0, Lb5/f;->b:Lcom/auto/accept/service/OverlayService;

    const-string v2, "this$0"

    packed-switch v0, :pswitch_data_0

    sget v0, Lr4/h;->c:I

    invoke-static {v1, v2}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lcom/auto/accept/service/OverlayService;->access$getNetworkStatusText$p(Lcom/auto/accept/service/OverlayService;)Landroid/widget/TextView;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const-string v2, "\u26a0 No Internet"

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_0
    invoke-static {v1}, Lcom/auto/accept/service/OverlayService;->access$getNetworkStatusText$p(Lcom/auto/accept/service/OverlayService;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v2, 0x0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    :goto_1
    invoke-static {v1}, Lo1/s;->D(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v3, "service_enabled"

    invoke-interface {v0, v3, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0, v3, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    invoke-static {v1, v2}, Lcom/auto/accept/service/OverlayService;->access$updateStatusDisplay(Lcom/auto/accept/service/OverlayService;Z)V

    :cond_2
    return-void

    :pswitch_0
    sget v0, Lr4/h;->c:I

    invoke-static {v1, v2}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lcom/auto/accept/service/OverlayService;->access$getNetworkStatusText$p(Lcom/auto/accept/service/OverlayService;)Landroid/widget/TextView;

    move-result-object v0

    if-nez v0, :cond_3

    goto :goto_2

    :cond_3
    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :goto_2
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
