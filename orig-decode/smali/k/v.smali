.class public final Lk/v;
.super Lk/n;

# interfaces
.implements Landroid/widget/PopupWindow$OnDismissListener;
.implements Landroid/view/View$OnKeyListener;


# instance fields
.field public A:I

.field public B:Z

.field public final b:Landroid/content/Context;

.field public final c:Lk/l;

.field public final d:Lk/i;

.field public final e:Z

.field public final f:I

.field public final n:I

.field public final o:I

.field public final p:Ll/u1;

.field public final q:Lk/c;

.field public final r:Lk/d;

.field public s:Landroid/widget/PopupWindow$OnDismissListener;

.field public t:Landroid/view/View;

.field public u:Landroid/view/View;

.field public v:Lk/r;

.field public w:Landroid/view/ViewTreeObserver;

.field public x:Z

.field public y:Z

.field public z:I


# direct methods
.method public constructor <init>(IILandroid/content/Context;Landroid/view/View;Lk/l;Z)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lk/c;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lk/c;-><init>(Lk/n;I)V

    iput-object v0, p0, Lk/v;->q:Lk/c;

    new-instance v0, Lk/d;

    invoke-direct {v0, p0, v1}, Lk/d;-><init>(Ljava/lang/Object;I)V

    iput-object v0, p0, Lk/v;->r:Lk/d;

    const/4 v0, 0x0

    iput v0, p0, Lk/v;->A:I

    iput-object p3, p0, Lk/v;->b:Landroid/content/Context;

    iput-object p5, p0, Lk/v;->c:Lk/l;

    iput-boolean p6, p0, Lk/v;->e:Z

    invoke-static {p3}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    new-instance v1, Lk/i;

    const v2, 0x7f0b0013

    invoke-direct {v1, p5, v0, p6, v2}, Lk/i;-><init>(Lk/l;Landroid/view/LayoutInflater;ZI)V

    iput-object v1, p0, Lk/v;->d:Lk/i;

    iput p1, p0, Lk/v;->n:I

    iput p2, p0, Lk/v;->o:I

    invoke-virtual {p3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p6

    invoke-virtual {p6}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    div-int/lit8 v0, v0, 0x2

    const v1, 0x7f060017

    invoke-virtual {p6, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p6

    invoke-static {v0, p6}, Ljava/lang/Math;->max(II)I

    move-result p6

    iput p6, p0, Lk/v;->f:I

    iput-object p4, p0, Lk/v;->t:Landroid/view/View;

    new-instance p4, Ll/u1;

    invoke-direct {p4, p3, p1, p2}, Ll/o1;-><init>(Landroid/content/Context;II)V

    iput-object p4, p0, Lk/v;->p:Ll/u1;

    invoke-virtual {p5, p0, p3}, Lk/l;->b(Lk/s;Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public final b(Lk/w;)Z
    .locals 9

    invoke-virtual {p1}, Lk/l;->hasVisibleItems()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_7

    new-instance v0, Lk/q;

    iget-object v5, p0, Lk/v;->b:Landroid/content/Context;

    iget-object v6, p0, Lk/v;->u:Landroid/view/View;

    iget-boolean v8, p0, Lk/v;->e:Z

    iget v3, p0, Lk/v;->n:I

    iget v4, p0, Lk/v;->o:I

    move-object v2, v0

    move-object v7, p1

    invoke-direct/range {v2 .. v8}, Lk/q;-><init>(IILandroid/content/Context;Landroid/view/View;Lk/l;Z)V

    iget-object v2, p0, Lk/v;->v:Lk/r;

    iput-object v2, v0, Lk/q;->i:Lk/r;

    iget-object v3, v0, Lk/q;->j:Lk/n;

    if-eqz v3, :cond_0

    invoke-interface {v3, v2}, Lk/s;->h(Lk/r;)V

    :cond_0
    invoke-static {p1}, Lk/n;->u(Lk/l;)Z

    move-result v2

    iput-boolean v2, v0, Lk/q;->h:Z

    iget-object v3, v0, Lk/q;->j:Lk/n;

    if-eqz v3, :cond_1

    invoke-virtual {v3, v2}, Lk/n;->o(Z)V

    :cond_1
    iget-object v2, p0, Lk/v;->s:Landroid/widget/PopupWindow$OnDismissListener;

    iput-object v2, v0, Lk/q;->k:Landroid/widget/PopupWindow$OnDismissListener;

    const/4 v2, 0x0

    iput-object v2, p0, Lk/v;->s:Landroid/widget/PopupWindow$OnDismissListener;

    iget-object v2, p0, Lk/v;->c:Lk/l;

    invoke-virtual {v2, v1}, Lk/l;->c(Z)V

    iget-object v2, p0, Lk/v;->p:Ll/u1;

    iget v3, v2, Ll/o1;->e:I

    iget-boolean v4, v2, Ll/o1;->n:Z

    if-nez v4, :cond_2

    move v2, v1

    goto :goto_0

    :cond_2
    iget v2, v2, Ll/o1;->f:I

    :goto_0
    iget v4, p0, Lk/v;->A:I

    iget-object v5, p0, Lk/v;->t:Landroid/view/View;

    sget-object v6, Lb3/q0;->a:Ljava/lang/reflect/Field;

    invoke-static {v5}, Lb3/c0;->d(Landroid/view/View;)I

    move-result v5

    invoke-static {v4, v5}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    move-result v4

    and-int/lit8 v4, v4, 0x7

    const/4 v5, 0x5

    if-ne v4, v5, :cond_3

    iget-object v4, p0, Lk/v;->t:Landroid/view/View;

    invoke-virtual {v4}, Landroid/view/View;->getWidth()I

    move-result v4

    add-int/2addr v3, v4

    :cond_3
    invoke-virtual {v0}, Lk/q;->b()Z

    move-result v4

    const/4 v5, 0x1

    if-eqz v4, :cond_4

    goto :goto_1

    :cond_4
    iget-object v4, v0, Lk/q;->f:Landroid/view/View;

    if-nez v4, :cond_5

    goto :goto_2

    :cond_5
    invoke-virtual {v0, v3, v2, v5, v5}, Lk/q;->d(IIZZ)V

    :goto_1
    iget-object v0, p0, Lk/v;->v:Lk/r;

    if-eqz v0, :cond_6

    invoke-interface {v0, p1}, Lk/r;->h(Lk/l;)Z

    :cond_6
    return v5

    :cond_7
    :goto_2
    return v1
.end method

.method public final c(Lk/l;Z)V
    .locals 1

    iget-object v0, p0, Lk/v;->c:Lk/l;

    if-eq p1, v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Lk/v;->dismiss()V

    iget-object v0, p0, Lk/v;->v:Lk/r;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1, p2}, Lk/r;->c(Lk/l;Z)V

    :cond_1
    return-void
.end method

.method public final dismiss()V
    .locals 1

    invoke-virtual {p0}, Lk/v;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lk/v;->p:Ll/u1;

    invoke-virtual {v0}, Ll/o1;->dismiss()V

    :cond_0
    return-void
.end method

.method public final e()V
    .locals 8

    invoke-virtual {p0}, Lk/v;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_3

    :cond_0
    iget-boolean v0, p0, Lk/v;->x:Z

    if-nez v0, :cond_8

    iget-object v0, p0, Lk/v;->t:Landroid/view/View;

    if-eqz v0, :cond_8

    iput-object v0, p0, Lk/v;->u:Landroid/view/View;

    iget-object v0, p0, Lk/v;->p:Ll/u1;

    iget-object v1, v0, Ll/o1;->C:Ll/y;

    invoke-virtual {v1, p0}, Landroid/widget/PopupWindow;->setOnDismissListener(Landroid/widget/PopupWindow$OnDismissListener;)V

    iput-object p0, v0, Ll/o1;->t:Landroid/widget/AdapterView$OnItemClickListener;

    const/4 v1, 0x1

    iput-boolean v1, v0, Ll/o1;->B:Z

    iget-object v2, v0, Ll/o1;->C:Ll/y;

    invoke-virtual {v2, v1}, Landroid/widget/PopupWindow;->setFocusable(Z)V

    iget-object v2, p0, Lk/v;->u:Landroid/view/View;

    iget-object v3, p0, Lk/v;->w:Landroid/view/ViewTreeObserver;

    const/4 v4, 0x0

    if-nez v3, :cond_1

    move v3, v1

    goto :goto_0

    :cond_1
    move v3, v4

    :goto_0
    invoke-virtual {v2}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v5

    iput-object v5, p0, Lk/v;->w:Landroid/view/ViewTreeObserver;

    if-eqz v3, :cond_2

    iget-object v3, p0, Lk/v;->q:Lk/c;

    invoke-virtual {v5, v3}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    :cond_2
    iget-object v3, p0, Lk/v;->r:Lk/d;

    invoke-virtual {v2, v3}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    iput-object v2, v0, Ll/o1;->s:Landroid/view/View;

    iget v2, p0, Lk/v;->A:I

    iput v2, v0, Ll/o1;->q:I

    iget-boolean v2, p0, Lk/v;->y:Z

    iget-object v3, p0, Lk/v;->b:Landroid/content/Context;

    iget-object v5, p0, Lk/v;->d:Lk/i;

    if-nez v2, :cond_3

    iget v2, p0, Lk/v;->f:I

    invoke-static {v5, v3, v2}, Lk/n;->m(Lk/i;Landroid/content/Context;I)I

    move-result v2

    iput v2, p0, Lk/v;->z:I

    iput-boolean v1, p0, Lk/v;->y:Z

    :cond_3
    iget v1, p0, Lk/v;->z:I

    iget-object v2, v0, Ll/o1;->C:Ll/y;

    invoke-virtual {v2}, Landroid/widget/PopupWindow;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    if-eqz v2, :cond_4

    iget-object v6, v0, Ll/o1;->z:Landroid/graphics/Rect;

    invoke-virtual {v2, v6}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    iget v2, v6, Landroid/graphics/Rect;->left:I

    iget v6, v6, Landroid/graphics/Rect;->right:I

    add-int/2addr v2, v6

    add-int/2addr v2, v1

    iput v2, v0, Ll/o1;->d:I

    goto :goto_1

    :cond_4
    iput v1, v0, Ll/o1;->d:I

    :goto_1
    const/4 v1, 0x2

    iget-object v2, v0, Ll/o1;->C:Ll/y;

    invoke-virtual {v2, v1}, Landroid/widget/PopupWindow;->setInputMethodMode(I)V

    iget-object v1, p0, Lk/n;->a:Landroid/graphics/Rect;

    const/4 v2, 0x0

    if-eqz v1, :cond_5

    new-instance v6, Landroid/graphics/Rect;

    invoke-direct {v6, v1}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    goto :goto_2

    :cond_5
    move-object v6, v2

    :goto_2
    iput-object v6, v0, Ll/o1;->A:Landroid/graphics/Rect;

    invoke-virtual {v0}, Ll/o1;->e()V

    iget-object v1, v0, Ll/o1;->c:Ll/t1;

    invoke-virtual {v1, p0}, Landroid/view/View;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    iget-boolean v6, p0, Lk/v;->B:Z

    if-eqz v6, :cond_7

    iget-object v6, p0, Lk/v;->c:Lk/l;

    iget-object v7, v6, Lk/l;->l:Ljava/lang/CharSequence;

    if-eqz v7, :cond_7

    invoke-static {v3}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v3

    const v7, 0x7f0b0012

    invoke-virtual {v3, v7, v1, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/FrameLayout;

    const v7, 0x1020016

    invoke-virtual {v3, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/TextView;

    if-eqz v7, :cond_6

    iget-object v6, v6, Lk/l;->l:Ljava/lang/CharSequence;

    invoke-virtual {v7, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_6
    invoke-virtual {v3, v4}, Landroid/view/View;->setEnabled(Z)V

    invoke-virtual {v1, v3, v2, v4}, Landroid/widget/ListView;->addHeaderView(Landroid/view/View;Ljava/lang/Object;Z)V

    :cond_7
    invoke-virtual {v0, v5}, Ll/o1;->a(Lk/i;)V

    invoke-virtual {v0}, Ll/o1;->e()V

    :goto_3
    return-void

    :cond_8
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "StandardMenuPopup cannot be used without an anchor"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final f()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lk/v;->y:Z

    iget-object v0, p0, Lk/v;->d:Lk/i;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lk/i;->notifyDataSetChanged()V

    :cond_0
    return-void
.end method

.method public final g()Landroid/widget/ListView;
    .locals 1

    iget-object v0, p0, Lk/v;->p:Ll/u1;

    iget-object v0, v0, Ll/o1;->c:Ll/t1;

    return-object v0
.end method

.method public final h(Lk/r;)V
    .locals 0

    iput-object p1, p0, Lk/v;->v:Lk/r;

    return-void
.end method

.method public final j()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final k()Z
    .locals 1

    iget-boolean v0, p0, Lk/v;->x:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lk/v;->p:Ll/u1;

    iget-object v0, v0, Ll/o1;->C:Ll/y;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final l(Lk/l;)V
    .locals 0

    return-void
.end method

.method public final n(Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, Lk/v;->t:Landroid/view/View;

    return-void
.end method

.method public final o(Z)V
    .locals 1

    iget-object v0, p0, Lk/v;->d:Lk/i;

    iput-boolean p1, v0, Lk/i;->c:Z

    return-void
.end method

.method public final onDismiss()V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lk/v;->x:Z

    iget-object v1, p0, Lk/v;->c:Lk/l;

    invoke-virtual {v1, v0}, Lk/l;->c(Z)V

    iget-object v0, p0, Lk/v;->w:Landroid/view/ViewTreeObserver;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/view/ViewTreeObserver;->isAlive()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lk/v;->u:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iput-object v0, p0, Lk/v;->w:Landroid/view/ViewTreeObserver;

    :cond_0
    iget-object v0, p0, Lk/v;->w:Landroid/view/ViewTreeObserver;

    iget-object v1, p0, Lk/v;->q:Lk/c;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lk/v;->w:Landroid/view/ViewTreeObserver;

    :cond_1
    iget-object v0, p0, Lk/v;->u:Landroid/view/View;

    iget-object v1, p0, Lk/v;->r:Lk/d;

    invoke-virtual {v0, v1}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    iget-object v0, p0, Lk/v;->s:Landroid/widget/PopupWindow$OnDismissListener;

    if-eqz v0, :cond_2

    invoke-interface {v0}, Landroid/widget/PopupWindow$OnDismissListener;->onDismiss()V

    :cond_2
    return-void
.end method

.method public final onKey(Landroid/view/View;ILandroid/view/KeyEvent;)Z
    .locals 0

    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    move-result p1

    const/4 p3, 0x1

    if-ne p1, p3, :cond_0

    const/16 p1, 0x52

    if-ne p2, p1, :cond_0

    invoke-virtual {p0}, Lk/v;->dismiss()V

    return p3

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final p(I)V
    .locals 0

    iput p1, p0, Lk/v;->A:I

    return-void
.end method

.method public final q(I)V
    .locals 1

    iget-object v0, p0, Lk/v;->p:Ll/u1;

    iput p1, v0, Ll/o1;->e:I

    return-void
.end method

.method public final r(Landroid/widget/PopupWindow$OnDismissListener;)V
    .locals 0

    iput-object p1, p0, Lk/v;->s:Landroid/widget/PopupWindow$OnDismissListener;

    return-void
.end method

.method public final s(Z)V
    .locals 0

    iput-boolean p1, p0, Lk/v;->B:Z

    return-void
.end method

.method public final t(I)V
    .locals 1

    iget-object v0, p0, Lk/v;->p:Ll/u1;

    iput p1, v0, Ll/o1;->f:I

    const/4 p1, 0x1

    iput-boolean p1, v0, Ll/o1;->n:Z

    return-void
.end method
