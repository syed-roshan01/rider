.class public final Lu/g0;
.super Ly0/n;

# interfaces
.implements Lt1/r1;


# instance fields
.field public u:Z

.field public v:Ljava/lang/String;

.field public w:Ly1/g;

.field public x:Lc9/a;

.field public y:Ljava/lang/String;

.field public z:Lc9/a;


# virtual methods
.method public final Q(Ly1/j;)V
    .locals 4

    iget-object v0, p0, Lu/g0;->w:Ly1/g;

    if-eqz v0, :cond_0

    iget v0, v0, Ly1/g;->a:I

    invoke-static {p1, v0}, Ly1/t;->d(Ly1/v;I)V

    :cond_0
    iget-object v0, p0, Lu/g0;->v:Ljava/lang/String;

    new-instance v1, Lu/f0;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lu/f0;-><init>(Lu/g0;I)V

    sget-object v2, Ly1/t;->a:[Lj9/f;

    sget-object v2, Ly1/i;->b:Ly1/u;

    new-instance v3, Ly1/a;

    invoke-direct {v3, v0, v1}, Ly1/a;-><init>(Ljava/lang/String;Lq8/a;)V

    invoke-virtual {p1, v2, v3}, Ly1/j;->k(Ly1/u;Ljava/lang/Object;)V

    iget-object v0, p0, Lu/g0;->z:Lc9/a;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lu/g0;->y:Ljava/lang/String;

    new-instance v1, Lu/f0;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v2}, Lu/f0;-><init>(Lu/g0;I)V

    sget-object v2, Ly1/i;->c:Ly1/u;

    new-instance v3, Ly1/a;

    invoke-direct {v3, v0, v1}, Ly1/a;-><init>(Ljava/lang/String;Lq8/a;)V

    invoke-virtual {p1, v2, v3}, Ly1/j;->k(Ly1/u;Ljava/lang/Object;)V

    :cond_1
    iget-boolean v0, p0, Lu/g0;->u:Z

    if-nez v0, :cond_2

    sget-object v0, Ly1/r;->i:Ly1/u;

    sget-object v1, Lq8/l;->a:Lq8/l;

    invoke-virtual {p1, v0, v1}, Ly1/j;->k(Ly1/u;Ljava/lang/Object;)V

    :cond_2
    return-void
.end method

.method public final d0()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
