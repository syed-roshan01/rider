.class final Landroidx/compose/ui/layout/OnGloballyPositionedElement;
.super Lt1/u0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lt1/u0;"
    }
.end annotation


# instance fields
.field public final b:Lc9/c;


# direct methods
.method public constructor <init>(Lc9/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/layout/OnGloballyPositionedElement;->b:Lc9/c;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, Landroidx/compose/ui/layout/OnGloballyPositionedElement;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    check-cast p1, Landroidx/compose/ui/layout/OnGloballyPositionedElement;

    iget-object p1, p1, Landroidx/compose/ui/layout/OnGloballyPositionedElement;->b:Lc9/c;

    iget-object v0, p0, Landroidx/compose/ui/layout/OnGloballyPositionedElement;->b:Lc9/c;

    invoke-static {v0, p1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/layout/OnGloballyPositionedElement;->b:Lc9/c;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final l()Ly0/n;
    .locals 2

    new-instance v0, Lr1/r0;

    invoke-direct {v0}, Ly0/n;-><init>()V

    iget-object v1, p0, Landroidx/compose/ui/layout/OnGloballyPositionedElement;->b:Lc9/c;

    iput-object v1, v0, Lr1/r0;->u:Lc9/c;

    return-object v0
.end method

.method public final m(Ly0/n;)V
    .locals 1

    check-cast p1, Lr1/r0;

    iget-object v0, p0, Landroidx/compose/ui/layout/OnGloballyPositionedElement;->b:Lc9/c;

    iput-object v0, p1, Lr1/r0;->u:Lc9/c;

    return-void
.end method
