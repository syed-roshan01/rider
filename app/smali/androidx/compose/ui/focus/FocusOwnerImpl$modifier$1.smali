.class public final Landroidx/compose/ui/focus/FocusOwnerImpl$modifier$1;
.super Lt1/u0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lt1/u0;"
    }
.end annotation


# instance fields
.field public final synthetic b:Lc1/f;


# direct methods
.method public constructor <init>(Lc1/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/focus/FocusOwnerImpl$modifier$1;->b:Lc1/f;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 0

    if-ne p1, p0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl$modifier$1;->b:Lc1/f;

    iget-object v0, v0, Lc1/f;->a:Lc1/p;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final l()Ly0/n;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl$modifier$1;->b:Lc1/f;

    iget-object v0, v0, Lc1/f;->a:Lc1/p;

    return-object v0
.end method

.method public final bridge synthetic m(Ly0/n;)V
    .locals 0

    check-cast p1, Lc1/p;

    return-void
.end method
