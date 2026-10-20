.class public final Ll/o2;
.super Landroid/util/Property;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Class;Ljava/lang/String;I)V
    .locals 0

    iput p3, p0, Ll/o2;->a:I

    invoke-direct {p0, p1, p2}, Landroid/util/Property;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;Landroid/graphics/PointF;)V
    .locals 3

    iget v0, p0, Ll/o2;->a:I

    packed-switch v0, :pswitch_data_0

    iget v0, p2, Landroid/graphics/PointF;->x:F

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    iget p2, p2, Landroid/graphics/PointF;->y:F

    invoke-static {p2}, Ljava/lang/Math;->round(F)I

    move-result p2

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v1

    add-int/2addr v1, v0

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v2

    add-int/2addr v2, p2

    invoke-static {p1, v0, p2, v1, v2}, Lf4/z;->a(Landroid/view/View;IIII)V

    return-void

    :pswitch_0
    iget v0, p2, Landroid/graphics/PointF;->x:F

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    iget p2, p2, Landroid/graphics/PointF;->y:F

    invoke-static {p2}, Ljava/lang/Math;->round(F)I

    move-result p2

    invoke-virtual {p1}, Landroid/view/View;->getRight()I

    move-result v1

    invoke-virtual {p1}, Landroid/view/View;->getBottom()I

    move-result v2

    invoke-static {p1, v0, p2, v1, v2}, Lf4/z;->a(Landroid/view/View;IIII)V

    return-void

    :pswitch_1
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result v0

    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result v1

    iget v2, p2, Landroid/graphics/PointF;->x:F

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    iget p2, p2, Landroid/graphics/PointF;->y:F

    invoke-static {p2}, Ljava/lang/Math;->round(F)I

    move-result p2

    invoke-static {p1, v0, v1, v2, p2}, Lf4/z;->a(Landroid/view/View;IIII)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final b(Lf4/e;Landroid/graphics/PointF;)V
    .locals 5

    const/4 v0, 0x0

    iget v1, p0, Ll/o2;->a:I

    packed-switch v1, :pswitch_data_0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v1, p2, Landroid/graphics/PointF;->x:F

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    iput v1, p1, Lf4/e;->c:I

    iget p2, p2, Landroid/graphics/PointF;->y:F

    invoke-static {p2}, Ljava/lang/Math;->round(F)I

    move-result p2

    iput p2, p1, Lf4/e;->d:I

    iget v1, p1, Lf4/e;->g:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p1, Lf4/e;->g:I

    iget v2, p1, Lf4/e;->f:I

    if-ne v2, v1, :cond_0

    iget v1, p1, Lf4/e;->a:I

    iget v2, p1, Lf4/e;->b:I

    iget v3, p1, Lf4/e;->c:I

    iget-object v4, p1, Lf4/e;->e:Landroid/view/View;

    invoke-static {v4, v1, v2, v3, p2}, Lf4/z;->a(Landroid/view/View;IIII)V

    iput v0, p1, Lf4/e;->f:I

    iput v0, p1, Lf4/e;->g:I

    :cond_0
    return-void

    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v1, p2, Landroid/graphics/PointF;->x:F

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    iput v1, p1, Lf4/e;->a:I

    iget p2, p2, Landroid/graphics/PointF;->y:F

    invoke-static {p2}, Ljava/lang/Math;->round(F)I

    move-result p2

    iput p2, p1, Lf4/e;->b:I

    iget v1, p1, Lf4/e;->f:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p1, Lf4/e;->f:I

    iget v2, p1, Lf4/e;->g:I

    if-ne v1, v2, :cond_1

    iget v1, p1, Lf4/e;->a:I

    iget v2, p1, Lf4/e;->c:I

    iget v3, p1, Lf4/e;->d:I

    iget-object v4, p1, Lf4/e;->e:Landroid/view/View;

    invoke-static {v4, v1, p2, v2, v3}, Lf4/z;->a(Landroid/view/View;IIII)V

    iput v0, p1, Lf4/e;->f:I

    iput v0, p1, Lf4/e;->g:I

    :cond_1
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public final get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Ll/o2;->a:I

    const/4 v1, 0x0

    packed-switch v0, :pswitch_data_0

    check-cast p1, Landroid/view/View;

    sget-object v0, Lb3/q0;->a:Ljava/lang/reflect/Field;

    invoke-static {p1}, Lb3/d0;->a(Landroid/view/View;)Landroid/graphics/Rect;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Landroid/view/View;

    sget-object v0, Lf4/z;->a:Lf4/d0;

    invoke-virtual {v0, p1}, Lf4/a0;->L(Landroid/view/View;)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Landroid/view/View;

    return-object v1

    :pswitch_2
    check-cast p1, Landroid/view/View;

    return-object v1

    :pswitch_3
    check-cast p1, Landroid/view/View;

    return-object v1

    :pswitch_4
    check-cast p1, Lf4/e;

    return-object v1

    :pswitch_5
    check-cast p1, Lf4/e;

    return-object v1

    :pswitch_6
    check-cast p1, Landroidx/appcompat/widget/SwitchCompat;

    iget p1, p1, Landroidx/appcompat/widget/SwitchCompat;->G:F

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final set(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    iget v0, p0, Ll/o2;->a:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Landroid/view/View;

    check-cast p2, Landroid/graphics/Rect;

    sget-object v0, Lb3/q0;->a:Ljava/lang/reflect/Field;

    invoke-static {p1, p2}, Lb3/d0;->c(Landroid/view/View;Landroid/graphics/Rect;)V

    return-void

    :pswitch_0
    check-cast p1, Landroid/view/View;

    check-cast p2, Ljava/lang/Float;

    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    move-result p2

    sget-object v0, Lf4/z;->a:Lf4/d0;

    invoke-virtual {v0, p1, p2}, Lf4/a0;->M(Landroid/view/View;F)V

    return-void

    :pswitch_1
    check-cast p1, Landroid/view/View;

    check-cast p2, Landroid/graphics/PointF;

    invoke-virtual {p0, p1, p2}, Ll/o2;->a(Landroid/view/View;Landroid/graphics/PointF;)V

    return-void

    :pswitch_2
    check-cast p1, Landroid/view/View;

    check-cast p2, Landroid/graphics/PointF;

    invoke-virtual {p0, p1, p2}, Ll/o2;->a(Landroid/view/View;Landroid/graphics/PointF;)V

    return-void

    :pswitch_3
    check-cast p1, Landroid/view/View;

    check-cast p2, Landroid/graphics/PointF;

    invoke-virtual {p0, p1, p2}, Ll/o2;->a(Landroid/view/View;Landroid/graphics/PointF;)V

    return-void

    :pswitch_4
    check-cast p1, Lf4/e;

    check-cast p2, Landroid/graphics/PointF;

    invoke-virtual {p0, p1, p2}, Ll/o2;->b(Lf4/e;Landroid/graphics/PointF;)V

    return-void

    :pswitch_5
    check-cast p1, Lf4/e;

    check-cast p2, Landroid/graphics/PointF;

    invoke-virtual {p0, p1, p2}, Ll/o2;->b(Lf4/e;Landroid/graphics/PointF;)V

    return-void

    :pswitch_6
    check-cast p1, Landroidx/appcompat/widget/SwitchCompat;

    check-cast p2, Ljava/lang/Float;

    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    move-result p2

    invoke-virtual {p1, p2}, Landroidx/appcompat/widget/SwitchCompat;->setThumbPosition(F)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
