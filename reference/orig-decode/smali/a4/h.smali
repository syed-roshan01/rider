.class public final La4/h;
.super Landroid/animation/AnimatorListenerAdapter;


# instance fields
.field public final synthetic a:I

.field public b:Z

.field public final c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La4/j;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, La4/h;->a:I

    iput-object p1, p0, La4/h;->c:Ljava/lang/Object;

    .line 2
    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    iput-boolean v0, p0, La4/h;->b:Z

    return-void
.end method

.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, La4/h;->a:I

    .line 1
    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, La4/h;->b:Z

    iput-object p1, p0, La4/h;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final onAnimationCancel(Landroid/animation/Animator;)V
    .locals 1

    iget v0, p0, La4/h;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationCancel(Landroid/animation/Animator;)V

    return-void

    :pswitch_0
    const/4 p1, 0x1

    iput-boolean p1, p0, La4/h;->b:Z

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 3

    iget p1, p0, La4/h;->a:I

    const/4 v0, 0x0

    iget-object v1, p0, La4/h;->c:Ljava/lang/Object;

    packed-switch p1, :pswitch_data_0

    check-cast v1, Landroid/view/View;

    sget-object p1, Lf4/z;->a:Lf4/d0;

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {p1, v1, v2}, Lf4/a0;->M(Landroid/view/View;F)V

    iget-boolean p1, p0, La4/h;->b:Z

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    invoke-virtual {v1, v0, p1}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    :cond_0
    return-void

    :pswitch_0
    iget-boolean p1, p0, La4/h;->b:Z

    if-eqz p1, :cond_1

    iput-boolean v0, p0, La4/h;->b:Z

    goto :goto_0

    :cond_1
    check-cast v1, La4/j;

    iget-object p1, v1, La4/j;->u:Landroid/animation/ValueAnimator;

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    const/4 v2, 0x0

    cmpl-float p1, p1, v2

    if-nez p1, :cond_2

    iput v0, v1, La4/j;->v:I

    invoke-virtual {v1, v0}, La4/j;->e(I)V

    goto :goto_0

    :cond_2
    const/4 p1, 0x2

    iput p1, v1, La4/j;->v:I

    iget-object p1, v1, La4/j;->n:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onAnimationStart(Landroid/animation/Animator;)V
    .locals 2

    iget v0, p0, La4/h;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationStart(Landroid/animation/Animator;)V

    return-void

    :pswitch_0
    iget-object p1, p0, La4/h;->c:Ljava/lang/Object;

    check-cast p1, Landroid/view/View;

    sget-object v0, Lb3/q0;->a:Ljava/lang/reflect/Field;

    invoke-static {p1}, Lb3/b0;->h(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->getLayerType()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, La4/h;->b:Z

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    :cond_0
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
