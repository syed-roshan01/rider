.class public final Lq2/t;
.super Lq2/y;


# instance fields
.field public b:Landroidx/core/graphics/drawable/IconCompat;

.field public c:Landroidx/core/graphics/drawable/IconCompat;

.field public d:Z


# virtual methods
.method public final b(Lq2/k0;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    iget-object v3, v1, Lq2/k0;->b:Landroid/app/Notification$Builder;

    invoke-static {v3}, Lq2/q;->b(Landroid/app/Notification$Builder;)Landroid/app/Notification$BigPictureStyle;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v3, v4}, Lq2/q;->c(Landroid/app/Notification$BigPictureStyle;Ljava/lang/CharSequence;)Landroid/app/Notification$BigPictureStyle;

    move-result-object v3

    iget-object v5, v0, Lq2/t;->b:Landroidx/core/graphics/drawable/IconCompat;

    const/4 v6, 0x0

    const/16 v7, 0x1f

    iget-object v1, v1, Lq2/k0;->a:Landroid/content/Context;

    if-eqz v5, :cond_5

    if-lt v2, v7, :cond_0

    invoke-static {v5, v1}, Lv2/c;->c(Landroidx/core/graphics/drawable/IconCompat;Landroid/content/Context;)Landroid/graphics/drawable/Icon;

    move-result-object v5

    invoke-static {v3, v5}, Lq2/s;->a(Landroid/app/Notification$BigPictureStyle;Landroid/graphics/drawable/Icon;)V

    goto/16 :goto_1

    :cond_0
    invoke-virtual {v5}, Landroidx/core/graphics/drawable/IconCompat;->c()I

    move-result v5

    const/4 v8, 0x1

    if-ne v5, v8, :cond_5

    iget-object v5, v0, Lq2/t;->b:Landroidx/core/graphics/drawable/IconCompat;

    iget v9, v5, Landroidx/core/graphics/drawable/IconCompat;->a:I

    const/4 v10, -0x1

    if-ne v9, v10, :cond_2

    iget-object v5, v5, Landroidx/core/graphics/drawable/IconCompat;->b:Ljava/lang/Object;

    instance-of v8, v5, Landroid/graphics/Bitmap;

    if-eqz v8, :cond_1

    check-cast v5, Landroid/graphics/Bitmap;

    goto/16 :goto_0

    :cond_1
    move-object v5, v4

    goto/16 :goto_0

    :cond_2
    if-ne v9, v8, :cond_3

    iget-object v5, v5, Landroidx/core/graphics/drawable/IconCompat;->b:Ljava/lang/Object;

    check-cast v5, Landroid/graphics/Bitmap;

    goto/16 :goto_0

    :cond_3
    const/4 v8, 0x5

    if-ne v9, v8, :cond_4

    iget-object v5, v5, Landroidx/core/graphics/drawable/IconCompat;->b:Ljava/lang/Object;

    check-cast v5, Landroid/graphics/Bitmap;

    invoke-virtual {v5}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v8

    invoke-virtual {v5}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v9

    invoke-static {v8, v9}, Ljava/lang/Math;->min(II)I

    move-result v8

    int-to-float v8, v8

    const v9, 0x3f2aaaab

    mul-float/2addr v8, v9

    float-to-int v8, v8

    sget-object v9, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v8, v8, v9}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v9

    new-instance v10, Landroid/graphics/Canvas;

    invoke-direct {v10, v9}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    new-instance v11, Landroid/graphics/Paint;

    const/4 v12, 0x3

    invoke-direct {v11, v12}, Landroid/graphics/Paint;-><init>(I)V

    int-to-float v12, v8

    const/high16 v13, 0x3f000000    # 0.5f

    mul-float/2addr v13, v12

    const v14, 0x3f6aaaab

    mul-float/2addr v14, v13

    const v15, 0x3c2aaaab

    mul-float/2addr v15, v12

    invoke-virtual {v11, v6}, Landroid/graphics/Paint;->setColor(I)V

    const v16, 0x3caaaaab

    mul-float v12, v12, v16

    const/4 v6, 0x0

    const/high16 v7, 0x3d000000    # 0.03125f

    invoke-virtual {v11, v15, v6, v12, v7}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    invoke-virtual {v10, v13, v13, v14, v11}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    const/high16 v7, 0x1e000000

    invoke-virtual {v11, v15, v6, v6, v7}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    invoke-virtual {v10, v13, v13, v14, v11}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    invoke-virtual {v11}, Landroid/graphics/Paint;->clearShadowLayer()V

    const/high16 v6, -0x1000000

    invoke-virtual {v11, v6}, Landroid/graphics/Paint;->setColor(I)V

    new-instance v6, Landroid/graphics/BitmapShader;

    sget-object v7, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    invoke-direct {v6, v5, v7, v7}, Landroid/graphics/BitmapShader;-><init>(Landroid/graphics/Bitmap;Landroid/graphics/Shader$TileMode;Landroid/graphics/Shader$TileMode;)V

    new-instance v7, Landroid/graphics/Matrix;

    invoke-direct {v7}, Landroid/graphics/Matrix;-><init>()V

    invoke-virtual {v5}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v12

    sub-int/2addr v12, v8

    neg-int v12, v12

    int-to-float v12, v12

    const/high16 v15, 0x40000000    # 2.0f

    div-float/2addr v12, v15

    invoke-virtual {v5}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v5

    sub-int/2addr v5, v8

    neg-int v5, v5

    int-to-float v5, v5

    div-float/2addr v5, v15

    invoke-virtual {v7, v12, v5}, Landroid/graphics/Matrix;->setTranslate(FF)V

    invoke-virtual {v6, v7}, Landroid/graphics/Shader;->setLocalMatrix(Landroid/graphics/Matrix;)V

    invoke-virtual {v11, v6}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    invoke-virtual {v10, v13, v13, v14, v11}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    invoke-virtual {v10, v4}, Landroid/graphics/Canvas;->setBitmap(Landroid/graphics/Bitmap;)V

    move-object v5, v9

    :goto_0
    invoke-static {v3, v5}, Lq2/q;->a(Landroid/app/Notification$BigPictureStyle;Landroid/graphics/Bitmap;)Landroid/app/Notification$BigPictureStyle;

    move-result-object v3

    goto :goto_1

    :cond_4
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "called getBitmap() on "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_5
    :goto_1
    iget-boolean v5, v0, Lq2/t;->d:Z

    if-eqz v5, :cond_6

    iget-object v5, v0, Lq2/t;->c:Landroidx/core/graphics/drawable/IconCompat;

    if-nez v5, :cond_7

    invoke-static {v3, v4}, Lq2/q;->d(Landroid/app/Notification$BigPictureStyle;Landroid/graphics/Bitmap;)V

    :cond_6
    :goto_2
    const/16 v1, 0x1f

    goto :goto_3

    :cond_7
    invoke-static {v5, v1}, Lv2/c;->c(Landroidx/core/graphics/drawable/IconCompat;Landroid/content/Context;)Landroid/graphics/drawable/Icon;

    move-result-object v1

    invoke-static {v3, v1}, Lq2/r;->a(Landroid/app/Notification$BigPictureStyle;Landroid/graphics/drawable/Icon;)V

    goto :goto_2

    :goto_3
    if-lt v2, v1, :cond_8

    const/4 v1, 0x0

    invoke-static {v3, v1}, Lq2/s;->c(Landroid/app/Notification$BigPictureStyle;Z)V

    invoke-static {v3, v4}, Lq2/s;->b(Landroid/app/Notification$BigPictureStyle;Ljava/lang/CharSequence;)V

    :cond_8
    return-void
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    const-string v0, "androidx.core.app.NotificationCompat$BigPictureStyle"

    return-object v0
.end method
