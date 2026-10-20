.class public final Lb5/e;
.super Landroid/content/BroadcastReceiver;


# instance fields
.field public final synthetic a:Lcom/auto/accept/service/OverlayService;


# direct methods
.method public constructor <init>(Lcom/auto/accept/service/OverlayService;)V
    .locals 0

    iput-object p1, p0, Lb5/e;->a:Lcom/auto/accept/service/OverlayService;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 4

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_7

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, -0x1cb42e41

    iget-object v2, p0, Lb5/e;->a:Lcom/auto/accept/service/OverlayService;

    const/4 v3, 0x0

    if-eq v0, v1, :cond_3

    const v1, 0x67c90010

    if-eq v0, v1, :cond_1

    goto :goto_3

    :cond_1
    const-string v0, "com.auto.accept.SERVICE_STATUS"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_3

    :cond_2
    const-string p1, "is_active"

    invoke-virtual {p2, p1, v3}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result p1

    invoke-static {v2, p1}, Lcom/auto/accept/service/OverlayService;->access$updateStatusDisplay(Lcom/auto/accept/service/OverlayService;Z)V

    goto :goto_3

    :cond_3
    const-string v0, "com.auto.accept.FARE_DETECTED"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    goto :goto_3

    :cond_4
    const-string p1, "fare_amount"

    invoke-virtual {p2, p1, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    const-string v0, "accepted"

    invoke-virtual {p2, v0, v3}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result p2

    invoke-static {v2}, Lcom/auto/accept/service/OverlayService;->access$getFareText$p(Lcom/auto/accept/service/OverlayService;)Landroid/widget/TextView;

    move-result-object v0

    if-nez v0, :cond_5

    goto :goto_1

    :cond_5
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "\u20b9"

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_1
    invoke-static {v2}, Lcom/auto/accept/service/OverlayService;->access$getFareText$p(Lcom/auto/accept/service/OverlayService;)Landroid/widget/TextView;

    move-result-object p1

    if-eqz p1, :cond_7

    if-eqz p2, :cond_6

    const p2, -0xb350b0

    goto :goto_2

    :cond_6
    const p2, -0xa8de

    :goto_2
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_7
    :goto_3
    return-void
.end method
