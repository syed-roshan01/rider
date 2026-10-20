.class public final Landroidx/fragment/app/e;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Landroidx/fragment/app/e;->a:I

    iput-object p1, p0, Landroidx/fragment/app/e;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget v0, p0, Landroidx/fragment/app/e;->a:I

    iget-object v1, p0, Landroidx/fragment/app/e;->b:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v1, Landroidx/fragment/app/x0;

    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Landroidx/fragment/app/x0;->t(Z)Z

    return-void

    :pswitch_0
    check-cast v1, Landroidx/fragment/app/r;

    iget-object v0, v1, Landroidx/fragment/app/r;->b:Landroidx/fragment/app/p;

    iget-object v1, v1, Landroidx/fragment/app/r;->q:Landroid/app/Dialog;

    invoke-virtual {v0, v1}, Landroidx/fragment/app/p;->onDismiss(Landroid/content/DialogInterface;)V

    return-void

    :pswitch_1
    check-cast v1, Landroidx/fragment/app/f;

    iget-object v0, v1, Landroidx/fragment/app/f;->b:Landroid/view/ViewGroup;

    iget-object v2, v1, Landroidx/fragment/app/f;->c:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->endViewTransition(Landroid/view/View;)V

    iget-object v0, v1, Landroidx/fragment/app/f;->d:Landroidx/fragment/app/k;

    invoke-virtual {v0}, Landroidx/fragment/app/l;->a()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
