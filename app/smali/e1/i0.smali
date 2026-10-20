.class public final Le1/i0;
.super Ljava/lang/Object;

# interfaces
.implements Le1/w;


# instance fields
.field public a:I

.field public b:F

.field public c:F

.field public d:F

.field public e:F

.field public f:F

.field public n:F

.field public o:J

.field public p:J

.field public q:F

.field public r:F

.field public s:F

.field public t:F

.field public u:J

.field public v:Le1/l0;

.field public w:Z

.field public x:I

.field public y:Lm2/b;


# virtual methods
.method public final a(F)V
    .locals 1

    iget v0, p0, Le1/i0;->d:F

    cmpg-float v0, v0, p1

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget v0, p0, Le1/i0;->a:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Le1/i0;->a:I

    iput p1, p0, Le1/i0;->d:F

    :goto_0
    return-void
.end method

.method public final b(F)V
    .locals 1

    iget v0, p0, Le1/i0;->b:F

    cmpg-float v0, v0, p1

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget v0, p0, Le1/i0;->a:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Le1/i0;->a:I

    iput p1, p0, Le1/i0;->b:F

    :goto_0
    return-void
.end method

.method public final c()F
    .locals 1

    iget-object v0, p0, Le1/i0;->y:Lm2/b;

    invoke-interface {v0}, Lm2/b;->c()F

    move-result v0

    return v0
.end method

.method public final d(F)V
    .locals 1

    iget v0, p0, Le1/i0;->c:F

    cmpg-float v0, v0, p1

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget v0, p0, Le1/i0;->a:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Le1/i0;->a:I

    iput p1, p0, Le1/i0;->c:F

    :goto_0
    return-void
.end method

.method public final f(J)V
    .locals 3

    iget-wide v0, p0, Le1/i0;->u:J

    sget v2, Le1/p0;->c:I

    cmp-long v0, v0, p1

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget v0, p0, Le1/i0;->a:I

    or-int/lit16 v0, v0, 0x1000

    iput v0, p0, Le1/i0;->a:I

    iput-wide p1, p0, Le1/i0;->u:J

    :goto_0
    return-void
.end method

.method public final m()F
    .locals 1

    iget-object v0, p0, Le1/i0;->y:Lm2/b;

    invoke-interface {v0}, Lm2/b;->m()F

    move-result v0

    return v0
.end method
