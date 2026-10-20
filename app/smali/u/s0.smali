.class public final Lu/s0;
.super Ly0/n;

# interfaces
.implements Lt1/m;
.implements Lt1/f1;


# instance fields
.field public u:La0/z;

.field public v:Z


# virtual methods
.method public final B0()V
    .locals 1

    iget-object v0, p0, Lu/s0;->u:La0/z;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, La0/z;->b()V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lu/s0;->u:La0/z;

    return-void
.end method

.method public final G()V
    .locals 3

    new-instance v0, Ld9/u;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    new-instance v1, Lu/r0;

    const/4 v2, 0x0

    invoke-direct {v1, v2, v0, p0}, Lu/r0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0, v1}, Lt1/g;->w(Ly0/n;Lc9/a;)V

    iget-object v0, v0, Ld9/u;->a:Ljava/lang/Object;

    check-cast v0, La0/z;

    iget-boolean v1, p0, Lu/s0;->v:Z

    if-eqz v1, :cond_2

    iget-object v1, p0, Lu/s0;->u:La0/z;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, La0/z;->b()V

    :cond_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, La0/z;->a()La0/z;

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    iput-object v0, p0, Lu/s0;->u:La0/z;

    :cond_2
    return-void
.end method
