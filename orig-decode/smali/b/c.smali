.class public final Lb/c;
.super Ljava/lang/Object;

# interfaces
.implements Lm0/n0;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lb/c;->a:I

    iput-object p1, p0, Lb/c;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget v0, p0, Lb/c;->a:I

    const/4 v1, 0x0

    iget-object v2, p0, Lb/c;->b:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v2, Lo2/r;

    iget-object v0, v2, Lu1/a;->c:Lu1/x3;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lu1/x3;->a()V

    :cond_0
    iput-object v1, v2, Lu1/a;->c:Lu1/x3;

    invoke-virtual {v2}, Landroid/view/View;->requestLayout()V

    invoke-static {v2, v1}, Lo1/s;->i0(Landroid/view/View;Landroidx/lifecycle/w;)V

    iget-object v0, v2, Lo2/r;->u:Landroid/view/WindowManager;

    invoke-interface {v0, v2}, Landroid/view/WindowManager;->removeViewImmediate(Landroid/view/View;)V

    return-void

    :pswitch_0
    check-cast v2, Lo2/p;

    invoke-virtual {v2}, Landroid/app/Dialog;->dismiss()V

    iget-object v0, v2, Lo2/p;->n:Lo2/n;

    iget-object v2, v0, Lu1/a;->c:Lu1/x3;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lu1/x3;->a()V

    :cond_1
    iput-object v1, v0, Lu1/a;->c:Lu1/x3;

    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    return-void

    :pswitch_1
    check-cast v2, Lu1/w1;

    iget-object v0, v2, Lu1/w1;->a:Lc9/a;

    invoke-interface {v0}, Lc9/a;->invoke()Ljava/lang/Object;

    return-void

    :pswitch_2
    check-cast v2, Lh0/v0;

    invoke-virtual {v2}, Lh0/v0;->l()V

    return-void

    :pswitch_3
    check-cast v2, La0/z;

    iget-object v0, v2, La0/z;->d:Lm0/l1;

    invoke-virtual {v0}, Lm0/u2;->d()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    invoke-virtual {v2}, La0/z;->b()V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-void

    :pswitch_4
    check-cast v2, La0/p;

    iput-object v1, v2, La0/p;->d:Lc9/e;

    return-void

    :pswitch_5
    check-cast v2, Lt/u1;

    invoke-virtual {v2}, Lt/u1;->f()V

    return-void

    :pswitch_6
    check-cast v2, Lb/h;

    iget-object v0, v2, Landroidx/activity/y;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/activity/c;

    invoke-interface {v1}, Landroidx/activity/c;->cancel()V

    goto :goto_1

    :cond_3
    return-void

    :pswitch_7
    check-cast v2, Lb/a;

    iget-object v0, v2, Lb/a;->a:Ld/d;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Ld/d;->b()V

    sget-object v1, Lq8/l;->a:Lq8/l;

    :cond_4
    if-eqz v1, :cond_5

    return-void

    :cond_5
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Launcher has not been initialized"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
