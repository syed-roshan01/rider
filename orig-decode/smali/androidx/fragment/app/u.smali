.class public final Landroidx/fragment/app/u;
.super Landroidx/fragment/app/j0;


# instance fields
.field public final synthetic a:Landroidx/fragment/app/d0;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/d0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/fragment/app/u;->a:Landroidx/fragment/app/d0;

    return-void
.end method


# virtual methods
.method public final b(I)Landroid/view/View;
    .locals 3

    iget-object v0, p0, Landroidx/fragment/app/u;->a:Landroidx/fragment/app/d0;

    iget-object v1, v0, Landroidx/fragment/app/d0;->mView:Landroid/view/View;

    if-eqz v1, :cond_0

    invoke-virtual {v1, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v1, "Fragment "

    const-string v2, " does not have a view"

    invoke-static {v1, v0, v2}, La7/a;->m(Ljava/lang/String;Landroidx/fragment/app/d0;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final c()Z
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/u;->a:Landroidx/fragment/app/d0;

    iget-object v0, v0, Landroidx/fragment/app/d0;->mView:Landroid/view/View;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
