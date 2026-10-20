.class public final Ly1/o;
.super Ljava/lang/Object;


# instance fields
.field public final a:Ly0/n;

.field public final b:Z

.field public final c:Landroidx/compose/ui/node/a;

.field public final d:Ly1/j;

.field public e:Z

.field public f:Ly1/o;

.field public final g:I


# direct methods
.method public constructor <init>(Ly0/n;ZLandroidx/compose/ui/node/a;Ly1/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly1/o;->a:Ly0/n;

    iput-boolean p2, p0, Ly1/o;->b:Z

    iput-object p3, p0, Ly1/o;->c:Landroidx/compose/ui/node/a;

    iput-object p4, p0, Ly1/o;->d:Ly1/j;

    iget p1, p3, Landroidx/compose/ui/node/a;->b:I

    iput p1, p0, Ly1/o;->g:I

    return-void
.end method


# virtual methods
.method public final a(Ly1/g;Lc9/c;)Ly1/o;
    .locals 5

    new-instance v0, Ly1/j;

    invoke-direct {v0}, Ly1/j;-><init>()V

    const/4 v1, 0x0

    iput-boolean v1, v0, Ly1/j;->b:Z

    iput-boolean v1, v0, Ly1/j;->c:Z

    invoke-interface {p2, v0}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Ly1/o;

    new-instance v3, Ly1/m;

    invoke-direct {v3, p2}, Ly1/m;-><init>(Lc9/c;)V

    new-instance p2, Landroidx/compose/ui/node/a;

    iget v4, p0, Ly1/o;->g:I

    if-eqz p1, :cond_0

    const p1, 0x3b9aca00

    :goto_0
    add-int/2addr v4, p1

    goto :goto_1

    :cond_0
    const p1, 0x77359400

    goto :goto_0

    :goto_1
    const/4 p1, 0x1

    invoke-direct {p2, v4, p1}, Landroidx/compose/ui/node/a;-><init>(IZ)V

    invoke-direct {v2, v3, v1, p2, v0}, Ly1/o;-><init>(Ly0/n;ZLandroidx/compose/ui/node/a;Ly1/j;)V

    iput-boolean p1, v2, Ly1/o;->e:Z

    iput-object p0, v2, Ly1/o;->f:Ly1/o;

    return-object v2
.end method

.method public final b(Landroidx/compose/ui/node/a;Ljava/util/ArrayList;)V
    .locals 5

    invoke-virtual {p1}, Landroidx/compose/ui/node/a;->s()Lo0/i;

    move-result-object p1

    iget v0, p1, Lo0/i;->c:I

    if-lez v0, :cond_3

    iget-object p1, p1, Lo0/i;->a:[Ljava/lang/Object;

    const/4 v1, 0x0

    :cond_0
    aget-object v2, p1, v1

    check-cast v2, Landroidx/compose/ui/node/a;

    invoke-virtual {v2}, Landroidx/compose/ui/node/a;->C()Z

    move-result v3

    if-eqz v3, :cond_2

    iget-object v3, v2, Landroidx/compose/ui/node/a;->C:Lt1/x0;

    const/16 v4, 0x8

    invoke-virtual {v3, v4}, Lt1/x0;->d(I)Z

    move-result v3

    if-eqz v3, :cond_1

    iget-boolean v3, p0, Ly1/o;->b:Z

    invoke-static {v2, v3}, Lo1/s;->f(Landroidx/compose/ui/node/a;Z)Ly1/o;

    move-result-object v2

    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-virtual {p0, v2, p2}, Ly1/o;->b(Landroidx/compose/ui/node/a;Ljava/util/ArrayList;)V

    :cond_2
    :goto_0
    add-int/lit8 v1, v1, 0x1

    if-lt v1, v0, :cond_0

    :cond_3
    return-void
.end method

.method public final c()Lt1/c1;
    .locals 2

    iget-boolean v0, p0, Ly1/o;->e:Z

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Ly1/o;->i()Ly1/o;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ly1/o;->c()Lt1/c1;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_1
    iget-object v0, p0, Ly1/o;->c:Landroidx/compose/ui/node/a;

    invoke-static {v0}, Lo1/s;->K(Landroidx/compose/ui/node/a;)Lt1/r1;

    move-result-object v0

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    iget-object v0, p0, Ly1/o;->a:Ly0/n;

    :goto_1
    const/16 v1, 0x8

    invoke-static {v0, v1}, Lt1/g;->x(Lt1/n;I)Lt1/c1;

    move-result-object v0

    return-object v0
.end method

.method public final d(Ljava/util/List;)V
    .locals 5

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Ly1/o;->l(Z)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    :goto_0
    if-ge v0, v2, :cond_2

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ly1/o;

    invoke-virtual {v3}, Ly1/o;->j()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {p1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_0
    iget-object v4, v3, Ly1/o;->d:Ly1/j;

    iget-boolean v4, v4, Ly1/j;->c:Z

    if-nez v4, :cond_1

    invoke-virtual {v3, p1}, Ly1/o;->d(Ljava/util/List;)V

    :cond_1
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final e()Ld1/d;
    .locals 3

    invoke-virtual {p0}, Ly1/o;->c()Lt1/c1;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lt1/c1;->K0()Ly0/n;

    move-result-object v1

    iget-boolean v1, v1, Ly0/n;->t:Z

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-static {v0}, Landroidx/compose/ui/layout/a;->d(Lr1/s;)Lr1/s;

    move-result-object v1

    const/4 v2, 0x1

    invoke-interface {v1, v0, v2}, Lr1/s;->b(Lr1/s;Z)Ld1/d;

    move-result-object v0

    if-nez v0, :cond_2

    :cond_1
    sget-object v0, Ld1/d;->e:Ld1/d;

    :cond_2
    return-object v0
.end method

.method public final f()Ld1/d;
    .locals 2

    invoke-virtual {p0}, Ly1/o;->c()Lt1/c1;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lt1/c1;->K0()Ly0/n;

    move-result-object v1

    iget-boolean v1, v1, Ly0/n;->t:Z

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-static {v0}, Landroidx/compose/ui/layout/a;->c(Lr1/s;)Ld1/d;

    move-result-object v0

    goto :goto_1

    :cond_1
    sget-object v0, Ld1/d;->e:Ld1/d;

    :goto_1
    return-object v0
.end method

.method public final g(ZZ)Ljava/util/List;
    .locals 0

    if-nez p1, :cond_0

    iget-object p1, p0, Ly1/o;->d:Ly1/j;

    iget-boolean p1, p1, Ly1/j;->c:Z

    if-eqz p1, :cond_0

    sget-object p1, Lr8/r;->a:Lr8/r;

    return-object p1

    :cond_0
    invoke-virtual {p0}, Ly1/o;->j()Z

    move-result p1

    if-eqz p1, :cond_1

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0, p1}, Ly1/o;->d(Ljava/util/List;)V

    return-object p1

    :cond_1
    invoke-virtual {p0, p2}, Ly1/o;->l(Z)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final h()Ly1/j;
    .locals 3

    invoke-virtual {p0}, Ly1/o;->j()Z

    move-result v0

    iget-object v1, p0, Ly1/o;->d:Ly1/j;

    if-eqz v0, :cond_0

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Ly1/j;

    invoke-direct {v0}, Ly1/j;-><init>()V

    iget-boolean v2, v1, Ly1/j;->b:Z

    iput-boolean v2, v0, Ly1/j;->b:Z

    iget-boolean v2, v1, Ly1/j;->c:Z

    iput-boolean v2, v0, Ly1/j;->c:Z

    iget-object v2, v0, Ly1/j;->a:Ljava/util/LinkedHashMap;

    iget-object v1, v1, Ly1/j;->a:Ljava/util/LinkedHashMap;

    invoke-interface {v2, v1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    invoke-virtual {p0, v0}, Ly1/o;->k(Ly1/j;)V

    return-object v0

    :cond_0
    return-object v1
.end method

.method public final i()Ly1/o;
    .locals 4

    iget-object v0, p0, Ly1/o;->f:Ly1/o;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, Ly1/o;->c:Landroidx/compose/ui/node/a;

    iget-boolean v1, p0, Ly1/o;->b:Z

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    sget-object v3, Ly1/n;->c:Ly1/n;

    invoke-static {v0, v3}, Lo1/s;->v(Landroidx/compose/ui/node/a;Ly1/n;)Landroidx/compose/ui/node/a;

    move-result-object v3

    goto :goto_0

    :cond_1
    move-object v3, v2

    :goto_0
    if-nez v3, :cond_2

    sget-object v3, Ly1/n;->d:Ly1/n;

    invoke-static {v0, v3}, Lo1/s;->v(Landroidx/compose/ui/node/a;Ly1/n;)Landroidx/compose/ui/node/a;

    move-result-object v3

    :cond_2
    if-nez v3, :cond_3

    return-object v2

    :cond_3
    invoke-static {v3, v1}, Lo1/s;->f(Landroidx/compose/ui/node/a;Z)Ly1/o;

    move-result-object v0

    return-object v0
.end method

.method public final j()Z
    .locals 1

    iget-boolean v0, p0, Ly1/o;->b:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ly1/o;->d:Ly1/j;

    iget-boolean v0, v0, Ly1/j;->b:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final k(Ly1/j;)V
    .locals 10

    iget-object v0, p0, Ly1/o;->d:Ly1/j;

    iget-boolean v0, v0, Ly1/j;->c:Z

    if-nez v0, :cond_3

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Ly1/o;->l(Z)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    :goto_0
    if-ge v0, v2, :cond_3

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ly1/o;

    invoke-virtual {v3}, Ly1/o;->j()Z

    move-result v4

    if-nez v4, :cond_2

    iget-object v4, v3, Ly1/o;->d:Ly1/j;

    iget-object v4, v4, Ly1/j;->a:Ljava/util/LinkedHashMap;

    invoke-virtual {v4}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_0
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map$Entry;

    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ly1/u;

    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    iget-object v7, p1, Ly1/j;->a:Ljava/util/LinkedHashMap;

    invoke-virtual {v7, v6}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    const-string v9, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Any?>"

    invoke-static {v6, v9}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v9, v6, Ly1/u;->b:Lc9/e;

    invoke-interface {v9, v8, v5}, Lc9/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-eqz v5, :cond_0

    invoke-interface {v7, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_1
    invoke-virtual {v3, p1}, Ly1/o;->k(Ly1/j;)V

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method

.method public final l(Z)Ljava/util/List;
    .locals 5

    iget-boolean v0, p0, Ly1/o;->e:Z

    if-eqz v0, :cond_0

    sget-object p1, Lr8/r;->a:Lr8/r;

    return-object p1

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Ly1/o;->c:Landroidx/compose/ui/node/a;

    invoke-virtual {p0, v1, v0}, Ly1/o;->b(Landroidx/compose/ui/node/a;Ljava/util/ArrayList;)V

    if-eqz p1, :cond_4

    sget-object p1, Ly1/r;->s:Ly1/u;

    iget-object v1, p0, Ly1/o;->d:Ly1/j;

    invoke-static {v1, p1}, Lo1/s;->J(Ly1/j;Ly1/u;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ly1/g;

    const/4 v2, 0x1

    if-eqz p1, :cond_1

    iget-boolean v3, v1, Ly1/j;->b:Z

    if-eqz v3, :cond_1

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    xor-int/2addr v3, v2

    if-eqz v3, :cond_1

    new-instance v3, Lh1/b;

    const/16 v4, 0x9

    invoke-direct {v3, p1, v4}, Lh1/b;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p0, p1, v3}, Ly1/o;->a(Ly1/g;Lc9/c;)Ly1/o;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    sget-object p1, Ly1/r;->a:Ly1/u;

    iget-object v3, v1, Ly1/j;->a:Ljava/util/LinkedHashMap;

    invoke-interface {v3, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v4

    xor-int/2addr v4, v2

    if-eqz v4, :cond_4

    iget-boolean v1, v1, Ly1/j;->b:Z

    if-eqz v1, :cond_4

    invoke-virtual {v3, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    const/4 v1, 0x0

    if-nez p1, :cond_2

    move-object p1, v1

    :cond_2
    check-cast p1, Ljava/util/List;

    if-eqz p1, :cond_3

    invoke-static {p1}, Lr8/p;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    goto :goto_0

    :cond_3
    move-object p1, v1

    :goto_0
    if-eqz p1, :cond_4

    new-instance v3, Lu/h1;

    invoke-direct {v3, p1, v2}, Lu/h1;-><init>(Ljava/lang/String;I)V

    invoke-virtual {p0, v1, v3}, Ly1/o;->a(Ly1/g;Lc9/c;)Ly1/o;

    move-result-object p1

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    :cond_4
    return-object v0
.end method
