.class public final Lt1/d;
.super Ly0/n;

# interfaces
.implements Lt1/b0;
.implements Lt1/s;
.implements Lt1/r1;
.implements Lt1/p1;
.implements Ls1/f;
.implements Ls1/h;
.implements Lt1/o1;
.implements Lt1/a0;
.implements Lt1/t;
.implements Lc1/c;
.implements Lc1/j;
.implements Lc1/l;
.implements Lt1/m1;
.implements Lb1/a;


# instance fields
.field public u:Ly0/m;

.field public v:Ls1/a;

.field public w:Ljava/util/HashSet;


# virtual methods
.method public final A0()V
    .locals 0

    invoke-virtual {p0}, Lt1/d;->H0()V

    return-void
.end method

.method public final G0(Z)V
    .locals 4

    iget-boolean v0, p0, Ly0/n;->t:Z

    if-eqz v0, :cond_a

    iget-object v0, p0, Lt1/d;->u:Ly0/m;

    iget v1, p0, Ly0/n;->c:I

    and-int/lit8 v1, v1, 0x20

    if-eqz v1, :cond_2

    instance-of v1, v0, Ls1/d;

    if-eqz v1, :cond_0

    new-instance v1, Lt1/c;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lt1/c;-><init>(Lt1/d;I)V

    invoke-static {p0}, Lt1/g;->A(Lt1/n;)Lt1/l1;

    move-result-object v2

    check-cast v2, Lu1/w;

    iget-object v2, v2, Lu1/w;->u0:Lo0/i;

    invoke-virtual {v2, v1}, Lo0/i;->h(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    invoke-virtual {v2, v1}, Lo0/i;->c(Ljava/lang/Object;)V

    :cond_0
    instance-of v1, v0, Ls1/g;

    if-eqz v1, :cond_2

    move-object v1, v0

    check-cast v1, Ls1/g;

    iget-object v2, p0, Lt1/d;->v:Ls1/a;

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ls1/g;->getKey()Ls1/i;

    move-result-object v3

    invoke-virtual {v2, v3}, Ls1/a;->B(Ls1/c;)Z

    move-result v3

    if-eqz v3, :cond_1

    iput-object v1, v2, Ls1/a;->z:Ls1/g;

    invoke-static {p0}, Lt1/g;->A(Lt1/n;)Lt1/l1;

    move-result-object v2

    check-cast v2, Lu1/w;

    invoke-virtual {v2}, Lu1/w;->getModifierLocalManager()Ls1/e;

    move-result-object v2

    invoke-interface {v1}, Ls1/g;->getKey()Ls1/i;

    move-result-object v1

    iget-object v3, v2, Ls1/e;->b:Lo0/i;

    invoke-virtual {v3, p0}, Lo0/i;->c(Ljava/lang/Object;)V

    iget-object v3, v2, Ls1/e;->c:Lo0/i;

    invoke-virtual {v3, v1}, Lo0/i;->c(Ljava/lang/Object;)V

    invoke-virtual {v2}, Ls1/e;->a()V

    goto :goto_0

    :cond_1
    new-instance v2, Ls1/a;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    iput-object v1, v2, Ls1/a;->z:Ls1/g;

    iput-object v2, p0, Lt1/d;->v:Ls1/a;

    invoke-static {p0}, Lt1/g;->d(Lt1/d;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-static {p0}, Lt1/g;->A(Lt1/n;)Lt1/l1;

    move-result-object v2

    check-cast v2, Lu1/w;

    invoke-virtual {v2}, Lu1/w;->getModifierLocalManager()Ls1/e;

    move-result-object v2

    invoke-interface {v1}, Ls1/g;->getKey()Ls1/i;

    move-result-object v1

    iget-object v3, v2, Ls1/e;->b:Lo0/i;

    invoke-virtual {v3, p0}, Lo0/i;->c(Ljava/lang/Object;)V

    iget-object v3, v2, Ls1/e;->c:Lo0/i;

    invoke-virtual {v3, v1}, Lo0/i;->c(Ljava/lang/Object;)V

    invoke-virtual {v2}, Ls1/e;->a()V

    :cond_2
    :goto_0
    iget v1, p0, Ly0/n;->c:I

    and-int/lit8 v1, v1, 0x4

    const/4 v2, 0x2

    if-eqz v1, :cond_3

    if-nez p1, :cond_3

    invoke-static {p0, v2}, Lt1/g;->x(Lt1/n;I)Lt1/c1;

    move-result-object v1

    invoke-virtual {v1}, Lt1/c1;->P0()V

    :cond_3
    iget v1, p0, Ly0/n;->c:I

    and-int/2addr v1, v2

    if-eqz v1, :cond_5

    invoke-static {p0}, Lt1/g;->d(Lt1/d;)Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object v1, p0, Ly0/n;->o:Lt1/c1;

    invoke-static {v1}, Ld7/a;->j(Ljava/lang/Object;)V

    move-object v3, v1

    check-cast v3, Lt1/c0;

    iput-object p0, v3, Lt1/c0;->N:Lt1/b0;

    iget-object v1, v1, Lt1/c1;->H:Lt1/j1;

    if-eqz v1, :cond_4

    invoke-interface {v1}, Lt1/j1;->invalidate()V

    :cond_4
    if-nez p1, :cond_5

    invoke-static {p0, v2}, Lt1/g;->x(Lt1/n;I)Lt1/c1;

    move-result-object p1

    invoke-virtual {p1}, Lt1/c1;->P0()V

    invoke-static {p0}, Lt1/g;->y(Lt1/n;)Landroidx/compose/ui/node/a;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/compose/ui/node/a;->z()V

    :cond_5
    instance-of p1, v0, Lr1/b1;

    if-eqz p1, :cond_6

    move-object p1, v0

    check-cast p1, Lr1/b1;

    invoke-static {p0}, Lt1/g;->y(Lt1/n;)Landroidx/compose/ui/node/a;

    move-result-object v1

    check-cast p1, Lz/b0;

    iget v2, p1, Lz/b0;->b:I

    iget-object p1, p1, Lz/b0;->c:Lv/f2;

    packed-switch v2, :pswitch_data_0

    check-cast p1, Lb0/h0;

    iget-object p1, p1, Lb0/h0;->x:Lm0/n1;

    invoke-virtual {p1, v1}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    goto :goto_1

    :pswitch_0
    check-cast p1, Lz/g0;

    iput-object v1, p1, Lz/g0;->m:Lr1/a1;

    :cond_6
    :goto_1
    iget p1, p0, Ly0/n;->c:I

    and-int/lit16 p1, p1, 0x80

    if-eqz p1, :cond_7

    instance-of p1, v0, Lr1/s0;

    if-eqz p1, :cond_7

    invoke-static {p0}, Lt1/g;->d(Lt1/d;)Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-static {p0}, Lt1/g;->y(Lt1/n;)Landroidx/compose/ui/node/a;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/compose/ui/node/a;->z()V

    :cond_7
    iget p1, p0, Ly0/n;->c:I

    and-int/lit16 p1, p1, 0x100

    if-eqz p1, :cond_8

    instance-of p1, v0, Lr1/q0;

    if-eqz p1, :cond_8

    invoke-static {p0}, Lt1/g;->d(Lt1/d;)Z

    move-result p1

    if-eqz p1, :cond_8

    invoke-static {p0}, Lt1/g;->y(Lt1/n;)Landroidx/compose/ui/node/a;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/compose/ui/node/a;->z()V

    :cond_8
    iget p1, p0, Ly0/n;->c:I

    and-int/lit8 p1, p1, 0x8

    if-eqz p1, :cond_9

    invoke-static {p0}, Lt1/g;->A(Lt1/n;)Lt1/l1;

    move-result-object p1

    check-cast p1, Lu1/w;

    invoke-virtual {p1}, Lu1/w;->x()V

    :cond_9
    return-void

    :cond_a
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "initializeModifier called on unattached node"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final H0()V
    .locals 5

    iget-boolean v0, p0, Ly0/n;->t:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Lt1/d;->u:Ly0/m;

    iget v1, p0, Ly0/n;->c:I

    and-int/lit8 v1, v1, 0x20

    if-eqz v1, :cond_1

    instance-of v1, v0, Ls1/g;

    if-eqz v1, :cond_0

    invoke-static {p0}, Lt1/g;->A(Lt1/n;)Lt1/l1;

    move-result-object v1

    check-cast v1, Lu1/w;

    invoke-virtual {v1}, Lu1/w;->getModifierLocalManager()Ls1/e;

    move-result-object v1

    move-object v2, v0

    check-cast v2, Ls1/g;

    invoke-interface {v2}, Ls1/g;->getKey()Ls1/i;

    move-result-object v2

    iget-object v3, v1, Ls1/e;->d:Lo0/i;

    invoke-static {p0}, Lt1/g;->y(Lt1/n;)Landroidx/compose/ui/node/a;

    move-result-object v4

    invoke-virtual {v3, v4}, Lo0/i;->c(Ljava/lang/Object;)V

    iget-object v3, v1, Ls1/e;->e:Lo0/i;

    invoke-virtual {v3, v2}, Lo0/i;->c(Ljava/lang/Object;)V

    invoke-virtual {v1}, Ls1/e;->a()V

    :cond_0
    instance-of v1, v0, Ls1/d;

    if-eqz v1, :cond_1

    check-cast v0, Ls1/d;

    sget-object v1, Lt1/g;->a:Lt1/e;

    invoke-interface {v0, v1}, Ls1/d;->g(Ls1/h;)V

    :cond_1
    iget v0, p0, Ly0/n;->c:I

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_2

    invoke-static {p0}, Lt1/g;->A(Lt1/n;)Lt1/l1;

    move-result-object v0

    check-cast v0, Lu1/w;

    invoke-virtual {v0}, Lu1/w;->x()V

    :cond_2
    return-void

    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "unInitializeModifier called on unattached node"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final I0()V
    .locals 4

    iget-boolean v0, p0, Ly0/n;->t:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lt1/d;->w:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->clear()V

    invoke-static {p0}, Lt1/g;->A(Lt1/n;)Lt1/l1;

    move-result-object v0

    check-cast v0, Lu1/w;

    invoke-virtual {v0}, Lu1/w;->getSnapshotObserver()Lt1/n1;

    move-result-object v0

    sget-object v1, Lt1/f;->b:Lt1/f;

    new-instance v2, Lt1/c;

    const/4 v3, 0x1

    invoke-direct {v2, p0, v3}, Lt1/c;-><init>(Lt1/d;I)V

    invoke-virtual {v0, p0, v1, v2}, Lt1/n1;->a(Lt1/m1;Lc9/c;Lc9/a;)V

    :cond_0
    return-void
.end method

.method public final P()Z
    .locals 2

    iget-object v0, p0, Lt1/d;->u:Ly0/m;

    const-string v1, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier"

    invoke-static {v0, v1}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Ll/q;->w(Ly0/m;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final Q(Ly1/j;)V
    .locals 7

    iget-object v0, p0, Lt1/d;->u:Ly0/m;

    const-string v1, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsModifier"

    invoke-static {v0, v1}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ly1/k;

    invoke-interface {v0}, Ly1/k;->k()Ly1/j;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsConfiguration"

    invoke-static {p1, v1}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v1, v0, Ly1/j;->b:Z

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    iput-boolean v2, p1, Ly1/j;->b:Z

    :cond_0
    iget-boolean v1, v0, Ly1/j;->c:Z

    if-eqz v1, :cond_1

    iput-boolean v2, p1, Ly1/j;->c:Z

    :cond_1
    iget-object v0, v0, Ly1/j;->a:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ly1/u;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    iget-object v3, p1, Ly1/j;->a:Ljava/util/LinkedHashMap;

    invoke-interface {v3, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    invoke-interface {v3, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_3
    instance-of v4, v1, Ly1/a;

    if-eqz v4, :cond_2

    invoke-virtual {v3, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    const-string v5, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>"

    invoke-static {v4, v5}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, Ly1/a;

    new-instance v5, Ly1/a;

    iget-object v6, v4, Ly1/a;->a:Ljava/lang/String;

    if-nez v6, :cond_4

    move-object v6, v1

    check-cast v6, Ly1/a;

    iget-object v6, v6, Ly1/a;->a:Ljava/lang/String;

    :cond_4
    iget-object v4, v4, Ly1/a;->b:Lq8/a;

    if-nez v4, :cond_5

    check-cast v1, Ly1/a;

    iget-object v4, v1, Ly1/a;->b:Lq8/a;

    :cond_5
    invoke-direct {v5, v6, v4}, Ly1/a;-><init>(Ljava/lang/String;Lq8/a;)V

    invoke-interface {v3, v2, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_6
    return-void
.end method

.method public final R(Lt1/c1;)V
    .locals 0

    return-void
.end method

.method public final a(Lr1/q;Lr1/p;I)I
    .locals 2

    iget-object v0, p0, Lt1/d;->u:Ly0/m;

    const-string v1, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier"

    invoke-static {v0, v1}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lr1/v;

    invoke-interface {v0, p1, p2, p3}, Lr1/v;->a(Lr1/q;Lr1/p;I)I

    move-result p1

    return p1
.end method

.method public final a0(Lc1/o;)V
    .locals 1

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "onFocusEvent called on wrong node"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final b(Lr1/q;Lr1/p;I)I
    .locals 2

    iget-object v0, p0, Lt1/d;->u:Ly0/m;

    const-string v1, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier"

    invoke-static {v0, v1}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lr1/v;

    invoke-interface {v0, p1, p2, p3}, Lr1/v;->b(Lr1/q;Lr1/p;I)I

    move-result p1

    return p1
.end method

.method public final b0()V
    .locals 2

    iget-object v0, p0, Lt1/d;->u:Ly0/m;

    const-string v1, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier"

    invoke-static {v0, v1}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Ll/q;->w(Ly0/m;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final c()Lm2/b;
    .locals 1

    invoke-static {p0}, Lt1/g;->y(Lt1/n;)Landroidx/compose/ui/node/a;

    move-result-object v0

    iget-object v0, v0, Landroidx/compose/ui/node/a;->x:Lm2/b;

    return-object v0
.end method

.method public final d(Lr1/q;Lr1/p;I)I
    .locals 2

    iget-object v0, p0, Lt1/d;->u:Ly0/m;

    const-string v1, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier"

    invoke-static {v0, v1}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lr1/v;

    invoke-interface {v0, p1, p2, p3}, Lr1/v;->d(Lr1/q;Lr1/p;I)I

    move-result p1

    return p1
.end method

.method public final e()J
    .locals 2

    const/16 v0, 0x80

    invoke-static {p0, v0}, Lt1/g;->x(Lt1/n;I)Lt1/c1;

    move-result-object v0

    iget-wide v0, v0, Lr1/x0;->c:J

    invoke-static {v0, v1}, Lo1/s;->m0(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public final f(Lr1/l0;Lr1/i0;J)Lr1/k0;
    .locals 2

    iget-object v0, p0, Lt1/d;->u:Ly0/m;

    const-string v1, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier"

    invoke-static {v0, v1}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lr1/v;

    invoke-interface {v0, p1, p2, p3, p4}, Lr1/v;->f(Lr1/l0;Lr1/i0;J)Lr1/k0;

    move-result-object p1

    return-object p1
.end method

.method public final g(Ls1/i;)Ljava/lang/Object;
    .locals 9

    iget-object v0, p0, Lt1/d;->w:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Ly0/n;->a:Ly0/n;

    iget-boolean v1, v0, Ly0/n;->t:Z

    if-eqz v1, :cond_b

    iget-object v0, v0, Ly0/n;->e:Ly0/n;

    invoke-static {p0}, Lt1/g;->y(Lt1/n;)Landroidx/compose/ui/node/a;

    move-result-object v1

    :goto_0
    if-eqz v1, :cond_a

    iget-object v2, v1, Landroidx/compose/ui/node/a;->C:Lt1/x0;

    iget-object v2, v2, Lt1/x0;->e:Ly0/n;

    iget v2, v2, Ly0/n;->d:I

    and-int/lit8 v2, v2, 0x20

    const/4 v3, 0x0

    if-eqz v2, :cond_8

    :goto_1
    if-eqz v0, :cond_8

    iget v2, v0, Ly0/n;->c:I

    and-int/lit8 v2, v2, 0x20

    if-eqz v2, :cond_7

    move-object v2, v0

    move-object v4, v3

    :goto_2
    if-eqz v2, :cond_7

    instance-of v5, v2, Ls1/f;

    if-eqz v5, :cond_0

    check-cast v2, Ls1/f;

    invoke-interface {v2}, Ls1/f;->j()Lf6/a;

    move-result-object v5

    invoke-virtual {v5, p1}, Lf6/a;->B(Ls1/c;)Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-interface {v2}, Ls1/f;->j()Lf6/a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lf6/a;->I(Ls1/i;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    iget v5, v2, Ly0/n;->c:I

    and-int/lit8 v5, v5, 0x20

    if-eqz v5, :cond_6

    instance-of v5, v2, Lt1/o;

    if-eqz v5, :cond_6

    move-object v5, v2

    check-cast v5, Lt1/o;

    iget-object v5, v5, Lt1/o;->v:Ly0/n;

    const/4 v6, 0x0

    :goto_3
    const/4 v7, 0x1

    if-eqz v5, :cond_5

    iget v8, v5, Ly0/n;->c:I

    and-int/lit8 v8, v8, 0x20

    if-eqz v8, :cond_4

    add-int/lit8 v6, v6, 0x1

    if-ne v6, v7, :cond_1

    move-object v2, v5

    goto :goto_4

    :cond_1
    if-nez v4, :cond_2

    new-instance v4, Lo0/i;

    const/16 v7, 0x10

    new-array v7, v7, [Ly0/n;

    invoke-direct {v4, v7}, Lo0/i;-><init>([Ljava/lang/Object;)V

    :cond_2
    if-eqz v2, :cond_3

    invoke-virtual {v4, v2}, Lo0/i;->c(Ljava/lang/Object;)V

    move-object v2, v3

    :cond_3
    invoke-virtual {v4, v5}, Lo0/i;->c(Ljava/lang/Object;)V

    :cond_4
    :goto_4
    iget-object v5, v5, Ly0/n;->f:Ly0/n;

    goto :goto_3

    :cond_5
    if-ne v6, v7, :cond_6

    goto :goto_2

    :cond_6
    invoke-static {v4}, Lt1/g;->f(Lo0/i;)Ly0/n;

    move-result-object v2

    goto :goto_2

    :cond_7
    iget-object v0, v0, Ly0/n;->e:Ly0/n;

    goto :goto_1

    :cond_8
    invoke-virtual {v1}, Landroidx/compose/ui/node/a;->q()Landroidx/compose/ui/node/a;

    move-result-object v1

    if-eqz v1, :cond_9

    iget-object v0, v1, Landroidx/compose/ui/node/a;->C:Lt1/x0;

    if-eqz v0, :cond_9

    iget-object v0, v0, Lt1/x0;->d:Lt1/s1;

    goto :goto_0

    :cond_9
    move-object v0, v3

    goto/16 :goto_0

    :cond_a
    iget-object p1, p1, Ls1/c;->a:Lc9/a;

    invoke-interface {p1}, Lc9/a;->invoke()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_b
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "visitAncestors called on an unattached node"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final getLayoutDirection()Lm2/l;
    .locals 1

    invoke-static {p0}, Lt1/g;->y(Lt1/n;)Landroidx/compose/ui/node/a;

    move-result-object v0

    iget-object v0, v0, Landroidx/compose/ui/node/a;->y:Lm2/l;

    return-object v0
.end method

.method public final h(Lr1/q;Lr1/p;I)I
    .locals 2

    iget-object v0, p0, Lt1/d;->u:Ly0/m;

    const-string v1, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier"

    invoke-static {v0, v1}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lr1/v;

    invoke-interface {v0, p1, p2, p3}, Lr1/v;->h(Lr1/q;Lr1/p;I)I

    move-result p1

    return p1
.end method

.method public final h0(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object p1, p0, Lt1/d;->u:Ly0/m;

    const-string v0, "null cannot be cast to non-null type androidx.compose.ui.layout.ParentDataModifier"

    invoke-static {p1, v0}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lr1/u0;

    check-cast p1, Ls/s;

    return-object p1
.end method

.method public final i(Lg1/e;)V
    .locals 2

    iget-object v0, p0, Lt1/d;->u:Ly0/m;

    const-string v1, "null cannot be cast to non-null type androidx.compose.ui.draw.DrawModifier"

    invoke-static {v0, v1}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lb1/f;

    invoke-interface {v0, p1}, Lb1/f;->i(Lg1/e;)V

    return-void
.end method

.method public final j()Lf6/a;
    .locals 1

    iget-object v0, p0, Lt1/d;->v:Ls1/a;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Ls1/b;->z:Ls1/b;

    :goto_0
    return-object v0
.end method

.method public final j0()V
    .locals 0

    invoke-static {p0}, Lt1/g;->s(Lt1/s;)V

    return-void
.end method

.method public final m0()Z
    .locals 2

    iget-object v0, p0, Lt1/d;->u:Ly0/m;

    const-string v1, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier"

    invoke-static {v0, v1}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Ll/q;->w(Ly0/m;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final p(J)V
    .locals 3

    iget-object v0, p0, Lt1/d;->u:Ly0/m;

    instance-of v1, v0, Lr1/s0;

    if-eqz v1, :cond_0

    check-cast v0, Lr1/s0;

    check-cast v0, Lr1/t0;

    iget-wide v1, v0, Lr1/t0;->d:J

    invoke-static {v1, v2, p1, p2}, Lm2/k;->a(JJ)Z

    move-result v1

    if-nez v1, :cond_0

    new-instance v1, Lm2/k;

    invoke-direct {v1, p1, p2}, Lm2/k;-><init>(J)V

    iget-object v2, v0, Lr1/t0;->c:Lc9/c;

    invoke-interface {v2, v1}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    iput-wide p1, v0, Lr1/t0;->d:J

    :cond_0
    return-void
.end method

.method public final r0(Lt1/c1;)V
    .locals 2

    iget-object p1, p0, Lt1/d;->u:Ly0/m;

    const-string v0, "null cannot be cast to non-null type androidx.compose.ui.layout.OnGloballyPositionedModifier"

    invoke-static {p1, v0}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lr1/q0;

    check-cast p1, La0/b;

    iget-boolean v0, p1, La0/b;->b:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    iput-boolean v0, p1, La0/b;->b:Z

    iget-object v0, p1, La0/b;->c:Lu8/l;

    if-eqz v0, :cond_0

    sget-object v1, Lq8/l;->a:Lq8/l;

    invoke-virtual {v0, v1}, Lu8/l;->resumeWith(Ljava/lang/Object;)V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p1, La0/b;->c:Lu8/l;

    :cond_1
    return-void
.end method

.method public final s0(Lc1/h;)V
    .locals 1

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "applyFocusProperties called on wrong node"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lt1/d;->u:Ly0/m;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final w()Z
    .locals 1

    iget-boolean v0, p0, Ly0/n;->t:Z

    return v0
.end method

.method public final y(Lo1/k;Lo1/l;J)V
    .locals 0

    iget-object p1, p0, Lt1/d;->u:Ly0/m;

    const-string p2, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier"

    invoke-static {p1, p2}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Ll/q;->w(Ly0/m;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final z0()V
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lt1/d;->G0(Z)V

    return-void
.end method
