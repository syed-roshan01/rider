.class public Lk/q;
.super Ljava/lang/Object;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lk/l;

.field public final c:Z

.field public final d:I

.field public final e:I

.field public f:Landroid/view/View;

.field public g:I

.field public h:Z

.field public i:Lk/r;

.field public j:Lk/n;

.field public k:Landroid/widget/PopupWindow$OnDismissListener;

.field public final l:Lk/o;


# direct methods
.method public constructor <init>(IILandroid/content/Context;Landroid/view/View;Lk/l;Z)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const v0, 0x800003

    iput v0, p0, Lk/q;->g:I

    new-instance v0, Lk/o;

    invoke-direct {v0, p0}, Lk/o;-><init>(Lk/q;)V

    iput-object v0, p0, Lk/q;->l:Lk/o;

    iput-object p3, p0, Lk/q;->a:Landroid/content/Context;

    iput-object p5, p0, Lk/q;->b:Lk/l;

    iput-object p4, p0, Lk/q;->f:Landroid/view/View;

    iput-boolean p6, p0, Lk/q;->c:Z

    iput p1, p0, Lk/q;->d:I

    iput p2, p0, Lk/q;->e:I

    return-void
.end method


# virtual methods
.method public final a()Lk/n;
    .locals 15

    iget-object v0, p0, Lk/q;->j:Lk/n;

    if-nez v0, :cond_1

    const-string v0, "window"

    iget-object v1, p0, Lk/q;->a:Landroid/content/Context;

    invoke-virtual {v1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    new-instance v2, Landroid/graphics/Point;

    invoke-direct {v2}, Landroid/graphics/Point;-><init>()V

    invoke-static {v0, v2}, Lk/p;->a(Landroid/view/Display;Landroid/graphics/Point;)V

    iget v0, v2, Landroid/graphics/Point;->x:I

    iget v2, v2, Landroid/graphics/Point;->y:I

    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    move-result v0

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f060016

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    if-lt v0, v1, :cond_0

    new-instance v0, Lk/h;

    iget-object v3, p0, Lk/q;->a:Landroid/content/Context;

    iget-object v4, p0, Lk/q;->f:Landroid/view/View;

    iget v5, p0, Lk/q;->d:I

    iget v6, p0, Lk/q;->e:I

    iget-boolean v7, p0, Lk/q;->c:Z

    move-object v2, v0

    invoke-direct/range {v2 .. v7}, Lk/h;-><init>(Landroid/content/Context;Landroid/view/View;IIZ)V

    goto :goto_0

    :cond_0
    new-instance v0, Lk/v;

    iget-object v11, p0, Lk/q;->a:Landroid/content/Context;

    iget-object v13, p0, Lk/q;->b:Lk/l;

    iget-object v12, p0, Lk/q;->f:Landroid/view/View;

    iget v9, p0, Lk/q;->d:I

    iget v10, p0, Lk/q;->e:I

    iget-boolean v14, p0, Lk/q;->c:Z

    move-object v8, v0

    invoke-direct/range {v8 .. v14}, Lk/v;-><init>(IILandroid/content/Context;Landroid/view/View;Lk/l;Z)V

    :goto_0
    iget-object v1, p0, Lk/q;->b:Lk/l;

    invoke-virtual {v0, v1}, Lk/n;->l(Lk/l;)V

    iget-object v1, p0, Lk/q;->l:Lk/o;

    invoke-virtual {v0, v1}, Lk/n;->r(Landroid/widget/PopupWindow$OnDismissListener;)V

    iget-object v1, p0, Lk/q;->f:Landroid/view/View;

    invoke-virtual {v0, v1}, Lk/n;->n(Landroid/view/View;)V

    iget-object v1, p0, Lk/q;->i:Lk/r;

    invoke-interface {v0, v1}, Lk/s;->h(Lk/r;)V

    iget-boolean v1, p0, Lk/q;->h:Z

    invoke-virtual {v0, v1}, Lk/n;->o(Z)V

    iget v1, p0, Lk/q;->g:I

    invoke-virtual {v0, v1}, Lk/n;->p(I)V

    iput-object v0, p0, Lk/q;->j:Lk/n;

    :cond_1
    iget-object v0, p0, Lk/q;->j:Lk/n;

    return-object v0
.end method

.method public final b()Z
    .locals 1

    iget-object v0, p0, Lk/q;->j:Lk/n;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lk/u;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public c()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lk/q;->j:Lk/n;

    iget-object v0, p0, Lk/q;->k:Landroid/widget/PopupWindow$OnDismissListener;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Landroid/widget/PopupWindow$OnDismissListener;->onDismiss()V

    :cond_0
    return-void
.end method

.method public final d(IIZZ)V
    .locals 3

    invoke-virtual {p0}, Lk/q;->a()Lk/n;

    move-result-object v0

    invoke-virtual {v0, p4}, Lk/n;->s(Z)V

    if-eqz p3, :cond_1

    iget p3, p0, Lk/q;->g:I

    iget-object p4, p0, Lk/q;->f:Landroid/view/View;

    sget-object v1, Lb3/q0;->a:Ljava/lang/reflect/Field;

    invoke-static {p4}, Lb3/c0;->d(Landroid/view/View;)I

    move-result p4

    invoke-static {p3, p4}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    move-result p3

    and-int/lit8 p3, p3, 0x7

    const/4 p4, 0x5

    if-ne p3, p4, :cond_0

    iget-object p3, p0, Lk/q;->f:Landroid/view/View;

    invoke-virtual {p3}, Landroid/view/View;->getWidth()I

    move-result p3

    sub-int/2addr p1, p3

    :cond_0
    invoke-virtual {v0, p1}, Lk/n;->q(I)V

    invoke-virtual {v0, p2}, Lk/n;->t(I)V

    iget-object p3, p0, Lk/q;->a:Landroid/content/Context;

    invoke-virtual {p3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    invoke-virtual {p3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p3

    iget p3, p3, Landroid/util/DisplayMetrics;->density:F

    const/high16 p4, 0x42400000    # 48.0f

    mul-float/2addr p3, p4

    const/high16 p4, 0x40000000    # 2.0f

    div-float/2addr p3, p4

    float-to-int p3, p3

    new-instance p4, Landroid/graphics/Rect;

    sub-int v1, p1, p3

    sub-int v2, p2, p3

    add-int/2addr p1, p3

    add-int/2addr p2, p3

    invoke-direct {p4, v1, v2, p1, p2}, Landroid/graphics/Rect;-><init>(IIII)V

    iput-object p4, v0, Lk/n;->a:Landroid/graphics/Rect;

    :cond_1
    invoke-interface {v0}, Lk/u;->e()V

    return-void
.end method
