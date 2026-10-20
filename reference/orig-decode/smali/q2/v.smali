.class public final Lq2/v;
.super Lq2/y;


# instance fields
.field public b:Ljava/lang/CharSequence;


# virtual methods
.method public final a(Landroid/os/Bundle;)V
    .locals 0

    invoke-super {p0, p1}, Lq2/y;->a(Landroid/os/Bundle;)V

    return-void
.end method

.method public final b(Lq2/k0;)V
    .locals 1

    iget-object p1, p1, Lq2/k0;->b:Landroid/app/Notification$Builder;

    invoke-static {p1}, Lq2/u;->b(Landroid/app/Notification$Builder;)Landroid/app/Notification$BigTextStyle;

    move-result-object p1

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lq2/u;->c(Landroid/app/Notification$BigTextStyle;Ljava/lang/CharSequence;)Landroid/app/Notification$BigTextStyle;

    move-result-object p1

    iget-object v0, p0, Lq2/v;->b:Ljava/lang/CharSequence;

    invoke-static {p1, v0}, Lq2/u;->a(Landroid/app/Notification$BigTextStyle;Ljava/lang/CharSequence;)Landroid/app/Notification$BigTextStyle;

    return-void
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    const-string v0, "androidx.core.app.NotificationCompat$BigTextStyle"

    return-object v0
.end method
