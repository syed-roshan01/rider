.class final Landroidx/compose/animation/EnterExitTransitionElement;
.super Lt1/u0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lt1/u0;"
    }
.end annotation


# instance fields
.field public final b:Lt/u1;

.field public final c:Ls/q0;

.field public final d:Ls/r0;

.field public final e:Ls/k0;


# direct methods
.method public constructor <init>(Lt/u1;Ls/q0;Ls/r0;Ls/k0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/animation/EnterExitTransitionElement;->b:Lt/u1;

    iput-object p2, p0, Landroidx/compose/animation/EnterExitTransitionElement;->c:Ls/q0;

    iput-object p3, p0, Landroidx/compose/animation/EnterExitTransitionElement;->d:Ls/r0;

    iput-object p4, p0, Landroidx/compose/animation/EnterExitTransitionElement;->e:Ls/k0;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Landroidx/compose/animation/EnterExitTransitionElement;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Landroidx/compose/animation/EnterExitTransitionElement;

    iget-object v1, p1, Landroidx/compose/animation/EnterExitTransitionElement;->b:Lt/u1;

    iget-object v3, p0, Landroidx/compose/animation/EnterExitTransitionElement;->b:Lt/u1;

    invoke-static {v3, v1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    const/4 v1, 0x0

    invoke-static {v1, v1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    return v2

    :cond_3
    invoke-static {v1, v1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    return v2

    :cond_4
    invoke-static {v1, v1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Landroidx/compose/animation/EnterExitTransitionElement;->c:Ls/q0;

    iget-object v3, p1, Landroidx/compose/animation/EnterExitTransitionElement;->c:Ls/q0;

    invoke-static {v1, v3}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Landroidx/compose/animation/EnterExitTransitionElement;->d:Ls/r0;

    iget-object v3, p1, Landroidx/compose/animation/EnterExitTransitionElement;->d:Ls/r0;

    invoke-static {v1, v3}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Landroidx/compose/animation/EnterExitTransitionElement;->e:Ls/k0;

    iget-object p1, p1, Landroidx/compose/animation/EnterExitTransitionElement;->e:Ls/k0;

    invoke-static {v1, p1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Landroidx/compose/animation/EnterExitTransitionElement;->b:Lt/u1;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const v1, 0xe1781

    mul-int/2addr v0, v1

    iget-object v1, p0, Landroidx/compose/animation/EnterExitTransitionElement;->c:Ls/q0;

    iget-object v1, v1, Ls/q0;->a:Ls/b1;

    invoke-virtual {v1}, Ls/b1;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Landroidx/compose/animation/EnterExitTransitionElement;->d:Ls/r0;

    iget-object v0, v0, Ls/r0;->a:Ls/b1;

    invoke-virtual {v0}, Ls/b1;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Landroidx/compose/animation/EnterExitTransitionElement;->e:Ls/k0;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final l()Ly0/n;
    .locals 9

    new-instance v8, Ls/p0;

    iget-object v1, p0, Landroidx/compose/animation/EnterExitTransitionElement;->b:Lt/u1;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    iget-object v5, p0, Landroidx/compose/animation/EnterExitTransitionElement;->c:Ls/q0;

    iget-object v6, p0, Landroidx/compose/animation/EnterExitTransitionElement;->d:Ls/r0;

    iget-object v7, p0, Landroidx/compose/animation/EnterExitTransitionElement;->e:Ls/k0;

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, Ls/p0;-><init>(Lt/u1;Lt/n1;Lt/n1;Lt/n1;Ls/q0;Ls/r0;Ls/k0;)V

    return-object v8
.end method

.method public final m(Ly0/n;)V
    .locals 1

    check-cast p1, Ls/p0;

    iget-object v0, p0, Landroidx/compose/animation/EnterExitTransitionElement;->b:Lt/u1;

    iput-object v0, p1, Ls/p0;->u:Lt/u1;

    const/4 v0, 0x0

    iput-object v0, p1, Ls/p0;->v:Lt/n1;

    iput-object v0, p1, Ls/p0;->w:Lt/n1;

    iput-object v0, p1, Ls/p0;->x:Lt/n1;

    iget-object v0, p0, Landroidx/compose/animation/EnterExitTransitionElement;->c:Ls/q0;

    iput-object v0, p1, Ls/p0;->y:Ls/q0;

    iget-object v0, p0, Landroidx/compose/animation/EnterExitTransitionElement;->d:Ls/r0;

    iput-object v0, p1, Ls/p0;->z:Ls/r0;

    iget-object v0, p0, Landroidx/compose/animation/EnterExitTransitionElement;->e:Ls/k0;

    iput-object v0, p1, Ls/p0;->A:Ls/k0;

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "EnterExitTransitionElement(transition="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Landroidx/compose/animation/EnterExitTransitionElement;->b:Lt/u1;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", sizeAnimation=null, offsetAnimation=null, slideAnimation=null, enter="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/animation/EnterExitTransitionElement;->c:Ls/q0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", exit="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/animation/EnterExitTransitionElement;->d:Ls/r0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", graphicsLayerBlock="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/animation/EnterExitTransitionElement;->e:Ls/k0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
