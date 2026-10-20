.class public final Lu/t0;
.super Ly0/n;

# interfaces
.implements Lt1/r1;
.implements Lc1/l;


# instance fields
.field public u:Z


# virtual methods
.method public final Q(Ly1/j;)V
    .locals 4

    iget-boolean v0, p0, Lu/t0;->u:Z

    sget-object v1, Ly1/t;->a:[Lj9/f;

    sget-object v1, Ly1/r;->k:Ly1/u;

    sget-object v2, Ly1/t;->a:[Lj9/f;

    const/4 v3, 0x4

    aget-object v2, v2, v3

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v1, p1, v0}, Ly1/u;->a(Ly1/v;Ljava/lang/Object;)V

    new-instance v0, Lt/l0;

    const/4 v1, 0x2

    invoke-direct {v0, p0, v1}, Lt/l0;-><init>(Ljava/lang/Object;I)V

    sget-object v1, Ly1/i;->t:Ly1/u;

    new-instance v2, Ly1/a;

    const/4 v3, 0x0

    invoke-direct {v2, v3, v0}, Ly1/a;-><init>(Ljava/lang/String;Lq8/a;)V

    invoke-virtual {p1, v1, v2}, Ly1/j;->k(Ly1/u;Ljava/lang/Object;)V

    return-void
.end method
