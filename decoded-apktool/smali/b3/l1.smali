.class public abstract Lb3/l1;
.super Ljava/lang/Object;


# instance fields
.field public final a:Lb3/u1;

.field public b:[Lu2/c;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    new-instance v0, Lb3/u1;

    invoke-direct {v0}, Lb3/u1;-><init>()V

    invoke-direct {p0, v0}, Lb3/l1;-><init>(Lb3/u1;)V

    return-void
.end method

.method public constructor <init>(Lb3/u1;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb3/l1;->a:Lb3/u1;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5

    iget-object v0, p0, Lb3/l1;->b:[Lu2/c;

    if-eqz v0, :cond_4

    const/4 v1, 0x1

    invoke-static {v1}, Lo1/s;->T(I)I

    move-result v2

    aget-object v0, v0, v2

    iget-object v2, p0, Lb3/l1;->b:[Lu2/c;

    const/4 v3, 0x2

    invoke-static {v3}, Lo1/s;->T(I)I

    move-result v4

    aget-object v2, v2, v4

    iget-object v4, p0, Lb3/l1;->a:Lb3/u1;

    if-nez v2, :cond_0

    iget-object v2, v4, Lb3/u1;->a:Lb3/r1;

    invoke-virtual {v2, v3}, Lb3/r1;->f(I)Lu2/c;

    move-result-object v2

    :cond_0
    if-nez v0, :cond_1

    iget-object v0, v4, Lb3/u1;->a:Lb3/r1;

    invoke-virtual {v0, v1}, Lb3/r1;->f(I)Lu2/c;

    move-result-object v0

    :cond_1
    invoke-static {v0, v2}, Lu2/c;->a(Lu2/c;Lu2/c;)Lu2/c;

    move-result-object v0

    invoke-virtual {p0, v0}, Lb3/l1;->g(Lu2/c;)V

    iget-object v0, p0, Lb3/l1;->b:[Lu2/c;

    const/16 v1, 0x10

    invoke-static {v1}, Lo1/s;->T(I)I

    move-result v1

    aget-object v0, v0, v1

    if-eqz v0, :cond_2

    invoke-virtual {p0, v0}, Lb3/l1;->f(Lu2/c;)V

    :cond_2
    iget-object v0, p0, Lb3/l1;->b:[Lu2/c;

    const/16 v1, 0x20

    invoke-static {v1}, Lo1/s;->T(I)I

    move-result v1

    aget-object v0, v0, v1

    if-eqz v0, :cond_3

    invoke-virtual {p0, v0}, Lb3/l1;->d(Lu2/c;)V

    :cond_3
    iget-object v0, p0, Lb3/l1;->b:[Lu2/c;

    const/16 v1, 0x40

    invoke-static {v1}, Lo1/s;->T(I)I

    move-result v1

    aget-object v0, v0, v1

    if-eqz v0, :cond_4

    invoke-virtual {p0, v0}, Lb3/l1;->h(Lu2/c;)V

    :cond_4
    return-void
.end method

.method public abstract b()Lb3/u1;
.end method

.method public c(ILu2/c;)V
    .locals 3

    iget-object v0, p0, Lb3/l1;->b:[Lu2/c;

    if-nez v0, :cond_0

    const/16 v0, 0x9

    new-array v0, v0, [Lu2/c;

    iput-object v0, p0, Lb3/l1;->b:[Lu2/c;

    :cond_0
    const/4 v0, 0x1

    :goto_0
    const/16 v1, 0x100

    if-gt v0, v1, :cond_2

    and-int v1, p1, v0

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    iget-object v1, p0, Lb3/l1;->b:[Lu2/c;

    invoke-static {v0}, Lo1/s;->T(I)I

    move-result v2

    aput-object p2, v1, v2

    :goto_1
    shl-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public d(Lu2/c;)V
    .locals 0

    return-void
.end method

.method public abstract e(Lu2/c;)V
.end method

.method public f(Lu2/c;)V
    .locals 0

    return-void
.end method

.method public abstract g(Lu2/c;)V
.end method

.method public h(Lu2/c;)V
    .locals 0

    return-void
.end method
