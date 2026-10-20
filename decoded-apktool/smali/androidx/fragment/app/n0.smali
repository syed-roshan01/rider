.class public final Landroidx/fragment/app/n0;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnAttachStateChangeListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroidx/fragment/app/e1;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/e1;Landroid/view/View;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Landroidx/fragment/app/n0;->a:I

    iput-object p1, p0, Landroidx/fragment/app/n0;->b:Landroidx/fragment/app/e1;

    iput-object p2, p0, Landroidx/fragment/app/n0;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroidx/fragment/app/o0;Landroidx/fragment/app/e1;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Landroidx/fragment/app/n0;->a:I

    iput-object p1, p0, Landroidx/fragment/app/n0;->c:Ljava/lang/Object;

    iput-object p2, p0, Landroidx/fragment/app/n0;->b:Landroidx/fragment/app/e1;

    return-void
.end method


# virtual methods
.method public final onViewAttachedToWindow(Landroid/view/View;)V
    .locals 2

    iget p1, p0, Landroidx/fragment/app/n0;->a:I

    iget-object v0, p0, Landroidx/fragment/app/n0;->c:Ljava/lang/Object;

    packed-switch p1, :pswitch_data_0

    check-cast v0, Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    sget-object p1, Lb3/q0;->a:Ljava/lang/reflect/Field;

    invoke-static {v0}, Lb3/f0;->c(Landroid/view/View;)V

    return-void

    :pswitch_0
    iget-object p1, p0, Landroidx/fragment/app/n0;->b:Landroidx/fragment/app/e1;

    iget-object v1, p1, Landroidx/fragment/app/e1;->c:Landroidx/fragment/app/d0;

    invoke-virtual {p1}, Landroidx/fragment/app/e1;->j()V

    iget-object p1, v1, Landroidx/fragment/app/d0;->mView:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup;

    check-cast v0, Landroidx/fragment/app/o0;

    iget-object v0, v0, Landroidx/fragment/app/o0;->a:Landroidx/fragment/app/x0;

    invoke-static {p1, v0}, Landroidx/fragment/app/t1;->g(Landroid/view/ViewGroup;Landroidx/fragment/app/x0;)Landroidx/fragment/app/t1;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/fragment/app/t1;->e()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 0

    return-void
.end method
