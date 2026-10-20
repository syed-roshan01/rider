.class public final Le1/z;
.super Le1/j0;


# instance fields
.field public final c:Ljava/util/List;

.field public final d:Ljava/util/List;

.field public final e:J

.field public final f:J

.field public final g:I


# direct methods
.method public constructor <init>(Ljava/util/List;JJI)V
    .locals 0

    invoke-direct {p0}, Le1/j0;-><init>()V

    iput-object p1, p0, Le1/z;->c:Ljava/util/List;

    const/4 p1, 0x0

    iput-object p1, p0, Le1/z;->d:Ljava/util/List;

    iput-wide p2, p0, Le1/z;->e:J

    iput-wide p4, p0, Le1/z;->f:J

    iput p6, p0, Le1/z;->g:I

    return-void
.end method


# virtual methods
.method public final b(J)Landroid/graphics/Shader;
    .locals 13

    iget-wide v0, p0, Le1/z;->e:J

    invoke-static {v0, v1}, Ld1/c;->d(J)F

    move-result v2

    const/high16 v3, 0x7f800000    # Float.POSITIVE_INFINITY

    cmpg-float v2, v2, v3

    if-nez v2, :cond_0

    invoke-static {p1, p2}, Ld1/f;->d(J)F

    move-result v2

    goto :goto_0

    :cond_0
    invoke-static {v0, v1}, Ld1/c;->d(J)F

    move-result v2

    :goto_0
    invoke-static {v0, v1}, Ld1/c;->e(J)F

    move-result v4

    cmpg-float v4, v4, v3

    if-nez v4, :cond_1

    invoke-static {p1, p2}, Ld1/f;->b(J)F

    move-result v0

    goto :goto_1

    :cond_1
    invoke-static {v0, v1}, Ld1/c;->e(J)F

    move-result v0

    :goto_1
    iget-wide v4, p0, Le1/z;->f:J

    invoke-static {v4, v5}, Ld1/c;->d(J)F

    move-result v1

    cmpg-float v1, v1, v3

    if-nez v1, :cond_2

    invoke-static {p1, p2}, Ld1/f;->d(J)F

    move-result v1

    goto :goto_2

    :cond_2
    invoke-static {v4, v5}, Ld1/c;->d(J)F

    move-result v1

    :goto_2
    invoke-static {v4, v5}, Ld1/c;->e(J)F

    move-result v6

    cmpg-float v3, v6, v3

    if-nez v3, :cond_3

    invoke-static {p1, p2}, Ld1/f;->b(J)F

    move-result p1

    goto :goto_3

    :cond_3
    invoke-static {v4, v5}, Ld1/c;->e(J)F

    move-result p1

    :goto_3
    invoke-static {v2, v0}, Ld9/i;->f(FF)J

    move-result-wide v2

    invoke-static {v1, p1}, Ld9/i;->f(FF)J

    move-result-wide p1

    iget-object v0, p0, Le1/z;->c:Ljava/util/List;

    iget-object v1, p0, Le1/z;->d:Ljava/util/List;

    invoke-static {v0, v1}, Landroidx/compose/ui/graphics/a;->v(Ljava/util/List;Ljava/util/List;)V

    new-instance v12, Landroid/graphics/LinearGradient;

    invoke-static {v2, v3}, Ld1/c;->d(J)F

    move-result v5

    invoke-static {v2, v3}, Ld1/c;->e(J)F

    move-result v6

    invoke-static {p1, p2}, Ld1/c;->d(J)F

    move-result v7

    invoke-static {p1, p2}, Ld1/c;->e(J)F

    move-result v8

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p1

    new-array v9, p1, [I

    const/4 p2, 0x0

    :goto_4
    if-ge p2, p1, :cond_4

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Le1/r;

    iget-wide v2, v2, Le1/r;->a:J

    invoke-static {v2, v3}, Landroidx/compose/ui/graphics/a;->s(J)I

    move-result v2

    aput v2, v9, p2

    add-int/lit8 p2, p2, 0x1

    goto :goto_4

    :cond_4
    invoke-static {v1, v0}, Landroidx/compose/ui/graphics/a;->n(Ljava/util/List;Ljava/util/List;)[F

    move-result-object v10

    iget p1, p0, Le1/z;->g:I

    invoke-static {p1}, Landroidx/compose/ui/graphics/a;->r(I)Landroid/graphics/Shader$TileMode;

    move-result-object v11

    move-object v4, v12

    invoke-direct/range {v4 .. v11}, Landroid/graphics/LinearGradient;-><init>(FFFF[I[FLandroid/graphics/Shader$TileMode;)V

    return-object v12
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Le1/z;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Le1/z;

    iget-object v1, p1, Le1/z;->c:Ljava/util/List;

    iget-object v3, p0, Le1/z;->c:Ljava/util/List;

    invoke-static {v3, v1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Le1/z;->d:Ljava/util/List;

    iget-object v3, p1, Le1/z;->d:Ljava/util/List;

    invoke-static {v1, v3}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Le1/z;->e:J

    iget-wide v5, p1, Le1/z;->e:J

    invoke-static {v3, v4, v5, v6}, Ld1/c;->b(JJ)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Le1/z;->f:J

    iget-wide v5, p1, Le1/z;->f:J

    invoke-static {v3, v4, v5, v6}, Ld1/c;->b(JJ)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget v1, p0, Le1/z;->g:I

    iget p1, p1, Le1/z;->g:I

    invoke-static {v1, p1}, Le1/g0;->h(II)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final hashCode()I
    .locals 4

    iget-object v0, p0, Le1/z;->c:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Le1/z;->d:Ljava/util/List;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    sget v2, Ld1/c;->e:I

    iget-wide v2, p0, Le1/z;->e:J

    invoke-static {v2, v3, v0, v1}, Ll/q;->b(JII)I

    move-result v0

    iget-wide v2, p0, Le1/z;->f:J

    invoke-static {v2, v3, v0, v1}, Ll/q;->b(JII)I

    move-result v0

    iget v1, p0, Le1/z;->g:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    iget-wide v0, p0, Le1/z;->e:J

    invoke-static {v0, v1}, Ld9/i;->s(J)Z

    move-result v2

    const-string v3, ""

    const-string v4, ", "

    if-eqz v2, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v5, "start="

    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v1}, Ld1/c;->i(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v3

    :goto_0
    iget-wide v1, p0, Le1/z;->f:J

    invoke-static {v1, v2}, Ld9/i;->s(J)Z

    move-result v5

    if-eqz v5, :cond_1

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v5, "end="

    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v1, v2}, Ld1/c;->i(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "LinearGradient(colors="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Le1/z;->c:Ljava/util/List;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", stops="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Le1/z;->d:Ljava/util/List;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "tileMode="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Le1/z;->g:I

    invoke-static {v0}, Le1/g0;->i(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v0, 0x29

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
