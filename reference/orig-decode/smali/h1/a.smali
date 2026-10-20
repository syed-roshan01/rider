.class public final Lh1/a;
.super Lh1/c;


# instance fields
.field public final f:Le1/y;

.field public final n:J

.field public final o:J

.field public p:I

.field public final q:J

.field public r:F

.field public s:Le1/l;


# direct methods
.method public constructor <init>(Le1/y;JJ)V
    .locals 3

    invoke-direct {p0}, Lh1/c;-><init>()V

    iput-object p1, p0, Lh1/a;->f:Le1/y;

    iput-wide p2, p0, Lh1/a;->n:J

    iput-wide p4, p0, Lh1/a;->o:J

    const/4 v0, 0x1

    iput v0, p0, Lh1/a;->p:I

    sget v0, Lm2/i;->c:I

    const/16 v0, 0x20

    shr-long v1, p2, v0

    long-to-int v1, v1

    if-ltz v1, :cond_0

    const-wide v1, 0xffffffffL

    and-long/2addr p2, v1

    long-to-int p2, p2

    if-ltz p2, :cond_0

    shr-long p2, p4, v0

    long-to-int p2, p2

    if-ltz p2, :cond_0

    and-long v0, p4, v1

    long-to-int p3, v0

    if-ltz p3, :cond_0

    check-cast p1, Le1/f;

    iget-object v0, p1, Le1/f;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    if-gt p2, v0, :cond_0

    iget-object p1, p1, Le1/f;->a:Landroid/graphics/Bitmap;

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result p1

    if-gt p3, p1, :cond_0

    iput-wide p4, p0, Lh1/a;->q:J

    const/high16 p1, 0x3f800000    # 1.0f

    iput p1, p0, Lh1/a;->r:F

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Failed requirement."

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final c(F)Z
    .locals 0

    iput p1, p0, Lh1/a;->r:F

    const/4 p1, 0x1

    return p1
.end method

.method public final e(Le1/l;)Z
    .locals 0

    iput-object p1, p0, Lh1/a;->s:Le1/l;

    const/4 p1, 0x1

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lh1/a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lh1/a;

    iget-object v1, p1, Lh1/a;->f:Le1/y;

    iget-object v3, p0, Lh1/a;->f:Le1/y;

    invoke-static {v3, v1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lh1/a;->n:J

    iget-wide v5, p1, Lh1/a;->n:J

    invoke-static {v3, v4, v5, v6}, Lm2/i;->a(JJ)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Lh1/a;->o:J

    iget-wide v5, p1, Lh1/a;->o:J

    invoke-static {v3, v4, v5, v6}, Lm2/k;->a(JJ)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lh1/a;->p:I

    iget p1, p1, Lh1/a;->p:I

    invoke-static {v1, p1}, Le1/g0;->d(II)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final h()J
    .locals 2

    iget-wide v0, p0, Lh1/a;->q:J

    invoke-static {v0, v1}, Lo1/s;->m0(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public final hashCode()I
    .locals 4

    iget-object v0, p0, Lh1/a;->f:Le1/y;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    sget v2, Lm2/i;->c:I

    iget-wide v2, p0, Lh1/a;->n:J

    invoke-static {v2, v3, v0, v1}, Ll/q;->b(JII)I

    move-result v0

    iget-wide v2, p0, Lh1/a;->o:J

    invoke-static {v2, v3, v0, v1}, Ll/q;->b(JII)I

    move-result v0

    iget v1, p0, Lh1/a;->p:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final i(Lg1/g;)V
    .locals 12

    iget-object v1, p0, Lh1/a;->f:Le1/y;

    iget-wide v2, p0, Lh1/a;->n:J

    iget-wide v4, p0, Lh1/a;->o:J

    invoke-interface {p1}, Lg1/g;->e()J

    move-result-wide v6

    invoke-static {v6, v7}, Ld1/f;->d(J)F

    move-result v0

    invoke-static {v0}, Ld7/t;->p0(F)I

    move-result v0

    invoke-interface {p1}, Lg1/g;->e()J

    move-result-wide v6

    invoke-static {v6, v7}, Ld1/f;->b(J)F

    move-result v6

    invoke-static {v6}, Ld7/t;->p0(F)I

    move-result v6

    invoke-static {v0, v6}, Lo1/s;->e(II)J

    move-result-wide v6

    iget v8, p0, Lh1/a;->r:F

    iget-object v9, p0, Lh1/a;->s:Le1/l;

    iget v10, p0, Lh1/a;->p:I

    const/16 v11, 0x148

    move-object v0, p1

    invoke-static/range {v0 .. v11}, Lg1/g;->C(Lg1/g;Le1/y;JJJFLe1/l;II)V

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "BitmapPainter(image="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lh1/a;->f:Le1/y;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", srcOffset="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lh1/a;->n:J

    invoke-static {v1, v2}, Lm2/i;->b(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", srcSize="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lh1/a;->o:J

    invoke-static {v1, v2}, Lm2/k;->b(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", filterQuality="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lh1/a;->p:I

    const/4 v2, 0x0

    invoke-static {v1, v2}, Le1/g0;->d(II)Z

    move-result v2

    if-eqz v2, :cond_0

    const-string v1, "None"

    goto :goto_0

    :cond_0
    const/4 v2, 0x1

    invoke-static {v1, v2}, Le1/g0;->d(II)Z

    move-result v2

    if-eqz v2, :cond_1

    const-string v1, "Low"

    goto :goto_0

    :cond_1
    const/4 v2, 0x2

    invoke-static {v1, v2}, Le1/g0;->d(II)Z

    move-result v2

    if-eqz v2, :cond_2

    const-string v1, "Medium"

    goto :goto_0

    :cond_2
    const/4 v2, 0x3

    invoke-static {v1, v2}, Le1/g0;->d(II)Z

    move-result v1

    if-eqz v1, :cond_3

    const-string v1, "High"

    goto :goto_0

    :cond_3
    const-string v1, "Unknown"

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
