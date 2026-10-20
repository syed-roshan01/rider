.class public final Lk/h;
.super Lk/n;

# interfaces
.implements Landroid/view/View$OnKeyListener;
.implements Landroid/widget/PopupWindow$OnDismissListener;


# instance fields
.field public A:I

.field public B:I

.field public C:Z

.field public D:Z

.field public E:Lk/r;

.field public F:Landroid/view/ViewTreeObserver;

.field public G:Landroid/widget/PopupWindow$OnDismissListener;

.field public H:Z

.field public final b:Landroid/content/Context;

.field public final c:I

.field public final d:I

.field public final e:I

.field public final f:Z

.field public final n:Landroid/os/Handler;

.field public final o:Ljava/util/ArrayList;

.field public final p:Ljava/util/ArrayList;

.field public final q:Lk/c;

.field public final r:Lk/d;

.field public final s:Lk/f;

.field public t:I

.field public u:I

.field public v:Landroid/view/View;

.field public w:Landroid/view/View;

.field public x:I

.field public y:Z

.field public z:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/view/View;IIZ)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lk/h;->o:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lk/h;->p:Ljava/util/ArrayList;

    new-instance v0, Lk/c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lk/c;-><init>(Lk/n;I)V

    iput-object v0, p0, Lk/h;->q:Lk/c;

    new-instance v0, Lk/d;

    invoke-direct {v0, p0, v1}, Lk/d;-><init>(Ljava/lang/Object;I)V

    iput-object v0, p0, Lk/h;->r:Lk/d;

    new-instance v0, Lk/f;

    invoke-direct {v0, p0, v1}, Lk/f;-><init>(Ljava/lang/Object;I)V

    iput-object v0, p0, Lk/h;->s:Lk/f;

    iput v1, p0, Lk/h;->t:I

    iput v1, p0, Lk/h;->u:I

    iput-object p1, p0, Lk/h;->b:Landroid/content/Context;

    iput-object p2, p0, Lk/h;->v:Landroid/view/View;

    iput p3, p0, Lk/h;->d:I

    iput p4, p0, Lk/h;->e:I

    iput-boolean p5, p0, Lk/h;->f:Z

    iput-boolean v1, p0, Lk/h;->C:Z

    sget-object p3, Lb3/q0;->a:Ljava/lang/reflect/Field;

    invoke-static {p2}, Lb3/c0;->d(Landroid/view/View;)I

    move-result p2

    const/4 p3, 0x1

    if-ne p2, p3, :cond_0

    goto :goto_0

    :cond_0
    move v1, p3

    :goto_0
    iput v1, p0, Lk/h;->x:I

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p2

    iget p2, p2, Landroid/util/DisplayMetrics;->widthPixels:I

    div-int/lit8 p2, p2, 0x2

    const p3, 0x7f060017

    invoke-virtual {p1, p3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p1

    invoke-static {p2, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    iput p1, p0, Lk/h;->c:I

    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    iput-object p1, p0, Lk/h;->n:Landroid/os/Handler;

    return-void
.end method


# virtual methods
.method public final b(Lk/w;)Z
    .locals 4

    iget-object v0, p0, Lk/h;->p:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lk/g;

    iget-object v3, v1, Lk/g;->b:Lk/l;

    if-ne p1, v3, :cond_0

    iget-object p1, v1, Lk/g;->a:Ll/u1;

    iget-object p1, p1, Ll/o1;->c:Ll/t1;

    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    return v2

    :cond_1
    invoke-virtual {p1}, Lk/l;->hasVisibleItems()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0, p1}, Lk/h;->l(Lk/l;)V

    iget-object v0, p0, Lk/h;->E:Lk/r;

    if-eqz v0, :cond_2

    invoke-interface {v0, p1}, Lk/r;->h(Lk/l;)Z

    :cond_2
    return v2

    :cond_3
    const/4 p1, 0x0

    return p1
.end method

.method public final c(Lk/l;Z)V
    .locals 7

    iget-object v0, p0, Lk/h;->p:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_1

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lk/g;

    iget-object v4, v4, Lk/g;->b:Lk/l;

    if-ne p1, v4, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v3, -0x1

    :goto_1
    if-gez v3, :cond_2

    return-void

    :cond_2
    add-int/lit8 v1, v3, 0x1

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ge v1, v4, :cond_3

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lk/g;

    iget-object v1, v1, Lk/g;->b:Lk/l;

    invoke-virtual {v1, v2}, Lk/l;->c(Z)V

    :cond_3
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lk/g;

    iget-object v3, v1, Lk/g;->b:Lk/l;

    iget-object v3, v3, Lk/l;->r:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v3}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_4
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/ref/WeakReference;

    invoke-virtual {v5}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lk/s;

    if-eqz v6, :cond_5

    if-ne v6, p0, :cond_4

    :cond_5
    invoke-virtual {v3, v5}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_6
    iget-boolean v3, p0, Lk/h;->H:Z

    const/4 v4, 0x0

    iget-object v1, v1, Lk/g;->a:Ll/u1;

    if-eqz v3, :cond_7

    iget-object v3, v1, Ll/o1;->C:Ll/y;

    invoke-static {v3, v4}, Ll/q1;->b(Landroid/widget/PopupWindow;Landroid/transition/Transition;)V

    iget-object v3, v1, Ll/o1;->C:Ll/y;

    invoke-virtual {v3, v2}, Landroid/widget/PopupWindow;->setAnimationStyle(I)V

    :cond_7
    invoke-virtual {v1}, Ll/o1;->dismiss()V

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v3, 0x1

    if-lez v1, :cond_8

    add-int/lit8 v5, v1, -0x1

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lk/g;

    iget v5, v5, Lk/g;->c:I

    iput v5, p0, Lk/h;->x:I

    goto :goto_4

    :cond_8
    iget-object v5, p0, Lk/h;->v:Landroid/view/View;

    sget-object v6, Lb3/q0;->a:Ljava/lang/reflect/Field;

    invoke-static {v5}, Lb3/c0;->d(Landroid/view/View;)I

    move-result v5

    if-ne v5, v3, :cond_9

    move v5, v2

    goto :goto_3

    :cond_9
    move v5, v3

    :goto_3
    iput v5, p0, Lk/h;->x:I

    :goto_4
    if-nez v1, :cond_d

    invoke-virtual {p0}, Lk/h;->dismiss()V

    iget-object p2, p0, Lk/h;->E:Lk/r;

    if-eqz p2, :cond_a

    invoke-interface {p2, p1, v3}, Lk/r;->c(Lk/l;Z)V

    :cond_a
    iget-object p1, p0, Lk/h;->F:Landroid/view/ViewTreeObserver;

    if-eqz p1, :cond_c

    invoke-virtual {p1}, Landroid/view/ViewTreeObserver;->isAlive()Z

    move-result p1

    if-eqz p1, :cond_b

    iget-object p1, p0, Lk/h;->F:Landroid/view/ViewTreeObserver;

    iget-object p2, p0, Lk/h;->q:Lk/c;

    invoke-virtual {p1, p2}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    :cond_b
    iput-object v4, p0, Lk/h;->F:Landroid/view/ViewTreeObserver;

    :cond_c
    iget-object p1, p0, Lk/h;->w:Landroid/view/View;

    iget-object p2, p0, Lk/h;->r:Lk/d;

    invoke-virtual {p1, p2}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    iget-object p1, p0, Lk/h;->G:Landroid/widget/PopupWindow$OnDismissListener;

    invoke-interface {p1}, Landroid/widget/PopupWindow$OnDismissListener;->onDismiss()V

    goto :goto_5

    :cond_d
    if-eqz p2, :cond_e

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lk/g;

    iget-object p1, p1, Lk/g;->b:Lk/l;

    invoke-virtual {p1, v2}, Lk/l;->c(Z)V

    :cond_e
    :goto_5
    return-void
