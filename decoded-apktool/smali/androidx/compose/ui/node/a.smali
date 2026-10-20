.class public final Landroidx/compose/ui/node/a;
.super Ljava/lang/Object;

# interfaces
.implements Lm0/j;
.implements Lr1/a1;
.implements Lt1/m1;
.implements Lt1/l;
.implements Lt1/k1;


# static fields
.field public static final M:Lt1/e0;

.field public static final N:Lt1/d0;

.field public static final O:Lm0/r;


# instance fields
.field public A:Lm0/b0;

.field public B:Z

.field public final C:Lt1/x0;

.field public final D:Lt1/n0;

.field public E:Lr1/f0;

.field public F:Lt1/c1;

.field public G:Z

.field public H:Ly0/o;

.field public I:Z

.field public J:Z

.field public K:I

.field public L:I

.field public final a:Z

.field public b:I

.field public c:Landroidx/compose/ui/node/a;

.field public d:I

.field public final e:Lt1/v0;

.field public f:Lo0/i;

.field public n:Z

.field public o:Landroidx/compose/ui/node/a;

.field public p:Lt1/l1;

.field public q:I

.field public r:Z

.field public s:Ly1/j;

.field public final t:Lo0/i;

.field public u:Z

.field public v:Lr1/j0;

.field public final w:Lt1/y;

.field public x:Lm2/b;

.field public y:Lm2/l;

.field public z:Lu1/y2;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lt1/e0;

    const-string v1, "Undefined intrinsics block and it is required"

    invoke-direct {v0, v1}, Lt1/f0;-><init>(Ljava/lang/String;)V

    sput-object v0, Landroidx/compose/ui/node/a;->M:Lt1/e0;

    new-instance v0, Lt1/d0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Landroidx/compose/ui/node/a;->N:Lt1/d0;

    new-instance v0, Lm0/r;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lm0/r;-><init>(I)V

    sput-object v0, Landroidx/compose/ui/node/a;->O:Lm0/r;

    return-void
.end method

