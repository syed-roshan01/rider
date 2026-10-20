.class public final synthetic Landroidx/fragment/app/p0;
.super Ljava/lang/Object;

# interfaces
.implements La3/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroidx/fragment/app/x0;


# direct methods
.method public synthetic constructor <init>(Landroidx/fragment/app/x0;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Landroidx/fragment/app/p0;->a:I

    iput-object p1, p0, Landroidx/fragment/app/p0;->b:Landroidx/fragment/app/x0;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    iget v0, p0, Landroidx/fragment/app/p0;->a:I

    iget-object v1, p0, Landroidx/fragment/app/p0;->b:Landroidx/fragment/app/x0;

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lq2/q0;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-boolean p1, p1, Lq2/q0;->a:Z

    iget-object v0, v1, Landroidx/fragment/app/x0;->c:Landroidx/fragment/app/f1;

    invoke-virtual {v0}, Landroidx/fragment/app/f1;->f()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/d0;

    if-eqz v1, :cond_0

    invoke-virtual {v1, p1}, Landroidx/fragment/app/d0;->performPictureInPictureModeChanged(Z)V

    goto :goto_0

    :cond_1
    return-void

    :pswitch_0
    check-cast p1, Lq2/o;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-boolean p1, p1, Lq2/o;->a:Z

    iget-object v0, v1, Landroidx/fragment/app/x0;->c:Landroidx/fragment/app/f1;

    invoke-virtual {v0}, Landroidx/fragment/app/f1;->f()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/d0;

    if-eqz v1, :cond_2

    invoke-virtual {v1, p1}, Landroidx/fragment/app/d0;->performMultiWindowModeChanged(Z)V

    goto :goto_1

    :cond_3
    return-void

    :pswitch_1
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const/16 v0, 0x50

    if-ne p1, v0, :cond_5

    iget-object p1, v1, Landroidx/fragment/app/x0;->c:Landroidx/fragment/app/f1;

    invoke-virtual {p1}, Landroidx/fragment/app/f1;->f()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_4
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/fragment/app/d0;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Landroidx/fragment/app/d0;->performLowMemory()V

    goto :goto_2

    :cond_5
    return-void

    :pswitch_2
    check-cast p1, Landroid/content/res/Configuration;

    iget-object v0, v1, Landroidx/fragment/app/x0;->c:Landroidx/fragment/app/f1;

    invoke-virtual {v0}, Landroidx/fragment/app/f1;->f()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_6
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/d0;

    if-eqz v1, :cond_6

    invoke-virtual {v1, p1}, Landroidx/fragment/app/d0;->performConfigurationChanged(Landroid/content/res/Configuration;)V

    goto :goto_3

    :cond_7
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
