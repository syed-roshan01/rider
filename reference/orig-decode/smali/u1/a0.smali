.class public abstract Lu1/a0;
.super Ljava/lang/Object;


# direct methods
.method public static final a(Lc3/k;Ly1/o;)V
    .locals 3

    invoke-static {p1}, Lu1/r0;->a(Ly1/o;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Ly1/i;->f:Ly1/u;

    iget-object p1, p1, Ly1/o;->d:Ly1/j;

    invoke-static {p1, v0}, Lo1/s;->J(Ly1/j;Ly1/u;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ly1/a;

    if-eqz p1, :cond_0

    new-instance v0, Lc3/e;

    const/4 v1, 0x0

    const v2, 0x102003d

    iget-object p1, p1, Ly1/a;->a:Ljava/lang/String;

    invoke-direct {v0, v1, v2, p1, v1}, Lc3/e;-><init>(Ljava/lang/Object;ILjava/lang/String;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lc3/k;->b(Lc3/e;)V

    :cond_0
    return-void
.end method
