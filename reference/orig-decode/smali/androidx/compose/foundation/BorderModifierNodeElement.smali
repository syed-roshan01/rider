.class public final Landroidx/compose/foundation/BorderModifierNodeElement;
.super Lt1/u0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lt1/u0;"
    }
.end annotation


# instance fields
.field public final b:F

.field public final c:Le1/n;

.field public final d:Le1/l0;


# direct methods
.method public constructor <init>(FLe1/n;Le1/l0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Landroidx/compose/foundation/BorderModifierNodeElement;->b:F

    iput-object p2, p0, Landroidx/compose/foundation/BorderModifierNodeElement;->c:Le1/n;

    iput-object p3, p0, Landroidx/compose/foundation/BorderModifierNodeElement;->d:Le1/l0;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Landroidx/compose/foundation/BorderModifierNodeElement;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Landroidx/compose/foundation/BorderModifierNodeElement;

    iget v1, p1, Landroidx/compose/foundation/BorderModifierNodeElement;->b:F

    iget v3, p0, Landroidx/compose/foundation/BorderModifierNodeElement;->b:F

    invoke-static {v3, v1}, Lm2/e;->a(FF)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Landroidx/compose/foundation/BorderModifierNodeElement;->c:Le1/n;

    iget-object v3, p1, Landroidx/compose/foundation/BorderModifierNodeElement;->c:Le1/n;

    invoke-static {v1, v3}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Landroidx/compose/foundation/BorderModifierNodeElement;->d:Le1/l0;

    iget-object p1, p1, Landroidx/compose/foundation/BorderModifierNodeElement;->d:Le1/l0;

    invoke-static {v1, p1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final hashCode()I
    .locals 2

    iget v0, p0, Landroidx/compose/foundation/BorderModifierNodeElement;->b:F

    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Landroidx/compose/foundation/BorderModifierNodeElement;->c:Le1/n;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Landroidx/compose/foundation/BorderModifierNodeElement;->d:Le1/l0;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public final l()Ly0/n;
    .locals 4

    new-instance v0, Lu/v;

    iget-object v1, p0, Landroidx/compose/foundation/BorderModifierNodeElement;->c:Le1/n;

    iget-object v2, p0, Landroidx/compose/foundation/BorderModifierNodeElement;->d:Le1/l0;

    iget v3, p0, Landroidx/compose/foundation/BorderModifierNodeElement;->b:F

    invoke-direct {v0, v3, v1, v2}, Lu/v;-><init>(FLe1/n;Le1/l0;)V

    return-object v0
.end method

.method public final m(Ly0/n;)V
    .locals 3

    check-cast p1, Lu/v;

    iget v0, p1, Lu/v;->x:F

    iget v1, p0, Landroidx/compose/foundation/BorderModifierNodeElement;->b:F

    invoke-static {v0, v1}, Lm2/e;->a(FF)Z

    move-result v0

    iget-object v2, p1, Lu/v;->A:Lb1/b;

    if-nez v0, :cond_0

    iput v1, p1, Lu/v;->x:F

    move-object v0, v2

    check-cast v0, Lb1/c;

    invoke-virtual {v0}, Lb1/c;->G0()V

    :cond_0
    iget-object v0, p1, Lu/v;->y:Le1/n;

    iget-object v1, p0, Landroidx/compose/foundation/BorderModifierNodeElement;->c:Le1/n;

    invoke-static {v0, v1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iput-object v1, p1, Lu/v;->y:Le1/n;

    move-object v0, v2

    check-cast v0, Lb1/c;

    invoke-virtual {v0}, Lb1/c;->G0()V

    :cond_1
    iget-object v0, p1, Lu/v;->z:Le1/l0;

    iget-object v1, p0, Landroidx/compose/foundation/BorderModifierNodeElement;->d:Le1/l0;

    invoke-static {v0, v1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    iput-object v1, p1, Lu/v;->z:Le1/l0;

    check-cast v2, Lb1/c;

    invoke-virtual {v2}, Lb1/c;->G0()V

    :cond_2
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "BorderModifierNodeElement(width="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Landroidx/compose/foundation/BorderModifierNodeElement;->b:F

    invoke-static {v1}, Lm2/e;->b(F)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", brush="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/foundation/BorderModifierNodeElement;->c:Le1/n;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", shape="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/foundation/BorderModifierNodeElement;->d:Le1/l0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
