.class public final synthetic Lc5/q;
.super Ljava/lang/Object;

# interfaces
.implements Landroidx/lifecycle/u;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lc5/q;->a:I

    iput-object p1, p0, Lc5/q;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final onStateChanged(Landroidx/lifecycle/w;Landroidx/lifecycle/p;)V
    .locals 6

    iget p1, p0, Lc5/q;->a:I

    const-string v0, "FREEZE_DEBUG"

    const-string v1, "$viewModel"

    iget-object v2, p0, Lc5/q;->b:Ljava/lang/Object;

    packed-switch p1, :pswitch_data_0

    check-cast v2, Lb4/e;

    const-string p1, "this$0"

    invoke-static {v2, p1}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Landroidx/lifecycle/p;->ON_START:Landroidx/lifecycle/p;

    if-ne p2, p1, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, v2, Lb4/e;->f:Z

    goto :goto_0

    :cond_0
    sget-object p1, Landroidx/lifecycle/p;->ON_STOP:Landroidx/lifecycle/p;

    if-ne p2, p1, :cond_1

    const/4 p1, 0x0

    iput-boolean p1, v2, Lb4/e;->f:Z

    :cond_1
    :goto_0
    return-void

    :pswitch_0
    check-cast v2, Lcom/auto/accept/ui/viewmodel/MainViewModel;

    invoke-static {v2, v1}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Landroidx/lifecycle/p;->ON_RESUME:Landroidx/lifecycle/p;

    if-ne p2, p1, :cond_2

    const-string p1, "\u23f1\ufe0f MainScreen ON_RESUME: checkPermissions + recheckUserStatus"

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    invoke-virtual {v2}, Lcom/auto/accept/ui/viewmodel/MainViewModel;->e()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    sub-long/2addr v3, p1

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v5, "\u23f1\ufe0f MainScreen checkPermissions: "

    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v3, "ms"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {v2}, Lcom/auto/accept/ui/viewmodel/MainViewModel;->q()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    sub-long/2addr v1, p1

    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "\u23f1\ufe0f MainScreen recheckUserStatus DISPATCHED: "

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2
    return-void

    :pswitch_1
    check-cast v2, Lcom/auto/accept/ui/viewmodel/MainViewModel;

    invoke-static {v2, v1}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Landroidx/lifecycle/p;->ON_RESUME:Landroidx/lifecycle/p;

    if-ne p2, p1, :cond_3

    const-string p1, "\u23f1\ufe0f AutoAcceptNavigation ON_RESUME triggered"

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {v2}, Lcom/auto/accept/ui/viewmodel/MainViewModel;->p()V

    :cond_3
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
