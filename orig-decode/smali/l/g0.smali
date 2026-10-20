.class public final Ll/g0;
.super Ljava/lang/Object;


# instance fields
.field public final a:Landroid/widget/TextView;

.field public b:Ll/t2;

.field public c:Ll/t2;

.field public d:Ll/t2;

.field public e:Ll/t2;

.field public f:Ll/t2;

.field public g:Ll/t2;

.field public h:Ll/t2;

.field public final i:Ll/q0;

.field public j:I

.field public k:I

.field public l:Landroid/graphics/Typeface;

.field public m:Z


# direct methods
.method public constructor <init>(Landroid/widget/TextView;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Ll/g0;->j:I

    const/4 v0, -0x1

    iput v0, p0, Ll/g0;->k:I

    iput-object p1, p0, Ll/g0;->a:Landroid/widget/TextView;

    new-instance v0, Ll/q0;

    invoke-direct {v0, p1}, Ll/q0;-><init>(Landroid/widget/TextView;)V

    iput-object v0, p0, Ll/g0;->i:Ll/q0;

    return-void
.end method

.method public static c(Landroid/content/Context;Ll/s;I)Ll/t2;
    .locals 1

    monitor-enter p1

    :try_start_0
    iget-object v0, p1, Ll/s;->a:Ll/w1;

    invoke-virtual {v0, p0, p2}, Ll/w1;->h(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p1

    if-eqz p0, :cond_0

    new-instance p1, Ll/t2;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    const/4 p2, 0x1

    iput-boolean p2, p1, Ll/t2;->b:Z

    iput-object p0, p1, Ll/t2;->c:Ljava/lang/Object;

    return-object p1

    :cond_0
    const/4 p0, 0x0

    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit p1

    throw p0
.end method


# virtual methods
.method public final a(Landroid/graphics/drawable/Drawable;Ll/t2;)V
    .locals 1

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    iget-object v0, p0, Ll/g0;->a:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/view/View;->getDrawableState()[I

    move-result-object v0

    invoke-static {p1, p2, v0}, Ll/s;->d(Landroid/graphics/drawable/Drawable;Ll/t2;[I)V

    :cond_0
    return-void
.end method

.method public final b()V
    .locals 6

    iget-object v0, p0, Ll/g0;->b:Ll/t2;

    const/4 v1, 0x2

    const/4 v2, 0x0

    iget-object v3, p0, Ll/g0;->a:Landroid/widget/TextView;

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/g0;->c:Ll/t2;

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/g0;->d:Ll/t2;

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/g0;->e:Ll/t2;

    if-eqz v0, :cond_1

    :cond_0
    invoke-virtual {v3}, Landroid/widget/TextView;->getCompoundDrawables()[Landroid/graphics/drawable/Drawable;

    move-result-object v0

    aget-object v4, v0, v2

    iget-object v5, p0, Ll/g0;->b:Ll/t2;

    invoke-virtual {p0, v4, v5}, Ll/g0;->a(Landroid/graphics/drawable/Drawable;Ll/t2;)V

    const/4 v4, 0x1

    aget-object v4, v0, v4

    iget-object v5, p0, Ll/g0;->c:Ll/t2;

    invoke-virtual {p0, v4, v5}, Ll/g0;->a(Landroid/graphics/drawable/Drawable;Ll/t2;)V

    aget-object v4, v0, v1

    iget-object v5, p0, Ll/g0;->d:Ll/t2;

    invoke-virtual {p0, v4, v5}, Ll/g0;->a(Landroid/graphics/drawable/Drawable;Ll/t2;)V

    const/4 v4, 0x3

    aget-object v0, v0, v4

    iget-object v4, p0, Ll/g0;->e:Ll/t2;

    invoke-virtual {p0, v0, v4}, Ll/g0;->a(Landroid/graphics/drawable/Drawable;Ll/t2;)V

    :cond_1
    iget-object v0, p0, Ll/g0;->f:Ll/t2;

    if-nez v0, :cond_2

    iget-object v0, p0, Ll/g0;->g:Ll/t2;

    if-eqz v0, :cond_3

    :cond_2
    invoke-static {v3}, Ll/c0;->a(Landroid/widget/TextView;)[Landroid/graphics/drawable/Drawable;

    move-result-object v0

    aget-object v2, v0, v2

    iget-object v3, p0, Ll/g0;->f:Ll/t2;

    invoke-virtual {p0, v2, v3}, Ll/g0;->a(Landroid/graphics/drawable/Drawable;Ll/t2;)V

    aget-object v0, v0, v1

    iget-object v1, p0, Ll/g0;->g:Ll/t2;

    invoke-virtual {p0, v0, v1}, Ll/g0;->a(Landroid/graphics/drawable/Drawable;Ll/t2;)V

    :cond_3
    return-void
.end method

.method public final d(Landroid/util/AttributeSet;I)V
    .locals 23

    move-object/from16 v0, p0

    move-object/from16 v7, p1

    move/from16 v8, p2

    iget-object v9, v0, Ll/g0;->a:Landroid/widget/TextView;

    invoke-virtual {v9}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v10

    invoke-static {}, Ll/s;->a()Ll/s;

    move-result-object v11

    sget-object v3, Lf/a;->f:[I

    invoke-static {v10, v7, v3, v8}, Ll/z2;->I(Landroid/content/Context;Landroid/util/AttributeSet;[II)Ll/z2;

    move-result-object v12

    invoke-virtual {v9}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    iget-object v1, v12, Ll/z2;->c:Ljava/lang/Object;

    move-object v5, v1

    check-cast v5, Landroid/content/res/TypedArray;

    move-object v1, v9

    move-object/from16 v4, p1

    move/from16 v6, p2

    invoke-static/range {v1 .. v6}, Lb3/q0;->c(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;I)V

    const/4 v13, 0x0

    const/4 v14, -0x1

    invoke-virtual {v12, v13, v14}, Ll/z2;->z(II)I

    move-result v1

    const/4 v15, 0x3

    invoke-virtual {v12, v15}, Ll/z2;->D(I)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v12, v15, v13}, Ll/z2;->z(II)I

    move-result v2

    invoke-static {v10, v11, v2}, Ll/g0;->c(Landroid/content/Context;Ll/s;I)Ll/t2;

    move-result-object v2

    iput-object v2, v0, Ll/g0;->b:Ll/t2;

    :cond_0
    const/4 v6, 0x1

    invoke-virtual {v12, v6}, Ll/z2;->D(I)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v12, v6, v13}, Ll/z2;->z(II)I

    move-result v2

    invoke-static {v10, v11, v2}, Ll/g0;->c(Landroid/content/Context;Ll/s;I)Ll/t2;

    move-result-object v2

    iput-object v2, v0, Ll/g0;->c:Ll/t2;

    :cond_1
    const/4 v5, 0x4

    invoke-virtual {v12, v5}, Ll/z2;->D(I)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {v12, v5, v13}, Ll/z2;->z(II)I

    move-result v2

    invoke-static {v10, v11, v2}, Ll/g0;->c(Landroid/content/Context;Ll/s;I)Ll/t2;

    move-result-object v2

    iput-object v2, v0, Ll/g0;->d:Ll/t2;

    :cond_2
    const/4 v4, 0x2

    invoke-virtual {v12, v4}, Ll/z2;->D(I)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {v12, v4, v13}, Ll/z2;->z(II)I

    move-result v2

    invoke-static {v10, v11, v2}, Ll/g0;->c(Landroid/content/Context;Ll/s;I)Ll/t2;

    move-result-object v2

    iput-object v2, v0, Ll/g0;->e:Ll/t2;

    :cond_3
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v3, 0x5

    invoke-virtual {v12, v3}, Ll/z2;->D(I)Z

    move-result v16

    if-eqz v16, :cond_4

    invoke-virtual {v12, v3, v13}, Ll/z2;->z(II)I

    move-result v4

    invoke-static {v10, v11, v4}, Ll/g0;->c(Landroid/content/Context;Ll/s;I)Ll/t2;

    move-result-object v4

    iput-object v4, v0, Ll/g0;->f:Ll/t2;

    :cond_4
    const/4 v4, 0x6

    invoke-virtual {v12, v4}, Ll/z2;->D(I)Z

    move-result v17

    if-eqz v17, :cond_5

    invoke-virtual {v12, v4, v13}, Ll/z2;->z(II)I

    move-result v3

    invoke-static {v10, v11, v3}, Ll/g0;->c(Landroid/content/Context;Ll/s;I)Ll/t2;

    move-result-object v3

    iput-object v3, v0, Ll/g0;->g:Ll/t2;

    :cond_5
    invoke-virtual {v12}, Ll/z2;->K()V

    invoke-virtual {v9}, Landroid/widget/TextView;->getTransformationMethod()Landroid/text/method/TransformationMethod;

    move-result-object v3

    instance-of v3, v3, Landroid/text/method/PasswordTransformationMethod;

    sget-object v12, Lf/a;->s:[I

    const/16 v4, 0xe

    const/16 v15, 0xf

    if-eq v1, v14, :cond_9

    new-instance v5, Ll/z2;

    invoke-virtual {v10, v1, v12}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    move-result-object v1

    invoke-direct {v5, v13, v10, v1}, Ll/z2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    if-nez v3, :cond_6

    invoke-virtual {v5, v4}, Ll/z2;->D(I)Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-virtual {v5, v4, v13}, Ll/z2;->p(IZ)Z

    move-result v1

    move/from16 v20, v6

    goto :goto_0

    :cond_6
    move v1, v13

    move/from16 v20, v1

    :goto_0
    invoke-virtual {v0, v10, v5}, Ll/g0;->f(Landroid/content/Context;Ll/z2;)V

    invoke-virtual {v5, v15}, Ll/z2;->D(I)Z

    move-result v21

    if-eqz v21, :cond_7

    invoke-virtual {v5, v15}, Ll/z2;->B(I)Ljava/lang/String;

    move-result-object v21

    const/16 v6, 0xd

    goto :goto_1

    :cond_7
    const/16 v6, 0xd

    const/16 v21, 0x0

    :goto_1
    invoke-virtual {v5, v6}, Ll/z2;->D(I)Z

    move-result v18

    if-eqz v18, :cond_8

    invoke-virtual {v5, v6}, Ll/z2;->B(I)Ljava/lang/String;

    move-result-object v22

    goto :goto_2

    :cond_8
    const/16 v22, 0x0

    :goto_2
    invoke-virtual {v5}, Ll/z2;->K()V

    goto :goto_3

    :cond_9
    move v1, v13

    move/from16 v20, v1

    const/16 v21, 0x0

    const/16 v22, 0x0

    :goto_3
    new-instance v5, Ll/z2;

    invoke-virtual {v10, v7, v12, v8, v13}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v6

    invoke-direct {v5, v13, v10, v6}, Ll/z2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    if-nez v3, :cond_a

    invoke-virtual {v5, v4}, Ll/z2;->D(I)Z

    move-result v6

    if-eqz v6, :cond_a

    invoke-virtual {v5, v4, v13}, Ll/z2;->p(IZ)Z

    move-result v1

    const/16 v20, 0x1

    :cond_a
    invoke-virtual {v5, v15}, Ll/z2;->D(I)Z

    move-result v4

    if-eqz v4, :cond_b

    invoke-virtual {v5, v15}, Ll/z2;->B(I)Ljava/lang/String;

    move-result-object v21

    :cond_b
    const/16 v4, 0xd

    invoke-virtual {v5, v4}, Ll/z2;->D(I)Z

    move-result v6

    if-eqz v6, :cond_c

    invoke-virtual {v5, v4}, Ll/z2;->B(I)Ljava/lang/String;

    move-result-object v22

    :cond_c
    move-object/from16 v4, v22

    const/16 v6, 0x1c

    if-lt v2, v6, :cond_d

    invoke-virtual {v5, v13}, Ll/z2;->D(I)Z

    move-result v2

    if-eqz v2, :cond_d

    invoke-virtual {v5, v13, v14}, Ll/z2;->s(II)I

    move-result v2

    if-nez v2, :cond_d

    const/4 v2, 0x0

    invoke-virtual {v9, v13, v2}, Landroid/widget/TextView;->setTextSize(IF)V

    :cond_d
    invoke-virtual {v0, v10, v5}, Ll/g0;->f(Landroid/content/Context;Ll/z2;)V

    invoke-virtual {v5}, Ll/z2;->K()V

    if-nez v3, :cond_e

    if-eqz v20, :cond_e

    invoke-virtual {v9, v1}, Landroid/widget/TextView;->setAllCaps(Z)V

    :cond_e
    iget-object v1, v0, Ll/g0;->l:Landroid/graphics/Typeface;

    if-eqz v1, :cond_10

    iget v2, v0, Ll/g0;->k:I

    if-ne v2, v14, :cond_f

    iget v2, v0, Ll/g0;->j:I

    invoke-virtual {v9, v1, v2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    goto :goto_4

    :cond_f
    invoke-virtual {v9, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    :cond_10
    :goto_4
    if-eqz v4, :cond_11

    invoke-static {v9, v4}, Ll/e0;->d(Landroid/widget/TextView;Ljava/lang/String;)Z

    :cond_11
    if-eqz v21, :cond_12

    invoke-static/range {v21 .. v21}, Ll/d0;->a(Ljava/lang/String;)Landroid/os/LocaleList;

    move-result-object v1

    invoke-static {v9, v1}, Ll/d0;->b(Landroid/widget/TextView;Landroid/os/LocaleList;)V

    :cond_12
    sget-object v12, Lf/a;->g:[I

    iget-object v6, v0, Ll/g0;->i:Ll/q0;

    iget-object v5, v6, Ll/q0;->j:Landroid/content/Context;

    invoke-virtual {v5, v7, v12, v8, v13}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v4

    iget-object v1, v6, Ll/q0;->i:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    const/4 v15, 0x5

    move-object v3, v12

    move-object/from16 v16, v4

    const/4 v14, 0x2

    move-object/from16 v4, p1

    move-object/from16 v19, v5

    const/4 v14, 0x4

    move-object/from16 v5, v16

    move-object v14, v6

    move/from16 v6, p2

    invoke-static/range {v1 .. v6}, Lb3/q0;->c(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;I)V

    move-object/from16 v1, v16

    invoke-virtual {v1, v15}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v2

    if-eqz v2, :cond_13

    invoke-virtual {v1, v15, v13}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    iput v2, v14, Ll/q0;->a:I

    :cond_13
    const/4 v2, 0x4

    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v3

    const/high16 v4, -0x40800000    # -1.0f

    if-eqz v3, :cond_14

    invoke-virtual {v1, v2, v4}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v2

    :goto_5
    const/4 v3, 0x2

    goto :goto_6

    :cond_14
    move v2, v4

    goto :goto_5

    :goto_6
    invoke-virtual {v1, v3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v5

    if-eqz v5, :cond_15

    invoke-virtual {v1, v3, v4}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v5

    :goto_7
    const/4 v3, 0x1

    goto :goto_8

    :cond_15
    move v5, v4

    goto :goto_7

    :goto_8
    invoke-virtual {v1, v3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v6

    if-eqz v6, :cond_16

    invoke-virtual {v1, v3, v4}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v6

    :goto_9
    const/4 v8, 0x3

    goto :goto_a

    :cond_16
    move v6, v4

    goto :goto_9

    :goto_a
    invoke-virtual {v1, v8}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v15

    if-eqz v15, :cond_19

    invoke-virtual {v1, v8, v13}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v15

    if-lez v15, :cond_19

    invoke-virtual {v1}, Landroid/content/res/TypedArray;->getResources()Landroid/content/res/Resources;

    move-result-object v8

    invoke-virtual {v8, v15}, Landroid/content/res/Resources;->obtainTypedArray(I)Landroid/content/res/TypedArray;

    move-result-object v8

    invoke-virtual {v8}, Landroid/content/res/TypedArray;->length()I

    move-result v15

    new-array v13, v15, [I

    if-lez v15, :cond_18

    const/4 v4, 0x0

    :goto_b
    if-ge v4, v15, :cond_17

    const/4 v3, -0x1

    invoke-virtual {v8, v4, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v21

    aput v21, v13, v4

    add-int/lit8 v4, v4, 0x1

    const/4 v3, 0x1

    goto :goto_b

    :cond_17
    invoke-static {v13}, Ll/q0;->b([I)[I

    move-result-object v3

    iput-object v3, v14, Ll/q0;->f:[I

    invoke-virtual {v14}, Ll/q0;->h()Z

    :cond_18
    invoke-virtual {v8}, Landroid/content/res/TypedArray;->recycle()V

    :cond_19
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    iget v1, v14, Ll/q0;->a:I

    const/high16 v3, 0x3f800000    # 1.0f

    const/4 v4, 0x1

    if-ne v1, v4, :cond_1e

    iget-boolean v1, v14, Ll/q0;->g:Z

    if-nez v1, :cond_1d

    invoke-virtual/range {v19 .. v19}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    const/high16 v4, -0x40800000    # -1.0f

    cmpl-float v8, v5, v4

    if-nez v8, :cond_1a

    const/high16 v5, 0x41400000    # 12.0f

    const/4 v8, 0x2

    invoke-static {v8, v5, v1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v5

    goto :goto_c

    :cond_1a
    const/4 v8, 0x2

    :goto_c
    cmpl-float v13, v6, v4

    if-nez v13, :cond_1b

    const/high16 v6, 0x42e00000    # 112.0f

    invoke-static {v8, v6, v1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v6

    :cond_1b
    cmpl-float v1, v2, v4

    if-nez v1, :cond_1c

    move v2, v3

    :cond_1c
    invoke-virtual {v14, v5, v6, v2}, Ll/q0;->i(FFF)V

    :cond_1d
    invoke-virtual {v14}, Ll/q0;->g()Z

    :cond_1e
    sget-boolean v1, Ll/o3;->a:Z

    if-eqz v1, :cond_20

    iget v1, v14, Ll/q0;->a:I

    if-eqz v1, :cond_20

    iget-object v1, v14, Ll/q0;->f:[I

    array-length v2, v1

    if-lez v2, :cond_20

    invoke-static {v9}, Ll/e0;->a(Landroid/widget/TextView;)I

    move-result v2

    int-to-float v2, v2

    const/high16 v4, -0x40800000    # -1.0f

    cmpl-float v2, v2, v4

    if-eqz v2, :cond_1f

    iget v1, v14, Ll/q0;->d:F

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    iget v2, v14, Ll/q0;->e:F

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    iget v4, v14, Ll/q0;->c:F

    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    move-result v4

    const/4 v5, 0x0

    invoke-static {v9, v1, v2, v4, v5}, Ll/e0;->b(Landroid/widget/TextView;IIII)V

    goto :goto_d

    :cond_1f
    const/4 v5, 0x0

    invoke-static {v9, v1, v5}, Ll/e0;->c(Landroid/widget/TextView;[II)V

    goto :goto_d

    :cond_20
    const/4 v5, 0x0

    :goto_d
    new-instance v1, Ll/z2;

    invoke-virtual {v10, v7, v12}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v2

    invoke-direct {v1, v5, v10, v2}, Ll/z2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const/16 v2, 0x8

    const/4 v4, -0x1

    invoke-virtual {v1, v2, v4}, Ll/z2;->z(II)I

    move-result v2

    if-eq v2, v4, :cond_21

    invoke-virtual {v11, v10, v2}, Ll/s;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    :goto_e
    const/16 v5, 0xd

    goto :goto_f

    :cond_21
    const/4 v2, 0x0

    goto :goto_e

    :goto_f
    invoke-virtual {v1, v5, v4}, Ll/z2;->z(II)I

    move-result v5

    if-eq v5, v4, :cond_22

    invoke-virtual {v11, v10, v5}, Ll/s;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v5

    goto :goto_10

    :cond_22
    const/4 v5, 0x0

    :goto_10
    const/16 v6, 0x9

    invoke-virtual {v1, v6, v4}, Ll/z2;->z(II)I

    move-result v6

    if-eq v6, v4, :cond_23

    invoke-virtual {v11, v10, v6}, Ll/s;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v6

    :goto_11
    const/4 v7, 0x6

    goto :goto_12

    :cond_23
    const/4 v6, 0x0

    goto :goto_11

    :goto_12
    invoke-virtual {v1, v7, v4}, Ll/z2;->z(II)I

    move-result v7

    if-eq v7, v4, :cond_24

    invoke-virtual {v11, v10, v7}, Ll/s;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v7

    goto :goto_13

    :cond_24
    const/4 v7, 0x0

    :goto_13
    const/16 v8, 0xa

    invoke-virtual {v1, v8, v4}, Ll/z2;->z(II)I

    move-result v8

    if-eq v8, v4, :cond_25

    invoke-virtual {v11, v10, v8}, Ll/s;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v8

    goto :goto_14

    :cond_25
    const/4 v8, 0x0

    :goto_14
    const/4 v12, 0x7

    invoke-virtual {v1, v12, v4}, Ll/z2;->z(II)I

    move-result v12

    if-eq v12, v4, :cond_26

    invoke-virtual {v11, v10, v12}, Ll/s;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    goto :goto_15

    :cond_26
    const/4 v4, 0x0

    :goto_15
    if-nez v8, :cond_31

    if-eqz v4, :cond_27

    goto :goto_1e

    :cond_27
    if-nez v2, :cond_28

    if-nez v5, :cond_28

    if-nez v6, :cond_28

    if-eqz v7, :cond_36

    :cond_28
    invoke-static {v9}, Ll/c0;->a(Landroid/widget/TextView;)[Landroid/graphics/drawable/Drawable;

    move-result-object v4

    const/4 v8, 0x0

    aget-object v10, v4, v8

    if-nez v10, :cond_2e

    const/4 v11, 0x2

    aget-object v12, v4, v11

    if-eqz v12, :cond_29

    goto :goto_1a

    :cond_29
    invoke-virtual {v9}, Landroid/widget/TextView;->getCompoundDrawables()[Landroid/graphics/drawable/Drawable;

    move-result-object v4

    if-eqz v2, :cond_2a

    goto :goto_16

    :cond_2a
    aget-object v2, v4, v8

    :goto_16
    if-eqz v5, :cond_2b

    goto :goto_17

    :cond_2b
    const/4 v5, 0x1

    aget-object v5, v4, v5

    :goto_17
    if-eqz v6, :cond_2c

    goto :goto_18

    :cond_2c
    const/4 v6, 0x2

    aget-object v6, v4, v6

    :goto_18
    if-eqz v7, :cond_2d

    goto :goto_19

    :cond_2d
    const/4 v7, 0x3

    aget-object v7, v4, v7

    :goto_19
    invoke-virtual {v9, v2, v5, v6, v7}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    goto :goto_23

    :cond_2e
    :goto_1a
    if-eqz v5, :cond_2f

    :goto_1b
    const/4 v2, 0x2

    goto :goto_1c

    :cond_2f
    const/4 v2, 0x1

    aget-object v5, v4, v2

    goto :goto_1b

    :goto_1c
    aget-object v2, v4, v2

    if-eqz v7, :cond_30

    goto :goto_1d

    :cond_30
    const/4 v6, 0x3

    aget-object v7, v4, v6

    :goto_1d
    invoke-static {v9, v10, v5, v2, v7}, Ll/c0;->b(Landroid/widget/TextView;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    goto :goto_23

    :cond_31
    :goto_1e
    invoke-static {v9}, Ll/c0;->a(Landroid/widget/TextView;)[Landroid/graphics/drawable/Drawable;

    move-result-object v2

    if-eqz v8, :cond_32

    goto :goto_1f

    :cond_32
    const/4 v6, 0x0

    aget-object v8, v2, v6

    :goto_1f
    if-eqz v5, :cond_33

    goto :goto_20

    :cond_33
    const/4 v5, 0x1

    aget-object v5, v2, v5

    :goto_20
    if-eqz v4, :cond_34

    goto :goto_21

    :cond_34
    const/4 v4, 0x2

    aget-object v4, v2, v4

    :goto_21
    if-eqz v7, :cond_35

    goto :goto_22

    :cond_35
    const/4 v6, 0x3

    aget-object v7, v2, v6

    :goto_22
    invoke-static {v9, v8, v5, v4, v7}, Ll/c0;->b(Landroid/widget/TextView;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    :cond_36
    :goto_23
    const/16 v2, 0xb

    invoke-virtual {v1, v2}, Ll/z2;->D(I)Z

    move-result v4

    if-eqz v4, :cond_37

    invoke-virtual {v1, v2}, Ll/z2;->q(I)Landroid/content/res/ColorStateList;

    move-result-object v2

    invoke-static {v9, v2}, Le3/o;->f(Landroid/widget/TextView;Landroid/content/res/ColorStateList;)V

    :cond_37
    const/16 v2, 0xc

    invoke-virtual {v1, v2}, Ll/z2;->D(I)Z

    move-result v4

    if-eqz v4, :cond_38

    const/4 v4, -0x1

    invoke-virtual {v1, v2, v4}, Ll/z2;->v(II)I

    move-result v2

    const/4 v5, 0x0

    invoke-static {v2, v5}, Ll/v0;->c(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;

    move-result-object v2

    invoke-static {v9, v2}, Le3/o;->g(Landroid/widget/TextView;Landroid/graphics/PorterDuff$Mode;)V

    :goto_24
    const/16 v2, 0xf

    goto :goto_25

    :cond_38
    const/4 v4, -0x1

    goto :goto_24

    :goto_25
    invoke-virtual {v1, v2, v4}, Ll/z2;->s(II)I

    move-result v2

    const/16 v5, 0x12

    invoke-virtual {v1, v5, v4}, Ll/z2;->s(II)I

    move-result v5

    const/16 v6, 0x13

    invoke-virtual {v1, v6, v4}, Ll/z2;->s(II)I

    move-result v6

    invoke-virtual {v1}, Ll/z2;->K()V

    if-eq v2, v4, :cond_39

    invoke-static {v9, v2}, Li1/b;->G(Landroid/widget/TextView;I)V

    :cond_39
    if-eq v5, v4, :cond_3a

    invoke-static {v9, v5}, Li1/b;->H(Landroid/widget/TextView;I)V

    :cond_3a
    if-eq v6, v4, :cond_3c

    if-ltz v6, :cond_3b

    invoke-virtual {v9}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->getFontMetricsInt(Landroid/graphics/Paint$FontMetricsInt;)I

    move-result v1

    if-eq v6, v1, :cond_3c

    sub-int/2addr v6, v1

    int-to-float v1, v6

    invoke-virtual {v9, v1, v3}, Landroid/widget/TextView;->setLineSpacing(FF)V

    goto :goto_26

    :cond_3b
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-direct {v1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v1

    :cond_3c
    :goto_26
    return-void
.end method

.method public final e(Landroid/content/Context;I)V
    .locals 4

    sget-object v0, Lf/a;->s:[I

    new-instance v1, Ll/z2;

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    move-result-object p2

    const/4 v0, 0x0

    invoke-direct {v1, v0, p1, p2}, Ll/z2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const/16 p2, 0xe

    invoke-virtual {v1, p2}, Ll/z2;->D(I)Z

    move-result v2

    iget-object v3, p0, Ll/g0;->a:Landroid/widget/TextView;

    if-eqz v2, :cond_0

    invoke-virtual {v1, p2, v0}, Ll/z2;->p(IZ)Z

    move-result p2

    invoke-virtual {v3, p2}, Landroid/widget/TextView;->setAllCaps(Z)V

    :cond_0
    invoke-virtual {v1, v0}, Ll/z2;->D(I)Z

    move-result p2

    if-eqz p2, :cond_1

    const/4 p2, -0x1

    invoke-virtual {v1, v0, p2}, Ll/z2;->s(II)I

    move-result p2

    if-nez p2, :cond_1

    const/4 p2, 0x0

    invoke-virtual {v3, v0, p2}, Landroid/widget/TextView;->setTextSize(IF)V

    :cond_1
    invoke-virtual {p0, p1, v1}, Ll/g0;->f(Landroid/content/Context;Ll/z2;)V

    const/16 p1, 0xd

    invoke-virtual {v1, p1}, Ll/z2;->D(I)Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-virtual {v1, p1}, Ll/z2;->B(I)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-static {v3, p1}, Ll/e0;->d(Landroid/widget/TextView;Ljava/lang/String;)Z

    :cond_2
    invoke-virtual {v1}, Ll/z2;->K()V

    iget-object p1, p0, Ll/g0;->l:Landroid/graphics/Typeface;

    if-eqz p1, :cond_3

    iget p2, p0, Ll/g0;->j:I

    invoke-virtual {v3, p1, p2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    :cond_3
    return-void
.end method

.method public final f(Landroid/content/Context;Ll/z2;)V
    .locals 10

    iget v0, p0, Ll/g0;->j:I

    const/4 v1, 0x2

    invoke-virtual {p2, v1, v0}, Ll/z2;->v(II)I

    move-result v0

    iput v0, p0, Ll/g0;->j:I

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v2, -0x1

    const/16 v3, 0x1c

    if-lt v0, v3, :cond_0

    const/16 v4, 0xb

    invoke-virtual {p2, v4, v2}, Ll/z2;->v(II)I

    move-result v4

    iput v4, p0, Ll/g0;->k:I

    if-eq v4, v2, :cond_0

    iget v4, p0, Ll/g0;->j:I

    and-int/2addr v4, v1

    iput v4, p0, Ll/g0;->j:I

    :cond_0
    const/16 v4, 0xa

    invoke-virtual {p2, v4}, Ll/z2;->D(I)Z

    move-result v5

    const/16 v6, 0xc

    const/4 v7, 0x0

    const/4 v8, 0x1

    if-nez v5, :cond_6

    invoke-virtual {p2, v6}, Ll/z2;->D(I)Z

    move-result v5

    if-eqz v5, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p2, v8}, Ll/z2;->D(I)Z

    move-result p1

    if-eqz p1, :cond_5

    iput-boolean v7, p0, Ll/g0;->m:Z

    invoke-virtual {p2, v8, v8}, Ll/z2;->v(II)I

    move-result p1

    if-eq p1, v8, :cond_4

    if-eq p1, v1, :cond_3

    const/4 p2, 0x3

    if-eq p1, p2, :cond_2

    goto :goto_0

    :cond_2
    sget-object p1, Landroid/graphics/Typeface;->MONOSPACE:Landroid/graphics/Typeface;

    iput-object p1, p0, Ll/g0;->l:Landroid/graphics/Typeface;

    goto :goto_0

    :cond_3
    sget-object p1, Landroid/graphics/Typeface;->SERIF:Landroid/graphics/Typeface;

    iput-object p1, p0, Ll/g0;->l:Landroid/graphics/Typeface;

    goto :goto_0

    :cond_4
    sget-object p1, Landroid/graphics/Typeface;->SANS_SERIF:Landroid/graphics/Typeface;

    iput-object p1, p0, Ll/g0;->l:Landroid/graphics/Typeface;

    :cond_5
    :goto_0
    return-void

    :cond_6
    :goto_1
    const/4 v5, 0x0

    iput-object v5, p0, Ll/g0;->l:Landroid/graphics/Typeface;

    invoke-virtual {p2, v6}, Ll/z2;->D(I)Z

    move-result v5

    if-eqz v5, :cond_7

    move v4, v6

    :cond_7
    iget v5, p0, Ll/g0;->k:I

    iget v6, p0, Ll/g0;->j:I

    invoke-virtual {p1}, Landroid/content/Context;->isRestricted()Z

    move-result p1

    if-nez p1, :cond_c

    new-instance p1, Ljava/lang/ref/WeakReference;

    iget-object v9, p0, Ll/g0;->a:Landroid/widget/TextView;

    invoke-direct {p1, v9}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    new-instance v9, Ll/a0;

    invoke-direct {v9, p0, v5, v6, p1}, Ll/a0;-><init>(Ll/g0;IILjava/lang/ref/WeakReference;)V

    :try_start_0
    iget p1, p0, Ll/g0;->j:I

    invoke-virtual {p2, v4, p1, v9}, Ll/z2;->u(IILl/a0;)Landroid/graphics/Typeface;

    move-result-object p1

    if-eqz p1, :cond_a

    if-lt v0, v3, :cond_9

    iget v0, p0, Ll/g0;->k:I

    if-eq v0, v2, :cond_9

    invoke-static {p1, v7}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    move-result-object p1

    iget v0, p0, Ll/g0;->k:I

    iget v5, p0, Ll/g0;->j:I

    and-int/2addr v5, v1

    if-eqz v5, :cond_8

    move v5, v8

    goto :goto_2

    :cond_8
    move v5, v7

    :goto_2
    invoke-static {p1, v0, v5}, Ll/f0;->a(Landroid/graphics/Typeface;IZ)Landroid/graphics/Typeface;

    move-result-object p1

    iput-object p1, p0, Ll/g0;->l:Landroid/graphics/Typeface;

    goto :goto_3

    :cond_9
    iput-object p1, p0, Ll/g0;->l:Landroid/graphics/Typeface;

    :cond_a
    :goto_3
    iget-object p1, p0, Ll/g0;->l:Landroid/graphics/Typeface;

    if-nez p1, :cond_b

    move p1, v8

    goto :goto_4

    :cond_b
    move p1, v7

    :goto_4
    iput-boolean p1, p0, Ll/g0;->m:Z
    :try_end_0
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_c
    iget-object p1, p0, Ll/g0;->l:Landroid/graphics/Typeface;

    if-nez p1, :cond_f

    invoke-virtual {p2, v4}, Ll/z2;->B(I)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_f

    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt p2, v3, :cond_e

    iget p2, p0, Ll/g0;->k:I

    if-eq p2, v2, :cond_e

    invoke-static {p1, v7}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object p1

    iget p2, p0, Ll/g0;->k:I

    iget v0, p0, Ll/g0;->j:I

    and-int/2addr v0, v1

    if-eqz v0, :cond_d

    move v7, v8

    :cond_d
    invoke-static {p1, p2, v7}, Ll/f0;->a(Landroid/graphics/Typeface;IZ)Landroid/graphics/Typeface;

    move-result-object p1

    iput-object p1, p0, Ll/g0;->l:Landroid/graphics/Typeface;

    goto :goto_5

    :cond_e
    iget p2, p0, Ll/g0;->j:I

    invoke-static {p1, p2}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object p1

    iput-object p1, p0, Ll/g0;->l:Landroid/graphics/Typeface;

    :cond_f
    :goto_5
    return-void
.end method
