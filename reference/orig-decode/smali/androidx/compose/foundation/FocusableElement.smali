.class final Landroidx/compose/foundation/FocusableElement;
.super Lt1/u0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lt1/u0;"
    }
.end annotation


# instance fields
.field public final b:Lx/m;


# direct methods
.method public constructor <init>(Lx/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/FocusableElement;->b:Lx/m;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Landroidx/compose/foundation/FocusableElement;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Landroidx/compose/foundation/FocusableElement;

    iget-object p1, p1, Landroidx/compose/foundation/FocusableElement;->b:Lx/m;

    iget-object v1, p0, Landroidx/compose/foundation/FocusableElement;->b:Lx/m;

    invoke-static {v1, p1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/FocusableElement;->b:Lx/m;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final l()Ly0/n;
    .locals 2

    new-instance v0, Lu/q0;

    iget-object v1, p0, Landroidx/compose/foundation/FocusableElement;->b:Lx/m;

    invoke-direct {v0, v1}, Lu/q0;-><init>(Lx/m;)V

    return-object v0
.end method

.method public final m(Ly0/n;)V
    .locals 4

    check-cast p1, Lu/q0;

    iget-object p1, p1, Lu/q0;->y:Lu/o0;

    iget-object v0, p1, Lu/o0;->u:Lx/m;

    iget-object v1, p0, Landroidx/compose/foundation/FocusableElement;->b:Lx/m;

    invoke-static {v0, v1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p1, Lu/o0;->u:Lx/m;

    if-eqz v0, :cond_0

    iget-object v2, p1, Lu/o0;->v:Lx/d;

    if-eqz v2, :cond_0

    new-instance v3, Lx/e;

    invoke-direct {v3, v2}, Lx/e;-><init>(Lx/d;)V

    invoke-virtual {v0, v3}, Lx/m;->b(Lx/k;)V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p1, Lu/o0;->v:Lx/d;

    iput-object v1, p1, Lu/o0;->u:Lx/m;

    :cond_1
    return-void
.end method
