.class final Landroidx/compose/foundation/layout/PaddingValuesElement;
.super Lt1/u0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lt1/u0;"
    }
.end annotation


# instance fields
.field public final b:Ly/t0;


# direct methods
.method public constructor <init>(Ly/t0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/layout/PaddingValuesElement;->b:Ly/t0;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Landroidx/compose/foundation/layout/PaddingValuesElement;

    if-eqz v0, :cond_0

    check-cast p1, Landroidx/compose/foundation/layout/PaddingValuesElement;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    iget-object v0, p0, Landroidx/compose/foundation/layout/PaddingValuesElement;->b:Ly/t0;

    iget-object p1, p1, Landroidx/compose/foundation/layout/PaddingValuesElement;->b:Ly/t0;

    invoke-static {v0, p1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/layout/PaddingValuesElement;->b:Ly/t0;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final l()Ly0/n;
    .locals 2

    new-instance v0, Ly/v0;

    invoke-direct {v0}, Ly0/n;-><init>()V

    iget-object v1, p0, Landroidx/compose/foundation/layout/PaddingValuesElement;->b:Ly/t0;

    iput-object v1, v0, Ly/v0;->u:Ly/t0;

    return-object v0
.end method

.method public final m(Ly0/n;)V
    .locals 1

    check-cast p1, Ly/v0;

    iget-object v0, p0, Landroidx/compose/foundation/layout/PaddingValuesElement;->b:Ly/t0;

    iput-object v0, p1, Ly/v0;->u:Ly/t0;

    return-void
.end method
