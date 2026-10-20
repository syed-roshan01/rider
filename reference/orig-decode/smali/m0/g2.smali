.class public final Lm0/g2;
.super Lm0/u;


# static fields
.field public static final v:Lp9/q0;

.field public static final w:Ljava/util/concurrent/atomic/AtomicReference;


# instance fields
.field public final a:Lm0/g;

.field public final b:Ljava/lang/Object;

.field public c:Lm9/f1;

.field public d:Ljava/lang/Throwable;

.field public final e:Ljava/util/ArrayList;

.field public f:Ljava/util/List;

.field public g:Lo0/d;

.field public final h:Ljava/util/ArrayList;

.field public final i:Ljava/util/ArrayList;

.field public final j:Ljava/util/ArrayList;

.field public final k:Ljava/util/LinkedHashMap;

.field public final l:Ljava/util/LinkedHashMap;

.field public m:Ljava/util/ArrayList;

.field public n:Ljava/util/Set;

.field public o:Lm9/k;

.field public p:Lm0/z1;

.field public q:Z

.field public final r:Lp9/q0;

.field public final s:Lm9/i1;

.field public final t:Lu8/j;

.field public final u:Lk/f;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Ls0/b;->d:Ls0/b;

    invoke-static {v0}, Lp9/d0;->a(Ljava/lang/Object;)Lp9/q0;

    move-result-object v0

    sput-object v0, Lm0/g2;->v:Lp9/q0;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    sput-object v0, Lm0/g2;->w:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method

.method public constructor <init>(Lu8/j;)V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lm0/g;

    new-instance v1, Lt/l0;

    const/16 v2, 0x10

    invoke-direct {v1, p0, v2}, Lt/l0;-><init>(Ljava/lang/Object;I)V

    invoke-direct {v0, v1}, Lm0/g;-><init>(Lt/l0;)V

    iput-object v0, p0, Lm0/g2;->a:Lm0/g;

    new-instance v1, Ljava/lang/Object;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v1, p0, Lm0/g2;->b:Ljava/lang/Object;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lm0/g2;->e:Ljava/util/ArrayList;

    new-instance v1, Lo0/d;

    invoke-direct {v1}, Lo0/d;-><init>()V

    iput-object v1, p0, Lm0/g2;->g:Lo0/d;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lm0/g2;->h:Ljava/util/ArrayList;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lm0/g2;->i:Ljava/util/ArrayList;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lm0/g2;->j:Ljava/util/ArrayList;

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v1, p0, Lm0/g2;->k:Ljava/util/LinkedHashMap;

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v1, p0, Lm0/g2;->l:Ljava/util/LinkedHashMap;

    sget-object v1, Lm0/a2;->c:Lm0/a2;

    invoke-static {v1}, Lp9/d0;->a(Ljava/lang/Object;)Lp9/q0;

    move-result-object v1

    iput-object v1, p0, Lm0/g2;->r:Lp9/q0;

    sget-object v1, Lm9/a0;->b:Lm9/a0;

    invoke-interface {p1, v1}, Lu8/j;->f(Lu8/i;)Lu8/h;

    move-result-object v1

    check-cast v1, Lm9/f1;

    new-instance v2, Lm9/i1;

    invoke-direct {v2, v1}, Lm9/i1;-><init>(Lm9/f1;)V

    new-instance v1, Lq/w;

    const/16 v3, 0x18

    invoke-direct {v1, p0, v3}, Lq/w;-><init>(Ljava/lang/Object;I)V

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-virtual {v2, v3, v4, v1}, Lm9/p1;->U(ZZLc9/c;)Lm9/o0;

    iput-object v2, p0, Lm0/g2;->s:Lm9/i1;

    invoke-interface {p1, v0}, Lu8/j;->O(Lu8/j;)Lu8/j;

    move-result-object p1

    invoke-interface {p1, v2}, Lu8/j;->O(Lu8/j;)Lu8/j;

    move-result-object p1

    iput-object p1, p0, Lm0/g2;->t:Lu8/j;

    new-instance p1, Lk/f;

    const/4 v0, 0x5

    invoke-direct {p1, p0, v0}, Lk/f;-><init>(Ljava/lang/Object;I)V

    iput-object p1, p0, Lm0/g2;->u:Lk/f;

    return-void
.end method

