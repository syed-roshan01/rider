.class public final Lp1/b;
.super Ljava/lang/Object;


# instance fields
.field public a:I

.field public b:[J


# virtual methods
.method public final a(J)V
    .locals 5

    iget v0, p0, Lp1/b;->a:I

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    iget-object v2, p0, Lp1/b;->b:[J

    aget-wide v3, v2, v1

    cmp-long v2, v3, p1

    if-nez v2, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    iget v0, p0, Lp1/b;->a:I

    iget-object v1, p0, Lp1/b;->b:[J

    array-length v2, v1

    if-lt v0, v2, :cond_2

    add-int/lit8 v2, v0, 0x1

    array-length v3, v1

    mul-int/lit8 v3, v3, 0x2

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v2

    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v1

    const-string v2, "copyOf(this, newSize)"

    invoke-static {v1, v2}, Ld7/a;->l(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p0, Lp1/b;->b:[J

    :cond_2
    iget-object v1, p0, Lp1/b;->b:[J

    aput-wide p1, v1, v0

    iget p1, p0, Lp1/b;->a:I

    if-lt v0, p1, :cond_3

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lp1/b;->a:I

    :cond_3
    :goto_1
    return-void
.end method

.method public final b(I)V
    .locals 5

    iget v0, p0, Lp1/b;->a:I

    if-ge p1, v0, :cond_1

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ge p1, v0, :cond_0

    iget-object v1, p0, Lp1/b;->b:[J

    add-int/lit8 v2, p1, 0x1

    aget-wide v3, v1, v2

    aput-wide v3, v1, p1

    move p1, v2

    goto :goto_0

    :cond_0
    iget p1, p0, Lp1/b;->a:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Lp1/b;->a:I

    :cond_1
    return-void
.end method
