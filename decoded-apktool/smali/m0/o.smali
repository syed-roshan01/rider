.class public final Lm0/o;
.super Lm0/u;


# instance fields
.field public final a:I

.field public final b:Z

.field public final c:Z

.field public d:Ljava/util/HashSet;

.field public final e:Ljava/util/LinkedHashSet;

.field public final f:Lm0/n1;

.field public final synthetic g:Lm0/q;


# direct methods
.method public constructor <init>(Lm0/q;IZZLm0/c0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm0/o;->g:Lm0/q;

    iput p2, p0, Lm0/o;->a:I

    iput-boolean p3, p0, Lm0/o;->b:Z

    iput-boolean p4, p0, Lm0/o;->c:Z

    new-instance p1, Ljava/util/LinkedHashSet;

    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object p1, p0, Lm0/o;->e:Ljava/util/LinkedHashSet;

    sget-object p1, Lu0/e;->d:Lu0/e;

    sget-object p2, Lm0/h2;->a:Lm0/h2;

    invoke-static {p1, p2}, Ld7/t;->g0(Ljava/lang/Object;Lm0/z2;)Lm0/n1;

    move-result-object p1

    iput-object p1, p0, Lm0/o;->f:Lm0/n1;

    return-void
.end method


# virtual methods
.method public final a(Lm0/e0;Lu0/b;)V
    .locals 1

    iget-object v0, p0, Lm0/o;->g:Lm0/q;

    iget-object v0, v0, Lm0/q;->b:Lm0/u;

    invoke-virtual {v0, p1, p2}, Lm0/u;->a(Lm0/e0;Lu0/b;)V

    return-void
.end method

.method public final b()V
    .locals 2

    iget-object v0, p0, Lm0/o;->g:Lm0/q;

    iget v1, v0, Lm0/q;->z:I

    add-int/lit8 v1, v1, -0x1

    iput v1, v0, Lm0/q;->z:I

    return-void
.end method

.method public final c()Z
    .locals 1

    iget-boolean v0, p0, Lm0/o;->b:Z

    return v0
.end method

.method public final d()Z
    .locals 1

    iget-boolean v0, p0, Lm0/o;->c:Z

    return v0
.end method

.method public final e()Lm0/r1;
    .locals 1

    iget-object v0, p0, Lm0/o;->f:Lm0/n1;

    invoke-virtual {v0}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm0/r1;

    return-object v0
.end method

.method public final f()I
    .locals 1

    iget v0, p0, Lm0/o;->a:I

    return v0
.end method

.method public final g()Lu8/j;
    .locals 1

    iget-object v0, p0, Lm0/o;->g:Lm0/q;

    iget-object v0, v0, Lm0/q;->b:Lm0/u;

    invoke-virtual {v0}, Lm0/u;->g()Lu8/j;

    move-result-object v0

    return-object v0
.end method

.method public final h()V
    .locals 0

    return-void
.end method

.method public final i(Lm0/e0;)V
    .locals 3

    iget-object v0, p0, Lm0/o;->g:Lm0/q;

    iget-object v1, v0, Lm0/q;->b:Lm0/u;

    iget-object v2, v0, Lm0/q;->g:Lm0/e0;

    invoke-virtual {v1, v2}, Lm0/u;->i(Lm0/e0;)V

    iget-object v0, v0, Lm0/q;->b:Lm0/u;

    invoke-virtual {v0, p1}, Lm0/u;->i(Lm0/e0;)V

    return-void
.end method

.method public final j(Lm0/c1;)Lm0/b1;
    .locals 1

    iget-object v0, p0, Lm0/o;->g:Lm0/q;

    iget-object v0, v0, Lm0/q;->b:Lm0/u;

    invoke-virtual {v0, p1}, Lm0/u;->j(Lm0/c1;)Lm0/b1;

    move-result-object p1

    return-object p1
.end method

.method public final k(Ljava/util/Set;)V
    .locals 1

    iget-object v0, p0, Lm0/o;->d:Ljava/util/HashSet;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lm0/o;->d:Ljava/util/HashSet;

    :cond_0
    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final l(Lm0/q;)V
    .locals 1

    iget-object v0, p0, Lm0/o;->e:Ljava/util/LinkedHashSet;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final m(Lm0/e0;)V
    .locals 1

    iget-object v0, p0, Lm0/o;->g:Lm0/q;

    iget-object v0, v0, Lm0/q;->b:Lm0/u;

    invoke-virtual {v0, p1}, Lm0/u;->m(Lm0/e0;)V

    return-void
.end method

.method public final n()V
    .locals 2

    iget-object v0, p0, Lm0/o;->g:Lm0/q;

    iget v1, v0, Lm0/q;->z:I

    add-int/lit8 v1, v1, 0x1

    iput v1, v0, Lm0/q;->z:I

    return-void
.end method

.method public final o(Lm0/q;)V
    .locals 3

    iget-object v0, p0, Lm0/o;->d:Ljava/util/HashSet;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Set;

    iget-object v2, p1, Lm0/q;->c:Lm0/n2;

    invoke-interface {v1, v2}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lm0/o;->e:Ljava/util/LinkedHashSet;

    invoke-static {v0}, Lz6/a;->c(Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public final p(Lm0/e0;)V
    .locals 1

    iget-object v0, p0, Lm0/o;->g:Lm0/q;

    iget-object v0, v0, Lm0/q;->b:Lm0/u;

    invoke-virtual {v0, p1}, Lm0/u;->p(Lm0/e0;)V

    return-void
.end method

.method public final q()V
    .locals 7

    iget-object v0, p0, Lm0/o;->e:Ljava/util/LinkedHashSet;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lm0/o;->d:Ljava/util/HashSet;

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lm0/q;

    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Set;

    iget-object v6, v3, Lm0/q;->c:Lm0/n2;

    invoke-interface {v5, v6}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-interface {v0}, Ljava/util/Set;->clear()V

    :cond_2
    return-void
.end method
