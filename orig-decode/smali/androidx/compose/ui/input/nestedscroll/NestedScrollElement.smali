.class final Landroidx/compose/ui/input/nestedscroll/NestedScrollElement;
.super Lt1/u0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lt1/u0;"
    }
.end annotation


# instance fields
.field public final b:Ln1/a;

.field public final c:Ln1/d;


# direct methods
.method public constructor <init>(Ln1/a;Ln1/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/input/nestedscroll/NestedScrollElement;->b:Ln1/a;

    iput-object p2, p0, Landroidx/compose/ui/input/nestedscroll/NestedScrollElement;->c:Ln1/d;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Landroidx/compose/ui/input/nestedscroll/NestedScrollElement;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Landroidx/compose/ui/input/nestedscroll/NestedScrollElement;

    iget-object v0, p1, Landroidx/compose/ui/input/nestedscroll/NestedScrollElement;->b:Ln1/a;

    iget-object v2, p0, Landroidx/compose/ui/input/nestedscroll/NestedScrollElement;->b:Ln1/a;

    invoke-static {v0, v2}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    return v1

    :cond_1
    iget-object p1, p1, Landroidx/compose/ui/input/nestedscroll/NestedScrollElement;->c:Ln1/d;

    iget-object v0, p0, Landroidx/compose/ui/input/nestedscroll/NestedScrollElement;->c:Ln1/d;

    invoke-static {p1, v0}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v1

    :cond_2
    const/4 p1, 0x1

    return p1
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Landroidx/compose/ui/input/nestedscroll/NestedScrollElement;->b:Ln1/a;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Landroidx/compose/ui/input/nestedscroll/NestedScrollElement;->c:Ln1/d;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public final l()Ly0/n;
    .locals 3

    new-instance v0, Ln1/g;

    iget-object v1, p0, Landroidx/compose/ui/input/nestedscroll/NestedScrollElement;->b:Ln1/a;

    iget-object v2, p0, Landroidx/compose/ui/input/nestedscroll/NestedScrollElement;->c:Ln1/d;

    invoke-direct {v0, v1, v2}, Ln1/g;-><init>(Ln1/a;Ln1/d;)V

    return-object v0
.end method

.method public final m(Ly0/n;)V
    .locals 3

    check-cast p1, Ln1/g;

    iget-object v0, p0, Landroidx/compose/ui/input/nestedscroll/NestedScrollElement;->b:Ln1/a;

    iput-object v0, p1, Ln1/g;->u:Ln1/a;

    iget-object v0, p1, Ln1/g;->v:Ln1/d;

    iget-object v1, v0, Ln1/d;->a:Ls1/f;

    if-ne v1, p1, :cond_0

    const/4 v1, 0x0

    iput-object v1, v0, Ln1/d;->a:Ls1/f;

    :cond_0
    iget-object v1, p0, Landroidx/compose/ui/input/nestedscroll/NestedScrollElement;->c:Ln1/d;

    if-nez v1, :cond_1

    new-instance v0, Ln1/d;

    invoke-direct {v0}, Ln1/d;-><init>()V

    iput-object v0, p1, Ln1/g;->v:Ln1/d;

    goto :goto_0

    :cond_1
    invoke-static {v1, v0}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    iput-object v1, p1, Ln1/g;->v:Ln1/d;

    :cond_2
    :goto_0
    iget-boolean v0, p1, Ly0/n;->t:Z

    if-eqz v0, :cond_3

    iget-object v0, p1, Ln1/g;->v:Ln1/d;

    iput-object p1, v0, Ln1/d;->a:Ls1/f;

    new-instance v1, Lt/l0;

    const/16 v2, 0x16

    invoke-direct {v1, p1, v2}, Lt/l0;-><init>(Ljava/lang/Object;I)V

    iput-object v1, v0, Ln1/d;->b:Lc9/a;

    invoke-virtual {p1}, Ly0/n;->v0()Lm9/d0;

    move-result-object p1

    iput-object p1, v0, Ln1/d;->c:Lm9/d0;

    :cond_3
    return-void
.end method
