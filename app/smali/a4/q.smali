.class public La4/q;
.super Ljava/lang/Object;

# interfaces
.implements Lea/b0;
.implements Lf2/o;
.implements Lq4/m;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Le2/b;

    invoke-direct {v0}, Le2/b;-><init>()V

    .line 3
    new-instance v0, Le2/c;

    .line 4
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sget-object v1, Le2/a;->a:[I

    iput-object v1, v0, Le2/c;->a:[I

    sget-object v1, Le2/a;->b:[Ljava/lang/Object;

    iput-object v1, v0, Le2/c;->b:[Ljava/lang/Object;

    const/4 v1, 0x0

    iput v1, v0, Le2/c;->c:I

    return-void
.end method

.method public constructor <init>(Landroidx/recyclerview/widget/StaggeredGridLayoutManager;)V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    invoke-virtual {p0}, La4/q;->k()V

    return-void
.end method

.method public static final d(La4/q;Ljava/io/InputStream;)Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-nez p1, :cond_0

    const-string p0, ""

    goto :goto_1

    :cond_0
    new-instance p0, Ljava/io/BufferedInputStream;

    invoke-direct {p0, p1}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    new-instance p1, Ljava/io/ByteArrayOutputStream;

    invoke-direct {p1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    const/16 v0, 0x400

    :try_start_0
    new-array v0, v0, [B
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    :try_start_1
    invoke-virtual {p0, v0}, Ljava/io/InputStream;->read([B)I

    move-result v1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/4 v2, -0x1

    if-eq v1, v2, :cond_1

    const/4 v2, 0x0

    :try_start_2
    invoke-virtual {p1, v0, v2, v1}, Ljava/io/ByteArrayOutputStream;->write([BII)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :catch_0
    :cond_1
    :try_start_3
    invoke-virtual {p0}, Ljava/io/BufferedInputStream;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    :catch_1
    const-string p0, "UTF-8"

    invoke-virtual {p1, p0}, Ljava/io/ByteArrayOutputStream;->toString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const-string p1, "toString(...)"

    invoke-static {p0, p1}, Ld7/a;->l(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_1
    return-object p0

    :goto_2
    :try_start_4
    invoke-virtual {p0}, Ljava/io/BufferedInputStream;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    :catch_2
    throw p1
.end method

.method public static e(I)Lh8/t;
    .locals 2

    const/16 v0, 0x1000

    invoke-static {v0, p0}, Ljava/lang/Math;->max(II)I

    move-result p0

    const/high16 v0, 0x100000

    invoke-static {v0, p0}, Ljava/lang/Math;->min(II)I

    move-result p0

    new-instance v0, Lh8/t;

    new-instance v1, Lja/g;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-direct {v0, v1, p0}, Lh8/t;-><init>(Lja/g;I)V

    return-object v0
.end method

.method public static f([F)F
    .locals 7

    const/4 v0, 0x0

    aget v0, p0, v0

    const/4 v1, 0x1

    aget v1, p0, v1

    const/4 v2, 0x2

    aget v2, p0, v2

    const/4 v3, 0x3

    aget v3, p0, v3

    const/4 v4, 0x4

    aget v4, p0, v4

    const/4 v5, 0x5

    aget p0, p0, v5

    mul-float v5, v0, v3

    mul-float v6, v1, v4

    add-float/2addr v6, v5

    mul-float v5, v2, p0

    add-float/2addr v5, v6

    mul-float/2addr v3, v4

    sub-float/2addr v5, v3

    mul-float/2addr v1, v2

    sub-float/2addr v5, v1

    mul-float/2addr v0, p0

    sub-float/2addr v5, v0

    const/high16 p0, 0x3f000000    # 0.5f

    mul-float/2addr v5, p0

    const/4 p0, 0x0

    cmpg-float p0, v5, p0

    if-gez p0, :cond_0

    neg-float v5, v5

    :cond_0
    return v5
.end method

.method public static g(FFFF)F
    .locals 0

    mul-float/2addr p0, p3

    mul-float/2addr p1, p2

    sub-float/2addr p0, p1

    return p0
.end method

.method public static h()J
    .locals 2

    sget-wide v0, Le1/r;->c:J

    return-wide v0
.end method

.method public static i(Ljava/util/List;)Le1/z;
    .locals 8

    const/4 v6, 0x0

    const/4 v0, 0x0

    invoke-static {v0, v0}, Ld9/i;->f(FF)J

    move-result-wide v2

    const/high16 v1, 0x7f800000    # Float.POSITIVE_INFINITY

    invoke-static {v1, v0}, Ld9/i;->f(FF)J

    move-result-wide v4

    new-instance v7, Le1/z;

    move-object v0, v7

    move-object v1, p0

    invoke-direct/range {v0 .. v6}, Le1/z;-><init>(Ljava/util/List;JJI)V

    return-object v7
.end method

.method public static j(Ljava/util/List;FI)Le1/e0;
    .locals 8

    and-int/lit8 v0, p2, 0x2

    if-eqz v0, :cond_0

    sget-wide v0, Ld1/c;->d:J

    :goto_0
    move-wide v4, v0

    goto :goto_1

    :cond_0
    const-wide/16 v0, 0x0

    goto :goto_0

    :goto_1
    and-int/lit8 p2, p2, 0x4

    if-eqz p2, :cond_1

    const/high16 p1, 0x7f800000    # Float.POSITIVE_INFINITY

    :cond_1
    move v6, p1

    const/4 v7, 0x0

    new-instance p1, Le1/e0;

    move-object v2, p1

    move-object v3, p0

    invoke-direct/range {v2 .. v7}, Le1/e0;-><init>(Ljava/util/List;JFI)V

    return-object p1
.end method

.method public static n(Ljava/util/List;)Le1/z;
    .locals 8

    const/4 v6, 0x0

    const/4 v0, 0x0

    invoke-static {v0, v0}, Ld9/i;->f(FF)J

    move-result-wide v2

    const/high16 v1, 0x7f800000    # Float.POSITIVE_INFINITY

    invoke-static {v0, v1}, Ld9/i;->f(FF)J

    move-result-wide v4

    new-instance v7, Le1/z;

    move-object v0, v7

    move-object v1, p0

    invoke-direct/range {v0 .. v6}, Le1/z;-><init>(Ljava/util/List;JJI)V

    return-object v7
.end method


# virtual methods
.method public a(Lq4/c;)Lq4/d;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public b(I)V
    .locals 0

    return-void
.end method

.method public c(Lq4/c;Landroid/graphics/Bitmap;Ljava/util/Map;I)V
    .locals 0

    return-void
.end method

.method public k()V
    .locals 0

    return-void
.end method

.method public l(Landroid/view/View;II)V
    .locals 0

    return-void
.end method

.method public m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLu8/e;)Ljava/lang/Object;
    .locals 13

    move-object/from16 v0, p5

    instance-of v1, v0, La5/b;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, La5/b;

    iget v2, v1, La5/b;->c:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, La5/b;->c:I

    move-object v9, p0

    goto :goto_0

    :cond_0
    new-instance v1, La5/b;

    move-object v9, p0

    invoke-direct {v1, p0, v0}, La5/b;-><init>(La4/q;Lu8/e;)V

    :goto_0
    iget-object v0, v1, La5/b;->a:Ljava/lang/Object;

    sget-object v10, Lv8/a;->a:Lv8/a;

    iget v2, v1, La5/b;->c:I

    const/4 v11, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v11, :cond_1

    invoke-static {v0}, Ld7/t;->v0(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v0}, Ld7/t;->v0(Ljava/lang/Object;)V

    sget-object v0, Lm9/m0;->b:Lt9/c;

    new-instance v12, La5/c;

    const/4 v8, 0x0

    move-object v2, v12

    move-object v3, p0

    move-object v4, p1

    move-object v5, p2

    move-object/from16 v6, p3

    move/from16 v7, p4

    invoke-direct/range {v2 .. v8}, La5/c;-><init>(La4/q;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLu8/e;)V

    iput v11, v1, La5/b;->c:I

    invoke-static {v0, v12, v1}, Lz6/a;->u0(Lu8/j;Lc9/e;Lu8/e;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v10, :cond_3

    return-object v10

    :cond_3
    :goto_1
    check-cast v0, Lq8/h;

    iget-object v0, v0, Lq8/h;->a:Ljava/lang/Object;

    return-object v0
.end method