.end method

.method public final dismiss()V
    .locals 4

    iget-object v0, p0, Lk/h;->p:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lez v1, :cond_1

    new-array v2, v1, [Lk/g;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lk/g;

    add-int/lit8 v1, v1, -0x1

    :goto_0
    if-ltz v1, :cond_1

    aget-object v2, v0, v1

    iget-object v3, v2, Lk/g;->a:Ll/u1;

    iget-object v3, v3, Ll/o1;->C:Ll/y;

    invoke-virtual {v3}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v3

    if-eqz v3, :cond_0

    iget-object v2, v2, Lk/g;->a:Ll/u1;

    invoke-virtual {v2}, Ll/o1;->dismiss()V

    :cond_0
    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final e()V
    .locals 3

    invoke-virtual {p0}, Lk/h;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lk/h;->o:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lk/l;

    invoke-virtual {p0, v2}, Lk/h;->v(Lk/l;)V

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v0, p0, Lk/h;->v:Landroid/view/View;

    iput-object v0, p0, Lk/h;->w:Landroid/view/View;

    if-eqz v0, :cond_4

    iget-object v1, p0, Lk/h;->F:Landroid/view/ViewTreeObserver;

    if-nez v1, :cond_2

    const/4 v1, 0x1

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    :goto_1
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iput-object v0, p0, Lk/h;->F:Landroid/view/ViewTreeObserver;

    if-eqz v1, :cond_3

    iget-object v1, p0, Lk/h;->q:Lk/c;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    :cond_3
    iget-object v0, p0, Lk/h;->w:Landroid/view/View;

    iget-object v1, p0, Lk/h;->r:Lk/d;

    invoke-virtual {v0, v1}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    :cond_4
    return-void
.end method

.method public final f()V
    .locals 3

    iget-object v0, p0, Lk/h;->p:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lk/g;

    iget-object v1, v1, Lk/g;->a:Ll/u1;

    iget-object v1, v1, Ll/o1;->c:Ll/t1;

    invoke-virtual {v1}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v1

    instance-of v2, v1, Landroid/widget/HeaderViewListAdapter;

    if-eqz v2, :cond_0

    check-cast v1, Landroid/widget/HeaderViewListAdapter;

    invoke-virtual {v1}, Landroid/widget/HeaderViewListAdapter;->getWrappedAdapter()Landroid/widget/ListAdapter;

    move-result-object v1

    check-cast v1, Lk/i;

    goto :goto_1

    :cond_0
    check-cast v1, Lk/i;

    :goto_1
    invoke-virtual {v1}, Lk/i;->notifyDataSetChanged()V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final g()Landroid/widget/ListView;
    .locals 2

    iget-object v0, p0, Lk/h;->p:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    invoke-static {v0, v1}, La7/a;->k(Ljava/util/ArrayList;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lk/g;

    iget-object v0, v0, Lk/g;->a:Ll/u1;

    iget-object v0, v0, Ll/o1;->c:Ll/t1;

    :goto_0
    return-object v0
.end method

.method public final h(Lk/r;)V
    .locals 0

    iput-object p1, p0, Lk/h;->E:Lk/r;

    return-void
.end method

.method public final j()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final k()Z
    .locals 3

    iget-object v0, p0, Lk/h;->p:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    if-lez v1, :cond_0

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lk/g;

    iget-object v0, v0, Lk/g;->a:Ll/u1;

    iget-object v0, v0, Ll/o1;->C:Ll/y;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v2, 0x1

    :cond_0
    return v2
.end method

.method public final l(Lk/l;)V
    .locals 1

    iget-object v0, p0, Lk/h;->b:Landroid/content/Context;

    invoke-virtual {p1, p0, v0}, Lk/l;->b(Lk/s;Landroid/content/Context;)V

    invoke-virtual {p0}, Lk/h;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lk/h;->v(Lk/l;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lk/h;->o:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_0
    return-void
.end method

.method public final n(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lk/h;->v:Landroid/view/View;

    if-eq v0, p1, :cond_0

    iput-object p1, p0, Lk/h;->v:Landroid/view/View;

    iget v0, p0, Lk/h;->t:I

    sget-object v1, Lb3/q0;->a:Ljava/lang/reflect/Field;

    invoke-static {p1}, Lb3/c0;->d(Landroid/view/View;)I

    move-result p1

    invoke-static {v0, p1}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    move-result p1

    iput p1, p0, Lk/h;->u:I

    :cond_0
    return-void
.end method

.method public final o(Z)V
    .locals 0

    iput-boolean p1, p0, Lk/h;->C:Z

    return-void
.end method

.method public final onDismiss()V
    .locals 6

    iget-object v0, p0, Lk/h;->p:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_1

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lk/g;

    iget-object v5, v4, Lk/g;->a:Ll/u1;

    iget-object v5, v5, Ll/o1;->C:Ll/y;

    invoke-virtual {v5}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v5

    if-nez v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-eqz v4, :cond_2

    iget-object v0, v4, Lk/g;->b:Lk/l;

    invoke-virtual {v0, v2}, Lk/l;->c(Z)V

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

    invoke-virtual {p0}, Lk/h;->dismiss()V

    return p3

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final p(I)V
    .locals 2

    iget v0, p0, Lk/h;->t:I

    if-eq v0, p1, :cond_0

    iput p1, p0, Lk/h;->t:I

    iget-object v0, p0, Lk/h;->v:Landroid/view/View;

    sget-object v1, Lb3/q0;->a:Ljava/lang/reflect/Field;

    invoke-static {v0}, Lb3/c0;->d(Landroid/view/View;)I

    move-result v0

    invoke-static {p1, v0}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    move-result p1

    iput p1, p0, Lk/h;->u:I

    :cond_0
    return-void
.end method

.method public final q(I)V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lk/h;->y:Z

    iput p1, p0, Lk/h;->A:I

    return-void
.end method

.method public final r(Landroid/widget/PopupWindow$OnDismissListener;)V
    .locals 0

    iput-object p1, p0, Lk/h;->G:Landroid/widget/PopupWindow$OnDismissListener;

    return-void
.end method

.method public final s(Z)V
    .locals 0

    iput-boolean p1, p0, Lk/h;->D:Z

    return-void
.end method

.method public final t(I)V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lk/h;->z:Z

    iput p1, p0, Lk/h;->B:I

    return-void
.end method

.method public final v(Lk/l;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v0, Lk/h;->b:Landroid/content/Context;

    invoke-static {v2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v3

    new-instance v4, Lk/i;

    iget-boolean v5, v0, Lk/h;->f:Z

    const v6, 0x7f0b000b

    invoke-direct {v4, v1, v3, v5, v6}, Lk/i;-><init>(Lk/l;Landroid/view/LayoutInflater;ZI)V

    invoke-virtual/range {p0 .. p0}, Lk/h;->k()Z

    move-result v5

    const/4 v6, 0x1

    if-nez v5, :cond_0

    iget-boolean v5, v0, Lk/h;->C:Z

    if-eqz v5, :cond_0

    iput-boolean v6, v4, Lk/i;->c:Z

    goto :goto_0

    :cond_0
    invoke-virtual/range {p0 .. p0}, Lk/h;->k()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-static/range {p1 .. p1}, Lk/n;->u(Lk/l;)Z

    move-result v5

    iput-boolean v5, v4, Lk/i;->c:Z

    :cond_1
    :goto_0
    iget v5, v0, Lk/h;->c:I

    invoke-static {v4, v2, v5}, Lk/n;->m(Lk/i;Landroid/content/Context;I)I

    move-result v5

    new-instance v7, Ll/u1;

    iget v8, v0, Lk/h;->d:I

    iget v9, v0, Lk/h;->e:I

    invoke-direct {v7, v2, v8, v9}, Ll/o1;-><init>(Landroid/content/Context;II)V

    iget-object v2, v0, Lk/h;->s:Lk/f;

    iput-object v2, v7, Ll/u1;->F:Ll/p1;

    iput-object v0, v7, Ll/o1;->t:Landroid/widget/AdapterView$OnItemClickListener;

    iget-object v2, v7, Ll/o1;->C:Ll/y;

    invoke-virtual {v2, v0}, Landroid/widget/PopupWindow;->setOnDismissListener(Landroid/widget/PopupWindow$OnDismissListener;)V

    iget-object v2, v0, Lk/h;->v:Landroid/view/View;

    iput-object v2, v7, Ll/o1;->s:Landroid/view/View;

    iget v2, v0, Lk/h;->u:I

    iput v2, v7, Ll/o1;->q:I

    iput-boolean v6, v7, Ll/o1;->B:Z

    iget-object v2, v7, Ll/o1;->C:Ll/y;

    invoke-virtual {v2, v6}, Landroid/widget/PopupWindow;->setFocusable(Z)V

    iget-object v2, v7, Ll/o1;->C:Ll/y;

    const/4 v8, 0x2

    invoke-virtual {v2, v8}, Landroid/widget/PopupWindow;->setInputMethodMode(I)V

    invoke-virtual {v7, v4}, Ll/o1;->a(Lk/i;)V

    iget-object v2, v7, Ll/o1;->C:Ll/y;

    invoke-virtual {v2}, Landroid/widget/PopupWindow;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    if-eqz v2, :cond_2

    iget-object v4, v7, Ll/o1;->z:Landroid/graphics/Rect;

    invoke-virtual {v2, v4}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    iget v2, v4, Landroid/graphics/Rect;->left:I

    iget v4, v4, Landroid/graphics/Rect;->right:I

    add-int/2addr v2, v4

    add-int/2addr v2, v5

    iput v2, v7, Ll/o1;->d:I

    goto :goto_1

    :cond_2
    iput v5, v7, Ll/o1;->d:I

    :goto_1
    iget v2, v0, Lk/h;->u:I

    iput v2, v7, Ll/o1;->q:I

    iget-object v2, v0, Lk/h;->p:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-lez v4, :cond_b

    invoke-static {v2, v6}, La7/a;->k(Ljava/util/ArrayList;I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lk/g;

    iget-object v11, v4, Lk/g;->b:Lk/l;

    iget-object v12, v11, Lk/l;->f:Ljava/util/ArrayList;

    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    move-result v12

    const/4 v13, 0x0

    :goto_2
    if-ge v13, v12, :cond_4

    invoke-virtual {v11, v13}, Lk/l;->getItem(I)Landroid/view/MenuItem;

    move-result-object v14

    invoke-interface {v14}, Landroid/view/MenuItem;->hasSubMenu()Z

    move-result v15

    if-eqz v15, :cond_3

    invoke-interface {v14}, Landroid/view/MenuItem;->getSubMenu()Landroid/view/SubMenu;

    move-result-object v15

    if-ne v1, v15, :cond_3

    goto :goto_3

    :cond_3
    add-int/lit8 v13, v13, 0x1

    goto :goto_2

    :cond_4
    const/4 v14, 0x0

    :goto_3
    if-nez v14, :cond_5

    :goto_4
    goto :goto_8

    :cond_5
    iget-object v11, v4, Lk/g;->a:Ll/u1;

    iget-object v11, v11, Ll/o1;->c:Ll/t1;

    invoke-virtual {v11}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v12

    instance-of v13, v12, Landroid/widget/HeaderViewListAdapter;

    if-eqz v13, :cond_6

    check-cast v12, Landroid/widget/HeaderViewListAdapter;

    invoke-virtual {v12}, Landroid/widget/HeaderViewListAdapter;->getHeadersCount()I

    move-result v13

    invoke-virtual {v12}, Landroid/widget/HeaderViewListAdapter;->getWrappedAdapter()Landroid/widget/ListAdapter;

    move-result-object v12

    check-cast v12, Lk/i;

    goto :goto_5

    :cond_6
    check-cast v12, Lk/i;

    const/4 v13, 0x0

    :goto_5
    invoke-virtual {v12}, Lk/i;->getCount()I

    move-result v15

    const/4 v8, 0x0

    :goto_6
    const/4 v10, -0x1

    if-ge v8, v15, :cond_8

    invoke-virtual {v12, v8}, Lk/i;->b(I)Lk/m;

    move-result-object v9

    if-ne v14, v9, :cond_7

    goto :goto_7

    :cond_7
    add-int/lit8 v8, v8, 0x1

    goto :goto_6

    :cond_8
    move v8, v10

    :goto_7
    if-ne v8, v10, :cond_9

    goto :goto_4

    :cond_9
    add-int/2addr v8, v13

    invoke-virtual {v11}, Landroid/widget/AdapterView;->getFirstVisiblePosition()I

    move-result v9

    sub-int/2addr v8, v9

    if-ltz v8, :cond_c

    invoke-virtual {v11}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v9

    if-lt v8, v9, :cond_a

    goto :goto_8

    :cond_a
    invoke-virtual {v11, v8}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v8

    goto :goto_9

    :cond_b
    const/4 v4, 0x0

    :cond_c
    :goto_8
    const/4 v8, 0x0

    :goto_9
    if-eqz v8, :cond_16

    sget v9, Landroid/os/Build$VERSION;->SDK_INT:I

    iget-object v10, v7, Ll/o1;->C:Ll/y;

    const/16 v11, 0x1c

    if-gt v9, v11, :cond_d

    sget-object v9, Ll/u1;->G:Ljava/lang/reflect/Method;

    if-eqz v9, :cond_e

    :try_start_0
    new-array v11, v6, [Ljava/lang/Object;

    sget-object v12, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/4 v13, 0x0

    aput-object v12, v11, v13

    invoke-virtual {v9, v10, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_a

    :catch_0
    const-string v9, "MenuPopupWindow"

    const-string v10, "Could not invoke setTouchModal() on PopupWindow. Oh well."

    invoke-static {v9, v10}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_a

    :cond_d
    const/4 v9, 0x0

    invoke-static {v10, v9}, Ll/r1;->a(Landroid/widget/PopupWindow;Z)V

    :cond_e
    :goto_a
    iget-object v9, v7, Ll/o1;->C:Ll/y;

    const/4 v10, 0x0

    invoke-static {v9, v10}, Ll/q1;->a(Landroid/widget/PopupWindow;Landroid/transition/Transition;)V

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v9

    sub-int/2addr v9, v6

    invoke-virtual {v2, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lk/g;

    iget-object v9, v9, Lk/g;->a:Ll/u1;

    iget-object v9, v9, Ll/o1;->c:Ll/t1;

    const/4 v10, 0x2

    new-array v10, v10, [I

    invoke-virtual {v9, v10}, Landroid/view/View;->getLocationOnScreen([I)V

    new-instance v11, Landroid/graphics/Rect;

    invoke-direct {v11}, Landroid/graphics/Rect;-><init>()V

    iget-object v12, v0, Lk/h;->w:Landroid/view/View;

    invoke-virtual {v12, v11}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    iget v12, v0, Lk/h;->x:I

    if-ne v12, v6, :cond_10

    const/16 v16, 0x0

    aget v10, v10, v16

    invoke-virtual {v9}, Landroid/view/View;->getWidth()I

    move-result v9

    add-int/2addr v9, v10

    add-int/2addr v9, v5

    iget v10, v11, Landroid/graphics/Rect;->right:I

    if-le v9, v10, :cond_f

    move/from16 v9, v16

    goto :goto_c

    :cond_f
    :goto_b
    move v9, v6

    goto :goto_c

    :cond_10
    const/16 v16, 0x0

    aget v9, v10, v16

    sub-int/2addr v9, v5

    if-gez v9, :cond_11

    goto :goto_b

    :cond_11
    const/4 v9, 0x0

    :goto_c
    if-ne v9, v6, :cond_12

    move v10, v6

    goto :goto_d

    :cond_12
    const/4 v10, 0x0

    :goto_d
    iput v9, v0, Lk/h;->x:I

    iput-object v8, v7, Ll/o1;->s:Landroid/view/View;

    iget v9, v0, Lk/h;->u:I

    const/4 v11, 0x5

    and-int/2addr v9, v11

    if-ne v9, v11, :cond_14

    if-eqz v10, :cond_13

    goto :goto_e

    :cond_13
    invoke-virtual {v8}, Landroid/view/View;->getWidth()I

    move-result v5

    const/4 v8, 0x0

    rsub-int/lit8 v5, v5, 0x0

    goto :goto_e

    :cond_14
    if-eqz v10, :cond_15

    invoke-virtual {v8}, Landroid/view/View;->getWidth()I

    move-result v5

    goto :goto_e

    :cond_15
    rsub-int/lit8 v5, v5, 0x0

    :goto_e
    iput v5, v7, Ll/o1;->e:I

    iput-boolean v6, v7, Ll/o1;->p:Z

    iput-boolean v6, v7, Ll/o1;->o:Z

    const/4 v5, 0x0

    iput v5, v7, Ll/o1;->f:I

    iput-boolean v6, v7, Ll/o1;->n:Z

    goto :goto_10

    :cond_16
    iget-boolean v5, v0, Lk/h;->y:Z

    if-eqz v5, :cond_17

    iget v5, v0, Lk/h;->A:I

    iput v5, v7, Ll/o1;->e:I

    :cond_17
    iget-boolean v5, v0, Lk/h;->z:Z

    if-eqz v5, :cond_18

    iget v5, v0, Lk/h;->B:I

    iput v5, v7, Ll/o1;->f:I

    iput-boolean v6, v7, Ll/o1;->n:Z

    :cond_18
    iget-object v5, v0, Lk/n;->a:Landroid/graphics/Rect;

    if-eqz v5, :cond_19

    new-instance v10, Landroid/graphics/Rect;

    invoke-direct {v10, v5}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    goto :goto_f

    :cond_19
    const/4 v10, 0x0

    :goto_f
    iput-object v10, v7, Ll/o1;->A:Landroid/graphics/Rect;

    :goto_10
    new-instance v5, Lk/g;

    iget v6, v0, Lk/h;->x:I

    invoke-direct {v5, v7, v1, v6}, Lk/g;-><init>(Ll/u1;Lk/l;I)V

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v7}, Ll/o1;->e()V

    iget-object v2, v7, Ll/o1;->c:Ll/t1;

    invoke-virtual {v2, v0}, Landroid/view/View;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    if-nez v4, :cond_1a

    iget-boolean v4, v0, Lk/h;->D:Z

    if-eqz v4, :cond_1a

    iget-object v4, v1, Lk/l;->l:Ljava/lang/CharSequence;

    if-eqz v4, :cond_1a

    const v4, 0x7f0b0012

    const/4 v5, 0x0

    invoke-virtual {v3, v4, v2, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/FrameLayout;

    const v4, 0x1020016

    invoke-virtual {v3, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    invoke-virtual {v3, v5}, Landroid/view/View;->setEnabled(Z)V

    iget-object v1, v1, Lk/l;->l:Ljava/lang/CharSequence;

    invoke-virtual {v4, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 v1, 0x0

    invoke-virtual {v2, v3, v1, v5}, Landroid/widget/ListView;->addHeaderView(Landroid/view/View;Ljava/lang/Object;Z)V

    invoke-virtual {v7}, Ll/o1;->e()V

    :cond_1a
    return-void
.end method
