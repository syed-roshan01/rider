.class public abstract Le1/k;
.super Ljava/lang/Object;


# direct methods
.method public static final a(Landroid/graphics/Bitmap;)Lf1/d;
    .locals 0

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getColorSpace()Landroid/graphics/ColorSpace;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-static {p0}, Le1/u;->b(Landroid/graphics/ColorSpace;)Lf1/d;

    move-result-object p0

    if-nez p0, :cond_1

    :cond_0
    sget-object p0, Lf1/e;->a:[F

    sget-object p0, Lf1/e;->c:Lf1/q;

    :cond_1
    return-object p0
.end method

.method public static final b(IIIZLf1/d;)Landroid/graphics/Bitmap;
    .locals 6

    const/4 v0, 0x0

    invoke-static {p2}, Landroidx/compose/ui/graphics/a;->t(I)Landroid/graphics/Bitmap$Config;

    move-result-object v3

    invoke-static {p4}, Le1/u;->a(Lf1/d;)Landroid/graphics/ColorSpace;

    move-result-object v5

    move v1, p0

    move v2, p1

    move v4, p3

    invoke-static/range {v0 .. v5}, Landroid/graphics/Bitmap;->createBitmap(Landroid/util/DisplayMetrics;IILandroid/graphics/Bitmap$Config;ZLandroid/graphics/ColorSpace;)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method
