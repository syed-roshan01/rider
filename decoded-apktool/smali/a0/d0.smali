.class public final La0/d0;
.super Ljava/lang/Object;


# instance fields
.field public a:La0/c0;


# virtual methods
.method public final a(IJ)La0/b0;
    .locals 2

    iget-object v0, p0, La0/d0;->a:La0/c0;

    if-eqz v0, :cond_0

    check-cast v0, La0/f0;

    new-instance v1, La0/e0;

    invoke-direct {v1, p1, p2, p3}, La0/e0;-><init>(IJ)V

    iget-object p1, v0, La0/f0;->e:Lo0/i;

    invoke-virtual {p1, v1}, Lo0/i;->c(Ljava/lang/Object;)V

    iget-boolean p1, v0, La0/f0;->o:Z

    if-nez p1, :cond_1

    const/4 p1, 0x1

    iput-boolean p1, v0, La0/f0;->o:Z

    iget-object p1, v0, La0/f0;->d:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_0
    sget-object v1, La0/d;->a:La0/d;

    :cond_1
    :goto_0
    return-object v1
.end method
