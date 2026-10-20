.class public final Ly/j1;
.super Ljava/lang/Object;


# static fields
.field public static final u:Ljava/util/WeakHashMap;


# instance fields
.field public final a:Ly/c;

.field public final b:Ly/c;

.field public final c:Ly/c;

.field public final d:Ly/c;

.field public final e:Ly/c;

.field public final f:Ly/c;

.field public final g:Ly/c;

.field public final h:Ly/c;

.field public final i:Ly/c;

.field public final j:Ly/g1;

.field public final k:Ly/g1;

.field public final l:Ly/g1;

.field public final m:Ly/g1;

.field public final n:Ly/g1;

.field public final o:Ly/g1;

.field public final p:Ly/g1;

.field public final q:Ly/g1;

.field public final r:Z

.field public s:I

.field public final t:Ly/g0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    sput-object v0, Ly/j1;->u:Ljava/util/WeakHashMap;

    return-void
.end method

.method public constructor <init>(Landroid/view/View;)V
    .locals 9

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "captionBar"

    const/4 v1, 0x4

    invoke-static {v1, v0}, Ly/c0;->a(ILjava/lang/String;)Ly/c;

    move-result-object v0

    iput-object v0, p0, Ly/j1;->a:Ly/c;

    const/16 v0, 0x80

    const-string v2, "displayCutout"

    invoke-static {v0, v2}, Ly/c0;->a(ILjava/lang/String;)Ly/c;

    move-result-object v0

    iput-object v0, p0, Ly/j1;->b:Ly/c;

    const-string v0, "ime"

    const/16 v2, 0x8

    invoke-static {v2, v0}, Ly/c0;->a(ILjava/lang/String;)Ly/c;

    move-result-object v0

    iput-object v0, p0, Ly/j1;->c:Ly/c;

    const/16 v0, 0x20

    const-string v3, "mandatorySystemGestures"

    invoke-static {v0, v3}, Ly/c0;->a(ILjava/lang/String;)Ly/c;

    move-result-object v0

    iput-object v0, p0, Ly/j1;->d:Ly/c;

    const-string v0, "navigationBars"

    const/4 v3, 0x2

    invoke-static {v3, v0}, Ly/c0;->a(ILjava/lang/String;)Ly/c;

    move-result-object v0

    iput-object v0, p0, Ly/j1;->e:Ly/c;

    const-string v0, "statusBars"

    const/4 v4, 0x1

    invoke-static {v4, v0}, Ly/c0;->a(ILjava/lang/String;)Ly/c;

    move-result-object v0

    iput-object v0, p0, Ly/j1;->f:Ly/c;

    const-string v0, "systemBars"

    const/4 v5, 0x7

    invoke-static {v5, v0}, Ly/c0;->a(ILjava/lang/String;)Ly/c;

    move-result-object v0

    iput-object v0, p0, Ly/j1;->g:Ly/c;

    const/16 v0, 0x10

    const-string v6, "systemGestures"

    invoke-static {v0, v6}, Ly/c0;->a(ILjava/lang/String;)Ly/c;

    move-result-object v0

    iput-object v0, p0, Ly/j1;->h:Ly/c;

    const-string v0, "tappableElement"

    const/16 v6, 0x40

    invoke-static {v6, v0}, Ly/c0;->a(ILjava/lang/String;)Ly/c;

    move-result-object v0

    iput-object v0, p0, Ly/j1;->i:Ly/c;

    new-instance v0, Ly/g1;

    new-instance v7, Ly/k0;

    const/4 v8, 0x0

    invoke-direct {v7, v8, v8, v8, v8}, Ly/k0;-><init>(IIII)V

    const-string v8, "waterfall"

    invoke-direct {v0, v7, v8}, Ly/g1;-><init>(Ly/k0;Ljava/lang/String;)V

    iput-object v0, p0, Ly/j1;->j:Ly/g1;

    const-string v0, "captionBarIgnoringVisibility"

    invoke-static {v1, v0}, Ly/c0;->b(ILjava/lang/String;)Ly/g1;

    move-result-object v0

    iput-object v0, p0, Ly/j1;->k:Ly/g1;

    const-string v0, "navigationBarsIgnoringVisibility"

    invoke-static {v3, v0}, Ly/c0;->b(ILjava/lang/String;)Ly/g1;

    move-result-object v0

    iput-object v0, p0, Ly/j1;->l:Ly/g1;

    const-string v0, "statusBarsIgnoringVisibility"

    invoke-static {v4, v0}, Ly/c0;->b(ILjava/lang/String;)Ly/g1;

    move-result-object v0

    iput-object v0, p0, Ly/j1;->m:Ly/g1;

    const-string v0, "systemBarsIgnoringVisibility"

    invoke-static {v5, v0}, Ly/c0;->b(ILjava/lang/String;)Ly/g1;

    move-result-object v0

    iput-object v0, p0, Ly/j1;->n:Ly/g1;

    const-string v0, "tappableElementIgnoringVisibility"

    invoke-static {v6, v0}, Ly/c0;->b(ILjava/lang/String;)Ly/g1;

    move-result-object v0

    iput-object v0, p0, Ly/j1;->o:Ly/g1;

    const-string v0, "imeAnimationTarget"

    invoke-static {v2, v0}, Ly/c0;->b(ILjava/lang/String;)Ly/g1;

    move-result-object v0

    iput-object v0, p0, Ly/j1;->p:Ly/g1;

    const-string v0, "imeAnimationSource"

    invoke-static {v2, v0}, Ly/c0;->b(ILjava/lang/String;)Ly/g1;

    move-result-object v0

    iput-object v0, p0, Ly/j1;->q:Ly/g1;

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    instance-of v0, p1, Landroid/view/View;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Landroid/view/View;

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    if-eqz p1, :cond_1

    const v0, 0x7f080058

    invoke-virtual {p1, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object p1

    goto :goto_1

    :cond_1
    move-object p1, v1

    :goto_1
    instance-of v0, p1, Ljava/lang/Boolean;

    if-eqz v0, :cond_2

    move-object v1, p1

    check-cast v1, Ljava/lang/Boolean;

    :cond_2
    if-eqz v1, :cond_3

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    :cond_3
    iput-boolean v4, p0, Ly/j1;->r:Z

    new-instance p1, Ly/g0;

    invoke-direct {p1, p0}, Ly/g0;-><init>(Ly/j1;)V

    iput-object p1, p0, Ly/j1;->t:Ly/g0;

    return-void
.end method

.method public static a(Ly/j1;Lb3/u1;)V
    .locals 2

    iget-object v0, p0, Ly/j1;->a:Ly/c;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Ly/c;->f(Lb3/u1;I)V

    iget-object v0, p0, Ly/j1;->c:Ly/c;

    invoke-virtual {v0, p1, v1}, Ly/c;->f(Lb3/u1;I)V

    iget-object v0, p0, Ly/j1;->b:Ly/c;

    invoke-virtual {v0, p1, v1}, Ly/c;->f(Lb3/u1;I)V

    iget-object v0, p0, Ly/j1;->e:Ly/c;

    invoke-virtual {v0, p1, v1}, Ly/c;->f(Lb3/u1;I)V

    iget-object v0, p0, Ly/j1;->f:Ly/c;

    invoke-virtual {v0, p1, v1}, Ly/c;->f(Lb3/u1;I)V

    iget-object v0, p0, Ly/j1;->g:Ly/c;

    invoke-virtual {v0, p1, v1}, Ly/c;->f(Lb3/u1;I)V

    iget-object v0, p0, Ly/j1;->h:Ly/c;

    invoke-virtual {v0, p1, v1}, Ly/c;->f(Lb3/u1;I)V

    iget-object v0, p0, Ly/j1;->i:Ly/c;

    invoke-virtual {v0, p1, v1}, Ly/c;->f(Lb3/u1;I)V

    iget-object v0, p0, Ly/j1;->d:Ly/c;

    invoke-virtual {v0, p1, v1}, Ly/c;->f(Lb3/u1;I)V

    iget-object v0, p1, Lb3/u1;->a:Lb3/r1;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lb3/r1;->g(I)Lu2/c;

    move-result-object v0

    invoke-static {v0}, Landroidx/compose/foundation/layout/a;->s(Lu2/c;)Ly/k0;

    move-result-object v0

    iget-object v1, p0, Ly/j1;->k:Ly/g1;

    invoke-virtual {v1, v0}, Ly/g1;->f(Ly/k0;)V

    iget-object p1, p1, Lb3/u1;->a:Lb3/r1;

    const/4 v0, 0x2

    invoke-virtual {p1, v0}, Lb3/r1;->g(I)Lu2/c;

    move-result-object v0

    invoke-static {v0}, Landroidx/compose/foundation/layout/a;->s(Lu2/c;)Ly/k0;

    move-result-object v0

    iget-object v1, p0, Ly/j1;->l:Ly/g1;

    invoke-virtual {v1, v0}, Ly/g1;->f(Ly/k0;)V

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lb3/r1;->g(I)Lu2/c;

    move-result-object v0

    invoke-static {v0}, Landroidx/compose/foundation/layout/a;->s(Lu2/c;)Ly/k0;

    move-result-object v0

    iget-object v1, p0, Ly/j1;->m:Ly/g1;

    invoke-virtual {v1, v0}, Ly/g1;->f(Ly/k0;)V

    const/4 v0, 0x7

    invoke-virtual {p1, v0}, Lb3/r1;->g(I)Lu2/c;

    move-result-object v0

    invoke-static {v0}, Landroidx/compose/foundation/layout/a;->s(Lu2/c;)Ly/k0;

    move-result-object v0

    iget-object v1, p0, Ly/j1;->n:Ly/g1;

    invoke-virtual {v1, v0}, Ly/g1;->f(Ly/k0;)V

    const/16 v0, 0x40

    invoke-virtual {p1, v0}, Lb3/r1;->g(I)Lu2/c;

    move-result-object v0

    invoke-static {v0}, Landroidx/compose/foundation/layout/a;->s(Lu2/c;)Ly/k0;

    move-result-object v0

    iget-object v1, p0, Ly/j1;->o:Ly/g1;

    invoke-virtual {v1, v0}, Ly/g1;->f(Ly/k0;)V

    invoke-virtual {p1}, Lb3/r1;->e()Lb3/f;

    move-result-object p1

    if-eqz p1, :cond_1

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    iget-object p1, p1, Lb3/f;->a:Landroid/view/DisplayCutout;

    invoke-static {p1}, Lb3/e;->b(Landroid/view/DisplayCutout;)Landroid/graphics/Insets;

    move-result-object p1

    invoke-static {p1}, Lu2/c;->c(Landroid/graphics/Insets;)Lu2/c;

    move-result-object p1

    goto :goto_0

    :cond_0
    sget-object p1, Lu2/c;->e:Lu2/c;

    :goto_0
    invoke-static {p1}, Landroidx/compose/foundation/layout/a;->s(Lu2/c;)Ly/k0;

    move-result-object p1

    iget-object p0, p0, Ly/j1;->j:Ly/g1;

    invoke-virtual {p0, p1}, Ly/g1;->f(Ly/k0;)V

    :cond_1
    invoke-static {}, Lk0/y0;->g()V

    return-void
.end method
