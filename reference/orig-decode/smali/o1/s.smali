.class public abstract Lo1/s;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lo1/a;

.field public static final synthetic b:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Lo1/a;

    const/16 v1, 0x3e8

    invoke-direct {v0, v1}, Lo1/a;-><init>(I)V

    sput-object v0, Lo1/s;->a:Lo1/a;

    return-void
.end method

.method public static final A(Landroid/view/View;)Landroidx/lifecycle/w;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Landroidx/lifecycle/h1;->b:Landroidx/lifecycle/h1;

    invoke-static {v0, p0}, Lk9/l;->F0(Lc9/c;Ljava/lang/Object;)Lk9/i;

    move-result-object p0

    sget-object v0, Landroidx/lifecycle/h1;->c:Landroidx/lifecycle/h1;

    invoke-static {p0, v0}, Lk9/k;->H0(Lk9/i;Lc9/c;)Lk9/f;

    move-result-object p0

    invoke-static {p0}, Lk9/k;->G0(Lk9/f;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroidx/lifecycle/w;

    return-object p0
.end method

.method public static final B(Lf2/l;I)I
    .locals 2

    sget-object v0, Lf2/l;->b:Lf2/l;

    iget p0, p0, Lf2/l;->a:I

    iget v0, v0, Lf2/l;->a:I

    invoke-static {p0, v0}, Ld7/a;->o(II)I

    move-result p0

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-ltz p0, :cond_0

    move p0, v1

    goto :goto_0

    :cond_0
    move p0, v0

    :goto_0
    invoke-static {p1, v1}, Lf2/j;->a(II)Z

    move-result p1

    if-eqz p1, :cond_1

    if-eqz p0, :cond_1

    const/4 v0, 0x3

    goto :goto_1

    :cond_1
    if-eqz p0, :cond_2

    move v0, v1

    goto :goto_1

    :cond_2
    if-eqz p1, :cond_3

    const/4 v0, 0x2

    :cond_3
    :goto_1
    return v0
.end method

.method public static C(Landroid/content/Context;II)I
    .locals 2

    new-instance v0, Landroid/util/TypedValue;

    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    invoke-virtual {p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p0

    const/4 v1, 0x1

    invoke-virtual {p0, p1, v0, v1}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    iget p0, v0, Landroid/util/TypedValue;->resourceId:I

    if-eqz p0, :cond_0

    return p1

    :cond_0
    return p2
.end method

.method public static D(Landroid/content/Context;)Landroid/content/SharedPreferences;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "_preferences"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p0

    return-object p0
.end method

.method public static final E(Landroid/text/Layout;ILandroid/graphics/Paint;)F
    .locals 4

    invoke-virtual {p0, p1}, Landroid/text/Layout;->getLineLeft(I)F

    move-result v0

    sget-object v1, Lb2/w;->a:Lb2/u;

    invoke-virtual {p0, p1}, Landroid/text/Layout;->getEllipsisCount(I)I

    move-result v1

    const/4 v2, 0x0

    if-lez v1, :cond_2

    invoke-virtual {p0, p1}, Landroid/text/Layout;->getParagraphDirection(I)I

    move-result v1

    const/4 v3, 0x1

    if-ne v1, v3, :cond_2

    cmpg-float v1, v0, v2

    if-gez v1, :cond_2

    invoke-virtual {p0, p1}, Landroid/text/Layout;->getLineStart(I)I

    move-result v1

    invoke-virtual {p0, p1}, Landroid/text/Layout;->getEllipsisStart(I)I

    move-result v2

    add-int/2addr v2, v1

    invoke-virtual {p0, v2}, Landroid/text/Layout;->getPrimaryHorizontal(I)F

    move-result v1

    sub-float/2addr v1, v0

    const-string v2, "\u2026"

    invoke-virtual {p2, v2}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result p2

    add-float/2addr p2, v1

    invoke-virtual {p0, p1}, Landroid/text/Layout;->getParagraphAlignment(I)Landroid/text/Layout$Alignment;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_1

    :cond_0
    sget-object v1, Ld2/d;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v1, p1

    if-ne p1, v3, :cond_1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result p1

    invoke-virtual {p0}, Landroid/text/Layout;->getWidth()I

    move-result p0

    int-to-float p0, p0

    sub-float/2addr p0, p2

    const/high16 p2, 0x40000000    # 2.0f

    div-float/2addr p0, p2

    :goto_0
    add-float/2addr p0, p1

    goto :goto_2

    :cond_1
    :goto_1
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result p1

    invoke-virtual {p0}, Landroid/text/Layout;->getWidth()I

    move-result p0

    int-to-float p0, p0

    sub-float/2addr p0, p2

    goto :goto_0

    :goto_2
    return p0

    :cond_2
    return v2
.end method

.method public static final F(Landroid/text/Layout;ILandroid/graphics/Paint;)F
    .locals 2

    sget-object v0, Lb2/w;->a:Lb2/u;

    invoke-virtual {p0, p1}, Landroid/text/Layout;->getEllipsisCount(I)I

    move-result v0

    if-lez v0, :cond_2

    invoke-virtual {p0, p1}, Landroid/text/Layout;->getParagraphDirection(I)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_2

    invoke-virtual {p0}, Landroid/text/Layout;->getWidth()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p0, p1}, Landroid/text/Layout;->getLineRight(I)F

    move-result v1

    cmpg-float v0, v0, v1

    if-gez v0, :cond_2

    invoke-virtual {p0, p1}, Landroid/text/Layout;->getLineStart(I)I

    move-result v0

    invoke-virtual {p0, p1}, Landroid/text/Layout;->getEllipsisStart(I)I

    move-result v1

    add-int/2addr v1, v0

    invoke-virtual {p0, v1}, Landroid/text/Layout;->getPrimaryHorizontal(I)F

    move-result v0

    invoke-virtual {p0, p1}, Landroid/text/Layout;->getLineRight(I)F

    move-result v1

    sub-float/2addr v1, v0

    const-string v0, "\u2026"

    invoke-virtual {p2, v0}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result p2

    add-float/2addr p2, v1

    invoke-virtual {p0, p1}, Landroid/text/Layout;->getParagraphAlignment(I)Landroid/text/Layout$Alignment;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    sget-object v1, Ld2/d;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    invoke-virtual {p0}, Landroid/text/Layout;->getWidth()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p0, p1}, Landroid/text/Layout;->getLineRight(I)F

    move-result p1

    sub-float/2addr v0, p1

    invoke-virtual {p0}, Landroid/text/Layout;->getWidth()I

    move-result p0

    int-to-float p0, p0

    sub-float/2addr p0, p2

    const/high16 p1, 0x40000000    # 2.0f

    div-float/2addr p0, p1

    :goto_0
    sub-float/2addr v0, p0

    goto :goto_2

    :cond_1
    :goto_1
    invoke-virtual {p0}, Landroid/text/Layout;->getWidth()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p0, p1}, Landroid/text/Layout;->getLineRight(I)F

    move-result p1

    sub-float/2addr v0, p1

    invoke-virtual {p0}, Landroid/text/Layout;->getWidth()I

    move-result p0

    int-to-float p0, p0

    sub-float/2addr p0, p2

    goto :goto_0

    :goto_2
    return v0

    :cond_2
    const/4 p0, 0x0

    return p0
.end method

.method public static final G(Landroid/text/Layout;IZ)I
    .locals 2

    if-gtz p1, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    invoke-virtual {p0}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lt p1, v0, :cond_1

    invoke-virtual {p0}, Landroid/text/Layout;->getLineCount()I

    move-result p0

    add-int/lit8 p0, p0, -0x1

    return p0

    :cond_1
    invoke-virtual {p0, p1}, Landroid/text/Layout;->getLineForOffset(I)I

    move-result v0

    invoke-virtual {p0, v0}, Landroid/text/Layout;->getLineStart(I)I

    move-result v1

    invoke-virtual {p0, v0}, Landroid/text/Layout;->getLineEnd(I)I

    move-result p0

    if-eq v1, p1, :cond_2

    if-eq p0, p1, :cond_2

    return v0

    :cond_2
    if-ne v1, p1, :cond_3

    if-eqz p2, :cond_5

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_3
    if-eqz p2, :cond_4

    goto :goto_0

    :cond_4
    add-int/lit8 v0, v0, 0x1

    :cond_5
    :goto_0
    return v0
.end method

