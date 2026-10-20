.class public final Lg2/h;
.super Ljava/lang/Object;

# interfaces
.implements Lg2/i;


# instance fields
.field public final a:I

.field public final b:I


# direct methods
.method public constructor <init>(II)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lg2/h;->a:I

    iput p2, p0, Lg2/h;->b:I

    if-ltz p1, :cond_0

    if-ltz p2, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " and "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " respectively."

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method


# virtual methods
.method public final a(Lg2/k;)V
    .locals 7

    const/4 v0, 0x0

    move v1, v0

    move v2, v1

    :goto_0
    iget v3, p0, Lg2/h;->a:I

    if-ge v1, v3, :cond_1

    add-int/lit8 v3, v2, 0x1

    iget v4, p1, Lg2/k;->b:I

    if-le v4, v3, :cond_0

    sub-int/2addr v4, v3

    add-int/lit8 v4, v4, -0x1

    invoke-virtual {p1, v4}, Lg2/k;->b(I)C

    move-result v4

    iget v5, p1, Lg2/k;->b:I

    sub-int/2addr v5, v3

    invoke-virtual {p1, v5}, Lg2/k;->b(I)C

    move-result v5

    invoke-static {v4}, Ljava/lang/Character;->isHighSurrogate(C)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-static {v5}, Ljava/lang/Character;->isLowSurrogate(C)Z

    move-result v4

    if-eqz v4, :cond_0

    add-int/lit8 v2, v2, 0x2

    goto :goto_1

    :cond_0
    move v2, v3

    :goto_1
    iget v3, p1, Lg2/k;->b:I

    if-eq v2, v3, :cond_1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    move v1, v0

    :goto_2
    iget v3, p0, Lg2/h;->b:I

    if-ge v0, v3, :cond_3

    add-int/lit8 v3, v1, 0x1

    iget v4, p1, Lg2/k;->c:I

    add-int/2addr v4, v3

    iget-object v5, p1, Lg2/k;->a:Lg2/t;

    invoke-virtual {v5}, Lg2/t;->a()I

    move-result v6

    if-ge v4, v6, :cond_2

    iget v4, p1, Lg2/k;->c:I

    add-int/2addr v4, v3

    add-int/lit8 v4, v4, -0x1

    invoke-virtual {p1, v4}, Lg2/k;->b(I)C

    move-result v4

    iget v6, p1, Lg2/k;->c:I

    add-int/2addr v6, v3

    invoke-virtual {p1, v6}, Lg2/k;->b(I)C

    move-result v6

    invoke-static {v4}, Ljava/lang/Character;->isHighSurrogate(C)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-static {v6}, Ljava/lang/Character;->isLowSurrogate(C)Z

    move-result v4

    if-eqz v4, :cond_2

    add-int/lit8 v1, v1, 0x2

    goto :goto_3

    :cond_2
    move v1, v3

    :goto_3
    iget v3, p1, Lg2/k;->c:I

    add-int/2addr v3, v1

    invoke-virtual {v5}, Lg2/t;->a()I

    move-result v4

    if-eq v3, v4, :cond_3

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_3
    iget v0, p1, Lg2/k;->c:I

    add-int/2addr v1, v0

    invoke-virtual {p1, v0, v1}, Lg2/k;->a(II)V

    iget v0, p1, Lg2/k;->b:I

    sub-int v1, v0, v2

    invoke-virtual {p1, v1, v0}, Lg2/k;->a(II)V

    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lg2/h;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lg2/h;

    iget v1, p1, Lg2/h;->a:I

    iget v3, p0, Lg2/h;->a:I

    if-eq v3, v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lg2/h;->b:I

    iget p1, p1, Lg2/h;->b:I

    if-eq v1, p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final hashCode()I
    .locals 2

    iget v0, p0, Lg2/h;->a:I

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lg2/h;->b:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lg2/h;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", lengthAfterCursor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lg2/h;->b:I

    const/16 v2, 0x29

    invoke-static {v0, v1, v2}, La7/a;->o(Ljava/lang/StringBuilder;IC)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
