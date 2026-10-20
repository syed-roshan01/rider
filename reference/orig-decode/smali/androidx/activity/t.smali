.class public final Landroidx/activity/t;
.super Ljava/lang/Object;

# interfaces
.implements Landroidx/activity/w;


# virtual methods
.method public a(Landroidx/activity/m0;Landroidx/activity/m0;Landroid/view/Window;Landroid/view/View;ZZ)V
    .locals 1

    const-string v0, "statusBarStyle"

    invoke-static {p1, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigationBarStyle"

    invoke-static {p2, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "window"

    invoke-static {p3, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "view"

    invoke-static {p4, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-static {p3, v0}, Lo1/s;->k0(Landroid/view/Window;Z)V

    if-eqz p5, :cond_0

    iget p1, p1, Landroidx/activity/m0;->b:I

    goto :goto_0

    :cond_0
    iget p1, p1, Landroidx/activity/m0;->a:I

    :goto_0
    invoke-virtual {p3, p1}, Landroid/view/Window;->setStatusBarColor(I)V

    if-eqz p6, :cond_1

    iget p1, p2, Landroidx/activity/m0;->b:I

    goto :goto_1

    :cond_1
    iget p1, p2, Landroidx/activity/m0;->a:I

    :goto_1
    invoke-virtual {p3, p1}, Landroid/view/Window;->setNavigationBarColor(I)V

    new-instance p1, Lk/f;

    const/16 p2, 0xb

    invoke-direct {p1, p4, p2}, Lk/f;-><init>(Landroid/view/View;I)V

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p2, 0x1e

    if-lt p1, p2, :cond_2

    new-instance p1, Lb3/y1;

    invoke-direct {p1, p3}, Lb3/y1;-><init>(Landroid/view/Window;)V

    goto :goto_2

    :cond_2
    new-instance p1, Lb3/x1;

    invoke-direct {p1, p3}, Lb3/v1;-><init>(Landroid/view/Window;)V

    :goto_2
    xor-int/lit8 p2, p5, 0x1

    invoke-virtual {p1, p2}, Ll2/l;->i(Z)V

    xor-int/lit8 p2, p6, 0x1

    invoke-virtual {p1, p2}, Ll2/l;->h(Z)V

    return-void
.end method
