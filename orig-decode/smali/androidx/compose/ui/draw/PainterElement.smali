.class final Landroidx/compose/ui/draw/PainterElement;
.super Lt1/u0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lt1/u0;"
    }
.end annotation


# instance fields
.field public final b:Lh1/c;

.field public final c:Z

.field public final d:Ly0/d;

.field public final e:Lr1/l;

.field public final f:F

.field public final g:Le1/l;


# direct methods
.method public constructor <init>(Lh1/c;ZLy0/d;Lr1/l;FLe1/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/draw/PainterElement;->b:Lh1/c;

    iput-boolean p2, p0, Landroidx/compose/ui/draw/PainterElement;->c:Z

    iput-object p3, p0, Landroidx/compose/ui/draw/PainterElement;->d:Ly0/d;

    iput-object p4, p0, Landroidx/compose/ui/draw/PainterElement;->e:Lr1/l;

    iput p5, p0, Landroidx/compose/ui/draw/PainterElement;->f:F

    iput-object p6, p0, Landroidx/compose/ui/draw/PainterElement;->g:Le1/l;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Landroidx/compose/ui/draw/PainterElement;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Landroidx/compose/ui/draw/PainterElement;

    iget-object v1, p1, Landroidx/compose/ui/draw/PainterElement;->b:Lh1/c;

    iget-object v3, p0, Landroidx/compose/ui/draw/PainterElement;->b:Lh1/c;

    invoke-static {v3, v1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Landroidx/compose/ui/draw/PainterElement;->c:Z

    iget-boolean v3, p1, Landroidx/compose/ui/draw/PainterElement;->c:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Landroidx/compose/ui/draw/PainterElement;->d:Ly0/d;

    iget-object v3, p1, Landroidx/compose/ui/draw/PainterElement;->d:Ly0/d;

    invoke-static {v1, v3}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Landroidx/compose/ui/draw/PainterElement;->e:Lr1/l;

    iget-object v3, p1, Landroidx/compose/ui/draw/PainterElement;->e:Lr1/l;

    invoke-static {v1, v3}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget v1, p0, Landroidx/compose/ui/draw/PainterElement;->f:F

    iget v3, p1, Landroidx/compose/ui/draw/PainterElement;->f:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Landroidx/compose/ui/draw/PainterElement;->g:Le1/l;

    iget-object p1, p1, Landroidx/compose/ui/draw/PainterElement;->g:Le1/l;

    invoke-static {v1, p1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Landroidx/compose/ui/draw/PainterElement;->b:Lh1/c;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Landroidx/compose/ui/draw/PainterElement;->c:Z

    invoke-static {v2, v0, v1}, Ll/q;->c(ZII)I

    move-result v0

    iget-object v2, p0, Landroidx/compose/ui/draw/PainterElement;->d:Ly0/d;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Landroidx/compose/ui/draw/PainterElement;->e:Lr1/l;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v2, p0, Landroidx/compose/ui/draw/PainterElement;->f:F

    invoke-static {v2, v0, v1}, Ll/q;->a(FII)I

    move-result v0

    iget-object v1, p0, Landroidx/compose/ui/draw/PainterElement;->g:Le1/l;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Le1/l;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public final l()Ly0/n;
    .locals 2

    new-instance v0, Lb1/j;

    invoke-direct {v0}, Ly0/n;-><init>()V

    iget-object v1, p0, Landroidx/compose/ui/draw/PainterElement;->b:Lh1/c;

    iput-object v1, v0, Lb1/j;->u:Lh1/c;

    iget-boolean v1, p0, Landroidx/compose/ui/draw/PainterElement;->c:Z

    iput-boolean v1, v0, Lb1/j;->v:Z

    iget-object v1, p0, Landroidx/compose/ui/draw/PainterElement;->d:Ly0/d;

    iput-object v1, v0, Lb1/j;->w:Ly0/d;

    iget-object v1, p0, Landroidx/compose/ui/draw/PainterElement;->e:Lr1/l;

    iput-object v1, v0, Lb1/j;->x:Lr1/l;

    iget v1, p0, Landroidx/compose/ui/draw/PainterElement;->f:F

    iput v1, v0, Lb1/j;->y:F

    iget-object v1, p0, Landroidx/compose/ui/draw/PainterElement;->g:Le1/l;

    iput-object v1, v0, Lb1/j;->z:Le1/l;

    return-object v0
.end method

.method public final m(Ly0/n;)V
    .locals 7

    check-cast p1, Lb1/j;

    iget-boolean v0, p1, Lb1/j;->v:Z

    iget-object v1, p0, Landroidx/compose/ui/draw/PainterElement;->b:Lh1/c;

    iget-boolean v2, p0, Landroidx/compose/ui/draw/PainterElement;->c:Z

    if-ne v0, v2, :cond_1

    if-eqz v2, :cond_0

    iget-object v0, p1, Lb1/j;->u:Lh1/c;

    invoke-virtual {v0}, Lh1/c;->h()J

    move-result-wide v3

    invoke-virtual {v1}, Lh1/c;->h()J

    move-result-wide v5

    invoke-static {v3, v4, v5, v6}, Ld1/f;->a(JJ)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    iput-object v1, p1, Lb1/j;->u:Lh1/c;

    iput-boolean v2, p1, Lb1/j;->v:Z

    iget-object v1, p0, Landroidx/compose/ui/draw/PainterElement;->d:Ly0/d;

    iput-object v1, p1, Lb1/j;->w:Ly0/d;

    iget-object v1, p0, Landroidx/compose/ui/draw/PainterElement;->e:Lr1/l;

    iput-object v1, p1, Lb1/j;->x:Lr1/l;

    iget v1, p0, Landroidx/compose/ui/draw/PainterElement;->f:F

    iput v1, p1, Lb1/j;->y:F

    iget-object v1, p0, Landroidx/compose/ui/draw/PainterElement;->g:Le1/l;

    iput-object v1, p1, Lb1/j;->z:Le1/l;

    if-eqz v0, :cond_2

    invoke-static {p1}, Lt1/g;->t(Lt1/b0;)V

    :cond_2
    invoke-static {p1}, Lt1/g;->s(Lt1/s;)V

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "PainterElement(painter="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Landroidx/compose/ui/draw/PainterElement;->b:Lh1/c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", sizeToIntrinsics="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Landroidx/compose/ui/draw/PainterElement;->c:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", alignment="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/ui/draw/PainterElement;->d:Ly0/d;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", contentScale="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/ui/draw/PainterElement;->e:Lr1/l;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", alpha="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroidx/compose/ui/draw/PainterElement;->f:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", colorFilter="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/ui/draw/PainterElement;->g:Le1/l;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
