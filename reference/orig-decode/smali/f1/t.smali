.class public final Lf1/t;
.super Lf1/d;


# direct methods
.method public static g(F)F
    .locals 2

    const/high16 v0, -0x40000000    # -2.0f

    const/high16 v1, 0x40000000    # 2.0f

    invoke-static {p0, v0, v1}, Lz6/a;->q(FFF)F

    move-result p0

    return p0
.end method


# virtual methods
.method public final a(I)F
    .locals 0

    const/high16 p1, 0x40000000    # 2.0f

    return p1
.end method

.method public final b(I)F
    .locals 0

    const/high16 p1, -0x40000000    # -2.0f

    return p1
.end method

.method public final d(FFF)J
    .locals 4

    invoke-static {p1}, Lf1/t;->g(F)F

    move-result p1

    invoke-static {p2}, Lf1/t;->g(F)F

    move-result p2

    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p1

    int-to-long v0, p1

    invoke-static {p2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p1

    int-to-long p1, p1

    const/16 p3, 0x20

    shl-long/2addr v0, p3

    const-wide v2, 0xffffffffL

    and-long/2addr p1, v2

    or-long/2addr p1, v0

    return-wide p1
.end method

.method public final e(FFF)F
    .locals 0

    invoke-static {p3}, Lf1/t;->g(F)F

    move-result p1

    return p1
.end method

.method public final f(FFFFLf1/d;)J
    .locals 0

    invoke-static {p1}, Lf1/t;->g(F)F

    move-result p1

    invoke-static {p2}, Lf1/t;->g(F)F

    move-result p2

    invoke-static {p3}, Lf1/t;->g(F)F

    move-result p3

    invoke-static {p1, p2, p3, p4, p5}, Landroidx/compose/ui/graphics/a;->a(FFFFLf1/d;)J

    move-result-wide p1

    return-wide p1
.end method