.method public static H(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Landroid/content/res/Resources$Theme;)Landroid/content/res/ColorStateList;
    .locals 4

    const-string v0, "tint"

    invoke-static {p1, v0}, Lo1/s;->S(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result p1

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    new-instance p1, Landroid/util/TypedValue;

    invoke-direct {p1}, Landroid/util/TypedValue;-><init>()V

    const/4 v1, 0x1

    invoke-virtual {p0, v1, p1}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    iget v2, p1, Landroid/util/TypedValue;->type:I

    const/4 v3, 0x2

    if-eq v2, v3, :cond_1

    const/16 v3, 0x1c

    if-lt v2, v3, :cond_0

    const/16 v3, 0x1f

    if-gt v2, v3, :cond_0

    iget p0, p1, Landroid/util/TypedValue;->data:I

    invoke-static {p0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-virtual {p0}, Landroid/content/res/TypedArray;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const/4 v2, 0x0

    invoke-virtual {p0, v1, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p0

    sget-object v1, Lt2/c;->a:Ljava/lang/ThreadLocal;

    :try_start_0
    invoke-virtual {p1, p0}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    move-result-object p0

    invoke-static {p1, p0, p2}, Lt2/c;->a(Landroid/content/res/Resources;Landroid/content/res/XmlResourceParser;Landroid/content/res/Resources$Theme;)Landroid/content/res/ColorStateList;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    const-string p1, "CSLCompat"

    const-string p2, "Failed to inflate ColorStateList."

    invoke-static {p1, p2, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_0
    return-object v0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Failed to resolve attribute at index 1: "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    return-object v0
.end method

.method public static I(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Landroid/content/res/Resources$Theme;Ljava/lang/String;I)Lh0/i;
    .locals 3

    invoke-static {p1, p3}, Lo1/s;->S(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result p1

    const/4 p3, 0x0

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    new-instance p1, Landroid/util/TypedValue;

    invoke-direct {p1}, Landroid/util/TypedValue;-><init>()V

    invoke-virtual {p0, p4, p1}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    iget v1, p1, Landroid/util/TypedValue;->type:I

    const/16 v2, 0x1c

    if-lt v1, v2, :cond_0

    const/16 v2, 0x1f

    if-gt v1, v2, :cond_0

    iget p0, p1, Landroid/util/TypedValue;->data:I

    new-instance p1, Lh0/i;

    invoke-direct {p1, p3, p3, p0}, Lh0/i;-><init>(Landroid/graphics/Shader;Landroid/content/res/ColorStateList;I)V

    return-object p1

    :cond_0
    invoke-virtual {p0}, Landroid/content/res/TypedArray;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p0, p4, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p0

    :try_start_0
    invoke-static {p1, p0, p2}, Lh0/i;->a(Landroid/content/res/Resources;ILandroid/content/res/Resources$Theme;)Lh0/i;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    const-string p1, "ComplexColorCompat"

    const-string p2, "Failed to inflate ComplexColor."

    invoke-static {p1, p2, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    move-object p0, p3

    :goto_0
    if-eqz p0, :cond_1

    return-object p0

    :cond_1
    new-instance p0, Lh0/i;

    invoke-direct {p0, p3, p3, v0}, Lh0/i;-><init>(Landroid/graphics/Shader;Landroid/content/res/ColorStateList;I)V

    return-object p0
.end method

.method public static final J(Ly1/j;Ly1/u;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Ly1/j;->a:Ljava/util/LinkedHashMap;

    invoke-virtual {p0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    :cond_0
    return-object p0
.end method

.method public static final K(Landroidx/compose/ui/node/a;)Lt1/r1;
    .locals 7

    iget-object p0, p0, Landroidx/compose/ui/node/a;->C:Lt1/x0;

    iget-object p0, p0, Lt1/x0;->e:Ly0/n;

    iget v0, p0, Ly0/n;->d:I

    and-int/lit8 v0, v0, 0x8

    const/4 v1, 0x0

    if-eqz v0, :cond_8

    :goto_0
    if-eqz p0, :cond_8

    iget v0, p0, Ly0/n;->c:I

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_7

    move-object v0, p0

    move-object v2, v1

    :goto_1
    if-eqz v0, :cond_7

    instance-of v3, v0, Lt1/r1;

    if-eqz v3, :cond_0

    move-object v3, v0

    check-cast v3, Lt1/r1;

    invoke-interface {v3}, Lt1/r1;->d0()Z

    move-result v3

    if-eqz v3, :cond_6

    move-object v1, v0

    goto :goto_4

    :cond_0
    iget v3, v0, Ly0/n;->c:I

    and-int/lit8 v3, v3, 0x8

    if-eqz v3, :cond_6

    instance-of v3, v0, Lt1/o;

    if-eqz v3, :cond_6

    move-object v3, v0

    check-cast v3, Lt1/o;

    iget-object v3, v3, Lt1/o;->v:Ly0/n;

    const/4 v4, 0x0

    :goto_2
    const/4 v5, 0x1

    if-eqz v3, :cond_5

    iget v6, v3, Ly0/n;->c:I

    and-int/lit8 v6, v6, 0x8

    if-eqz v6, :cond_4

    add-int/lit8 v4, v4, 0x1

    if-ne v4, v5, :cond_1

    move-object v0, v3

    goto :goto_3

    :cond_1
    if-nez v2, :cond_2

    new-instance v2, Lo0/i;

    const/16 v5, 0x10

    new-array v5, v5, [Ly0/n;

    invoke-direct {v2, v5}, Lo0/i;-><init>([Ljava/lang/Object;)V

    :cond_2
    if-eqz v0, :cond_3

    invoke-virtual {v2, v0}, Lo0/i;->c(Ljava/lang/Object;)V

    move-object v0, v1

    :cond_3
    invoke-virtual {v2, v3}, Lo0/i;->c(Ljava/lang/Object;)V

    :cond_4
    :goto_3
    iget-object v3, v3, Ly0/n;->f:Ly0/n;

    goto :goto_2

    :cond_5
    if-ne v4, v5, :cond_6

    goto :goto_1

    :cond_6
    invoke-static {v2}, Lt1/g;->f(Lo0/i;)Ly0/n;

    move-result-object v0

    goto :goto_1

    :cond_7
    iget v0, p0, Ly0/n;->d:I

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_8

    iget-object p0, p0, Ly0/n;->f:Ly0/n;

    goto :goto_0

    :cond_8
    :goto_4
    check-cast v1, Lt1/r1;

    return-object v1
.end method

.method public static final L(Lg2/a0;)La2/e;
    .locals 3

    iget-object v0, p0, Lg2/a0;->a:La2/e;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-wide v1, p0, Lg2/a0;->b:J

    invoke-static {v1, v2}, La2/b0;->e(J)I

    move-result p0

    invoke-static {v1, v2}, La2/b0;->d(J)I

    move-result v1

    invoke-virtual {v0, p0, v1}, La2/e;->a(II)La2/e;

    move-result-object p0

    return-object p0
.end method

.method public static final M(D)J
    .locals 2

    const-wide v0, 0x100000000L

    double-to-float p0, p0

    invoke-static {p0, v0, v1}, Lo1/s;->c0(FJ)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final N(I)J
    .locals 2

    const-wide v0, 0x100000000L

    int-to-float p0, p0

    invoke-static {p0, v0, v1}, Lo1/s;->c0(FJ)J

    move-result-wide v0

    return-wide v0
.end method

.method public static O(Landroid/content/res/TypedArray;II)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0, p1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    invoke-virtual {p0, p2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p1

    :cond_0
    return-object p1
.end method

.method public static final P(Lg2/a0;I)La2/e;
    .locals 4

    iget-object v0, p0, Lg2/a0;->a:La2/e;

    iget-wide v1, p0, Lg2/a0;->b:J

    invoke-static {v1, v2}, La2/b0;->d(J)I

    move-result v3

    invoke-static {v1, v2}, La2/b0;->d(J)I

    move-result v1

    add-int/2addr v1, p1

    iget-object p0, p0, Lg2/a0;->a:La2/e;

    iget-object p0, p0, La2/e;->a:Ljava/lang/String;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p0

    invoke-static {v1, p0}, Ljava/lang/Math;->min(II)I

    move-result p0

    invoke-virtual {v0, v3, p0}, La2/e;->a(II)La2/e;

    move-result-object p0

    return-object p0
.end method

.method public static final Q(Lg2/a0;I)La2/e;
    .locals 3

    iget-object v0, p0, Lg2/a0;->a:La2/e;

    iget-wide v1, p0, Lg2/a0;->b:J

    invoke-static {v1, v2}, La2/b0;->e(J)I

    move-result p0

    sub-int/2addr p0, p1

    const/4 p1, 0x0

    invoke-static {p1, p0}, Ljava/lang/Math;->max(II)I

    move-result p0

    invoke-static {v1, v2}, La2/b0;->e(J)I

    move-result p1

    invoke-virtual {v0, p0, p1}, La2/e;->a(II)La2/e;

    move-result-object p0

    return-object p0
.end method

.method public static final R(Landroidx/lifecycle/x0;)Lm9/d0;
    .locals 4

    const-string v0, "androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY"

    invoke-virtual {p0, v0}, Landroidx/lifecycle/x0;->getTag(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm9/d0;

    if-eqz v1, :cond_0

    return-object v1

    :cond_0
    new-instance v1, Landroidx/lifecycle/e;

    invoke-static {}, Ld7/t;->k()Lm9/y1;

    move-result-object v2

    sget-object v3, Lm9/m0;->a:Lt9/d;

    sget-object v3, Lr9/o;->a:Lm9/s1;

    check-cast v3, Ln9/d;

    iget-object v3, v3, Ln9/d;->f:Ln9/d;

    invoke-virtual {v2, v3}, Lm9/p1;->O(Lu8/j;)Lu8/j;

    move-result-object v2

    invoke-direct {v1, v2}, Landroidx/lifecycle/e;-><init>(Lu8/j;)V

    invoke-virtual {p0, v0, v1}, Landroidx/lifecycle/x0;->setTagIfAbsent(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lm9/d0;

    return-object p0
.end method

.method public static S(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z
    .locals 1

    const-string v0, "http://schemas.android.com/apk/res/android"

    invoke-interface {p0, v0, p1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static T(I)I
    .locals 3

    const/4 v0, 0x1

    if-eq p0, v0, :cond_8

    const/4 v1, 0x2

    if-eq p0, v1, :cond_7

    const/4 v0, 0x4

    if-eq p0, v0, :cond_6

    const/16 v1, 0x8

    if-eq p0, v1, :cond_5

    const/16 v2, 0x10

    if-eq p0, v2, :cond_4

    const/16 v0, 0x20

    if-eq p0, v0, :cond_3

    const/16 v0, 0x40

    if-eq p0, v0, :cond_2

    const/16 v0, 0x80

    if-eq p0, v0, :cond_1

    const/16 v0, 0x100

    if-ne p0, v0, :cond_0

    return v1

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "type needs to be >= FIRST and <= LAST, type="

    invoke-static {v1, p0}, Ll/q;->g(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    const/4 p0, 0x7

    return p0

    :cond_2
    const/4 p0, 0x6

    return p0

    :cond_3
    const/4 p0, 0x5

    return p0

    :cond_4
    return v0

    :cond_5
    const/4 p0, 0x3

    return p0

    :cond_6
    return v1

    :cond_7
    return v0

    :cond_8
    const/4 p0, 0x0

    return p0
.end method

.method public static final U([F[F)Z
    .locals 44

    const/4 v0, 0x0

    aget v1, p0, v0

    const/4 v2, 0x1

    aget v3, p0, v2

    const/4 v4, 0x2

    aget v5, p0, v4

    const/4 v6, 0x3

    aget v7, p0, v6

    const/4 v8, 0x4

    aget v9, p0, v8

    const/4 v10, 0x5

    aget v11, p0, v10

    const/4 v12, 0x6

    aget v13, p0, v12

    const/4 v14, 0x7

    aget v15, p0, v14

    const/16 v16, 0x8

    aget v14, p0, v16

    const/16 v17, 0x9

    aget v12, p0, v17

    const/16 v18, 0xa

    aget v19, p0, v18

    const/16 v20, 0xb

    aget v21, p0, v20

    const/16 v22, 0xc

    aget v10, p0, v22

    const/16 v23, 0xd

    aget v24, p0, v23

    const/16 v25, 0xe

    aget v26, p0, v25

    const/16 v27, 0xf

    aget v28, p0, v27

    mul-float v29, v1, v11

    mul-float v30, v3, v9

    sub-float v29, v29, v30

    mul-float v30, v1, v13

    mul-float v31, v5, v9

    sub-float v30, v30, v31

    mul-float v31, v1, v15

    mul-float v32, v7, v9

    sub-float v31, v31, v32

    mul-float v32, v3, v13

    mul-float v33, v5, v11

    sub-float v32, v32, v33

    mul-float v33, v3, v15

    mul-float v34, v7, v11

    sub-float v33, v33, v34

    mul-float v34, v5, v15

    mul-float v35, v7, v13

    sub-float v34, v34, v35

    mul-float v35, v14, v24

    mul-float v36, v12, v10

    sub-float v35, v35, v36

    mul-float v36, v14, v26

    mul-float v37, v19, v10

    sub-float v36, v36, v37

    mul-float v37, v14, v28

    mul-float v38, v21, v10

    sub-float v37, v37, v38

    mul-float v38, v12, v26

    mul-float v39, v19, v24

    sub-float v38, v38, v39

    mul-float v39, v12, v28

    mul-float v40, v21, v24

    sub-float v39, v39, v40

    mul-float v40, v19, v28

    mul-float v41, v21, v26

    sub-float v40, v40, v41

    mul-float v41, v29, v40

    mul-float v42, v30, v39

    sub-float v41, v41, v42

    mul-float v42, v31, v38

    add-float v42, v42, v41

    mul-float v41, v32, v37

    add-float v41, v41, v42

    mul-float v42, v33, v36

    sub-float v41, v41, v42

    mul-float v42, v34, v35

    add-float v42, v42, v41

    const/16 v41, 0x0

    cmpg-float v41, v42, v41

    if-nez v41, :cond_0

    return v0

    :cond_0
    const/high16 v41, 0x3f800000    # 1.0f

    div-float v41, v41, v42

    mul-float v42, v11, v40

    mul-float v43, v13, v39

    sub-float v42, v42, v43

    mul-float v43, v15, v38

    add-float v43, v43, v42

    mul-float v43, v43, v41

    aput v43, p1, v0

    neg-float v0, v3

    mul-float v0, v0, v40

    mul-float v42, v5, v39

    add-float v42, v42, v0

    mul-float v0, v7, v38

    sub-float v42, v42, v0

    mul-float v42, v42, v41

    aput v42, p1, v2

    mul-float v0, v24, v34

    mul-float v42, v26, v33

    sub-float v0, v0, v42

    mul-float v42, v28, v32

    add-float v42, v42, v0

    mul-float v42, v42, v41

    aput v42, p1, v4

    neg-float v0, v12

    mul-float v0, v0, v34

    mul-float v4, v19, v33

    add-float/2addr v4, v0

    mul-float v0, v21, v32

    sub-float/2addr v4, v0

    mul-float v4, v4, v41

    aput v4, p1, v6

    neg-float v0, v9

    mul-float v4, v0, v40

    mul-float v6, v13, v37

    add-float/2addr v6, v4

    mul-float v4, v15, v36

    sub-float/2addr v6, v4

    mul-float v6, v6, v41

    aput v6, p1, v8

    mul-float v40, v40, v1

    mul-float v4, v5, v37

    sub-float v40, v40, v4

    mul-float v4, v7, v36

    add-float v4, v4, v40

    mul-float v4, v4, v41

    const/4 v6, 0x5

    aput v4, p1, v6

    neg-float v4, v10

    mul-float v6, v4, v34

    mul-float v8, v26, v31

    add-float/2addr v8, v6

    mul-float v6, v28, v30

    sub-float/2addr v8, v6

    mul-float v8, v8, v41

    const/4 v6, 0x6

    aput v8, p1, v6

    mul-float v34, v34, v14

    mul-float v6, v19, v31

    sub-float v34, v34, v6

    mul-float v6, v21, v30

    add-float v6, v6, v34

    mul-float v6, v6, v41

    const/4 v8, 0x7

    aput v6, p1, v8

    mul-float v9, v9, v39

    mul-float v6, v11, v37

    sub-float/2addr v9, v6

    mul-float v15, v15, v35

    add-float/2addr v15, v9

    mul-float v15, v15, v41

    aput v15, p1, v16

    neg-float v6, v1

    mul-float v6, v6, v39

    mul-float v37, v37, v3

    add-float v37, v37, v6

    mul-float v7, v7, v35

    sub-float v37, v37, v7

    mul-float v37, v37, v41

    aput v37, p1, v17

    mul-float v10, v10, v33

    mul-float v6, v24, v31

    sub-float/2addr v10, v6

    mul-float v28, v28, v29

    add-float v28, v28, v10

    mul-float v28, v28, v41

    aput v28, p1, v18

    neg-float v6, v14

    mul-float v6, v6, v33

    mul-float v31, v31, v12

    add-float v31, v31, v6

    mul-float v21, v21, v29

    sub-float v31, v31, v21

    mul-float v31, v31, v41

    aput v31, p1, v20

    mul-float v0, v0, v38

    mul-float v11, v11, v36

    add-float/2addr v11, v0

    mul-float v13, v13, v35

    sub-float/2addr v11, v13

    mul-float v11, v11, v41

    aput v11, p1, v22

    mul-float v1, v1, v38

    mul-float v3, v3, v36

    sub-float/2addr v1, v3

    mul-float v5, v5, v35

    add-float/2addr v5, v1

    mul-float v5, v5, v41

    aput v5, p1, v23

    mul-float v4, v4, v32

    mul-float v24, v24, v30

    add-float v24, v24, v4

    mul-float v26, v26, v29

    sub-float v24, v24, v26

    mul-float v24, v24, v41

    aput v24, p1, v25

    mul-float v14, v14, v32

    mul-float v12, v12, v30

    sub-float/2addr v14, v12

    mul-float v19, v19, v29

    add-float v19, v19, v14

    mul-float v19, v19, v41

    aput v19, p1, v27

    return v2
.end method

.method public static final V(J)Z
    .locals 2

    sget-object v0, Lm2/n;->b:[Lm2/o;

    const-wide v0, 0xff00000000L

    and-long/2addr p0, v0

    const-wide/16 v0, 0x0

    cmp-long p0, p0, v0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final W(FFF)F
    .locals 1

    const/4 v0, 0x1

    int-to-float v0, v0

    sub-float/2addr v0, p2

    mul-float/2addr v0, p0

    mul-float/2addr p2, p1

    add-float/2addr p2, v0

    return p2
.end method

.method public static final X(IIF)I
    .locals 2

    sub-int/2addr p1, p0

    int-to-double v0, p1

    float-to-double p1, p2

    mul-double/2addr v0, p1

    invoke-static {v0, v1}, Ld7/t;->o0(D)I

    move-result p1

    add-int/2addr p1, p0

    return p1
.end method

.method public static final Y(Lc9/a;)Ls1/i;
    .locals 1

    new-instance v0, Ls1/i;

    invoke-direct {v0, p0}, Ls1/c;-><init>(Lc9/a;)V

    return-object v0
.end method

.method public static Z(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
    .locals 0

    if-nez p1, :cond_0

    invoke-virtual {p0, p2, p3}, Landroid/content/res/Resources;->obtainAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    invoke-virtual {p1, p2, p3, p0, p0}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p0

    return-object p0
.end method

.method public static final a(IIII)J
    .locals 1

    const/16 v0, 0x29

    if-lt p1, p0, :cond_2

    if-lt p3, p2, :cond_1

    if-ltz p0, :cond_0

    if-ltz p2, :cond_0

    invoke-static {p0, p1, p2, p3}, Ll2/l;->c(IIII)J

    move-result-wide p0

    return-wide p0

    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    const-string p3, "minWidth("

    invoke-direct {p1, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, ") and minHeight("

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, ") must be >= 0"

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p0, Ljava/lang/StringBuilder;

    const-string p1, "maxHeight("

    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ") must be >= than minHeight("

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "maxWidth("

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ") must be >= than minWidth("

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static final a0(JII)J
    .locals 4

    invoke-static {p0, p1}, Lm2/a;->k(J)I

    move-result v0

    add-int/2addr v0, p2

    const/4 v1, 0x0

    if-gez v0, :cond_0

    move v0, v1

    :cond_0
    invoke-static {p0, p1}, Lm2/a;->i(J)I

    move-result v2

    const v3, 0x7fffffff

    if-ne v2, v3, :cond_1

    goto :goto_0

    :cond_1
    add-int/2addr v2, p2

    if-gez v2, :cond_2

    move v2, v1

    :cond_2
    :goto_0
    invoke-static {p0, p1}, Lm2/a;->j(J)I

    move-result p2

    add-int/2addr p2, p3

    if-gez p2, :cond_3

    move p2, v1

    :cond_3
    invoke-static {p0, p1}, Lm2/a;->h(J)I

    move-result p0

    if-ne p0, v3, :cond_4

    goto :goto_2

    :cond_4
    add-int/2addr p0, p3

    if-gez p0, :cond_5

    goto :goto_1

    :cond_5
    move v1, p0

    :goto_1
    move p0, v1

    :goto_2
    invoke-static {v0, v2, p2, p0}, Lo1/s;->a(IIII)J

    move-result-wide p0

    return-wide p0
.end method

.method public static synthetic b(III)J
    .locals 2

    and-int/lit8 v0, p2, 0x2

    const v1, 0x7fffffff

    if-eqz v0, :cond_0

    move p0, v1

    :cond_0
    and-int/lit8 p2, p2, 0x8

    if-eqz p2, :cond_1

    move p1, v1

    :cond_1
    const/4 p2, 0x0

    invoke-static {p2, p0, p2, p1}, Lo1/s;->a(IIII)J

    move-result-wide p0

    return-wide p0
.end method

.method public static synthetic b0(JIII)J
    .locals 2

    and-int/lit8 v0, p4, 0x1

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move p2, v1

    :cond_0
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_1

    move p3, v1

    :cond_1
    invoke-static {p0, p1, p2, p3}, Lo1/s;->a0(JII)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final c(Landroid/content/Context;)Lm2/d;
    .locals 3

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->fontScale:F

    sget-object v1, Lm2/h;->a:Lm0/n1;

    invoke-virtual {v1}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Lm2/m;

    invoke-direct {v1, v0}, Lm2/m;-><init>(F)V

    goto :goto_0

    :cond_0
    invoke-static {v0}, Ln2/b;->a(F)Ln2/a;

    move-result-object v1

    if-nez v1, :cond_1

    new-instance v1, Lm2/m;

    invoke-direct {v1, v0}, Lm2/m;-><init>(F)V

    :cond_1
    :goto_0
    new-instance v2, Lm2/d;

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p0

    iget p0, p0, Landroid/util/DisplayMetrics;->density:F

    invoke-direct {v2, p0, v0, v1}, Lm2/d;-><init>(FFLn2/a;)V

    return-object v2
.end method

.method public static final c0(FJ)J
    .locals 4

    invoke-static {p0}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result p0

    int-to-long v0, p0

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    or-long p0, p1, v0

    sget-object p2, Lm2/n;->b:[Lm2/o;

    return-wide p0
.end method

.method public static final d(Lc9/a;Lo2/o;Lc9/e;Lm0/m;II)V
    .locals 16

    move-object/from16 v3, p2

    move/from16 v4, p4

    move-object/from16 v0, p3

    check-cast v0, Lm0/q;

    const v1, -0x792b3ec6

    invoke-virtual {v0, v1}, Lm0/q;->a0(I)Lm0/q;

    and-int/lit8 v1, p5, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v1, v4, 0x6

    move v2, v1

    move-object/from16 v1, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v1, v4, 0xe

    if-nez v1, :cond_2

    move-object/from16 v1, p0

    invoke-virtual {v0, v1}, Lm0/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x4

    goto :goto_0

    :cond_1
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, v4

    goto :goto_1

    :cond_2
    move-object/from16 v1, p0

    move v2, v4

    :goto_1
    and-int/lit8 v5, p5, 0x2

    if-eqz v5, :cond_4

    or-int/lit8 v2, v2, 0x30

    :cond_3
    move-object/from16 v6, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v6, v4, 0x70

    if-nez v6, :cond_3

    move-object/from16 v6, p1

    invoke-virtual {v0, v6}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_5

    const/16 v7, 0x20

    goto :goto_2

    :cond_5
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v2, v7

    :goto_3
    and-int/lit8 v7, p5, 0x4

    if-eqz v7, :cond_6

    or-int/lit16 v2, v2, 0x180

    goto :goto_5

    :cond_6
    and-int/lit16 v7, v4, 0x380

    if-nez v7, :cond_8

    invoke-virtual {v0, v3}, Lm0/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_7

    const/16 v7, 0x100

    goto :goto_4

    :cond_7
    const/16 v7, 0x80

    :goto_4
    or-int/2addr v2, v7

    :cond_8
    :goto_5
    and-int/lit16 v2, v2, 0x2db

    const/16 v7, 0x92

    if-ne v2, v7, :cond_a

    invoke-virtual {v0}, Lm0/q;->G()Z

    move-result v2

    if-nez v2, :cond_9

    goto :goto_6

    :cond_9
    invoke-virtual {v0}, Lm0/q;->U()V

    move-object v2, v6

    goto/16 :goto_9

    :cond_a
    :goto_6
    const/4 v2, 0x0

    if-eqz v5, :cond_b

    new-instance v5, Lo2/o;

    const/4 v6, 0x7

    invoke-direct {v5, v2, v2, v6}, Lo2/o;-><init>(ZZI)V

    move-object v12, v5

    goto :goto_7

    :cond_b
    move-object v12, v6

    :goto_7
    sget-object v5, Lu1/y0;->f:Lm0/m3;

    invoke-virtual {v0, v5}, Lm0/q;->m(Lm0/u1;)Ljava/lang/Object;

    move-result-object v5

    move-object v8, v5

    check-cast v8, Landroid/view/View;

    sget-object v5, Lu1/s1;->e:Lm0/m3;

    invoke-virtual {v0, v5}, Lm0/q;->m(Lm0/u1;)Ljava/lang/Object;

    move-result-object v5

    move-object v10, v5

    check-cast v10, Lm2/b;

    sget-object v5, Lu1/s1;->k:Lm0/m3;

    invoke-virtual {v0, v5}, Lm0/q;->m(Lm0/u1;)Ljava/lang/Object;

    move-result-object v5

    move-object v13, v5

    check-cast v13, Lm2/l;

    invoke-static {v0}, Lm9/e0;->K(Lm0/m;)Lm0/o;

    move-result-object v14

    invoke-static {v3, v0}, Ld7/t;->m0(Ljava/lang/Object;Lm0/m;)Lm0/g1;

    move-result-object v15

    new-array v5, v2, [Ljava/lang/Object;

    sget-object v6, Lo2/d;->b:Lo2/d;

    const/4 v7, 0x0

    const/4 v9, 0x6

    invoke-static {v5, v7, v6, v0, v9}, Lx3/c;->d([Ljava/lang/Object;Lv0/p;Lc9/a;Lm0/m;I)Ljava/lang/Object;

    move-result-object v5

    move-object v11, v5

    check-cast v11, Ljava/util/UUID;

    const v5, 0x1e7b2b64

    invoke-virtual {v0, v5}, Lm0/q;->Z(I)V

    invoke-virtual {v0, v8}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v5

    invoke-virtual {v0, v10}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v5, v6

    invoke-virtual {v0}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_c

    sget-object v5, Lm0/l;->a:Lk0/y0;

    if-ne v6, v5, :cond_f

    :cond_c
    new-instance v9, Lo2/p;

    move-object v5, v9

    move-object/from16 v6, p0

    move-object v7, v12

    move-object v2, v9

    move-object v9, v13

    invoke-direct/range {v5 .. v11}, Lo2/p;-><init>(Lc9/a;Lo2/o;Landroid/view/View;Lm2/l;Lm2/b;Ljava/util/UUID;)V

    new-instance v5, Lo2/c;

    const/4 v6, 0x1

    invoke-direct {v5, v15, v6}, Lo2/c;-><init>(Lm0/l3;I)V

    new-instance v7, Lu0/b;

    const v8, 0x1d1a4619

    invoke-direct {v7, v8, v5, v6}, Lu0/b;-><init>(ILd9/j;Z)V

    iget-object v5, v2, Lo2/p;->n:Lo2/n;

    invoke-virtual {v5, v14}, Lu1/a;->setParentCompositionContext(Lm0/u;)V

    iget-object v8, v5, Lo2/n;->q:Lm0/n1;

    invoke-virtual {v8, v7}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    iput-boolean v6, v5, Lo2/n;->s:Z

    iget-object v6, v5, Lu1/a;->d:Lm0/u;

    if-nez v6, :cond_e

    invoke-virtual {v5}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v6

    if-eqz v6, :cond_d

    goto :goto_8

    :cond_d
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference."

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_e
    :goto_8
    invoke-virtual {v5}, Lu1/a;->c()V

    invoke-virtual {v0, v2}, Lm0/q;->l0(Ljava/lang/Object;)V

    move-object v6, v2

    const/4 v2, 0x0

    :cond_f
    invoke-virtual {v0, v2}, Lm0/q;->t(Z)V

    check-cast v6, Lo2/p;

    new-instance v5, Lo2/a;

    invoke-direct {v5, v6, v2}, Lo2/a;-><init>(Lo2/p;I)V

    invoke-static {v6, v5, v0}, Lm0/s;->a(Ljava/lang/Object;Lc9/c;Lm0/m;)V

    new-instance v2, Lt/q0;

    const/4 v10, 0x2

    move-object v5, v2

    move-object/from16 v7, p0

    move-object v8, v12

    move-object v9, v13

    invoke-direct/range {v5 .. v10}, Lt/q0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-static {v2, v0}, Lm0/s;->d(Lc9/a;Lm0/m;)V

    move-object v2, v12

    :goto_9
    invoke-virtual {v0}, Lm0/q;->x()Lm0/x1;

    move-result-object v7

    if-eqz v7, :cond_10

    new-instance v8, La0/r;

    const/4 v6, 0x5

    move-object v0, v8

    move-object/from16 v1, p0

    move-object/from16 v3, p2

    move/from16 v4, p4

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, La0/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq8/a;III)V

    iput-object v8, v7, Lm0/x1;->d:Lc9/e;

    :cond_10
    return-void
.end method

.method public static d0(Ljava/io/InputStream;I)[B
    .locals 3

    new-array v0, p1, [B

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p1, :cond_1

    sub-int v2, p1, v1

    invoke-virtual {p0, v0, v1, v2}, Ljava/io/InputStream;->read([BII)I

    move-result v2

    if-ltz v2, :cond_0

    add-int/2addr v1, v2

    goto :goto_0

    :cond_0
    const-string p0, "Not enough bytes to read: "

    invoke-static {p0, p1}, Ll/q;->g(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    return-object v0
.end method

.method public static final e(II)J
    .locals 4

    int-to-long v0, p0

    const/16 p0, 0x20

    shl-long/2addr v0, p0

    int-to-long p0, p1

    const-wide v2, 0xffffffffL

    and-long/2addr p0, v2

    or-long/2addr p0, v0

    return-wide p0
.end method

.method public static e0(Ljava/io/FileInputStream;II)[B
    .locals 8

    new-instance v0, Ljava/util/zip/Inflater;

    invoke-direct {v0}, Ljava/util/zip/Inflater;-><init>()V

    :try_start_0
    new-array v1, p2, [B

    const/16 v2, 0x800

    new-array v2, v2, [B

    const/4 v3, 0x0

    move v4, v3

    move v5, v4

    :goto_0
    invoke-virtual {v0}, Ljava/util/zip/Inflater;->finished()Z

    move-result v6

    if-nez v6, :cond_1

    invoke-virtual {v0}, Ljava/util/zip/Inflater;->needsDictionary()Z

    move-result v6

    if-nez v6, :cond_1

    if-ge v4, p1, :cond_1

    invoke-virtual {p0, v2}, Ljava/io/InputStream;->read([B)I

    move-result v6

    if-ltz v6, :cond_0

    invoke-virtual {v0, v2, v3, v6}, Ljava/util/zip/Inflater;->setInput([BII)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sub-int v7, p2, v5

    :try_start_1
    invoke-virtual {v0, v1, v5, v7}, Ljava/util/zip/Inflater;->inflate([BII)I

    move-result v7
    :try_end_1
    .catch Ljava/util/zip/DataFormatException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    add-int/2addr v5, v7

    add-int/2addr v4, v6

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :catch_0
    move-exception p0

    :try_start_2
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Invalid zip data. Stream ended after $totalBytesRead bytes. Expected "

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " bytes"

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    if-ne v4, p1, :cond_3

    invoke-virtual {v0}, Ljava/util/zip/Inflater;->finished()Z

    move-result p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz p0, :cond_2

    invoke-virtual {v0}, Ljava/util/zip/Inflater;->end()V

    return-object v1

    :cond_2
    :try_start_3
    const-string p0, "Inflater did not finish"

    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Didn\'t read enough bytes during decompression. expected="

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " actual="

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_1
    invoke-virtual {v0}, Ljava/util/zip/Inflater;->end()V

    throw p0
.end method

.method public static final f(Landroidx/compose/ui/node/a;Z)Ly1/o;
    .locals 8

    iget-object v0, p0, Landroidx/compose/ui/node/a;->C:Lt1/x0;

    iget-object v0, v0, Lt1/x0;->e:Ly0/n;

    iget v1, v0, Ly0/n;->d:I

    and-int/lit8 v1, v1, 0x8

    const/4 v2, 0x0

    if-eqz v1, :cond_8

    :goto_0
    if-eqz v0, :cond_8

    iget v1, v0, Ly0/n;->c:I

    and-int/lit8 v1, v1, 0x8

    if-eqz v1, :cond_7

    move-object v1, v0

    move-object v3, v2

    :goto_1
    if-eqz v1, :cond_7

    instance-of v4, v1, Lt1/r1;

    if-eqz v4, :cond_0

    move-object v2, v1

    goto :goto_4

    :cond_0
    iget v4, v1, Ly0/n;->c:I

    and-int/lit8 v4, v4, 0x8

    if-eqz v4, :cond_6

    instance-of v4, v1, Lt1/o;

    if-eqz v4, :cond_6

    move-object v4, v1

    check-cast v4, Lt1/o;

    iget-object v4, v4, Lt1/o;->v:Ly0/n;

    const/4 v5, 0x0

    :goto_2
    const/4 v6, 0x1

    if-eqz v4, :cond_5

    iget v7, v4, Ly0/n;->c:I

    and-int/lit8 v7, v7, 0x8

    if-eqz v7, :cond_4

    add-int/lit8 v5, v5, 0x1

    if-ne v5, v6, :cond_1

    move-object v1, v4

    goto :goto_3

    :cond_1
    if-nez v3, :cond_2

    new-instance v3, Lo0/i;

    const/16 v6, 0x10

    new-array v6, v6, [Ly0/n;

    invoke-direct {v3, v6}, Lo0/i;-><init>([Ljava/lang/Object;)V

    :cond_2
    if-eqz v1, :cond_3

    invoke-virtual {v3, v1}, Lo0/i;->c(Ljava/lang/Object;)V

    move-object v1, v2

    :cond_3
    invoke-virtual {v3, v4}, Lo0/i;->c(Ljava/lang/Object;)V

    :cond_4
    :goto_3
    iget-object v4, v4, Ly0/n;->f:Ly0/n;

    goto :goto_2

    :cond_5
    if-ne v5, v6, :cond_6

    goto :goto_1

    :cond_6
    invoke-static {v3}, Lt1/g;->f(Lo0/i;)Ly0/n;

    move-result-object v1

    goto :goto_1

    :cond_7
    iget v1, v0, Ly0/n;->d:I

    and-int/lit8 v1, v1, 0x8

    if-eqz v1, :cond_8

    iget-object v0, v0, Ly0/n;->f:Ly0/n;

    goto :goto_0

    :cond_8
    :goto_4
    invoke-static {v2}, Ld7/a;->j(Ljava/lang/Object;)V

    check-cast v2, Lt1/r1;

    check-cast v2, Ly0/n;

    iget-object v0, v2, Ly0/n;->a:Ly0/n;

    invoke-virtual {p0}, Landroidx/compose/ui/node/a;->n()Ly1/j;

    move-result-object v1

    invoke-static {v1}, Ld7/a;->j(Ljava/lang/Object;)V

    new-instance v2, Ly1/o;

    invoke-direct {v2, v0, p1, p0, v1}, Ly1/o;-><init>(Ly0/n;ZLandroidx/compose/ui/node/a;Ly1/j;)V

    return-object v2
.end method

.method public static f0(Ljava/io/InputStream;I)J
    .locals 6

    invoke-static {p0, p1}, Lo1/s;->d0(Ljava/io/InputStream;I)[B

    move-result-object p0

    const-wide/16 v0, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, p1, :cond_0

    aget-byte v3, p0, v2

    and-int/lit16 v3, v3, 0xff

    int-to-long v3, v3

    mul-int/lit8 v5, v2, 0x8

    shl-long/2addr v3, v5

    add-long/2addr v0, v3

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-wide v0
.end method

.method public static final g(II)J
    .locals 4

    const/16 v0, 0x5d

    const-string v1, ", end: "

    if-ltz p0, :cond_1

    if-ltz p1, :cond_0

    int-to-long v0, p0

    const/16 p0, 0x20

    shl-long/2addr v0, p0

    int-to-long p0, p1

    const-wide v2, 0xffffffffL

    and-long/2addr p0, v2

    or-long/2addr p0, v0

    sget v0, La2/b0;->c:I

    return-wide p0

    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "end cannot be negative. [start: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "start cannot be negative. [start: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static final g0(La2/c0;Lm2/l;)La2/c0;
    .locals 24

    move-object/from16 v0, p0

    new-instance v1, La2/c0;

    iget-object v2, v0, La2/c0;->a:La2/x;

    sget v3, La2/y;->e:I

    iget-object v3, v2, La2/x;->a:Ll2/o;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v4, Ll2/m;->a:Ll2/m;

    invoke-static {v3, v4}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_0

    :goto_0
    move-object v5, v3

    goto :goto_1

    :cond_0
    sget-wide v5, La2/y;->d:J

    sget-wide v7, Le1/r;->g:J

    cmp-long v3, v5, v7

    if-eqz v3, :cond_1

    new-instance v3, Ll2/c;

    invoke-direct {v3, v5, v6}, Ll2/c;-><init>(J)V

    goto :goto_0

    :cond_1
    move-object v3, v4

    goto :goto_0

    :goto_1
    iget-wide v3, v2, La2/x;->b:J

    invoke-static {v3, v4}, Lo1/s;->V(J)Z

    move-result v6

    if-eqz v6, :cond_2

    sget-wide v3, La2/y;->a:J

    :cond_2
    move-wide v6, v3

    iget-object v3, v2, La2/x;->c:Lf2/l;

    if-nez v3, :cond_3

    sget-object v3, Lf2/l;->c:Lf2/l;

    :cond_3
    move-object v8, v3

    iget-object v3, v2, La2/x;->d:Lf2/j;

    if-eqz v3, :cond_4

    iget v3, v3, Lf2/j;->a:I

    goto :goto_2

    :cond_4
    const/4 v3, 0x0

    :goto_2
    new-instance v9, Lf2/j;

    invoke-direct {v9, v3}, Lf2/j;-><init>(I)V

    iget-object v4, v2, La2/x;->e:Lf2/k;

    if-eqz v4, :cond_5

    iget v4, v4, Lf2/k;->a:I

    goto :goto_3

    :cond_5
    const/4 v4, 0x1

    :goto_3
    new-instance v10, Lf2/k;

    invoke-direct {v10, v4}, Lf2/k;-><init>(I)V

    iget-object v4, v2, La2/x;->f:Lf2/e;

    if-nez v4, :cond_6

    sget-object v4, Lf2/e;->a:Lf2/b;

    :cond_6
    move-object v11, v4

    iget-object v4, v2, La2/x;->g:Ljava/lang/String;

    if-nez v4, :cond_7

    const-string v4, ""

    :cond_7
    move-object v12, v4

    iget-wide v13, v2, La2/x;->h:J

    invoke-static {v13, v14}, Lo1/s;->V(J)Z

    move-result v4

    if-eqz v4, :cond_8

    sget-wide v13, La2/y;->b:J

    :cond_8
    iget-object v4, v2, La2/x;->i:Ll2/a;

    if-eqz v4, :cond_9

    iget v4, v4, Ll2/a;->a:F

    goto :goto_4

    :cond_9
    const/4 v4, 0x0

    :goto_4
    new-instance v15, Ll2/a;

    invoke-direct {v15, v4}, Ll2/a;-><init>(F)V

    iget-object v4, v2, La2/x;->j:Ll2/p;

    if-nez v4, :cond_a

    sget-object v4, Ll2/p;->c:Ll2/p;

    :cond_a
    move-object/from16 v16, v4

    iget-object v4, v2, La2/x;->k:Lh2/d;

    if-nez v4, :cond_b

    sget-object v4, Lh2/f;->a:Lh2/b;

    invoke-virtual {v4}, Lh2/b;->a()Lh2/d;

    move-result-object v4

    :cond_b
    move-object/from16 v17, v4

    sget-wide v18, Le1/r;->g:J

    iget-wide v3, v2, La2/x;->l:J

    cmp-long v18, v3, v18

    if-eqz v18, :cond_c

    :goto_5
    move-wide/from16 v18, v3

    goto :goto_6

    :cond_c
    sget-wide v3, La2/y;->c:J

    goto :goto_5

    :goto_6
    iget-object v3, v2, La2/x;->m:Ll2/j;

    if-nez v3, :cond_d

    sget-object v3, Ll2/j;->b:Ll2/j;

    :cond_d
    move-object/from16 v20, v3

    iget-object v3, v2, La2/x;->n:Le1/k0;

    if-nez v3, :cond_e

    sget-object v3, Le1/k0;->d:Le1/k0;

    :cond_e
    move-object/from16 v21, v3

    iget-object v3, v2, La2/x;->o:La2/s;

    iget-object v2, v2, La2/x;->p:Lg1/h;

    if-nez v2, :cond_f

    sget-object v2, Lg1/j;->a:Lg1/j;

    :cond_f
    move-object/from16 v23, v2

    new-instance v2, La2/x;

    move-object v4, v2

    move-object/from16 v22, v3

    invoke-direct/range {v4 .. v23}, La2/x;-><init>(Ll2/o;JLf2/l;Lf2/j;Lf2/k;Lf2/e;Ljava/lang/String;JLl2/a;Ll2/p;Lh2/d;JLl2/j;Le1/k0;La2/s;Lg1/h;)V

    sget v3, La2/q;->b:I

    new-instance v3, La2/p;

    iget-object v4, v0, La2/c0;->b:La2/p;

    iget v5, v4, La2/p;->a:I

    const/high16 v6, -0x80000000

    invoke-static {v5, v6}, Ll2/i;->a(II)Z

    move-result v5

    const/4 v7, 0x5

    if-eqz v5, :cond_10

    move v5, v7

    goto :goto_7

    :cond_10
    iget v5, v4, La2/p;->a:I

    :goto_7
    const/4 v8, 0x3

    iget v9, v4, La2/p;->b:I

    invoke-static {v9, v8}, Ll2/k;->a(II)Z

    move-result v8

    if-eqz v8, :cond_13

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Enum;->ordinal()I

    move-result v8

    if-eqz v8, :cond_12

    const/4 v9, 0x1

    if-ne v8, v9, :cond_11

    move v8, v9

    goto :goto_8

    :cond_11
    new-instance v0, Landroidx/fragment/app/a0;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0

    :cond_12
    const/4 v7, 0x4

    const/4 v8, 0x1

    goto :goto_8

    :cond_13
    invoke-static {v9, v6}, Ll2/k;->a(II)Z

    move-result v7

    if-eqz v7, :cond_16

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-eqz v7, :cond_15

    const/4 v8, 0x1

    if-ne v7, v8, :cond_14

    const/4 v7, 0x2

    goto :goto_8

    :cond_14
    new-instance v0, Landroidx/fragment/app/a0;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0

    :cond_15
    const/4 v8, 0x1

    move v7, v8

    goto :goto_8

    :cond_16
    const/4 v8, 0x1

    move v7, v9

    :goto_8
    iget-wide v9, v4, La2/p;->c:J

    invoke-static {v9, v10}, Lo1/s;->V(J)Z

    move-result v11

    if-eqz v11, :cond_17

    sget-wide v9, La2/q;->a:J

    :cond_17
    iget-object v11, v4, La2/p;->d:Ll2/q;

    if-nez v11, :cond_18

    sget-object v11, Ll2/q;->c:Ll2/q;

    :cond_18
    iget-object v12, v4, La2/p;->e:La2/r;

    iget-object v13, v4, La2/p;->f:Ll2/g;

    iget v14, v4, La2/p;->g:I

    if-nez v14, :cond_19

    sget v14, Ll2/e;->b:I

    :cond_19
    iget v15, v4, La2/p;->h:I

    invoke-static {v15, v6}, Ll2/d;->a(II)Z

    move-result v6

    if-eqz v6, :cond_1a

    move v15, v8

    :cond_1a
    iget-object v4, v4, La2/p;->i:Ll2/r;

    if-nez v4, :cond_1b

    sget-object v4, Ll2/r;->c:Ll2/r;

    :cond_1b
    move-object/from16 v16, v4

    move-object v4, v3

    move v6, v7

    move-wide v7, v9

    move-object v9, v11

    move-object v10, v12

    move-object v11, v13

    move v12, v14

    move v13, v15

    move-object/from16 v14, v16

    invoke-direct/range {v4 .. v14}, La2/p;-><init>(IIJLl2/q;La2/r;Ll2/g;IILl2/r;)V

    iget-object v0, v0, La2/c0;->c:La2/t;

    invoke-direct {v1, v2, v3, v0}, La2/c0;-><init>(La2/x;La2/p;La2/t;)V

    return-object v1
.end method

.method public static final h(Ly0/o;Lc9/e;Lm0/m;II)V
    .locals 9

    check-cast p2, Lm0/q;

    const v0, -0x4634f888

    invoke-virtual {p2, v0}, Lm0/q;->a0(I)Lm0/q;

    and-int/lit8 v0, p4, 0x1

    if-eqz v0, :cond_0

    or-int/lit8 v1, p3, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v1, p3, 0xe

    if-nez v1, :cond_2

    invoke-virtual {p2, p0}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x4

    goto :goto_0

    :cond_1
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, p3

    goto :goto_1

    :cond_2
    move v1, p3

    :goto_1
    and-int/lit8 v2, p4, 0x2

    if-eqz v2, :cond_3

    or-int/lit8 v1, v1, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v2, p3, 0x70

    if-nez v2, :cond_5

    invoke-virtual {p2, p1}, Lm0/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    const/16 v2, 0x20

    goto :goto_2

    :cond_4
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v1, v2

    :cond_5
    :goto_3
    and-int/lit8 v2, v1, 0x5b

    const/16 v3, 0x12

    if-ne v2, v3, :cond_7

    invoke-virtual {p2}, Lm0/q;->G()Z

    move-result v2

    if-nez v2, :cond_6

    goto :goto_5

    :cond_6
    invoke-virtual {p2}, Lm0/q;->U()V

    :goto_4
    move-object v4, p0

    goto/16 :goto_7

    :cond_7
    :goto_5
    if-eqz v0, :cond_8

    sget-object p0, Ly0/l;->b:Ly0/l;

    :cond_8
    sget-object v0, Lo2/e;->b:Lo2/e;

    shr-int/lit8 v2, v1, 0x3

    and-int/lit8 v2, v2, 0xe

    or-int/lit16 v2, v2, 0x180

    shl-int/lit8 v1, v1, 0x3

    and-int/lit8 v1, v1, 0x70

    or-int/2addr v1, v2

    const v2, -0x4ee9b9da

    invoke-virtual {p2, v2}, Lm0/q;->Z(I)V

    iget v2, p2, Lm0/q;->P:I

    invoke-virtual {p2}, Lm0/q;->p()Lm0/r1;

    move-result-object v3

    sget-object v4, Lt1/l;->k:Lt1/k;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v4, Lt1/k;->b:Lt1/j;

    invoke-static {p0}, Landroidx/compose/ui/layout/a;->i(Ly0/o;)Lu0/b;

    move-result-object v5

    shl-int/lit8 v1, v1, 0x9

    and-int/lit16 v1, v1, 0x1c00

    or-int/lit8 v1, v1, 0x6

    iget-object v6, p2, Lm0/q;->a:Lm0/d;

    instance-of v6, v6, Lm0/d;

    if-eqz v6, :cond_d

    invoke-virtual {p2}, Lm0/q;->c0()V

    iget-boolean v6, p2, Lm0/q;->O:Z

    if-eqz v6, :cond_9

    invoke-virtual {p2, v4}, Lm0/q;->o(Lc9/a;)V

    goto :goto_6

    :cond_9
    invoke-virtual {p2}, Lm0/q;->o0()V

    :goto_6
    sget-object v4, Lt1/k;->e:Lt1/i;

    invoke-static {p2, v0, v4}, Ld7/t;->s0(Lm0/m;Ljava/lang/Object;Lc9/e;)V

    sget-object v0, Lt1/k;->d:Lt1/i;

    invoke-static {p2, v3, v0}, Ld7/t;->s0(Lm0/m;Ljava/lang/Object;Lc9/e;)V

    sget-object v0, Lt1/k;->f:Lt1/i;

    iget-boolean v3, p2, Lm0/q;->O:Z

    if-nez v3, :cond_a

    invoke-virtual {p2}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v3, v4}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_b

    :cond_a
    invoke-static {v2, p2, v2, v0}, Ll/q;->r(ILm0/q;ILt1/i;)V

    :cond_b
    new-instance v0, Lm0/l2;

    invoke-direct {v0, p2}, Lm0/l2;-><init>(Lm0/m;)V

    shr-int/lit8 v2, v1, 0x3

    and-int/lit8 v2, v2, 0x70

    const v3, 0x7ab4aae9

    invoke-static {v2, v5, v0, p2, v3}, Ll/q;->s(ILu0/b;Lm0/l2;Lm0/q;I)V

    shr-int/lit8 v0, v1, 0x9

    and-int/lit8 v0, v0, 0xe

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, p1, p2, v1, v2}, Ll/q;->q(ILc9/e;Lm0/q;ZZ)V

    invoke-virtual {p2, v1}, Lm0/q;->t(Z)V

    goto/16 :goto_4

    :goto_7
    invoke-virtual {p2}, Lm0/q;->x()Lm0/x1;

    move-result-object p0

    if-eqz p0, :cond_c

    new-instance p2, Lh0/p0;

    const/4 v8, 0x2

    move-object v3, p2

    move-object v5, p1

    move v6, p3

    move v7, p4

    invoke-direct/range {v3 .. v8}, Lh0/p0;-><init>(Ly0/o;Lc9/e;III)V

    iput-object p2, p0, Lm0/x1;->d:Lc9/e;

    :cond_c
    return-void

    :cond_d
    invoke-static {}, Lm9/e0;->C()V

    const/4 p0, 0x0

    throw p0
.end method

.method public static final h0(JFLm2/b;)F
    .locals 4

    invoke-static {p0, p1}, Lm2/n;->b(J)J

    move-result-wide v0

    const-wide v2, 0x100000000L

    invoke-static {v0, v1, v2, v3}, Lm2/o;->a(JJ)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p3}, Lm2/b;->m()F

    move-result v0

    float-to-double v0, v0

    const-wide v2, 0x3ff0cccccccccccdL    # 1.05

    cmpl-double v0, v0, v2

    if-lez v0, :cond_0

    invoke-interface {p3, p2}, Lm2/b;->e0(F)J

    move-result-wide v0

    invoke-static {p0, p1}, Lm2/n;->c(J)F

    move-result p0

    invoke-static {v0, v1}, Lm2/n;->c(J)F

    move-result p1

    div-float/2addr p0, p1

    :goto_0
    mul-float/2addr p0, p2

    goto :goto_1

    :cond_0
    invoke-interface {p3, p0, p1}, Lm2/b;->Z(J)F

    move-result p0

    goto :goto_1

    :cond_1
    const-wide v2, 0x200000000L

    invoke-static {v0, v1, v2, v3}, Lm2/o;->a(JJ)Z

    move-result p3

    if-eqz p3, :cond_2

    invoke-static {p0, p1}, Lm2/n;->c(J)F

    move-result p0

    goto :goto_0

    :cond_2
    const/high16 p0, 0x7fc00000    # Float.NaN

    :goto_1
    return p0
.end method

.method public static final i(La2/c0;)Z
    .locals 2

    iget-object p0, p0, La2/c0;->c:La2/t;

    if-eqz p0, :cond_0

    iget-object p0, p0, La2/t;->b:La2/r;

    if-eqz p0, :cond_0

    new-instance v0, La2/h;

    iget p0, p0, La2/r;->b:I

    invoke-direct {v0, p0}, La2/h;-><init>(I)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const/4 p0, 0x0

    const/4 v1, 0x1

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    iget v0, v0, La2/h;->a:I

    if-ne v0, v1, :cond_2

    move p0, v1

    :cond_2
    :goto_1
    xor-int/2addr p0, v1

    return p0
.end method

.method public static final i0(Landroid/view/View;Landroidx/lifecycle/w;)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x7f0800e5

    invoke-virtual {p0, v0, p1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    return-void
.end method

.method public static j(Lm9/i0;)Landroidx/concurrent/futures/m;
    .locals 6

    const-string v0, "Deferred.asListenableFuture"

    new-instance v1, Landroidx/concurrent/futures/k;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    new-instance v2, Landroidx/concurrent/futures/o;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    iput-object v2, v1, Landroidx/concurrent/futures/k;->c:Landroidx/concurrent/futures/o;

    new-instance v2, Landroidx/concurrent/futures/m;

    invoke-direct {v2, v1}, Landroidx/concurrent/futures/m;-><init>(Landroidx/concurrent/futures/k;)V

    iput-object v2, v1, Landroidx/concurrent/futures/k;->b:Landroidx/concurrent/futures/m;

    const-class v3, Lv3/a;

    iput-object v3, v1, Landroidx/concurrent/futures/k;->a:Ljava/lang/Object;

    :try_start_0
    new-instance v3, Lu/s;

    const/16 v4, 0x1c

    invoke-direct {v3, v4, v1, p0}, Lu/s;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const/4 v4, 0x0

    const/4 v5, 0x1

    invoke-virtual {p0, v4, v5, v3}, Lm9/p1;->U(ZZLc9/c;)Lm9/o0;

    iput-object v0, v1, Landroidx/concurrent/futures/k;->a:Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    iget-object v0, v2, Landroidx/concurrent/futures/m;->b:Landroidx/concurrent/futures/l;

    invoke-virtual {v0, p0}, Landroidx/concurrent/futures/j;->setException(Ljava/lang/Throwable;)Z

    :goto_0
    return-object v2
.end method

.method public static final j0(Landroid/text/Spannable;JII)V
    .locals 2

    sget-wide v0, Le1/r;->g:J

    cmp-long v0, p1, v0

    if-eqz v0, :cond_0

    new-instance v0, Landroid/text/style/ForegroundColorSpan;

    invoke-static {p1, p2}, Landroidx/compose/ui/graphics/a;->s(J)I

    move-result p1

    invoke-direct {v0, p1}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    const/16 p1, 0x21

    invoke-interface {p0, v0, p3, p4, p1}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    :cond_0
    return-void
.end method

.method public static final k(Ljava/util/ArrayList;)Z
    .locals 11

    invoke-interface {p0}, Ljava/util/Collection;->size()I

    move-result v0

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-ge v0, v1, :cond_0

    return v2

    :cond_0
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ne v0, v2, :cond_1

    goto :goto_1

    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-static {p0}, Ld7/t;->Y(Ljava/util/List;)I

    move-result v4

    move v5, v1

    :goto_0
    if-ge v5, v4, :cond_3

    add-int/lit8 v5, v5, 0x1

    invoke-virtual {p0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Ly1/o;

    check-cast v3, Ly1/o;

    invoke-virtual {v3}, Ly1/o;->e()Ld1/d;

    move-result-object v8

    invoke-virtual {v8}, Ld1/d;->a()J

    move-result-wide v8

    invoke-static {v8, v9}, Ld1/c;->d(J)F

    move-result v8

    invoke-virtual {v7}, Ly1/o;->e()Ld1/d;

    move-result-object v9

    invoke-virtual {v9}, Ld1/d;->a()J

    move-result-wide v9

    invoke-static {v9, v10}, Ld1/c;->d(J)F

    move-result v9

    sub-float/2addr v8, v9

    invoke-static {v8}, Ljava/lang/Math;->abs(F)F

    move-result v8

    invoke-virtual {v3}, Ly1/o;->e()Ld1/d;

    move-result-object v3

    invoke-virtual {v3}, Ld1/d;->a()J

    move-result-wide v9

    invoke-static {v9, v10}, Ld1/c;->e(J)F

    move-result v3

    invoke-virtual {v7}, Ly1/o;->e()Ld1/d;

    move-result-object v7

    invoke-virtual {v7}, Ld1/d;->a()J

    move-result-wide v9

    invoke-static {v9, v10}, Ld1/c;->e(J)F

    move-result v7

    sub-float/2addr v3, v7

    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    move-result v3

    invoke-static {v8, v3}, Ld9/i;->f(FF)J

    move-result-wide v7

    new-instance v3, Ld1/c;

    invoke-direct {v3, v7, v8}, Ld1/c;-><init>(J)V

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object v3, v6

    goto :goto_0

    :cond_2
    :goto_1
    sget-object v0, Lr8/r;->a:Lr8/r;

    :cond_3
    move-object p0, v0

    check-cast p0, Ljava/util/Collection;

    invoke-interface {p0}, Ljava/util/Collection;->size()I

    move-result p0

    if-ne p0, v2, :cond_4

    invoke-static {v0}, Lr8/p;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ld1/c;

    iget-wide v3, p0, Ld1/c;->a:J

    goto :goto_3

    :cond_4
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result p0

    if-nez p0, :cond_7

    invoke-static {v0}, Lr8/p;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {v0}, Ld7/t;->Y(Ljava/util/List;)I

    move-result v3

    if-gt v2, v3, :cond_5

    move v4, v2

    :goto_2
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ld1/c;

    iget-wide v5, v5, Ld1/c;->a:J

    check-cast p0, Ld1/c;

    iget-wide v7, p0, Ld1/c;->a:J

    invoke-static {v7, v8, v5, v6}, Ld1/c;->g(JJ)J

    move-result-wide v5

    new-instance p0, Ld1/c;

    invoke-direct {p0, v5, v6}, Ld1/c;-><init>(J)V

    if-eq v4, v3, :cond_5

    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_5
    check-cast p0, Ld1/c;

    iget-wide v3, p0, Ld1/c;->a:J

    :goto_3
    invoke-static {v3, v4}, Ld1/c;->d(J)F

    move-result p0

    invoke-static {v3, v4}, Ld1/c;->e(J)F

    move-result v0

    cmpg-float p0, v0, p0

    if-gez p0, :cond_6

    goto :goto_4

    :cond_6
    move v2, v1

    :goto_4
    return v2

    :cond_7
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Empty collection can\'t be reduced."

    invoke-direct {p0, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static k0(Landroid/view/Window;Z)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    invoke-static {p0, p1}, Lb3/x0;->a(Landroid/view/Window;Z)V

    goto :goto_0

    :cond_0
    invoke-static {p0, p1}, Lb3/w0;->a(Landroid/view/Window;Z)V

    :goto_0
    return-void
.end method

.method public static l(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 0

    if-eqz p0, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final l0(Landroid/text/Spannable;JLm2/b;II)V
    .locals 6

    invoke-static {p1, p2}, Lm2/n;->b(J)J

    move-result-wide v0

    const-wide v2, 0x100000000L

    invoke-static {v0, v1, v2, v3}, Lm2/o;->a(JJ)Z

    move-result v2

    const/16 v3, 0x21

    if-eqz v2, :cond_0

    new-instance v0, Landroid/text/style/AbsoluteSizeSpan;

    invoke-interface {p3, p1, p2}, Lm2/b;->Z(J)F

    move-result p1

    invoke-static {p1}, Ld7/t;->p0(F)I

    move-result p1

    const/4 p2, 0x0

    invoke-direct {v0, p1, p2}, Landroid/text/style/AbsoluteSizeSpan;-><init>(IZ)V

    invoke-interface {p0, v0, p4, p5, v3}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    goto :goto_0

    :cond_0
    const-wide v4, 0x200000000L

    invoke-static {v0, v1, v4, v5}, Lm2/o;->a(JJ)Z

    move-result p3

    if-eqz p3, :cond_1

    new-instance p3, Landroid/text/style/RelativeSizeSpan;

    invoke-static {p1, p2}, Lm2/n;->c(J)F

    move-result p1

    invoke-direct {p3, p1}, Landroid/text/style/RelativeSizeSpan;-><init>(F)V

    invoke-interface {p0, p3, p4, p5, v3}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    :cond_1
    :goto_0
    return-void
.end method

.method public static m(Landroid/content/Context;Ljava/lang/String;)I
    .locals 6

    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v0

    invoke-static {}, Landroid/os/Process;->myUid()I

    move-result v1

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, p1, v0, v1}, Landroid/content/Context;->checkPermission(Ljava/lang/String;II)I

    move-result v0

    const/4 v3, -0x1

    if-ne v0, v3, :cond_0

    goto/16 :goto_2

    :cond_0
    invoke-static {p1}, Lq2/j;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    if-nez p1, :cond_1

    :goto_0
    move v3, v0

    goto :goto_2

    :cond_1
    if-nez v2, :cond_3

    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/content/pm/PackageManager;->getPackagesForUid(I)[Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_8

    array-length v4, v2

    if-gtz v4, :cond_2

    goto :goto_2

    :cond_2
    aget-object v2, v2, v0

    :cond_3
    invoke-static {}, Landroid/os/Process;->myUid()I

    move-result v3

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    const-class v5, Landroid/app/AppOpsManager;

    if-ne v3, v1, :cond_6

    invoke-static {v4, v2}, La3/b;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x1d

    if-lt v3, v4, :cond_5

    invoke-static {p0}, Lq2/k;->c(Landroid/content/Context;)Landroid/app/AppOpsManager;

    move-result-object v3

    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    move-result v4

    invoke-static {v3, p1, v4, v2}, Lq2/k;->a(Landroid/app/AppOpsManager;Ljava/lang/String;ILjava/lang/String;)I

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_1

    :cond_4
    invoke-static {p0}, Lq2/k;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0

    invoke-static {v3, p1, v1, p0}, Lq2/k;->a(Landroid/app/AppOpsManager;Ljava/lang/String;ILjava/lang/String;)I

    move-result v2

    goto :goto_1

    :cond_5
    invoke-static {p0, v5}, Lq2/j;->a(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/app/AppOpsManager;

    invoke-static {p0, p1, v2}, Lq2/j;->c(Landroid/app/AppOpsManager;Ljava/lang/String;Ljava/lang/String;)I

    move-result v2

    goto :goto_1

    :cond_6
    invoke-static {p0, v5}, Lq2/j;->a(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/app/AppOpsManager;

    invoke-static {p0, p1, v2}, Lq2/j;->c(Landroid/app/AppOpsManager;Ljava/lang/String;Ljava/lang/String;)I

    move-result v2

    :goto_1
    if-nez v2, :cond_7

    goto :goto_0

    :cond_7
    const/4 p0, -0x2

    move v3, p0

    :cond_8
    :goto_2
    return v3
.end method

.method public static final m0(J)J
    .locals 3

    const/16 v0, 0x20

    shr-long v0, p0, v0

    long-to-int v0, v0

    int-to-float v0, v0

    const-wide v1, 0xffffffffL

    and-long/2addr p0, v1

    long-to-int p0, p0

    int-to-float p0, p0

    invoke-static {v0, p0}, Ld7/t;->j(FF)J

    move-result-wide p0

    return-wide p0
.end method

.method public static n([B)[B
    .locals 3

    new-instance v0, Ljava/util/zip/Deflater;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/zip/Deflater;-><init>(I)V

    new-instance v1, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    :try_start_0
    new-instance v2, Ljava/util/zip/DeflaterOutputStream;

    invoke-direct {v2, v1, v0}, Ljava/util/zip/DeflaterOutputStream;-><init>(Ljava/io/OutputStream;Ljava/util/zip/Deflater;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-virtual {v2, p0}, Ljava/io/OutputStream;->write([B)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-virtual {v2}, Ljava/util/zip/DeflaterOutputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-virtual {v0}, Ljava/util/zip/Deflater;->end()V

    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p0

    return-object p0

    :catchall_0
    move-exception p0

    goto :goto_1

    :catchall_1
    move-exception p0

    :try_start_3
    invoke-virtual {v2}, Ljava/util/zip/DeflaterOutputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_0

    :catchall_2
    move-exception v1

    :try_start_4
    invoke-virtual {p0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :goto_1
    invoke-virtual {v0}, Ljava/util/zip/Deflater;->end()V

    throw p0
.end method

.method public static final n0(JJ)J
    .locals 4

    invoke-static {p0, p1}, La2/b0;->e(J)I

    move-result v0

    invoke-static {p0, p1}, La2/b0;->d(J)I

    move-result v1

    invoke-static {p2, p3}, La2/b0;->e(J)I

    move-result v2

    invoke-static {p0, p1}, La2/b0;->d(J)I

    move-result v3

    if-ge v2, v3, :cond_3

    invoke-static {p0, p1}, La2/b0;->e(J)I

    move-result v2

    invoke-static {p2, p3}, La2/b0;->d(J)I

    move-result v3

    if-ge v2, v3, :cond_3

    invoke-static {p2, p3}, La2/b0;->e(J)I

    move-result v2

    invoke-static {p0, p1}, La2/b0;->e(J)I

    move-result v3

    if-gt v2, v3, :cond_0

    invoke-static {p0, p1}, La2/b0;->d(J)I

    move-result v2

    invoke-static {p2, p3}, La2/b0;->d(J)I

    move-result v3

    if-gt v2, v3, :cond_0

    invoke-static {p2, p3}, La2/b0;->e(J)I

    move-result v0

    move v1, v0

    goto :goto_1

    :cond_0
    invoke-static {p0, p1}, La2/b0;->e(J)I

    move-result v2

    invoke-static {p2, p3}, La2/b0;->e(J)I

    move-result v3

    if-gt v2, v3, :cond_1

    invoke-static {p2, p3}, La2/b0;->d(J)I

    move-result v2

    invoke-static {p0, p1}, La2/b0;->d(J)I

    move-result p0

    if-gt v2, p0, :cond_1

    invoke-static {p2, p3}, La2/b0;->c(J)I

    move-result p0

    :goto_0
    sub-int/2addr v1, p0

    goto :goto_1

    :cond_1
    invoke-static {p2, p3}, La2/b0;->e(J)I

    move-result p0

    invoke-static {p2, p3}, La2/b0;->d(J)I

    move-result p1

    if-ge v0, p1, :cond_2

    if-gt p0, v0, :cond_2

    invoke-static {p2, p3}, La2/b0;->e(J)I

    move-result v0

    invoke-static {p2, p3}, La2/b0;->c(J)I

    move-result p0

    goto :goto_0

    :cond_2
    invoke-static {p2, p3}, La2/b0;->e(J)I

    move-result v1

    goto :goto_1

    :cond_3
    invoke-static {p2, p3}, La2/b0;->e(J)I

    move-result p0

    if-le v1, p0, :cond_4

    invoke-static {p2, p3}, La2/b0;->c(J)I

    move-result p0

    sub-int/2addr v0, p0

    invoke-static {p2, p3}, La2/b0;->c(J)I

    move-result p0

    goto :goto_0

    :cond_4
    :goto_1
    invoke-static {v0, v1}, Lo1/s;->g(II)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final o(JJ)J
    .locals 3

    const/16 v0, 0x20

    shr-long v0, p2, v0

    long-to-int v0, v0

    invoke-static {p0, p1}, Lm2/a;->k(J)I

    move-result v1

    invoke-static {p0, p1}, Lm2/a;->i(J)I

    move-result v2

    invoke-static {v0, v1, v2}, Lz6/a;->r(III)I

    move-result v0

    const-wide v1, 0xffffffffL

    and-long/2addr p2, v1

    long-to-int p2, p2

    invoke-static {p0, p1}, Lm2/a;->j(J)I

    move-result p3

    invoke-static {p0, p1}, Lm2/a;->h(J)I

    move-result p0

    invoke-static {p2, p3, p0}, Lz6/a;->r(III)I

    move-result p0

    invoke-static {v0, p0}, Lo1/s;->e(II)J

    move-result-wide p0

    return-wide p0
.end method

.method public static o0(Ljava/io/ByteArrayOutputStream;JI)V
    .locals 6

    new-array v0, p3, [B

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p3, :cond_0

    mul-int/lit8 v2, v1, 0x8

    shr-long v2, p1, v2

    const-wide/16 v4, 0xff

    and-long/2addr v2, v4

    long-to-int v2, v2

    int-to-byte v2, v2

    aput-byte v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write([B)V

    return-void
.end method

.method public static final p(IJ)I
    .locals 1

    invoke-static {p1, p2}, Lm2/a;->j(J)I

    move-result v0

    invoke-static {p1, p2}, Lm2/a;->h(J)I

    move-result p1

    invoke-static {p0, v0, p1}, Lz6/a;->r(III)I

    move-result p0

    return p0
.end method

.method public static p0(Ljava/io/ByteArrayOutputStream;I)V
    .locals 2

    int-to-long v0, p1

    const/4 p1, 0x2

    invoke-static {p0, v0, v1, p1}, Lo1/s;->o0(Ljava/io/ByteArrayOutputStream;JI)V

    return-void
.end method

.method public static final q(IJ)I
    .locals 1

    invoke-static {p1, p2}, Lm2/a;->k(J)I

    move-result v0

    invoke-static {p1, p2}, Lm2/a;->i(J)I

    move-result p1

    invoke-static {p0, v0, p1}, Lz6/a;->r(III)I

    move-result p0

    return p0
.end method

.method public static r(Landroid/os/Looper;)Landroid/os/Handler;
    .locals 7

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    invoke-static {p0}, Lm/d;->a(Landroid/os/Looper;)Landroid/os/Handler;

    move-result-object p0

    return-object p0

    :cond_0
    :try_start_0
    const-class v0, Landroid/os/Handler;

    const/4 v1, 0x3

    new-array v2, v1, [Ljava/lang/Class;

    const-class v3, Landroid/os/Looper;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const-class v3, Landroid/os/Handler$Callback;

    const/4 v5, 0x1

    aput-object v3, v2, v5

    sget-object v3, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    const/4 v6, 0x2

    aput-object v3, v2, v6

    invoke-virtual {v0, v2}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    new-array v1, v1, [Ljava/lang/Object;

    aput-object p0, v1, v4

    const/4 v2, 0x0

    aput-object v2, v1, v5

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    aput-object v2, v1, v6

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Handler;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p0

    goto :goto_0

    :catch_1
    move-exception v0

    goto :goto_1

    :catch_2
    move-exception v0

    goto :goto_1

    :catch_3
    move-exception v0

    goto :goto_1

    :goto_0
    invoke-virtual {p0}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    instance-of v0, p0, Ljava/lang/RuntimeException;

    if-nez v0, :cond_2

    instance-of v0, p0, Ljava/lang/Error;

    if-eqz v0, :cond_1

    check-cast p0, Ljava/lang/Error;

    throw p0

    :cond_1
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :cond_2
    check-cast p0, Ljava/lang/RuntimeException;

    throw p0

    :goto_1
    const-string v1, "HandlerCompat"

    const-string v2, "Unable to invoke Handler(Looper, Callback, boolean) constructor"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0, p0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-object v0
.end method

.method public static final s(La2/i;Le1/p;Le1/n;FLe1/k0;Ll2/j;Lg1/h;I)V
    .locals 13

    move-object v0, p0

    iget-object v0, v0, La2/i;->h:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, La2/m;

    iget-object v4, v3, La2/m;->a:La2/l;

    move-object v5, v4

    check-cast v5, La2/a;

    move-object v6, p1

    move-object v7, p2

    move/from16 v8, p3

    move-object/from16 v9, p4

    move-object/from16 v10, p5

    move-object/from16 v11, p6

    move/from16 v12, p7

    invoke-virtual/range {v5 .. v12}, La2/a;->f(Le1/p;Le1/n;FLe1/k0;Ll2/j;Lg1/h;I)V

    iget-object v3, v3, La2/m;->a:La2/l;

    check-cast v3, La2/a;

    invoke-virtual {v3}, La2/a;->b()F

    move-result v3

    const/4 v4, 0x0

    move-object v5, p1

    invoke-interface {p1, v4, v3}, Le1/p;->e(FF)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static final t(II)Z
    .locals 0

    if-ne p0, p1, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final u(II)Z
    .locals 0

    if-ne p0, p1, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final v(Landroidx/compose/ui/node/a;Ly1/n;)Landroidx/compose/ui/node/a;
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/ui/node/a;->q()Landroidx/compose/ui/node/a;

    move-result-object p0

    :goto_0
    if-eqz p0, :cond_1

    invoke-virtual {p1, p0}, Ly1/n;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    invoke-virtual {p0}, Landroidx/compose/ui/node/a;->q()Landroidx/compose/ui/node/a;

    move-result-object p0

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static final w(ILjava/util/ArrayList;)I
    .locals 7

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-gt v3, v0, :cond_3

    add-int v4, v3, v0

    ushr-int/2addr v4, v1

    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, La2/m;

    iget v6, v5, La2/m;->b:I

    if-le v6, p0, :cond_0

    move v5, v1

    goto :goto_1

    :cond_0
    iget v5, v5, La2/m;->c:I

    if-gt v5, p0, :cond_1

    const/4 v5, -0x1

    goto :goto_1

    :cond_1
    move v5, v2

    :goto_1
    if-gez v5, :cond_2

    add-int/lit8 v3, v4, 0x1

    goto :goto_0

    :cond_2
    if-lez v5, :cond_4

    add-int/lit8 v0, v4, -0x1

    goto :goto_0

    :cond_3
    add-int/2addr v3, v1

    neg-int v4, v3

    :cond_4
    return v4
.end method

.method public static final x(ILjava/util/ArrayList;)I
    .locals 7

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-gt v3, v0, :cond_3

    add-int v4, v3, v0

    ushr-int/2addr v4, v1

    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, La2/m;

    iget v6, v5, La2/m;->d:I

    if-le v6, p0, :cond_0

    move v5, v1

    goto :goto_1

    :cond_0
    iget v5, v5, La2/m;->e:I

    if-gt v5, p0, :cond_1

    const/4 v5, -0x1

    goto :goto_1

    :cond_1
    move v5, v2

    :goto_1
    if-gez v5, :cond_2

    add-int/lit8 v3, v4, 0x1

    goto :goto_0

    :cond_2
    if-lez v5, :cond_4

    add-int/lit8 v0, v4, -0x1

    goto :goto_0

    :cond_3
    add-int/2addr v3, v1

    neg-int v4, v3

    :cond_4
    return v4
.end method

.method public static final y(Ljava/util/ArrayList;F)I
    .locals 7

    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-gt v3, v0, :cond_3

    add-int v4, v3, v0

    ushr-int/2addr v4, v1

    invoke-virtual {p0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, La2/m;

    iget v6, v5, La2/m;->f:F

    cmpl-float v6, v6, p1

    if-lez v6, :cond_0

    move v5, v1

    goto :goto_1

    :cond_0
    iget v5, v5, La2/m;->g:F

    cmpg-float v5, v5, p1

    if-gtz v5, :cond_1

    const/4 v5, -0x1

    goto :goto_1

    :cond_1
    move v5, v2

    :goto_1
    if-gez v5, :cond_2

    add-int/lit8 v3, v4, 0x1

    goto :goto_0

    :cond_2
    if-lez v5, :cond_4

    add-int/lit8 v0, v4, -0x1

    goto :goto_0

    :cond_3
    add-int/2addr v3, v1

    neg-int v4, v3

    :cond_4
    return v4
.end method

.method public static final z(Ljava/util/ArrayList;JLc9/c;)V
    .locals 5

    invoke-static {p1, p2}, La2/b0;->e(J)I

    move-result v0

    invoke-static {v0, p0}, Lo1/s;->w(ILjava/util/ArrayList;)I

    move-result v0

    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v1

    :goto_0
    if-ge v0, v1, :cond_1

    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La2/m;

    iget v3, v2, La2/m;->b:I

    invoke-static {p1, p2}, La2/b0;->d(J)I

    move-result v4

    if-ge v3, v4, :cond_1

    iget v3, v2, La2/m;->b:I

    iget v4, v2, La2/m;->c:I

    if-eq v3, v4, :cond_0

    invoke-interface {p3, v2}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method
