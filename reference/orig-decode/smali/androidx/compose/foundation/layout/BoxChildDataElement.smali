.class final Landroidx/compose/foundation/layout/BoxChildDataElement;
.super Lt1/u0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lt1/u0;"
    }
.end annotation


# instance fields
.field public final b:Ly0/d;


# direct methods
.method public constructor <init>(Ly0/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/layout/BoxChildDataElement;->b:Ly0/d;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v0, p1, Landroidx/compose/foundation/layout/BoxChildDataElement;

    if-eqz v0, :cond_1

    check-cast p1, Landroidx/compose/foundation/layout/BoxChildDataElement;

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    const/4 v0, 0x0

    if-nez p1, :cond_2

    return v0

    :cond_2
    iget-object v0, p0, Landroidx/compose/foundation/layout/BoxChildDataElement;->b:Ly0/d;

    iget-object p1, p1, Landroidx/compose/foundation/layout/BoxChildDataElement;->b:Ly0/d;

    invoke-static {v0, p1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Landroidx/compose/foundation/layout/BoxChildDataElement;->b:Ly0/d;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final l()Ly0/n;
    .locals 2

    new-instance v0, Ly/l;

    invoke-direct {v0}, Ly0/n;-><init>()V

    iget-object v1, p0, Landroidx/compose/foundation/layout/BoxChildDataElement;->b:Ly0/d;

    iput-object v1, v0, Ly/l;->u:Ly0/d;

    const/4 v1, 0x0

    iput-boolean v1, v0, Ly/l;->v:Z

    return-object v0
.end method

.method public final m(Ly0/n;)V
    .locals 1

    check-cast p1, Ly/l;

    iget-object v0, p0, Landroidx/compose/foundation/layout/BoxChildDataElement;->b:Ly0/d;

    iput-object v0, p1, Ly/l;->u:Ly0/d;

    const/4 v0, 0x0

    iput-boolean v0, p1, Ly/l;->v:Z

    return-void
.end method
