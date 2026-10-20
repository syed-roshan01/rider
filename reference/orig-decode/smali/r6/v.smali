.class public abstract Lr6/v;
.super Lr6/t;

# interfaces
.implements Ljava/util/NavigableSet;
.implements Lr6/j0;


# instance fields
.field public final transient d:Ljava/util/Comparator;

.field public transient e:Lr6/v;


# direct methods
.method public constructor <init>(Ljava/util/Comparator;)V
    .locals 0

    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    iput-object p1, p0, Lr6/v;->d:Ljava/util/Comparator;

    return-void
.end method

.method public static r(Ljava/util/Comparator;)Lr6/h0;
    .locals 2

    sget-object v0, Lr6/y;->a:Lr6/y;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, Lr6/h0;->n:Lr6/h0;

    return-object p0

    :cond_0
    new-instance v0, Lr6/h0;

    sget-object v1, Lr6/a0;->e:Lr6/a0;

    invoke-direct {v0, v1, p0}, Lr6/h0;-><init>(Lr6/p;Ljava/util/Comparator;)V

    return-object v0
.end method


# virtual methods
.method public final comparator()Ljava/util/Comparator;
    .locals 1

    iget-object v0, p0, Lr6/v;->d:Ljava/util/Comparator;

    return-object v0
.end method

.method public final descendingSet()Ljava/util/NavigableSet;
    .locals 3

    iget-object v0, p0, Lr6/v;->e:Lr6/v;

    if-nez v0, :cond_1

    move-object v0, p0

    check-cast v0, Lr6/h0;

    iget-object v1, v0, Lr6/v;->d:Ljava/util/Comparator;

    invoke-static {v1}, Ljava/util/Collections;->reverseOrder(Ljava/util/Comparator;)Ljava/util/Comparator;

    move-result-object v1

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-static {v1}, Lr6/v;->r(Ljava/util/Comparator;)Lr6/h0;

    move-result-object v0

    goto :goto_0

    :cond_0
    new-instance v2, Lr6/h0;

    iget-object v0, v0, Lr6/h0;->f:Lr6/p;

    invoke-virtual {v0}, Lr6/p;->q()Lr6/p;

    move-result-object v0

    invoke-direct {v2, v0, v1}, Lr6/h0;-><init>(Lr6/p;Ljava/util/Comparator;)V

    move-object v0, v2

    :goto_0
    iput-object v0, p0, Lr6/v;->e:Lr6/v;

    iput-object p0, v0, Lr6/v;->e:Lr6/v;

    :cond_1
    return-object v0
.end method

.method public final headSet(Ljava/lang/Object;Z)Ljava/util/NavigableSet;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object v0, p0

    check-cast v0, Lr6/h0;

    const/4 v1, 0x0

    .line 2
    invoke-virtual {v0, p1, p2}, Lr6/h0;->u(Ljava/lang/Object;Z)I

    move-result p1

    invoke-virtual {v0, v1, p1}, Lr6/h0;->t(II)Lr6/h0;

    move-result-object p1

    return-object p1
.end method

.method public final headSet(Ljava/lang/Object;)Ljava/util/SortedSet;
    .locals 2

    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object v0, p0

    check-cast v0, Lr6/h0;

    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, p1, v1}, Lr6/h0;->u(Ljava/lang/Object;Z)I

    move-result p1

    invoke-virtual {v0, v1, p1}, Lr6/h0;->t(II)Lr6/h0;

    move-result-object p1

    return-object p1
.end method

.method public final pollFirst()Ljava/lang/Object;
    .locals 1

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final pollLast()Ljava/lang/Object;
    .locals 1

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final s(Ljava/lang/Object;ZLjava/lang/Object;Z)Lr6/h0;
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lr6/v;->d:Ljava/util/Comparator;

    invoke-interface {v0, p1, p3}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v0

    const/4 v1, 0x0

    if-gtz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    invoke-static {v0}, Ly3/e;->H(Z)V

    move-object v0, p0

    check-cast v0, Lr6/h0;

    invoke-virtual {v0, p1, p2}, Lr6/h0;->v(Ljava/lang/Object;Z)I

    move-result p1

    iget-object p2, v0, Lr6/h0;->f:Lr6/p;

    invoke-virtual {p2}, Ljava/util/AbstractCollection;->size()I

    move-result p2

    invoke-virtual {v0, p1, p2}, Lr6/h0;->t(II)Lr6/h0;

    move-result-object p1

    invoke-virtual {p1, p3, p4}, Lr6/h0;->u(Ljava/lang/Object;Z)I

    move-result p2

    invoke-virtual {p1, v1, p2}, Lr6/h0;->t(II)Lr6/h0;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic subSet(Ljava/lang/Object;ZLjava/lang/Object;Z)Ljava/util/NavigableSet;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3, p4}, Lr6/v;->s(Ljava/lang/Object;ZLjava/lang/Object;Z)Lr6/h0;

    move-result-object p1

    return-object p1
.end method

.method public final subSet(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/SortedSet;
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 2
    invoke-virtual {p0, p1, v0, p2, v1}, Lr6/v;->s(Ljava/lang/Object;ZLjava/lang/Object;Z)Lr6/h0;

    move-result-object p1

    return-object p1
.end method

.method public final tailSet(Ljava/lang/Object;Z)Ljava/util/NavigableSet;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object v0, p0

    check-cast v0, Lr6/h0;

    .line 2
    invoke-virtual {v0, p1, p2}, Lr6/h0;->v(Ljava/lang/Object;Z)I

    move-result p1

    iget-object p2, v0, Lr6/h0;->f:Lr6/p;

    .line 3
    invoke-virtual {p2}, Ljava/util/AbstractCollection;->size()I

    move-result p2

    .line 4
    invoke-virtual {v0, p1, p2}, Lr6/h0;->t(II)Lr6/h0;

    move-result-object p1

    return-object p1
.end method

.method public final tailSet(Ljava/lang/Object;)Ljava/util/SortedSet;
    .locals 2

    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object v0, p0

    check-cast v0, Lr6/h0;

    const/4 v1, 0x1

    .line 6
    invoke-virtual {v0, p1, v1}, Lr6/h0;->v(Ljava/lang/Object;Z)I

    move-result p1

    iget-object v1, v0, Lr6/h0;->f:Lr6/p;

    .line 7
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->size()I

    move-result v1

    .line 8
    invoke-virtual {v0, p1, v1}, Lr6/h0;->t(II)Lr6/h0;

    move-result-object p1

    return-object p1
.end method
