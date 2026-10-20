.class final Landroidx/compose/ui/focus/FocusRequesterElement;
.super Lt1/u0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lt1/u0;"
    }
.end annotation


# instance fields
.field public final b:Lc1/k;


# direct methods
.method public constructor <init>(Lc1/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/focus/FocusRequesterElement;->b:Lc1/k;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Landroidx/compose/ui/focus/FocusRequesterElement;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Landroidx/compose/ui/focus/FocusRequesterElement;

    iget-object v1, p0, Landroidx/compose/ui/focus/FocusRequesterElement;->b:Lc1/k;

    iget-object p1, p1, Landroidx/compose/ui/focus/FocusRequesterElement;->b:Lc1/k;

    invoke-static {v1, p1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/focus/FocusRequesterElement;->b:Lc1/k;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final l()Ly0/n;
    .locals 2

    new-instance v0, Lc1/m;

    invoke-direct {v0}, Ly0/n;-><init>()V

    iget-object v1, p0, Landroidx/compose/ui/focus/FocusRequesterElement;->b:Lc1/k;

    iput-object v1, v0, Lc1/m;->u:Lc1/k;

    return-object v0
.end method

.method public final m(Ly0/n;)V
    .locals 1

    check-cast p1, Lc1/m;

    iget-object v0, p1, Lc1/m;->u:Lc1/k;

    iget-object v0, v0, Lc1/k;->a:Lo0/i;

    invoke-virtual {v0, p1}, Lo0/i;->m(Ljava/lang/Object;)Z

    iget-object v0, p0, Landroidx/compose/ui/focus/FocusRequesterElement;->b:Lc1/k;

    iput-object v0, p1, Lc1/m;->u:Lc1/k;

    iget-object v0, v0, Lc1/k;->a:Lo0/i;

    invoke-virtual {v0, p1}, Lo0/i;->c(Ljava/lang/Object;)V

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "FocusRequesterElement(focusRequester="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Landroidx/compose/ui/focus/FocusRequesterElement;->b:Lc1/k;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
