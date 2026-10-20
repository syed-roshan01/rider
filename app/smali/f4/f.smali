.class public final Lf4/f;
.super Lf4/q;


# static fields
.field public static final E:[Ljava/lang/String;

.field public static final F:Ll/o2;

.field public static final G:Ll/o2;

.field public static final H:Ll/o2;

.field public static final I:Ll/o2;

.field public static final J:Ll/o2;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const-string v0, "android:changeBounds:clip"

    const-string v1, "android:changeBounds:parent"

    const-string v2, "android:changeBounds:bounds"

    const-string v3, "android:changeBounds:windowX"

    const-string v4, "android:changeBounds:windowY"

    filled-new-array {v2, v0, v1, v3, v4}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lf4/f;->E:[Ljava/lang/String;

    new-instance v0, Lf4/b;

    const-string v1, "boundsOrigin"

    const-class v2, Landroid/graphics/PointF;

    invoke-direct {v0, v2, v1}, Landroid/util/Property;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    iput-object v1, v0, Lf4/b;->a:Landroid/graphics/Rect;

    new-instance v0, Ll/o2;

    const-string v1, "topLeft"

    const/4 v3, 0x1

    invoke-direct {v0, v2, v1, v3}, Ll/o2;-><init>(Ljava/lang/Class;Ljava/lang/String;I)V

    sput-object v0, Lf4/f;->F:Ll/o2;

    new-instance v0, Ll/o2;

    const-string v3, "bottomRight"

    const/4 v4, 0x2

    invoke-direct {v0, v2, v3, v4}, Ll/o2;-><init>(Ljava/lang/Class;Ljava/lang/String;I)V

    sput-object v0, Lf4/f;->G:Ll/o2;

    new-instance v0, Ll/o2;

    const/4 v4, 0x3

    invoke-direct {v0, v2, v3, v4}, Ll/o2;-><init>(Ljava/lang/Class;Ljava/lang/String;I)V

    sput-object v0, Lf4/f;->H:Ll/o2;

    new-instance v0, Ll/o2;

    const/4 v3, 0x4

    invoke-direct {v0, v2, v1, v3}, Ll/o2;-><init>(Ljava/lang/Class;Ljava/lang/String;I)V

    sput-object v0, Lf4/f;->I:Ll/o2;

    new-instance v0, Ll/o2;

    const-string v1, "position"

    const/4 v3, 0x5

    invoke-direct {v0, v2, v1, v3}, Ll/o2;-><init>(Ljava/lang/Class;Ljava/lang/String;I)V

    sput-object v0, Lf4/f;->J:Ll/o2;

    return-void
.end method

.method public static I(Lf4/x;)V
    .locals 6

    iget-object v0, p0, Lf4/x;->b:Landroid/view/View;

    sget-object v1, Lb3/q0;->a:Ljava/lang/reflect/Field;

    invoke-static {v0}, Lb3/e0;->c(Landroid/view/View;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    iget-object v1, p0, Lf4/x;->a:Ljava/util/HashMap;

    new-instance v2, Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    move-result v3

    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    move-result v4

    invoke-virtual {v0}, Landroid/view/View;->getRight()I

    move-result v5

    invoke-virtual {v0}, Landroid/view/View;->getBottom()I

    move-result v0

    invoke-direct {v2, v3, v4, v5, v0}, Landroid/graphics/Rect;-><init>(IIII)V

    const-string v0, "android:changeBounds:bounds"

    invoke-virtual {v1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p0, p0, Lf4/x;->b:Landroid/view/View;

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p0

    const-string v0, "android:changeBounds:parent"

    invoke-virtual {v1, v0, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-void
.end method


# virtual methods
.method public final e(Lf4/x;)V
    .locals 0

    invoke-static {p1}, Lf4/f;->I(Lf4/x;)V

    return-void
.end method

.method public final h(Lf4/x;)V
    .locals 0

    invoke-static {p1}, Lf4/f;->I(Lf4/x;)V

    return-void
.end method

.method public final l(Landroid/view/ViewGroup;Lf4/x;Lf4/x;)Landroid/animation/Animator;
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    if-eqz v1, :cond_0

    if-nez v2, :cond_1

    :cond_0
    const/4 v1, 0x0

    goto/16 :goto_5

    :cond_1
    iget-object v1, v1, Lf4/x;->a:Ljava/util/HashMap;

    iget-object v4, v2, Lf4/x;->a:Ljava/util/HashMap;

    const-string v5, "android:changeBounds:parent"

    invoke-virtual {v1, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/view/ViewGroup;

    invoke-virtual {v4, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/view/ViewGroup;

    if-eqz v6, :cond_2

    if-nez v5, :cond_3

    :cond_2
    const/4 v1, 0x0

    goto/16 :goto_5

    :cond_3
    const-string v5, "android:changeBounds:bounds"

    invoke-virtual {v1, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/graphics/Rect;

    invoke-virtual {v4, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/graphics/Rect;

    iget v7, v6, Landroid/graphics/Rect;->left:I

    iget v8, v5, Landroid/graphics/Rect;->left:I

    iget v9, v6, Landroid/graphics/Rect;->top:I

    iget v10, v5, Landroid/graphics/Rect;->top:I

    iget v11, v6, Landroid/graphics/Rect;->right:I

    iget v12, v5, Landroid/graphics/Rect;->right:I

    iget v6, v6, Landroid/graphics/Rect;->bottom:I

    iget v5, v5, Landroid/graphics/Rect;->bottom:I

    sub-int v13, v11, v7

    sub-int v14, v6, v9

    sub-int v15, v12, v8

    sub-int v3, v5, v10

    const-string v0, "android:changeBounds:clip"

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/Rect;

    invoke-virtual {v4, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Rect;

    const/4 v4, 0x1

    const/16 v16, 0x0

    if-eqz v13, :cond_4

    if-nez v14, :cond_5

    :cond_4
    if-eqz v15, :cond_9

    if-eqz v3, :cond_9

    :cond_5
    if-ne v7, v8, :cond_7

    if-eq v9, v10, :cond_6

    goto :goto_0

    :cond_6
    move/from16 v17, v16

    goto :goto_1

    :cond_7
    :goto_0
    move/from16 v17, v4

    :goto_1
    if-ne v11, v12, :cond_8

    if-eq v6, v5, :cond_a

    :cond_8
    add-int/lit8 v17, v17, 0x1

    goto :goto_2

    :cond_9
    move/from16 v17, v16

    :cond_a
    :goto_2
    if-eqz v1, :cond_b

    invoke-virtual {v1, v0}, Landroid/graphics/Rect;->equals(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_c

    :cond_b
    if-nez v1, :cond_d

    if-eqz v0, :cond_d

    :cond_c
    add-int/lit8 v17, v17, 0x1

    :cond_d
    move/from16 v0, v17

    if-lez v0, :cond_13

    iget-object v1, v2, Lf4/x;->b:Landroid/view/View;

    invoke-static {v1, v7, v9, v11, v6}, Lf4/z;->a(Landroid/view/View;IIII)V

    const/4 v2, 0x2

    if-ne v0, v2, :cond_f

    if-ne v13, v15, :cond_e

    if-ne v14, v3, :cond_e

    move-object/from16 v0, p0

    iget-object v2, v0, Lf4/q;->A:Lx9/v;

    int-to-float v3, v7

    int-to-float v5, v9

    int-to-float v6, v8

    int-to-float v7, v10

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v3, v5, v6, v7}, Lx9/v;->w(FFFF)Landroid/graphics/Path;

    move-result-object v2

    sget-object v3, Lf4/f;->J:Ll/o2;

    const/4 v5, 0x0

    invoke-static {v1, v3, v5, v2}, Landroid/animation/ObjectAnimator;->ofObject(Ljava/lang/Object;Landroid/util/Property;Landroid/animation/TypeConverter;Landroid/graphics/Path;)Landroid/animation/ObjectAnimator;

    move-result-object v2

    goto/16 :goto_4

    :cond_e
    move-object/from16 v0, p0

    new-instance v3, Lf4/e;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    iput-object v1, v3, Lf4/e;->e:Landroid/view/View;

    iget-object v13, v0, Lf4/q;->A:Lx9/v;

    int-to-float v7, v7

    int-to-float v9, v9

    int-to-float v8, v8

    int-to-float v10, v10

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v7, v9, v8, v10}, Lx9/v;->w(FFFF)Landroid/graphics/Path;

    move-result-object v7

    sget-object v8, Lf4/f;->F:Ll/o2;

    const/4 v9, 0x0

    invoke-static {v3, v8, v9, v7}, Landroid/animation/ObjectAnimator;->ofObject(Ljava/lang/Object;Landroid/util/Property;Landroid/animation/TypeConverter;Landroid/graphics/Path;)Landroid/animation/ObjectAnimator;

    move-result-object v7

    iget-object v8, v0, Lf4/q;->A:Lx9/v;

    int-to-float v9, v11

    int-to-float v6, v6

    int-to-float v10, v12

    int-to-float v5, v5

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v9, v6, v10, v5}, Lx9/v;->w(FFFF)Landroid/graphics/Path;

    move-result-object v5

    sget-object v6, Lf4/f;->G:Ll/o2;

    const/4 v8, 0x0

    invoke-static {v3, v6, v8, v5}, Landroid/animation/ObjectAnimator;->ofObject(Ljava/lang/Object;Landroid/util/Property;Landroid/animation/TypeConverter;Landroid/graphics/Path;)Landroid/animation/ObjectAnimator;

    move-result-object v5

    new-instance v6, Landroid/animation/AnimatorSet;

    invoke-direct {v6}, Landroid/animation/AnimatorSet;-><init>()V

    new-array v2, v2, [Landroid/animation/Animator;

    aput-object v7, v2, v16

    aput-object v5, v2, v4

    invoke-virtual {v6, v2}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    new-instance v2, Lf4/c;

    invoke-direct {v2, v3}, Lf4/c;-><init>(Lf4/e;)V

    invoke-virtual {v6, v2}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    move-object v2, v6

    goto :goto_4

    :cond_f
    move-object/from16 v0, p0

    if-ne v7, v8, :cond_11

    if-eq v9, v10, :cond_10

    goto :goto_3

    :cond_10
    iget-object v2, v0, Lf4/q;->A:Lx9/v;

    int-to-float v3, v11

    int-to-float v6, v6

    int-to-float v7, v12

    int-to-float v5, v5

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v3, v6, v7, v5}, Lx9/v;->w(FFFF)Landroid/graphics/Path;

    move-result-object v2

    sget-object v3, Lf4/f;->H:Ll/o2;

    const/4 v5, 0x0

    invoke-static {v1, v3, v5, v2}, Landroid/animation/ObjectAnimator;->ofObject(Ljava/lang/Object;Landroid/util/Property;Landroid/animation/TypeConverter;Landroid/graphics/Path;)Landroid/animation/ObjectAnimator;

    move-result-object v2

    goto :goto_4

    :cond_11
    :goto_3
    iget-object v2, v0, Lf4/q;->A:Lx9/v;

    int-to-float v3, v7

    int-to-float v5, v9

    int-to-float v6, v8

    int-to-float v7, v10

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v3, v5, v6, v7}, Lx9/v;->w(FFFF)Landroid/graphics/Path;

    move-result-object v2

    sget-object v3, Lf4/f;->I:Ll/o2;

    const/4 v5, 0x0

    invoke-static {v1, v3, v5, v2}, Landroid/animation/ObjectAnimator;->ofObject(Ljava/lang/Object;Landroid/util/Property;Landroid/animation/TypeConverter;Landroid/graphics/Path;)Landroid/animation/ObjectAnimator;

    move-result-object v2

    :goto_4
    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v3

    instance-of v3, v3, Landroid/view/ViewGroup;

    if-eqz v3, :cond_12

    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    check-cast v1, Landroid/view/ViewGroup;

    invoke-static {v1, v4}, Lo7/d0;->k0(Landroid/view/ViewGroup;Z)V

    new-instance v3, Lf4/d;

    invoke-direct {v3, v1}, Lf4/d;-><init>(Landroid/view/ViewGroup;)V

    invoke-virtual {v0, v3}, Lf4/q;->a(Lf4/p;)V

    :cond_12
    return-object v2

    :cond_13
    move-object/from16 v0, p0

    const/4 v1, 0x0

    :goto_5
    return-object v1
.end method

.method public final q()[Ljava/lang/String;
    .locals 1

    sget-object v0, Lf4/f;->E:[Ljava/lang/String;

    return-object v0
.end method
