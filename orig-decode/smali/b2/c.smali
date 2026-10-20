.class public final Lb2/c;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/text/CharacterIterator;


# instance fields
.field public final a:Ljava/lang/CharSequence;

.field public final b:I

.field public final c:I

.field public d:I


# direct methods
.method public constructor <init>(Ljava/lang/CharSequence;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb2/c;->a:Ljava/lang/CharSequence;

    const/4 p1, 0x0

    iput p1, p0, Lb2/c;->b:I

    iput p2, p0, Lb2/c;->c:I

    iput p1, p0, Lb2/c;->d:I

    return-void
.end method


# virtual methods
.method public final clone()Ljava/lang/Object;
    .locals 1

    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    new-instance v0, Ljava/lang/InternalError;

    invoke-direct {v0}, Ljava/lang/InternalError;-><init>()V

    throw v0
.end method

.method public final current()C
    .locals 2

    iget v0, p0, Lb2/c;->d:I

    iget v1, p0, Lb2/c;->c:I

    if-ne v0, v1, :cond_0

    const v0, 0xffff

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lb2/c;->a:Ljava/lang/CharSequence;

    invoke-interface {v1, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    :goto_0
    return v0
.end method

.method public final first()C
    .locals 1

    iget v0, p0, Lb2/c;->b:I

    iput v0, p0, Lb2/c;->d:I

    invoke-virtual {p0}, Lb2/c;->current()C

    move-result v0

    return v0
.end method

.method public final getBeginIndex()I
    .locals 1

    iget v0, p0, Lb2/c;->b:I

    return v0
.end method

.method public final getEndIndex()I
    .locals 1

    iget v0, p0, Lb2/c;->c:I

    return v0
.end method

.method public final getIndex()I
    .locals 1

    iget v0, p0, Lb2/c;->d:I

    return v0
.end method

.method public final last()C
    .locals 2

    iget v0, p0, Lb2/c;->b:I

    iget v1, p0, Lb2/c;->c:I

    if-ne v0, v1, :cond_0

    iput v1, p0, Lb2/c;->d:I

    const v0, 0xffff

    goto :goto_0

    :cond_0
    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Lb2/c;->d:I

    iget-object v0, p0, Lb2/c;->a:Ljava/lang/CharSequence;

    invoke-interface {v0, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    :goto_0
    return v0
.end method

.method public final next()C
    .locals 2

    iget v0, p0, Lb2/c;->d:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lb2/c;->d:I

    iget v1, p0, Lb2/c;->c:I

    if-lt v0, v1, :cond_0

    iput v1, p0, Lb2/c;->d:I

    const v0, 0xffff

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lb2/c;->a:Ljava/lang/CharSequence;

    invoke-interface {v1, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    :goto_0
    return v0
.end method

.method public final previous()C
    .locals 2

    iget v0, p0, Lb2/c;->d:I

    iget v1, p0, Lb2/c;->b:I

    if-gt v0, v1, :cond_0

    const v0, 0xffff

    goto :goto_0

    :cond_0
    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lb2/c;->d:I

    iget-object v1, p0, Lb2/c;->a:Ljava/lang/CharSequence;

    invoke-interface {v1, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    :goto_0
    return v0
.end method

.method public final setIndex(I)C
    .locals 1

    iget v0, p0, Lb2/c;->c:I

    if-gt p1, v0, :cond_0

    iget v0, p0, Lb2/c;->b:I

    if-gt v0, p1, :cond_0

    iput p1, p0, Lb2/c;->d:I

    invoke-virtual {p0}, Lb2/c;->current()C

    move-result p1

    return p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "invalid position"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
