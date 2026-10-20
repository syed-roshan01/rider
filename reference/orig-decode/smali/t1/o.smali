.class public abstract Lt1/o;
.super Ly0/n;


# instance fields
.field public final u:I

.field public v:Ly0/n;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ly0/n;-><init>()V

    invoke-static {p0}, Lt1/g;->m(Ly0/n;)I

    move-result v0

    iput v0, p0, Lt1/o;->u:I

    return-void
.end method


# virtual methods
.method public final C0()V
    .locals 1

    invoke-super {p0}, Ly0/n;->C0()V

    iget-object v0, p0, Lt1/o;->v:Ly0/n;

    :goto_0
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ly0/n;->C0()V

    iget-object v0, v0, Ly0/n;->f:Ly0/n;

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final D0()V
    .locals 1

    iget-object v0, p0, Lt1/o;->v:Ly0/n;

    :goto_0
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ly0/n;->D0()V

    iget-object v0, v0, Ly0/n;->f:Ly0/n;

    goto :goto_0

    :cond_0
    invoke-super {p0}, Ly0/n;->D0()V

    return-void
.end method

.method public final E0()V
    .locals 1

    invoke-super {p0}, Ly0/n;->E0()V

    iget-object v0, p0, Lt1/o;->v:Ly0/n;

    :goto_0
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ly0/n;->E0()V

    iget-object v0, v0, Ly0/n;->f:Ly0/n;

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final F0(Lt1/c1;)V
    .locals 1

    iput-object p1, p0, Ly0/n;->o:Lt1/c1;

    iget-object v0, p0, Lt1/o;->v:Ly0/n;

    :goto_0
    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ly0/n;->F0(Lt1/c1;)V

    iget-object v0, v0, Ly0/n;->f:Ly0/n;

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final G0(Ly0/n;)V
    .locals 6

    iget-object v0, p1, Ly0/n;->a:Ly0/n;

    if-eq v0, p1, :cond_1

    iget-object p1, p1, Ly0/n;->e:Ly0/n;

    iget-object v1, p0, Ly0/n;->a:Ly0/n;

    if-ne v0, v1, :cond_0

    invoke-static {p1, p0}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Cannot delegate to an already delegated node"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-boolean p1, v0, Ly0/n;->t:Z

    xor-int/lit8 p1, p1, 0x1

    if-eqz p1, :cond_b

    iget-object p1, p0, Ly0/n;->a:Ly0/n;

    iput-object p1, v0, Ly0/n;->a:Ly0/n;

    iget p1, p0, Ly0/n;->c:I

    invoke-static {v0}, Lt1/g;->n(Ly0/n;)I

    move-result v1

    iput v1, v0, Ly0/n;->c:I

    iget v2, p0, Ly0/n;->c:I

    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_3

    and-int/lit8 v4, v2, 0x2

    if-eqz v4, :cond_3

    instance-of v4, p0, Lt1/b0;

    if-eqz v4, :cond_2

    goto :goto_0

    :cond_2
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v1, "Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: "

    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "\nDelegate Node: "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    :goto_0
    iget-object v4, p0, Lt1/o;->v:Ly0/n;

    iput-object v4, v0, Ly0/n;->f:Ly0/n;

    iput-object v0, p0, Lt1/o;->v:Ly0/n;

    iput-object p0, v0, Ly0/n;->e:Ly0/n;

    or-int/2addr v1, v2

    iput v1, p0, Ly0/n;->c:I

    if-eq v2, v1, :cond_7

    iget-object v2, p0, Ly0/n;->a:Ly0/n;

    if-ne v2, p0, :cond_4

    iput v1, p0, Ly0/n;->d:I

    :cond_4
    iget-boolean v4, p0, Ly0/n;->t:Z

    if-eqz v4, :cond_7

    move-object v4, p0

    :goto_1
    if-eqz v4, :cond_5

    iget v5, v4, Ly0/n;->c:I

    or-int/2addr v1, v5

    iput v1, v4, Ly0/n;->c:I

    if-eq v4, v2, :cond_5

    iget-object v4, v4, Ly0/n;->e:Ly0/n;

    goto :goto_1

    :cond_5
    if-eqz v4, :cond_6

    iget-object v2, v4, Ly0/n;->f:Ly0/n;

    if-eqz v2, :cond_6

    iget v2, v2, Ly0/n;->d:I

    goto :goto_2

    :cond_6
    const/4 v2, 0x0

    :goto_2
    or-int/2addr v1, v2

    :goto_3
    if-eqz v4, :cond_7

    iget v2, v4, Ly0/n;->c:I

    or-int/2addr v1, v2

    iput v1, v4, Ly0/n;->d:I

    iget-object v4, v4, Ly0/n;->e:Ly0/n;

    goto :goto_3

    :cond_7
    iget-boolean v1, p0, Ly0/n;->t:Z

    if-eqz v1, :cond_a

    if-eqz v3, :cond_9

    and-int/lit8 p1, p1, 0x2

    if-eqz p1, :cond_8

    goto :goto_4

    :cond_8
    invoke-static {p0}, Lt1/g;->y(Lt1/n;)Landroidx/compose/ui/node/a;

    move-result-object p1

    iget-object p1, p1, Landroidx/compose/ui/node/a;->C:Lt1/x0;

    iget-object v1, p0, Ly0/n;->a:Ly0/n;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ly0/n;->F0(Lt1/c1;)V

    invoke-virtual {p1}, Lt1/x0;->g()V

    goto :goto_5

    :cond_9
    :goto_4
    iget-object p1, p0, Ly0/n;->o:Lt1/c1;

    invoke-virtual {p0, p1}, Lt1/o;->F0(Lt1/c1;)V

    :goto_5
    invoke-virtual {v0}, Ly0/n;->x0()V

    invoke-virtual {v0}, Ly0/n;->D0()V

    invoke-static {v0}, Lt1/g;->h(Ly0/n;)V

    :cond_a
    return-void

    :cond_b
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Cannot delegate to an already attached node"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final x0()V
    .locals 2

    invoke-super {p0}, Ly0/n;->x0()V

    iget-object v0, p0, Lt1/o;->v:Ly0/n;

    :goto_0
    if-eqz v0, :cond_1

    iget-object v1, p0, Ly0/n;->o:Lt1/c1;

    invoke-virtual {v0, v1}, Ly0/n;->F0(Lt1/c1;)V

    iget-boolean v1, v0, Ly0/n;->t:Z

    if-nez v1, :cond_0

    invoke-virtual {v0}, Ly0/n;->x0()V

    :cond_0
    iget-object v0, v0, Ly0/n;->f:Ly0/n;

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final y0()V
    .locals 1

    iget-object v0, p0, Lt1/o;->v:Ly0/n;

    :goto_0
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ly0/n;->y0()V

    iget-object v0, v0, Ly0/n;->f:Ly0/n;

    goto :goto_0

    :cond_0
    invoke-super {p0}, Ly0/n;->y0()V

    return-void
.end method