.method public constructor <init>(IZ)V
    .locals 3

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p2, p0, Landroidx/compose/ui/node/a;->a:Z

    iput p1, p0, Landroidx/compose/ui/node/a;->b:I

    .line 4
    new-instance p1, Lt1/v0;

    .line 5
    new-instance p2, Lo0/i;

    const/16 v0, 0x10

    new-array v1, v0, [Landroidx/compose/ui/node/a;

    invoke-direct {p2, v1}, Lo0/i;-><init>([Ljava/lang/Object;)V

    .line 6
    new-instance v1, Lt/l0;

    const/16 v2, 0x19

    invoke-direct {v1, p0, v2}, Lt/l0;-><init>(Ljava/lang/Object;I)V

    invoke-direct {p1, p2, v1}, Lt1/v0;-><init>(Lo0/i;Lt/l0;)V

    iput-object p1, p0, Landroidx/compose/ui/node/a;->e:Lt1/v0;

    .line 7
    new-instance p1, Lo0/i;

    new-array p2, v0, [Landroidx/compose/ui/node/a;

    invoke-direct {p1, p2}, Lo0/i;-><init>([Ljava/lang/Object;)V

    iput-object p1, p0, Landroidx/compose/ui/node/a;->t:Lo0/i;

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/compose/ui/node/a;->u:Z

    sget-object p2, Landroidx/compose/ui/node/a;->M:Lt1/e0;

    iput-object p2, p0, Landroidx/compose/ui/node/a;->v:Lr1/j0;

    .line 8
    new-instance p2, Lt1/y;

    invoke-direct {p2, p0}, Lt1/y;-><init>(Landroidx/compose/ui/node/a;)V

    iput-object p2, p0, Landroidx/compose/ui/node/a;->w:Lt1/y;

    sget-object p2, Lt1/g;->b:Lm2/c;

    iput-object p2, p0, Landroidx/compose/ui/node/a;->x:Lm2/b;

    sget-object p2, Lm2/l;->a:Lm2/l;

    iput-object p2, p0, Landroidx/compose/ui/node/a;->y:Lm2/l;

    sget-object p2, Landroidx/compose/ui/node/a;->N:Lt1/d0;

    iput-object p2, p0, Landroidx/compose/ui/node/a;->z:Lu1/y2;

    .line 9
    sget-object p2, Lm0/b0;->g:Lm0/a0;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    sget-object p2, Lm0/a0;->b:Lu0/e;

    iput-object p2, p0, Landroidx/compose/ui/node/a;->A:Lm0/b0;

    const/4 p2, 0x3

    iput p2, p0, Landroidx/compose/ui/node/a;->K:I

    iput p2, p0, Landroidx/compose/ui/node/a;->L:I

    .line 11
    new-instance p2, Lt1/x0;

    invoke-direct {p2, p0}, Lt1/x0;-><init>(Landroidx/compose/ui/node/a;)V

    iput-object p2, p0, Landroidx/compose/ui/node/a;->C:Lt1/x0;

    .line 12
    new-instance p2, Lt1/n0;

    invoke-direct {p2, p0}, Lt1/n0;-><init>(Landroidx/compose/ui/node/a;)V

    iput-object p2, p0, Landroidx/compose/ui/node/a;->D:Lt1/n0;

    iput-boolean p1, p0, Landroidx/compose/ui/node/a;->G:Z

    sget-object p1, Ly0/l;->b:Ly0/l;

    iput-object p1, p0, Landroidx/compose/ui/node/a;->H:Ly0/o;

    return-void
.end method

.method public constructor <init>(ZI)V
    .locals 2

    and-int/lit8 v0, p2, 0x1

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move p1, v1

    :cond_0
    and-int/lit8 p2, p2, 0x2

    if-eqz p2, :cond_1

    .line 1
    sget-object p2, Ly1/l;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v0, 0x1

    invoke-virtual {p2, v0}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    move-result v1

    .line 2
    :cond_1
    invoke-direct {p0, v1, p1}, Landroidx/compose/ui/node/a;-><init>(IZ)V

    return-void
.end method

.method public static O(Landroidx/compose/ui/node/a;ZI)V
    .locals 4

    and-int/lit8 v0, p2, 0x1

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move p1, v1

    :cond_0
    const/4 v0, 0x2

    and-int/2addr p2, v0

    const/4 v2, 0x1

    if-eqz p2, :cond_1

    move v1, v2

    :cond_1
    iget-object p2, p0, Landroidx/compose/ui/node/a;->c:Landroidx/compose/ui/node/a;

    if-eqz p2, :cond_a

    iget-object p2, p0, Landroidx/compose/ui/node/a;->p:Lt1/l1;

    if-nez p2, :cond_2

    goto :goto_2

    :cond_2
    iget-boolean v3, p0, Landroidx/compose/ui/node/a;->r:Z

    if-nez v3, :cond_9

    iget-boolean v3, p0, Landroidx/compose/ui/node/a;->a:Z

    if-nez v3, :cond_9

    check-cast p2, Lu1/w;

    invoke-virtual {p2, p0, v2, p1, v1}, Lu1/w;->w(Landroidx/compose/ui/node/a;ZZZ)V

    iget-object p0, p0, Landroidx/compose/ui/node/a;->D:Lt1/n0;

    iget-object p0, p0, Lt1/n0;->p:Lt1/k0;

    invoke-static {p0}, Ld7/a;->j(Ljava/lang/Object;)V

    iget-object p0, p0, Lt1/k0;->D:Lt1/n0;

    iget-object p2, p0, Lt1/n0;->a:Landroidx/compose/ui/node/a;

    invoke-virtual {p2}, Landroidx/compose/ui/node/a;->q()Landroidx/compose/ui/node/a;

    move-result-object p2

    iget-object p0, p0, Lt1/n0;->a:Landroidx/compose/ui/node/a;

    iget p0, p0, Landroidx/compose/ui/node/a;->K:I

    if-eqz p2, :cond_9

    const/4 v1, 0x3

    if-eq p0, v1, :cond_9

    :goto_0
    iget v1, p2, Landroidx/compose/ui/node/a;->K:I

    if-ne v1, p0, :cond_4

    invoke-virtual {p2}, Landroidx/compose/ui/node/a;->q()Landroidx/compose/ui/node/a;

    move-result-object v1

    if-nez v1, :cond_3

    goto :goto_1

    :cond_3
    move-object p2, v1

    goto :goto_0

    :cond_4
    :goto_1
    invoke-static {p0}, Lt/k;->e(I)I

    move-result p0

    if-eqz p0, :cond_7

    if-ne p0, v2, :cond_6

    iget-object p0, p2, Landroidx/compose/ui/node/a;->c:Landroidx/compose/ui/node/a;

    if-eqz p0, :cond_5

    invoke-virtual {p2, p1}, Landroidx/compose/ui/node/a;->N(Z)V

    goto :goto_2

    :cond_5
    invoke-virtual {p2, p1}, Landroidx/compose/ui/node/a;->P(Z)V

    goto :goto_2

    :cond_6
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Intrinsics isn\'t used by the parent"

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_7
    iget-object p0, p2, Landroidx/compose/ui/node/a;->c:Landroidx/compose/ui/node/a;

    if-eqz p0, :cond_8

    invoke-static {p2, p1, v0}, Landroidx/compose/ui/node/a;->O(Landroidx/compose/ui/node/a;ZI)V

    goto :goto_2

    :cond_8
    invoke-static {p2, p1, v0}, Landroidx/compose/ui/node/a;->Q(Landroidx/compose/ui/node/a;ZI)V

    :cond_9
    :goto_2
    return-void

    :cond_a
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Lookahead measure cannot be requested on a node that is not a part of theLookaheadScope"

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static Q(Landroidx/compose/ui/node/a;ZI)V
    .locals 4

    and-int/lit8 v0, p2, 0x1

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move p1, v1

    :cond_0
    const/4 v0, 0x2

    and-int/2addr p2, v0

    const/4 v2, 0x1

    if-eqz p2, :cond_1

    move p2, v2

    goto :goto_0

    :cond_1
    move p2, v1

    :goto_0
    iget-boolean v3, p0, Landroidx/compose/ui/node/a;->r:Z

    if-nez v3, :cond_7

    iget-boolean v3, p0, Landroidx/compose/ui/node/a;->a:Z

    if-nez v3, :cond_7

    iget-object v3, p0, Landroidx/compose/ui/node/a;->p:Lt1/l1;

    if-nez v3, :cond_2

    goto :goto_3

    :cond_2
    check-cast v3, Lu1/w;

    invoke-virtual {v3, p0, v1, p1, p2}, Lu1/w;->w(Landroidx/compose/ui/node/a;ZZZ)V

    iget-object p0, p0, Landroidx/compose/ui/node/a;->D:Lt1/n0;

    iget-object p0, p0, Lt1/n0;->o:Lt1/l0;

    iget-object p0, p0, Lt1/l0;->L:Lt1/n0;

    iget-object p2, p0, Lt1/n0;->a:Landroidx/compose/ui/node/a;

    invoke-virtual {p2}, Landroidx/compose/ui/node/a;->q()Landroidx/compose/ui/node/a;

    move-result-object p2

    iget-object p0, p0, Lt1/n0;->a:Landroidx/compose/ui/node/a;

    iget p0, p0, Landroidx/compose/ui/node/a;->K:I

    if-eqz p2, :cond_7

    const/4 v1, 0x3

    if-eq p0, v1, :cond_7

    :goto_1
    iget v1, p2, Landroidx/compose/ui/node/a;->K:I

    if-ne v1, p0, :cond_4

    invoke-virtual {p2}, Landroidx/compose/ui/node/a;->q()Landroidx/compose/ui/node/a;

    move-result-object v1

    if-nez v1, :cond_3

    goto :goto_2

    :cond_3
    move-object p2, v1

    goto :goto_1

    :cond_4
    :goto_2
    invoke-static {p0}, Lt/k;->e(I)I

    move-result p0

    if-eqz p0, :cond_6

    if-ne p0, v2, :cond_5

    invoke-virtual {p2, p1}, Landroidx/compose/ui/node/a;->P(Z)V

    goto :goto_3

    :cond_5
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Intrinsics isn\'t used by the parent"

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_6
    invoke-static {p2, p1, v0}, Landroidx/compose/ui/node/a;->Q(Landroidx/compose/ui/node/a;ZI)V

    :cond_7
    :goto_3
    return-void
.end method

.method public static R(Landroidx/compose/ui/node/a;)V
    .locals 4

    iget-object v0, p0, Landroidx/compose/ui/node/a;->D:Lt1/n0;

    iget v0, v0, Lt1/n0;->c:I

    sget-object v1, Lt1/g0;->a:[I

    invoke-static {v0}, Lt/k;->e(I)I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    iget-object v2, p0, Landroidx/compose/ui/node/a;->D:Lt1/n0;

    if-ne v0, v1, :cond_4

    iget-boolean v0, v2, Lt1/n0;->g:Z

    const/4 v3, 0x2

    if-eqz v0, :cond_0

    invoke-static {p0, v1, v3}, Landroidx/compose/ui/node/a;->O(Landroidx/compose/ui/node/a;ZI)V

    goto :goto_0

    :cond_0
    iget-boolean v0, v2, Lt1/n0;->h:Z

    if-eqz v0, :cond_1

    invoke-virtual {p0, v1}, Landroidx/compose/ui/node/a;->N(Z)V

    :cond_1
    iget-boolean v0, v2, Lt1/n0;->d:Z

    if-eqz v0, :cond_2

    invoke-static {p0, v1, v3}, Landroidx/compose/ui/node/a;->Q(Landroidx/compose/ui/node/a;ZI)V

    goto :goto_0

    :cond_2
    iget-boolean v0, v2, Lt1/n0;->e:Z

    if-eqz v0, :cond_3

    invoke-virtual {p0, v1}, Landroidx/compose/ui/node/a;->P(Z)V

    :cond_3
    :goto_0
    return-void

    :cond_4
    new-instance p0, Ljava/lang/IllegalStateException;

    iget v0, v2, Lt1/n0;->c:I

    invoke-static {v0}, Ll/q;->B(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "Unexpected state "

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final A()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/compose/ui/node/a;->s:Ly1/j;

    invoke-static {p0}, Lt1/g;->z(Landroidx/compose/ui/node/a;)Lt1/l1;

    move-result-object v0

    check-cast v0, Lu1/w;

    invoke-virtual {v0}, Lu1/w;->x()V

    return-void
.end method

.method public final B()V
    .locals 1

    iget v0, p0, Landroidx/compose/ui/node/a;->d:I

    if-lez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/compose/ui/node/a;->n:Z

    :cond_0
    iget-boolean v0, p0, Landroidx/compose/ui/node/a;->a:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/compose/ui/node/a;->o:Landroidx/compose/ui/node/a;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroidx/compose/ui/node/a;->B()V

    :cond_1
    return-void
.end method

.method public final C()Z
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/node/a;->p:Lt1/l1;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final D()Z
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/node/a;->D:Lt1/n0;

    iget-object v0, v0, Lt1/n0;->o:Lt1/l0;

    iget-boolean v0, v0, Lt1/l0;->y:Z

    return v0
.end method

.method public final E()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/node/a;->D:Lt1/n0;

    iget-object v0, v0, Lt1/n0;->p:Lt1/k0;

    if-eqz v0, :cond_0

    iget-boolean v0, v0, Lt1/k0;->v:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final F()V
    .locals 7

    iget v0, p0, Landroidx/compose/ui/node/a;->K:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Landroidx/compose/ui/node/a;->f()V

    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/node/a;->D:Lt1/n0;

    iget-object v0, v0, Lt1/n0;->p:Lt1/k0;

    invoke-static {v0}, Ld7/a;->j(Ljava/lang/Object;)V

    const/4 v1, 0x1

    const/4 v2, 0x0

    :try_start_0
    iput-boolean v1, v0, Lt1/k0;->f:Z

    iget-boolean v1, v0, Lt1/k0;->r:Z

    if-eqz v1, :cond_2

    iput-boolean v2, v0, Lt1/k0;->C:Z

    iget-boolean v1, v0, Lt1/k0;->v:Z

    iget-wide v3, v0, Lt1/k0;->u:J

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-virtual {v0, v3, v4, v5, v6}, Lt1/k0;->d0(JFLc9/c;)V

    if-eqz v1, :cond_1

    iget-boolean v1, v0, Lt1/k0;->C:Z

    if-nez v1, :cond_1

    iget-object v1, v0, Lt1/k0;->D:Lt1/n0;

    iget-object v1, v1, Lt1/n0;->a:Landroidx/compose/ui/node/a;

    invoke-virtual {v1}, Landroidx/compose/ui/node/a;->q()Landroidx/compose/ui/node/a;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1, v2}, Landroidx/compose/ui/node/a;->N(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_1
    :goto_0
    iput-boolean v2, v0, Lt1/k0;->f:Z

    return-void

    :cond_2
    :try_start_1
    const-string v1, "replace() called on item that was not placed"

    new-instance v3, Ljava/lang/IllegalStateException;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v3, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_1
    iput-boolean v2, v0, Lt1/k0;->f:Z

    throw v1
.end method

.method public final G(III)V
    .locals 5

    if-ne p1, p2, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-ge v0, p3, :cond_3

    if-le p1, p2, :cond_1

    add-int v1, p1, v0

    goto :goto_1

    :cond_1
    move v1, p1

    :goto_1
    if-le p1, p2, :cond_2

    add-int v2, p2, v0

    goto :goto_2

    :cond_2
    add-int v2, p2, p3

    add-int/lit8 v2, v2, -0x2

    :goto_2
    iget-object v3, p0, Landroidx/compose/ui/node/a;->e:Lt1/v0;

    iget-object v4, v3, Lt1/v0;->a:Lo0/i;

    invoke-virtual {v4, v1}, Lo0/i;->n(I)Ljava/lang/Object;

    move-result-object v1

    iget-object v4, v3, Lt1/v0;->b:Lc9/a;

    invoke-interface {v4}, Lc9/a;->invoke()Ljava/lang/Object;

    check-cast v1, Landroidx/compose/ui/node/a;

    iget-object v3, v3, Lt1/v0;->a:Lo0/i;

    invoke-virtual {v3, v2, v1}, Lo0/i;->b(ILjava/lang/Object;)V

    invoke-interface {v4}, Lc9/a;->invoke()Ljava/lang/Object;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, Landroidx/compose/ui/node/a;->J()V

    invoke-virtual {p0}, Landroidx/compose/ui/node/a;->B()V

    invoke-virtual {p0}, Landroidx/compose/ui/node/a;->z()V

    return-void
.end method

.method public final H(Landroidx/compose/ui/node/a;)V
    .locals 4

    iget-object v0, p1, Landroidx/compose/ui/node/a;->D:Lt1/n0;

    iget v0, v0, Lt1/n0;->n:I

    if-lez v0, :cond_0

    iget-object v0, p0, Landroidx/compose/ui/node/a;->D:Lt1/n0;

    iget v1, v0, Lt1/n0;->n:I

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Lt1/n0;->b(I)V

    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/node/a;->p:Lt1/l1;

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Landroidx/compose/ui/node/a;->h()V

    :cond_1
    const/4 v0, 0x0

    iput-object v0, p1, Landroidx/compose/ui/node/a;->o:Landroidx/compose/ui/node/a;

    iget-object v1, p1, Landroidx/compose/ui/node/a;->C:Lt1/x0;

    iget-object v1, v1, Lt1/x0;->c:Lt1/c1;

    iput-object v0, v1, Lt1/c1;->r:Lt1/c1;

    iget-boolean v1, p1, Landroidx/compose/ui/node/a;->a:Z

    if-eqz v1, :cond_3

    iget v1, p0, Landroidx/compose/ui/node/a;->d:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Landroidx/compose/ui/node/a;->d:I

    iget-object p1, p1, Landroidx/compose/ui/node/a;->e:Lt1/v0;

    iget-object p1, p1, Lt1/v0;->a:Lo0/i;

    iget v1, p1, Lo0/i;->c:I

    if-lez v1, :cond_3

    iget-object p1, p1, Lo0/i;->a:[Ljava/lang/Object;

    const/4 v2, 0x0

    :cond_2
    aget-object v3, p1, v2

    check-cast v3, Landroidx/compose/ui/node/a;

    iget-object v3, v3, Landroidx/compose/ui/node/a;->C:Lt1/x0;

    iget-object v3, v3, Lt1/x0;->c:Lt1/c1;

    iput-object v0, v3, Lt1/c1;->r:Lt1/c1;

    add-int/lit8 v2, v2, 0x1

    if-lt v2, v1, :cond_2

    :cond_3
    invoke-virtual {p0}, Landroidx/compose/ui/node/a;->B()V

    invoke-virtual {p0}, Landroidx/compose/ui/node/a;->J()V

    return-void
.end method

.method public final I()V
    .locals 11

    iget-object v0, p0, Landroidx/compose/ui/node/a;->C:Lt1/x0;

    iget-object v1, v0, Lt1/x0;->b:Lt1/x;

    const/16 v2, 0x80

    invoke-static {v2}, Lt1/g;->r(I)Z

    move-result v3

    if-eqz v3, :cond_0

    iget-object v4, v1, Lt1/x;->N:Lt1/s1;

    goto :goto_0

    :cond_0
    iget-object v4, v1, Lt1/x;->N:Lt1/s1;

    iget-object v4, v4, Ly0/n;->e:Ly0/n;

    if-nez v4, :cond_1

    goto/16 :goto_6

    :cond_1
    :goto_0
    sget-object v5, Lt1/c1;->I:Le1/i0;

    invoke-virtual {v1, v3}, Lt1/c1;->M0(Z)Ly0/n;

    move-result-object v1

    :goto_1
    if-eqz v1, :cond_a

    iget v3, v1, Ly0/n;->d:I

    and-int/2addr v3, v2

    if-eqz v3, :cond_a

    iget v3, v1, Ly0/n;->c:I

    and-int/2addr v3, v2

    if-eqz v3, :cond_9

    const/4 v3, 0x0

    move-object v5, v1

    move-object v6, v3

    :goto_2
    if-eqz v5, :cond_9

    instance-of v7, v5, Lt1/a0;

    if-eqz v7, :cond_2

    check-cast v5, Lt1/a0;

    iget-object v7, v0, Lt1/x0;->b:Lt1/x;

    invoke-interface {v5, v7}, Lt1/a0;->R(Lt1/c1;)V

    goto :goto_5

    :cond_2
    iget v7, v5, Ly0/n;->c:I

    and-int/2addr v7, v2

    if-eqz v7, :cond_8

    instance-of v7, v5, Lt1/o;

    if-eqz v7, :cond_8

    move-object v7, v5

    check-cast v7, Lt1/o;

    iget-object v7, v7, Lt1/o;->v:Ly0/n;

    const/4 v8, 0x0

    :goto_3
    const/4 v9, 0x1

    if-eqz v7, :cond_7

    iget v10, v7, Ly0/n;->c:I

    and-int/2addr v10, v2

    if-eqz v10, :cond_6

    add-int/lit8 v8, v8, 0x1

    if-ne v8, v9, :cond_3

    move-object v5, v7

    goto :goto_4

    :cond_3
    if-nez v6, :cond_4

    new-instance v6, Lo0/i;

    const/16 v9, 0x10

    new-array v9, v9, [Ly0/n;

    invoke-direct {v6, v9}, Lo0/i;-><init>([Ljava/lang/Object;)V

    :cond_4
    if-eqz v5, :cond_5

    invoke-virtual {v6, v5}, Lo0/i;->c(Ljava/lang/Object;)V

    move-object v5, v3

    :cond_5
    invoke-virtual {v6, v7}, Lo0/i;->c(Ljava/lang/Object;)V

    :cond_6
    :goto_4
    iget-object v7, v7, Ly0/n;->f:Ly0/n;

    goto :goto_3

    :cond_7
    if-ne v8, v9, :cond_8

    goto :goto_2

    :cond_8
    :goto_5
    invoke-static {v6}, Lt1/g;->f(Lo0/i;)Ly0/n;

    move-result-object v5

    goto :goto_2

    :cond_9
    if-eq v1, v4, :cond_a

    iget-object v1, v1, Ly0/n;->f:Ly0/n;

    goto :goto_1

    :cond_a
    :goto_6
    return-void
.end method

.method public final J()V
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/ui/node/a;->a:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/compose/ui/node/a;->q()Landroidx/compose/ui/node/a;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroidx/compose/ui/node/a;->J()V

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/compose/ui/node/a;->u:Z

    :cond_1
    :goto_0
    return-void
.end method

.method public final K()V
    .locals 3

    iget-object v0, p0, Landroidx/compose/ui/node/a;->e:Lt1/v0;

    iget-object v1, v0, Lt1/v0;->a:Lo0/i;

    iget v1, v1, Lo0/i;->c:I

    add-int/lit8 v1, v1, -0x1

    :goto_0
    const/4 v2, -0x1

    if-ge v2, v1, :cond_0

    iget-object v2, v0, Lt1/v0;->a:Lo0/i;

    iget-object v2, v2, Lo0/i;->a:[Ljava/lang/Object;

    aget-object v2, v2, v1

    check-cast v2, Landroidx/compose/ui/node/a;

    invoke-virtual {p0, v2}, Landroidx/compose/ui/node/a;->H(Landroidx/compose/ui/node/a;)V

    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_0
    iget-object v1, v0, Lt1/v0;->a:Lo0/i;

    invoke-virtual {v1}, Lo0/i;->g()V

    iget-object v0, v0, Lt1/v0;->b:Lc9/a;

    invoke-interface {v0}, Lc9/a;->invoke()Ljava/lang/Object;

    return-void
.end method

.method public final L(II)V
    .locals 2

    if-ltz p2, :cond_1

    add-int/2addr p2, p1

    add-int/lit8 p2, p2, -0x1

    if-gt p1, p2, :cond_0

    :goto_0
    iget-object v0, p0, Landroidx/compose/ui/node/a;->e:Lt1/v0;

    iget-object v1, v0, Lt1/v0;->a:Lo0/i;

    invoke-virtual {v1, p2}, Lo0/i;->n(I)Ljava/lang/Object;

    move-result-object v1

    iget-object v0, v0, Lt1/v0;->b:Lc9/a;

    invoke-interface {v0}, Lc9/a;->invoke()Ljava/lang/Object;

    check-cast v1, Landroidx/compose/ui/node/a;

    invoke-virtual {p0, v1}, Landroidx/compose/ui/node/a;->H(Landroidx/compose/ui/node/a;)V

    if-eq p2, p1, :cond_0

    add-int/lit8 p2, p2, -0x1

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    const-string p1, "count ("

    const-string v0, ") must be greater than 0"

    invoke-static {p1, p2, v0}, Ll/q;->h(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final M()V
    .locals 7

    iget v0, p0, Landroidx/compose/ui/node/a;->K:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Landroidx/compose/ui/node/a;->f()V

    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/node/a;->D:Lt1/n0;

    iget-object v0, v0, Lt1/n0;->o:Lt1/l0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x1

    const/4 v2, 0x0

    :try_start_0
    iput-boolean v1, v0, Lt1/l0;->f:Z

    iget-boolean v1, v0, Lt1/l0;->q:Z

    if-eqz v1, :cond_2

    iget-boolean v1, v0, Lt1/l0;->y:Z

    iget-wide v3, v0, Lt1/l0;->t:J

    iget v5, v0, Lt1/l0;->v:F

    iget-object v6, v0, Lt1/l0;->u:Lc9/c;

    invoke-virtual {v0, v3, v4, v5, v6}, Lt1/l0;->x0(JFLc9/c;)V

    if-eqz v1, :cond_1

    iget-boolean v1, v0, Lt1/l0;->G:Z

    if-nez v1, :cond_1

    iget-object v1, v0, Lt1/l0;->L:Lt1/n0;

    iget-object v1, v1, Lt1/n0;->a:Landroidx/compose/ui/node/a;

    invoke-virtual {v1}, Landroidx/compose/ui/node/a;->q()Landroidx/compose/ui/node/a;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1, v2}, Landroidx/compose/ui/node/a;->P(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_1
    :goto_0
    iput-boolean v2, v0, Lt1/l0;->f:Z

    return-void

    :cond_2
    :try_start_1
    const-string v1, "replace called on unplaced item"

    new-instance v3, Ljava/lang/IllegalStateException;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v3, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_1
    iput-boolean v2, v0, Lt1/l0;->f:Z

    throw v1
.end method

.method public final N(Z)V
    .locals 2

    iget-boolean v0, p0, Landroidx/compose/ui/node/a;->a:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/compose/ui/node/a;->p:Lt1/l1;

    if-eqz v0, :cond_0

    check-cast v0, Lu1/w;

    iget-object v1, v0, Lu1/w;->L:Lt1/t0;

    invoke-virtual {v1, p0, p1}, Lt1/t0;->n(Landroidx/compose/ui/node/a;Z)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    invoke-virtual {v0, p1}, Lu1/w;->z(Landroidx/compose/ui/node/a;)V

    :cond_0
    return-void
.end method

.method public final P(Z)V
    .locals 2

    iget-boolean v0, p0, Landroidx/compose/ui/node/a;->a:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/compose/ui/node/a;->p:Lt1/l1;

    if-eqz v0, :cond_0

    check-cast v0, Lu1/w;

    iget-object v1, v0, Lu1/w;->L:Lt1/t0;

    invoke-virtual {v1, p0, p1}, Lt1/t0;->p(Landroidx/compose/ui/node/a;Z)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    invoke-virtual {v0, p1}, Lu1/w;->z(Landroidx/compose/ui/node/a;)V

    :cond_0
    return-void
.end method

.method public final S()V
    .locals 7

    iget-object v0, p0, Landroidx/compose/ui/node/a;->C:Lt1/x0;

    iget-object v1, v0, Lt1/x0;->d:Lt1/s1;

    :goto_0
    if-eqz v1, :cond_1

    iget-boolean v2, v1, Ly0/n;->t:Z

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Ly0/n;->C0()V

    :cond_0
    iget-object v1, v1, Ly0/n;->e:Ly0/n;

    goto :goto_0

    :cond_1
    iget-object v1, v0, Lt1/x0;->f:Lo0/i;

    if-eqz v1, :cond_4

    iget v2, v1, Lo0/i;->c:I

    if-lez v2, :cond_4

    iget-object v3, v1, Lo0/i;->a:[Ljava/lang/Object;

    const/4 v4, 0x0

    :cond_2
    aget-object v5, v3, v4

    check-cast v5, Ly0/m;

    instance-of v6, v5, Landroidx/compose/ui/input/pointer/SuspendPointerInputElement;

    if-eqz v6, :cond_3

    new-instance v6, Landroidx/compose/ui/node/ForceUpdateElement;

    check-cast v5, Lt1/u0;

    invoke-direct {v6, v5}, Landroidx/compose/ui/node/ForceUpdateElement;-><init>(Lt1/u0;)V

    invoke-virtual {v1, v4, v6}, Lo0/i;->p(ILjava/lang/Object;)Ljava/lang/Object;

    :cond_3
    add-int/lit8 v4, v4, 0x1

    if-lt v4, v2, :cond_2

    :cond_4
    iget-object v0, v0, Lt1/x0;->d:Lt1/s1;

    move-object v1, v0

    :goto_1
    if-eqz v1, :cond_6

    iget-boolean v2, v1, Ly0/n;->t:Z

    if-eqz v2, :cond_5

    invoke-virtual {v1}, Ly0/n;->E0()V

    :cond_5
    iget-object v1, v1, Ly0/n;->e:Ly0/n;

    goto :goto_1

    :cond_6
    :goto_2
    if-eqz v0, :cond_8

    iget-boolean v1, v0, Ly0/n;->t:Z

    if-eqz v1, :cond_7

    invoke-virtual {v0}, Ly0/n;->y0()V

    :cond_7
    iget-object v0, v0, Ly0/n;->e:Ly0/n;

    goto :goto_2

    :cond_8
    return-void
.end method

.method public final T()V
    .locals 6

    invoke-virtual {p0}, Landroidx/compose/ui/node/a;->t()Lo0/i;

    move-result-object v0

    iget v1, v0, Lo0/i;->c:I

    if-lez v1, :cond_2

    iget-object v0, v0, Lo0/i;->a:[Ljava/lang/Object;

    const/4 v2, 0x0

    :cond_0
    aget-object v3, v0, v2

    check-cast v3, Landroidx/compose/ui/node/a;

    iget v4, v3, Landroidx/compose/ui/node/a;->L:I

    iput v4, v3, Landroidx/compose/ui/node/a;->K:I

    const/4 v5, 0x3

    if-eq v4, v5, :cond_1

    invoke-virtual {v3}, Landroidx/compose/ui/node/a;->T()V

    :cond_1
    add-int/lit8 v2, v2, 0x1

    if-lt v2, v1, :cond_0

    :cond_2
    return-void
.end method

.method public final U(Lm2/b;)V
    .locals 8

    iget-object v0, p0, Landroidx/compose/ui/node/a;->x:Lm2/b;

    invoke-static {v0, p1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    iput-object p1, p0, Landroidx/compose/ui/node/a;->x:Lm2/b;

    invoke-virtual {p0}, Landroidx/compose/ui/node/a;->z()V

    invoke-virtual {p0}, Landroidx/compose/ui/node/a;->q()Landroidx/compose/ui/node/a;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroidx/compose/ui/node/a;->x()V

    :cond_0
    invoke-virtual {p0}, Landroidx/compose/ui/node/a;->y()V

    iget-object p1, p0, Landroidx/compose/ui/node/a;->C:Lt1/x0;

    iget-object p1, p1, Lt1/x0;->e:Ly0/n;

    iget v0, p1, Ly0/n;->d:I

    const/16 v1, 0x10

    and-int/2addr v0, v1

    if-eqz v0, :cond_9

    :goto_0
    if-eqz p1, :cond_9

    iget v0, p1, Ly0/n;->c:I

    and-int/2addr v0, v1

    if-eqz v0, :cond_8

    const/4 v0, 0x0

    move-object v2, p1

    move-object v3, v0

    :goto_1
    if-eqz v2, :cond_8

    instance-of v4, v2, Lt1/p1;

    if-eqz v4, :cond_1

    check-cast v2, Lt1/p1;

    invoke-interface {v2}, Lt1/p1;->k()V

    goto :goto_4

    :cond_1
    iget v4, v2, Ly0/n;->c:I

    and-int/2addr v4, v1

    if-eqz v4, :cond_7

    instance-of v4, v2, Lt1/o;

    if-eqz v4, :cond_7

    move-object v4, v2

    check-cast v4, Lt1/o;

    iget-object v4, v4, Lt1/o;->v:Ly0/n;

    const/4 v5, 0x0

    :goto_2
    const/4 v6, 0x1

    if-eqz v4, :cond_6

    iget v7, v4, Ly0/n;->c:I

    and-int/2addr v7, v1

    if-eqz v7, :cond_5

    add-int/lit8 v5, v5, 0x1

    if-ne v5, v6, :cond_2

    move-object v2, v4

    goto :goto_3

    :cond_2
    if-nez v3, :cond_3

    new-instance v3, Lo0/i;

    new-array v6, v1, [Ly0/n;

    invoke-direct {v3, v6}, Lo0/i;-><init>([Ljava/lang/Object;)V

    :cond_3
    if-eqz v2, :cond_4

    invoke-virtual {v3, v2}, Lo0/i;->c(Ljava/lang/Object;)V

    move-object v2, v0

    :cond_4
    invoke-virtual {v3, v4}, Lo0/i;->c(Ljava/lang/Object;)V

    :cond_5
    :goto_3
    iget-object v4, v4, Ly0/n;->f:Ly0/n;

    goto :goto_2

    :cond_6
    if-ne v5, v6, :cond_7

    goto :goto_1

    :cond_7
    :goto_4
    invoke-static {v3}, Lt1/g;->f(Lo0/i;)Ly0/n;

    move-result-object v2

    goto :goto_1

    :cond_8
    iget v0, p1, Ly0/n;->d:I

    and-int/2addr v0, v1

    if-eqz v0, :cond_9

    iget-object p1, p1, Ly0/n;->f:Ly0/n;

    goto :goto_0

    :cond_9
    return-void
.end method

.method public final V(Landroidx/compose/ui/node/a;)V
    .locals 2

    iget-object v0, p0, Landroidx/compose/ui/node/a;->c:Landroidx/compose/ui/node/a;

    invoke-static {p1, v0}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    iput-object p1, p0, Landroidx/compose/ui/node/a;->c:Landroidx/compose/ui/node/a;

    if-eqz p1, :cond_1

    iget-object p1, p0, Landroidx/compose/ui/node/a;->D:Lt1/n0;

    iget-object v0, p1, Lt1/n0;->p:Lt1/k0;

    if-nez v0, :cond_0

    new-instance v0, Lt1/k0;

    invoke-direct {v0, p1}, Lt1/k0;-><init>(Lt1/n0;)V

    iput-object v0, p1, Lt1/n0;->p:Lt1/k0;

    :cond_0
    iget-object p1, p0, Landroidx/compose/ui/node/a;->C:Lt1/x0;

    iget-object v0, p1, Lt1/x0;->c:Lt1/c1;

    iget-object p1, p1, Lt1/x0;->b:Lt1/x;

    iget-object p1, p1, Lt1/c1;->q:Lt1/c1;

    :goto_0
    invoke-static {v0, p1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lt1/c1;->F0()V

    iget-object v0, v0, Lt1/c1;->q:Lt1/c1;

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Landroidx/compose/ui/node/a;->z()V

    :cond_2
    return-void
.end method

.method public final W(Lr1/j0;)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/node/a;->v:Lr1/j0;

    invoke-static {v0, p1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iput-object p1, p0, Landroidx/compose/ui/node/a;->v:Lr1/j0;

    iget-object v0, p0, Landroidx/compose/ui/node/a;->w:Lt1/y;

    iget-object v0, v0, Lt1/y;->b:Lm0/n1;

    invoke-virtual {v0, p1}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    invoke-virtual {p0}, Landroidx/compose/ui/node/a;->z()V

    :cond_0
    return-void
.end method

.method public final X(Ly0/o;)V
    .locals 14

    iget-boolean v0, p0, Landroidx/compose/ui/node/a;->a:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/compose/ui/node/a;->H:Ly0/o;

    sget-object v1, Ly0/l;->b:Ly0/l;

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Modifiers are not supported on virtual LayoutNodes"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    iget-boolean v0, p0, Landroidx/compose/ui/node/a;->J:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    if-eqz v0, :cond_1f

    iput-object p1, p0, Landroidx/compose/ui/node/a;->H:Ly0/o;

    iget-object v0, p0, Landroidx/compose/ui/node/a;->C:Lt1/x0;

    iget-object v2, v0, Lt1/x0;->e:Ly0/n;

    sget-object v6, Landroidx/compose/ui/node/b;->a:Lt1/y0;

    if-eq v2, v6, :cond_1e

    iput-object v6, v2, Ly0/n;->e:Ly0/n;

    iput-object v2, v6, Ly0/n;->f:Ly0/n;

    iget-object v8, v0, Lt1/x0;->f:Lo0/i;

    const/4 v2, 0x0

    if-eqz v8, :cond_2

    iget v3, v8, Lo0/i;->c:I

    goto :goto_1

    :cond_2
    move v3, v2

    :goto_1
    iget-object v4, v0, Lt1/x0;->g:Lo0/i;

    const/16 v5, 0x10

    if-nez v4, :cond_3

    new-instance v4, Lo0/i;

    new-array v7, v5, [Ly0/m;

    invoke-direct {v4, v7}, Lo0/i;-><init>([Ljava/lang/Object;)V

    :cond_3
    move-object v9, v4

    iget v4, v9, Lo0/i;->c:I

    if-ge v4, v5, :cond_4

    move v4, v5

    :cond_4
    new-instance v7, Lo0/i;

    new-array v4, v4, [Ly0/o;

    invoke-direct {v7, v4}, Lo0/i;-><init>([Ljava/lang/Object;)V

    invoke-virtual {v7, p1}, Lo0/i;->c(Ljava/lang/Object;)V

    const/4 p1, 0x0

    move-object v4, p1

    :goto_2
    invoke-virtual {v7}, Lo0/i;->l()Z

    move-result v10

    if-eqz v10, :cond_8

    iget v10, v7, Lo0/i;->c:I

    sub-int/2addr v10, v1

    invoke-virtual {v7, v10}, Lo0/i;->n(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ly0/o;

    instance-of v11, v10, Ly0/i;

    if-eqz v11, :cond_5

    check-cast v10, Ly0/i;

    iget-object v11, v10, Ly0/i;->c:Ly0/o;

    invoke-virtual {v7, v11}, Lo0/i;->c(Ljava/lang/Object;)V

    iget-object v10, v10, Ly0/i;->b:Ly0/o;

    invoke-virtual {v7, v10}, Lo0/i;->c(Ljava/lang/Object;)V

    goto :goto_2

    :cond_5
    instance-of v11, v10, Ly0/m;

    if-eqz v11, :cond_6

    invoke-virtual {v9, v10}, Lo0/i;->c(Ljava/lang/Object;)V

    goto :goto_2

    :cond_6
    if-nez v4, :cond_7

    new-instance v4, Lh1/b;

    const/4 v11, 0x5

    invoke-direct {v4, v9, v11}, Lh1/b;-><init>(Ljava/lang/Object;I)V

    :cond_7
    move-object v11, v4

    invoke-interface {v10, v4}, Ly0/o;->c(Lc9/c;)Z

    move-object v4, v11

    goto :goto_2

    :cond_8
    iget v4, v9, Lo0/i;->c:I

    iget-object v10, v0, Lt1/x0;->d:Lt1/s1;

    const-string v7, "expected prior modifier list to be non-empty"

    iget-object v11, v0, Lt1/x0;->a:Landroidx/compose/ui/node/a;

    if-ne v4, v3, :cond_f

    iget-object v4, v6, Ly0/n;->f:Ly0/n;

    move-object v5, v4

    move v4, v2

    :goto_3
    if-eqz v5, :cond_b

    if-ge v4, v3, :cond_b

    if-eqz v8, :cond_c

    iget-object v6, v8, Lo0/i;->a:[Ljava/lang/Object;

    aget-object v6, v6, v4

    check-cast v6, Ly0/m;

    iget-object v12, v9, Lo0/i;->a:[Ljava/lang/Object;

    aget-object v12, v12, v4

    check-cast v12, Ly0/m;

    invoke-static {v6, v12}, Landroidx/compose/ui/node/b;->a(Ly0/m;Ly0/m;)I

    move-result v13

    if-eqz v13, :cond_a

    if-eq v13, v1, :cond_9

    goto :goto_4

    :cond_9
    invoke-static {v6, v12, v5}, Lt1/x0;->h(Ly0/m;Ly0/m;Ly0/n;)V

    :goto_4
    iget-object v5, v5, Ly0/n;->f:Ly0/n;

    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    :cond_a
    iget-object v5, v5, Ly0/n;->e:Ly0/n;

    :cond_b
    move-object v6, v5

    goto :goto_5

    :cond_c
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :goto_5
    if-ge v4, v3, :cond_14

    if-eqz v8, :cond_e

    if-eqz v6, :cond_d

    invoke-virtual {v11}, Landroidx/compose/ui/node/a;->C()Z

    move-result v7

    move-object v2, v0

    move v3, v4

    move-object v4, v8

    move-object v5, v9

    invoke-virtual/range {v2 .. v7}, Lt1/x0;->f(ILo0/i;Lo0/i;Ly0/n;Z)V

    goto/16 :goto_a

    :cond_d
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "structuralUpdate requires a non-null tail"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_e
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_f
    invoke-virtual {v11}, Landroidx/compose/ui/node/a;->C()Z

    move-result v4

    if-nez v4, :cond_11

    if-nez v3, :cond_11

    move v3, v2

    :goto_6
    iget v4, v9, Lo0/i;->c:I

    if-ge v3, v4, :cond_10

    iget-object v4, v9, Lo0/i;->a:[Ljava/lang/Object;

    aget-object v4, v4, v3

    check-cast v4, Ly0/m;

    invoke-static {v4, v6}, Lt1/x0;->b(Ly0/m;Ly0/n;)Ly0/n;

    move-result-object v6

    add-int/lit8 v3, v3, 0x1

    goto :goto_6

    :cond_10
    iget-object v3, v10, Ly0/n;->e:Ly0/n;

    :goto_7
    if-eqz v3, :cond_18

    sget-object v4, Landroidx/compose/ui/node/b;->a:Lt1/y0;

    if-eq v3, v4, :cond_18

    iget v4, v3, Ly0/n;->c:I

    or-int/2addr v2, v4

    iput v2, v3, Ly0/n;->d:I

    iget-object v3, v3, Ly0/n;->e:Ly0/n;

    goto :goto_7

    :cond_11
    iget v3, v9, Lo0/i;->c:I

    if-nez v3, :cond_16

    if-eqz v8, :cond_15

    iget-object v1, v6, Ly0/n;->f:Ly0/n;

    move v3, v2

    :goto_8
    if-eqz v1, :cond_12

    iget v4, v8, Lo0/i;->c:I

    if-ge v3, v4, :cond_12

    invoke-static {v1}, Lt1/x0;->c(Ly0/n;)Ly0/n;

    move-result-object v1

    iget-object v1, v1, Ly0/n;->f:Ly0/n;

    add-int/lit8 v3, v3, 0x1

    goto :goto_8

    :cond_12
    invoke-virtual {v11}, Landroidx/compose/ui/node/a;->q()Landroidx/compose/ui/node/a;

    move-result-object v1

    if-eqz v1, :cond_13

    iget-object v1, v1, Landroidx/compose/ui/node/a;->C:Lt1/x0;

    iget-object v1, v1, Lt1/x0;->b:Lt1/x;

    goto :goto_9

    :cond_13
    move-object v1, p1

    :goto_9
    iget-object v3, v0, Lt1/x0;->b:Lt1/x;

    iput-object v1, v3, Lt1/c1;->r:Lt1/c1;

    iput-object v3, v0, Lt1/x0;->c:Lt1/c1;

    :cond_14
    move v1, v2

    goto :goto_a

    :cond_15
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_16
    if-nez v8, :cond_17

    new-instance v8, Lo0/i;

    new-array v2, v5, [Ly0/m;

    invoke-direct {v8, v2}, Lo0/i;-><init>([Ljava/lang/Object;)V

    :cond_17
    const/4 v3, 0x0

    invoke-virtual {v11}, Landroidx/compose/ui/node/a;->C()Z

    move-result v7

    move-object v2, v0

    move-object v4, v8

    move-object v5, v9

    invoke-virtual/range {v2 .. v7}, Lt1/x0;->f(ILo0/i;Lo0/i;Ly0/n;Z)V

    :cond_18
    :goto_a
    iput-object v9, v0, Lt1/x0;->f:Lo0/i;

    if-eqz v8, :cond_19

    invoke-virtual {v8}, Lo0/i;->g()V

    goto :goto_b

    :cond_19
    move-object v8, p1

    :goto_b
    iput-object v8, v0, Lt1/x0;->g:Lo0/i;

    sget-object v2, Landroidx/compose/ui/node/b;->a:Lt1/y0;

    iget-object v3, v2, Ly0/n;->f:Ly0/n;

    if-nez v3, :cond_1a

    goto :goto_c

    :cond_1a
    move-object v10, v3

    :goto_c
    iput-object p1, v10, Ly0/n;->e:Ly0/n;

    iput-object p1, v2, Ly0/n;->f:Ly0/n;

    const/4 v3, -0x1

    iput v3, v2, Ly0/n;->d:I

    iput-object p1, v2, Ly0/n;->o:Lt1/c1;

    if-eq v10, v2, :cond_1d

    iput-object v10, v0, Lt1/x0;->e:Ly0/n;

    if-eqz v1, :cond_1b

    invoke-virtual {v0}, Lt1/x0;->g()V

    :cond_1b
    iget-object p1, p0, Landroidx/compose/ui/node/a;->D:Lt1/n0;

    invoke-virtual {p1}, Lt1/n0;->e()V

    const/16 p1, 0x200

    invoke-virtual {v0, p1}, Lt1/x0;->d(I)Z

    move-result p1

    if-eqz p1, :cond_1c

    iget-object p1, p0, Landroidx/compose/ui/node/a;->c:Landroidx/compose/ui/node/a;

    if-nez p1, :cond_1c

    invoke-virtual {p0, p0}, Landroidx/compose/ui/node/a;->V(Landroidx/compose/ui/node/a;)V

    :cond_1c
    return-void

    :cond_1d
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "trimChain did not update the head"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1e
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "padChain called on already padded chain"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1f
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "modifier is updated when deactivated"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final Y(Lu1/y2;)V
    .locals 8

    iget-object v0, p0, Landroidx/compose/ui/node/a;->z:Lu1/y2;

    invoke-static {v0, p1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    iput-object p1, p0, Landroidx/compose/ui/node/a;->z:Lu1/y2;

    iget-object p1, p0, Landroidx/compose/ui/node/a;->C:Lt1/x0;

    iget-object p1, p1, Lt1/x0;->e:Ly0/n;

    iget v0, p1, Ly0/n;->d:I

    const/16 v1, 0x10

    and-int/2addr v0, v1

    if-eqz v0, :cond_8

    :goto_0
    if-eqz p1, :cond_8

    iget v0, p1, Ly0/n;->c:I

    and-int/2addr v0, v1

    if-eqz v0, :cond_7

    const/4 v0, 0x0

    move-object v2, p1

    move-object v3, v0

    :goto_1
    if-eqz v2, :cond_7

    instance-of v4, v2, Lt1/p1;

    if-eqz v4, :cond_0

    check-cast v2, Lt1/p1;

    invoke-interface {v2}, Lt1/p1;->X()V

    goto :goto_4

    :cond_0
    iget v4, v2, Ly0/n;->c:I

    and-int/2addr v4, v1

    if-eqz v4, :cond_6

    instance-of v4, v2, Lt1/o;

    if-eqz v4, :cond_6

    move-object v4, v2

    check-cast v4, Lt1/o;

    iget-object v4, v4, Lt1/o;->v:Ly0/n;

    const/4 v5, 0x0

    :goto_2
    const/4 v6, 0x1

    if-eqz v4, :cond_5

    iget v7, v4, Ly0/n;->c:I

    and-int/2addr v7, v1

    if-eqz v7, :cond_4

    add-int/lit8 v5, v5, 0x1

    if-ne v5, v6, :cond_1

    move-object v2, v4

    goto :goto_3

    :cond_1
    if-nez v3, :cond_2

    new-instance v3, Lo0/i;

    new-array v6, v1, [Ly0/n;

    invoke-direct {v3, v6}, Lo0/i;-><init>([Ljava/lang/Object;)V

    :cond_2
    if-eqz v2, :cond_3

    invoke-virtual {v3, v2}, Lo0/i;->c(Ljava/lang/Object;)V

    move-object v2, v0

    :cond_3
    invoke-virtual {v3, v4}, Lo0/i;->c(Ljava/lang/Object;)V

    :cond_4
    :goto_3
    iget-object v4, v4, Ly0/n;->f:Ly0/n;

    goto :goto_2

    :cond_5
    if-ne v5, v6, :cond_6

    goto :goto_1

    :cond_6
    :goto_4
    invoke-static {v3}, Lt1/g;->f(Lo0/i;)Ly0/n;

    move-result-object v2

    goto :goto_1

    :cond_7
    iget v0, p1, Ly0/n;->d:I

    and-int/2addr v0, v1

    if-eqz v0, :cond_8

    iget-object p1, p1, Ly0/n;->f:Ly0/n;

    goto :goto_0

    :cond_8
    return-void
.end method

.method public final Z()V
    .locals 6

    iget v0, p0, Landroidx/compose/ui/node/a;->d:I

    if-lez v0, :cond_4

    iget-boolean v0, p0, Landroidx/compose/ui/node/a;->n:Z

    if-eqz v0, :cond_4

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/compose/ui/node/a;->n:Z

    iget-object v1, p0, Landroidx/compose/ui/node/a;->f:Lo0/i;

    if-nez v1, :cond_0

    new-instance v1, Lo0/i;

    const/16 v2, 0x10

    new-array v2, v2, [Landroidx/compose/ui/node/a;

    invoke-direct {v1, v2}, Lo0/i;-><init>([Ljava/lang/Object;)V

    iput-object v1, p0, Landroidx/compose/ui/node/a;->f:Lo0/i;

    :cond_0
    invoke-virtual {v1}, Lo0/i;->g()V

    iget-object v2, p0, Landroidx/compose/ui/node/a;->e:Lt1/v0;

    iget-object v2, v2, Lt1/v0;->a:Lo0/i;

    iget v3, v2, Lo0/i;->c:I

    if-lez v3, :cond_3

    iget-object v2, v2, Lo0/i;->a:[Ljava/lang/Object;

    :cond_1
    aget-object v4, v2, v0

    check-cast v4, Landroidx/compose/ui/node/a;

    iget-boolean v5, v4, Landroidx/compose/ui/node/a;->a:Z

    if-eqz v5, :cond_2

    invoke-virtual {v4}, Landroidx/compose/ui/node/a;->t()Lo0/i;

    move-result-object v4

    iget v5, v1, Lo0/i;->c:I

    invoke-virtual {v1, v5, v4}, Lo0/i;->d(ILo0/i;)V

    goto :goto_0

    :cond_2
    invoke-virtual {v1, v4}, Lo0/i;->c(Ljava/lang/Object;)V

    :goto_0
    add-int/lit8 v0, v0, 0x1

    if-lt v0, v3, :cond_1

    :cond_3
    iget-object v0, p0, Landroidx/compose/ui/node/a;->D:Lt1/n0;

    iget-object v1, v0, Lt1/n0;->o:Lt1/l0;

    const/4 v2, 0x1

    iput-boolean v2, v1, Lt1/l0;->C:Z

    iget-object v0, v0, Lt1/n0;->p:Lt1/k0;

    if-eqz v0, :cond_4

    iput-boolean v2, v0, Lt1/k0;->y:Z

    :cond_4
    return-void
.end method

.method public final a()V
    .locals 2

    invoke-virtual {p0}, Landroidx/compose/ui/node/a;->C()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Landroidx/compose/ui/node/a;->E:Lr1/f0;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0, v1}, Lr1/f0;->f(Z)V

    :cond_0
    iget-boolean v0, p0, Landroidx/compose/ui/node/a;->J:Z

    if-eqz v0, :cond_1

    iput-boolean v1, p0, Landroidx/compose/ui/node/a;->J:Z

    invoke-virtual {p0}, Landroidx/compose/ui/node/a;->A()V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Landroidx/compose/ui/node/a;->S()V

    :goto_0
    sget-object v0, Ly1/l;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    move-result v0

    iput v0, p0, Landroidx/compose/ui/node/a;->b:I

    iget-object v0, p0, Landroidx/compose/ui/node/a;->C:Lt1/x0;

    iget-object v1, v0, Lt1/x0;->e:Ly0/n;

    :goto_1
    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ly0/n;->x0()V

    iget-object v1, v1, Ly0/n;->f:Ly0/n;

    goto :goto_1

    :cond_2
    invoke-virtual {v0}, Lt1/x0;->e()V

    invoke-static {p0}, Landroidx/compose/ui/node/a;->R(Landroidx/compose/ui/node/a;)V

    return-void

    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "onReuse is only expected on attached node"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final b()V
    .locals 4

    iget-object v0, p0, Landroidx/compose/ui/node/a;->E:Lr1/f0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lr1/f0;->b()V

    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/node/a;->C:Lt1/x0;

    iget-object v1, v0, Lt1/x0;->c:Lt1/c1;

    iget-object v0, v0, Lt1/x0;->b:Lt1/x;

    iget-object v0, v0, Lt1/c1;->q:Lt1/c1;

    :goto_0
    invoke-static {v1, v0}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    if-eqz v1, :cond_2

    const/4 v2, 0x1

    iput-boolean v2, v1, Lt1/c1;->s:Z

    iget-object v2, v1, Lt1/c1;->F:Lt/l0;

    invoke-virtual {v2}, Lt/l0;->invoke()Ljava/lang/Object;

    iget-object v2, v1, Lt1/c1;->H:Lt1/j1;

    if-eqz v2, :cond_1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v1, v3, v2}, Lt1/c1;->c1(Lc9/c;Z)V

    :cond_1
    iget-object v1, v1, Lt1/c1;->q:Lt1/c1;

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final c()V
    .locals 2

    iget-object v0, p0, Landroidx/compose/ui/node/a;->E:Lr1/f0;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {v0, v1}, Lr1/f0;->f(Z)V

    :cond_0
    iput-boolean v1, p0, Landroidx/compose/ui/node/a;->J:Z

    invoke-virtual {p0}, Landroidx/compose/ui/node/a;->S()V

    invoke-virtual {p0}, Landroidx/compose/ui/node/a;->C()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroidx/compose/ui/node/a;->A()V

    :cond_1
    return-void
.end method

.method public final d(Lt1/l1;)V
    .locals 9

    iget-object v0, p0, Landroidx/compose/ui/node/a;->p:Lt1/l1;

    const/4 v1, 0x0

    if-nez v0, :cond_16

    iget-object v0, p0, Landroidx/compose/ui/node/a;->o:Landroidx/compose/ui/node/a;

    const/4 v2, 0x0

    if-eqz v0, :cond_3

    iget-object v0, v0, Landroidx/compose/ui/node/a;->p:Lt1/l1;

    invoke-static {v0, p1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v3, "Attaching to a different owner("

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ") than the parent\'s owner("

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroidx/compose/ui/node/a;->q()Landroidx/compose/ui/node/a;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object p1, p1, Landroidx/compose/ui/node/a;->p:Lt1/l1;

    goto :goto_0

    :cond_1
    move-object p1, v2

    :goto_0
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "). This tree: "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v1}, Landroidx/compose/ui/node/a;->g(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " Parent tree: "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Landroidx/compose/ui/node/a;->o:Landroidx/compose/ui/node/a;

    if-eqz p1, :cond_2

    invoke-virtual {p1, v1}, Landroidx/compose/ui/node/a;->g(I)Ljava/lang/String;

    move-result-object v2

    :cond_2
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    :goto_1
    invoke-virtual {p0}, Landroidx/compose/ui/node/a;->q()Landroidx/compose/ui/node/a;

    move-result-object v0

    const/4 v3, 0x1

    iget-object v4, p0, Landroidx/compose/ui/node/a;->D:Lt1/n0;

    if-nez v0, :cond_4

    iget-object v5, v4, Lt1/n0;->o:Lt1/l0;

    iput-boolean v3, v5, Lt1/l0;->y:Z

    iget-object v5, v4, Lt1/n0;->p:Lt1/k0;

    if-eqz v5, :cond_4

    iput-boolean v3, v5, Lt1/k0;->v:Z

    :cond_4
    iget-object v5, p0, Landroidx/compose/ui/node/a;->C:Lt1/x0;

    iget-object v6, v5, Lt1/x0;->c:Lt1/c1;

    if-eqz v0, :cond_5

    iget-object v2, v0, Landroidx/compose/ui/node/a;->C:Lt1/x0;

    iget-object v2, v2, Lt1/x0;->b:Lt1/x;

    :cond_5
    iput-object v2, v6, Lt1/c1;->r:Lt1/c1;

    iput-object p1, p0, Landroidx/compose/ui/node/a;->p:Lt1/l1;

    if-eqz v0, :cond_6

    iget v2, v0, Landroidx/compose/ui/node/a;->q:I

    goto :goto_2

    :cond_6
    const/4 v2, -0x1

    :goto_2
    add-int/2addr v2, v3

    iput v2, p0, Landroidx/compose/ui/node/a;->q:I

    const/16 v2, 0x8

    invoke-virtual {v5, v2}, Lt1/x0;->d(I)Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-virtual {p0}, Landroidx/compose/ui/node/a;->A()V

    :cond_7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, p0, Landroidx/compose/ui/node/a;->o:Landroidx/compose/ui/node/a;

    if-eqz v2, :cond_8

    iget-object v2, v2, Landroidx/compose/ui/node/a;->c:Landroidx/compose/ui/node/a;

    if-nez v2, :cond_9

    :cond_8
    iget-object v2, p0, Landroidx/compose/ui/node/a;->c:Landroidx/compose/ui/node/a;

    :cond_9
    invoke-virtual {p0, v2}, Landroidx/compose/ui/node/a;->V(Landroidx/compose/ui/node/a;)V

    iget-boolean v2, p0, Landroidx/compose/ui/node/a;->J:Z

    if-nez v2, :cond_a

    iget-object v2, v5, Lt1/x0;->e:Ly0/n;

    :goto_3
    if-eqz v2, :cond_a

    invoke-virtual {v2}, Ly0/n;->x0()V

    iget-object v2, v2, Ly0/n;->f:Ly0/n;

    goto :goto_3

    :cond_a
    iget-object v2, p0, Landroidx/compose/ui/node/a;->e:Lt1/v0;

    iget-object v2, v2, Lt1/v0;->a:Lo0/i;

    iget v6, v2, Lo0/i;->c:I

    if-lez v6, :cond_c

    iget-object v2, v2, Lo0/i;->a:[Ljava/lang/Object;

    move v7, v1

    :cond_b
    aget-object v8, v2, v7

    check-cast v8, Landroidx/compose/ui/node/a;

    invoke-virtual {v8, p1}, Landroidx/compose/ui/node/a;->d(Lt1/l1;)V

    add-int/2addr v7, v3

    if-lt v7, v6, :cond_b

    :cond_c
    iget-boolean p1, p0, Landroidx/compose/ui/node/a;->J:Z

    if-nez p1, :cond_d

    invoke-virtual {v5}, Lt1/x0;->e()V

    :cond_d
    invoke-virtual {p0}, Landroidx/compose/ui/node/a;->z()V

    if-eqz v0, :cond_e

    invoke-virtual {v0}, Landroidx/compose/ui/node/a;->z()V

    :cond_e
    iget-object p1, v5, Lt1/x0;->c:Lt1/c1;

    iget-object v0, v5, Lt1/x0;->b:Lt1/x;

    iget-object v0, v0, Lt1/c1;->q:Lt1/c1;

    :goto_4
    invoke-static {p1, v0}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_10

    if-eqz p1, :cond_10

    iget-object v2, p1, Lt1/c1;->u:Lc9/c;

    invoke-virtual {p1, v2, v3}, Lt1/c1;->c1(Lc9/c;Z)V

    iget-object v2, p1, Lt1/c1;->H:Lt1/j1;

    if-eqz v2, :cond_f

    invoke-interface {v2}, Lt1/j1;->invalidate()V

    :cond_f
    iget-object p1, p1, Lt1/c1;->q:Lt1/c1;

    goto :goto_4

    :cond_10
    invoke-virtual {v4}, Lt1/n0;->e()V

    iget-boolean p1, p0, Landroidx/compose/ui/node/a;->J:Z

    if-nez p1, :cond_15

    iget-object p1, v5, Lt1/x0;->e:Ly0/n;

    iget v0, p1, Ly0/n;->d:I

    and-int/lit16 v0, v0, 0x1c00

    if-eqz v0, :cond_15

    :goto_5
    if-eqz p1, :cond_15

    iget v0, p1, Ly0/n;->c:I

    and-int/lit16 v2, v0, 0x400

    if-eqz v2, :cond_11

    move v2, v3

    goto :goto_6

    :cond_11
    move v2, v1

    :goto_6
    and-int/lit16 v4, v0, 0x800

    if-eqz v4, :cond_12

    move v4, v3

    goto :goto_7

    :cond_12
    move v4, v1

    :goto_7
    or-int/2addr v2, v4

    and-int/lit16 v0, v0, 0x1000

    if-eqz v0, :cond_13

    move v0, v3

    goto :goto_8

    :cond_13
    move v0, v1

    :goto_8
    or-int/2addr v0, v2

    if-eqz v0, :cond_14

    invoke-static {p1}, Lt1/g;->h(Ly0/n;)V

    :cond_14
    iget-object p1, p1, Ly0/n;->f:Ly0/n;

    goto :goto_5

    :cond_15
    return-void

    :cond_16
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "Cannot attach "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " as it already is attached.  Tree: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v1}, Landroidx/compose/ui/node/a;->g(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final e()V
    .locals 6

    iget v0, p0, Landroidx/compose/ui/node/a;->K:I

    iput v0, p0, Landroidx/compose/ui/node/a;->L:I

    const/4 v0, 0x3

    iput v0, p0, Landroidx/compose/ui/node/a;->K:I

    invoke-virtual {p0}, Landroidx/compose/ui/node/a;->t()Lo0/i;

    move-result-object v1

    iget v2, v1, Lo0/i;->c:I

    if-lez v2, :cond_2

    iget-object v1, v1, Lo0/i;->a:[Ljava/lang/Object;

    const/4 v3, 0x0

    :cond_0
    aget-object v4, v1, v3

    check-cast v4, Landroidx/compose/ui/node/a;

    iget v5, v4, Landroidx/compose/ui/node/a;->K:I

    if-eq v5, v0, :cond_1

    invoke-virtual {v4}, Landroidx/compose/ui/node/a;->e()V

    :cond_1
    add-int/lit8 v3, v3, 0x1

    if-lt v3, v2, :cond_0

    :cond_2
    return-void
.end method

.method public final f()V
    .locals 6

    iget v0, p0, Landroidx/compose/ui/node/a;->K:I

    iput v0, p0, Landroidx/compose/ui/node/a;->L:I

    const/4 v0, 0x3

    iput v0, p0, Landroidx/compose/ui/node/a;->K:I

    invoke-virtual {p0}, Landroidx/compose/ui/node/a;->t()Lo0/i;

    move-result-object v0

    iget v1, v0, Lo0/i;->c:I

    if-lez v1, :cond_2

    iget-object v0, v0, Lo0/i;->a:[Ljava/lang/Object;

    const/4 v2, 0x0

    :cond_0
    aget-object v3, v0, v2

    check-cast v3, Landroidx/compose/ui/node/a;

    iget v4, v3, Landroidx/compose/ui/node/a;->K:I

    const/4 v5, 0x2

    if-ne v4, v5, :cond_1

    invoke-virtual {v3}, Landroidx/compose/ui/node/a;->f()V

    :cond_1
    add-int/lit8 v2, v2, 0x1

    if-lt v2, v1, :cond_0

    :cond_2
    return-void
.end method

.method public final g(I)Ljava/lang/String;
    .locals 7

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, p1, :cond_0

    const-string v3, "  "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    const-string v2, "|-"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroidx/compose/ui/node/a;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0xa

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroidx/compose/ui/node/a;->t()Lo0/i;

    move-result-object v2

    iget v3, v2, Lo0/i;->c:I

    if-lez v3, :cond_2

    iget-object v2, v2, Lo0/i;->a:[Ljava/lang/Object;

    move v4, v1

    :cond_1
    aget-object v5, v2, v4

    check-cast v5, Landroidx/compose/ui/node/a;

    add-int/lit8 v6, p1, 0x1

    invoke-virtual {v5, v6}, Landroidx/compose/ui/node/a;->g(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v4, v4, 0x1

    if-lt v4, v3, :cond_1

    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    if-nez p1, :cond_3

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    invoke-virtual {v0, v1, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const-string p1, "this as java.lang.String\u2026ing(startIndex, endIndex)"

    invoke-static {v0, p1}, Ld7/a;->l(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_3
    return-object v0
.end method

.method public final h()V
    .locals 12

    iget-object v0, p0, Landroidx/compose/ui/node/a;->p:Lt1/l1;

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-nez v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v3, "Cannot detach node that is already detached!  Tree: "

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/compose/ui/node/a;->q()Landroidx/compose/ui/node/a;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v3, v2}, Landroidx/compose/ui/node/a;->g(I)Ljava/lang/String;

    move-result-object v1

    :cond_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    iget-object v3, p0, Landroidx/compose/ui/node/a;->C:Lt1/x0;

    iget-object v4, v3, Lt1/x0;->e:Ly0/n;

    iget v4, v4, Ly0/n;->d:I

    and-int/lit16 v4, v4, 0x400

    const/4 v5, 0x1

    iget-object v6, v3, Lt1/x0;->d:Lt1/s1;

    if-eqz v4, :cond_a

    move-object v4, v6

    :goto_0
    if-eqz v4, :cond_a

    iget v7, v4, Ly0/n;->c:I

    and-int/lit16 v7, v7, 0x400

    if-eqz v7, :cond_9

    move-object v8, v1

    move-object v7, v4

    :goto_1
    if-eqz v7, :cond_9

    instance-of v9, v7, Lc1/p;

    if-eqz v9, :cond_2

    check-cast v7, Lc1/p;

    invoke-virtual {v7}, Lc1/p;->H0()Lc1/o;

    move-result-object v9

    invoke-virtual {v9}, Lc1/o;->a()Z

    move-result v9

    if-eqz v9, :cond_8

    invoke-static {p0}, Lt1/g;->z(Landroidx/compose/ui/node/a;)Lt1/l1;

    move-result-object v9

    check-cast v9, Lu1/w;

    invoke-virtual {v9}, Lu1/w;->getFocusOwner()Lc1/e;

    move-result-object v9

    check-cast v9, Lc1/f;

    invoke-virtual {v9, v5, v2}, Lc1/f;->a(ZZ)V

    invoke-virtual {v7}, Lc1/p;->J0()V

    goto :goto_4

    :cond_2
    iget v9, v7, Ly0/n;->c:I

    and-int/lit16 v9, v9, 0x400

    if-eqz v9, :cond_8

    instance-of v9, v7, Lt1/o;

    if-eqz v9, :cond_8

    move-object v9, v7

    check-cast v9, Lt1/o;

    iget-object v9, v9, Lt1/o;->v:Ly0/n;

    move v10, v2

    :goto_2
    if-eqz v9, :cond_7

    iget v11, v9, Ly0/n;->c:I

    and-int/lit16 v11, v11, 0x400

    if-eqz v11, :cond_6

    add-int/lit8 v10, v10, 0x1

    if-ne v10, v5, :cond_3

    move-object v7, v9

    goto :goto_3

    :cond_3
    if-nez v8, :cond_4

    new-instance v8, Lo0/i;

    const/16 v11, 0x10

    new-array v11, v11, [Ly0/n;

    invoke-direct {v8, v11}, Lo0/i;-><init>([Ljava/lang/Object;)V

    :cond_4
    if-eqz v7, :cond_5

    invoke-virtual {v8, v7}, Lo0/i;->c(Ljava/lang/Object;)V

    move-object v7, v1

    :cond_5
    invoke-virtual {v8, v9}, Lo0/i;->c(Ljava/lang/Object;)V

    :cond_6
    :goto_3
    iget-object v9, v9, Ly0/n;->f:Ly0/n;

    goto :goto_2

    :cond_7
    if-ne v10, v5, :cond_8

    goto :goto_1

    :cond_8
    :goto_4
    invoke-static {v8}, Lt1/g;->f(Lo0/i;)Ly0/n;

    move-result-object v7

    goto :goto_1

    :cond_9
    iget-object v4, v4, Ly0/n;->e:Ly0/n;

    goto :goto_0

    :cond_a
    invoke-virtual {p0}, Landroidx/compose/ui/node/a;->q()Landroidx/compose/ui/node/a;

    move-result-object v4

    iget-object v7, p0, Landroidx/compose/ui/node/a;->D:Lt1/n0;

    if-eqz v4, :cond_b

    invoke-virtual {v4}, Landroidx/compose/ui/node/a;->x()V

    invoke-virtual {v4}, Landroidx/compose/ui/node/a;->z()V

    iget-object v4, v7, Lt1/n0;->o:Lt1/l0;

    const/4 v8, 0x3

    iput v8, v4, Lt1/l0;->r:I

    iget-object v4, v7, Lt1/n0;->p:Lt1/k0;

    if-eqz v4, :cond_b

    iput v8, v4, Lt1/k0;->p:I

    :cond_b
    iget-object v4, v7, Lt1/n0;->o:Lt1/l0;

    iget-object v4, v4, Lt1/l0;->A:Lt1/h0;

    iput-boolean v5, v4, Lt1/a;->b:Z

    iput-boolean v2, v4, Lt1/a;->c:Z

    iput-boolean v2, v4, Lt1/a;->e:Z

    iput-boolean v2, v4, Lt1/a;->d:Z

    iput-boolean v2, v4, Lt1/a;->f:Z

    iput-boolean v2, v4, Lt1/a;->g:Z

    iput-object v1, v4, Lt1/a;->h:Lt1/b;

    iget-object v4, v7, Lt1/n0;->p:Lt1/k0;

    if-eqz v4, :cond_c

    iget-object v4, v4, Lt1/k0;->w:Lt1/o0;

    if-eqz v4, :cond_c

    iput-boolean v5, v4, Lt1/a;->b:Z

    iput-boolean v2, v4, Lt1/a;->c:Z

    iput-boolean v2, v4, Lt1/a;->e:Z

    iput-boolean v2, v4, Lt1/a;->d:Z

    iput-boolean v2, v4, Lt1/a;->f:Z

    iput-boolean v2, v4, Lt1/a;->g:Z

    iput-object v1, v4, Lt1/a;->h:Lt1/b;

    :cond_c
    const/16 v4, 0x8

    invoke-virtual {v3, v4}, Lt1/x0;->d(I)Z

    move-result v3

    if-eqz v3, :cond_d

    invoke-virtual {p0}, Landroidx/compose/ui/node/a;->A()V

    :cond_d
    move-object v3, v6

    :goto_5
    if-eqz v3, :cond_f

    iget-boolean v4, v3, Ly0/n;->t:Z

    if-eqz v4, :cond_e

    invoke-virtual {v3}, Ly0/n;->E0()V

    :cond_e
    iget-object v3, v3, Ly0/n;->e:Ly0/n;

    goto :goto_5

    :cond_f
    iput-boolean v5, p0, Landroidx/compose/ui/node/a;->r:Z

    iget-object v3, p0, Landroidx/compose/ui/node/a;->e:Lt1/v0;

    iget-object v3, v3, Lt1/v0;->a:Lo0/i;

    iget v4, v3, Lo0/i;->c:I

    if-lez v4, :cond_11

    iget-object v3, v3, Lo0/i;->a:[Ljava/lang/Object;

    move v8, v2

    :cond_10
    aget-object v9, v3, v8

    check-cast v9, Landroidx/compose/ui/node/a;

    invoke-virtual {v9}, Landroidx/compose/ui/node/a;->h()V

    add-int/2addr v8, v5

    if-lt v8, v4, :cond_10

    :cond_11
    iput-boolean v2, p0, Landroidx/compose/ui/node/a;->r:Z

    :goto_6
    if-eqz v6, :cond_13

    iget-boolean v3, v6, Ly0/n;->t:Z

    if-eqz v3, :cond_12

    invoke-virtual {v6}, Ly0/n;->y0()V

    :cond_12
    iget-object v6, v6, Ly0/n;->e:Ly0/n;

    goto :goto_6

    :cond_13
    check-cast v0, Lu1/w;

    iget-object v3, v0, Lu1/w;->L:Lt1/t0;

    iget-object v3, v3, Lt1/t0;->b:Lt1/r;

    iget-object v4, v3, Lt1/r;->a:Lt1/q;

    invoke-virtual {v4, p0}, Lt1/q;->c(Landroidx/compose/ui/node/a;)Z

    iget-object v3, v3, Lt1/r;->b:Lt1/q;

    invoke-virtual {v3, p0}, Lt1/q;->c(Landroidx/compose/ui/node/a;)Z

    iput-boolean v5, v0, Lu1/w;->C:Z

    iput-object v1, p0, Landroidx/compose/ui/node/a;->p:Lt1/l1;

    invoke-virtual {p0, v1}, Landroidx/compose/ui/node/a;->V(Landroidx/compose/ui/node/a;)V

    iput v2, p0, Landroidx/compose/ui/node/a;->q:I

    iget-object v0, v7, Lt1/n0;->o:Lt1/l0;

    const v1, 0x7fffffff

    iput v1, v0, Lt1/l0;->o:I

    iput v1, v0, Lt1/l0;->n:I

    iput-boolean v2, v0, Lt1/l0;->y:Z

    iget-object v0, v7, Lt1/n0;->p:Lt1/k0;

    if-eqz v0, :cond_14

    iput v1, v0, Lt1/k0;->o:I

    iput v1, v0, Lt1/k0;->n:I

    iput-boolean v2, v0, Lt1/k0;->v:Z

    :cond_14
    return-void
.end method

.method public final i(Le1/p;)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/node/a;->C:Lt1/x0;

    iget-object v0, v0, Lt1/x0;->c:Lt1/c1;

    invoke-virtual {v0, p1}, Lt1/c1;->C0(Le1/p;)V

    return-void
.end method

.method public final j()V
    .locals 3

    iget-object v0, p0, Landroidx/compose/ui/node/a;->c:Landroidx/compose/ui/node/a;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    invoke-static {p0, v2, v1}, Landroidx/compose/ui/node/a;->O(Landroidx/compose/ui/node/a;ZI)V

    goto :goto_0

    :cond_0
    invoke-static {p0, v2, v1}, Landroidx/compose/ui/node/a;->Q(Landroidx/compose/ui/node/a;ZI)V

    :goto_0
    iget-object v0, p0, Landroidx/compose/ui/node/a;->D:Lt1/n0;

    iget-object v0, v0, Lt1/n0;->o:Lt1/l0;

    iget-boolean v1, v0, Lt1/l0;->p:Z

    if-eqz v1, :cond_1

    iget-wide v0, v0, Lr1/x0;->d:J

    new-instance v2, Lm2/a;

    invoke-direct {v2, v0, v1}, Lm2/a;-><init>(J)V

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    if-eqz v2, :cond_2

    iget-object v0, p0, Landroidx/compose/ui/node/a;->p:Lt1/l1;

    if-eqz v0, :cond_3

    check-cast v0, Lu1/w;

    iget-wide v1, v2, Lm2/a;->a:J

    invoke-virtual {v0, p0, v1, v2}, Lu1/w;->s(Landroidx/compose/ui/node/a;J)V

    goto :goto_2

    :cond_2
    iget-object v0, p0, Landroidx/compose/ui/node/a;->p:Lt1/l1;

    if-eqz v0, :cond_3

    invoke-static {v0}, Lt1/l1;->a(Lt1/l1;)V

    :cond_3
    :goto_2
    return-void
.end method

.method public final k()Ljava/util/List;
    .locals 9

    iget-object v0, p0, Landroidx/compose/ui/node/a;->D:Lt1/n0;

    iget-object v0, v0, Lt1/n0;->p:Lt1/k0;

    invoke-static {v0}, Ld7/a;->j(Ljava/lang/Object;)V

    iget-object v1, v0, Lt1/k0;->D:Lt1/n0;

    iget-object v2, v1, Lt1/n0;->a:Landroidx/compose/ui/node/a;

    invoke-virtual {v2}, Landroidx/compose/ui/node/a;->m()Ljava/util/List;

    iget-boolean v2, v0, Lt1/k0;->y:Z

    iget-object v3, v0, Lt1/k0;->x:Lo0/i;

    if-nez v2, :cond_0

    invoke-virtual {v3}, Lo0/i;->f()Ljava/util/List;

    move-result-object v0

    goto :goto_1

    :cond_0
    iget-object v1, v1, Lt1/n0;->a:Landroidx/compose/ui/node/a;

    invoke-virtual {v1}, Landroidx/compose/ui/node/a;->t()Lo0/i;

    move-result-object v2

    iget v4, v2, Lo0/i;->c:I

    const/4 v5, 0x0

    if-lez v4, :cond_3

    iget-object v2, v2, Lo0/i;->a:[Ljava/lang/Object;

    move v6, v5

    :cond_1
    aget-object v7, v2, v6

    check-cast v7, Landroidx/compose/ui/node/a;

    iget v8, v3, Lo0/i;->c:I

    if-gt v8, v6, :cond_2

    iget-object v7, v7, Landroidx/compose/ui/node/a;->D:Lt1/n0;

    iget-object v7, v7, Lt1/n0;->p:Lt1/k0;

    invoke-static {v7}, Ld7/a;->j(Ljava/lang/Object;)V

    invoke-virtual {v3, v7}, Lo0/i;->c(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    iget-object v7, v7, Landroidx/compose/ui/node/a;->D:Lt1/n0;

    iget-object v7, v7, Lt1/n0;->p:Lt1/k0;

    invoke-static {v7}, Ld7/a;->j(Ljava/lang/Object;)V

    invoke-virtual {v3, v6, v7}, Lo0/i;->p(ILjava/lang/Object;)Ljava/lang/Object;

    :goto_0
    add-int/lit8 v6, v6, 0x1

    if-lt v6, v4, :cond_1

    :cond_3
    invoke-virtual {v1}, Landroidx/compose/ui/node/a;->m()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    iget v2, v3, Lo0/i;->c:I

    invoke-virtual {v3, v1, v2}, Lo0/i;->o(II)V

    iput-boolean v5, v0, Lt1/k0;->y:Z

    invoke-virtual {v3}, Lo0/i;->f()Ljava/util/List;

    move-result-object v0

    :goto_1
    return-object v0
.end method

.method public final l()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/node/a;->D:Lt1/n0;

    iget-object v0, v0, Lt1/n0;->o:Lt1/l0;

    invoke-virtual {v0}, Lt1/l0;->j0()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final m()Ljava/util/List;
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/ui/node/a;->t()Lo0/i;

    move-result-object v0

    invoke-virtual {v0}, Lo0/i;->f()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final n()Ly1/j;
    .locals 4

    iget-object v0, p0, Landroidx/compose/ui/node/a;->C:Lt1/x0;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lt1/x0;->d(I)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/compose/ui/node/a;->s:Ly1/j;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ld9/u;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    new-instance v1, Ly1/j;

    invoke-direct {v1}, Ly1/j;-><init>()V

    iput-object v1, v0, Ld9/u;->a:Ljava/lang/Object;

    invoke-static {p0}, Lt1/g;->z(Landroidx/compose/ui/node/a;)Lt1/l1;

    move-result-object v1

    check-cast v1, Lu1/w;

    invoke-virtual {v1}, Lu1/w;->getSnapshotObserver()Lt1/n1;

    move-result-object v1

    new-instance v2, Lu/r0;

    invoke-direct {v2, p0, v0}, Lu/r0;-><init>(Landroidx/compose/ui/node/a;Ld9/u;)V

    iget-object v3, v1, Lt1/n1;->d:Lt1/f;

    invoke-virtual {v1, p0, v3, v2}, Lt1/n1;->a(Lt1/m1;Lc9/c;Lc9/a;)V

    iget-object v0, v0, Ld9/u;->a:Ljava/lang/Object;

    check-cast v0, Ly1/j;

    iput-object v0, p0, Landroidx/compose/ui/node/a;->s:Ly1/j;

    return-object v0

    :cond_1
    :goto_0
    iget-object v0, p0, Landroidx/compose/ui/node/a;->s:Ly1/j;

    return-object v0
.end method

.method public final o()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/node/a;->e:Lt1/v0;

    iget-object v0, v0, Lt1/v0;->a:Lo0/i;

    invoke-virtual {v0}, Lo0/i;->f()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final p()I
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/node/a;->D:Lt1/n0;

    iget-object v0, v0, Lt1/n0;->p:Lt1/k0;

    if-eqz v0, :cond_0

    iget v0, v0, Lt1/k0;->p:I

    if-nez v0, :cond_1

    :cond_0
    const/4 v0, 0x3

    :cond_1
    return v0
.end method

.method public final q()Landroidx/compose/ui/node/a;
    .locals 3

    iget-object v0, p0, Landroidx/compose/ui/node/a;->o:Landroidx/compose/ui/node/a;

    :goto_0
    if-eqz v0, :cond_0

    iget-boolean v1, v0, Landroidx/compose/ui/node/a;->a:Z

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    iget-object v0, v0, Landroidx/compose/ui/node/a;->o:Landroidx/compose/ui/node/a;

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public final r()I
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/node/a;->D:Lt1/n0;

    iget-object v0, v0, Lt1/n0;->o:Lt1/l0;

    iget v0, v0, Lt1/l0;->o:I

    return v0
.end method

.method public final s()Lo0/i;
    .locals 5

    iget-boolean v0, p0, Landroidx/compose/ui/node/a;->u:Z

    iget-object v1, p0, Landroidx/compose/ui/node/a;->t:Lo0/i;

    if-eqz v0, :cond_0

    invoke-virtual {v1}, Lo0/i;->g()V

    invoke-virtual {p0}, Landroidx/compose/ui/node/a;->t()Lo0/i;

    move-result-object v0

    iget v2, v1, Lo0/i;->c:I

    invoke-virtual {v1, v2, v0}, Lo0/i;->d(ILo0/i;)V

    sget-object v0, Landroidx/compose/ui/node/a;->O:Lm0/r;

    iget-object v2, v1, Lo0/i;->a:[Ljava/lang/Object;

    iget v3, v1, Lo0/i;->c:I

    const-string v4, "<this>"

    invoke-static {v2, v4}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    invoke-static {v2, v4, v3, v0}, Ljava/util/Arrays;->sort([Ljava/lang/Object;IILjava/util/Comparator;)V

    iput-boolean v4, p0, Landroidx/compose/ui/node/a;->u:Z

    :cond_0
    return-object v1
.end method

.method public final t()Lo0/i;
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/ui/node/a;->Z()V

    iget v0, p0, Landroidx/compose/ui/node/a;->d:I

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/compose/ui/node/a;->e:Lt1/v0;

    iget-object v0, v0, Lt1/v0;->a:Lo0/i;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/node/a;->f:Lo0/i;

    invoke-static {v0}, Ld7/a;->j(Ljava/lang/Object;)V

    :goto_0
    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0}, Li1/b;->I(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " children: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroidx/compose/ui/node/a;->m()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " measurePolicy: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/ui/node/a;->v:Lr1/j0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final u(JLt1/v;ZZ)V
    .locals 9

    iget-object v0, p0, Landroidx/compose/ui/node/a;->C:Lt1/x0;

    iget-object v1, v0, Lt1/x0;->c:Lt1/c1;

    invoke-virtual {v1, p1, p2}, Lt1/c1;->H0(J)J

    move-result-wide v4

    iget-object v2, v0, Lt1/x0;->c:Lt1/c1;

    sget-object v3, Lt1/c1;->L:Lx9/v;

    move-object v6, p3

    move v7, p4

    move v8, p5

    invoke-virtual/range {v2 .. v8}, Lt1/c1;->N0(Lt1/z0;JLt1/v;ZZ)V

    return-void
.end method

.method public final v(ILandroidx/compose/ui/node/a;)V
    .locals 4

    iget-object v0, p2, Landroidx/compose/ui/node/a;->o:Landroidx/compose/ui/node/a;

    const/4 v1, 0x0

    const-string v2, " Other tree: "

    const-string v3, "Cannot insert "

    if-nez v0, :cond_4

    iget-object v0, p2, Landroidx/compose/ui/node/a;->p:Lt1/l1;

    if-nez v0, :cond_3

    iput-object p0, p2, Landroidx/compose/ui/node/a;->o:Landroidx/compose/ui/node/a;

    iget-object v0, p0, Landroidx/compose/ui/node/a;->e:Lt1/v0;

    iget-object v1, v0, Lt1/v0;->a:Lo0/i;

    invoke-virtual {v1, p1, p2}, Lo0/i;->b(ILjava/lang/Object;)V

    iget-object p1, v0, Lt1/v0;->b:Lc9/a;

    invoke-interface {p1}, Lc9/a;->invoke()Ljava/lang/Object;

    invoke-virtual {p0}, Landroidx/compose/ui/node/a;->J()V

    iget-boolean p1, p2, Landroidx/compose/ui/node/a;->a:Z

    if-eqz p1, :cond_0

    iget p1, p0, Landroidx/compose/ui/node/a;->d:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Landroidx/compose/ui/node/a;->d:I

    :cond_0
    invoke-virtual {p0}, Landroidx/compose/ui/node/a;->B()V

    iget-object p1, p0, Landroidx/compose/ui/node/a;->p:Lt1/l1;

    if-eqz p1, :cond_1

    invoke-virtual {p2, p1}, Landroidx/compose/ui/node/a;->d(Lt1/l1;)V

    :cond_1
    iget-object p1, p2, Landroidx/compose/ui/node/a;->D:Lt1/n0;

    iget p1, p1, Lt1/n0;->n:I

    if-lez p1, :cond_2

    iget-object p1, p0, Landroidx/compose/ui/node/a;->D:Lt1/n0;

    iget p2, p1, Lt1/n0;->n:I

    add-int/lit8 p2, p2, 0x1

    invoke-virtual {p1, p2}, Lt1/n0;->b(I)V

    :cond_2
    return-void

    :cond_3
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " because it already has an owner. This tree: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v1}, Landroidx/compose/ui/node/a;->g(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v1}, Landroidx/compose/ui/node/a;->g(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_4
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " because it already has a parent. This tree: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v1}, Landroidx/compose/ui/node/a;->g(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p2, p2, Landroidx/compose/ui/node/a;->o:Landroidx/compose/ui/node/a;

    if-eqz p2, :cond_5

    invoke-virtual {p2, v1}, Landroidx/compose/ui/node/a;->g(I)Ljava/lang/String;

    move-result-object p2

    goto :goto_0

    :cond_5
    const/4 p2, 0x0

    :goto_0
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final w()Z
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/ui/node/a;->C()Z

    move-result v0

    return v0
.end method

.method public final x()V
    .locals 4

    iget-boolean v0, p0, Landroidx/compose/ui/node/a;->G:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Landroidx/compose/ui/node/a;->C:Lt1/x0;

    iget-object v1, v0, Lt1/x0;->b:Lt1/x;

    iget-object v0, v0, Lt1/x0;->c:Lt1/c1;

    iget-object v0, v0, Lt1/c1;->r:Lt1/c1;

    const/4 v2, 0x0

    iput-object v2, p0, Landroidx/compose/ui/node/a;->F:Lt1/c1;

    :goto_0
    invoke-static {v1, v0}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    if-eqz v1, :cond_0

    iget-object v3, v1, Lt1/c1;->H:Lt1/j1;

    goto :goto_1

    :cond_0
    move-object v3, v2

    :goto_1
    if-eqz v3, :cond_1

    iput-object v1, p0, Landroidx/compose/ui/node/a;->F:Lt1/c1;

    goto :goto_2

    :cond_1
    if-eqz v1, :cond_2

    iget-object v1, v1, Lt1/c1;->r:Lt1/c1;

    goto :goto_0

    :cond_2
    move-object v1, v2

    goto :goto_0

    :cond_3
    :goto_2
    iget-object v0, p0, Landroidx/compose/ui/node/a;->F:Lt1/c1;

    if-eqz v0, :cond_5

    iget-object v1, v0, Lt1/c1;->H:Lt1/j1;

    if-eqz v1, :cond_4

    goto :goto_3

    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "layer was not set"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    :goto_3
    if-eqz v0, :cond_6

    invoke-virtual {v0}, Lt1/c1;->P0()V

    goto :goto_4

    :cond_6
    invoke-virtual {p0}, Landroidx/compose/ui/node/a;->q()Landroidx/compose/ui/node/a;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Landroidx/compose/ui/node/a;->x()V

    :cond_7
    :goto_4
    return-void
.end method

.method public final y()V
    .locals 4

    iget-object v0, p0, Landroidx/compose/ui/node/a;->C:Lt1/x0;

    iget-object v1, v0, Lt1/x0;->c:Lt1/c1;

    iget-object v2, v0, Lt1/x0;->b:Lt1/x;

    :goto_0
    if-eq v1, v2, :cond_1

    const-string v3, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator"

    invoke-static {v1, v3}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lt1/c0;

    iget-object v3, v1, Lt1/c1;->H:Lt1/j1;

    if-eqz v3, :cond_0

    invoke-interface {v3}, Lt1/j1;->invalidate()V

    :cond_0
    iget-object v1, v1, Lt1/c1;->q:Lt1/c1;

    goto :goto_0

    :cond_1
    iget-object v0, v0, Lt1/x0;->b:Lt1/x;

    iget-object v0, v0, Lt1/c1;->H:Lt1/j1;

    if-eqz v0, :cond_2

    invoke-interface {v0}, Lt1/j1;->invalidate()V

    :cond_2
    return-void
.end method

.method public final z()V
    .locals 3

    iget-object v0, p0, Landroidx/compose/ui/node/a;->c:Landroidx/compose/ui/node/a;

    const/4 v1, 0x3

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    invoke-static {p0, v2, v1}, Landroidx/compose/ui/node/a;->O(Landroidx/compose/ui/node/a;ZI)V

    goto :goto_0

    :cond_0
    invoke-static {p0, v2, v1}, Landroidx/compose/ui/node/a;->Q(Landroidx/compose/ui/node/a;ZI)V

    :goto_0
    return-void
.end method
