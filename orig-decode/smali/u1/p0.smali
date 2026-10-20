.class public final Lu1/p0;
.super Lb3/c;

# interfaces
.implements Landroidx/lifecycle/g;


# static fields
.field public static final X:[I


# instance fields
.field public A:I

.field public B:Ljava/lang/Integer;

.field public final C:Lq/g;

.field public final D:Lo9/c;

.field public E:Z

.field public F:Ll/t;

.field public final G:Lq/f;

.field public final H:Lq/g;

.field public I:Lu1/e0;

.field public J:Ljava/util/Map;

.field public final K:Lq/g;

.field public final L:Ljava/util/HashMap;

.field public final M:Ljava/util/HashMap;

.field public final N:Ljava/lang/String;

.field public final O:Ljava/lang/String;

.field public final P:Li2/l;

.field public final Q:Ljava/util/LinkedHashMap;

.field public R:Lu1/g0;

.field public S:Z

.field public final T:Landroidx/activity/d;

.field public final U:Ljava/util/ArrayList;

.field public final V:Lu1/l0;

.field public W:I

.field public final d:Lu1/w;

.field public e:I

.field public final f:Lu1/l0;

.field public final n:Landroid/view/accessibility/AccessibilityManager;

.field public final o:Lu1/x;

.field public final p:Lu1/y;

.field public q:Ljava/util/List;

.field public final r:Landroid/os/Handler;

.field public final s:Le/a;

.field public t:I

.field public u:Landroid/view/accessibility/AccessibilityNodeInfo;

.field public v:Z

.field public final w:Ljava/util/HashMap;

.field public final x:Ljava/util/HashMap;

.field public final y:Lq/a0;

.field public final z:Lq/a0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x20

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lu1/p0;->X:[I

    return-void

    :array_0
    .array-data 4
        0x7f080007
        0x7f080008
        0x7f080013
        0x7f08001e
        0x7f080021
        0x7f080022
        0x7f080023
        0x7f080024
        0x7f080025
        0x7f080026
        0x7f080009
        0x7f08000a
        0x7f08000b
        0x7f08000c
        0x7f08000d
        0x7f08000e
        0x7f08000f
        0x7f080010
        0x7f080011
        0x7f080012
        0x7f080014
        0x7f080015
        0x7f080016
        0x7f080017
        0x7f080018
        0x7f080019
        0x7f08001a
        0x7f08001b
        0x7f08001c
        0x7f08001d
        0x7f08001f
        0x7f080020
    .end array-data
.end method

.method public constructor <init>(Lu1/w;)V
    .locals 6

    invoke-direct {p0}, Lb3/c;-><init>()V

    iput-object p1, p0, Lu1/p0;->d:Lu1/w;

    const/high16 v0, -0x80000000

    iput v0, p0, Lu1/p0;->e:I

    new-instance v1, Lu1/l0;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lu1/l0;-><init>(Lu1/p0;I)V

    iput-object v1, p0, Lu1/p0;->f:Lu1/l0;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v3, "accessibility"

    invoke-virtual {v1, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    const-string v3, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager"

    invoke-static {v1, v3}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Landroid/view/accessibility/AccessibilityManager;

    iput-object v1, p0, Lu1/p0;->n:Landroid/view/accessibility/AccessibilityManager;

    new-instance v3, Lu1/x;

    invoke-direct {v3, p0}, Lu1/x;-><init>(Lu1/p0;)V

    iput-object v3, p0, Lu1/p0;->o:Lu1/x;

    new-instance v3, Lu1/y;

    invoke-direct {v3, p0}, Lu1/y;-><init>(Lu1/p0;)V

    iput-object v3, p0, Lu1/p0;->p:Lu1/y;

    const/4 v3, -0x1

    invoke-virtual {v1, v3}, Landroid/view/accessibility/AccessibilityManager;->getEnabledAccessibilityServiceList(I)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lu1/p0;->q:Ljava/util/List;

    const/4 v1, 0x1

    iput v1, p0, Lu1/p0;->W:I

    new-instance v4, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v5

    invoke-direct {v4, v5}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v4, p0, Lu1/p0;->r:Landroid/os/Handler;

    new-instance v4, Le/a;

    new-instance v5, Lu1/c0;

    invoke-direct {v5, p0}, Lu1/c0;-><init>(Lu1/p0;)V

    invoke-direct {v4, v5}, Le/a;-><init>(Ljava/lang/Object;)V

    iput-object v4, p0, Lu1/p0;->s:Le/a;

    iput v0, p0, Lu1/p0;->t:I

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lu1/p0;->w:Ljava/util/HashMap;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lu1/p0;->x:Ljava/util/HashMap;

    new-instance v0, Lq/a0;

    invoke-direct {v0, v2}, Lq/a0;-><init>(I)V

    iput-object v0, p0, Lu1/p0;->y:Lq/a0;

    new-instance v0, Lq/a0;

    invoke-direct {v0, v2}, Lq/a0;-><init>(I)V

    iput-object v0, p0, Lu1/p0;->z:Lq/a0;

    iput v3, p0, Lu1/p0;->A:I

    new-instance v0, Lq/g;

    invoke-direct {v0, v2}, Lq/g;-><init>(I)V

    iput-object v0, p0, Lu1/p0;->C:Lq/g;

    const/4 v0, 0x0

    const/4 v3, 0x6

    invoke-static {v1, v0, v3}, Lz6/a;->a(ILo9/a;I)Lo9/c;

    move-result-object v0

    iput-object v0, p0, Lu1/p0;->D:Lo9/c;

    iput-boolean v1, p0, Lu1/p0;->E:Z

    new-instance v0, Lq/f;

    invoke-direct {v0, v2}, Lq/z;-><init>(I)V

    iput-object v0, p0, Lu1/p0;->G:Lq/f;

    new-instance v0, Lq/g;

    invoke-direct {v0, v2}, Lq/g;-><init>(I)V

    iput-object v0, p0, Lu1/p0;->H:Lq/g;

    sget-object v0, Lr8/s;->a:Lr8/s;

    iput-object v0, p0, Lu1/p0;->J:Ljava/util/Map;

    new-instance v4, Lq/g;

    invoke-direct {v4, v2}, Lq/g;-><init>(I)V

    iput-object v4, p0, Lu1/p0;->K:Lq/g;

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    iput-object v2, p0, Lu1/p0;->L:Ljava/util/HashMap;

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    iput-object v2, p0, Lu1/p0;->M:Ljava/util/HashMap;

    const-string v2, "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL"

    iput-object v2, p0, Lu1/p0;->N:Ljava/lang/String;

    const-string v2, "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL"

    iput-object v2, p0, Lu1/p0;->O:Ljava/lang/String;

    new-instance v2, Li2/l;

    invoke-direct {v2}, Li2/l;-><init>()V

    iput-object v2, p0, Lu1/p0;->P:Li2/l;

    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v2, p0, Lu1/p0;->Q:Ljava/util/LinkedHashMap;

    new-instance v2, Lu1/g0;

    invoke-virtual {p1}, Lu1/w;->getSemanticsOwner()Ly1/p;

    move-result-object v4

    invoke-virtual {v4}, Ly1/p;->a()Ly1/o;

    move-result-object v4

    invoke-direct {v2, v4, v0}, Lu1/g0;-><init>(Ly1/o;Ljava/util/Map;)V

    iput-object v2, p0, Lu1/p0;->R:Lu1/g0;

    new-instance v0, Lk/d;

    const/4 v2, 0x2

    invoke-direct {v0, p0, v2}, Lk/d;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, v0}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    new-instance p1, Landroidx/activity/d;

    invoke-direct {p1, p0, v3}, Landroidx/activity/d;-><init>(Ljava/lang/Object;I)V

    iput-object p1, p0, Lu1/p0;->T:Landroidx/activity/d;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lu1/p0;->U:Ljava/util/ArrayList;

    new-instance p1, Lu1/l0;

    invoke-direct {p1, p0, v1}, Lu1/l0;-><init>(Lu1/p0;I)V

    iput-object p1, p0, Lu1/p0;->V:Lu1/l0;

    return-void
.end method

.method public static final B(Ly1/h;F)Z
    .locals 3

    const/4 v0, 0x0

    cmpg-float v1, p1, v0

    iget-object v2, p0, Ly1/h;->a:Lc9/a;

    if-gez v1, :cond_0

    invoke-interface {v2}, Lc9/a;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    cmpl-float v1, v1, v0

    if-gtz v1, :cond_1

    :cond_0
    cmpl-float p1, p1, v0

    if-lez p1, :cond_2

    invoke-interface {v2}, Lc9/a;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    iget-object p0, p0, Ly1/h;->b:Lc9/a;

    invoke-interface {p0}, Lc9/a;->invoke()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    move-result p0

    cmpg-float p0, p1, p0

    if-gez p0, :cond_2

    :cond_1
    const/4 p0, 0x1

    goto :goto_0

    :cond_2
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final C(Ly1/h;)Z
    .locals 3

    iget-object v0, p0, Ly1/h;->a:Lc9/a;

    invoke-interface {v0}, Lc9/a;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    const/4 v2, 0x0

    cmpl-float v1, v1, v2

    iget-boolean v2, p0, Ly1/h;->c:Z

    if-lez v1, :cond_0

    if-eqz v2, :cond_1

    :cond_0
    invoke-interface {v0}, Lc9/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    iget-object p0, p0, Ly1/h;->b:Lc9/a;

    invoke-interface {p0}, Lc9/a;->invoke()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    move-result p0

    cmpg-float p0, v0, p0

    if-gez p0, :cond_2

    if-eqz v2, :cond_2

    :cond_1
    const/4 p0, 0x1

    goto :goto_0

    :cond_2
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final D(Ly1/h;)Z
    .locals 3

    iget-object v0, p0, Ly1/h;->a:Lc9/a;

    invoke-interface {v0}, Lc9/a;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    iget-object v2, p0, Ly1/h;->b:Lc9/a;

    invoke-interface {v2}, Lc9/a;->invoke()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v2

    cmpg-float v1, v1, v2

    iget-boolean p0, p0, Ly1/h;->c:Z

    if-gez v1, :cond_0

    if-eqz p0, :cond_1

    :cond_0
    invoke-interface {v0}, Lc9/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_2

    if-eqz p0, :cond_2

    :cond_1
    const/4 p0, 0x1

    goto :goto_0

    :cond_2
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static synthetic K(Lu1/p0;IILjava/lang/Integer;I)V
    .locals 1

    and-int/lit8 p4, p4, 0x4

    const/4 v0, 0x0

    if-eqz p4, :cond_0

    move-object p3, v0

    :cond_0
    invoke-virtual {p0, p1, p2, p3, v0}, Lu1/p0;->J(IILjava/lang/Integer;Ljava/util/List;)Z

    return-void
.end method

.method public static R(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
    .locals 3

    if-eqz p0, :cond_3

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const v1, 0x186a0

    if-gt v0, v1, :cond_1

    goto :goto_0

    :cond_1
    const v0, 0x1869f

    invoke-interface {p0, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    invoke-static {v2}, Ljava/lang/Character;->isHighSurrogate(C)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p0, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    invoke-static {v2}, Ljava/lang/Character;->isLowSurrogate(C)Z

    move-result v2

    if-eqz v2, :cond_2

    move v1, v0

    :cond_2
    const/4 v0, 0x0

    invoke-interface {p0, v0, v1}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p0

    const-string v0, "null cannot be cast to non-null type T of androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.trimToSize"

    invoke-static {p0, v0}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_3
    :goto_0
    return-object p0
.end method

.method public static s(Ly1/o;)Z
    .locals 4

    iget-object v0, p0, Ly1/o;->d:Ly1/j;

    sget-object v1, Ly1/r;->B:Ly1/u;

    invoke-static {v0, v1}, Lo1/s;->J(Ly1/j;Ly1/u;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz1/a;

    sget-object v1, Ly1/r;->s:Ly1/u;

    iget-object p0, p0, Ly1/o;->d:Ly1/j;

    invoke-static {p0, v1}, Lo1/s;->J(Ly1/j;Ly1/u;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ly1/g;

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    sget-object v3, Ly1/r;->A:Ly1/u;

    iget-object p0, p0, Ly1/j;->a:Ljava/util/LinkedHashMap;

    invoke-virtual {p0, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    if-nez p0, :cond_1

    const/4 p0, 0x0

    :cond_1
    check-cast p0, Ljava/lang/Boolean;

    if-eqz p0, :cond_4

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    if-nez v1, :cond_2

    goto :goto_1

    :cond_2
    iget p0, v1, Ly1/g;->a:I

    const/4 v1, 0x4

    invoke-static {p0, v1}, Ly1/g;->a(II)Z

    move-result p0

    if-nez p0, :cond_3

    goto :goto_1

    :cond_3
    move v2, v0

    :goto_1
    move v0, v2

    :cond_4
    return v0
.end method

.method public static v(Ly1/o;)Ljava/lang/String;
    .locals 3

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    sget-object v1, Ly1/r;->a:Ly1/u;

    iget-object p0, p0, Ly1/o;->d:Ly1/j;

    iget-object v2, p0, Ly1/j;->a:Ljava/util/LinkedHashMap;

    invoke-interface {v2, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {p0, v1}, Ly1/j;->e(Ly1/u;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    const-string v0, ","

    invoke-static {p0, v0}, Li1/b;->o(Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    sget-object v1, Ly1/i;->h:Ly1/u;

    iget-object p0, p0, Ly1/j;->a:Ljava/util/LinkedHashMap;

    invoke-interface {p0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    sget-object v1, Ly1/r;->x:Ly1/u;

    invoke-virtual {p0, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    if-nez p0, :cond_2

    move-object p0, v0

    :cond_2
    check-cast p0, La2/e;

    if-eqz p0, :cond_3

    iget-object v0, p0, La2/e;->a:Ljava/lang/String;

    :cond_3
    return-object v0

    :cond_4
    sget-object v1, Ly1/r;->u:Ly1/u;

    invoke-virtual {p0, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    if-nez p0, :cond_5

    move-object p0, v0

    :cond_5
    check-cast p0, Ljava/util/List;

    if-eqz p0, :cond_6

    invoke-static {p0}, Lr8/p;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, La2/e;

    if-eqz p0, :cond_6

    iget-object v0, p0, La2/e;->a:Ljava/lang/String;

    :cond_6
    return-object v0
.end method

.method public static w(Ly1/j;)La2/a0;
    .locals 2

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sget-object v1, Ly1/i;->a:Ly1/u;

    iget-object p0, p0, Ly1/j;->a:Ljava/util/LinkedHashMap;

    invoke-virtual {p0, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    const/4 v1, 0x0

    if-nez p0, :cond_0

    move-object p0, v1

    :cond_0
    check-cast p0, Ly1/a;

    if-eqz p0, :cond_1

    iget-object p0, p0, Ly1/a;->b:Lq8/a;

    check-cast p0, Lc9/c;

    if-eqz p0, :cond_1

    invoke-interface {p0, v0}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    if-eqz p0, :cond_1

    const/4 p0, 0x0

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p0

    move-object v1, p0

    check-cast v1, La2/a0;

    :cond_1
    return-object v1
.end method


# virtual methods
.method public final A(Landroidx/compose/ui/node/a;)V
    .locals 1

    iget-object v0, p0, Lu1/p0;->C:Lq/g;

    invoke-virtual {v0, p1}, Lq/g;->add(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Lq8/l;->a:Lq8/l;

    iget-object v0, p0, Lu1/p0;->D:Lo9/c;

    invoke-interface {v0, p1}, Lo9/t;->n(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public final E(I)I
    .locals 1

    iget-object v0, p0, Lu1/p0;->d:Lu1/w;

    invoke-virtual {v0}, Lu1/w;->getSemanticsOwner()Ly1/p;

    move-result-object v0

    invoke-virtual {v0}, Ly1/p;->a()Ly1/o;

    move-result-object v0

    iget v0, v0, Ly1/o;->g:I

    if-ne p1, v0, :cond_0

    const/4 p1, -0x1

    :cond_0
    return p1
.end method

.method public final F(Ly1/o;Lu1/g0;)V
    .locals 10

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {p1, v1, v2}, Ly1/o;->g(ZZ)Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v4

    move v5, v1

    :goto_0
    iget-object v6, p1, Ly1/o;->c:Landroidx/compose/ui/node/a;

    if-ge v5, v4, :cond_2

    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ly1/o;

    invoke-virtual {p0}, Lu1/p0;->r()Ljava/util/Map;

    move-result-object v8

    iget v9, v7, Ly1/o;->g:I

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v8, v9}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1

    iget-object v8, p2, Lu1/g0;->c:Ljava/util/LinkedHashSet;

    iget v7, v7, Ly1/o;->g:I

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v8, v9}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_0

    invoke-virtual {p0, v6}, Lu1/p0;->A(Landroidx/compose/ui/node/a;)V

    return-void

    :cond_0
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v0, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_2
    iget-object p2, p2, Lu1/g0;->c:Ljava/util/LinkedHashSet;

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_3
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    invoke-virtual {p0, v6}, Lu1/p0;->A(Landroidx/compose/ui/node/a;)V

    return-void

    :cond_4
    invoke-virtual {p1, v1, v2}, Ly1/o;->g(ZZ)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p2

    :goto_1
    if-ge v1, p2, :cond_6

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly1/o;

    invoke-virtual {p0}, Lu1/p0;->r()Ljava/util/Map;

    move-result-object v2

    iget v3, v0, Ly1/o;->g:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    iget-object v2, p0, Lu1/p0;->Q:Ljava/util/LinkedHashMap;

    iget v3, v0, Ly1/o;->g:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Ld7/a;->j(Ljava/lang/Object;)V

    check-cast v2, Lu1/g0;

    invoke-virtual {p0, v0, v2}, Lu1/p0;->F(Ly1/o;Lu1/g0;)V

    :cond_5
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_6
    return-void
.end method

.method public final G(Ly1/o;Lu1/g0;)V
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Ly1/o;->g(ZZ)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    move v4, v0

    :goto_0
    if-ge v4, v3, :cond_1

    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ly1/o;

    invoke-virtual {p0}, Lu1/p0;->r()Ljava/util/Map;

    move-result-object v6

    iget v7, v5, Ly1/o;->g:I

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v6, v7}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    iget-object v6, p2, Lu1/g0;->c:Ljava/util/LinkedHashSet;

    iget v7, v5, Ly1/o;->g:I

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v6, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_0

    invoke-virtual {p0, v5}, Lu1/p0;->S(Ly1/o;)V

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    iget-object p2, p0, Lu1/p0;->Q:Ljava/util/LinkedHashMap;

    invoke-virtual {p2}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-virtual {p0}, Lu1/p0;->r()Ljava/util/Map;

    move-result-object v4

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    iget-object v5, p0, Lu1/p0;->G:Lq/f;

    invoke-virtual {v5, v4}, Lq/f;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v5, v3}, Lq/f;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_3
    iget-object v4, p0, Lu1/p0;->H:Lq/g;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v4, v3}, Lq/g;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    invoke-virtual {p1, v0, v1}, Ly1/o;->g(ZZ)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    :goto_2
    if-ge v0, v1, :cond_6

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ly1/o;

    invoke-virtual {p0}, Lu1/p0;->r()Ljava/util/Map;

    move-result-object v3

    iget v4, v2, Ly1/o;->g:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    iget v3, v2, Ly1/o;->g:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {p2, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {p2, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Ld7/a;->j(Ljava/lang/Object;)V

    check-cast v3, Lu1/g0;

    invoke-virtual {p0, v2, v3}, Lu1/p0;->G(Ly1/o;Lu1/g0;)V

    :cond_5
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_6
    return-void
.end method

.method public final H(ILjava/lang/String;)V
    .locals 6

    iget-object v0, p0, Lu1/p0;->F:Ll/t;

    if-nez v0, :cond_0

    return-void

    :cond_0
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1d

    if-ge v1, v2, :cond_1

    return-void

    :cond_1
    int-to-long v3, p1

    if-lt v1, v2, :cond_2

    iget-object p1, v0, Ll/t;->b:Ljava/lang/Object;

    invoke-static {p1}, Lu1/l2;->f(Ljava/lang/Object;)Landroid/view/contentcapture/ContentCaptureSession;

    move-result-object p1

    iget-object v5, v0, Ll/t;->c:Ljava/lang/Object;

    check-cast v5, Landroid/view/View;

    invoke-static {v5}, Lw1/d;->a(Landroid/view/View;)Landroid/view/autofill/AutofillId;

    move-result-object v5

    invoke-static {p1, v5, v3, v4}, Lw1/b;->a(Landroid/view/contentcapture/ContentCaptureSession;Landroid/view/autofill/AutofillId;J)Landroid/view/autofill/AutofillId;

    move-result-object p1

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_4

    if-lt v1, v2, :cond_3

    iget-object v0, v0, Ll/t;->b:Ljava/lang/Object;

    invoke-static {v0}, Lu1/l2;->f(Ljava/lang/Object;)Landroid/view/contentcapture/ContentCaptureSession;

    move-result-object v0

    invoke-static {v0, p1, p2}, Lw1/b;->e(Landroid/view/contentcapture/ContentCaptureSession;Landroid/view/autofill/AutofillId;Ljava/lang/CharSequence;)V

    :cond_3
    return-void

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Invalid content capture ID"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final I(Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 3

    invoke-virtual {p0}, Lu1/p0;->x()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityEvent;->getEventType()I

    move-result v0

    const/16 v2, 0x800

    if-eq v0, v2, :cond_1

    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityEvent;->getEventType()I

    move-result v0

    const v2, 0x8000

    if-ne v0, v2, :cond_2

    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lu1/p0;->v:Z

    :cond_2
    :try_start_0
    iget-object v0, p0, Lu1/p0;->f:Lu1/l0;

    invoke-virtual {v0, p1}, Lu1/l0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-boolean v1, p0, Lu1/p0;->v:Z

    return p1

    :catchall_0
    move-exception p1

    iput-boolean v1, p0, Lu1/p0;->v:Z

    throw p1
.end method

.method public final J(IILjava/lang/Integer;Ljava/util/List;)Z
    .locals 1

    const/high16 v0, -0x80000000

    if-eq p1, v0, :cond_3

    invoke-virtual {p0}, Lu1/p0;->x()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lu1/r0;->a:Ld1/d;

    iget-object v0, p0, Lu1/p0;->F:Ll/t;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lu1/p0;->m(II)Landroid/view/accessibility/AccessibilityEvent;

    move-result-object p1

    if-eqz p3, :cond_1

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/view/accessibility/AccessibilityEvent;->setContentChangeTypes(I)V

    :cond_1
    if-eqz p4, :cond_2

    const-string p2, ","

    invoke-static {p4, p2}, Li1/b;->o(Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/view/accessibility/AccessibilityRecord;->setContentDescription(Ljava/lang/CharSequence;)V

    :cond_2
    invoke-virtual {p0, p1}, Lu1/p0;->I(Landroid/view/accessibility/AccessibilityEvent;)Z

    move-result p1

    return p1

    :cond_3
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final L(IILjava/lang/String;)V
    .locals 1

    invoke-virtual {p0, p1}, Lu1/p0;->E(I)I

    move-result p1

    const/16 v0, 0x20

    invoke-virtual {p0, p1, v0}, Lu1/p0;->m(II)Landroid/view/accessibility/AccessibilityEvent;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/view/accessibility/AccessibilityEvent;->setContentChangeTypes(I)V

    if-eqz p3, :cond_0

    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityRecord;->getText()Ljava/util/List;

    move-result-object p2

    invoke-interface {p2, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    invoke-virtual {p0, p1}, Lu1/p0;->I(Landroid/view/accessibility/AccessibilityEvent;)Z

    return-void
.end method

.method public final M(I)V
    .locals 6

    iget-object v0, p0, Lu1/p0;->I:Lu1/e0;

    if-eqz v0, :cond_1

    iget-object v1, v0, Lu1/e0;->a:Ly1/o;

    iget v2, v1, Ly1/o;->g:I

    if-eq p1, v2, :cond_0

    return-void

    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v2

    iget-wide v4, v0, Lu1/e0;->f:J

    sub-long/2addr v2, v4

    const-wide/16 v4, 0x3e8

    cmp-long p1, v2, v4

    if-gtz p1, :cond_1

    iget p1, v1, Ly1/o;->g:I

    invoke-virtual {p0, p1}, Lu1/p0;->E(I)I

    move-result p1

    const/high16 v2, 0x20000

    invoke-virtual {p0, p1, v2}, Lu1/p0;->m(II)Landroid/view/accessibility/AccessibilityEvent;

    move-result-object p1

    iget v2, v0, Lu1/e0;->d:I

    invoke-virtual {p1, v2}, Landroid/view/accessibility/AccessibilityRecord;->setFromIndex(I)V

    iget v2, v0, Lu1/e0;->e:I

    invoke-virtual {p1, v2}, Landroid/view/accessibility/AccessibilityRecord;->setToIndex(I)V

    iget v2, v0, Lu1/e0;->b:I

    invoke-virtual {p1, v2}, Landroid/view/accessibility/AccessibilityEvent;->setAction(I)V

    iget v0, v0, Lu1/e0;->c:I

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityEvent;->setMovementGranularity(I)V

    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityRecord;->getText()Ljava/util/List;

    move-result-object v0

    invoke-static {v1}, Lu1/p0;->v(Ly1/o;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0, p1}, Lu1/p0;->I(Landroid/view/accessibility/AccessibilityEvent;)Z

    :cond_1
    const/4 p1, 0x0

    iput-object p1, p0, Lu1/p0;->I:Lu1/e0;

    return-void
.end method

.method public final N(Landroidx/compose/ui/node/a;Lq/g;)V
    .locals 4

    invoke-virtual {p1}, Landroidx/compose/ui/node/a;->C()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lu1/p0;->d:Lu1/w;

    invoke-virtual {v0}, Lu1/w;->getAndroidViewsHandler$ui_release()Lu1/j1;

    move-result-object v0

    invoke-virtual {v0}, Lu1/j1;->getLayoutNodeToHolder()Ljava/util/HashMap;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    :cond_1
    iget-object v0, p0, Lu1/p0;->C:Lq/g;

    iget v1, v0, Lq/g;->c:I

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_3

    iget-object v3, v0, Lq/g;->b:[Ljava/lang/Object;

    aget-object v3, v3, v2

    check-cast v3, Landroidx/compose/ui/node/a;

    invoke-static {v3, p1}, Lu1/r0;->f(Landroidx/compose/ui/node/a;Landroidx/compose/ui/node/a;)Z

    move-result v3

    if-eqz v3, :cond_2

    return-void

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    iget-object v0, p1, Landroidx/compose/ui/node/a;->C:Lt1/x0;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lt1/x0;->d(I)Z

    move-result v0

    if-eqz v0, :cond_4

    goto :goto_1

    :cond_4
    sget-object v0, Lu1/s;->e:Lu1/s;

    invoke-static {p1, v0}, Lu1/r0;->d(Landroidx/compose/ui/node/a;Lu1/s;)Landroidx/compose/ui/node/a;

    move-result-object p1

    :goto_1
    if-eqz p1, :cond_8

    invoke-virtual {p1}, Landroidx/compose/ui/node/a;->n()Ly1/j;

    move-result-object v0

    if-nez v0, :cond_5

    goto :goto_2

    :cond_5
    iget-boolean v0, v0, Ly1/j;->b:Z

    if-nez v0, :cond_6

    sget-object v0, Lu1/s;->d:Lu1/s;

    invoke-static {p1, v0}, Lu1/r0;->d(Landroidx/compose/ui/node/a;Lu1/s;)Landroidx/compose/ui/node/a;

    move-result-object v0

    if-eqz v0, :cond_6

    move-object p1, v0

    :cond_6
    iget p1, p1, Landroidx/compose/ui/node/a;->b:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p2, v0}, Lq/g;->add(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_7

    return-void

    :cond_7
    invoke-virtual {p0, p1}, Lu1/p0;->E(I)I

    move-result p1

    const/16 p2, 0x800

    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {p0, p1, p2, v0, v1}, Lu1/p0;->K(Lu1/p0;IILjava/lang/Integer;I)V

    :cond_8
    :goto_2
    return-void
.end method

.method public final O(Landroidx/compose/ui/node/a;)V
    .locals 3

    invoke-virtual {p1}, Landroidx/compose/ui/node/a;->C()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lu1/p0;->d:Lu1/w;

    invoke-virtual {v0}, Lu1/w;->getAndroidViewsHandler$ui_release()Lu1/j1;

    move-result-object v0

    invoke-virtual {v0}, Lu1/j1;->getLayoutNodeToHolder()Ljava/util/HashMap;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    :cond_1
    iget p1, p1, Landroidx/compose/ui/node/a;->b:I

    iget-object v0, p0, Lu1/p0;->w:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly1/h;

    iget-object v1, p0, Lu1/p0;->x:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ly1/h;

    if-nez v0, :cond_2

    if-nez v1, :cond_2

    return-void

    :cond_2
    const/16 v2, 0x1000

    invoke-virtual {p0, p1, v2}, Lu1/p0;->m(II)Landroid/view/accessibility/AccessibilityEvent;

    move-result-object p1

    if-eqz v0, :cond_3

    iget-object v2, v0, Ly1/h;->a:Lc9/a;

    invoke-interface {v2}, Lc9/a;->invoke()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v2

    float-to-int v2, v2

    invoke-virtual {p1, v2}, Landroid/view/accessibility/AccessibilityRecord;->setScrollX(I)V

    iget-object v0, v0, Ly1/h;->b:Lc9/a;

    invoke-interface {v0}, Lc9/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    float-to-int v0, v0

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityRecord;->setMaxScrollX(I)V

    :cond_3
    if-eqz v1, :cond_4

    iget-object v0, v1, Ly1/h;->a:Lc9/a;

    invoke-interface {v0}, Lc9/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    float-to-int v0, v0

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityRecord;->setScrollY(I)V

    iget-object v0, v1, Ly1/h;->b:Lc9/a;

    invoke-interface {v0}, Lc9/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    float-to-int v0, v0

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityRecord;->setMaxScrollY(I)V

    :cond_4
    invoke-virtual {p0, p1}, Lu1/p0;->I(Landroid/view/accessibility/AccessibilityEvent;)Z

    return-void
.end method

.method public final P(Ly1/o;IIZ)Z
    .locals 10

    sget-object v0, Ly1/i;->g:Ly1/u;

    iget-object v1, p1, Ly1/o;->d:Ly1/j;

    iget-object v2, v1, Ly1/j;->a:Ljava/util/LinkedHashMap;

    invoke-interface {v2, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    invoke-static {p1}, Lu1/r0;->a(Ly1/o;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v1, v0}, Ly1/j;->e(Ly1/u;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ly1/a;

    iget-object p1, p1, Ly1/a;->b:Lq8/a;

    check-cast p1, Lc9/f;

    if-eqz p1, :cond_0

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-static {p4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p4

    invoke-interface {p1, p2, p3, p4}, Lc9/f;->e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    :cond_0
    return v3

    :cond_1
    if-ne p2, p3, :cond_2

    iget p4, p0, Lu1/p0;->A:I

    if-ne p3, p4, :cond_2

    return v3

    :cond_2
    invoke-static {p1}, Lu1/p0;->v(Ly1/o;)Ljava/lang/String;

    move-result-object v9

    if-nez v9, :cond_3

    return v3

    :cond_3
    if-ltz p2, :cond_4

    if-ne p2, p3, :cond_4

    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result p4

    if-gt p3, p4, :cond_4

    goto :goto_0

    :cond_4
    const/4 p2, -0x1

    :goto_0
    iput p2, p0, Lu1/p0;->A:I

    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result p2

    const/4 p3, 0x1

    if-lez p2, :cond_5

    move v3, p3

    :cond_5
    iget p1, p1, Ly1/o;->g:I

    invoke-virtual {p0, p1}, Lu1/p0;->E(I)I

    move-result v5

    const/4 p2, 0x0

    if-eqz v3, :cond_6

    iget p4, p0, Lu1/p0;->A:I

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    move-object v6, p4

    goto :goto_1

    :cond_6
    move-object v6, p2

    :goto_1
    if-eqz v3, :cond_7

    iget p4, p0, Lu1/p0;->A:I

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    move-object v7, p4

    goto :goto_2

    :cond_7
    move-object v7, p2

    :goto_2
    if-eqz v3, :cond_8

    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    :cond_8
    move-object v8, p2

    move-object v4, p0

    invoke-virtual/range {v4 .. v9}, Lu1/p0;->n(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/CharSequence;)Landroid/view/accessibility/AccessibilityEvent;

    move-result-object p2

    invoke-virtual {p0, p2}, Lu1/p0;->I(Landroid/view/accessibility/AccessibilityEvent;)Z

    invoke-virtual {p0, p1}, Lu1/p0;->M(I)V

    return p3
.end method

.method public final Q(Ljava/util/ArrayList;Z)Ljava/util/ArrayList;
    .locals 17

    move-object/from16 v0, p0

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v3

    const/4 v4, 0x0

    move v5, v4

    :goto_0
    if-ge v5, v3, :cond_0

    move-object/from16 v6, p1

    invoke-interface {v6, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ly1/o;

    invoke-virtual {v0, v7, v2, v1}, Lu1/p0;->o(Ly1/o;Ljava/util/ArrayList;Ljava/util/LinkedHashMap;)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_0
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v2}, Ld7/t;->Y(Ljava/util/List;)I

    move-result v5

    if-ltz v5, :cond_5

    move v6, v4

    :goto_1
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ly1/o;

    if-eqz v6, :cond_4

    invoke-virtual {v7}, Ly1/o;->f()Ld1/d;

    move-result-object v8

    invoke-virtual {v7}, Ly1/o;->f()Ld1/d;

    move-result-object v9

    iget v8, v8, Ld1/d;->b:F

    iget v9, v9, Ld1/d;->d:F

    cmpl-float v10, v8, v9

    if-ltz v10, :cond_1

    const/4 v10, 0x1

    goto :goto_2

    :cond_1
    move v10, v4

    :goto_2
    invoke-static {v3}, Ld7/t;->Y(Ljava/util/List;)I

    move-result v12

    if-ltz v12, :cond_4

    move v13, v4

    :goto_3
    invoke-virtual {v3, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lq8/f;

    iget-object v14, v14, Lq8/f;->a:Ljava/lang/Object;

    check-cast v14, Ld1/d;

    iget v15, v14, Ld1/d;->b:F

    iget v11, v14, Ld1/d;->d:F

    cmpl-float v16, v15, v11

    if-ltz v16, :cond_2

    const/16 v16, 0x1

    goto :goto_4

    :cond_2
    move/from16 v16, v4

    :goto_4
    if-nez v10, :cond_3

    if-nez v16, :cond_3

    invoke-static {v8, v15}, Ljava/lang/Math;->max(FF)F

    move-result v15

    invoke-static {v9, v11}, Ljava/lang/Math;->min(FF)F

    move-result v16

    cmpg-float v15, v15, v16

    if-gez v15, :cond_3

    new-instance v10, Ld1/d;

    iget v12, v14, Ld1/d;->a:F

    const/4 v15, 0x0

    invoke-static {v12, v15}, Ljava/lang/Math;->max(FF)F

    move-result v12

    iget v15, v14, Ld1/d;->b:F

    invoke-static {v15, v8}, Ljava/lang/Math;->max(FF)F

    move-result v8

    iget v14, v14, Ld1/d;->c:F

    const/high16 v15, 0x7f800000    # Float.POSITIVE_INFINITY

    invoke-static {v14, v15}, Ljava/lang/Math;->min(FF)F

    move-result v14

    invoke-static {v11, v9}, Ljava/lang/Math;->min(FF)F

    move-result v9

    invoke-direct {v10, v12, v8, v14, v9}, Ld1/d;-><init>(FFFF)V

    new-instance v8, Lq8/f;

    invoke-virtual {v3, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lq8/f;

    iget-object v9, v9, Lq8/f;->b:Ljava/lang/Object;

    invoke-direct {v8, v10, v9}, Lq8/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v3, v13, v8}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v3, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lq8/f;

    iget-object v8, v8, Lq8/f;->b:Ljava/lang/Object;

    check-cast v8, Ljava/util/List;

    invoke-interface {v8, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_3
    if-eq v13, v12, :cond_4

    add-int/lit8 v13, v13, 0x1

    goto :goto_3

    :cond_4
    invoke-virtual {v7}, Ly1/o;->f()Ld1/d;

    move-result-object v8

    new-instance v9, Lq8/f;

    filled-new-array {v7}, [Ly1/o;

    move-result-object v7

    invoke-static {v7}, Ld7/t;->f0([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v7

    invoke-direct {v9, v8, v7}, Lq8/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_5
    if-eq v6, v5, :cond_5

    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_1

    :cond_5
    sget-object v2, Lu1/h0;->a:Lu1/h0;

    invoke-static {v3, v2}, Lr8/m;->z0(Ljava/util/List;Ljava/util/Comparator;)V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v5

    move v6, v4

    :goto_6
    if-ge v6, v5, :cond_7

    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lq8/f;

    iget-object v8, v7, Lq8/f;->b:Ljava/lang/Object;

    check-cast v8, Ljava/util/List;

    if-eqz p2, :cond_6

    sget-object v9, Lu1/f0;->a:Lu1/f0;

    goto :goto_7

    :cond_6
    sget-object v9, Lu1/d0;->a:Lu1/d0;

    :goto_7
    new-instance v10, Lu1/m0;

    invoke-direct {v10, v9}, Lu1/m0;-><init>(Ljava/util/Comparator;)V

    new-instance v9, Lu1/n0;

    invoke-direct {v9, v10, v4}, Lu1/n0;-><init>(Ljava/lang/Object;I)V

    invoke-static {v8, v9}, Lr8/m;->z0(Ljava/util/List;Ljava/util/Comparator;)V

    iget-object v7, v7, Lq8/f;->b:Ljava/lang/Object;

    check-cast v7, Ljava/util/Collection;

    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    add-int/lit8 v6, v6, 0x1

    goto :goto_6

    :cond_7
    sget-object v3, Lu1/o0;->b:Lu1/o0;

    new-instance v5, Lu1/z;

    invoke-direct {v5, v3, v4}, Lu1/z;-><init>(Ljava/lang/Object;I)V

    invoke-static {v2, v5}, Lr8/m;->z0(Ljava/util/List;Ljava/util/Comparator;)V

    :goto_8
    invoke-static {v2}, Ld7/t;->Y(Ljava/util/List;)I

    move-result v3

    if-gt v4, v3, :cond_a

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ly1/o;

    iget v3, v3, Ly1/o;->g:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    if-eqz v3, :cond_9

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ly1/o;

    invoke-virtual {v0, v5}, Lu1/p0;->y(Ly1/o;)Z

    move-result v5

    if-nez v5, :cond_8

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    goto :goto_9

    :cond_8
    add-int/lit8 v4, v4, 0x1

    :goto_9
    move-object v5, v3

    check-cast v5, Ljava/util/Collection;

    invoke-virtual {v2, v4, v5}, Ljava/util/ArrayList;->addAll(ILjava/util/Collection;)Z

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    add-int/2addr v4, v3

    goto :goto_8

    :cond_9
    add-int/lit8 v4, v4, 0x1

    goto :goto_8

    :cond_a
    return-object v2
.end method

.method public final S(Ly1/o;)V
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    sget-object v2, Lu1/r0;->a:Ld1/d;

    iget-object v2, v0, Lu1/p0;->F:Ll/t;

    if-nez v2, :cond_0

    return-void

    :cond_0
    iget-object v2, v1, Ly1/o;->d:Ly1/j;

    sget-object v3, Ly1/r;->w:Ly1/u;

    invoke-static {v2, v3}, Lo1/s;->J(Ly1/j;Ly1/u;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    iget v4, v0, Lu1/p0;->W:I

    const/4 v5, 0x1

    const/4 v6, 0x0

    iget-object v2, v2, Ly1/j;->a:Ljava/util/LinkedHashMap;

    if-ne v4, v5, :cond_2

    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v3, v4}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    sget-object v3, Ly1/i;->j:Ly1/u;

    invoke-virtual {v2, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_1

    move-object v2, v6

    :cond_1
    check-cast v2, Ly1/a;

    if-eqz v2, :cond_4

    iget-object v2, v2, Ly1/a;->b:Lq8/a;

    check-cast v2, Lc9/c;

    if-eqz v2, :cond_4

    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {v2, v3}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    goto :goto_0

    :cond_2
    iget v4, v0, Lu1/p0;->W:I

    const/4 v7, 0x2

    if-ne v4, v7, :cond_4

    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v3, v4}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    sget-object v3, Ly1/i;->j:Ly1/u;

    invoke-virtual {v2, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_3

    move-object v2, v6

    :cond_3
    check-cast v2, Ly1/a;

    if-eqz v2, :cond_4

    iget-object v2, v2, Ly1/a;->b:Lq8/a;

    check-cast v2, Lc9/c;

    if-eqz v2, :cond_4

    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {v2, v3}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    :cond_4
    :goto_0
    iget-object v2, v0, Lu1/p0;->F:Ll/t;

    const/4 v3, 0x0

    iget v4, v1, Ly1/o;->g:I

    if-nez v2, :cond_5

    goto/16 :goto_4

    :cond_5
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v8, 0x1d

    if-ge v7, v8, :cond_6

    goto/16 :goto_4

    :cond_6
    iget-object v9, v0, Lu1/p0;->d:Lu1/w;

    invoke-static {v9}, Lw1/d;->a(Landroid/view/View;)Landroid/view/autofill/AutofillId;

    move-result-object v9

    invoke-virtual/range {p1 .. p1}, Ly1/o;->i()Ly1/o;

    move-result-object v10

    if-eqz v10, :cond_8

    iget v9, v10, Ly1/o;->g:I

    int-to-long v9, v9

    if-lt v7, v8, :cond_7

    iget-object v11, v2, Ll/t;->b:Ljava/lang/Object;

    invoke-static {v11}, Lu1/l2;->f(Ljava/lang/Object;)Landroid/view/contentcapture/ContentCaptureSession;

    move-result-object v11

    iget-object v12, v2, Ll/t;->c:Ljava/lang/Object;

    check-cast v12, Landroid/view/View;

    invoke-static {v12}, Lw1/d;->a(Landroid/view/View;)Landroid/view/autofill/AutofillId;

    move-result-object v12

    invoke-static {v11, v12, v9, v10}, Lw1/b;->a(Landroid/view/contentcapture/ContentCaptureSession;Landroid/view/autofill/AutofillId;J)Landroid/view/autofill/AutofillId;

    move-result-object v9

    goto :goto_1

    :cond_7
    move-object v9, v6

    :goto_1
    if-nez v9, :cond_8

    goto/16 :goto_4

    :cond_8
    int-to-long v10, v4

    if-lt v7, v8, :cond_9

    iget-object v2, v2, Ll/t;->b:Ljava/lang/Object;

    invoke-static {v2}, Lu1/l2;->f(Ljava/lang/Object;)Landroid/view/contentcapture/ContentCaptureSession;

    move-result-object v2

    invoke-static {v2, v9, v10, v11}, Lw1/b;->c(Landroid/view/contentcapture/ContentCaptureSession;Landroid/view/autofill/AutofillId;J)Landroid/view/ViewStructure;

    move-result-object v2

    new-instance v7, Lw1/h;

    invoke-direct {v7, v2}, Lw1/h;-><init>(Landroid/view/ViewStructure;)V

    goto :goto_2

    :cond_9
    move-object v7, v6

    :goto_2
    if-nez v7, :cond_a

    goto/16 :goto_4

    :cond_a
    sget-object v2, Ly1/r;->C:Ly1/u;

    iget-object v8, v1, Ly1/o;->d:Ly1/j;

    iget-object v9, v8, Ly1/j;->a:Ljava/util/LinkedHashMap;

    invoke-interface {v9, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_b

    goto/16 :goto_4

    :cond_b
    sget-object v2, Ly1/r;->u:Ly1/u;

    iget-object v9, v8, Ly1/j;->a:Ljava/util/LinkedHashMap;

    invoke-virtual {v9, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_c

    move-object v2, v6

    :cond_c
    check-cast v2, Ljava/util/List;

    const-string v10, "\n"

    iget-object v11, v7, Lw1/h;->a:Landroid/view/ViewStructure;

    if-eqz v2, :cond_d

    const-string v12, "android.widget.TextView"

    invoke-static {v11, v12}, Lw1/g;->a(Landroid/view/ViewStructure;Ljava/lang/String;)V

    invoke-static {v2, v10}, Li1/b;->o(Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v11, v2}, Lw1/g;->d(Landroid/view/ViewStructure;Ljava/lang/CharSequence;)V

    :cond_d
    sget-object v2, Ly1/r;->x:Ly1/u;

    invoke-virtual {v9, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_e

    move-object v2, v6

    :cond_e
    check-cast v2, La2/e;

    if-eqz v2, :cond_f

    const-string v12, "android.widget.EditText"

    invoke-static {v11, v12}, Lw1/g;->a(Landroid/view/ViewStructure;Ljava/lang/String;)V

    invoke-static {v11, v2}, Lw1/g;->d(Landroid/view/ViewStructure;Ljava/lang/CharSequence;)V

    :cond_f
    sget-object v2, Ly1/r;->a:Ly1/u;

    invoke-virtual {v9, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_10

    move-object v2, v6

    :cond_10
    check-cast v2, Ljava/util/List;

    iget-object v12, v7, Lw1/h;->a:Landroid/view/ViewStructure;

    if-eqz v2, :cond_11

    invoke-static {v2, v10}, Li1/b;->o(Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v12, v2}, Lw1/g;->b(Landroid/view/ViewStructure;Ljava/lang/CharSequence;)V

    :cond_11
    sget-object v2, Ly1/r;->s:Ly1/u;

    invoke-virtual {v9, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_12

    move-object v2, v6

    :cond_12
    check-cast v2, Ly1/g;

    if-eqz v2, :cond_13

    iget v2, v2, Ly1/g;->a:I

    invoke-static {v2}, Lu1/r0;->c(I)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_13

    invoke-static {v11, v2}, Lw1/g;->a(Landroid/view/ViewStructure;Ljava/lang/String;)V

    :cond_13
    invoke-static {v8}, Lu1/p0;->w(Ly1/j;)La2/a0;

    move-result-object v2

    if-eqz v2, :cond_14

    iget-object v2, v2, La2/a0;->a:La2/z;

    iget-object v8, v2, La2/z;->b:La2/c0;

    iget-object v8, v8, La2/c0;->a:La2/x;

    iget-wide v8, v8, La2/x;->b:J

    invoke-static {v8, v9}, Lm2/n;->c(J)F

    move-result v8

    iget-object v2, v2, La2/z;->g:Lm2/b;

    invoke-interface {v2}, Lm2/b;->c()F

    move-result v9

    mul-float/2addr v9, v8

    invoke-interface {v2}, Lm2/b;->m()F

    move-result v2

    mul-float/2addr v2, v9

    invoke-static {v12, v2, v3, v3, v3}, Lw1/g;->e(Landroid/view/ViewStructure;FIII)V

    :cond_14
    invoke-virtual/range {p1 .. p1}, Ly1/o;->i()Ly1/o;

    move-result-object v2

    sget-object v8, Ld1/d;->e:Ld1/d;

    if-nez v2, :cond_15

    goto :goto_3

    :cond_15
    invoke-virtual/range {p1 .. p1}, Ly1/o;->c()Lt1/c1;

    move-result-object v9

    if-eqz v9, :cond_17

    invoke-virtual {v9}, Lt1/c1;->K0()Ly0/n;

    move-result-object v10

    iget-boolean v10, v10, Ly0/n;->t:Z

    if-eqz v10, :cond_16

    move-object v6, v9

    :cond_16
    if-eqz v6, :cond_17

    iget-object v2, v2, Ly1/o;->a:Ly0/n;

    const/16 v8, 0x8

    invoke-static {v2, v8}, Lt1/g;->x(Lt1/n;I)Lt1/c1;

    move-result-object v2

    invoke-virtual {v2, v6, v5}, Lt1/c1;->b(Lr1/s;Z)Ld1/d;

    move-result-object v8

    :cond_17
    :goto_3
    iget v2, v8, Ld1/d;->a:F

    float-to-int v13, v2

    iget v2, v8, Ld1/d;->b:F

    float-to-int v14, v2

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-virtual {v8}, Ld1/d;->c()F

    move-result v2

    float-to-int v2, v2

    invoke-virtual {v8}, Ld1/d;->b()F

    move-result v6

    float-to-int v6, v6

    move/from16 v17, v2

    move/from16 v18, v6

    invoke-static/range {v12 .. v18}, Lw1/g;->c(Landroid/view/ViewStructure;IIIIII)V

    move-object v6, v7

    :goto_4
    if-nez v6, :cond_18

    goto :goto_5

    :cond_18
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget-object v7, v0, Lu1/p0;->H:Lq/g;

    invoke-virtual {v7, v2}, Lq/g;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_19

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v7, v2}, Lq/g;->remove(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_19
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget-object v4, v0, Lu1/p0;->G:Lq/f;

    invoke-virtual {v4, v2, v6}, Lq/z;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_5
    invoke-virtual {v1, v3, v5}, Ly1/o;->g(ZZ)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    :goto_6
    if-ge v3, v2, :cond_1a

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ly1/o;

    invoke-virtual {v0, v4}, Lu1/p0;->S(Ly1/o;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_6

    :cond_1a
    return-void
.end method

.method public final T(Ly1/o;)V
    .locals 3

    sget-object v0, Lu1/r0;->a:Ld1/d;

    iget-object v0, p0, Lu1/p0;->F:Ll/t;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget v0, p1, Ly1/o;->g:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget-object v2, p0, Lu1/p0;->G:Lq/f;

    invoke-virtual {v2, v1}, Lq/f;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v2, v0}, Lq/f;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lu1/p0;->H:Lq/g;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v0}, Lq/g;->add(Ljava/lang/Object;)Z

    :goto_0
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Ly1/o;->g(ZZ)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    :goto_1
    if-ge v0, v1, :cond_2

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ly1/o;

    invoke-virtual {p0, v2}, Lu1/p0;->T(Ly1/o;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_2
    return-void
.end method

.method public final a(Landroid/view/View;)Le/a;
    .locals 0

    iget-object p1, p0, Lu1/p0;->s:Le/a;

    return-object p1
.end method

.method public final d(Landroidx/lifecycle/w;)V
    .locals 0

    iget-object p1, p0, Lu1/p0;->d:Lu1/w;

    invoke-virtual {p1}, Lu1/w;->getSemanticsOwner()Ly1/p;

    move-result-object p1

    invoke-virtual {p1}, Ly1/p;->a()Ly1/o;

    move-result-object p1

    invoke-virtual {p0, p1}, Lu1/p0;->S(Ly1/o;)V

    invoke-virtual {p0}, Lu1/p0;->z()V

    return-void
.end method

.method public final f(Landroidx/lifecycle/w;)V
    .locals 0

    iget-object p1, p0, Lu1/p0;->d:Lu1/w;

    invoke-virtual {p1}, Lu1/w;->getSemanticsOwner()Ly1/p;

    move-result-object p1

    invoke-virtual {p1}, Ly1/p;->a()Ly1/o;

    move-result-object p1

    invoke-virtual {p0, p1}, Lu1/p0;->T(Ly1/o;)V

    invoke-virtual {p0}, Lu1/p0;->z()V

    return-void
.end method

.method public final i(ILandroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    move-object/from16 v2, p4

    invoke-virtual/range {p0 .. p0}, Lu1/p0;->r()Ljava/util/Map;

    move-result-object v3

    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lu1/s2;

    if-eqz v3, :cond_10

    iget-object v3, v3, Lu1/s2;->a:Ly1/o;

    if-nez v3, :cond_0

    goto/16 :goto_9

    :cond_0
    invoke-static {v3}, Lu1/p0;->v(Ly1/o;)Ljava/lang/String;

    move-result-object v4

    iget-object v5, v0, Lu1/p0;->N:Ljava/lang/String;

    invoke-static {v1, v5}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    iget-object v2, v0, Lu1/p0;->L:Ljava/util/HashMap;

    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    if-eqz v2, :cond_10

    invoke-virtual/range {p2 .. p2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    move-result-object v3

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {v3, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    goto/16 :goto_9

    :cond_1
    iget-object v5, v0, Lu1/p0;->O:Ljava/lang/String;

    invoke-static {v1, v5}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    iget-object v2, v0, Lu1/p0;->M:Ljava/util/HashMap;

    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    if-eqz v2, :cond_10

    invoke-virtual/range {p2 .. p2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    move-result-object v3

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {v3, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    goto/16 :goto_9

    :cond_2
    sget-object v5, Ly1/i;->a:Ly1/u;

    iget-object v6, v3, Ly1/o;->d:Ly1/j;

    iget-object v7, v6, Ly1/j;->a:Ljava/util/LinkedHashMap;

    invoke-interface {v7, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    const/4 v7, 0x0

    if-eqz v5, :cond_d

    if-eqz v2, :cond_d

    const-string v5, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY"

    invoke-static {v1, v5}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_d

    const-string v5, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX"

    const/4 v8, -0x1

    invoke-virtual {v2, v5, v8}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v5

    const-string v9, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH"

    invoke-virtual {v2, v9, v8}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v2

    if-lez v2, :cond_c

    if-ltz v5, :cond_c

    if-eqz v4, :cond_3

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    goto :goto_0

    :cond_3
    const v4, 0x7fffffff

    :goto_0
    if-lt v5, v4, :cond_4

    goto/16 :goto_7

    :cond_4
    invoke-static {v6}, Lu1/p0;->w(Ly1/j;)La2/a0;

    move-result-object v4

    if-nez v4, :cond_5

    return-void

    :cond_5
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    const/4 v8, 0x0

    move v9, v8

    :goto_1
    if-ge v9, v2, :cond_b

    add-int v10, v5, v9

    iget-object v11, v4, La2/a0;->a:La2/z;

    iget-object v11, v11, La2/z;->a:La2/e;

    iget-object v11, v11, La2/e;->a:Ljava/lang/String;

    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v11

    if-lt v10, v11, :cond_6

    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_6
    invoke-virtual {v4, v10}, La2/a0;->b(I)Ld1/d;

    move-result-object v10

    invoke-virtual {v3}, Ly1/o;->c()Lt1/c1;

    move-result-object v11

    if-eqz v11, :cond_8

    invoke-virtual {v11}, Lt1/c1;->K0()Ly0/n;

    move-result-object v12

    iget-boolean v12, v12, Ly0/n;->t:Z

    if-eqz v12, :cond_7

    goto :goto_2

    :cond_7
    move-object v11, v7

    :goto_2
    if-eqz v11, :cond_8

    invoke-static {v11}, Landroidx/compose/ui/layout/a;->k(Lr1/s;)J

    move-result-wide v11

    goto :goto_3

    :cond_8
    sget-wide v11, Ld1/c;->b:J

    :goto_3
    invoke-virtual {v10, v11, v12}, Ld1/d;->g(J)Ld1/d;

    move-result-object v10

    invoke-virtual {v3}, Ly1/o;->e()Ld1/d;

    move-result-object v11

    invoke-virtual {v10, v11}, Ld1/d;->e(Ld1/d;)Z

    move-result v12

    if-eqz v12, :cond_9

    invoke-virtual {v10, v11}, Ld1/d;->d(Ld1/d;)Ld1/d;

    move-result-object v10

    goto :goto_4

    :cond_9
    move-object v10, v7

    :goto_4
    if-eqz v10, :cond_a

    iget v11, v10, Ld1/d;->a:F

    iget v12, v10, Ld1/d;->b:F

    invoke-static {v11, v12}, Ld9/i;->f(FF)J

    move-result-wide v11

    iget-object v13, v0, Lu1/p0;->d:Lu1/w;

    invoke-virtual {v13, v11, v12}, Lu1/w;->q(J)J

    move-result-wide v11

    iget v14, v10, Ld1/d;->c:F

    iget v10, v10, Ld1/d;->d:F

    invoke-static {v14, v10}, Ld9/i;->f(FF)J

    move-result-wide v14

    invoke-virtual {v13, v14, v15}, Lu1/w;->q(J)J

    move-result-wide v13

    new-instance v10, Landroid/graphics/RectF;

    invoke-static {v11, v12}, Ld1/c;->d(J)F

    move-result v15

    invoke-static {v11, v12}, Ld1/c;->e(J)F

    move-result v11

    invoke-static {v13, v14}, Ld1/c;->d(J)F

    move-result v12

    invoke-static {v13, v14}, Ld1/c;->e(J)F

    move-result v13

    invoke-direct {v10, v15, v11, v12, v13}, Landroid/graphics/RectF;-><init>(FFFF)V

    goto :goto_5

    :cond_a
    move-object v10, v7

    :goto_5
    invoke-virtual {v6, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_6
    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    :cond_b
    invoke-virtual/range {p2 .. p2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    move-result-object v2

    new-array v3, v8, [Landroid/graphics/RectF;

    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [Landroid/os/Parcelable;

    invoke-virtual {v2, v1, v3}, Landroid/os/Bundle;->putParcelableArray(Ljava/lang/String;[Landroid/os/Parcelable;)V

    goto :goto_9

    :cond_c
    :goto_7
    const-string v1, "AccessibilityDelegate"

    const-string v2, "Invalid arguments for accessibility character locations"

    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_d
    sget-object v4, Ly1/r;->t:Ly1/u;

    iget-object v5, v6, Ly1/j;->a:Ljava/util/LinkedHashMap;

    invoke-interface {v5, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_f

    if-eqz v2, :cond_f

    const-string v2, "androidx.compose.ui.semantics.testTag"

    invoke-static {v1, v2}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_f

    invoke-virtual {v5, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_e

    goto :goto_8

    :cond_e
    move-object v7, v2

    :goto_8
    check-cast v7, Ljava/lang/String;

    if-eqz v7, :cond_10

    invoke-virtual/range {p2 .. p2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    move-result-object v2

    invoke-virtual {v2, v1, v7}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    goto :goto_9

    :cond_f
    const-string v2, "androidx.compose.ui.semantics.id"

    invoke-static {v1, v2}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_10

    invoke-virtual/range {p2 .. p2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    move-result-object v2

    iget v3, v3, Ly1/o;->g:I

    invoke-virtual {v2, v1, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    :cond_10
    :goto_9
    return-void
.end method

.method public final j(Lu1/s2;)Landroid/graphics/Rect;
    .locals 7

    iget-object p1, p1, Lu1/s2;->b:Landroid/graphics/Rect;

    iget v0, p1, Landroid/graphics/Rect;->left:I

    int-to-float v0, v0

    iget v1, p1, Landroid/graphics/Rect;->top:I

    int-to-float v1, v1

    invoke-static {v0, v1}, Ld9/i;->f(FF)J

    move-result-wide v0

    iget-object v2, p0, Lu1/p0;->d:Lu1/w;

    invoke-virtual {v2, v0, v1}, Lu1/w;->q(J)J

    move-result-wide v0

    iget v3, p1, Landroid/graphics/Rect;->right:I

    int-to-float v3, v3

    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    int-to-float p1, p1

    invoke-static {v3, p1}, Ld9/i;->f(FF)J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Lu1/w;->q(J)J

    move-result-wide v2

    new-instance p1, Landroid/graphics/Rect;

    invoke-static {v0, v1}, Ld1/c;->d(J)F

    move-result v4

    float-to-double v4, v4

    invoke-static {v4, v5}, Ljava/lang/Math;->floor(D)D

    move-result-wide v4

    double-to-float v4, v4

    float-to-int v4, v4

    invoke-static {v0, v1}, Ld1/c;->e(J)F

    move-result v0

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->floor(D)D

    move-result-wide v0

    double-to-float v0, v0

    float-to-int v0, v0

    invoke-static {v2, v3}, Ld1/c;->d(J)F

    move-result v1

    float-to-double v5, v1

    invoke-static {v5, v6}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v5

    double-to-float v1, v5

    float-to-int v1, v1

    invoke-static {v2, v3}, Ld1/c;->e(J)F

    move-result v2

    float-to-double v2, v2

    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    double-to-float v2, v2

    float-to-int v2, v2

    invoke-direct {p1, v4, v0, v1, v2}, Landroid/graphics/Rect;-><init>(IIII)V

    return-object p1
.end method

.method public final k(Lu8/e;)Ljava/lang/Object;
    .locals 12

    instance-of v0, p1, Lu1/k0;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lu1/k0;

    iget v1, v0, Lu1/k0;->f:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lu1/k0;->f:I

    goto :goto_0

    :cond_0
    new-instance v0, Lu1/k0;

    invoke-direct {v0, p0, p1}, Lu1/k0;-><init>(Lu1/p0;Lu8/e;)V

    :goto_0
    iget-object p1, v0, Lu1/k0;->d:Ljava/lang/Object;

    sget-object v1, Lv8/a;->a:Lv8/a;

    iget v2, v0, Lu1/k0;->f:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x2

    if-eqz v2, :cond_4

    if-eq v2, v3, :cond_3

    if-ne v2, v5, :cond_2

    iget-object v2, v0, Lu1/k0;->c:Lo9/b;

    iget-object v6, v0, Lu1/k0;->b:Lq/g;

    iget-object v7, v0, Lu1/k0;->a:Lu1/p0;

    :try_start_0
    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    move-object p1, v6

    move-object v6, v2

    goto :goto_1

    :catchall_0
    move-exception p1

    goto/16 :goto_6

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    iget-object v2, v0, Lu1/k0;->c:Lo9/b;

    iget-object v6, v0, Lu1/k0;->b:Lq/g;

    iget-object v7, v0, Lu1/k0;->a:Lu1/p0;

    :try_start_1
    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    :cond_4
    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    :try_start_2
    new-instance p1, Lq/g;

    invoke-direct {p1, v4}, Lq/g;-><init>(I)V

    iget-object v2, p0, Lu1/p0;->D:Lo9/c;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v6, Lo9/b;

    invoke-direct {v6, v2}, Lo9/b;-><init>(Lo9/c;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    move-object v7, p0

    :goto_1
    :try_start_3
    iput-object v7, v0, Lu1/k0;->a:Lu1/p0;

    iput-object p1, v0, Lu1/k0;->b:Lq/g;

    iput-object v6, v0, Lu1/k0;->c:Lo9/b;

    iput v3, v0, Lu1/k0;->f:I

    invoke-virtual {v6, v0}, Lo9/b;->b(Lw8/c;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_5

    return-object v1

    :cond_5
    move-object v11, v6

    move-object v6, p1

    move-object p1, v2

    move-object v2, v11

    :goto_2
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_9

    invoke-virtual {v2}, Lo9/b;->c()Ljava/lang/Object;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p1, Lu1/r0;->a:Ld1/d;

    iget-object p1, v7, Lu1/p0;->F:Ll/t;

    if-nez p1, :cond_6

    goto :goto_3

    :cond_6
    invoke-virtual {v7}, Lu1/p0;->z()V

    :goto_3
    invoke-virtual {v7}, Lu1/p0;->x()Z

    move-result p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    iget-object v8, v7, Lu1/p0;->C:Lq/g;

    if-eqz p1, :cond_8

    :try_start_4
    iget p1, v8, Lq/g;->c:I

    move v9, v4

    :goto_4
    if-ge v9, p1, :cond_7

    iget-object v10, v8, Lq/g;->b:[Ljava/lang/Object;

    aget-object v10, v10, v9

    check-cast v10, Landroidx/compose/ui/node/a;

    invoke-virtual {v7, v10, v6}, Lu1/p0;->N(Landroidx/compose/ui/node/a;Lq/g;)V

    invoke-virtual {v7, v10}, Lu1/p0;->O(Landroidx/compose/ui/node/a;)V

    add-int/lit8 v9, v9, 0x1

    goto :goto_4

    :cond_7
    invoke-virtual {v6}, Lq/g;->clear()V

    iget-boolean p1, v7, Lu1/p0;->S:Z

    if-nez p1, :cond_8

    iput-boolean v3, v7, Lu1/p0;->S:Z

    iget-object p1, v7, Lu1/p0;->r:Landroid/os/Handler;

    iget-object v9, v7, Lu1/p0;->T:Landroidx/activity/d;

    invoke-virtual {p1, v9}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_8
    invoke-virtual {v8}, Lq/g;->clear()V

    iget-object p1, v7, Lu1/p0;->w:Ljava/util/HashMap;

    invoke-virtual {p1}, Ljava/util/HashMap;->clear()V

    iget-object p1, v7, Lu1/p0;->x:Ljava/util/HashMap;

    invoke-virtual {p1}, Ljava/util/HashMap;->clear()V

    iput-object v7, v0, Lu1/k0;->a:Lu1/p0;

    iput-object v6, v0, Lu1/k0;->b:Lq/g;

    iput-object v2, v0, Lu1/k0;->c:Lo9/b;

    iput v5, v0, Lu1/k0;->f:I

    const-wide/16 v8, 0x64

    invoke-static {v8, v9, v0}, Ld7/t;->P(JLu8/e;)Ljava/lang/Object;

    move-result-object p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    if-ne p1, v1, :cond_1

    return-object v1

    :cond_9
    iget-object p1, v7, Lu1/p0;->C:Lq/g;

    invoke-virtual {p1}, Lq/g;->clear()V

    sget-object p1, Lq8/l;->a:Lq8/l;

    return-object p1

    :goto_5
    move-object v7, p0

    goto :goto_6

    :catchall_1
    move-exception p1

    goto :goto_5

    :goto_6
    iget-object v0, v7, Lu1/p0;->C:Lq/g;

    invoke-virtual {v0}, Lq/g;->clear()V

    throw p1
.end method

.method public final l(IJZ)Z
    .locals 9

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-static {v0, v1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p0}, Lu1/p0;->r()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    sget-wide v2, Ld1/c;->d:J

    invoke-static {p2, p3, v2, v3}, Ld1/c;->b(JJ)Z

    move-result v2

    if-nez v2, :cond_a

    invoke-static {p2, p3}, Ld1/c;->d(J)F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->isNaN(F)Z

    move-result v2

    if-nez v2, :cond_9

    invoke-static {p2, p3}, Ld1/c;->e(J)F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->isNaN(F)Z

    move-result v2

    if-nez v2, :cond_9

    const/4 v2, 0x1

    if-ne p4, v2, :cond_1

    sget-object p4, Ly1/r;->p:Ly1/u;

    goto :goto_0

    :cond_1
    if-nez p4, :cond_8

    sget-object p4, Ly1/r;->o:Ly1/u;

    :goto_0
    check-cast v0, Ljava/lang/Iterable;

    instance-of v3, v0, Ljava/util/Collection;

    if-eqz v3, :cond_2

    move-object v3, v0

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_2

    goto/16 :goto_5

    :cond_2
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lu1/s2;

    iget-object v4, v3, Lu1/s2;->b:Landroid/graphics/Rect;

    iget v5, v4, Landroid/graphics/Rect;->left:I

    int-to-float v5, v5

    iget v6, v4, Landroid/graphics/Rect;->top:I

    int-to-float v6, v6

    iget v7, v4, Landroid/graphics/Rect;->right:I

    int-to-float v7, v7

    iget v4, v4, Landroid/graphics/Rect;->bottom:I

    int-to-float v4, v4

    invoke-static {p2, p3}, Ld1/c;->d(J)F

    move-result v8

    cmpl-float v5, v8, v5

    if-ltz v5, :cond_3

    invoke-static {p2, p3}, Ld1/c;->d(J)F

    move-result v5

    cmpg-float v5, v5, v7

    if-gez v5, :cond_3

    invoke-static {p2, p3}, Ld1/c;->e(J)F

    move-result v5

    cmpl-float v5, v5, v6

    if-ltz v5, :cond_3

    invoke-static {p2, p3}, Ld1/c;->e(J)F

    move-result v5

    cmpg-float v4, v5, v4

    if-gez v4, :cond_3

    iget-object v3, v3, Lu1/s2;->a:Ly1/o;

    invoke-virtual {v3}, Ly1/o;->h()Ly1/j;

    move-result-object v3

    invoke-static {v3, p4}, Lo1/s;->J(Ly1/j;Ly1/u;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ly1/h;

    if-nez v3, :cond_4

    goto :goto_1

    :cond_4
    iget-boolean v4, v3, Ly1/h;->c:Z

    if-eqz v4, :cond_5

    neg-int v5, p1

    goto :goto_2

    :cond_5
    move v5, p1

    :goto_2
    iget-object v6, v3, Ly1/h;->a:Lc9/a;

    if-nez p1, :cond_6

    if-eqz v4, :cond_6

    goto :goto_3

    :cond_6
    if-gez v5, :cond_7

    :goto_3
    invoke-interface {v6}, Lc9/a;->invoke()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    move-result v3

    const/4 v4, 0x0

    cmpl-float v3, v3, v4

    if-lez v3, :cond_3

    goto :goto_4

    :cond_7
    invoke-interface {v6}, Lc9/a;->invoke()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    move-result v4

    iget-object v3, v3, Ly1/h;->b:Lc9/a;

    invoke-interface {v3}, Lc9/a;->invoke()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    move-result v3

    cmpg-float v3, v4, v3

    if-gez v3, :cond_3

    :goto_4
    move v1, v2

    goto :goto_5

    :cond_8
    new-instance p1, Landroidx/fragment/app/a0;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :cond_9
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Offset argument contained a NaN value."

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_a
    :goto_5
    return v1
.end method

.method public final m(II)Landroid/view/accessibility/AccessibilityEvent;
    .locals 2

    invoke-static {p2}, Landroid/view/accessibility/AccessibilityEvent;->obtain(I)Landroid/view/accessibility/AccessibilityEvent;

    move-result-object p2

    const/4 v0, 0x1

    invoke-virtual {p2, v0}, Landroid/view/accessibility/AccessibilityRecord;->setEnabled(Z)V

    const-string v0, "android.view.View"

    invoke-virtual {p2, v0}, Landroid/view/accessibility/AccessibilityRecord;->setClassName(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lu1/p0;->d:Lu1/w;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1}, Landroid/view/accessibility/AccessibilityEvent;->setPackageName(Ljava/lang/CharSequence;)V

    invoke-virtual {p2, v0, p1}, Landroid/view/accessibility/AccessibilityRecord;->setSource(Landroid/view/View;I)V

    invoke-virtual {p0}, Lu1/p0;->x()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lu1/p0;->r()Ljava/util/Map;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lu1/s2;

    if-eqz p1, :cond_0

    iget-object p1, p1, Lu1/s2;->a:Ly1/o;

    invoke-virtual {p1}, Ly1/o;->h()Ly1/j;

    move-result-object p1

    sget-object v0, Ly1/r;->C:Ly1/u;

    iget-object p1, p1, Ly1/j;->a:Ljava/util/LinkedHashMap;

    invoke-interface {p1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {p2, p1}, Landroid/view/accessibility/AccessibilityRecord;->setPassword(Z)V

    :cond_0
    return-object p2
.end method

.method public final n(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/CharSequence;)Landroid/view/accessibility/AccessibilityEvent;
    .locals 1

    const/16 v0, 0x2000

    invoke-virtual {p0, p1, v0}, Lu1/p0;->m(II)Landroid/view/accessibility/AccessibilityEvent;

    move-result-object p1

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/view/accessibility/AccessibilityRecord;->setFromIndex(I)V

    :cond_0
    if-eqz p3, :cond_1

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/view/accessibility/AccessibilityRecord;->setToIndex(I)V

    :cond_1
    if-eqz p4, :cond_2

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/view/accessibility/AccessibilityRecord;->setItemCount(I)V

    :cond_2
    if-eqz p5, :cond_3

    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityRecord;->getText()Ljava/util/List;

    move-result-object p2

    invoke-interface {p2, p5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_3
    return-object p1
.end method

.method public final o(Ly1/o;Ljava/util/ArrayList;Ljava/util/LinkedHashMap;)V
    .locals 7

    iget-object v0, p1, Ly1/o;->c:Landroidx/compose/ui/node/a;

    iget-object v0, v0, Landroidx/compose/ui/node/a;->y:Lm2/l;

    sget-object v1, Lm2/l;->b:Lm2/l;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne v0, v1, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    invoke-virtual {p1}, Ly1/o;->h()Ly1/j;

    move-result-object v1

    sget-object v4, Ly1/r;->l:Ly1/u;

    sget-object v5, Lu1/q0;->b:Lu1/q0;

    invoke-virtual {v1, v4, v5}, Ly1/j;->i(Ly1/u;Lc9/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    iget v4, p1, Ly1/o;->g:I

    if-nez v1, :cond_1

    invoke-virtual {p0, p1}, Lu1/p0;->y(Ly1/o;)Z

    move-result v5

    if-eqz v5, :cond_2

    :cond_1
    invoke-virtual {p0}, Lu1/p0;->r()Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    iget-boolean v5, p1, Ly1/o;->b:Z

    if-eqz v1, :cond_3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    xor-int/lit8 v1, v5, 0x1

    invoke-virtual {p1, v1, v2}, Ly1/o;->g(ZZ)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    invoke-static {p1}, Lr8/p;->Y0(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p0, p1, v0}, Lu1/p0;->Q(Ljava/util/ArrayList;Z)Ljava/util/ArrayList;

    move-result-object p1

    invoke-interface {p3, p2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_3
    xor-int/lit8 v0, v5, 0x1

    invoke-virtual {p1, v0, v2}, Ly1/o;->g(ZZ)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    :goto_1
    if-ge v2, v0, :cond_4

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ly1/o;

    invoke-virtual {p0, v1, p2, p3}, Lu1/p0;->o(Ly1/o;Ljava/util/ArrayList;Ljava/util/LinkedHashMap;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_4
    :goto_2
    return-void
.end method

.method public final p(Ly1/o;)I
    .locals 4

    sget-object v0, Ly1/r;->a:Ly1/u;

    iget-object p1, p1, Ly1/o;->d:Ly1/j;

    iget-object v1, p1, Ly1/j;->a:Ljava/util/LinkedHashMap;

    invoke-interface {v1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Ly1/r;->y:Ly1/u;

    iget-object v1, p1, Ly1/j;->a:Ljava/util/LinkedHashMap;

    invoke-interface {v1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p1, v0}, Ly1/j;->e(Ly1/u;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, La2/b0;

    const-wide v0, 0xffffffffL

    iget-wide v2, p1, La2/b0;->a:J

    and-long/2addr v0, v2

    long-to-int p1, v0

    return p1

    :cond_0
    iget p1, p0, Lu1/p0;->A:I

    return p1
.end method

.method public final q(Ly1/o;)I
    .locals 3

    sget-object v0, Ly1/r;->a:Ly1/u;

    iget-object p1, p1, Ly1/o;->d:Ly1/j;

    iget-object v1, p1, Ly1/j;->a:Ljava/util/LinkedHashMap;

    invoke-interface {v1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Ly1/r;->y:Ly1/u;

    iget-object v1, p1, Ly1/j;->a:Ljava/util/LinkedHashMap;

    invoke-interface {v1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p1, v0}, Ly1/j;->e(Ly1/u;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, La2/b0;

    const/16 v0, 0x20

    iget-wide v1, p1, La2/b0;->a:J

    shr-long v0, v1, v0

    long-to-int p1, v0

    return p1

    :cond_0
    iget p1, p0, Lu1/p0;->A:I

    return p1
.end method

.method public final r()Ljava/util/Map;
    .locals 9

    iget-boolean v0, p0, Lu1/p0;->E:Z

    if-eqz v0, :cond_4

    const/4 v0, 0x0

    iput-boolean v0, p0, Lu1/p0;->E:Z

    iget-object v1, p0, Lu1/p0;->d:Lu1/w;

    invoke-virtual {v1}, Lu1/w;->getSemanticsOwner()Ly1/p;

    move-result-object v1

    sget-object v2, Lu1/r0;->a:Ld1/d;

    invoke-virtual {v1}, Ly1/p;->a()Ly1/o;

    move-result-object v1

    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    iget-object v3, v1, Ly1/o;->c:Landroidx/compose/ui/node/a;

    invoke-virtual {v3}, Landroidx/compose/ui/node/a;->D()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-virtual {v3}, Landroidx/compose/ui/node/a;->C()Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ly1/o;->e()Ld1/d;

    move-result-object v3

    new-instance v4, Landroid/graphics/Region;

    iget v5, v3, Ld1/d;->a:F

    invoke-static {v5}, Ld7/t;->p0(F)I

    move-result v5

    iget v6, v3, Ld1/d;->b:F

    invoke-static {v6}, Ld7/t;->p0(F)I

    move-result v6

    iget v7, v3, Ld1/d;->c:F

    invoke-static {v7}, Ld7/t;->p0(F)I

    move-result v7

    iget v3, v3, Ld1/d;->d:F

    invoke-static {v3}, Ld7/t;->p0(F)I

    move-result v3

    invoke-direct {v4, v5, v6, v7, v3}, Landroid/graphics/Region;-><init>(IIII)V

    new-instance v3, Landroid/graphics/Region;

    invoke-direct {v3}, Landroid/graphics/Region;-><init>()V

    invoke-static {v4, v1, v2, v1, v3}, Lu1/r0;->e(Landroid/graphics/Region;Ly1/o;Ljava/util/LinkedHashMap;Ly1/o;Landroid/graphics/Region;)V

    :cond_1
    :goto_0
    iput-object v2, p0, Lu1/p0;->J:Ljava/util/Map;

    invoke-virtual {p0}, Lu1/p0;->x()Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object v1, p0, Lu1/p0;->L:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->clear()V

    iget-object v2, p0, Lu1/p0;->M:Ljava/util/HashMap;

    invoke-virtual {v2}, Ljava/util/HashMap;->clear()V

    invoke-virtual {p0}, Lu1/p0;->r()Ljava/util/Map;

    move-result-object v3

    const/4 v4, -0x1

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lu1/s2;

    if-eqz v3, :cond_2

    iget-object v3, v3, Lu1/s2;->a:Ly1/o;

    goto :goto_1

    :cond_2
    const/4 v3, 0x0

    :goto_1
    invoke-static {v3}, Ld7/a;->j(Ljava/lang/Object;)V

    iget-object v4, v3, Ly1/o;->c:Landroidx/compose/ui/node/a;

    iget-object v4, v4, Landroidx/compose/ui/node/a;->y:Lm2/l;

    sget-object v5, Lm2/l;->b:Lm2/l;

    const/4 v6, 0x1

    if-ne v4, v5, :cond_3

    move v0, v6

    :cond_3
    filled-new-array {v3}, [Ly1/o;

    move-result-object v3

    invoke-static {v3}, Ld7/t;->f0([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {p0, v3, v0}, Lu1/p0;->Q(Ljava/util/ArrayList;Z)Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {v0}, Ld7/t;->Y(Ljava/util/List;)I

    move-result v3

    if-gt v6, v3, :cond_4

    :goto_2
    add-int/lit8 v4, v6, -0x1

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ly1/o;

    iget v4, v4, Ly1/o;->g:I

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ly1/o;

    iget v5, v5, Ly1/o;->g:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v1, v7, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v2, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eq v6, v3, :cond_4

    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    :cond_4
    iget-object v0, p0, Lu1/p0;->J:Ljava/util/Map;

    return-object v0
.end method

.method public final t(Ly1/o;)Ljava/lang/String;
    .locals 6

    iget-object v0, p1, Ly1/o;->d:Ly1/j;

    sget-object v1, Ly1/r;->a:Ly1/u;

    sget-object v1, Ly1/r;->b:Ly1/u;

    invoke-static {v0, v1}, Lo1/s;->J(Ly1/j;Ly1/u;)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Ly1/r;->B:Ly1/u;

    iget-object p1, p1, Ly1/o;->d:Ly1/j;

    invoke-static {p1, v1}, Lo1/s;->J(Ly1/j;Ly1/u;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lz1/a;

    sget-object v2, Ly1/r;->s:Ly1/u;

    invoke-static {p1, v2}, Lo1/s;->J(Ly1/j;Ly1/u;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ly1/g;

    const/4 v3, 0x1

    iget-object v4, p0, Lu1/p0;->d:Lu1/w;

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v5, 0x2

    if-eqz v1, :cond_3

    if-eq v1, v3, :cond_1

    if-eq v1, v5, :cond_0

    goto :goto_0

    :cond_0
    if-nez v0, :cond_5

    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0e0049

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    if-nez v2, :cond_2

    goto :goto_0

    :cond_2
    iget v1, v2, Ly1/g;->a:I

    invoke-static {v1, v5}, Ly1/g;->a(II)Z

    move-result v1

    if-eqz v1, :cond_5

    if-nez v0, :cond_5

    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0e0085

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_3
    if-nez v2, :cond_4

    goto :goto_0

    :cond_4
    iget v1, v2, Ly1/g;->a:I

    invoke-static {v1, v5}, Ly1/g;->a(II)Z

    move-result v1

    if-eqz v1, :cond_5

    if-nez v0, :cond_5

    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0e0086

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    :cond_5
    :goto_0
    sget-object v1, Ly1/r;->A:Ly1/u;

    invoke-static {p1, v1}, Lo1/s;->J(Ly1/j;Ly1/u;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    if-eqz v1, :cond_8

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-nez v2, :cond_6

    goto :goto_1

    :cond_6
    iget v2, v2, Ly1/g;->a:I

    const/4 v5, 0x4

    invoke-static {v2, v5}, Ly1/g;->a(II)Z

    move-result v2

    if-nez v2, :cond_8

    :goto_1
    if-nez v0, :cond_8

    if-eqz v1, :cond_7

    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0e008c

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    :cond_7
    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0e0083

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    :cond_8
    :goto_2
    sget-object v1, Ly1/r;->c:Ly1/u;

    invoke-static {p1, v1}, Lo1/s;->J(Ly1/j;Ly1/u;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ly1/f;

    if-eqz p1, :cond_d

    sget-object v1, Ly1/f;->d:Ly1/f;

    sget-object v1, Ly1/f;->d:Ly1/f;

    if-eq p1, v1, :cond_c

    if-nez v0, :cond_d

    iget-object v0, p1, Ly1/f;->b:Li9/d;

    iget v1, v0, Li9/d;->b:F

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    iget v2, v0, Li9/d;->a:F

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Number;->floatValue()F

    move-result v5

    sub-float/2addr v1, v5

    const/4 v5, 0x0

    cmpg-float v1, v1, v5

    if-nez v1, :cond_9

    move p1, v5

    goto :goto_3

    :cond_9
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    iget p1, p1, Ly1/f;->a:F

    sub-float/2addr p1, v1

    iget v0, v0, Li9/d;->b:F

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    sub-float/2addr v0, v1

    div-float/2addr p1, v0

    :goto_3
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {p1, v5, v0}, Lz6/a;->q(FFF)F

    move-result p1

    cmpg-float v1, p1, v5

    if-nez v1, :cond_a

    const/4 p1, 0x0

    goto :goto_4

    :cond_a
    cmpg-float v0, p1, v0

    const/16 v1, 0x64

    if-nez v0, :cond_b

    move p1, v1

    goto :goto_4

    :cond_b
    int-to-float v0, v1

    mul-float/2addr p1, v0

    invoke-static {p1}, Ld7/t;->p0(F)I

    move-result p1

    const/16 v0, 0x63

    invoke-static {p1, v3, v0}, Lz6/a;->r(III)I

    move-result p1

    :goto_4
    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const v1, 0x7f0e0091

    invoke-virtual {v0, v1, p1}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_5

    :cond_c
    if-nez v0, :cond_d

    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const v0, 0x7f0e0048

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    :cond_d
    :goto_5
    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public final u(Ly1/o;)Landroid/text/SpannableString;
    .locals 5

    iget-object v0, p0, Lu1/p0;->d:Lu1/w;

    invoke-virtual {v0}, Lu1/w;->getFontFamilyResolver()Lf2/d;

    iget-object v1, p1, Ly1/o;->d:Ly1/j;

    sget-object v2, Ly1/r;->x:Ly1/u;

    iget-object v1, v1, Ly1/j;->a:Ljava/util/LinkedHashMap;

    invoke-virtual {v1, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move-object v1, v2

    :cond_0
    check-cast v1, La2/e;

    iget-object v3, p0, Lu1/p0;->P:Li2/l;

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lu1/w;->getDensity()Lm2/b;

    move-result-object v4

    invoke-static {v1, v4, v3}, Li1/b;->K(La2/e;Lm2/b;Li2/l;)Landroid/text/SpannableString;

    move-result-object v1

    goto :goto_0

    :cond_1
    move-object v1, v2

    :goto_0
    invoke-static {v1}, Lu1/p0;->R(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v1

    check-cast v1, Landroid/text/SpannableString;

    sget-object v4, Ly1/r;->u:Ly1/u;

    iget-object p1, p1, Ly1/o;->d:Ly1/j;

    invoke-static {p1, v4}, Lo1/s;->J(Ly1/j;Ly1/u;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    if-eqz p1, :cond_2

    invoke-static {p1}, Lr8/p;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, La2/e;

    if-eqz p1, :cond_2

    invoke-virtual {v0}, Lu1/w;->getDensity()Lm2/b;

    move-result-object v0

    invoke-static {p1, v0, v3}, Li1/b;->K(La2/e;Lm2/b;Li2/l;)Landroid/text/SpannableString;

    move-result-object v2

    :cond_2
    invoke-static {v2}, Lu1/p0;->R(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    check-cast p1, Landroid/text/SpannableString;

    if-nez v1, :cond_3

    move-object v1, p1

    :cond_3
    return-object v1
.end method

.method public final x()Z
    .locals 2

    iget-object v0, p0, Lu1/p0;->n:Landroid/view/accessibility/AccessibilityManager;

    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lu1/p0;->q:Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public final y(Ly1/o;)Z
    .locals 4

    sget-object v0, Lu1/r0;->a:Ld1/d;

    iget-object v0, p1, Ly1/o;->d:Ly1/j;

    sget-object v1, Ly1/r;->a:Ly1/u;

    invoke-static {v0, v1}, Lo1/s;->J(Ly1/j;Ly1/u;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-eqz v0, :cond_0

    invoke-static {v0}, Lr8/p;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_2

    invoke-virtual {p0, p1}, Lu1/p0;->u(Ly1/o;)Landroid/text/SpannableString;

    move-result-object v0

    if-nez v0, :cond_2

    invoke-virtual {p0, p1}, Lu1/p0;->t(Ly1/o;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2

    invoke-static {p1}, Lu1/p0;->s(Ly1/o;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    move v0, v1

    goto :goto_2

    :cond_2
    :goto_1
    move v0, v2

    :goto_2
    iget-object v3, p1, Ly1/o;->d:Ly1/j;

    iget-boolean v3, v3, Ly1/j;->b:Z

    if-nez v3, :cond_3

    iget-boolean v3, p1, Ly1/o;->e:Z

    if-nez v3, :cond_4

    invoke-virtual {p1, v1, v2}, Ly1/o;->g(ZZ)Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_4

    sget-object v3, Ly1/n;->b:Ly1/n;

    iget-object p1, p1, Ly1/o;->c:Landroidx/compose/ui/node/a;

    invoke-static {p1, v3}, Lo1/s;->v(Landroidx/compose/ui/node/a;Ly1/n;)Landroidx/compose/ui/node/a;

    move-result-object p1

    if-nez p1, :cond_4

    if-eqz v0, :cond_4

    :cond_3
    move v1, v2

    :cond_4
    return v1
.end method

.method public final z()V
    .locals 13

    iget-object v0, p0, Lu1/p0;->F:Ll/t;

    if-nez v0, :cond_0

    return-void

    :cond_0
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1d

    if-ge v1, v2, :cond_1

    return-void

    :cond_1
    iget-object v1, p0, Lu1/p0;->G:Lq/f;

    invoke-virtual {v1}, Lq/z;->isEmpty()Z

    move-result v3

    const/4 v4, 0x1

    xor-int/2addr v3, v4

    const-string v5, "TREAT_AS_VIEW_TREE_APPEARED"

    const-string v6, "TREAT_AS_VIEW_TREE_APPEARING"

    const/16 v7, 0x22

    const/4 v8, 0x0

    if-eqz v3, :cond_6

    invoke-virtual {v1}, Lq/f;->values()Ljava/util/Collection;

    move-result-object v3

    invoke-static {v3}, Lr8/p;->W0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v3

    new-instance v9, Ljava/util/ArrayList;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v10

    invoke-direct {v9, v10}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v10

    move v11, v8

    :goto_0
    if-ge v11, v10, :cond_2

    invoke-interface {v3, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lw1/h;

    iget-object v12, v12, Lw1/h;->a:Landroid/view/ViewStructure;

    invoke-virtual {v9, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v11, v11, 0x1

    goto :goto_0

    :cond_2
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v3, v7, :cond_3

    iget-object v3, v0, Ll/t;->b:Ljava/lang/Object;

    invoke-static {v3}, Lu1/l2;->f(Ljava/lang/Object;)Landroid/view/contentcapture/ContentCaptureSession;

    move-result-object v3

    invoke-static {v3, v9}, Lw1/c;->a(Landroid/view/contentcapture/ContentCaptureSession;Ljava/util/List;)V

    goto :goto_2

    :cond_3
    if-lt v3, v2, :cond_5

    iget-object v3, v0, Ll/t;->b:Ljava/lang/Object;

    invoke-static {v3}, Lu1/l2;->f(Ljava/lang/Object;)Landroid/view/contentcapture/ContentCaptureSession;

    move-result-object v3

    iget-object v10, v0, Ll/t;->c:Ljava/lang/Object;

    check-cast v10, Landroid/view/View;

    invoke-static {v3, v10}, Lw1/b;->b(Landroid/view/contentcapture/ContentCaptureSession;Landroid/view/View;)Landroid/view/ViewStructure;

    move-result-object v3

    invoke-static {v3}, Lw1/a;->a(Landroid/view/ViewStructure;)Landroid/os/Bundle;

    move-result-object v10

    invoke-virtual {v10, v6, v4}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    iget-object v10, v0, Ll/t;->b:Ljava/lang/Object;

    invoke-static {v10}, Lu1/l2;->f(Ljava/lang/Object;)Landroid/view/contentcapture/ContentCaptureSession;

    move-result-object v10

    invoke-static {v10, v3}, Lw1/b;->d(Landroid/view/contentcapture/ContentCaptureSession;Landroid/view/ViewStructure;)V

    move v3, v8

    :goto_1
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v10

    if-ge v3, v10, :cond_4

    iget-object v10, v0, Ll/t;->b:Ljava/lang/Object;

    invoke-static {v10}, Lu1/l2;->f(Ljava/lang/Object;)Landroid/view/contentcapture/ContentCaptureSession;

    move-result-object v10

    invoke-virtual {v9, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Landroid/view/ViewStructure;

    invoke-static {v10, v11}, Lw1/b;->d(Landroid/view/contentcapture/ContentCaptureSession;Landroid/view/ViewStructure;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_4
    iget-object v3, v0, Ll/t;->b:Ljava/lang/Object;

    invoke-static {v3}, Lu1/l2;->f(Ljava/lang/Object;)Landroid/view/contentcapture/ContentCaptureSession;

    move-result-object v3

    iget-object v9, v0, Ll/t;->c:Ljava/lang/Object;

    check-cast v9, Landroid/view/View;

    invoke-static {v3, v9}, Lw1/b;->b(Landroid/view/contentcapture/ContentCaptureSession;Landroid/view/View;)Landroid/view/ViewStructure;

    move-result-object v3

    invoke-static {v3}, Lw1/a;->a(Landroid/view/ViewStructure;)Landroid/os/Bundle;

    move-result-object v9

    invoke-virtual {v9, v5, v4}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    iget-object v9, v0, Ll/t;->b:Ljava/lang/Object;

    invoke-static {v9}, Lu1/l2;->f(Ljava/lang/Object;)Landroid/view/contentcapture/ContentCaptureSession;

    move-result-object v9

    invoke-static {v9, v3}, Lw1/b;->d(Landroid/view/contentcapture/ContentCaptureSession;Landroid/view/ViewStructure;)V

    :cond_5
    :goto_2
    invoke-virtual {v1}, Lq/z;->clear()V

    :cond_6
    iget-object v1, p0, Lu1/p0;->H:Lq/g;

    invoke-virtual {v1}, Lq/g;->isEmpty()Z

    move-result v3

    xor-int/2addr v3, v4

    if-eqz v3, :cond_a

    invoke-static {v1}, Lr8/p;->W0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v3

    new-instance v9, Ljava/util/ArrayList;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v10

    invoke-direct {v9, v10}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v10

    :goto_3
    if-ge v8, v10, :cond_7

    invoke-interface {v3, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/Number;

    invoke-virtual {v11}, Ljava/lang/Number;->intValue()I

    move-result v11

    int-to-long v11, v11

    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v11

    invoke-virtual {v9, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v8, v8, 0x1

    goto :goto_3

    :cond_7
    invoke-static {v9}, Lr8/p;->X0(Ljava/util/Collection;)[J

    move-result-object v3

    sget v8, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v8, v7, :cond_8

    iget-object v2, v0, Ll/t;->b:Ljava/lang/Object;

    invoke-static {v2}, Lu1/l2;->f(Ljava/lang/Object;)Landroid/view/contentcapture/ContentCaptureSession;

    move-result-object v2

    iget-object v0, v0, Ll/t;->c:Ljava/lang/Object;

    check-cast v0, Landroid/view/View;

    invoke-static {v0}, Lw1/d;->a(Landroid/view/View;)Landroid/view/autofill/AutofillId;

    move-result-object v0

    invoke-static {v2, v0, v3}, Lw1/b;->f(Landroid/view/contentcapture/ContentCaptureSession;Landroid/view/autofill/AutofillId;[J)V

    goto :goto_4

    :cond_8
    if-lt v8, v2, :cond_9

    iget-object v2, v0, Ll/t;->b:Ljava/lang/Object;

    invoke-static {v2}, Lu1/l2;->f(Ljava/lang/Object;)Landroid/view/contentcapture/ContentCaptureSession;

    move-result-object v2

    iget-object v7, v0, Ll/t;->c:Ljava/lang/Object;

    check-cast v7, Landroid/view/View;

    invoke-static {v2, v7}, Lw1/b;->b(Landroid/view/contentcapture/ContentCaptureSession;Landroid/view/View;)Landroid/view/ViewStructure;

    move-result-object v2

    invoke-static {v2}, Lw1/a;->a(Landroid/view/ViewStructure;)Landroid/os/Bundle;

    move-result-object v7

    invoke-virtual {v7, v6, v4}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    iget-object v6, v0, Ll/t;->b:Ljava/lang/Object;

    invoke-static {v6}, Lu1/l2;->f(Ljava/lang/Object;)Landroid/view/contentcapture/ContentCaptureSession;

    move-result-object v6

    invoke-static {v6, v2}, Lw1/b;->d(Landroid/view/contentcapture/ContentCaptureSession;Landroid/view/ViewStructure;)V

    iget-object v2, v0, Ll/t;->b:Ljava/lang/Object;

    invoke-static {v2}, Lu1/l2;->f(Ljava/lang/Object;)Landroid/view/contentcapture/ContentCaptureSession;

    move-result-object v2

    iget-object v6, v0, Ll/t;->c:Ljava/lang/Object;

    check-cast v6, Landroid/view/View;

    invoke-static {v6}, Lw1/d;->a(Landroid/view/View;)Landroid/view/autofill/AutofillId;

    move-result-object v6

    invoke-static {v2, v6, v3}, Lw1/b;->f(Landroid/view/contentcapture/ContentCaptureSession;Landroid/view/autofill/AutofillId;[J)V

    iget-object v2, v0, Ll/t;->b:Ljava/lang/Object;

    invoke-static {v2}, Lu1/l2;->f(Ljava/lang/Object;)Landroid/view/contentcapture/ContentCaptureSession;

    move-result-object v2

    iget-object v3, v0, Ll/t;->c:Ljava/lang/Object;

    check-cast v3, Landroid/view/View;

    invoke-static {v2, v3}, Lw1/b;->b(Landroid/view/contentcapture/ContentCaptureSession;Landroid/view/View;)Landroid/view/ViewStructure;

    move-result-object v2

    invoke-static {v2}, Lw1/a;->a(Landroid/view/ViewStructure;)Landroid/os/Bundle;

    move-result-object v3

    invoke-virtual {v3, v5, v4}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    iget-object v0, v0, Ll/t;->b:Ljava/lang/Object;

    invoke-static {v0}, Lu1/l2;->f(Ljava/lang/Object;)Landroid/view/contentcapture/ContentCaptureSession;

    move-result-object v0

    invoke-static {v0, v2}, Lw1/b;->d(Landroid/view/contentcapture/ContentCaptureSession;Landroid/view/ViewStructure;)V

    :cond_9
    :goto_4
    invoke-virtual {v1}, Lq/g;->clear()V

    :cond_a
    return-void
.end method
