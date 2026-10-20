.class public final Lf4/f0;
.super Lf4/r;


# instance fields
.field public final synthetic a:Landroid/view/ViewGroup;

.field public final synthetic b:Landroid/view/View;

.field public final synthetic c:Landroid/view/View;

.field public final synthetic d:Lf4/h;


# direct methods
.method public constructor <init>(Lf4/h;Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf4/f0;->d:Lf4/h;

    iput-object p2, p0, Lf4/f0;->a:Landroid/view/ViewGroup;

    iput-object p3, p0, Lf4/f0;->b:Landroid/view/View;

    iput-object p4, p0, Lf4/f0;->c:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 2

    iget-object v0, p0, Lf4/f0;->a:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getOverlay()Landroid/view/ViewGroupOverlay;

    move-result-object v0

    iget-object v1, p0, Lf4/f0;->b:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroupOverlay;->remove(Landroid/view/View;)V

    return-void
.end method

.method public final c(Lf4/q;)V
    .locals 3

    const/4 v0, 0x0

    iget-object v1, p0, Lf4/f0;->c:Landroid/view/View;

    const v2, 0x7f0800a2

    invoke-virtual {v1, v2, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    iget-object v0, p0, Lf4/f0;->a:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getOverlay()Landroid/view/ViewGroupOverlay;

    move-result-object v0

    iget-object v1, p0, Lf4/f0;->b:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroupOverlay;->remove(Landroid/view/View;)V

    invoke-virtual {p1, p0}, Lf4/q;->w(Lf4/p;)V

    return-void
.end method

.method public final d()V
    .locals 2

    iget-object v0, p0, Lf4/f0;->b:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lf4/f0;->a:Landroid/view/ViewGroup;

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getOverlay()Landroid/view/ViewGroupOverlay;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/ViewGroupOverlay;->add(Landroid/view/View;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lf4/f0;->d:Lf4/h;

    invoke-virtual {v0}, Lf4/q;->d()V

    :goto_0
    return-void
.end method
