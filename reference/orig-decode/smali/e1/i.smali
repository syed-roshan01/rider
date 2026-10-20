.class public final Le1/i;
.super Ljava/lang/Object;

# interfaces
.implements Le1/d0;


# instance fields
.field public final a:Landroid/graphics/Path;

.field public b:Landroid/graphics/RectF;

.field public c:[F


# direct methods
.method public constructor <init>(Landroid/graphics/Path;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le1/i;->a:Landroid/graphics/Path;

    return-void
.end method


# virtual methods
.method public final a(Ld1/e;)V
    .locals 5

    iget-object v0, p0, Le1/i;->b:Landroid/graphics/RectF;

    if-nez v0, :cond_0

    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Le1/i;->b:Landroid/graphics/RectF;

    :cond_0
    iget-object v0, p0, Le1/i;->b:Landroid/graphics/RectF;

    invoke-static {v0}, Ld7/a;->j(Ljava/lang/Object;)V

    iget v1, p1, Ld1/e;->a:F

    iget v2, p1, Ld1/e;->b:F

    iget v3, p1, Ld1/e;->c:F

    iget v4, p1, Ld1/e;->d:F

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/RectF;->set(FFFF)V

    iget-object v0, p0, Le1/i;->c:[F

    if-nez v0, :cond_1

    const/16 v0, 0x8

    new-array v0, v0, [F

    iput-object v0, p0, Le1/i;->c:[F

    :cond_1
    iget-object v0, p0, Le1/i;->c:[F

    invoke-static {v0}, Ld7/a;->j(Ljava/lang/Object;)V

    iget-wide v1, p1, Ld1/e;->e:J

    invoke-static {v1, v2}, Ld1/a;->b(J)F

    move-result v3

    const/4 v4, 0x0

    aput v3, v0, v4

    invoke-static {v1, v2}, Ld1/a;->c(J)F

    move-result v1

    const/4 v2, 0x1

    aput v1, v0, v2

    iget-wide v1, p1, Ld1/e;->f:J

    invoke-static {v1, v2}, Ld1/a;->b(J)F

    move-result v3

    const/4 v4, 0x2

    aput v3, v0, v4

    invoke-static {v1, v2}, Ld1/a;->c(J)F

    move-result v1

    const/4 v2, 0x3

    aput v1, v0, v2

    iget-wide v1, p1, Ld1/e;->g:J

    invoke-static {v1, v2}, Ld1/a;->b(J)F

    move-result v3

    const/4 v4, 0x4

    aput v3, v0, v4

    invoke-static {v1, v2}, Ld1/a;->c(J)F

    move-result v1

    const/4 v2, 0x5

    aput v1, v0, v2

    iget-wide v1, p1, Ld1/e;->h:J

    invoke-static {v1, v2}, Ld1/a;->b(J)F

    move-result p1

    const/4 v3, 0x6

    aput p1, v0, v3

    invoke-static {v1, v2}, Ld1/a;->c(J)F

    move-result p1

    const/4 v1, 0x7

    aput p1, v0, v1

    iget-object p1, p0, Le1/i;->b:Landroid/graphics/RectF;

    invoke-static {p1}, Ld7/a;->j(Ljava/lang/Object;)V

    iget-object v0, p0, Le1/i;->c:[F

    invoke-static {v0}, Ld7/a;->j(Ljava/lang/Object;)V

    sget-object v1, Landroid/graphics/Path$Direction;->CCW:Landroid/graphics/Path$Direction;

    iget-object v2, p0, Le1/i;->a:Landroid/graphics/Path;

    invoke-virtual {v2, p1, v0, v1}, Landroid/graphics/Path;->addRoundRect(Landroid/graphics/RectF;[FLandroid/graphics/Path$Direction;)V

    return-void
.end method

.method public final b(Le1/d0;Le1/d0;I)Z
    .locals 2

    if-nez p3, :cond_0

    sget-object p3, Landroid/graphics/Path$Op;->DIFFERENCE:Landroid/graphics/Path$Op;

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    if-ne p3, v0, :cond_1

    sget-object p3, Landroid/graphics/Path$Op;->INTERSECT:Landroid/graphics/Path$Op;

    goto :goto_0

    :cond_1
    const/4 v0, 0x4

    if-ne p3, v0, :cond_2

    sget-object p3, Landroid/graphics/Path$Op;->REVERSE_DIFFERENCE:Landroid/graphics/Path$Op;

    goto :goto_0

    :cond_2
    const/4 v0, 0x2

    if-ne p3, v0, :cond_3

    sget-object p3, Landroid/graphics/Path$Op;->UNION:Landroid/graphics/Path$Op;

    goto :goto_0

    :cond_3
    sget-object p3, Landroid/graphics/Path$Op;->XOR:Landroid/graphics/Path$Op;

    :goto_0
    instance-of v0, p1, Le1/i;

    const-string v1, "Unable to obtain android.graphics.Path"

    if-eqz v0, :cond_5

    check-cast p1, Le1/i;

    instance-of v0, p2, Le1/i;

    if-eqz v0, :cond_4

    check-cast p2, Le1/i;

    iget-object v0, p0, Le1/i;->a:Landroid/graphics/Path;

    iget-object p1, p1, Le1/i;->a:Landroid/graphics/Path;

    iget-object p2, p2, Le1/i;->a:Landroid/graphics/Path;

    invoke-virtual {v0, p1, p2, p3}, Landroid/graphics/Path;->op(Landroid/graphics/Path;Landroid/graphics/Path;Landroid/graphics/Path$Op;)Z

    move-result p1

    return p1

    :cond_4
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final c(I)V
    .locals 1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    sget-object p1, Landroid/graphics/Path$FillType;->EVEN_ODD:Landroid/graphics/Path$FillType;

    goto :goto_0

    :cond_0
    sget-object p1, Landroid/graphics/Path$FillType;->WINDING:Landroid/graphics/Path$FillType;

    :goto_0
    iget-object v0, p0, Le1/i;->a:Landroid/graphics/Path;

    invoke-virtual {v0, p1}, Landroid/graphics/Path;->setFillType(Landroid/graphics/Path$FillType;)V

    return-void
.end method
