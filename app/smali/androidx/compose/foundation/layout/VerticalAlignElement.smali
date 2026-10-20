.class public final Landroidx/compose/foundation/layout/VerticalAlignElement;
.super Lt1/u0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lt1/u0;"
    }
.end annotation


# instance fields
.field public final b:Ly0/c;


# direct methods
.method public constructor <init>()V
    .locals 1

    sget-object v0, Ly0/a;->n:Ly0/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Landroidx/compose/foundation/layout/VerticalAlignElement;->b:Ly0/c;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, Landroidx/compose/foundation/layout/VerticalAlignElement;

    if-eqz v0, :cond_1

    check-cast p1, Landroidx/compose/foundation/layout/VerticalAlignElement;

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_2

    const/4 p1, 0x0

    return p1

    :cond_2
    iget-object v0, p0, Landroidx/compose/foundation/layout/VerticalAlignElement;->b:Ly0/c;

    iget-object p1, p1, Landroidx/compose/foundation/layout/VerticalAlignElement;->b:Ly0/c;

    invoke-static {v0, p1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/layout/VerticalAlignElement;->b:Ly0/c;

    check-cast v0, Ly0/f;

    iget v0, v0, Ly0/f;->a:F

    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    move-result v0

    return v0
.end method

.method public final l()Ly0/n;
    .locals 2

    new-instance v0, Ly/h1;

    invoke-direct {v0}, Ly0/n;-><init>()V

    iget-object v1, p0, Landroidx/compose/foundation/layout/VerticalAlignElement;->b:Ly0/c;

    iput-object v1, v0, Ly/h1;->u:Ly0/c;

    return-object v0
.end method

.method public final m(Ly0/n;)V
    .locals 1

    check-cast p1, Ly/h1;

    iget-object v0, p0, Landroidx/compose/foundation/layout/VerticalAlignElement;->b:Ly0/c;

    iput-object v0, p1, Ly/h1;->u:Ly0/c;

    return-void
.end method
