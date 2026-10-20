.class public final La2/p;
.super Ljava/lang/Object;


# instance fields
.field public final a:I

.field public final b:I

.field public final c:J

.field public final d:Ll2/q;

.field public final e:La2/r;

.field public final f:Ll2/g;

.field public final g:I

.field public final h:I

.field public final i:Ll2/r;


# direct methods
.method public constructor <init>(IIJLl2/q;La2/r;Ll2/g;IILl2/r;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, La2/p;->a:I

    iput p2, p0, La2/p;->b:I

    iput-wide p3, p0, La2/p;->c:J

    iput-object p5, p0, La2/p;->d:Ll2/q;

    iput-object p6, p0, La2/p;->e:La2/r;

    iput-object p7, p0, La2/p;->f:Ll2/g;

    iput p8, p0, La2/p;->g:I

    iput p9, p0, La2/p;->h:I

    iput-object p10, p0, La2/p;->i:Ll2/r;

    sget-wide p1, Lm2/n;->c:J

    invoke-static {p3, p4, p1, p2}, Lm2/n;->a(JJ)Z

    move-result p1

    if-nez p1, :cond_1

    invoke-static {p3, p4}, Lm2/n;->c(J)F

    move-result p1

    const/4 p2, 0x0

    cmpl-float p1, p1, p2

    if-ltz p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "lineHeight can\'t be negative ("

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p3, p4}, Lm2/n;->c(J)F

    move-result p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const/16 p2, 0x29

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public final a(La2/p;)La2/p;
    .locals 11

    if-nez p1, :cond_0

    return-object p0

    :cond_0
    iget v1, p1, La2/p;->a:I

    iget v2, p1, La2/p;->b:I

    iget-wide v3, p1, La2/p;->c:J

    iget-object v5, p1, La2/p;->d:Ll2/q;

    iget-object v6, p1, La2/p;->e:La2/r;

    iget-object v7, p1, La2/p;->f:Ll2/g;

    iget v8, p1, La2/p;->g:I

    iget v9, p1, La2/p;->h:I

    iget-object v10, p1, La2/p;->i:Ll2/r;

    move-object v0, p0

    invoke-static/range {v0 .. v10}, La2/q;->a(La2/p;IIJLl2/q;La2/r;Ll2/g;IILl2/r;)La2/p;

    move-result-object p1

    return-object p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, La2/p;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, La2/p;

    iget v1, p1, La2/p;->a:I

    iget v3, p0, La2/p;->a:I

    invoke-static {v3, v1}, Ll2/i;->a(II)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, La2/p;->b:I

    iget v3, p1, La2/p;->b:I

    invoke-static {v1, v3}, Ll2/k;->a(II)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, La2/p;->c:J

    iget-wide v5, p1, La2/p;->c:J

    invoke-static {v3, v4, v5, v6}, Lm2/n;->a(JJ)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, La2/p;->d:Ll2/q;

    iget-object v3, p1, La2/p;->d:Ll2/q;

    invoke-static {v1, v3}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, La2/p;->e:La2/r;

    iget-object v3, p1, La2/p;->e:La2/r;

    invoke-static {v1, v3}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, La2/p;->f:Ll2/g;

    iget-object v3, p1, La2/p;->f:Ll2/g;

    invoke-static {v1, v3}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget v1, p0, La2/p;->g:I

    iget v3, p1, La2/p;->g:I

    if-ne v1, v3, :cond_a

    iget v1, p0, La2/p;->h:I

    iget v3, p1, La2/p;->h:I

    invoke-static {v1, v3}, Ll2/d;->a(II)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, La2/p;->i:Ll2/r;

    iget-object p1, p1, La2/p;->i:Ll2/r;

    invoke-static {v1, p1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    return v2

    :cond_9
    return v0

    :cond_a
    return v2
.end method

.method public final hashCode()I
    .locals 4

    iget v0, p0, La2/p;->a:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, La2/p;->b:I

    invoke-static {v2, v0, v1}, La7/a;->u(III)I

    move-result v0

    sget-object v2, Lm2/n;->b:[Lm2/o;

    iget-wide v2, p0, La2/p;->c:J

    invoke-static {v2, v3, v0, v1}, Ll/q;->b(JII)I

    move-result v0

    const/4 v2, 0x0

    iget-object v3, p0, La2/p;->d:Ll2/q;

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Ll2/q;->hashCode()I

    move-result v3

    goto :goto_0

    :cond_0
    move v3, v2

    :goto_0
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, La2/p;->e:La2/r;

    if-eqz v3, :cond_1

    invoke-virtual {v3}, La2/r;->hashCode()I

    move-result v3

    goto :goto_1

    :cond_1
    move v3, v2

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, La2/p;->f:Ll2/g;

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Ll2/g;->hashCode()I

    move-result v3

    goto :goto_2

    :cond_2
    move v3, v2

    :goto_2
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget v3, p0, La2/p;->g:I

    invoke-static {v3, v0, v1}, La7/a;->u(III)I

    move-result v0

    iget v3, p0, La2/p;->h:I

    invoke-static {v3, v0, v1}, La7/a;->u(III)I

    move-result v0

    iget-object v1, p0, La2/p;->i:Ll2/r;

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Ll2/r;->hashCode()I

    move-result v2

    :cond_3
    add-int/2addr v0, v2

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ParagraphStyle(textAlign="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, La2/p;->a:I

    invoke-static {v1}, Ll2/i;->b(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", textDirection="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, La2/p;->b:I

    invoke-static {v1}, Ll2/k;->b(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", lineHeight="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, La2/p;->c:J

    invoke-static {v1, v2}, Lm2/n;->d(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", textIndent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, La2/p;->d:Ll2/q;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", platformStyle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, La2/p;->e:La2/r;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", lineHeightStyle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, La2/p;->f:Ll2/g;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", lineBreak="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, La2/p;->g:I

    invoke-static {v1}, Ll2/e;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", hyphens="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, La2/p;->h:I

    invoke-static {v1}, Ll2/d;->b(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", textMotion="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, La2/p;->i:Ll2/r;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
