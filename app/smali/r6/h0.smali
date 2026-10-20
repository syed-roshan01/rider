.class public final Lr6/h0;
.super Lr6/v;


# static fields
.field public static final n:Lr6/h0;


# instance fields
.field public final transient f:Lr6/p;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lr6/h0;

    sget-object v1, Lr6/p;->b:Lr6/m;

    sget-object v1, Lr6/a0;->e:Lr6/a0;

    sget-object v2, Lr6/y;->a:Lr6/y;

    invoke-direct {v0, v1, v2}, Lr6/h0;-><init>(Lr6/p;Ljava/util/Comparator;)V

    sput-object v0, Lr6/h0;->n:Lr6/h0;

    return-void
.end method

.method public constructor <init>(Lr6/p;Ljava/util/Comparator;)V
    .locals 0

    invoke-direct {p0, p2}, Lr6/v;-><init>(Ljava/util/Comparator;)V

    iput-object p1, p0, Lr6/h0;->f:Lr6/p;

    return-void
.end method


# virtual methods
.method public final ceiling(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lr6/h0;->v(Ljava/lang/Object;Z)I

    move-result p1

    iget-object v0, p0, Lr6/h0;->f:Lr6/p;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v1

    if-ne p1, v1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    :try_start_0
    iget-object v1, p0, Lr6/h0;->f:Lr6/p;

    iget-object v2, p0, Lr6/v;->d:Ljava/util/Comparator;

    invoke-static {v1, p1, v2}, Ljava/util/Collections;->binarySearch(Ljava/util/List;Ljava/lang/Object;Ljava/util/Comparator;)I

    move-result p1
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    if-ltz p1, :cond_0

    const/4 v0, 0x1

    nop

    :catch_0
    :cond_0
    return v0
.end method

.method public final containsAll(Ljava/util/Collection;)Z
    .locals 7

    instance-of v0, p1, Lr6/x;

    if-eqz v0, :cond_0

    check-cast p1, Lr6/x;

    invoke-interface {p1}, Lr6/x;->f()Ljava/util/Set;

    move-result-object p1

    :cond_0
    iget-object v0, p0, Lr6/v;->d:Ljava/util/Comparator;

    invoke-static {p1, v0}, Lz6/a;->M(Ljava/lang/Iterable;Ljava/util/Comparator;)Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v1

    const/4 v2, 0x1

    if-gt v1, v2, :cond_1

    goto :goto_1

    :cond_1
    iget-object v1, p0, Lr6/h0;->f:Lr6/p;

    const/4 v3, 0x0

    invoke-virtual {v1, v3}, Lr6/p;->p(I)Lr6/m;

    move-result-object v1

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    invoke-virtual {v1}, Lr6/a;->hasNext()Z

    move-result v4

    if-nez v4, :cond_2

    return v3

    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v1}, Lr6/a;->next()Ljava/lang/Object;

    move-result-object v5

    :cond_3
    :goto_0
    :try_start_0
    invoke-interface {v0, v5, v4}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v6

    if-gez v6, :cond_5

    invoke-virtual {v1}, Lr6/a;->hasNext()Z

    move-result v5

    if-nez v5, :cond_4

    return v3

    :cond_4
    invoke-virtual {v1}, Lr6/a;->next()Ljava/lang/Object;

    move-result-object v5

    goto :goto_0

    :cond_5
    if-nez v6, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-nez v4, :cond_6

    return v2

    :cond_6
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_7
    if-lez v6, :cond_3

    :catch_0
    return v3

    :cond_8
    :goto_1
    invoke-super {p0, p1}, Ljava/util/AbstractCollection;->containsAll(Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public final descendingIterator()Ljava/util/Iterator;
    .locals 2

    iget-object v0, p0, Lr6/h0;->f:Lr6/p;

    invoke-virtual {v0}, Lr6/p;->q()Lr6/p;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lr6/p;->p(I)Lr6/m;

    move-result-object v0

    return-object v0
.end method

.method public final e([Ljava/lang/Object;)I
    .locals 1

    iget-object v0, p0, Lr6/h0;->f:Lr6/p;

    invoke-virtual {v0, p1}, Lr6/p;->e([Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 6

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ljava/util/Set;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Ljava/util/Set;

    iget-object v1, p0, Lr6/h0;->f:Lr6/p;

    invoke-virtual {v1}, Ljava/util/AbstractCollection;->size()I

    move-result v3

    invoke-interface {p1}, Ljava/util/Set;->size()I

    move-result v4

    if-eq v3, v4, :cond_2

    return v2

    :cond_2
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_3

    return v0

    :cond_3
    iget-object v3, p0, Lr6/v;->d:Ljava/util/Comparator;

    invoke-static {p1, v3}, Lz6/a;->M(Ljava/lang/Iterable;Ljava/util/Comparator;)Z

    move-result v4

    if-eqz v4, :cond_7

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :try_start_0
    invoke-virtual {v1, v2}, Lr6/p;->p(I)Lr6/m;

    move-result-object v1

    :cond_4
    invoke-virtual {v1}, Lr6/a;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-virtual {v1}, Lr6/a;->next()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    if-eqz v5, :cond_5

    invoke-interface {v3, v4, v5}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v4
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/util/NoSuchElementException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v4, :cond_4

    :cond_5
    return v2

    :cond_6
    return v0

    :catch_0
    return v2

    :cond_7
    invoke-virtual {p0, p1}, Lr6/h0;->containsAll(Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public final first()Ljava/lang/Object;
    .locals 2

    invoke-virtual {p0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lr6/h0;->f:Lr6/p;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final floor(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lr6/h0;->u(Ljava/lang/Object;Z)I

    move-result p1

    sub-int/2addr p1, v0

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lr6/h0;->f:Lr6/p;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public final g()[Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lr6/h0;->f:Lr6/p;

    invoke-virtual {v0}, Lr6/l;->g()[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final higher(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lr6/h0;->v(Ljava/lang/Object;Z)I

    move-result p1

    iget-object v0, p0, Lr6/h0;->f:Lr6/p;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v1

    if-ne p1, v1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public final i()I
    .locals 1

    iget-object v0, p0, Lr6/h0;->f:Lr6/p;

    invoke-virtual {v0}, Lr6/l;->i()I

    move-result v0

    return v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 2

    const/4 v0, 0x0

    iget-object v1, p0, Lr6/h0;->f:Lr6/p;

    invoke-virtual {v1, v0}, Lr6/p;->p(I)Lr6/m;

    move-result-object v0

    return-object v0
.end method

.method public final k()I
    .locals 1

    iget-object v0, p0, Lr6/h0;->f:Lr6/p;

    invoke-virtual {v0}, Lr6/l;->k()I

    move-result v0

    return v0
.end method

.method public final last()Ljava/lang/Object;
    .locals 2

    invoke-virtual {p0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lr6/h0;->f:Lr6/p;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final lower(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lr6/h0;->u(Ljava/lang/Object;Z)I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lr6/h0;->f:Lr6/p;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public final n()Z
    .locals 1

    iget-object v0, p0, Lr6/h0;->f:Lr6/p;

    invoke-virtual {v0}, Lr6/l;->n()Z

    move-result v0

    return v0
.end method

.method public final size()I
    .locals 1

    iget-object v0, p0, Lr6/h0;->f:Lr6/p;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    return v0
.end method

.method public final t(II)Lr6/h0;
    .locals 3

    iget-object v0, p0, Lr6/h0;->f:Lr6/p;

    if-nez p1, :cond_0

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v1

    if-ne p2, v1, :cond_0

    return-object p0

    :cond_0
    iget-object v1, p0, Lr6/v;->d:Ljava/util/Comparator;

    if-ge p1, p2, :cond_1

    new-instance v2, Lr6/h0;

    invoke-virtual {v0, p1, p2}, Lr6/p;->r(II)Lr6/p;

    move-result-object p1

    invoke-direct {v2, p1, v1}, Lr6/h0;-><init>(Lr6/p;Ljava/util/Comparator;)V

    return-object v2

    :cond_1
    invoke-static {v1}, Lr6/v;->r(Ljava/util/Comparator;)Lr6/h0;

    move-result-object p1

    return-object p1
.end method

.method public final u(Ljava/lang/Object;Z)I
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lr6/h0;->f:Lr6/p;

    iget-object v1, p0, Lr6/v;->d:Ljava/util/Comparator;

    invoke-static {v0, p1, v1}, Ljava/util/Collections;->binarySearch(Ljava/util/List;Ljava/lang/Object;Ljava/util/Comparator;)I

    move-result p1

    if-ltz p1, :cond_1

    if-eqz p2, :cond_0

    add-int/lit8 p1, p1, 0x1

    :cond_0
    return p1

    :cond_1
    not-int p1, p1

    return p1
.end method

.method public final v(Ljava/lang/Object;Z)I
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lr6/h0;->f:Lr6/p;

    iget-object v1, p0, Lr6/v;->d:Ljava/util/Comparator;

    invoke-static {v0, p1, v1}, Ljava/util/Collections;->binarySearch(Ljava/util/List;Ljava/lang/Object;Ljava/util/Comparator;)I

    move-result p1

    if-ltz p1, :cond_1

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    add-int/lit8 p1, p1, 0x1

    :goto_0
    return p1

    :cond_1
    not-int p1, p1

    return p1
.end method
