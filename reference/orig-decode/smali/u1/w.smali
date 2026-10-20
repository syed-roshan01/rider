.class public final Lu1/w;
.super Landroid/view/ViewGroup;

# interfaces
.implements Lt1/l1;
.implements Lt1/q1;
.implements Lo1/b0;
.implements Landroidx/lifecycle/g;


# static fields
.field public static C0:Ljava/lang/Class;

.field public static D0:Ljava/lang/reflect/Method;


# instance fields
.field public A:Lc9/c;

.field public A0:Z

.field public final B:Lz0/a;

.field public final B0:Lu1/t;

.field public C:Z

.field public final D:Lu1/l;

.field public final E:Lu1/k;

.field public final F:Lt1/n1;

.field public G:Z

.field public H:Lu1/j1;

.field public I:Lu1/z1;

.field public J:Lm2/a;

.field public K:Z

.field public final L:Lt1/t0;

.field public final M:Lu1/i1;

.field public N:J

.field public final O:[I

.field public final P:[F

.field public final Q:[F

.field public final R:[F

.field public S:J

.field public T:Z

.field public U:J

.field public V:Z

.field public final W:Lm0/n1;

.field public final a:Lu8/j;

.field public final a0:Lm0/j0;

.field public b:J

.field public b0:Lc9/c;

.field public final c:Z

.field public final c0:Lu1/m;

.field public final d:Lt1/i0;

.field public final d0:Lu1/n;

.field public e:Lm2/d;

.field public final e0:Lu1/o;

.field public final f:Lc1/f;

.field public final f0:Lg2/e0;

.field public final g0:Lg2/b0;

.field public final h0:Ljava/util/concurrent/atomic/AtomicReference;

.field public final i0:Lu1/u1;

.field public final j0:Lu1/c2;

.field public final k0:Lm0/n1;

.field public l0:I

.field public final m0:Lm0/n1;

.field public final n:Lu1/y1;

.field public final n0:Lk1/c;

.field public final o:Lu1/h3;

.field public final o0:Ll1/c;

.field public final p:Lk/f;

.field public final p0:Ls1/e;

.field public final q:Landroidx/compose/ui/node/a;

.field public final q0:Lu1/a1;

.field public final r:Lu1/w;

.field public r0:Landroid/view/MotionEvent;

.field public final s:Ly1/p;

.field public s0:J

.field public final t:Lu1/p0;

.field public final t0:Lu1/f3;

.field public final u:Lz0/f;

.field public final u0:Lo0/i;

.field public final v:Ljava/util/ArrayList;

.field public final v0:Lh/a;

.field public w:Ljava/util/ArrayList;

.field public final w0:Landroidx/activity/d;

.field public x:Z

.field public x0:Z

.field public final y:Lo1/g;

.field public final y0:Lu1/u;

.field public final z:Lo1/y;

.field public final z0:Lu1/l1;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lu8/j;)V
    .locals 12

    invoke-direct {p0, p1}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lu1/w;->a:Lu8/j;

    sget-wide v0, Ld1/c;->d:J

    iput-wide v0, p0, Lu1/w;->b:J

    const/4 p2, 0x1

    iput-boolean p2, p0, Lu1/w;->c:Z

    new-instance v0, Lt1/i0;

    invoke-direct {v0}, Lt1/i0;-><init>()V

    iput-object v0, p0, Lu1/w;->d:Lt1/i0;

    invoke-static {p1}, Lo1/s;->c(Landroid/content/Context;)Lm2/d;

    move-result-object v0

    iput-object v0, p0, Lu1/w;->e:Lm2/d;

    sget-object v0, Landroidx/compose/ui/semantics/EmptySemanticsElement;->b:Landroidx/compose/ui/semantics/EmptySemanticsElement;

    new-instance v1, Lc1/f;

    new-instance v2, Lu1/r;

    invoke-direct {v2, p0, p2}, Lu1/r;-><init>(Lu1/w;I)V

    invoke-direct {v1, v2}, Lc1/f;-><init>(Lu1/r;)V

    iput-object v1, p0, Lu1/w;->f:Lc1/f;

    new-instance v1, Lu1/y1;

    invoke-direct {v1}, Lu1/y1;-><init>()V

    iput-object v1, p0, Lu1/w;->n:Lu1/y1;

    new-instance v2, Lu1/h3;

    invoke-direct {v2}, Lu1/h3;-><init>()V

    iput-object v2, p0, Lu1/w;->o:Lu1/h3;

    new-instance v2, Lu1/r;

    const/4 v3, 0x2

    invoke-direct {v2, p0, v3}, Lu1/r;-><init>(Lu1/w;I)V

    invoke-static {v2}, Landroidx/compose/ui/input/key/a;->c(Lc9/c;)Ly0/o;

    move-result-object v2

    invoke-static {}, Landroidx/compose/ui/input/rotary/a;->a()Ly0/o;

    move-result-object v4

    new-instance v5, Lk/f;

    const/4 v6, 0x6

    invoke-direct {v5, v6}, Lk/f;-><init>(I)V

    iput-object v5, p0, Lu1/w;->p:Lk/f;

    new-instance v5, Landroidx/compose/ui/node/a;

    const/4 v6, 0x0

    const/4 v7, 0x3

    invoke-direct {v5, v6, v7}, Landroidx/compose/ui/node/a;-><init>(ZI)V

    sget-object v8, Lr1/c1;->b:Lr1/c1;

    invoke-virtual {v5, v8}, Landroidx/compose/ui/node/a;->W(Lr1/j0;)V

    invoke-virtual {p0}, Lu1/w;->getDensity()Lm2/b;

    move-result-object v8

    invoke-virtual {v5, v8}, Landroidx/compose/ui/node/a;->U(Lm2/b;)V

    invoke-interface {v0, v4}, Ly0/o;->j(Ly0/o;)Ly0/o;

    move-result-object v0

    invoke-virtual {p0}, Lu1/w;->getFocusOwner()Lc1/e;

    move-result-object v4

    check-cast v4, Lc1/f;

    iget-object v4, v4, Lc1/f;->d:Landroidx/compose/ui/focus/FocusOwnerImpl$modifier$1;

    invoke-interface {v0, v4}, Ly0/o;->j(Ly0/o;)Ly0/o;

    move-result-object v0

    invoke-interface {v0, v2}, Ly0/o;->j(Ly0/o;)Ly0/o;

    move-result-object v0

    iget-object v2, v1, Lu1/y1;->c:Landroidx/compose/ui/platform/DragAndDropModifierOnDragListener$modifier$1;

    invoke-interface {v0, v2}, Ly0/o;->j(Ly0/o;)Ly0/o;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroidx/compose/ui/node/a;->X(Ly0/o;)V

    iput-object v5, p0, Lu1/w;->q:Landroidx/compose/ui/node/a;

    iput-object p0, p0, Lu1/w;->r:Lu1/w;

    new-instance v0, Ly1/p;

    invoke-virtual {p0}, Lu1/w;->getRoot()Landroidx/compose/ui/node/a;

    move-result-object v2

    invoke-direct {v0, v2}, Ly1/p;-><init>(Landroidx/compose/ui/node/a;)V

    iput-object v0, p0, Lu1/w;->s:Ly1/p;

    new-instance v0, Lu1/p0;

    invoke-direct {v0, p0}, Lu1/p0;-><init>(Lu1/w;)V

    iput-object v0, p0, Lu1/w;->t:Lu1/p0;

    new-instance v2, Lz0/f;

    invoke-direct {v2}, Lz0/f;-><init>()V

    iput-object v2, p0, Lu1/w;->u:Lz0/f;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, p0, Lu1/w;->v:Ljava/util/ArrayList;

    new-instance v2, Lo1/g;

    invoke-direct {v2}, Lo1/g;-><init>()V

    iput-object v2, p0, Lu1/w;->y:Lo1/g;

    new-instance v2, Lo1/y;

    invoke-virtual {p0}, Lu1/w;->getRoot()Landroidx/compose/ui/node/a;

    move-result-object v4

    invoke-direct {v2, v4}, Lo1/y;-><init>(Landroidx/compose/ui/node/a;)V

    iput-object v2, p0, Lu1/w;->z:Lo1/y;

    sget-object v2, Lu1/s;->b:Lu1/s;

    iput-object v2, p0, Lu1/w;->A:Lc9/c;

    new-instance v2, Lz0/a;

    invoke-virtual {p0}, Lu1/w;->getAutofillTree()Lz0/f;

    move-result-object v4

    invoke-direct {v2, p0, v4}, Lz0/a;-><init>(Landroid/view/View;Lz0/f;)V

    iput-object v2, p0, Lu1/w;->B:Lz0/a;

    new-instance v2, Lu1/l;

    invoke-direct {v2, p1}, Lu1/l;-><init>(Landroid/content/Context;)V

    iput-object v2, p0, Lu1/w;->D:Lu1/l;

    new-instance v2, Lu1/k;

    invoke-direct {v2, p1}, Lu1/k;-><init>(Landroid/content/Context;)V

    iput-object v2, p0, Lu1/w;->E:Lu1/k;

    new-instance v2, Lt1/n1;

    new-instance v4, Lu1/r;

    invoke-direct {v4, p0, v7}, Lu1/r;-><init>(Lu1/w;I)V

    invoke-direct {v2, v4}, Lt1/n1;-><init>(Lu1/r;)V

    iput-object v2, p0, Lu1/w;->F:Lt1/n1;

    new-instance v2, Lt1/t0;

    invoke-virtual {p0}, Lu1/w;->getRoot()Landroidx/compose/ui/node/a;

    move-result-object v4

    invoke-direct {v2, v4}, Lt1/t0;-><init>(Landroidx/compose/ui/node/a;)V

    iput-object v2, p0, Lu1/w;->L:Lt1/t0;

    new-instance v2, Lu1/i1;

    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v4

    invoke-direct {v2, v4}, Lu1/i1;-><init>(Landroid/view/ViewConfiguration;)V

    iput-object v2, p0, Lu1/w;->M:Lu1/i1;

    const v2, 0x7fffffff

    invoke-static {v2, v2}, Li1/b;->c(II)J

    move-result-wide v4

    iput-wide v4, p0, Lu1/w;->N:J

    filled-new-array {v6, v6}, [I

    move-result-object v2

    iput-object v2, p0, Lu1/w;->O:[I

    const/16 v2, 0x10

    new-array v4, v2, [F

    fill-array-data v4, :array_0

    iput-object v4, p0, Lu1/w;->P:[F

    new-array v5, v2, [F

    fill-array-data v5, :array_1

    iput-object v5, p0, Lu1/w;->Q:[F

    new-array v5, v2, [F

    fill-array-data v5, :array_2

    iput-object v5, p0, Lu1/w;->R:[F

    const-wide/16 v8, -0x1

    iput-wide v8, p0, Lu1/w;->S:J

    sget-wide v8, Ld1/c;->c:J

    iput-wide v8, p0, Lu1/w;->U:J

    iput-boolean p2, p0, Lu1/w;->V:Z

    sget-object v5, Lm0/o3;->a:Lm0/o3;

    const/4 v8, 0x0

    invoke-static {v8, v5}, Ld7/t;->g0(Ljava/lang/Object;Lm0/z2;)Lm0/n1;

    move-result-object v9

    iput-object v9, p0, Lu1/w;->W:Lm0/n1;

    new-instance v9, Lu1/u;

    invoke-direct {v9, p0, p2}, Lu1/u;-><init>(Lu1/w;I)V

    invoke-static {v9}, Ld7/t;->R(Lc9/a;)Lm0/j0;

    move-result-object v9

    iput-object v9, p0, Lu1/w;->a0:Lm0/j0;

    new-instance v9, Lu1/m;

    invoke-direct {v9, p0}, Lu1/m;-><init>(Lu1/w;)V

    iput-object v9, p0, Lu1/w;->c0:Lu1/m;

    new-instance v9, Lu1/n;

    invoke-direct {v9, p0}, Lu1/n;-><init>(Lu1/w;)V

    iput-object v9, p0, Lu1/w;->d0:Lu1/n;

    new-instance v9, Lu1/o;

    invoke-direct {v9, p0}, Lu1/o;-><init>(Lu1/w;)V

    iput-object v9, p0, Lu1/w;->e0:Lu1/o;

    new-instance v9, Lg2/e0;

    invoke-virtual {p0}, Lu1/w;->getView()Landroid/view/View;

    move-result-object v10

    invoke-direct {v9, v10, p0}, Lg2/e0;-><init>(Landroid/view/View;Lo1/b0;)V

    iput-object v9, p0, Lu1/w;->f0:Lg2/e0;

    new-instance v10, Lg2/b0;

    sget-object v11, Lu1/s;->n:Lu1/s;

    invoke-virtual {v11, v9}, Lu1/s;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lg2/v;

    invoke-direct {v10, v9}, Lg2/b0;-><init>(Lg2/v;)V

    iput-object v10, p0, Lu1/w;->g0:Lg2/b0;

    new-instance v9, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v9, v8}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object v9, p0, Lu1/w;->h0:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v8, Lu1/u1;

    invoke-virtual {p0}, Lu1/w;->getTextInputService()Lg2/b0;

    move-result-object v9

    invoke-direct {v8, v9}, Lu1/u1;-><init>(Lg2/b0;)V

    iput-object v8, p0, Lu1/w;->i0:Lu1/u1;

    new-instance v8, Lu1/c2;

    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    iput-object v8, p0, Lu1/w;->j0:Lu1/c2;

    invoke-static {p1}, Li1/b;->l(Landroid/content/Context;)Lf2/f;

    move-result-object v8

    sget-object v9, Lm0/h2;->a:Lm0/h2;

    invoke-static {v8, v9}, Ld7/t;->g0(Ljava/lang/Object;Lm0/z2;)Lm0/n1;

    move-result-object v8

    iput-object v8, p0, Lu1/w;->k0:Lm0/n1;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v8

    invoke-virtual {v8}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v8

    sget v9, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v10, 0x1f

    if-lt v9, v10, :cond_0

    invoke-static {v8}, Lb2/s;->a(Landroid/content/res/Configuration;)I

    move-result v8

    goto :goto_0

    :cond_0
    move v8, v6

    :goto_0
    iput v8, p0, Lu1/w;->l0:I

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Configuration;->getLayoutDirection()I

    move-result p1

    sget-object v8, Lm2/l;->a:Lm2/l;

    if-eqz p1, :cond_2

    if-eq p1, p2, :cond_1

    goto :goto_1

    :cond_1
    sget-object v8, Lm2/l;->b:Lm2/l;

    :cond_2
    :goto_1
    invoke-static {v8, v5}, Ld7/t;->g0(Ljava/lang/Object;Lm0/z2;)Lm0/n1;

    move-result-object p1

    iput-object p1, p0, Lu1/w;->m0:Lm0/n1;

    new-instance p1, Lk1/c;

    invoke-direct {p1, p0}, Lk1/c;-><init>(Landroid/view/View;)V

    iput-object p1, p0, Lu1/w;->n0:Lk1/c;

    new-instance p1, Ll1/c;

    invoke-virtual {p0}, Landroid/view/View;->isInTouchMode()Z

    move-result v5

    if-eqz v5, :cond_3

    move v3, p2

    :cond_3
    invoke-direct {p1, v3}, Ll1/c;-><init>(I)V

    iput-object p1, p0, Lu1/w;->o0:Ll1/c;

    new-instance p1, Ls1/e;

    invoke-direct {p1, p0}, Ls1/e;-><init>(Lt1/l1;)V

    iput-object p1, p0, Lu1/w;->p0:Ls1/e;

    new-instance p1, Lu1/a1;

    invoke-direct {p1, p0}, Lu1/a1;-><init>(Landroid/view/View;)V

    iput-object p1, p0, Lu1/w;->q0:Lu1/a1;

    new-instance p1, Lu1/f3;

    invoke-direct {p1}, Lu1/f3;-><init>()V

    iput-object p1, p0, Lu1/w;->t0:Lu1/f3;

    new-instance p1, Lo0/i;

    new-array v2, v2, [Lc9/a;

    invoke-direct {p1, v2}, Lo0/i;-><init>([Ljava/lang/Object;)V

    iput-object p1, p0, Lu1/w;->u0:Lo0/i;

    new-instance p1, Lh/a;

    invoke-direct {p1, p0, v7}, Lh/a;-><init>(Ljava/lang/Object;I)V

    iput-object p1, p0, Lu1/w;->v0:Lh/a;

    new-instance p1, Landroidx/activity/d;

    const/4 v2, 0x5

    invoke-direct {p1, p0, v2}, Landroidx/activity/d;-><init>(Ljava/lang/Object;I)V

    iput-object p1, p0, Lu1/w;->w0:Landroidx/activity/d;

    new-instance p1, Lu1/u;

    invoke-direct {p1, p0, v6}, Lu1/u;-><init>(Lu1/w;I)V

    iput-object p1, p0, Lu1/w;->y0:Lu1/u;

    const/16 p1, 0x1d

    if-lt v9, p1, :cond_4

    new-instance v2, Lu1/o1;

    invoke-direct {v2}, Lu1/o1;-><init>()V

    goto :goto_2

    :cond_4
    new-instance v2, Lu1/m1;

    invoke-direct {v2, v4}, Lu1/m1;-><init>([F)V

    :goto_2
    iput-object v2, p0, Lu1/w;->z0:Lu1/l1;

    invoke-virtual {p0, v6}, Landroid/view/View;->setWillNotDraw(Z)V

    invoke-virtual {p0, p2}, Landroid/view/View;->setFocusable(Z)V

    sget-object v2, Lu1/v0;->a:Lu1/v0;

    invoke-virtual {v2, p0, p2, v6}, Lu1/v0;->a(Landroid/view/View;IZ)V

    invoke-virtual {p0, p2}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    invoke-virtual {p0, v6}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    invoke-static {p0, v0}, Lb3/q0;->d(Landroid/view/View;Lb3/c;)V

    invoke-virtual {p0, v1}, Landroid/view/View;->setOnDragListener(Landroid/view/View$OnDragListener;)V

    invoke-virtual {p0}, Lu1/w;->getRoot()Landroidx/compose/ui/node/a;

    move-result-object p2

    invoke-virtual {p2, p0}, Landroidx/compose/ui/node/a;->d(Lt1/l1;)V

    if-lt v9, p1, :cond_5

    sget-object p1, Lu1/s0;->a:Lu1/s0;

    invoke-virtual {p1, p0}, Lu1/s0;->a(Landroid/view/View;)V

    :cond_5
    new-instance p1, Lu1/t;

    invoke-direct {p1, p0}, Lu1/t;-><init>(Lu1/w;)V

    iput-object p1, p0, Lu1/w;->B0:Lu1/t;

    return-void

    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x0
        0x0
        0x0
        0x0
        0x3f800000    # 1.0f
        0x0
        0x0
        0x0
        0x0
        0x3f800000    # 1.0f
        0x0
        0x0
        0x0
        0x0
        0x3f800000    # 1.0f
    .end array-data

    :array_1
    .array-data 4
        0x3f800000    # 1.0f
        0x0
        0x0
        0x0
        0x0
        0x3f800000    # 1.0f
        0x0
        0x0
        0x0
        0x0
        0x3f800000    # 1.0f
        0x0
        0x0
        0x0
        0x0
        0x3f800000    # 1.0f
    .end array-data

    :array_2
    .array-data 4
        0x3f800000    # 1.0f
        0x0
        0x0
        0x0
        0x0
        0x3f800000    # 1.0f
        0x0
        0x0
        0x0
        0x0
        0x3f800000    # 1.0f
        0x0
        0x0
        0x0
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public static final synthetic e(Lu1/w;)Lu1/q;
    .locals 0

    invoke-direct {p0}, Lu1/w;->get_viewTreeOwners()Lu1/q;

    move-result-object p0

    return-object p0
.end method

.method public static g(Landroid/view/ViewGroup;)V
    .locals 4

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    instance-of v3, v2, Lu1/w;

    if-eqz v3, :cond_0

    check-cast v2, Lu1/w;

    invoke-virtual {v2}, Lu1/w;->u()V

    goto :goto_1

    :cond_0
    instance-of v3, v2, Landroid/view/ViewGroup;

    if-eqz v3, :cond_1

    check-cast v2, Landroid/view/ViewGroup;

    invoke-static {v2}, Lu1/w;->g(Landroid/view/ViewGroup;)V

    :cond_1
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public static synthetic getFontLoader$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getLastMatrixRecalculationAnimationTime$ui_release$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getShowLayoutBounds$annotations()V
    .locals 0

    return-void
.end method

.method private final get_viewTreeOwners()Lu1/q;
    .locals 1

    iget-object v0, p0, Lu1/w;->W:Lm0/n1;

    invoke-virtual {v0}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu1/q;

    return-object v0
.end method

.method public static h(I)J
    .locals 4

    invoke-static {p0}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    invoke-static {p0}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p0

    const/16 v1, 0x20

    const/high16 v2, -0x80000000

    const/4 v3, 0x0

    if-eq v0, v2, :cond_2

    if-eqz v0, :cond_1

    const/high16 v2, 0x40000000    # 2.0f

    if-ne v0, v2, :cond_0

    int-to-long v2, p0

    shl-long v0, v2, v1

    :goto_0
    or-long/2addr v0, v2

    goto :goto_2

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0}, Ljava/lang/IllegalStateException;-><init>()V

    throw p0

    :cond_1
    int-to-long v2, v3

    shl-long v0, v2, v1

    const p0, 0x7fffffff

    :goto_1
    int-to-long v2, p0

    goto :goto_0

    :cond_2
    int-to-long v2, v3

    shl-long v0, v2, v1

    goto :goto_1

    :goto_2
    return-wide v0
.end method

.method public static i(Landroid/view/View;I)Landroid/view/View;
    .locals 4

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-ge v0, v1, :cond_2

    const/4 v0, 0x0

    new-array v1, v0, [Ljava/lang/Class;

    const-class v2, Landroid/view/View;

    const-string v3, "getAccessibilityViewId"

    invoke-virtual {v2, v3, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    new-array v2, v0, [Ljava/lang/Object;

    invoke-virtual {v1, p0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v1, v2}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-object p0

    :cond_0
    instance-of v1, p0, Landroid/view/ViewGroup;

    if-eqz v1, :cond_2

    check-cast p0, Landroid/view/ViewGroup;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    :goto_0
    if-ge v0, v1, :cond_2

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-static {v2, p1}, Lu1/w;->i(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    if-eqz v2, :cond_1

    return-object v2

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    const/4 p0, 0x0

    return-object p0
.end method

.method public static l(Landroidx/compose/ui/node/a;)V
    .locals 3

    invoke-virtual {p0}, Landroidx/compose/ui/node/a;->y()V

    invoke-virtual {p0}, Landroidx/compose/ui/node/a;->t()Lo0/i;

    move-result-object p0

    iget v0, p0, Lo0/i;->c:I

    if-lez v0, :cond_1

    iget-object p0, p0, Lo0/i;->a:[Ljava/lang/Object;

    const/4 v1, 0x0

    :cond_0
    aget-object v2, p0, v1

    check-cast v2, Landroidx/compose/ui/node/a;

    invoke-static {v2}, Lu1/w;->l(Landroidx/compose/ui/node/a;)V

    add-int/lit8 v1, v1, 0x1

    if-lt v1, v0, :cond_0

    :cond_1
    return-void
.end method

.method public static n(Landroid/view/MotionEvent;)Z
    .locals 6

    invoke-virtual {p0}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->isInfinite(F)Z

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-nez v1, :cond_0

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->isInfinite(F)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroid/view/MotionEvent;->getRawX()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->isInfinite(F)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroid/view/MotionEvent;->getRawY()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->isInfinite(F)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v3

    :goto_0
    if-nez v0, :cond_3

    invoke-virtual {p0}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v1

    move v4, v3

    :goto_1
    if-ge v4, v1, :cond_3

    invoke-virtual {p0, v4}, Landroid/view/MotionEvent;->getX(I)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->isInfinite(F)Z

    move-result v5

    if-nez v5, :cond_2

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p0, v4}, Landroid/view/MotionEvent;->getY(I)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->isInfinite(F)Z

    move-result v5

    if-nez v5, :cond_2

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x1d

    if-lt v0, v5, :cond_1

    sget-object v0, Lu1/i2;->a:Lu1/i2;

    invoke-virtual {v0, p0, v4}, Lu1/i2;->a(Landroid/view/MotionEvent;I)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_2

    :cond_1
    move v0, v2

    goto :goto_3

    :cond_2
    :goto_2
    move v0, v3

    :goto_3
    if-nez v0, :cond_3

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_3
    return v0
.end method

.method private setFontFamilyResolver(Lf2/d;)V
    .locals 1

    iget-object v0, p0, Lu1/w;->k0:Lm0/n1;

    invoke-virtual {v0, p1}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private setLayoutDirection(Lm2/l;)V
    .locals 1

    iget-object v0, p0, Lu1/w;->m0:Lm0/n1;

    invoke-virtual {v0, p1}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private final set_viewTreeOwners(Lu1/q;)V
    .locals 1

    iget-object v0, p0, Lu1/w;->W:Lm0/n1;

    invoke-virtual {v0, p1}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final A(J)J
    .locals 3

    invoke-virtual {p0}, Lu1/w;->y()V

    invoke-static {p1, p2}, Ld1/c;->d(J)F

    move-result v0

    iget-wide v1, p0, Lu1/w;->U:J

    invoke-static {v1, v2}, Ld1/c;->d(J)F

    move-result v1

    sub-float/2addr v0, v1

    invoke-static {p1, p2}, Ld1/c;->e(J)F

    move-result p1

    iget-wide v1, p0, Lu1/w;->U:J

    invoke-static {v1, v2}, Ld1/c;->e(J)F

    move-result p2

    sub-float/2addr p1, p2

    iget-object p2, p0, Lu1/w;->R:[F

    invoke-static {v0, p1}, Ld9/i;->f(FF)J

    move-result-wide v0

    invoke-static {p2, v0, v1}, Le1/a0;->a([FJ)J

    move-result-wide p1

    return-wide p1
.end method

.method public final B(Landroid/view/MotionEvent;)I
    .locals 7

    iget-boolean v0, p0, Lu1/w;->A0:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iput-boolean v1, p0, Lu1/w;->A0:Z

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getMetaState()I

    move-result v0

    iget-object v2, p0, Lu1/w;->o:Lu1/h3;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, Lo1/a0;

    invoke-direct {v2, v0}, Lo1/a0;-><init>(I)V

    sget-object v0, Lu1/h3;->b:Lm0/n1;

    invoke-virtual {v0, v2}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    :cond_0
    iget-object v0, p0, Lu1/w;->y:Lo1/g;

    invoke-virtual {v0, p1, p0}, Lo1/g;->a(Landroid/view/MotionEvent;Lo1/b0;)Lo1/w;

    move-result-object v2

    iget-object v3, p0, Lu1/w;->z:Lo1/y;

    if-eqz v2, :cond_7

    iget-object v1, v2, Lo1/w;->a:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v4

    add-int/lit8 v4, v4, -0x1

    if-ltz v4, :cond_3

    :goto_0
    add-int/lit8 v5, v4, -0x1

    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    move-object v6, v4

    check-cast v6, Lo1/x;

    iget-boolean v6, v6, Lo1/x;->e:Z

    if-eqz v6, :cond_1

    goto :goto_2

    :cond_1
    if-gez v5, :cond_2

    goto :goto_1

    :cond_2
    move v4, v5

    goto :goto_0

    :cond_3
    :goto_1
    const/4 v4, 0x0

    :goto_2
    check-cast v4, Lo1/x;

    if-eqz v4, :cond_4

    iget-wide v4, v4, Lo1/x;->d:J

    iput-wide v4, p0, Lu1/w;->b:J

    :cond_4
    invoke-virtual {p0, p1}, Lu1/w;->o(Landroid/view/MotionEvent;)Z

    move-result v1

    invoke-virtual {v3, v2, p0, v1}, Lo1/y;->a(Lo1/w;Lo1/b0;Z)I

    move-result v1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v2

    if-eqz v2, :cond_5

    const/4 v3, 0x5

    if-ne v2, v3, :cond_8

    :cond_5
    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_6

    goto :goto_3

    :cond_6
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v2

    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result p1

    iget-object v2, v0, Lo1/g;->c:Landroid/util/SparseBooleanArray;

    invoke-virtual {v2, p1}, Landroid/util/SparseBooleanArray;->delete(I)V

    iget-object v0, v0, Lo1/g;->b:Landroid/util/SparseLongArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseLongArray;->delete(I)V

    goto :goto_3

    :cond_7
    invoke-virtual {v3}, Lo1/y;->b()V

    :cond_8
    :goto_3
    return v1
.end method

.method public final C(Landroid/view/MotionEvent;IJZ)V
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v5, p2

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v2

    const/4 v3, -0x1

    const/4 v4, 0x0

    const/4 v15, 0x1

    if-eq v2, v15, :cond_1

    const/4 v6, 0x6

    if-eq v2, v6, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v3

    goto :goto_0

    :cond_1
    const/16 v2, 0x9

    if-eq v5, v2, :cond_2

    const/16 v2, 0xa

    if-eq v5, v2, :cond_2

    move v3, v4

    :cond_2
    :goto_0
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v2

    if-ltz v3, :cond_3

    move v6, v15

    goto :goto_1

    :cond_3
    move v6, v4

    :goto_1
    sub-int v6, v2, v6

    if-nez v6, :cond_4

    return-void

    :cond_4
    new-array v7, v6, [Landroid/view/MotionEvent$PointerProperties;

    move v2, v4

    :goto_2
    if-ge v2, v6, :cond_5

    new-instance v8, Landroid/view/MotionEvent$PointerProperties;

    invoke-direct {v8}, Landroid/view/MotionEvent$PointerProperties;-><init>()V

    aput-object v8, v7, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_5
    new-array v8, v6, [Landroid/view/MotionEvent$PointerCoords;

    move v2, v4

    :goto_3
    if-ge v2, v6, :cond_6

    new-instance v9, Landroid/view/MotionEvent$PointerCoords;

    invoke-direct {v9}, Landroid/view/MotionEvent$PointerCoords;-><init>()V

    aput-object v9, v8, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_6
    move v2, v4

    :goto_4
    if-ge v2, v6, :cond_9

    if-ltz v3, :cond_8

    if-ge v2, v3, :cond_7

    goto :goto_5

    :cond_7
    move v9, v15

    goto :goto_6

    :cond_8
    :goto_5
    move v9, v4

    :goto_6
    add-int/2addr v9, v2

    aget-object v10, v7, v2

    invoke-virtual {v1, v9, v10}, Landroid/view/MotionEvent;->getPointerProperties(ILandroid/view/MotionEvent$PointerProperties;)V

    aget-object v10, v8, v2

    invoke-virtual {v1, v9, v10}, Landroid/view/MotionEvent;->getPointerCoords(ILandroid/view/MotionEvent$PointerCoords;)V

    iget v9, v10, Landroid/view/MotionEvent$PointerCoords;->x:F

    iget v11, v10, Landroid/view/MotionEvent$PointerCoords;->y:F

    invoke-static {v9, v11}, Ld9/i;->f(FF)J

    move-result-wide v11

    invoke-virtual {v0, v11, v12}, Lu1/w;->q(J)J

    move-result-wide v11

    invoke-static {v11, v12}, Ld1/c;->d(J)F

    move-result v9

    iput v9, v10, Landroid/view/MotionEvent$PointerCoords;->x:F

    invoke-static {v11, v12}, Ld1/c;->e(J)F

    move-result v9

    iput v9, v10, Landroid/view/MotionEvent$PointerCoords;->y:F

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_9
    if-eqz p5, :cond_a

    move v10, v4

    goto :goto_7

    :cond_a
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getButtonState()I

    move-result v2

    move v10, v2

    :goto_7
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getDownTime()J

    move-result-wide v2

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getEventTime()J

    move-result-wide v11

    cmp-long v2, v2, v11

    if-nez v2, :cond_b

    move-wide/from16 v2, p3

    goto :goto_8

    :cond_b
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getDownTime()J

    move-result-wide v2

    :goto_8
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getMetaState()I

    move-result v9

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getXPrecision()F

    move-result v11

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getYPrecision()F

    move-result v12

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getDeviceId()I

    move-result v13

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getEdgeFlags()I

    move-result v14

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getSource()I

    move-result v16

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getFlags()I

    move-result v17

    move-wide v1, v2

    move-wide/from16 v3, p3

    move/from16 v5, p2

    move/from16 v15, v16

    move/from16 v16, v17

    invoke-static/range {v1 .. v16}, Landroid/view/MotionEvent;->obtain(JJII[Landroid/view/MotionEvent$PointerProperties;[Landroid/view/MotionEvent$PointerCoords;IIFFIIII)Landroid/view/MotionEvent;

    move-result-object v1

    iget-object v2, v0, Lu1/w;->y:Lo1/g;

    invoke-virtual {v2, v1, v0}, Lo1/g;->a(Landroid/view/MotionEvent;Lo1/b0;)Lo1/w;

    move-result-object v2

    invoke-static {v2}, Ld7/a;->j(Ljava/lang/Object;)V

    iget-object v3, v0, Lu1/w;->z:Lo1/y;

    const/4 v4, 0x1

    invoke-virtual {v3, v2, v0, v4}, Lo1/y;->a(Lo1/w;Lo1/b0;Z)I

    invoke-virtual {v1}, Landroid/view/MotionEvent;->recycle()V

    return-void
.end method

.method public final D()V
    .locals 8

    iget-object v0, p0, Lu1/w;->O:[I

    invoke-virtual {p0, v0}, Landroid/view/View;->getLocationOnScreen([I)V

    iget-wide v1, p0, Lu1/w;->N:J

    sget v3, Lm2/i;->c:I

    const/16 v3, 0x20

    shr-long v3, v1, v3

    long-to-int v3, v3

    const-wide v4, 0xffffffffL

    and-long/2addr v1, v4

    long-to-int v1, v1

    const/4 v2, 0x0

    aget v4, v0, v2

    const/4 v5, 0x1

    if-ne v3, v4, :cond_0

    aget v6, v0, v5

    if-eq v1, v6, :cond_1

    :cond_0
    aget v0, v0, v5

    invoke-static {v4, v0}, Li1/b;->c(II)J

    move-result-wide v6

    iput-wide v6, p0, Lu1/w;->N:J

    const v0, 0x7fffffff

    if-eq v3, v0, :cond_1

    if-eq v1, v0, :cond_1

    invoke-virtual {p0}, Lu1/w;->getRoot()Landroidx/compose/ui/node/a;

    move-result-object v0

    iget-object v0, v0, Landroidx/compose/ui/node/a;->D:Lt1/n0;

    iget-object v0, v0, Lt1/n0;->o:Lt1/l0;

    invoke-virtual {v0}, Lt1/l0;->s0()V

    move v2, v5

    :cond_1
    iget-object v0, p0, Lu1/w;->L:Lt1/t0;

    invoke-virtual {v0, v2}, Lt1/t0;->a(Z)V

    return-void
.end method

.method public final autofill(Landroid/util/SparseArray;)V
    .locals 7

    iget-object v0, p0, Lu1/w;->B:Lz0/a;

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_4

    invoke-virtual {p1, v2}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v3

    invoke-virtual {p1, v3}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/view/autofill/AutofillValue;

    sget-object v5, Lz0/d;->a:Lz0/d;

    invoke-virtual {v5, v4}, Lz0/d;->d(Landroid/view/autofill/AutofillValue;)Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-virtual {v5, v4}, Lz0/d;->i(Landroid/view/autofill/AutofillValue;)Ljava/lang/CharSequence;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    iget-object v4, v0, Lz0/a;->b:Lz0/f;

    iget-object v4, v4, Lz0/f;->a:Ljava/util/LinkedHashMap;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, La7/a;->w(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    invoke-virtual {v5, v4}, Lz0/d;->b(Landroid/view/autofill/AutofillValue;)Z

    move-result v3

    if-nez v3, :cond_3

    invoke-virtual {v5, v4}, Lz0/d;->c(Landroid/view/autofill/AutofillValue;)Z

    move-result v3

    if-nez v3, :cond_2

    invoke-virtual {v5, v4}, Lz0/d;->e(Landroid/view/autofill/AutofillValue;)Z

    move-result v3

    if-nez v3, :cond_1

    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    new-instance p1, Lq8/e;

    const-string v0, "An operation is not implemented: b/138604541:  Add onFill() callback for toggle"

    invoke-direct {p1, v0}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Lq8/e;

    const-string v0, "An operation is not implemented: b/138604541: Add onFill() callback for list"

    invoke-direct {p1, v0}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Lq8/e;

    const-string v0, "An operation is not implemented: b/138604541: Add onFill() callback for date"

    invoke-direct {p1, v0}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    return-void
.end method

.method public final b(Landroidx/lifecycle/w;)V
    .locals 0

    invoke-static {}, Lk1/b;->a()Z

    move-result p1

    invoke-virtual {p0, p1}, Lu1/w;->setShowLayoutBounds(Z)V

    return-void
.end method

.method public final canScrollHorizontally(I)Z
    .locals 4

    const/4 v0, 0x0

    iget-wide v1, p0, Lu1/w;->b:J

    iget-object v3, p0, Lu1/w;->t:Lu1/p0;

    invoke-virtual {v3, p1, v1, v2, v0}, Lu1/p0;->l(IJZ)Z

    move-result p1

    return p1
.end method

.method public final canScrollVertically(I)Z
    .locals 4

    const/4 v0, 0x1

    iget-wide v1, p0, Lu1/w;->b:J

    iget-object v3, p0, Lu1/w;->t:Lu1/p0;

    invoke-virtual {v3, p1, v1, v2, v0}, Lu1/p0;->l(IJZ)Z

    move-result p1

    return p1
.end method

.method public final dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 5

    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lu1/w;->getRoot()Landroidx/compose/ui/node/a;

    move-result-object v0

    invoke-static {v0}, Lu1/w;->l(Landroidx/compose/ui/node/a;)V

    :cond_0
    invoke-static {p0}, Lt1/l1;->a(Lt1/l1;)V

    invoke-static {}, Lk0/y0;->g()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lu1/w;->x:Z

    iget-object v1, p0, Lu1/w;->p:Lk/f;

    iget-object v2, v1, Lk/f;->b:Ljava/lang/Object;

    check-cast v2, Le1/d;

    iget-object v3, v2, Le1/d;->a:Landroid/graphics/Canvas;

    iput-object p1, v2, Le1/d;->a:Landroid/graphics/Canvas;

    invoke-virtual {p0}, Lu1/w;->getRoot()Landroidx/compose/ui/node/a;

    move-result-object v4

    invoke-virtual {v4, v2}, Landroidx/compose/ui/node/a;->i(Le1/p;)V

    iget-object v1, v1, Lk/f;->b:Ljava/lang/Object;

    check-cast v1, Le1/d;

    iput-object v3, v1, Le1/d;->a:Landroid/graphics/Canvas;

    iget-object v1, p0, Lu1/w;->v:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    xor-int/2addr v0, v2

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v0

    move v3, v2

    :goto_0
    if-ge v3, v0, :cond_1

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lt1/j1;

    invoke-interface {v4}, Lt1/j1;->h()V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    sget-boolean v0, Lu1/b3;->A:Z

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v0

    const/4 v3, 0x0

    invoke-virtual {p1, v3, v3, v3, v3}, Landroid/graphics/Canvas;->clipRect(FFFF)Z

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->dispatchDraw(Landroid/graphics/Canvas;)V

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    :cond_2
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    iput-boolean v2, p0, Lu1/w;->x:Z

    iget-object p1, p0, Lu1/w;->w:Ljava/util/ArrayList;

    if-eqz p1, :cond_3

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    :cond_3
    return-void
.end method

.method public final dispatchGenericMotionEvent(Landroid/view/MotionEvent;)Z
    .locals 13

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_31

    const/high16 v0, 0x400000

    invoke-virtual {p1, v0}, Landroid/view/InputEvent;->isFromSource(I)Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_2e

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v0

    const/16 v3, 0x1a

    invoke-virtual {p1, v3}, Landroid/view/MotionEvent;->getAxisValue(I)F

    move-result v3

    neg-float v3, v3

    new-instance v10, Lq1/c;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    invoke-static {v0}, Lb3/r0;->b(Landroid/view/ViewConfiguration;)F

    move-result v4

    mul-float v5, v4, v3

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    invoke-static {v0}, Lb3/r0;->a(Landroid/view/ViewConfiguration;)F

    move-result v0

    mul-float v6, v0, v3

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getEventTime()J

    move-result-wide v7

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getDeviceId()I

    move-result v9

    move-object v4, v10

    invoke-direct/range {v4 .. v9}, Lq1/c;-><init>(FFJI)V

    invoke-virtual {p0}, Lu1/w;->getFocusOwner()Lc1/e;

    move-result-object p1

    check-cast p1, Lc1/f;

    iget-object p1, p1, Lc1/f;->a:Lc1/p;

    invoke-static {p1}, Landroidx/compose/ui/focus/a;->f(Lc1/p;)Lc1/p;

    move-result-object p1

    const-string v0, "visitAncestors called on an unattached node"

    const/16 v3, 0x10

    const/4 v4, 0x0

    if-eqz p1, :cond_c

    iget-object v5, p1, Ly0/n;->a:Ly0/n;

    iget-boolean v6, v5, Ly0/n;->t:Z

    if-eqz v6, :cond_b

    iget-object v5, v5, Ly0/n;->e:Ly0/n;

    invoke-static {p1}, Lt1/g;->y(Lt1/n;)Landroidx/compose/ui/node/a;

    move-result-object p1

    :goto_0
    if-eqz p1, :cond_a

    iget-object v6, p1, Landroidx/compose/ui/node/a;->C:Lt1/x0;

    iget-object v6, v6, Lt1/x0;->e:Ly0/n;

    iget v6, v6, Ly0/n;->d:I

    and-int/lit16 v6, v6, 0x4000

    if-eqz v6, :cond_8

    :goto_1
    if-eqz v5, :cond_8

    iget v6, v5, Ly0/n;->c:I

    and-int/lit16 v6, v6, 0x4000

    if-eqz v6, :cond_7

    move-object v7, v4

    move-object v6, v5

    :goto_2
    if-eqz v6, :cond_7

    instance-of v8, v6, Lq1/a;

    if-eqz v8, :cond_0

    goto :goto_5

    :cond_0
    iget v8, v6, Ly0/n;->c:I

    and-int/lit16 v8, v8, 0x4000

    if-eqz v8, :cond_6

    instance-of v8, v6, Lt1/o;

    if-eqz v8, :cond_6

    move-object v8, v6

    check-cast v8, Lt1/o;

    iget-object v8, v8, Lt1/o;->v:Ly0/n;

    move v9, v1

    :goto_3
    if-eqz v8, :cond_5

    iget v11, v8, Ly0/n;->c:I

    and-int/lit16 v11, v11, 0x4000

    if-eqz v11, :cond_4

    add-int/lit8 v9, v9, 0x1

    if-ne v9, v2, :cond_1

    move-object v6, v8

    goto :goto_4

    :cond_1
    if-nez v7, :cond_2

    new-instance v7, Lo0/i;

    new-array v11, v3, [Ly0/n;

    invoke-direct {v7, v11}, Lo0/i;-><init>([Ljava/lang/Object;)V

    :cond_2
    if-eqz v6, :cond_3

    invoke-virtual {v7, v6}, Lo0/i;->c(Ljava/lang/Object;)V

    move-object v6, v4

    :cond_3
    invoke-virtual {v7, v8}, Lo0/i;->c(Ljava/lang/Object;)V

    :cond_4
    :goto_4
    iget-object v8, v8, Ly0/n;->f:Ly0/n;

    goto :goto_3

    :cond_5
    if-ne v9, v2, :cond_6

    goto :goto_2

    :cond_6
    invoke-static {v7}, Lt1/g;->f(Lo0/i;)Ly0/n;

    move-result-object v6

    goto :goto_2

    :cond_7
    iget-object v5, v5, Ly0/n;->e:Ly0/n;

    goto :goto_1

    :cond_8
    invoke-virtual {p1}, Landroidx/compose/ui/node/a;->q()Landroidx/compose/ui/node/a;

    move-result-object p1

    if-eqz p1, :cond_9

    iget-object v5, p1, Landroidx/compose/ui/node/a;->C:Lt1/x0;

    if-eqz v5, :cond_9

    iget-object v5, v5, Lt1/x0;->d:Lt1/s1;

    goto :goto_0

    :cond_9
    move-object v5, v4

    goto :goto_0

    :cond_a
    move-object v6, v4

    :goto_5
    check-cast v6, Lq1/a;

    goto :goto_6

    :cond_b
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_c
    move-object v6, v4

    :goto_6
    if-eqz v6, :cond_32

    move-object p1, v6

    check-cast p1, Ly0/n;

    iget-object v5, p1, Ly0/n;->a:Ly0/n;

    iget-boolean v7, v5, Ly0/n;->t:Z

    if-eqz v7, :cond_2d

    iget-object v0, v5, Ly0/n;->e:Ly0/n;

    invoke-static {v6}, Lt1/g;->y(Lt1/n;)Landroidx/compose/ui/node/a;

    move-result-object v5

    move-object v6, v4

    :goto_7
    if-eqz v5, :cond_18

    iget-object v7, v5, Landroidx/compose/ui/node/a;->C:Lt1/x0;

    iget-object v7, v7, Lt1/x0;->e:Ly0/n;

    iget v7, v7, Ly0/n;->d:I

    and-int/lit16 v7, v7, 0x4000

    if-eqz v7, :cond_16

    :goto_8
    if-eqz v0, :cond_16

    iget v7, v0, Ly0/n;->c:I

    and-int/lit16 v7, v7, 0x4000

    if-eqz v7, :cond_15

    move-object v7, v0

    move-object v8, v4

    :goto_9
    if-eqz v7, :cond_15

    instance-of v9, v7, Lq1/a;

    if-eqz v9, :cond_e

    if-nez v6, :cond_d

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    :cond_d
    invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_c

    :cond_e
    iget v9, v7, Ly0/n;->c:I

    and-int/lit16 v9, v9, 0x4000

    if-eqz v9, :cond_14

    instance-of v9, v7, Lt1/o;

    if-eqz v9, :cond_14

    move-object v9, v7

    check-cast v9, Lt1/o;

    iget-object v9, v9, Lt1/o;->v:Ly0/n;

    move v11, v1

    :goto_a
    if-eqz v9, :cond_13

    iget v12, v9, Ly0/n;->c:I

    and-int/lit16 v12, v12, 0x4000

    if-eqz v12, :cond_12

    add-int/lit8 v11, v11, 0x1

    if-ne v11, v2, :cond_f

    move-object v7, v9

    goto :goto_b

    :cond_f
    if-nez v8, :cond_10

    new-instance v8, Lo0/i;

    new-array v12, v3, [Ly0/n;

    invoke-direct {v8, v12}, Lo0/i;-><init>([Ljava/lang/Object;)V

    :cond_10
    if-eqz v7, :cond_11

    invoke-virtual {v8, v7}, Lo0/i;->c(Ljava/lang/Object;)V

    move-object v7, v4

    :cond_11
    invoke-virtual {v8, v9}, Lo0/i;->c(Ljava/lang/Object;)V

    :cond_12
    :goto_b
    iget-object v9, v9, Ly0/n;->f:Ly0/n;

    goto :goto_a

    :cond_13
    if-ne v11, v2, :cond_14

    goto :goto_9

    :cond_14
    :goto_c
    invoke-static {v8}, Lt1/g;->f(Lo0/i;)Ly0/n;

    move-result-object v7

    goto :goto_9

    :cond_15
    iget-object v0, v0, Ly0/n;->e:Ly0/n;

    goto :goto_8

    :cond_16
    invoke-virtual {v5}, Landroidx/compose/ui/node/a;->q()Landroidx/compose/ui/node/a;

    move-result-object v5

    if-eqz v5, :cond_17

    iget-object v0, v5, Landroidx/compose/ui/node/a;->C:Lt1/x0;

    if-eqz v0, :cond_17

    iget-object v0, v0, Lt1/x0;->d:Lt1/s1;

    goto :goto_7

    :cond_17
    move-object v0, v4

    goto :goto_7

    :cond_18
    if-eqz v6, :cond_1b

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ltz v0, :cond_1b

    :goto_d
    add-int/lit8 v5, v0, -0x1

    invoke-interface {v6, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lq1/a;

    check-cast v0, Lq1/b;

    iget-object v0, v0, Lq1/b;->v:Lc9/c;

    if-eqz v0, :cond_19

    invoke-interface {v0, v10}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_19

    :goto_e
    move v1, v2

    goto/16 :goto_18

    :cond_19
    if-gez v5, :cond_1a

    goto :goto_f

    :cond_1a
    move v0, v5

    goto :goto_d

    :cond_1b
    :goto_f
    iget-object v0, p1, Ly0/n;->a:Ly0/n;

    move-object v5, v4

    :goto_10
    if-eqz v0, :cond_23

    instance-of v7, v0, Lq1/a;

    if-eqz v7, :cond_1c

    check-cast v0, Lq1/a;

    check-cast v0, Lq1/b;

    iget-object v0, v0, Lq1/b;->v:Lc9/c;

    if-eqz v0, :cond_22

    invoke-interface {v0, v10}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_22

    goto :goto_e

    :cond_1c
    iget v7, v0, Ly0/n;->c:I

    and-int/lit16 v7, v7, 0x4000

    if-eqz v7, :cond_22

    instance-of v7, v0, Lt1/o;

    if-eqz v7, :cond_22

    move-object v7, v0

    check-cast v7, Lt1/o;

    iget-object v7, v7, Lt1/o;->v:Ly0/n;

    move v8, v1

    :goto_11
    if-eqz v7, :cond_21

    iget v9, v7, Ly0/n;->c:I

    and-int/lit16 v9, v9, 0x4000

    if-eqz v9, :cond_20

    add-int/lit8 v8, v8, 0x1

    if-ne v8, v2, :cond_1d

    move-object v0, v7

    goto :goto_12

    :cond_1d
    if-nez v5, :cond_1e

    new-instance v5, Lo0/i;

    new-array v9, v3, [Ly0/n;

    invoke-direct {v5, v9}, Lo0/i;-><init>([Ljava/lang/Object;)V

    :cond_1e
    if-eqz v0, :cond_1f

    invoke-virtual {v5, v0}, Lo0/i;->c(Ljava/lang/Object;)V

    move-object v0, v4

    :cond_1f
    invoke-virtual {v5, v7}, Lo0/i;->c(Ljava/lang/Object;)V

    :cond_20
    :goto_12
    iget-object v7, v7, Ly0/n;->f:Ly0/n;

    goto :goto_11

    :cond_21
    if-ne v8, v2, :cond_22

    goto :goto_10

    :cond_22
    invoke-static {v5}, Lt1/g;->f(Lo0/i;)Ly0/n;

    move-result-object v0

    goto :goto_10

    :cond_23
    iget-object p1, p1, Ly0/n;->a:Ly0/n;

    move-object v0, v4

    :goto_13
    if-eqz p1, :cond_2b

    instance-of v5, p1, Lq1/a;

    if-eqz v5, :cond_24

    check-cast p1, Lq1/a;

    check-cast p1, Lq1/b;

    iget-object p1, p1, Lq1/b;->u:Lc9/c;

    if-eqz p1, :cond_2a

    invoke-interface {p1, v10}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_2a

    goto :goto_e

    :cond_24
    iget v5, p1, Ly0/n;->c:I

    and-int/lit16 v5, v5, 0x4000

    if-eqz v5, :cond_2a

    instance-of v5, p1, Lt1/o;

    if-eqz v5, :cond_2a

    move-object v5, p1

    check-cast v5, Lt1/o;

    iget-object v5, v5, Lt1/o;->v:Ly0/n;

    move v7, v1

    :goto_14
    if-eqz v5, :cond_29

    iget v8, v5, Ly0/n;->c:I

    and-int/lit16 v8, v8, 0x4000

    if-eqz v8, :cond_28

    add-int/lit8 v7, v7, 0x1

    if-ne v7, v2, :cond_25

    move-object p1, v5

    goto :goto_15

    :cond_25
    if-nez v0, :cond_26

    new-instance v0, Lo0/i;

    new-array v8, v3, [Ly0/n;

    invoke-direct {v0, v8}, Lo0/i;-><init>([Ljava/lang/Object;)V

    :cond_26
    if-eqz p1, :cond_27

    invoke-virtual {v0, p1}, Lo0/i;->c(Ljava/lang/Object;)V

    move-object p1, v4

    :cond_27
    invoke-virtual {v0, v5}, Lo0/i;->c(Ljava/lang/Object;)V

    :cond_28
    :goto_15
    iget-object v5, v5, Ly0/n;->f:Ly0/n;

    goto :goto_14

    :cond_29
    if-ne v7, v2, :cond_2a

    goto :goto_13

    :cond_2a
    invoke-static {v0}, Lt1/g;->f(Lo0/i;)Ly0/n;

    move-result-object p1

    goto :goto_13

    :cond_2b
    if-eqz v6, :cond_32

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result p1

    move v0, v1

    :goto_16
    if-ge v0, p1, :cond_32

    invoke-interface {v6, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lq1/a;

    check-cast v3, Lq1/b;

    iget-object v3, v3, Lq1/b;->u:Lc9/c;

    if-eqz v3, :cond_2c

    invoke-interface {v3, v10}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_2c

    goto/16 :goto_e

    :cond_2c
    add-int/lit8 v0, v0, 0x1

    goto :goto_16

    :cond_2d
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2e
    invoke-static {p1}, Lu1/w;->n(Landroid/view/MotionEvent;)Z

    move-result v0

    if-nez v0, :cond_30

    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v0

    if-nez v0, :cond_2f

    goto :goto_17

    :cond_2f
    invoke-virtual {p0, p1}, Lu1/w;->k(Landroid/view/MotionEvent;)I

    move-result p1

    and-int/2addr p1, v2

    if-eqz p1, :cond_32

    goto/16 :goto_e

    :cond_30
    :goto_17
    invoke-super {p0, p1}, Landroid/view/View;->dispatchGenericMotionEvent(Landroid/view/MotionEvent;)Z

    move-result v1

    goto :goto_18

    :cond_31
    invoke-super {p0, p1}, Landroid/view/View;->dispatchGenericMotionEvent(Landroid/view/MotionEvent;)Z

    move-result v1

    :cond_32
    :goto_18
    return v1
.end method

.method public final dispatchHoverEvent(Landroid/view/MotionEvent;)Z
    .locals 24

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-boolean v2, v0, Lu1/w;->x0:Z

    iget-object v3, v0, Lu1/w;->w0:Landroidx/activity/d;

    if-eqz v2, :cond_0

    invoke-virtual {v0, v3}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    invoke-virtual {v3}, Landroidx/activity/d;->run()V

    :cond_0
    invoke-static/range {p1 .. p1}, Lu1/w;->n(Landroid/view/MotionEvent;)Z

    move-result v2

    const/4 v4, 0x0

    if-nez v2, :cond_11

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v2

    if-nez v2, :cond_1

    goto/16 :goto_5

    :cond_1
    iget-object v2, v0, Lu1/w;->t:Lu1/p0;

    iget-object v5, v2, Lu1/p0;->n:Landroid/view/accessibility/AccessibilityManager;

    invoke-virtual {v5}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    move-result v6

    const/4 v7, 0x1

    if-eqz v6, :cond_2

    invoke-virtual {v5}, Landroid/view/accessibility/AccessibilityManager;->isTouchExplorationEnabled()Z

    move-result v5

    if-eqz v5, :cond_2

    move v5, v7

    goto :goto_0

    :cond_2
    move v5, v4

    :goto_0
    const/16 v6, 0xa

    const/4 v8, 0x7

    if-nez v5, :cond_3

    goto/16 :goto_3

    :cond_3
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v5

    const/16 v9, 0x100

    const/16 v10, 0xc

    const/16 v11, 0x80

    const/4 v12, 0x0

    iget-object v13, v2, Lu1/p0;->d:Lu1/w;

    const/high16 v14, -0x80000000

    if-eq v5, v8, :cond_7

    const/16 v15, 0x9

    if-eq v5, v15, :cond_7

    if-eq v5, v6, :cond_4

    goto/16 :goto_3

    :cond_4
    iget v5, v2, Lu1/p0;->e:I

    if-eq v5, v14, :cond_6

    if-ne v5, v14, :cond_5

    goto/16 :goto_3

    :cond_5
    iput v14, v2, Lu1/p0;->e:I

    invoke-static {v2, v14, v11, v12, v10}, Lu1/p0;->K(Lu1/p0;IILjava/lang/Integer;I)V

    invoke-static {v2, v5, v9, v12, v10}, Lu1/p0;->K(Lu1/p0;IILjava/lang/Integer;I)V

    goto/16 :goto_3

    :cond_6
    invoke-virtual {v13}, Lu1/w;->getAndroidViewsHandler$ui_release()Lu1/j1;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/view/View;->dispatchGenericMotionEvent(Landroid/view/MotionEvent;)Z

    goto/16 :goto_3

    :cond_7
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getX()F

    move-result v5

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getY()F

    move-result v15

    invoke-static {v13}, Lt1/l1;->a(Lt1/l1;)V

    new-instance v23, Lt1/v;

    invoke-direct/range {v23 .. v23}, Lt1/v;-><init>()V

    invoke-virtual {v13}, Lu1/w;->getRoot()Landroidx/compose/ui/node/a;

    move-result-object v14

    invoke-static {v5, v15}, Ld9/i;->f(FF)J

    move-result-wide v8

    const/16 v22, 0x1

    iget-object v5, v14, Landroidx/compose/ui/node/a;->C:Lt1/x0;

    iget-object v14, v5, Lt1/x0;->c:Lt1/c1;

    invoke-virtual {v14, v8, v9}, Lt1/c1;->H0(J)J

    move-result-wide v18

    iget-object v5, v5, Lt1/x0;->c:Lt1/c1;

    sget-object v17, Lt1/c1;->M:Lx9/v;

    const/16 v21, 0x1

    move-object/from16 v16, v5

    move-object/from16 v20, v23

    invoke-virtual/range {v16 .. v22}, Lt1/c1;->N0(Lt1/z0;JLt1/v;ZZ)V

    invoke-static/range {v23 .. v23}, Lr8/p;->M0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ly0/n;

    if-eqz v5, :cond_8

    invoke-static {v5}, Lt1/g;->y(Lt1/n;)Landroidx/compose/ui/node/a;

    move-result-object v5

    goto :goto_1

    :cond_8
    move-object v5, v12

    :goto_1
    if-eqz v5, :cond_a

    iget-object v8, v5, Landroidx/compose/ui/node/a;->C:Lt1/x0;

    if-eqz v8, :cond_a

    const/16 v9, 0x8

    invoke-virtual {v8, v9}, Lt1/x0;->d(I)Z

    move-result v8

    if-ne v8, v7, :cond_a

    invoke-static {v5, v4}, Lo1/s;->f(Landroidx/compose/ui/node/a;Z)Ly1/o;

    move-result-object v8

    sget-object v9, Lu1/r0;->a:Ld1/d;

    invoke-virtual {v8}, Ly1/o;->c()Lt1/c1;

    move-result-object v9

    if-eqz v9, :cond_9

    invoke-virtual {v9}, Lt1/c1;->Q0()Z

    move-result v9

    if-nez v9, :cond_a

    :cond_9
    sget-object v9, Ly1/r;->m:Ly1/u;

    iget-object v8, v8, Ly1/o;->d:Ly1/j;

    iget-object v8, v8, Ly1/j;->a:Ljava/util/LinkedHashMap;

    invoke-interface {v8, v9}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_a

    invoke-virtual {v13}, Lu1/w;->getAndroidViewsHandler$ui_release()Lu1/j1;

    move-result-object v8

    invoke-virtual {v8}, Lu1/j1;->getLayoutNodeToHolder()Ljava/util/HashMap;

    move-result-object v8

    invoke-virtual {v8, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    invoke-static {v8}, La7/a;->w(Ljava/lang/Object;)V

    iget v5, v5, Landroidx/compose/ui/node/a;->b:I

    invoke-virtual {v2, v5}, Lu1/p0;->E(I)I

    move-result v14

    goto :goto_2

    :cond_a
    const/high16 v14, -0x80000000

    :goto_2
    invoke-virtual {v13}, Lu1/w;->getAndroidViewsHandler$ui_release()Lu1/j1;

    move-result-object v5

    invoke-virtual {v5, v1}, Landroid/view/View;->dispatchGenericMotionEvent(Landroid/view/MotionEvent;)Z

    iget v5, v2, Lu1/p0;->e:I

    if-ne v5, v14, :cond_b

    goto :goto_3

    :cond_b
    iput v14, v2, Lu1/p0;->e:I

    invoke-static {v2, v14, v11, v12, v10}, Lu1/p0;->K(Lu1/p0;IILjava/lang/Integer;I)V

    const/16 v8, 0x100

    invoke-static {v2, v5, v8, v12, v10}, Lu1/p0;->K(Lu1/p0;IILjava/lang/Integer;I)V

    :goto_3
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v2

    const/4 v5, 0x7

    if-eq v2, v5, :cond_f

    if-eq v2, v6, :cond_c

    goto :goto_4

    :cond_c
    invoke-virtual/range {p0 .. p1}, Lu1/w;->o(Landroid/view/MotionEvent;)Z

    move-result v2

    if-eqz v2, :cond_10

    invoke-virtual {v1, v4}, Landroid/view/MotionEvent;->getToolType(I)I

    move-result v2

    const/4 v5, 0x3

    if-ne v2, v5, :cond_d

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getButtonState()I

    move-result v2

    if-eqz v2, :cond_d

    return v4

    :cond_d
    iget-object v2, v0, Lu1/w;->r0:Landroid/view/MotionEvent;

    if-eqz v2, :cond_e

    invoke-virtual {v2}, Landroid/view/MotionEvent;->recycle()V

    :cond_e
    invoke-static/range {p1 .. p1}, Landroid/view/MotionEvent;->obtainNoHistory(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    move-result-object v1

    iput-object v1, v0, Lu1/w;->r0:Landroid/view/MotionEvent;

    iput-boolean v7, v0, Lu1/w;->x0:Z

    invoke-virtual {v0, v3}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return v4

    :cond_f
    invoke-virtual/range {p0 .. p1}, Lu1/w;->p(Landroid/view/MotionEvent;)Z

    move-result v2

    if-nez v2, :cond_10

    return v4

    :cond_10
    :goto_4
    invoke-virtual/range {p0 .. p1}, Lu1/w;->k(Landroid/view/MotionEvent;)I

    move-result v1

    and-int/2addr v1, v7

    if-eqz v1, :cond_11

    move v4, v7

    :cond_11
    :goto_5
    return v4
.end method

.method public final dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 34

    move-object/from16 v0, p1

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->isFocused()Z

    move-result v1

    if-eqz v1, :cond_46

    invoke-virtual/range {p1 .. p1}, Landroid/view/KeyEvent;->getMetaState()I

    move-result v1

    move-object/from16 v2, p0

    iget-object v3, v2, Lu1/w;->o:Lu1/h3;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v3, Lo1/a0;

    invoke-direct {v3, v1}, Lo1/a0;-><init>(I)V

    sget-object v1, Lu1/h3;->b:Lm0/n1;

    invoke-virtual {v1, v3}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lu1/w;->getFocusOwner()Lc1/e;

    move-result-object v1

    check-cast v1, Lc1/f;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p1 .. p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v3

    invoke-static {v3}, Landroidx/compose/ui/input/key/a;->a(I)J

    move-result-wide v3

    invoke-static/range {p1 .. p1}, Landroidx/compose/ui/input/key/a;->b(Landroid/view/KeyEvent;)I

    move-result v5

    const/4 v6, 0x2

    invoke-static {v5, v6}, Lz6/a;->B(II)Z

    move-result v6

    const/4 v8, 0x1

    const/4 v9, 0x3

    const/16 v16, 0x6

    const-wide/16 v17, 0x1

    const-wide/16 v19, 0x0

    const-wide v21, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    const-wide v23, 0x101010101010101L

    const/16 v25, 0x3f

    const v26, -0x3361d2af    # -8.293031E7f

    if-eqz v6, :cond_8

    iget-object v5, v1, Lc1/f;->f:Lq/q;

    if-nez v5, :cond_0

    new-instance v5, Lq/q;

    invoke-direct {v5, v9}, Lq/q;-><init>(I)V

    iput-object v5, v1, Lc1/f;->f:Lq/q;

    :cond_0
    move-object v6, v5

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    mul-int v5, v5, v26

    shl-int/lit8 v26, v5, 0x10

    xor-int v5, v5, v26

    ushr-int/lit8 v10, v5, 0x7

    and-int/lit8 v5, v5, 0x7f

    iget v7, v6, Lq/q;->c:I

    and-int v26, v10, v7

    const/16 v27, 0x0

    :goto_0
    iget-object v15, v6, Lq/q;->a:[J

    shr-int/lit8 v28, v26, 0x3

    and-int/lit8 v29, v26, 0x7

    shl-int/lit8 v11, v29, 0x3

    aget-wide v30, v15, v28

    ushr-long v30, v30, v11

    add-int/lit8 v28, v28, 0x1

    aget-wide v28, v15, v28

    rsub-int/lit8 v12, v11, 0x40

    shl-long v28, v28, v12

    int-to-long v11, v11

    neg-long v11, v11

    shr-long v11, v11, v25

    and-long v11, v28, v11

    or-long v11, v30, v11

    int-to-long v13, v5

    mul-long v30, v13, v23

    xor-long v8, v11, v30

    sub-long v30, v8, v23

    not-long v8, v8

    and-long v8, v30, v8

    and-long v8, v8, v21

    :goto_1
    cmp-long v30, v8, v19

    if-eqz v30, :cond_2

    invoke-static {v8, v9}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    move-result v30

    const/16 v31, 0x3

    shr-int/lit8 v30, v30, 0x3

    add-int v30, v26, v30

    and-int v30, v30, v7

    iget-object v15, v6, Lq/q;->b:[J

    aget-wide v32, v15, v30

    cmp-long v15, v32, v3

    if-nez v15, :cond_1

    move-object v12, v1

    goto/16 :goto_5

    :cond_1
    sub-long v32, v8, v17

    and-long v8, v8, v32

    goto :goto_1

    :cond_2
    not-long v8, v11

    shl-long v8, v8, v16

    and-long/2addr v8, v11

    and-long v8, v8, v21

    cmp-long v8, v8, v19

    if-eqz v8, :cond_7

    invoke-virtual {v6, v10}, Lq/q;->c(I)I

    move-result v5

    iget v7, v6, Lq/q;->e:I

    if-nez v7, :cond_5

    iget-object v7, v6, Lq/q;->a:[J

    shr-int/lit8 v8, v5, 0x3

    aget-wide v8, v7, v8

    and-int/lit8 v7, v5, 0x7

    const/4 v11, 0x3

    shl-int/2addr v7, v11

    shr-long v7, v8, v7

    const-wide/16 v11, 0xff

    and-long/2addr v7, v11

    const-wide/16 v11, 0xfe

    cmp-long v7, v7, v11

    if-nez v7, :cond_3

    goto :goto_3

    :cond_3
    iget v5, v6, Lq/q;->c:I

    const/16 v7, 0x8

    if-le v5, v7, :cond_4

    iget v7, v6, Lq/q;->d:I

    int-to-long v7, v7

    const-wide/16 v11, 0x20

    mul-long/2addr v7, v11

    int-to-long v11, v5

    const-wide/16 v15, 0x19

    mul-long/2addr v11, v15

    invoke-static {v7, v8, v11, v12}, Ljava/lang/Long;->compareUnsigned(JJ)I

    move-result v5

    if-gtz v5, :cond_4

    iget v5, v6, Lq/q;->c:I

    invoke-static {v5}, Lq/v;->b(I)I

    move-result v5

    invoke-virtual {v6, v5}, Lq/q;->f(I)V

    goto :goto_2

    :cond_4
    iget v5, v6, Lq/q;->c:I

    invoke-static {v5}, Lq/v;->b(I)I

    move-result v5

    invoke-virtual {v6, v5}, Lq/q;->f(I)V

    :goto_2
    invoke-virtual {v6, v10}, Lq/q;->c(I)I

    move-result v5

    :cond_5
    :goto_3
    move/from16 v30, v5

    iget v5, v6, Lq/q;->d:I

    const/4 v7, 0x1

    add-int/2addr v5, v7

    iput v5, v6, Lq/q;->d:I

    iget v5, v6, Lq/q;->e:I

    iget-object v7, v6, Lq/q;->a:[J

    shr-int/lit8 v8, v30, 0x3

    aget-wide v9, v7, v8

    and-int/lit8 v11, v30, 0x7

    const/4 v12, 0x3

    shl-int/2addr v11, v12

    shr-long v16, v9, v11

    const-wide/16 v18, 0xff

    and-long v16, v16, v18

    const-wide/16 v20, 0x80

    cmp-long v12, v16, v20

    if-nez v12, :cond_6

    const/4 v12, 0x1

    goto :goto_4

    :cond_6
    const/4 v12, 0x0

    :goto_4
    sub-int/2addr v5, v12

    iput v5, v6, Lq/q;->e:I

    move-object v12, v1

    shl-long v0, v18, v11

    not-long v0, v0

    and-long/2addr v0, v9

    shl-long v9, v13, v11

    or-long/2addr v0, v9

    aput-wide v0, v7, v8

    iget v0, v6, Lq/q;->c:I

    add-int/lit8 v1, v30, -0x7

    and-int/2addr v1, v0

    and-int/lit8 v0, v0, 0x7

    add-int/2addr v1, v0

    shr-int/lit8 v0, v1, 0x3

    and-int/lit8 v1, v1, 0x7

    const/4 v5, 0x3

    shl-int/2addr v1, v5

    aget-wide v8, v7, v0

    const-wide/16 v10, 0xff

    shl-long/2addr v10, v1

    not-long v10, v10

    and-long/2addr v8, v10

    shl-long v10, v13, v1

    or-long/2addr v8, v10

    aput-wide v8, v7, v0

    :goto_5
    iget-object v0, v6, Lq/q;->b:[J

    aput-wide v3, v0, v30

    goto/16 :goto_9

    :cond_7
    move-object v12, v1

    const/16 v0, 0x8

    add-int/lit8 v27, v27, 0x8

    add-int v26, v26, v27

    and-int v26, v26, v7

    move-object/from16 v0, p1

    const/4 v8, 0x1

    const/4 v9, 0x3

    goto/16 :goto_0

    :cond_8
    move-object v12, v1

    move v0, v8

    invoke-static {v5, v0}, Lz6/a;->B(II)Z

    move-result v1

    if-eqz v1, :cond_d

    iget-object v1, v12, Lc1/f;->f:Lq/q;

    if-eqz v1, :cond_c

    invoke-virtual {v1, v3, v4}, Lq/q;->a(J)Z

    move-result v1

    if-ne v1, v0, :cond_c

    iget-object v0, v12, Lc1/f;->f:Lq/q;

    if-eqz v0, :cond_d

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    mul-int v1, v1, v26

    shl-int/lit8 v5, v1, 0x10

    xor-int/2addr v1, v5

    and-int/lit8 v5, v1, 0x7f

    iget v6, v0, Lq/q;->c:I

    ushr-int/lit8 v1, v1, 0x7

    and-int/2addr v1, v6

    const/4 v7, 0x0

    :goto_6
    iget-object v8, v0, Lq/q;->a:[J

    shr-int/lit8 v9, v1, 0x3

    and-int/lit8 v10, v1, 0x7

    const/4 v11, 0x3

    shl-int/2addr v10, v11

    aget-wide v13, v8, v9

    ushr-long/2addr v13, v10

    const/4 v11, 0x1

    add-int/2addr v9, v11

    aget-wide v30, v8, v9

    rsub-int/lit8 v8, v10, 0x40

    shl-long v8, v30, v8

    int-to-long v10, v10

    neg-long v10, v10

    shr-long v10, v10, v25

    and-long/2addr v8, v10

    or-long/2addr v8, v13

    int-to-long v10, v5

    mul-long v10, v10, v23

    xor-long/2addr v10, v8

    sub-long v13, v10, v23

    not-long v10, v10

    and-long/2addr v10, v13

    and-long v10, v10, v21

    :goto_7
    cmp-long v13, v10, v19

    if-eqz v13, :cond_a

    invoke-static {v10, v11}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    move-result v13

    const/4 v14, 0x3

    shr-int/2addr v13, v14

    add-int/2addr v13, v1

    and-int/2addr v13, v6

    iget-object v14, v0, Lq/q;->b:[J

    aget-wide v30, v14, v13

    cmp-long v14, v30, v3

    if-nez v14, :cond_9

    goto :goto_8

    :cond_9
    sub-long v13, v10, v17

    and-long/2addr v10, v13

    goto :goto_7

    :cond_a
    not-long v10, v8

    shl-long v10, v10, v16

    and-long/2addr v8, v10

    and-long v8, v8, v21

    cmp-long v8, v8, v19

    if-eqz v8, :cond_b

    const/4 v13, -0x1

    :goto_8
    if-ltz v13, :cond_d

    iget v1, v0, Lq/q;->d:I

    const/4 v3, 0x1

    sub-int/2addr v1, v3

    iput v1, v0, Lq/q;->d:I

    iget-object v1, v0, Lq/q;->a:[J

    shr-int/lit8 v3, v13, 0x3

    and-int/lit8 v4, v13, 0x7

    const/4 v5, 0x3

    shl-int/2addr v4, v5

    aget-wide v5, v1, v3

    const-wide/16 v7, 0xff

    shl-long v9, v7, v4

    not-long v7, v9

    and-long/2addr v5, v7

    const-wide/16 v7, 0xfe

    shl-long v9, v7, v4

    or-long v4, v5, v9

    aput-wide v4, v1, v3

    iget v0, v0, Lq/q;->c:I

    add-int/lit8 v13, v13, -0x7

    and-int v3, v13, v0

    and-int/lit8 v0, v0, 0x7

    add-int/2addr v3, v0

    shr-int/lit8 v0, v3, 0x3

    and-int/lit8 v3, v3, 0x7

    const/4 v8, 0x3

    shl-int/2addr v3, v8

    aget-wide v4, v1, v0

    const-wide/16 v9, 0xff

    shl-long v6, v9, v3

    not-long v6, v6

    and-long/2addr v4, v6

    const-wide/16 v13, 0xfe

    shl-long v6, v13, v3

    or-long v3, v4, v6

    aput-wide v3, v1, v0

    goto :goto_9

    :cond_b
    const/4 v8, 0x3

    const-wide/16 v9, 0xff

    const/16 v11, 0x8

    const-wide/16 v13, 0xfe

    add-int/2addr v7, v11

    add-int/2addr v1, v7

    and-int/2addr v1, v6

    goto/16 :goto_6

    :cond_c
    move-object/from16 v7, p1

    const/4 v9, 0x1

    goto/16 :goto_24

    :cond_d
    :goto_9
    iget-object v0, v12, Lc1/f;->a:Lc1/p;

    invoke-static {v0}, Landroidx/compose/ui/focus/a;->f(Lc1/p;)Lc1/p;

    move-result-object v0

    if-eqz v0, :cond_45

    iget-object v1, v0, Ly0/n;->a:Ly0/n;

    iget-boolean v3, v1, Ly0/n;->t:Z

    if-eqz v3, :cond_44

    iget v3, v1, Ly0/n;->d:I

    and-int/lit16 v3, v3, 0x2400

    const/4 v4, 0x0

    if-eqz v3, :cond_10

    iget-object v1, v1, Ly0/n;->f:Ly0/n;

    move-object v3, v4

    :goto_a
    if-eqz v1, :cond_11

    iget v5, v1, Ly0/n;->c:I

    and-int/lit16 v6, v5, 0x2400

    if-eqz v6, :cond_f

    and-int/lit16 v5, v5, 0x400

    if-eqz v5, :cond_e

    goto :goto_b

    :cond_e
    move-object v3, v1

    :cond_f
    iget-object v1, v1, Ly0/n;->f:Ly0/n;

    goto :goto_a

    :cond_10
    move-object v3, v4

    :cond_11
    :goto_b
    const/16 v1, 0x10

    const-string v5, "visitAncestors called on an unattached node"

    if-nez v3, :cond_1f

    iget-object v3, v0, Ly0/n;->a:Ly0/n;

    iget-boolean v6, v3, Ly0/n;->t:Z

    if-eqz v6, :cond_1e

    iget-object v3, v3, Ly0/n;->e:Ly0/n;

    invoke-static {v0}, Lt1/g;->y(Lt1/n;)Landroidx/compose/ui/node/a;

    move-result-object v0

    :goto_c
    if-eqz v0, :cond_1c

    iget-object v6, v0, Landroidx/compose/ui/node/a;->C:Lt1/x0;

    iget-object v6, v6, Lt1/x0;->e:Ly0/n;

    iget v6, v6, Ly0/n;->d:I

    and-int/lit16 v6, v6, 0x2000

    if-eqz v6, :cond_1a

    :goto_d
    if-eqz v3, :cond_1a

    iget v6, v3, Ly0/n;->c:I

    and-int/lit16 v6, v6, 0x2000

    if-eqz v6, :cond_19

    move-object v6, v3

    move-object v7, v4

    :goto_e
    if-eqz v6, :cond_19

    instance-of v8, v6, Lm1/c;

    if-eqz v8, :cond_12

    goto :goto_11

    :cond_12
    iget v8, v6, Ly0/n;->c:I

    and-int/lit16 v8, v8, 0x2000

    if-eqz v8, :cond_18

    instance-of v8, v6, Lt1/o;

    if-eqz v8, :cond_18

    move-object v8, v6

    check-cast v8, Lt1/o;

    iget-object v8, v8, Lt1/o;->v:Ly0/n;

    const/4 v9, 0x0

    :goto_f
    if-eqz v8, :cond_17

    iget v10, v8, Ly0/n;->c:I

    and-int/lit16 v10, v10, 0x2000

    if-eqz v10, :cond_16

    add-int/lit8 v9, v9, 0x1

    const/4 v10, 0x1

    if-ne v9, v10, :cond_13

    move-object v6, v8

    goto :goto_10

    :cond_13
    if-nez v7, :cond_14

    new-instance v7, Lo0/i;

    new-array v10, v1, [Ly0/n;

    invoke-direct {v7, v10}, Lo0/i;-><init>([Ljava/lang/Object;)V

    :cond_14
    if-eqz v6, :cond_15

    invoke-virtual {v7, v6}, Lo0/i;->c(Ljava/lang/Object;)V

    move-object v6, v4

    :cond_15
    invoke-virtual {v7, v8}, Lo0/i;->c(Ljava/lang/Object;)V

    :cond_16
    :goto_10
    iget-object v8, v8, Ly0/n;->f:Ly0/n;

    goto :goto_f

    :cond_17
    const/4 v8, 0x1

    if-ne v9, v8, :cond_18

    goto :goto_e

    :cond_18
    invoke-static {v7}, Lt1/g;->f(Lo0/i;)Ly0/n;

    move-result-object v6

    goto :goto_e

    :cond_19
    iget-object v3, v3, Ly0/n;->e:Ly0/n;

    goto :goto_d

    :cond_1a
    invoke-virtual {v0}, Landroidx/compose/ui/node/a;->q()Landroidx/compose/ui/node/a;

    move-result-object v0

    if-eqz v0, :cond_1b

    iget-object v3, v0, Landroidx/compose/ui/node/a;->C:Lt1/x0;

    if-eqz v3, :cond_1b

    iget-object v3, v3, Lt1/x0;->d:Lt1/s1;

    goto :goto_c

    :cond_1b
    move-object v3, v4

    goto :goto_c

    :cond_1c
    move-object v6, v4

    :goto_11
    check-cast v6, Lm1/c;

    if-eqz v6, :cond_1d

    check-cast v6, Ly0/n;

    iget-object v3, v6, Ly0/n;->a:Ly0/n;

    goto :goto_12

    :cond_1d
    move-object v3, v4

    goto :goto_12

    :cond_1e
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1f
    :goto_12
    if-eqz v3, :cond_c

    iget-object v0, v3, Ly0/n;->a:Ly0/n;

    iget-boolean v6, v0, Ly0/n;->t:Z

    if-eqz v6, :cond_41

    iget-object v0, v0, Ly0/n;->e:Ly0/n;

    invoke-static {v3}, Lt1/g;->y(Lt1/n;)Landroidx/compose/ui/node/a;

    move-result-object v5

    move-object v6, v4

    :goto_13
    if-eqz v5, :cond_2b

    iget-object v7, v5, Landroidx/compose/ui/node/a;->C:Lt1/x0;

    iget-object v7, v7, Lt1/x0;->e:Ly0/n;

    iget v7, v7, Ly0/n;->d:I

    and-int/lit16 v7, v7, 0x2000

    if-eqz v7, :cond_29

    :goto_14
    if-eqz v0, :cond_29

    iget v7, v0, Ly0/n;->c:I

    and-int/lit16 v7, v7, 0x2000

    if-eqz v7, :cond_28

    move-object v7, v0

    move-object v8, v4

    :goto_15
    if-eqz v7, :cond_28

    instance-of v9, v7, Lm1/c;

    if-eqz v9, :cond_21

    if-nez v6, :cond_20

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    :cond_20
    invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_18

    :cond_21
    iget v9, v7, Ly0/n;->c:I

    and-int/lit16 v9, v9, 0x2000

    if-eqz v9, :cond_27

    instance-of v9, v7, Lt1/o;

    if-eqz v9, :cond_27

    move-object v9, v7

    check-cast v9, Lt1/o;

    iget-object v9, v9, Lt1/o;->v:Ly0/n;

    const/4 v10, 0x0

    :goto_16
    if-eqz v9, :cond_26

    iget v11, v9, Ly0/n;->c:I

    and-int/lit16 v11, v11, 0x2000

    if-eqz v11, :cond_25

    add-int/lit8 v10, v10, 0x1

    const/4 v11, 0x1

    if-ne v10, v11, :cond_22

    move-object v7, v9

    goto :goto_17

    :cond_22
    if-nez v8, :cond_23

    new-instance v8, Lo0/i;

    new-array v11, v1, [Ly0/n;

    invoke-direct {v8, v11}, Lo0/i;-><init>([Ljava/lang/Object;)V

    :cond_23
    if-eqz v7, :cond_24

    invoke-virtual {v8, v7}, Lo0/i;->c(Ljava/lang/Object;)V

    move-object v7, v4

    :cond_24
    invoke-virtual {v8, v9}, Lo0/i;->c(Ljava/lang/Object;)V

    :cond_25
    :goto_17
    iget-object v9, v9, Ly0/n;->f:Ly0/n;

    goto :goto_16

    :cond_26
    const/4 v9, 0x1

    if-ne v10, v9, :cond_27

    goto :goto_15

    :cond_27
    :goto_18
    invoke-static {v8}, Lt1/g;->f(Lo0/i;)Ly0/n;

    move-result-object v7

    goto :goto_15

    :cond_28
    iget-object v0, v0, Ly0/n;->e:Ly0/n;

    goto :goto_14

    :cond_29
    invoke-virtual {v5}, Landroidx/compose/ui/node/a;->q()Landroidx/compose/ui/node/a;

    move-result-object v5

    if-eqz v5, :cond_2a

    iget-object v0, v5, Landroidx/compose/ui/node/a;->C:Lt1/x0;

    if-eqz v0, :cond_2a

    iget-object v0, v0, Lt1/x0;->d:Lt1/s1;

    goto :goto_13

    :cond_2a
    move-object v0, v4

    goto :goto_13

    :cond_2b
    if-eqz v6, :cond_2e

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    const/4 v5, -0x1

    add-int/2addr v0, v5

    if-ltz v0, :cond_2e

    :goto_19
    add-int/lit8 v5, v0, -0x1

    invoke-interface {v6, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm1/c;

    move-object/from16 v7, p1

    invoke-interface {v0, v7}, Lm1/c;->l(Landroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_2c

    :goto_1a
    const/4 v9, 0x1

    goto/16 :goto_25

    :cond_2c
    if-gez v5, :cond_2d

    goto :goto_1b

    :cond_2d
    move v0, v5

    goto :goto_19

    :cond_2e
    move-object/from16 v7, p1

    :goto_1b
    iget-object v0, v3, Ly0/n;->a:Ly0/n;

    move-object v5, v4

    :goto_1c
    if-eqz v0, :cond_36

    instance-of v8, v0, Lm1/c;

    if-eqz v8, :cond_2f

    check-cast v0, Lm1/c;

    invoke-interface {v0, v7}, Lm1/c;->l(Landroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_35

    goto :goto_1a

    :cond_2f
    iget v8, v0, Ly0/n;->c:I

    and-int/lit16 v8, v8, 0x2000

    if-eqz v8, :cond_35

    instance-of v8, v0, Lt1/o;

    if-eqz v8, :cond_35

    move-object v8, v0

    check-cast v8, Lt1/o;

    iget-object v8, v8, Lt1/o;->v:Ly0/n;

    const/4 v9, 0x0

    :goto_1d
    if-eqz v8, :cond_34

    iget v10, v8, Ly0/n;->c:I

    and-int/lit16 v10, v10, 0x2000

    if-eqz v10, :cond_33

    add-int/lit8 v9, v9, 0x1

    const/4 v10, 0x1

    if-ne v9, v10, :cond_30

    move-object v0, v8

    goto :goto_1e

    :cond_30
    if-nez v5, :cond_31

    new-instance v5, Lo0/i;

    new-array v10, v1, [Ly0/n;

    invoke-direct {v5, v10}, Lo0/i;-><init>([Ljava/lang/Object;)V

    :cond_31
    if-eqz v0, :cond_32

    invoke-virtual {v5, v0}, Lo0/i;->c(Ljava/lang/Object;)V

    move-object v0, v4

    :cond_32
    invoke-virtual {v5, v8}, Lo0/i;->c(Ljava/lang/Object;)V

    :cond_33
    :goto_1e
    iget-object v8, v8, Ly0/n;->f:Ly0/n;

    goto :goto_1d

    :cond_34
    const/4 v8, 0x1

    if-ne v9, v8, :cond_35

    goto :goto_1c

    :cond_35
    invoke-static {v5}, Lt1/g;->f(Lo0/i;)Ly0/n;

    move-result-object v0

    goto :goto_1c

    :cond_36
    iget-object v0, v3, Ly0/n;->a:Ly0/n;

    move-object v3, v4

    :goto_1f
    if-eqz v0, :cond_3f

    instance-of v5, v0, Lm1/c;

    if-eqz v5, :cond_38

    check-cast v0, Lm1/c;

    invoke-interface {v0, v7}, Lm1/c;->M(Landroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_37

    goto :goto_1a

    :cond_37
    const/4 v9, 0x1

    goto :goto_22

    :cond_38
    iget v5, v0, Ly0/n;->c:I

    and-int/lit16 v5, v5, 0x2000

    if-eqz v5, :cond_37

    instance-of v5, v0, Lt1/o;

    if-eqz v5, :cond_37

    move-object v5, v0

    check-cast v5, Lt1/o;

    iget-object v5, v5, Lt1/o;->v:Ly0/n;

    const/4 v8, 0x0

    :goto_20
    if-eqz v5, :cond_3d

    iget v9, v5, Ly0/n;->c:I

    and-int/lit16 v9, v9, 0x2000

    if-eqz v9, :cond_3c

    add-int/lit8 v8, v8, 0x1

    const/4 v9, 0x1

    if-ne v8, v9, :cond_39

    move-object v0, v5

    goto :goto_21

    :cond_39
    if-nez v3, :cond_3a

    new-instance v3, Lo0/i;

    new-array v9, v1, [Ly0/n;

    invoke-direct {v3, v9}, Lo0/i;-><init>([Ljava/lang/Object;)V

    :cond_3a
    if-eqz v0, :cond_3b

    invoke-virtual {v3, v0}, Lo0/i;->c(Ljava/lang/Object;)V

    move-object v0, v4

    :cond_3b
    invoke-virtual {v3, v5}, Lo0/i;->c(Ljava/lang/Object;)V

    :cond_3c
    :goto_21
    iget-object v5, v5, Ly0/n;->f:Ly0/n;

    goto :goto_20

    :cond_3d
    const/4 v9, 0x1

    if-ne v8, v9, :cond_3e

    goto :goto_1f

    :cond_3e
    :goto_22
    invoke-static {v3}, Lt1/g;->f(Lo0/i;)Ly0/n;

    move-result-object v0

    goto :goto_1f

    :cond_3f
    const/4 v9, 0x1

    if-eqz v6, :cond_42

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_23
    if-ge v1, v0, :cond_42

    invoke-interface {v6, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lm1/c;

    invoke-interface {v3, v7}, Lm1/c;->M(Landroid/view/KeyEvent;)Z

    move-result v3

    if-eqz v3, :cond_40

    goto :goto_25

    :cond_40
    add-int/lit8 v1, v1, 0x1

    goto :goto_23

    :cond_41
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_42
    :goto_24
    invoke-super/range {p0 .. p1}, Landroid/view/ViewGroup;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_43

    :goto_25
    move v8, v9

    goto :goto_26

    :cond_43
    const/4 v8, 0x0

    goto :goto_26

    :cond_44
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "visitLocalDescendants called on an unattached node"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_45
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Event can\'t be processed because we do not have an active focus target."

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_46
    move-object/from16 v2, p0

    move-object v7, v0

    invoke-super/range {p0 .. p1}, Landroid/view/ViewGroup;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result v8

    :goto_26
    return v8
.end method

.method public final dispatchKeyEventPreIme(Landroid/view/KeyEvent;)Z
    .locals 10

    invoke-virtual {p0}, Landroid/view/View;->isFocused()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-virtual {p0}, Lu1/w;->getFocusOwner()Lc1/e;

    move-result-object v0

    check-cast v0, Lc1/f;

    iget-object v0, v0, Lc1/f;->a:Lc1/p;

    invoke-static {v0}, Landroidx/compose/ui/focus/a;->f(Lc1/p;)Lc1/p;

    move-result-object v0

    if-eqz v0, :cond_a

    iget-object v1, v0, Ly0/n;->a:Ly0/n;

    iget-boolean v2, v1, Ly0/n;->t:Z

    if-eqz v2, :cond_9

    iget-object v1, v1, Ly0/n;->e:Ly0/n;

    invoke-static {v0}, Lt1/g;->y(Lt1/n;)Landroidx/compose/ui/node/a;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_a

    iget-object v2, v0, Landroidx/compose/ui/node/a;->C:Lt1/x0;

    iget-object v2, v2, Lt1/x0;->e:Ly0/n;

    iget v2, v2, Ly0/n;->d:I

    const/high16 v3, 0x20000

    and-int/2addr v2, v3

    const/4 v4, 0x0

    if-eqz v2, :cond_7

    :goto_1
    if-eqz v1, :cond_7

    iget v2, v1, Ly0/n;->c:I

    and-int/2addr v2, v3

    if-eqz v2, :cond_6

    move-object v2, v1

    move-object v5, v4

    :goto_2
    if-eqz v2, :cond_6

    iget v6, v2, Ly0/n;->c:I

    and-int/2addr v6, v3

    if-eqz v6, :cond_5

    instance-of v6, v2, Lt1/o;

    if-eqz v6, :cond_5

    move-object v6, v2

    check-cast v6, Lt1/o;

    iget-object v6, v6, Lt1/o;->v:Ly0/n;

    const/4 v7, 0x0

    :goto_3
    const/4 v8, 0x1

    if-eqz v6, :cond_4

    iget v9, v6, Ly0/n;->c:I

    and-int/2addr v9, v3

    if-eqz v9, :cond_3

    add-int/lit8 v7, v7, 0x1

    if-ne v7, v8, :cond_0

    move-object v2, v6

    goto :goto_4

    :cond_0
    if-nez v5, :cond_1

    new-instance v5, Lo0/i;

    const/16 v8, 0x10

    new-array v8, v8, [Ly0/n;

    invoke-direct {v5, v8}, Lo0/i;-><init>([Ljava/lang/Object;)V

    :cond_1
    if-eqz v2, :cond_2

    invoke-virtual {v5, v2}, Lo0/i;->c(Ljava/lang/Object;)V

    move-object v2, v4

    :cond_2
    invoke-virtual {v5, v6}, Lo0/i;->c(Ljava/lang/Object;)V

    :cond_3
    :goto_4
    iget-object v6, v6, Ly0/n;->f:Ly0/n;

    goto :goto_3

    :cond_4
    if-ne v7, v8, :cond_5

    goto :goto_2

    :cond_5
    invoke-static {v5}, Lt1/g;->f(Lo0/i;)Ly0/n;

    move-result-object v2

    goto :goto_2

    :cond_6
    iget-object v1, v1, Ly0/n;->e:Ly0/n;

    goto :goto_1

    :cond_7
    invoke-virtual {v0}, Landroidx/compose/ui/node/a;->q()Landroidx/compose/ui/node/a;

    move-result-object v0

    if-eqz v0, :cond_8

    iget-object v1, v0, Landroidx/compose/ui/node/a;->C:Lt1/x0;

    if-eqz v1, :cond_8

    iget-object v1, v1, Lt1/x0;->d:Lt1/s1;

    goto :goto_0

    :cond_8
    move-object v1, v4

    goto :goto_0

    :cond_9
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "visitAncestors called on an unattached node"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_a
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->dispatchKeyEventPreIme(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public final dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 5

    iget-boolean v0, p0, Lu1/w;->x0:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lu1/w;->w0:Landroidx/activity/d;

    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    iget-object v2, p0, Lu1/w;->r0:Landroid/view/MotionEvent;

    invoke-static {v2}, Ld7/a;->j(Ljava/lang/Object;)V

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v3

    if-nez v3, :cond_1

    invoke-virtual {v2}, Landroid/view/MotionEvent;->getSource()I

    move-result v3

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getSource()I

    move-result v4

    if-ne v3, v4, :cond_1

    invoke-virtual {v2, v1}, Landroid/view/MotionEvent;->getToolType(I)I

    move-result v2

    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getToolType(I)I

    move-result v3

    if-eq v2, v3, :cond_0

    goto :goto_0

    :cond_0
    iput-boolean v1, p0, Lu1/w;->x0:Z

    goto :goto_1

    :cond_1
    :goto_0
    invoke-virtual {v0}, Landroidx/activity/d;->run()V

    :cond_2
    :goto_1
    invoke-static {p1}, Lu1/w;->n(Landroid/view/MotionEvent;)Z

    move-result v0

    if-nez v0, :cond_6

    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_2

    :cond_3
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    const/4 v2, 0x2

    if-ne v0, v2, :cond_4

    invoke-virtual {p0, p1}, Lu1/w;->p(Landroid/view/MotionEvent;)Z

    move-result v0

    if-nez v0, :cond_4

    return v1

    :cond_4
    invoke-virtual {p0, p1}, Lu1/w;->k(Landroid/view/MotionEvent;)I

    move-result p1

    and-int/lit8 v0, p1, 0x2

    const/4 v2, 0x1

    if-eqz v0, :cond_5

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    invoke-interface {v0, v2}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    :cond_5
    and-int/2addr p1, v2

    if-eqz p1, :cond_6

    move v1, v2

    :cond_6
    :goto_2
    return v1
.end method

.method public final findViewByAccessibilityIdTraversal(I)Landroid/view/View;
    .locals 7

    const/4 v0, 0x0

    :try_start_0
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1d

    if-lt v1, v2, :cond_0

    const-class v1, Landroid/view/View;

    const-string v2, "findViewByAccessibilityIdTraversal"

    const/4 v3, 0x1

    new-array v4, v3, [Ljava/lang/Class;

    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const/4 v6, 0x0

    aput-object v5, v4, v6

    invoke-virtual {v1, v2, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    new-array v2, v3, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v2, v6

    invoke-virtual {v1, p0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    instance-of v1, p1, Landroid/view/View;

    if-eqz v1, :cond_1

    check-cast p1, Landroid/view/View;

    move-object v0, p1

    goto :goto_0

    :cond_0
    invoke-static {p0, p1}, Lu1/w;->i(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_1
    :goto_0
    return-object v0
.end method

.method public bridge synthetic getAccessibilityManager()Lu1/i;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lu1/w;->getAccessibilityManager()Lu1/k;

    move-result-object v0

    return-object v0
.end method

.method public getAccessibilityManager()Lu1/k;
    .locals 1

    .line 1
    iget-object v0, p0, Lu1/w;->E:Lu1/k;

    return-object v0
.end method

.method public final getAndroidViewsHandler$ui_release()Lu1/j1;
    .locals 2

    iget-object v0, p0, Lu1/w;->H:Lu1/j1;

    if-nez v0, :cond_0

    new-instance v0, Lu1/j1;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lu1/j1;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lu1/w;->H:Lu1/j1;

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_0
    iget-object v0, p0, Lu1/w;->H:Lu1/j1;

    invoke-static {v0}, Ld7/a;->j(Ljava/lang/Object;)V

    return-object v0
.end method

.method public getAutofill()Lz0/b;
    .locals 1

    iget-object v0, p0, Lu1/w;->B:Lz0/a;

    return-object v0
.end method

.method public getAutofillTree()Lz0/f;
    .locals 1

    iget-object v0, p0, Lu1/w;->u:Lz0/f;

    return-object v0
.end method

.method public getClipboardManager()Lu1/l;
    .locals 1

    .line 1
    iget-object v0, p0, Lu1/w;->D:Lu1/l;

    return-object v0
.end method

.method public bridge synthetic getClipboardManager()Lu1/p1;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lu1/w;->getClipboardManager()Lu1/l;

    move-result-object v0

    return-object v0
.end method

.method public final getConfigurationChangeObserver()Lc9/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lc9/c;"
        }
    .end annotation

    iget-object v0, p0, Lu1/w;->A:Lc9/c;

    return-object v0
.end method

.method public getCoroutineContext()Lu8/j;
    .locals 1

    iget-object v0, p0, Lu1/w;->a:Lu8/j;

    return-object v0
.end method

.method public getDensity()Lm2/b;
    .locals 1

    iget-object v0, p0, Lu1/w;->e:Lm2/d;

    return-object v0
.end method

.method public getDragAndDropManager()La1/b;
    .locals 1

    iget-object v0, p0, Lu1/w;->n:Lu1/y1;

    return-object v0
.end method

.method public getFocusOwner()Lc1/e;
    .locals 1

    iget-object v0, p0, Lu1/w;->f:Lc1/f;

    return-object v0
.end method

.method public final getFocusedRect(Landroid/graphics/Rect;)V
    .locals 2

    invoke-virtual {p0}, Lu1/w;->getFocusOwner()Lc1/e;

    move-result-object v0

    check-cast v0, Lc1/f;

    iget-object v0, v0, Lc1/f;->a:Lc1/p;

    invoke-static {v0}, Landroidx/compose/ui/focus/a;->f(Lc1/p;)Lc1/p;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-static {v0}, Landroidx/compose/ui/focus/a;->i(Lc1/p;)Ld1/d;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_1

    iget v1, v0, Ld1/d;->a:F

    invoke-static {v1}, Ld7/t;->p0(F)I

    move-result v1

    iput v1, p1, Landroid/graphics/Rect;->left:I

    iget v1, v0, Ld1/d;->b:F

    invoke-static {v1}, Ld7/t;->p0(F)I

    move-result v1

    iput v1, p1, Landroid/graphics/Rect;->top:I

    iget v1, v0, Ld1/d;->c:F

    invoke-static {v1}, Ld7/t;->p0(F)I

    move-result v1

    iput v1, p1, Landroid/graphics/Rect;->right:I

    iget v0, v0, Ld1/d;->d:F

    invoke-static {v0}, Ld7/t;->p0(F)I

    move-result v0

    iput v0, p1, Landroid/graphics/Rect;->bottom:I

    sget-object v1, Lq8/l;->a:Lq8/l;

    :cond_1
    if-nez v1, :cond_2

    invoke-super {p0, p1}, Landroid/view/View;->getFocusedRect(Landroid/graphics/Rect;)V

    :cond_2
    return-void
.end method

.method public getFontFamilyResolver()Lf2/d;
    .locals 1

    iget-object v0, p0, Lu1/w;->k0:Lm0/n1;

    invoke-virtual {v0}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf2/d;

    return-object v0
.end method

.method public getFontLoader()Lf2/c;
    .locals 1

    iget-object v0, p0, Lu1/w;->j0:Lu1/c2;

    return-object v0
.end method

.method public getHapticFeedBack()Lk1/a;
    .locals 1

    iget-object v0, p0, Lu1/w;->n0:Lk1/c;

    return-object v0
.end method

.method public getHasPendingMeasureOrLayout()Z
    .locals 1

    iget-object v0, p0, Lu1/w;->L:Lt1/t0;

    iget-object v0, v0, Lt1/t0;->b:Lt1/r;

    invoke-virtual {v0}, Lt1/r;->b()Z

    move-result v0

    return v0
.end method

.method public getInputModeManager()Ll1/b;
    .locals 1

    iget-object v0, p0, Lu1/w;->o0:Ll1/c;

    return-object v0
.end method

.method public final getLastMatrixRecalculationAnimationTime$ui_release()J
    .locals 2

    iget-wide v0, p0, Lu1/w;->S:J

    return-wide v0
.end method

.method public getLayoutDirection()Lm2/l;
    .locals 1

    iget-object v0, p0, Lu1/w;->m0:Lm0/n1;

    invoke-virtual {v0}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm2/l;

    return-object v0
.end method

.method public getMeasureIteration()J
    .locals 2

    iget-object v0, p0, Lu1/w;->L:Lt1/t0;

    iget-boolean v1, v0, Lt1/t0;->c:Z

    if-eqz v1, :cond_0

    iget-wide v0, v0, Lt1/t0;->f:J

    return-wide v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "measureIteration should be only used during the measure/layout pass"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public getModifierLocalManager()Ls1/e;
    .locals 1

    iget-object v0, p0, Lu1/w;->p0:Ls1/e;

    return-object v0
.end method

.method public getPlacementScope()Lr1/w0;
    .locals 2

    sget v0, Lr1/z0;->b:I

    new-instance v0, Lr1/g0;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lr1/g0;-><init>(Ljava/lang/Object;I)V

    return-object v0
.end method

.method public getPointerIconService()Lo1/r;
    .locals 1

    iget-object v0, p0, Lu1/w;->B0:Lu1/t;

    return-object v0
.end method

.method public getRoot()Landroidx/compose/ui/node/a;
    .locals 1

    iget-object v0, p0, Lu1/w;->q:Landroidx/compose/ui/node/a;

    return-object v0
.end method

.method public getRootForTest()Lt1/q1;
    .locals 1

    iget-object v0, p0, Lu1/w;->r:Lu1/w;

    return-object v0
.end method

.method public getSemanticsOwner()Ly1/p;
    .locals 1

    iget-object v0, p0, Lu1/w;->s:Ly1/p;

    return-object v0
.end method

.method public getSharedDrawScope()Lt1/i0;
    .locals 1

    iget-object v0, p0, Lu1/w;->d:Lt1/i0;

    return-object v0
.end method

.method public getShowLayoutBounds()Z
    .locals 1

    iget-boolean v0, p0, Lu1/w;->G:Z

    return v0
.end method

.method public getSnapshotObserver()Lt1/n1;
    .locals 1

    iget-object v0, p0, Lu1/w;->F:Lt1/n1;

    return-object v0
.end method

.method public getSoftwareKeyboardController()Lu1/t2;
    .locals 1

    iget-object v0, p0, Lu1/w;->i0:Lu1/u1;

    return-object v0
.end method

.method public getTextInputService()Lg2/b0;
    .locals 1

    iget-object v0, p0, Lu1/w;->g0:Lg2/b0;

    return-object v0
.end method

.method public getTextToolbar()Lu1/u2;
    .locals 1

    iget-object v0, p0, Lu1/w;->q0:Lu1/a1;

    return-object v0
.end method

.method public getView()Landroid/view/View;
    .locals 0

    return-object p0
.end method

.method public getViewConfiguration()Lu1/y2;
    .locals 1

    iget-object v0, p0, Lu1/w;->M:Lu1/i1;

    return-object v0
.end method

.method public final getViewTreeOwners()Lu1/q;
    .locals 1

    iget-object v0, p0, Lu1/w;->a0:Lm0/j0;

    invoke-virtual {v0}, Lm0/j0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu1/q;

    return-object v0
.end method

.method public getWindowInfo()Lu1/g3;
    .locals 1

    iget-object v0, p0, Lu1/w;->o:Lu1/h3;

    return-object v0
.end method

.method public final j(Landroidx/compose/ui/node/a;Z)V
    .locals 1

    iget-object v0, p0, Lu1/w;->L:Lt1/t0;

    invoke-virtual {v0, p1, p2}, Lt1/t0;->d(Landroidx/compose/ui/node/a;Z)V

    return-void
.end method

.method public final k(Landroid/view/MotionEvent;)I
    .locals 12

    iget-object v0, p0, Lu1/w;->Q:[F

    iget-object v1, p0, Lu1/w;->v0:Lh/a;

    invoke-virtual {p0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    const/4 v1, 0x0

    :try_start_0
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    move-result-wide v2

    iput-wide v2, p0, Lu1/w;->S:J

    iget-object v2, p0, Lu1/w;->z0:Lu1/l1;

    invoke-interface {v2, p0, v0}, Lu1/l1;->a(Landroid/view/View;[F)V

    iget-object v2, p0, Lu1/w;->R:[F

    invoke-static {v0, v2}, Lo1/s;->U([F[F)Z

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    invoke-static {v2, v3}, Ld9/i;->f(FF)J

    move-result-wide v2

    invoke-static {v0, v2, v3}, Le1/a0;->a([FJ)J

    move-result-wide v2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    move-result v0

    invoke-static {v2, v3}, Ld1/c;->d(J)F

    move-result v4

    sub-float/2addr v0, v4

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    move-result v4

    invoke-static {v2, v3}, Ld1/c;->e(J)F

    move-result v2

    sub-float/2addr v4, v2

    invoke-static {v0, v4}, Ld9/i;->f(FF)J

    move-result-wide v2

    iput-wide v2, p0, Lu1/w;->U:J

    const/4 v0, 0x1

    iput-boolean v0, p0, Lu1/w;->T:Z

    invoke-virtual {p0, v1}, Lu1/w;->r(Z)V

    const-string v2, "AndroidOwner:onTouch"

    invoke-static {v2}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v2

    iget-object v9, p0, Lu1/w;->r0:Landroid/view/MotionEvent;

    const/4 v10, 0x3

    if-eqz v9, :cond_0

    invoke-virtual {v9, v1}, Landroid/view/MotionEvent;->getToolType(I)I

    move-result v3

    if-ne v3, v10, :cond_0

    move v11, v0

    goto :goto_0

    :cond_0
    move v11, v1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_4

    :goto_0
    if-eqz v9, :cond_4

    invoke-virtual {v9}, Landroid/view/MotionEvent;->getSource()I

    move-result v3

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getSource()I

    move-result v4

    if-ne v3, v4, :cond_1

    invoke-virtual {v9, v1}, Landroid/view/MotionEvent;->getToolType(I)I

    move-result v3

    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getToolType(I)I

    move-result v4

    if-eq v3, v4, :cond_4

    :cond_1
    invoke-virtual {v9}, Landroid/view/MotionEvent;->getButtonState()I

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {v9}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v3

    if-eqz v3, :cond_3

    const/4 v4, 0x2

    if-eq v3, v4, :cond_3

    const/4 v4, 0x6

    if-eq v3, v4, :cond_3

    invoke-virtual {v9}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v3

    const/16 v4, 0xa

    if-eq v3, v4, :cond_4

    if-eqz v11, :cond_4

    const/16 v5, 0xa

    invoke-virtual {v9}, Landroid/view/MotionEvent;->getEventTime()J

    move-result-wide v6

    const/4 v8, 0x1

    move-object v3, p0

    move-object v4, v9

    invoke-virtual/range {v3 .. v8}, Lu1/w;->C(Landroid/view/MotionEvent;IJZ)V

    goto :goto_2

    :cond_3
    :goto_1
    iget-object v3, p0, Lu1/w;->z:Lo1/y;

    invoke-virtual {v3}, Lo1/y;->b()V

    :cond_4
    :goto_2
    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getToolType(I)I

    move-result v3

    if-ne v3, v10, :cond_5

    goto :goto_3

    :cond_5
    move v0, v1

    :goto_3
    if-nez v11, :cond_6

    if-eqz v0, :cond_6

    if-eq v2, v10, :cond_6

    const/16 v0, 0x9

    if-eq v2, v0, :cond_6

    invoke-virtual {p0, p1}, Lu1/w;->o(Landroid/view/MotionEvent;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v4, 0x9

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getEventTime()J

    move-result-wide v5

    const/4 v7, 0x1

    move-object v2, p0

    move-object v3, p1

    invoke-virtual/range {v2 .. v7}, Lu1/w;->C(Landroid/view/MotionEvent;IJZ)V

    :cond_6
    if-eqz v9, :cond_7

    invoke-virtual {v9}, Landroid/view/MotionEvent;->recycle()V

    :cond_7
    invoke-static {p1}, Landroid/view/MotionEvent;->obtainNoHistory(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    move-result-object v0

    iput-object v0, p0, Lu1/w;->r0:Landroid/view/MotionEvent;

    invoke-virtual {p0, p1}, Lu1/w;->B(Landroid/view/MotionEvent;)I

    move-result p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-static {}, Landroid/os/Trace;->endSection()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    iput-boolean v1, p0, Lu1/w;->T:Z

    return p1

    :catchall_1
    move-exception p1

    goto :goto_5

    :goto_4
    :try_start_3
    invoke-static {}, Landroid/os/Trace;->endSection()V

    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :goto_5
    iput-boolean v1, p0, Lu1/w;->T:Z

    throw p1
.end method

.method public final m(Landroidx/compose/ui/node/a;)V
    .locals 3

    iget-object v0, p0, Lu1/w;->L:Lt1/t0;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lt1/t0;->q(Landroidx/compose/ui/node/a;Z)Z

    invoke-virtual {p1}, Landroidx/compose/ui/node/a;->t()Lo0/i;

    move-result-object p1

    iget v0, p1, Lo0/i;->c:I

    if-lez v0, :cond_1

    iget-object p1, p1, Lo0/i;->a:[Ljava/lang/Object;

    :cond_0
    aget-object v2, p1, v1

    check-cast v2, Landroidx/compose/ui/node/a;

    invoke-virtual {p0, v2}, Lu1/w;->m(Landroidx/compose/ui/node/a;)V

    add-int/lit8 v1, v1, 0x1

    if-lt v1, v0, :cond_0

    :cond_1
    return-void
.end method

.method public final o(Landroid/view/MotionEvent;)Z
    .locals 3

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    const/4 v1, 0x0

    cmpg-float v2, v1, v0

    if-gtz v2, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v2

    int-to-float v2, v2

    cmpg-float v0, v0, v2

    if-gtz v0, :cond_0

    cmpg-float v0, v1, p1

    if-gtz v0, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v0

    int-to-float v0, v0

    cmpg-float p1, p1, v0

    if-gtz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final onAttachedToWindow()V
    .locals 4

    invoke-super {p0}, Landroid/view/ViewGroup;->onAttachedToWindow()V

    invoke-virtual {p0}, Lu1/w;->getRoot()Landroidx/compose/ui/node/a;

    move-result-object v0

    invoke-virtual {p0, v0}, Lu1/w;->m(Landroidx/compose/ui/node/a;)V

    invoke-virtual {p0}, Lu1/w;->getRoot()Landroidx/compose/ui/node/a;

    move-result-object v0

    invoke-static {v0}, Lu1/w;->l(Landroidx/compose/ui/node/a;)V

    invoke-virtual {p0}, Lu1/w;->getSnapshotObserver()Lt1/n1;

    move-result-object v0

    iget-object v0, v0, Lt1/n1;->a:Lw0/a0;

    iget-object v1, v0, Lw0/a0;->d:Ls/i;

    invoke-static {v1}, Lk0/y0;->f(Ls/i;)Lw0/h;

    move-result-object v1

    iput-object v1, v0, Lw0/a0;->g:Lw0/h;

    iget-object v0, p0, Lu1/w;->B:Lz0/a;

    if-eqz v0, :cond_0

    sget-object v1, Lz0/e;->a:Lz0/e;

    invoke-virtual {v1, v0}, Lz0/e;->a(Lz0/a;)V

    :cond_0
    invoke-static {p0}, Lo1/s;->A(Landroid/view/View;)Landroidx/lifecycle/w;

    move-result-object v0

    invoke-static {p0}, Ly3/e;->j0(Landroid/view/View;)Lb4/g;

    move-result-object v1

    invoke-virtual {p0}, Lu1/w;->getViewTreeOwners()Lu1/q;

    move-result-object v2

    if-eqz v2, :cond_1

    if-eqz v0, :cond_4

    if-eqz v1, :cond_4

    iget-object v3, v2, Lu1/q;->a:Landroidx/lifecycle/w;

    if-ne v0, v3, :cond_1

    if-eq v1, v3, :cond_4

    :cond_1
    if-eqz v0, :cond_8

    if-eqz v1, :cond_7

    if-eqz v2, :cond_2

    iget-object v2, v2, Lu1/q;->a:Landroidx/lifecycle/w;

    if-eqz v2, :cond_2

    invoke-interface {v2}, Landroidx/lifecycle/w;->getLifecycle()Landroidx/lifecycle/r;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {v2, p0}, Landroidx/lifecycle/r;->c(Landroidx/lifecycle/v;)V

    :cond_2
    invoke-interface {v0}, Landroidx/lifecycle/w;->getLifecycle()Landroidx/lifecycle/r;

    move-result-object v2

    invoke-virtual {v2, p0}, Landroidx/lifecycle/r;->a(Landroidx/lifecycle/v;)V

    new-instance v2, Lu1/q;

    invoke-direct {v2, v0, v1}, Lu1/q;-><init>(Landroidx/lifecycle/w;Lb4/g;)V

    invoke-direct {p0, v2}, Lu1/w;->set_viewTreeOwners(Lu1/q;)V

    iget-object v0, p0, Lu1/w;->b0:Lc9/c;

    if-eqz v0, :cond_3

    invoke-interface {v0, v2}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    const/4 v0, 0x0

    iput-object v0, p0, Lu1/w;->b0:Lc9/c;

    :cond_4
    invoke-virtual {p0}, Landroid/view/View;->isInTouchMode()Z

    move-result v0

    if-eqz v0, :cond_5

    const/4 v0, 0x1

    goto :goto_0

    :cond_5
    const/4 v0, 0x2

    :goto_0
    iget-object v1, p0, Lu1/w;->o0:Ll1/c;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, Ll1/a;

    invoke-direct {v2, v0}, Ll1/a;-><init>(I)V

    iget-object v0, v1, Ll1/c;->a:Lm0/n1;

    invoke-virtual {v0, v2}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lu1/w;->getViewTreeOwners()Lu1/q;

    move-result-object v0

    invoke-static {v0}, Ld7/a;->j(Ljava/lang/Object;)V

    iget-object v0, v0, Lu1/q;->a:Landroidx/lifecycle/w;

    invoke-interface {v0}, Landroidx/lifecycle/w;->getLifecycle()Landroidx/lifecycle/r;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroidx/lifecycle/r;->a(Landroidx/lifecycle/v;)V

    invoke-virtual {p0}, Lu1/w;->getViewTreeOwners()Lu1/q;

    move-result-object v0

    invoke-static {v0}, Ld7/a;->j(Ljava/lang/Object;)V

    iget-object v0, v0, Lu1/q;->a:Landroidx/lifecycle/w;

    invoke-interface {v0}, Landroidx/lifecycle/w;->getLifecycle()Landroidx/lifecycle/r;

    move-result-object v0

    iget-object v1, p0, Lu1/w;->t:Lu1/p0;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/r;->a(Landroidx/lifecycle/v;)V

    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iget-object v1, p0, Lu1/w;->c0:Lu1/m;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iget-object v1, p0, Lu1/w;->d0:Lu1/n;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnScrollChangedListener(Landroid/view/ViewTreeObserver$OnScrollChangedListener;)V

    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iget-object v1, p0, Lu1/w;->e0:Lu1/o;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnTouchModeChangeListener(Landroid/view/ViewTreeObserver$OnTouchModeChangeListener;)V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_6

    sget-object v0, Lu1/t0;->a:Lu1/t0;

    new-instance v1, Lu1/p;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v0, p0, v1}, Lu1/t0;->b(Landroid/view/View;Landroid/view/translation/ViewTranslationCallback;)V

    :cond_6
    return-void

    :cond_7
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Composed into the View which doesn\'t propagateViewTreeSavedStateRegistryOwner!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Composed into the View which doesn\'t propagate ViewTreeLifecycleOwner!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final onCheckIsTextEditor()Z
    .locals 1

    iget-object v0, p0, Lu1/w;->h0:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La7/a;->w(Ljava/lang/Object;)V

    iget-object v0, p0, Lu1/w;->f0:Lg2/e0;

    iget-boolean v0, v0, Lg2/e0;->d:Z

    return v0
.end method

.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 5

    invoke-super {p0, p1}, Landroid/view/View;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo1/s;->c(Landroid/content/Context;)Lm2/d;

    move-result-object v0

    iput-object v0, p0, Lu1/w;->e:Lm2/d;

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x0

    const/16 v2, 0x1f

    if-lt v0, v2, :cond_0

    invoke-static {p1}, Lb2/s;->a(Landroid/content/res/Configuration;)I

    move-result v3

    goto :goto_0

    :cond_0
    move v3, v1

    :goto_0
    iget v4, p0, Lu1/w;->l0:I

    if-eq v3, v4, :cond_2

    if-lt v0, v2, :cond_1

    invoke-static {p1}, Lb2/s;->a(Landroid/content/res/Configuration;)I

    move-result v1

    :cond_1
    iput v1, p0, Lu1/w;->l0:I

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Li1/b;->l(Landroid/content/Context;)Lf2/f;

    move-result-object v0

    invoke-direct {p0, v0}, Lu1/w;->setFontFamilyResolver(Lf2/d;)V

    :cond_2
    iget-object v0, p0, Lu1/w;->A:Lc9/c;

    invoke-interface {v0, p1}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;
    .locals 14

    iget-object v0, p0, Lu1/w;->h0:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La7/a;->w(Ljava/lang/Object;)V

    iget-object v0, p0, Lu1/w;->f0:Lg2/e0;

    iget-boolean v1, v0, Lg2/e0;->d:Z

    if-nez v1, :cond_0

    const/4 p1, 0x0

    goto/16 :goto_5

    :cond_0
    iget-object v1, v0, Lg2/e0;->h:Lg2/o;

    iget-object v2, v0, Lg2/e0;->g:Lg2/a0;

    iget v3, v1, Lg2/o;->e:I

    const/4 v4, 0x1

    invoke-static {v3, v4}, Lg2/n;->a(II)Z

    move-result v5

    const/4 v6, 0x0

    const/4 v7, 0x4

    const/4 v8, 0x7

    const/4 v9, 0x5

    const/4 v10, 0x6

    const/4 v11, 0x3

    const/4 v12, 0x2

    iget-boolean v13, v1, Lg2/o;->a:Z

    if-eqz v5, :cond_1

    if-eqz v13, :cond_8

    :goto_0
    move v6, v10

    goto :goto_1

    :cond_1
    invoke-static {v3, v6}, Lg2/n;->a(II)Z

    move-result v5

    if-eqz v5, :cond_2

    move v6, v4

    goto :goto_1

    :cond_2
    invoke-static {v3, v12}, Lg2/n;->a(II)Z

    move-result v5

    if-eqz v5, :cond_3

    move v6, v12

    goto :goto_1

    :cond_3
    invoke-static {v3, v10}, Lg2/n;->a(II)Z

    move-result v5

    if-eqz v5, :cond_4

    move v6, v9

    goto :goto_1

    :cond_4
    invoke-static {v3, v9}, Lg2/n;->a(II)Z

    move-result v5

    if-eqz v5, :cond_5

    move v6, v8

    goto :goto_1

    :cond_5
    invoke-static {v3, v11}, Lg2/n;->a(II)Z

    move-result v5

    if-eqz v5, :cond_6

    move v6, v11

    goto :goto_1

    :cond_6
    invoke-static {v3, v7}, Lg2/n;->a(II)Z

    move-result v5

    if-eqz v5, :cond_7

    move v6, v7

    goto :goto_1

    :cond_7
    invoke-static {v3, v8}, Lg2/n;->a(II)Z

    move-result v3

    if-eqz v3, :cond_1a

    goto :goto_0

    :cond_8
    :goto_1
    iput v6, p1, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    iget v3, v1, Lg2/o;->d:I

    invoke-static {v3, v4}, Lf6/a;->D(II)Z

    move-result v5

    if-eqz v5, :cond_9

    iput v4, p1, Landroid/view/inputmethod/EditorInfo;->inputType:I

    goto :goto_2

    :cond_9
    invoke-static {v3, v12}, Lf6/a;->D(II)Z

    move-result v5

    if-eqz v5, :cond_a

    iput v4, p1, Landroid/view/inputmethod/EditorInfo;->inputType:I

    iget v3, p1, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    const/high16 v5, -0x80000000

    or-int/2addr v3, v5

    iput v3, p1, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    goto :goto_2

    :cond_a
    invoke-static {v3, v11}, Lf6/a;->D(II)Z

    move-result v5

    if-eqz v5, :cond_b

    iput v12, p1, Landroid/view/inputmethod/EditorInfo;->inputType:I

    goto :goto_2

    :cond_b
    invoke-static {v3, v7}, Lf6/a;->D(II)Z

    move-result v5

    if-eqz v5, :cond_c

    iput v11, p1, Landroid/view/inputmethod/EditorInfo;->inputType:I

    goto :goto_2

    :cond_c
    invoke-static {v3, v9}, Lf6/a;->D(II)Z

    move-result v5

    if-eqz v5, :cond_d

    const/16 v3, 0x11

    iput v3, p1, Landroid/view/inputmethod/EditorInfo;->inputType:I

    goto :goto_2

    :cond_d
    invoke-static {v3, v10}, Lf6/a;->D(II)Z

    move-result v5

    if-eqz v5, :cond_e

    const/16 v3, 0x21

    iput v3, p1, Landroid/view/inputmethod/EditorInfo;->inputType:I

    goto :goto_2

    :cond_e
    invoke-static {v3, v8}, Lf6/a;->D(II)Z

    move-result v5

    if-eqz v5, :cond_f

    const/16 v3, 0x81

    iput v3, p1, Landroid/view/inputmethod/EditorInfo;->inputType:I

    goto :goto_2

    :cond_f
    const/16 v5, 0x8

    invoke-static {v3, v5}, Lf6/a;->D(II)Z

    move-result v5

    if-eqz v5, :cond_10

    const/16 v3, 0x12

    iput v3, p1, Landroid/view/inputmethod/EditorInfo;->inputType:I

    goto :goto_2

    :cond_10
    const/16 v5, 0x9

    invoke-static {v3, v5}, Lf6/a;->D(II)Z

    move-result v3

    if-eqz v3, :cond_19

    const/16 v3, 0x2002

    iput v3, p1, Landroid/view/inputmethod/EditorInfo;->inputType:I

    :goto_2
    if-nez v13, :cond_11

    iget v3, p1, Landroid/view/inputmethod/EditorInfo;->inputType:I

    and-int/lit8 v5, v3, 0x1

    if-ne v5, v4, :cond_11

    const/high16 v5, 0x20000

    or-int/2addr v3, v5

    iput v3, p1, Landroid/view/inputmethod/EditorInfo;->inputType:I

    iget v3, v1, Lg2/o;->e:I

    invoke-static {v3, v4}, Lg2/n;->a(II)Z

    move-result v3

    if-eqz v3, :cond_11

    iget v3, p1, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    const/high16 v5, 0x40000000    # 2.0f

    or-int/2addr v3, v5

    iput v3, p1, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    :cond_11
    iget v3, p1, Landroid/view/inputmethod/EditorInfo;->inputType:I

    and-int/2addr v3, v4

    if-ne v3, v4, :cond_15

    iget v3, v1, Lg2/o;->b:I

    invoke-static {v3, v4}, Lz6/a;->z(II)Z

    move-result v5

    if-eqz v5, :cond_12

    iget v3, p1, Landroid/view/inputmethod/EditorInfo;->inputType:I

    or-int/lit16 v3, v3, 0x1000

    iput v3, p1, Landroid/view/inputmethod/EditorInfo;->inputType:I

    goto :goto_3

    :cond_12
    invoke-static {v3, v12}, Lz6/a;->z(II)Z

    move-result v5

    if-eqz v5, :cond_13

    iget v3, p1, Landroid/view/inputmethod/EditorInfo;->inputType:I

    or-int/lit16 v3, v3, 0x2000

    iput v3, p1, Landroid/view/inputmethod/EditorInfo;->inputType:I

    goto :goto_3

    :cond_13
    invoke-static {v3, v11}, Lz6/a;->z(II)Z

    move-result v3

    if-eqz v3, :cond_14

    iget v3, p1, Landroid/view/inputmethod/EditorInfo;->inputType:I

    or-int/lit16 v3, v3, 0x4000

    iput v3, p1, Landroid/view/inputmethod/EditorInfo;->inputType:I

    :cond_14
    :goto_3
    iget-boolean v1, v1, Lg2/o;->c:Z

    if-eqz v1, :cond_15

    iget v1, p1, Landroid/view/inputmethod/EditorInfo;->inputType:I

    const v3, 0x8000

    or-int/2addr v1, v3

    iput v1, p1, Landroid/view/inputmethod/EditorInfo;->inputType:I

    :cond_15
    iget-wide v5, v2, Lg2/a0;->b:J

    sget v1, La2/b0;->c:I

    const/16 v1, 0x20

    shr-long v7, v5, v1

    long-to-int v1, v7

    iput v1, p1, Landroid/view/inputmethod/EditorInfo;->initialSelStart:I

    const-wide v7, 0xffffffffL

    and-long/2addr v5, v7

    long-to-int v1, v5

    iput v1, p1, Landroid/view/inputmethod/EditorInfo;->initialSelEnd:I

    iget-object v1, v2, Lg2/a0;->a:La2/e;

    iget-object v1, v1, La2/e;->a:Ljava/lang/String;

    invoke-static {p1, v1}, Lz6/a;->e0(Landroid/view/inputmethod/EditorInfo;Ljava/lang/CharSequence;)V

    iget v1, p1, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    const/high16 v2, 0x2000000

    or-int/2addr v1, v2

    iput v1, p1, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    invoke-static {}, Li3/l;->c()Z

    move-result v1

    if-nez v1, :cond_16

    goto :goto_4

    :cond_16
    invoke-static {}, Li3/l;->a()Li3/l;

    move-result-object v1

    invoke-virtual {v1}, Li3/l;->b()I

    move-result v2

    if-ne v2, v4, :cond_18

    iget-object v2, p1, Landroid/view/inputmethod/EditorInfo;->extras:Landroid/os/Bundle;

    if-nez v2, :cond_17

    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    iput-object v2, p1, Landroid/view/inputmethod/EditorInfo;->extras:Landroid/os/Bundle;

    :cond_17
    iget-object v1, v1, Li3/l;->e:Li3/g;

    invoke-virtual {v1, p1}, Li3/g;->S(Landroid/view/inputmethod/EditorInfo;)V

    :cond_18
    :goto_4
    iget-object p1, v0, Lg2/e0;->g:Lg2/a0;

    iget-object v1, v0, Lg2/e0;->h:Lg2/o;

    iget-boolean v1, v1, Lg2/o;->c:Z

    new-instance v2, Lg2/d0;

    invoke-direct {v2, v0}, Lg2/d0;-><init>(Lg2/e0;)V

    new-instance v3, Lg2/w;

    invoke-direct {v3, p1, v2, v1}, Lg2/w;-><init>(Lg2/a0;Lg2/d0;Z)V

    iget-object p1, v0, Lg2/e0;->i:Ljava/util/ArrayList;

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, v3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object p1, v3

    :goto_5
    return-object p1

    :cond_19
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Invalid Keyboard Type"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1a
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "invalid ImeAction"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final onCreateVirtualViewTranslationRequests([J[ILjava/util/function/Consumer;)V
    .locals 2

    iget-object v0, p0, Lu1/w;->t:Lu1/p0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Lu1/j0;->a:Lu1/j0;

    invoke-virtual {v1, v0, p1, p2, p3}, Lu1/j0;->b(Lu1/p0;[J[ILjava/util/function/Consumer;)V

    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 2

    invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V

    invoke-virtual {p0}, Lu1/w;->getSnapshotObserver()Lt1/n1;

    move-result-object v0

    iget-object v0, v0, Lt1/n1;->a:Lw0/a0;

    iget-object v1, v0, Lw0/a0;->g:Lw0/h;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lw0/h;->a()V

    :cond_0
    invoke-virtual {v0}, Lw0/a0;->b()V

    invoke-virtual {p0}, Lu1/w;->getViewTreeOwners()Lu1/q;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, v0, Lu1/q;->a:Landroidx/lifecycle/w;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Landroidx/lifecycle/w;->getLifecycle()Landroidx/lifecycle/r;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0, p0}, Landroidx/lifecycle/r;->c(Landroidx/lifecycle/v;)V

    :cond_1
    invoke-virtual {p0}, Lu1/w;->getViewTreeOwners()Lu1/q;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v0, v0, Lu1/q;->a:Landroidx/lifecycle/w;

    if-eqz v0, :cond_2

    invoke-interface {v0}, Landroidx/lifecycle/w;->getLifecycle()Landroidx/lifecycle/r;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v1, p0, Lu1/w;->t:Lu1/p0;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/r;->c(Landroidx/lifecycle/v;)V

    :cond_2
    iget-object v0, p0, Lu1/w;->B:Lz0/a;

    if-eqz v0, :cond_3

    sget-object v1, Lz0/e;->a:Lz0/e;

    invoke-virtual {v1, v0}, Lz0/e;->b(Lz0/a;)V

    :cond_3
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iget-object v1, p0, Lu1/w;->c0:Lu1/m;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iget-object v1, p0, Lu1/w;->d0:Lu1/n;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnScrollChangedListener(Landroid/view/ViewTreeObserver$OnScrollChangedListener;)V

    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iget-object v1, p0, Lu1/w;->e0:Lu1/o;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnTouchModeChangeListener(Landroid/view/ViewTreeObserver$OnTouchModeChangeListener;)V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_4

    sget-object v0, Lu1/t0;->a:Lu1/t0;

    invoke-virtual {v0, p0}, Lu1/t0;->a(Landroid/view/View;)V

    :cond_4
    return-void
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 0

    return-void
.end method

.method public final onFocusChanged(ZILandroid/graphics/Rect;)V
    .locals 3

    invoke-super {p0, p1, p2, p3}, Landroid/view/View;->onFocusChanged(ZILandroid/graphics/Rect;)V

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "Owner FocusChanged("

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const/16 p3, 0x29

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string p3, "Compose Focus"

    invoke-static {p3, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Lu1/w;->getFocusOwner()Lc1/e;

    move-result-object p2

    check-cast p2, Lc1/f;

    iget-object p2, p2, Lc1/f;->c:Lc1/q;

    new-instance p3, Lb/f;

    invoke-direct {p3, p0, p1}, Lb/f;-><init>(Lu1/w;Z)V

    iget-object v0, p2, Lc1/q;->b:Lo0/i;

    invoke-virtual {v0, p3}, Lo0/i;->c(Ljava/lang/Object;)V

    iget-boolean p3, p2, Lc1/q;->c:Z

    sget-object v0, Lc1/o;->a:Lc1/o;

    sget-object v1, Lc1/o;->c:Lc1/o;

    const/4 v2, 0x1

    if-eqz p3, :cond_1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lu1/w;->getFocusOwner()Lc1/e;

    move-result-object p1

    check-cast p1, Lc1/f;

    iget-object p1, p1, Lc1/f;->a:Lc1/p;

    invoke-virtual {p1}, Lc1/p;->H0()Lc1/o;

    move-result-object p2

    if-ne p2, v1, :cond_4

    invoke-virtual {p1, v0}, Lc1/p;->K0(Lc1/o;)V

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, Lu1/w;->getFocusOwner()Lc1/e;

    move-result-object p1

    check-cast p1, Lc1/f;

    iget-object p1, p1, Lc1/f;->a:Lc1/p;

    invoke-static {p1, v2, v2}, Landroidx/compose/ui/focus/a;->d(Lc1/p;ZZ)Z

    goto :goto_1

    :cond_1
    :try_start_0
    iput-boolean v2, p2, Lc1/q;->c:Z

    if-eqz p1, :cond_2

    invoke-virtual {p0}, Lu1/w;->getFocusOwner()Lc1/e;

    move-result-object p1

    check-cast p1, Lc1/f;

    iget-object p1, p1, Lc1/f;->a:Lc1/p;

    invoke-virtual {p1}, Lc1/p;->H0()Lc1/o;

    move-result-object p3

    if-ne p3, v1, :cond_3

    invoke-virtual {p1, v0}, Lc1/p;->K0(Lc1/o;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_2
    invoke-virtual {p0}, Lu1/w;->getFocusOwner()Lc1/e;

    move-result-object p1

    check-cast p1, Lc1/f;

    iget-object p1, p1, Lc1/f;->a:Lc1/p;

    invoke-static {p1, v2, v2}, Landroidx/compose/ui/focus/a;->d(Lc1/p;ZZ)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_3
    :goto_0
    invoke-static {p2}, Lc1/q;->b(Lc1/q;)V

    :cond_4
    :goto_1
    return-void

    :goto_2
    invoke-static {p2}, Lc1/q;->b(Lc1/q;)V

    throw p1
.end method

.method public final onLayout(ZIIII)V
    .locals 1

    iget-object p1, p0, Lu1/w;->y0:Lu1/u;

    iget-object v0, p0, Lu1/w;->L:Lt1/t0;

    invoke-virtual {v0, p1}, Lt1/t0;->h(Lu1/u;)Z

    const/4 p1, 0x0

    iput-object p1, p0, Lu1/w;->J:Lm2/a;

    invoke-virtual {p0}, Lu1/w;->D()V

    iget-object p1, p0, Lu1/w;->H:Lu1/j1;

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lu1/w;->getAndroidViewsHandler$ui_release()Lu1/j1;

    move-result-object p1

    sub-int/2addr p4, p2

    sub-int/2addr p5, p3

    const/4 p2, 0x0

    invoke-virtual {p1, p2, p2, p4, p5}, Landroid/view/View;->layout(IIII)V

    :cond_0
    return-void
.end method

.method public final onMeasure(II)V
    .locals 8

    iget-object v0, p0, Lu1/w;->L:Lt1/t0;

    const-string v1, "AndroidOwner:onMeasure"

    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    :try_start_0
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {p0}, Lu1/w;->getRoot()Landroidx/compose/ui/node/a;

    move-result-object v1

    invoke-virtual {p0, v1}, Lu1/w;->m(Landroidx/compose/ui/node/a;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_2

    :cond_0
    :goto_0
    invoke-static {p1}, Lu1/w;->h(I)J

    move-result-wide v1

    const/16 p1, 0x20

    ushr-long v3, v1, p1

    long-to-int v3, v3

    const-wide v4, 0xffffffffL

    and-long/2addr v1, v4

    long-to-int v1, v1

    invoke-static {p2}, Lu1/w;->h(I)J

    move-result-wide v6

    ushr-long p1, v6, p1

    long-to-int p1, p1

    and-long/2addr v4, v6

    long-to-int p2, v4

    invoke-static {v3, v1, p1, p2}, Lo1/s;->a(IIII)J

    move-result-wide p1

    iget-object v1, p0, Lu1/w;->J:Lm2/a;

    if-nez v1, :cond_1

    new-instance v1, Lm2/a;

    invoke-direct {v1, p1, p2}, Lm2/a;-><init>(J)V

    iput-object v1, p0, Lu1/w;->J:Lm2/a;

    const/4 v1, 0x0

    iput-boolean v1, p0, Lu1/w;->K:Z

    goto :goto_1

    :cond_1
    iget-wide v1, v1, Lm2/a;->a:J

    invoke-static {v1, v2, p1, p2}, Lm2/a;->c(JJ)Z

    move-result v1

    if-nez v1, :cond_2

    const/4 v1, 0x1

    iput-boolean v1, p0, Lu1/w;->K:Z

    :cond_2
    :goto_1
    invoke-virtual {v0, p1, p2}, Lt1/t0;->r(J)V

    invoke-virtual {v0}, Lt1/t0;->j()V

    invoke-virtual {p0}, Lu1/w;->getRoot()Landroidx/compose/ui/node/a;

    move-result-object p1

    iget-object p1, p1, Landroidx/compose/ui/node/a;->D:Lt1/n0;

    iget-object p1, p1, Lt1/n0;->o:Lt1/l0;

    iget p1, p1, Lr1/x0;->a:I

    invoke-virtual {p0}, Lu1/w;->getRoot()Landroidx/compose/ui/node/a;

    move-result-object p2

    iget-object p2, p2, Landroidx/compose/ui/node/a;->D:Lt1/n0;

    iget-object p2, p2, Lt1/n0;->o:Lt1/l0;

    iget p2, p2, Lr1/x0;->b:I

    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    iget-object p1, p0, Lu1/w;->H:Lu1/j1;

    if-eqz p1, :cond_3

    invoke-virtual {p0}, Lu1/w;->getAndroidViewsHandler$ui_release()Lu1/j1;

    move-result-object p1

    invoke-virtual {p0}, Lu1/w;->getRoot()Landroidx/compose/ui/node/a;

    move-result-object p2

    iget-object p2, p2, Landroidx/compose/ui/node/a;->D:Lt1/n0;

    iget-object p2, p2, Lt1/n0;->o:Lt1/l0;

    iget p2, p2, Lr1/x0;->a:I

    const/high16 v0, 0x40000000    # 2.0f

    invoke-static {p2, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    invoke-virtual {p0}, Lu1/w;->getRoot()Landroidx/compose/ui/node/a;

    move-result-object v1

    iget-object v1, v1, Landroidx/compose/ui/node/a;->D:Lt1/n0;

    iget-object v1, v1, Lt1/n0;->o:Lt1/l0;

    iget v1, v1, Lr1/x0;->b:I

    invoke-static {v1, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    invoke-virtual {p1, p2, v0}, Landroid/view/View;->measure(II)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_3
    invoke-static {}, Landroid/os/Trace;->endSection()V

    return-void

    :goto_2
    invoke-static {}, Landroid/os/Trace;->endSection()V

    throw p1
.end method

.method public final onProvideAutofillVirtualStructure(Landroid/view/ViewStructure;I)V
    .locals 8

    if-eqz p1, :cond_1

    iget-object p2, p0, Lu1/w;->B:Lz0/a;

    if-eqz p2, :cond_1

    sget-object v0, Lz0/c;->a:Lz0/c;

    iget-object v1, p2, Lz0/a;->b:Lz0/f;

    iget-object v2, v1, Lz0/f;->a:Ljava/util/LinkedHashMap;

    invoke-interface {v2}, Ljava/util/Map;->size()I

    move-result v2

    invoke-virtual {v0, p1, v2}, Lz0/c;->a(Landroid/view/ViewStructure;I)I

    move-result v2

    iget-object v1, v1, Lz0/f;->a:Ljava/util/LinkedHashMap;

    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, La7/a;->w(Ljava/lang/Object;)V

    invoke-virtual {v0, p1, v2}, Lz0/c;->b(Landroid/view/ViewStructure;I)Landroid/view/ViewStructure;

    move-result-object v6

    if-nez v6, :cond_0

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    sget-object v7, Lz0/d;->a:Lz0/d;

    invoke-virtual {v7, p1}, Lz0/d;->a(Landroid/view/ViewStructure;)Landroid/view/autofill/AutofillId;

    move-result-object p1

    invoke-static {p1}, Ld7/a;->j(Ljava/lang/Object;)V

    invoke-virtual {v7, v6, p1, v4}, Lz0/d;->g(Landroid/view/ViewStructure;Landroid/view/autofill/AutofillId;I)V

    iget-object p1, p2, Lz0/a;->a:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    const/4 p1, 0x0

    const/4 v5, 0x0

    move-object v1, v6

    move v2, v4

    move-object v4, p1

    invoke-virtual/range {v0 .. v5}, Lz0/c;->d(Landroid/view/ViewStructure;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x1

    invoke-virtual {v7, v6, p1}, Lz0/d;->h(Landroid/view/ViewStructure;I)V

    const/4 p1, 0x0

    throw p1

    :cond_1
    return-void
.end method

.method public final onRtlPropertiesChanged(I)V
    .locals 2

    iget-boolean v0, p0, Lu1/w;->c:Z

    if-eqz v0, :cond_2

    sget-object v0, Lm2/l;->a:Lm2/l;

    if-eqz p1, :cond_1

    const/4 v1, 0x1

    if-eq p1, v1, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Lm2/l;->b:Lm2/l;

    :cond_1
    :goto_0
    invoke-direct {p0, v0}, Lu1/w;->setLayoutDirection(Lm2/l;)V

    invoke-virtual {p0}, Lu1/w;->getFocusOwner()Lc1/e;

    move-result-object p1

    check-cast p1, Lc1/f;

    iput-object v0, p1, Lc1/f;->e:Lm2/l;

    :cond_2
    return-void
.end method

.method public final onVirtualViewTranslationResponses(Landroid/util/LongSparseArray;)V
    .locals 2

    iget-object v0, p0, Lu1/w;->t:Lu1/p0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Lu1/j0;->a:Lu1/j0;

    invoke-virtual {v1, v0, p1}, Lu1/j0;->c(Lu1/p0;Landroid/util/LongSparseArray;)V

    return-void
.end method

.method public final onWindowFocusChanged(Z)V
    .locals 2

    iget-object v0, p0, Lu1/w;->o:Lu1/h3;

    iget-object v0, v0, Lu1/h3;->a:Lm0/n1;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lu1/w;->A0:Z

    invoke-super {p0, p1}, Landroid/view/View;->onWindowFocusChanged(Z)V

    if-eqz p1, :cond_0

    invoke-static {}, Lk1/b;->a()Z

    move-result p1

    invoke-virtual {p0}, Lu1/w;->getShowLayoutBounds()Z

    move-result v0

    if-eq v0, p1, :cond_0

    invoke-virtual {p0, p1}, Lu1/w;->setShowLayoutBounds(Z)V

    invoke-virtual {p0}, Lu1/w;->getRoot()Landroidx/compose/ui/node/a;

    move-result-object p1

    invoke-static {p1}, Lu1/w;->l(Landroidx/compose/ui/node/a;)V

    :cond_0
    return-void
.end method

.method public final p(Landroid/view/MotionEvent;)Z
    .locals 4

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Lu1/w;->r0:Landroid/view/MotionEvent;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v3

    if-ne v2, v3, :cond_1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    move-result v2

    invoke-virtual {v0}, Landroid/view/MotionEvent;->getRawX()F

    move-result v3

    cmpg-float v2, v2, v3

    if-nez v2, :cond_1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    move-result p1

    invoke-virtual {v0}, Landroid/view/MotionEvent;->getRawY()F

    move-result v0

    cmpg-float p1, p1, v0

    if-nez p1, :cond_1

    const/4 v1, 0x0

    :cond_1
    return v1
.end method

.method public final q(J)J
    .locals 4

    invoke-virtual {p0}, Lu1/w;->y()V

    iget-object v0, p0, Lu1/w;->Q:[F

    invoke-static {v0, p1, p2}, Le1/a0;->a([FJ)J

    move-result-wide p1

    invoke-static {p1, p2}, Ld1/c;->d(J)F

    move-result v0

    iget-wide v1, p0, Lu1/w;->U:J

    invoke-static {v1, v2}, Ld1/c;->d(J)F

    move-result v1

    add-float/2addr v1, v0

    invoke-static {p1, p2}, Ld1/c;->e(J)F

    move-result p1

    iget-wide v2, p0, Lu1/w;->U:J

    invoke-static {v2, v3}, Ld1/c;->e(J)F

    move-result p2

    add-float/2addr p2, p1

    invoke-static {v1, p2}, Ld9/i;->f(FF)J

    move-result-wide p1

    return-wide p1
.end method

.method public final r(Z)V
    .locals 2

    iget-object v0, p0, Lu1/w;->L:Lt1/t0;

    iget-object v1, v0, Lt1/t0;->b:Lt1/r;

    invoke-virtual {v1}, Lt1/r;->b()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, v0, Lt1/t0;->d:Lt1/i1;

    iget-object v1, v1, Lt1/i1;->a:Lo0/i;

    invoke-virtual {v1}, Lo0/i;->l()Z

    move-result v1

    if-eqz v1, :cond_3

    :cond_0
    const-string v1, "AndroidOwner:measureAndLayout"

    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    if-eqz p1, :cond_1

    :try_start_0
    iget-object p1, p0, Lu1/w;->y0:Lu1/u;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {v0, p1}, Lt1/t0;->h(Lu1/u;)Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    :cond_2
    const/4 p1, 0x0

    invoke-virtual {v0, p1}, Lt1/t0;->a(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {}, Landroid/os/Trace;->endSection()V

    :cond_3
    return-void

    :goto_1
    invoke-static {}, Landroid/os/Trace;->endSection()V

    throw p1
.end method

.method public final s(Landroidx/compose/ui/node/a;J)V
    .locals 2

    iget-object v0, p0, Lu1/w;->L:Lt1/t0;

    const-string v1, "AndroidOwner:measureAndLayout"

    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    :try_start_0
    invoke-virtual {v0, p1, p2, p3}, Lt1/t0;->i(Landroidx/compose/ui/node/a;J)V

    iget-object p1, v0, Lt1/t0;->b:Lt1/r;

    invoke-virtual {p1}, Lt1/r;->b()Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    invoke-virtual {v0, p1}, Lt1/t0;->a(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    invoke-static {}, Landroid/os/Trace;->endSection()V

    return-void

    :catchall_0
    move-exception p1

    invoke-static {}, Landroid/os/Trace;->endSection()V

    throw p1
.end method

.method public final setConfigurationChangeObserver(Lc9/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc9/c;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lu1/w;->A:Lc9/c;

    return-void
.end method

.method public final setLastMatrixRecalculationAnimationTime$ui_release(J)V
    .locals 0

    iput-wide p1, p0, Lu1/w;->S:J

    return-void
.end method

.method public final setOnViewTreeOwnersAvailable(Lc9/c;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc9/c;",
            ")V"
        }
    .end annotation

    invoke-virtual {p0}, Lu1/w;->getViewTreeOwners()Lu1/q;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {p1, v0}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v0

    if-nez v0, :cond_1

    iput-object p1, p0, Lu1/w;->b0:Lc9/c;

    :cond_1
    return-void
.end method

.method public setShowLayoutBounds(Z)V
    .locals 0

    iput-boolean p1, p0, Lu1/w;->G:Z

    return-void
.end method

.method public final shouldDelayChildPressedState()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final t(Lt1/j1;Z)V
    .locals 1

    iget-object v0, p0, Lu1/w;->v:Ljava/util/ArrayList;

    if-nez p2, :cond_0

    iget-boolean p2, p0, Lu1/w;->x:Z

    if-nez p2, :cond_3

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    iget-object p2, p0, Lu1/w;->w:Ljava/util/ArrayList;

    if-eqz p2, :cond_3

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    iget-boolean p2, p0, Lu1/w;->x:Z

    if-nez p2, :cond_1

    invoke-interface {v0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    iget-object p2, p0, Lu1/w;->w:Ljava/util/ArrayList;

    if-nez p2, :cond_2

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, Lu1/w;->w:Ljava/util/ArrayList;

    :cond_2
    invoke-interface {p2, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_3
    :goto_0
    return-void
.end method

.method public final u()V
    .locals 9

    iget-boolean v0, p0, Lu1/w;->C:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Lu1/w;->getSnapshotObserver()Lt1/n1;

    move-result-object v0

    iget-object v0, v0, Lt1/n1;->a:Lw0/a0;

    iget-object v2, v0, Lw0/a0;->f:Lo0/i;

    monitor-enter v2

    :try_start_0
    iget-object v0, v0, Lw0/a0;->f:Lo0/i;

    iget v3, v0, Lo0/i;->c:I

    move v4, v1

    move v5, v4

    :goto_0
    if-ge v4, v3, :cond_3

    iget-object v6, v0, Lo0/i;->a:[Ljava/lang/Object;

    aget-object v6, v6, v4

    check-cast v6, Lw0/z;

    invoke-virtual {v6}, Lw0/z;->e()V

    iget-object v6, v6, Lw0/z;->f:Lq/s;

    iget v6, v6, Lq/s;->e:I

    const/4 v7, 0x1

    if-eqz v6, :cond_0

    move v6, v7

    goto :goto_1

    :cond_0
    move v6, v1

    :goto_1
    xor-int/2addr v6, v7

    if-eqz v6, :cond_1

    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    :cond_1
    if-lez v5, :cond_2

    iget-object v6, v0, Lo0/i;->a:[Ljava/lang/Object;

    sub-int v7, v4, v5

    aget-object v8, v6, v4

    aput-object v8, v6, v7

    goto :goto_2

    :catchall_0
    move-exception v0

    goto :goto_3

    :cond_2
    :goto_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_3
    iget-object v4, v0, Lo0/i;->a:[Ljava/lang/Object;

    sub-int v5, v3, v5

    invoke-static {v5, v3, v4}, Lb9/b;->O(II[Ljava/lang/Object;)V

    iput v5, v0, Lo0/i;->c:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    iput-boolean v1, p0, Lu1/w;->C:Z

    goto :goto_4

    :goto_3
    monitor-exit v2

    throw v0

    :cond_4
    :goto_4
    iget-object v0, p0, Lu1/w;->H:Lu1/j1;

    if-eqz v0, :cond_5

    invoke-static {v0}, Lu1/w;->g(Landroid/view/ViewGroup;)V

    :cond_5
    :goto_5
    iget-object v0, p0, Lu1/w;->u0:Lo0/i;

    invoke-virtual {v0}, Lo0/i;->l()Z

    move-result v0

    if-eqz v0, :cond_8

    iget-object v0, p0, Lu1/w;->u0:Lo0/i;

    iget v0, v0, Lo0/i;->c:I

    move v2, v1

    :goto_6
    if-ge v2, v0, :cond_7

    iget-object v3, p0, Lu1/w;->u0:Lo0/i;

    iget-object v4, v3, Lo0/i;->a:[Ljava/lang/Object;

    aget-object v4, v4, v2

    check-cast v4, Lc9/a;

    const/4 v5, 0x0

    invoke-virtual {v3, v2, v5}, Lo0/i;->p(ILjava/lang/Object;)Ljava/lang/Object;

    if-eqz v4, :cond_6

    invoke-interface {v4}, Lc9/a;->invoke()Ljava/lang/Object;

    :cond_6
    add-int/lit8 v2, v2, 0x1

    goto :goto_6

    :cond_7
    iget-object v2, p0, Lu1/w;->u0:Lo0/i;

    invoke-virtual {v2, v1, v0}, Lo0/i;->o(II)V

    goto :goto_5

    :cond_8
    return-void
.end method

.method public final v(Landroidx/compose/ui/node/a;)V
    .locals 2

    iget-object v0, p0, Lu1/w;->t:Lu1/p0;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lu1/p0;->E:Z

    invoke-virtual {v0}, Lu1/p0;->x()Z

    move-result v1

    if-nez v1, :cond_0

    sget-object v1, Lu1/r0;->a:Ld1/d;

    iget-object v1, v0, Lu1/p0;->F:Ll/t;

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1}, Lu1/p0;->A(Landroidx/compose/ui/node/a;)V

    :goto_0
    return-void
.end method

.method public final w(Landroidx/compose/ui/node/a;ZZZ)V
    .locals 1

    iget-object v0, p0, Lu1/w;->L:Lt1/t0;

    if-eqz p2, :cond_0

    invoke-virtual {v0, p1, p3}, Lt1/t0;->o(Landroidx/compose/ui/node/a;Z)Z

    move-result p2

    if-eqz p2, :cond_1

    if-eqz p4, :cond_1

    invoke-virtual {p0, p1}, Lu1/w;->z(Landroidx/compose/ui/node/a;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1, p3}, Lt1/t0;->q(Landroidx/compose/ui/node/a;Z)Z

    move-result p2

    if-eqz p2, :cond_1

    if-eqz p4, :cond_1

    invoke-virtual {p0, p1}, Lu1/w;->z(Landroidx/compose/ui/node/a;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final x()V
    .locals 3

    iget-object v0, p0, Lu1/w;->t:Lu1/p0;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lu1/p0;->E:Z

    invoke-virtual {v0}, Lu1/p0;->x()Z

    move-result v2

    if-nez v2, :cond_0

    sget-object v2, Lu1/r0;->a:Ld1/d;

    iget-object v2, v0, Lu1/p0;->F:Ll/t;

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    iget-boolean v2, v0, Lu1/p0;->S:Z

    if-nez v2, :cond_1

    iput-boolean v1, v0, Lu1/p0;->S:Z

    iget-object v1, v0, Lu1/p0;->r:Landroid/os/Handler;

    iget-object v0, v0, Lu1/p0;->T:Landroidx/activity/d;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_1
    :goto_0
    return-void
.end method

.method public final y()V
    .locals 6

    iget-boolean v0, p0, Lu1/w;->T:Z

    if-nez v0, :cond_1

    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lu1/w;->S:J

    cmp-long v2, v0, v2

    if-eqz v2, :cond_1

    iput-wide v0, p0, Lu1/w;->S:J

    iget-object v0, p0, Lu1/w;->z0:Lu1/l1;

    iget-object v1, p0, Lu1/w;->Q:[F

    invoke-interface {v0, p0, v1}, Lu1/l1;->a(Landroid/view/View;[F)V

    iget-object v0, p0, Lu1/w;->R:[F

    invoke-static {v1, v0}, Lo1/s;->U([F[F)Z

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    move-object v1, p0

    :goto_0
    instance-of v2, v0, Landroid/view/ViewGroup;

    if-eqz v2, :cond_0

    move-object v1, v0

    check-cast v1, Landroid/view/View;

    move-object v0, v1

    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lu1/w;->O:[I

    invoke-virtual {v1, v0}, Landroid/view/View;->getLocationOnScreen([I)V

    const/4 v2, 0x0

    aget v3, v0, v2

    int-to-float v3, v3

    const/4 v4, 0x1

    aget v5, v0, v4

    int-to-float v5, v5

    invoke-virtual {v1, v0}, Landroid/view/View;->getLocationInWindow([I)V

    aget v1, v0, v2

    int-to-float v1, v1

    aget v0, v0, v4

    int-to-float v0, v0

    sub-float/2addr v3, v1

    sub-float/2addr v5, v0

    invoke-static {v3, v5}, Ld9/i;->f(FF)J

    move-result-wide v0

    iput-wide v0, p0, Lu1/w;->U:J

    :cond_1
    return-void
.end method

.method public final z(Landroidx/compose/ui/node/a;)V
    .locals 3

    invoke-virtual {p0}, Landroid/view/View;->isLayoutRequested()Z

    move-result v0

    if-nez v0, :cond_5

    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v0

    if-eqz v0, :cond_5

    if-eqz p1, :cond_2

    :goto_0
    if-eqz p1, :cond_1

    iget-object v0, p1, Landroidx/compose/ui/node/a;->D:Lt1/n0;

    iget-object v0, v0, Lt1/n0;->o:Lt1/l0;

    iget v0, v0, Lt1/l0;->r:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    iget-boolean v0, p0, Lu1/w;->K:Z

    if-nez v0, :cond_0

    invoke-virtual {p1}, Landroidx/compose/ui/node/a;->q()Landroidx/compose/ui/node/a;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, v0, Landroidx/compose/ui/node/a;->C:Lt1/x0;

    iget-object v0, v0, Lt1/x0;->b:Lt1/x;

    iget-wide v0, v0, Lr1/x0;->d:J

    invoke-static {v0, v1}, Lm2/a;->g(J)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-static {v0, v1}, Lm2/a;->f(J)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p1}, Landroidx/compose/ui/node/a;->q()Landroidx/compose/ui/node/a;

    move-result-object p1

    goto :goto_0

    :cond_1
    :goto_1
    invoke-virtual {p0}, Lu1/w;->getRoot()Landroidx/compose/ui/node/a;

    move-result-object v0

    if-ne p1, v0, :cond_2

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void

    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p1

    if-eqz p1, :cond_4

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result p1

    if-nez p1, :cond_3

    goto :goto_2

    :cond_3
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    goto :goto_3

    :cond_4
    :goto_2
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    :cond_5
    :goto_3
    return-void
.end method
