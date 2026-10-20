.class final Landroidx/compose/foundation/relocation/BringIntoViewRequesterElement;
.super Lt1/u0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lt1/u0;"
    }
.end annotation


# instance fields
.field public final b:Lc0/f;


# direct methods
.method public constructor <init>(Lc0/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/relocation/BringIntoViewRequesterElement;->b:Lc0/f;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    if-eq p0, p1, :cond_1

    instance-of v0, p1, Landroidx/compose/foundation/relocation/BringIntoViewRequesterElement;

    if-eqz v0, :cond_0

    check-cast p1, Landroidx/compose/foundation/relocation/BringIntoViewRequesterElement;

    iget-object p1, p1, Landroidx/compose/foundation/relocation/BringIntoViewRequesterElement;->b:Lc0/f;

    iget-object v0, p0, Landroidx/compose/foundation/relocation/BringIntoViewRequesterElement;->b:Lc0/f;

    invoke-static {v0, p1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/relocation/BringIntoViewRequesterElement;->b:Lc0/f;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final l()Ly0/n;
    .locals 2

    new-instance v0, Lc0/g;

    iget-object v1, p0, Landroidx/compose/foundation/relocation/BringIntoViewRequesterElement;->b:Lc0/f;

    invoke-direct {v0, v1}, Lc0/g;-><init>(Lc0/f;)V

    return-object v0
.end method

.method public final m(Ly0/n;)V
    .locals 2

    check-cast p1, Lc0/g;

    iget-object v0, p1, Lc0/g;->w:Lc0/f;

    instance-of v1, v0, Lc0/f;

    if-eqz v1, :cond_0

    const-string v1, "null cannot be cast to non-null type androidx.compose.foundation.relocation.BringIntoViewRequesterImpl"

    invoke-static {v0, v1}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v0, Lc0/f;->a:Lo0/i;

    invoke-virtual {v0, p1}, Lo0/i;->m(Ljava/lang/Object;)Z

    :cond_0
    iget-object v0, p0, Landroidx/compose/foundation/relocation/BringIntoViewRequesterElement;->b:Lc0/f;

    instance-of v1, v0, Lc0/f;

    if-eqz v1, :cond_1

    iget-object v1, v0, Lc0/f;->a:Lo0/i;

    invoke-virtual {v1, p1}, Lo0/i;->c(Ljava/lang/Object;)V

    :cond_1
    iput-object v0, p1, Lc0/g;->w:Lc0/f;

    return-void
.end method