.method public static synthetic C(Lm0/g2;Ljava/lang/Exception;ZI)V
    .locals 0

    and-int/lit8 p3, p3, 0x4

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    const/4 p3, 0x0

    invoke-virtual {p0, p1, p3, p2}, Lm0/g2;->B(Ljava/lang/Exception;Lm0/e0;Z)V

    return-void
.end method

.method public static final q(Lm0/g2;Lm0/e0;Lo0/d;)Lm0/e0;
    .locals 5

    move-object v0, p1

    check-cast v0, Lm0/x;

    iget-object v1, v0, Lm0/x;->y:Lm0/q;

    iget-boolean v1, v1, Lm0/q;->E:Z

    const/4 v2, 0x0

    if-nez v1, :cond_4

    iget-boolean v0, v0, Lm0/x;->z:Z

    if-nez v0, :cond_4

    iget-object p0, p0, Lm0/g2;->n:Ljava/util/Set;

    const/4 v0, 0x1

    if-eqz p0, :cond_0

    invoke-interface {p0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p0

    if-ne p0, v0, :cond_0

    goto :goto_3

    :cond_0
    new-instance p0, Lq/w;

    const/16 v1, 0x19

    invoke-direct {p0, p1, v1}, Lq/w;-><init>(Ljava/lang/Object;I)V

    new-instance v1, Lu/s;

    const/16 v3, 0x12

    invoke-direct {v1, v3, p1, p2}, Lu/s;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0, v1}, Lk0/y0;->h(Lq/w;Lu/s;)Lw0/c;

    move-result-object p0

    :try_start_0
    invoke-virtual {p0}, Lw0/i;->j()Lw0/i;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    :try_start_1
    invoke-virtual {p2}, Lo0/d;->k()Z

    move-result v3

    if-ne v3, v0, :cond_2

    new-instance v3, Lu/r0;

    const/16 v4, 0x8

    invoke-direct {v3, v4, p2, p1}, Lu/r0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    move-object p2, p1

    check-cast p2, Lm0/x;

    iget-object p2, p2, Lm0/x;->y:Lm0/q;

    iget-boolean v4, p2, Lm0/q;->E:Z

    xor-int/2addr v4, v0

    if-eqz v4, :cond_1

    iput-boolean v0, p2, Lm0/q;->E:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    const/4 v0, 0x0

    :try_start_2
    invoke-virtual {v3}, Lu/r0;->invoke()Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    iput-boolean v0, p2, Lm0/q;->E:Z

    goto :goto_0

    :catchall_0
    move-exception p1

    iput-boolean v0, p2, Lm0/q;->E:Z

    throw p1

    :cond_1
    const-string p1, "Preparing a composition while composing is not supported"

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lm0/s;->g(Ljava/lang/String;)V

    throw v2

    :catchall_1
    move-exception p1

    goto :goto_2

    :cond_2
    :goto_0
    move-object p2, p1

    check-cast p2, Lm0/x;

    invoke-virtual {p2}, Lm0/x;->x()Z

    move-result p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    invoke-static {v1}, Lw0/i;->p(Lw0/i;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    invoke-static {p0}, Lm0/g2;->s(Lw0/c;)V

    if-eqz p2, :cond_3

    goto :goto_1

    :cond_3
    move-object p1, v2

    :goto_1
    move-object v2, p1

    goto :goto_3

    :goto_2
    :try_start_5
    invoke-static {v1}, Lw0/i;->p(Lw0/i;)V

    throw p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :catchall_2
    move-exception p1

    invoke-static {p0}, Lm0/g2;->s(Lw0/c;)V

    throw p1

    :cond_4
    :goto_3
    return-object v2
.end method

.method public static final r(Lm0/g2;)Z
    .locals 8

    iget-object v0, p0, Lm0/g2;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lm0/g2;->g:Lo0/d;

    invoke-virtual {v1}, Lo0/d;->isEmpty()Z

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lm0/g2;->h:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    xor-int/2addr v1, v3

    if-nez v1, :cond_0

    invoke-virtual {p0}, Lm0/g2;->v()Z

    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    if-eqz p0, :cond_1

    :cond_0
    move v2, v3

    :cond_1
    monitor-exit v0

    goto :goto_1

    :cond_2
    :try_start_1
    iget-object v1, p0, Lm0/g2;->g:Lo0/d;

    new-instance v4, Lo0/d;

    invoke-direct {v4}, Lo0/d;-><init>()V

    iput-object v4, p0, Lm0/g2;->g:Lo0/d;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    monitor-exit v0

    iget-object v0, p0, Lm0/g2;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_2
    invoke-virtual {p0}, Lm0/g2;->x()Ljava/util/List;

    move-result-object v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    monitor-exit v0

    :try_start_3
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    move v5, v2

    :goto_0
    if-ge v5, v0, :cond_3

    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lm0/e0;

    check-cast v6, Lm0/x;

    invoke-virtual {v6, v1}, Lm0/x;->y(Lo0/d;)V

    iget-object v6, p0, Lm0/g2;->r:Lp9/q0;

    invoke-virtual {v6}, Lp9/q0;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lm0/a2;

    sget-object v7, Lm0/a2;->b:Lm0/a2;

    invoke-virtual {v6, v7}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v6

    if-lez v6, :cond_3

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_3
    new-instance v0, Lo0/d;

    invoke-direct {v0}, Lo0/d;-><init>()V

    iput-object v0, p0, Lm0/g2;->g:Lo0/d;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    iget-object v0, p0, Lm0/g2;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_4
    invoke-virtual {p0}, Lm0/g2;->u()Lm9/k;

    move-result-object v1

    if-nez v1, :cond_6

    iget-object v1, p0, Lm0/g2;->h:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    xor-int/2addr v1, v3

    if-nez v1, :cond_4

    invoke-virtual {p0}, Lm0/g2;->v()Z

    move-result p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    if-eqz p0, :cond_5

    :cond_4
    move v2, v3

    :cond_5
    monitor-exit v0

    :goto_1
    return v2

    :cond_6
    :try_start_5
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v1, "called outside of runRecomposeAndApplyChanges"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :catchall_1
    move-exception p0

    monitor-exit v0

    throw p0

    :goto_2
    iget-object v2, p0, Lm0/g2;->b:Ljava/lang/Object;

    monitor-enter v2

    :try_start_6
    iget-object p0, p0, Lm0/g2;->g:Lo0/d;

    invoke-virtual {p0, v1}, Lo0/d;->e(Lo0/d;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    monitor-exit v2

    throw v0

    :catchall_2
    move-exception p0

    monitor-exit v2

    throw p0

    :catchall_3
    move-exception p0

    monitor-exit v0

    throw p0

    :catchall_4
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static s(Lw0/c;)V
    .locals 2

    :try_start_0
    invoke-virtual {p0}, Lw0/c;->v()Ly/a0;

    move-result-object v0

    instance-of v0, v0, Lw0/j;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lw0/c;->c()V

    return-void

    :cond_0
    :try_start_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition."

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v0

    invoke-virtual {p0}, Lw0/c;->c()V

    throw v0
.end method

.method public static final z(Ljava/util/ArrayList;Lm0/g2;Lm0/e0;)V
    .locals 3

    invoke-virtual {p0}, Ljava/util/ArrayList;->clear()V

    iget-object v0, p1, Lm0/g2;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object p1, p1, Lm0/g2;->j:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm0/c1;

    const/4 v2, 0x0

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2, p2}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-interface {p1}, Ljava/util/Iterator;->remove()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_1
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0

    throw p0
.end method


# virtual methods
.method public final A(Ljava/util/List;Lo0/d;)Ljava/util/List;
    .locals 17

    move-object/from16 v1, p0

    new-instance v0, Ljava/util/HashMap;

    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v2

    invoke-direct {v0, v2}, Ljava/util/HashMap;-><init>(I)V

    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v4, v2, :cond_1

    move-object/from16 v5, p1

    invoke-interface {v5, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Lm0/c1;

    const/4 v8, 0x0

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    if-nez v7, :cond_0

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0, v8, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    check-cast v7, Ljava/util/ArrayList;

    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lm0/e0;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    move-object v6, v5

    check-cast v6, Lm0/x;

    iget-object v6, v6, Lm0/x;->y:Lm0/q;

    iget-boolean v6, v6, Lm0/q;->E:Z

    xor-int/lit8 v6, v6, 0x1

    invoke-static {v6}, Lm0/s;->l(Z)V

    new-instance v6, Lq/w;

    const/16 v7, 0x19

    invoke-direct {v6, v5, v7}, Lq/w;-><init>(Ljava/lang/Object;I)V

    new-instance v7, Lu/s;

    const/16 v8, 0x12

    move-object/from16 v9, p2

    invoke-direct {v7, v8, v5, v9}, Lu/s;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v6, v7}, Lk0/y0;->h(Lq/w;Lu/s;)Lw0/c;

    move-result-object v6

    :try_start_0
    invoke-virtual {v6}, Lw0/i;->j()Lw0/i;

    move-result-object v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    :try_start_1
    iget-object v8, v1, Lm0/g2;->b:Ljava/lang/Object;

    monitor-enter v8
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    new-instance v10, Ljava/util/ArrayList;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v11

    invoke-direct {v10, v11}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v11

    move v12, v3

    :goto_2
    if-ge v12, v11, :cond_5

    invoke-interface {v4, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lm0/c1;

    iget-object v14, v1, Lm0/g2;->k:Ljava/util/LinkedHashMap;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v15, 0x0

    invoke-virtual {v14, v15}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v15, v16

    check-cast v15, Ljava/util/List;

    if-eqz v15, :cond_4

    invoke-interface {v15}, Ljava/util/List;->isEmpty()Z

    move-result v16

    if-nez v16, :cond_3

    invoke-interface {v15, v3}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object v16

    invoke-interface {v15}, Ljava/util/List;->isEmpty()Z

    move-result v15

    if-eqz v15, :cond_2

    const/4 v15, 0x0

    invoke-interface {v14, v15}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    move-object/from16 v15, v16

    goto :goto_3

    :cond_3
    new-instance v0, Ljava/util/NoSuchElementException;

    const-string v2, "List is empty."

    invoke-direct {v0, v2}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    const/4 v15, 0x0

    :goto_3
    new-instance v14, Lq8/f;

    invoke-direct {v14, v13, v15}, Lq8/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v10, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    add-int/lit8 v12, v12, 0x1

    goto :goto_2

    :catchall_0
    move-exception v0

    goto :goto_4

    :cond_5
    :try_start_3
    monitor-exit v8

    check-cast v5, Lm0/x;

    invoke-virtual {v5, v10}, Lm0/x;->s(Ljava/util/ArrayList;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    invoke-static {v7}, Lw0/i;->p(Lw0/i;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    invoke-static {v6}, Lm0/g2;->s(Lw0/c;)V

    goto/16 :goto_1

    :catchall_1
    move-exception v0

    goto :goto_5

    :goto_4
    :try_start_5
    monitor-exit v8

    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :goto_5
    :try_start_6
    invoke-static {v7}, Lw0/i;->p(Lw0/i;)V

    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :catchall_2
    move-exception v0

    invoke-static {v6}, Lm0/g2;->s(Lw0/c;)V

    throw v0

    :cond_6
    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lr8/p;->W0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final B(Ljava/lang/Exception;Lm0/e0;Z)V
    .locals 4

    sget-object v0, Lm0/g2;->w:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    instance-of v0, p1, Lm0/k;

    if-nez v0, :cond_3

    iget-object v0, p0, Lm0/g2;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    const-string v2, "Error was captured in composition while live edit was enabled."

    sget v3, Lm0/b;->b:I

    const-string v3, "ComposeInternal"

    invoke-static {v3, v2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    iget-object v2, p0, Lm0/g2;->i:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    iget-object v2, p0, Lm0/g2;->h:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    new-instance v2, Lo0/d;

    invoke-direct {v2}, Lo0/d;-><init>()V

    iput-object v2, p0, Lm0/g2;->g:Lo0/d;

    iget-object v2, p0, Lm0/g2;->j:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    iget-object v2, p0, Lm0/g2;->k:Ljava/util/LinkedHashMap;

    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->clear()V

    iget-object v2, p0, Lm0/g2;->l:Ljava/util/LinkedHashMap;

    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->clear()V

    new-instance v2, Lm0/z1;

    invoke-direct {v2, p3, p1, v1}, Lm0/z1;-><init>(ZLjava/io/Serializable;I)V

    iput-object v2, p0, Lm0/g2;->p:Lm0/z1;

    if-eqz p2, :cond_2

    iget-object p1, p0, Lm0/g2;->m:Ljava/util/ArrayList;

    if-nez p1, :cond_0

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lm0/g2;->m:Ljava/util/ArrayList;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    invoke-interface {p1, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_1

    invoke-interface {p1, p2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_1
    iget-object p1, p0, Lm0/g2;->e:Ljava/util/ArrayList;

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    const/4 p1, 0x0

    iput-object p1, p0, Lm0/g2;->f:Ljava/util/List;

    :cond_2
    invoke-virtual {p0}, Lm0/g2;->u()Lm9/k;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0

    throw p1

    :cond_3
    iget-object p2, p0, Lm0/g2;->b:Ljava/lang/Object;

    monitor-enter p2

    :try_start_1
    iget-object p3, p0, Lm0/g2;->p:Lm0/z1;

    if-nez p3, :cond_4

    new-instance p3, Lm0/z1;

    invoke-direct {p3, v1, p1, v1}, Lm0/z1;-><init>(ZLjava/io/Serializable;I)V

    iput-object p3, p0, Lm0/g2;->p:Lm0/z1;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    monitor-exit p2

    throw p1

    :catchall_1
    move-exception p1

    goto :goto_2

    :cond_4
    :try_start_2
    iget-object p1, p3, Lm0/z1;->c:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Exception;

    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :goto_2
    monitor-exit p2

    throw p1
.end method

.method public final a(Lm0/e0;Lu0/b;)V
    .locals 6

    move-object v0, p1

    check-cast v0, Lm0/x;

    iget-object v0, v0, Lm0/x;->y:Lm0/q;

    iget-boolean v0, v0, Lm0/q;->E:Z

    const/4 v1, 0x1

    :try_start_0
    new-instance v2, Lq/w;

    const/16 v3, 0x19

    invoke-direct {v2, p1, v3}, Lq/w;-><init>(Ljava/lang/Object;I)V

    new-instance v3, Lu/s;

    const/16 v4, 0x12

    const/4 v5, 0x0

    invoke-direct {v3, v4, p1, v5}, Lu/s;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v2, v3}, Lk0/y0;->h(Lq/w;Lu/s;)Lw0/c;

    move-result-object v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    :try_start_1
    invoke-virtual {v2}, Lw0/i;->j()Lw0/i;

    move-result-object v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    :try_start_2
    move-object v4, p1

    check-cast v4, Lm0/x;

    invoke-virtual {v4, p2}, Lm0/x;->n(Lu0/b;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :try_start_3
    invoke-static {v3}, Lw0/i;->p(Lw0/i;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :try_start_4
    invoke-static {v2}, Lm0/g2;->s(Lw0/c;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    if-nez v0, :cond_0

    invoke-static {}, Lw0/p;->i()Lw0/i;

    move-result-object p2

    invoke-virtual {p2}, Lw0/i;->m()V

    :cond_0
    iget-object p2, p0, Lm0/g2;->b:Ljava/lang/Object;

    monitor-enter p2

    :try_start_5
    iget-object v2, p0, Lm0/g2;->r:Lp9/q0;

    invoke-virtual {v2}, Lp9/q0;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lm0/a2;

    sget-object v3, Lm0/a2;->b:Lm0/a2;

    invoke-virtual {v2, v3}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v2

    if-lez v2, :cond_1

    invoke-virtual {p0}, Lm0/g2;->x()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    iget-object v2, p0, Lm0/g2;->e:Ljava/util/ArrayList;

    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iput-object v5, p0, Lm0/g2;->f:Ljava/util/List;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    :goto_0
    monitor-exit p2

    :try_start_6
    invoke-virtual {p0, p1}, Lm0/g2;->y(Lm0/e0;)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1

    :try_start_7
    invoke-virtual {v4}, Lm0/x;->i()V

    invoke-virtual {v4}, Lm0/x;->k()V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_0

    if-nez v0, :cond_2

    invoke-static {}, Lw0/p;->i()Lw0/i;

    move-result-object p1

    invoke-virtual {p1}, Lw0/i;->m()V

    :cond_2
    return-void

    :catch_0
    move-exception p1

    const/4 p2, 0x0

    const/4 v0, 0x6

    invoke-static {p0, p1, p2, v0}, Lm0/g2;->C(Lm0/g2;Ljava/lang/Exception;ZI)V

    return-void

    :catch_1
    move-exception p2

    invoke-virtual {p0, p2, p1, v1}, Lm0/g2;->B(Ljava/lang/Exception;Lm0/e0;Z)V

    return-void

    :goto_1
    monitor-exit p2

    throw p1

    :catch_2
    move-exception p2

    goto :goto_2

    :catchall_1
    move-exception p2

    :try_start_8
    invoke-static {v3}, Lw0/i;->p(Lw0/i;)V

    throw p2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    :catchall_2
    move-exception p2

    :try_start_9
    invoke-static {v2}, Lm0/g2;->s(Lw0/c;)V

    throw p2
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_2

    :goto_2
    invoke-virtual {p0, p2, p1, v1}, Lm0/g2;->B(Ljava/lang/Exception;Lm0/e0;Z)V

    return-void
.end method

.method public final c()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final d()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final f()I
    .locals 1

    const/16 v0, 0x3e8

    return v0
.end method

.method public final g()Lu8/j;
    .locals 1

    iget-object v0, p0, Lm0/g2;->t:Lu8/j;

    return-object v0
.end method

.method public final i(Lm0/e0;)V
    .locals 2

    iget-object v0, p0, Lm0/g2;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lm0/g2;->h:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lm0/g2;->h:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Lm0/g2;->u()Lm9/k;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    const/4 p1, 0x0

    :goto_0
    monitor-exit v0

    if-eqz p1, :cond_1

    sget-object v0, Lq8/l;->a:Lq8/l;

    invoke-interface {p1, v0}, Lu8/e;->resumeWith(Ljava/lang/Object;)V

    :cond_1
    return-void

    :goto_1
    monitor-exit v0

    throw p1
.end method

.method public final j(Lm0/c1;)Lm0/b1;
    .locals 2

    iget-object v0, p0, Lm0/g2;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lm0/g2;->l:Ljava/util/LinkedHashMap;

    invoke-interface {v1, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lm0/b1;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public final k(Ljava/util/Set;)V
    .locals 0

    return-void
.end method

.method public final m(Lm0/e0;)V
    .locals 2

    iget-object v0, p0, Lm0/g2;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lm0/g2;->n:Ljava/util/Set;

    if-nez v1, :cond_0

    new-instance v1, Ljava/util/LinkedHashSet;

    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v1, p0, Lm0/g2;->n:Ljava/util/Set;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    invoke-interface {v1, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0

    throw p1
.end method

.method public final p(Lm0/e0;)V
    .locals 2

    iget-object v0, p0, Lm0/g2;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lm0/g2;->e:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    const/4 v1, 0x0

    iput-object v1, p0, Lm0/g2;->f:Ljava/util/List;

    iget-object v1, p0, Lm0/g2;->h:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    iget-object v1, p0, Lm0/g2;->i:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public final t()V
    .locals 3

    iget-object v0, p0, Lm0/g2;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lm0/g2;->r:Lp9/q0;

    invoke-virtual {v1}, Lp9/q0;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm0/a2;

    sget-object v2, Lm0/a2;->e:Lm0/a2;

    invoke-virtual {v1, v2}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v1

    if-ltz v1, :cond_0

    iget-object v1, p0, Lm0/g2;->r:Lp9/q0;

    sget-object v2, Lm0/a2;->b:Lm0/a2;

    invoke-virtual {v1, v2}, Lp9/q0;->i(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    iget-object v0, p0, Lm0/g2;->s:Lm9/i1;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lm9/p1;->a(Ljava/util/concurrent/CancellationException;)V

    return-void

    :goto_1
    monitor-exit v0

    throw v1
.end method

.method public final u()Lm9/k;
    .locals 8

    iget-object v0, p0, Lm0/g2;->r:Lp9/q0;

    invoke-virtual {v0}, Lp9/q0;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm0/a2;

    sget-object v2, Lm0/a2;->b:Lm0/a2;

    invoke-virtual {v1, v2}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v1

    iget-object v2, p0, Lm0/g2;->j:Ljava/util/ArrayList;

    iget-object v3, p0, Lm0/g2;->i:Ljava/util/ArrayList;

    iget-object v4, p0, Lm0/g2;->h:Ljava/util/ArrayList;

    const/4 v5, 0x0

    if-gtz v1, :cond_1

    iget-object v0, p0, Lm0/g2;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    sget-object v0, Lr8/r;->a:Lr8/r;

    iput-object v0, p0, Lm0/g2;->f:Ljava/util/List;

    new-instance v0, Lo0/d;

    invoke-direct {v0}, Lo0/d;-><init>()V

    iput-object v0, p0, Lm0/g2;->g:Lo0/d;

    invoke-virtual {v4}, Ljava/util/ArrayList;->clear()V

    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    iput-object v5, p0, Lm0/g2;->m:Ljava/util/ArrayList;

    iget-object v0, p0, Lm0/g2;->o:Lm9/k;

    if-eqz v0, :cond_0

    invoke-interface {v0, v5}, Lm9/k;->l(Ljava/lang/Throwable;)Z

    :cond_0
    iput-object v5, p0, Lm0/g2;->o:Lm9/k;

    iput-object v5, p0, Lm0/g2;->p:Lm0/z1;

    return-object v5

    :cond_1
    iget-object v1, p0, Lm0/g2;->p:Lm0/z1;

    sget-object v6, Lm0/a2;->f:Lm0/a2;

    sget-object v7, Lm0/a2;->c:Lm0/a2;

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lm0/g2;->c:Lm9/f1;

    if-nez v1, :cond_3

    new-instance v1, Lo0/d;

    invoke-direct {v1}, Lo0/d;-><init>()V

    iput-object v1, p0, Lm0/g2;->g:Lo0/d;

    invoke-virtual {v4}, Ljava/util/ArrayList;->clear()V

    invoke-virtual {p0}, Lm0/g2;->v()Z

    move-result v1

    if-eqz v1, :cond_6

    sget-object v7, Lm0/a2;->d:Lm0/a2;

    goto :goto_1

    :cond_3
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    if-nez v1, :cond_5

    iget-object v1, p0, Lm0/g2;->g:Lo0/d;

    invoke-virtual {v1}, Lo0/d;->k()Z

    move-result v1

    if-nez v1, :cond_5

    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    if-nez v1, :cond_5

    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    if-nez v1, :cond_5

    invoke-virtual {p0}, Lm0/g2;->v()Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_0

    :cond_4
    sget-object v7, Lm0/a2;->e:Lm0/a2;

    goto :goto_1

    :cond_5
    :goto_0
    move-object v7, v6

    :cond_6
    :goto_1
    invoke-virtual {v0, v7}, Lp9/q0;->i(Ljava/lang/Object;)V

    if-ne v7, v6, :cond_7

    iget-object v0, p0, Lm0/g2;->o:Lm9/k;

    iput-object v5, p0, Lm0/g2;->o:Lm9/k;

    move-object v5, v0

    :cond_7
    return-object v5
.end method

.method public final v()Z
    .locals 3

    iget-boolean v0, p0, Lm0/g2;->q:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lm0/g2;->a:Lm0/g;

    iget-object v1, v0, Lm0/g;->b:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, v0, Lm0/g;->d:Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v2, 0x1

    xor-int/2addr v0, v2

    monitor-exit v1

    if-eqz v0, :cond_0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    return v2
.end method

.method public final w()Z
    .locals 3

    iget-object v0, p0, Lm0/g2;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lm0/g2;->g:Lo0/d;

    invoke-virtual {v1}, Lo0/d;->k()Z

    move-result v1

    const/4 v2, 0x1

    if-nez v1, :cond_1

    iget-object v1, p0, Lm0/g2;->h:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    xor-int/2addr v1, v2

    if-nez v1, :cond_1

    invoke-virtual {p0}, Lm0/g2;->v()Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_1
    :goto_0
    monitor-exit v0

    return v2

    :goto_1
    monitor-exit v0

    throw v1
.end method

.method public final x()Ljava/util/List;
    .locals 2

    iget-object v0, p0, Lm0/g2;->f:Ljava/util/List;

    if-nez v0, :cond_1

    iget-object v0, p0, Lm0/g2;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v0, Lr8/r;->a:Lr8/r;

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    move-object v0, v1

    :goto_0
    iput-object v0, p0, Lm0/g2;->f:Ljava/util/List;

    :cond_1
    return-object v0
.end method

.method public final y(Lm0/e0;)V
    .locals 6

    iget-object v0, p0, Lm0/g2;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lm0/g2;->j:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_2

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lm0/c1;

    const/4 v5, 0x0

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v5, p1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v4, :cond_1

    monitor-exit v0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v0, p0, p1}, Lm0/g2;->z(Ljava/util/ArrayList;Lm0/g2;Lm0/e0;)V

    :goto_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lm0/g2;->A(Ljava/util/List;Lo0/d;)Ljava/util/List;

    invoke-static {v0, p0, p1}, Lm0/g2;->z(Ljava/util/ArrayList;Lm0/g2;Lm0/e0;)V

    goto :goto_1

    :cond_0
    return-void

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_2
    monitor-exit v0

    return-void

    :goto_2
    monitor-exit v0

    throw p1
.end method
