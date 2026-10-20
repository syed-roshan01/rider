.class public abstract Landroidx/fragment/app/x0;
.super Ljava/lang/Object;


# instance fields
.field public A:Ld/f;

.field public B:Ld/f;

.field public C:Ljava/util/ArrayDeque;

.field public D:Z

.field public E:Z

.field public F:Z

.field public G:Z

.field public H:Z

.field public I:Ljava/util/ArrayList;

.field public J:Ljava/util/ArrayList;

.field public K:Ljava/util/ArrayList;

.field public L:Landroidx/fragment/app/b1;

.field public final M:Landroidx/fragment/app/e;

.field public final a:Ljava/util/ArrayList;

.field public b:Z

.field public final c:Landroidx/fragment/app/f1;

.field public d:Ljava/util/ArrayList;

.field public e:Ljava/util/ArrayList;

.field public final f:Landroidx/fragment/app/o0;

.field public g:Landroidx/activity/i0;

.field public final h:Landroidx/activity/j0;

.field public final i:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final j:Ljava/util/Map;

.field public final k:Ljava/util/Map;

.field public final l:Landroidx/fragment/app/x;

.field public final m:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public final n:Landroidx/fragment/app/p0;

.field public final o:Landroidx/fragment/app/p0;

.field public final p:Landroidx/fragment/app/p0;

.field public final q:Landroidx/fragment/app/p0;

.field public final r:Landroidx/fragment/app/r0;

.field public s:I

.field public t:Landroidx/fragment/app/m0;

.field public u:Landroidx/fragment/app/j0;

.field public v:Landroidx/fragment/app/d0;

.field public w:Landroidx/fragment/app/d0;

.field public final x:Landroidx/fragment/app/s0;

.field public final y:Landroidx/fragment/app/q0;

.field public z:Ld/f;


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/fragment/app/x0;->a:Ljava/util/ArrayList;

    new-instance v0, Landroidx/fragment/app/f1;

    invoke-direct {v0}, Landroidx/fragment/app/f1;-><init>()V

    iput-object v0, p0, Landroidx/fragment/app/x0;->c:Landroidx/fragment/app/f1;

    new-instance v0, Landroidx/fragment/app/o0;

    invoke-direct {v0, p0}, Landroidx/fragment/app/o0;-><init>(Landroidx/fragment/app/x0;)V

    iput-object v0, p0, Landroidx/fragment/app/x0;->f:Landroidx/fragment/app/o0;

    new-instance v0, Landroidx/activity/j0;

    invoke-direct {v0, p0}, Landroidx/activity/j0;-><init>(Landroidx/fragment/app/x0;)V

    iput-object v0, p0, Landroidx/fragment/app/x0;->h:Landroidx/activity/j0;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object v0, p0, Landroidx/fragment/app/x0;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Landroidx/fragment/app/x0;->j:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Landroidx/fragment/app/x0;->k:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    new-instance v0, Landroidx/fragment/app/x;

    invoke-direct {v0, p0}, Landroidx/fragment/app/x;-><init>(Landroidx/fragment/app/x0;)V

    iput-object v0, p0, Landroidx/fragment/app/x0;->l:Landroidx/fragment/app/x;

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Landroidx/fragment/app/x0;->m:Ljava/util/concurrent/CopyOnWriteArrayList;

    new-instance v0, Landroidx/fragment/app/p0;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Landroidx/fragment/app/p0;-><init>(Landroidx/fragment/app/x0;I)V

    iput-object v0, p0, Landroidx/fragment/app/x0;->n:Landroidx/fragment/app/p0;

    new-instance v0, Landroidx/fragment/app/p0;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Landroidx/fragment/app/p0;-><init>(Landroidx/fragment/app/x0;I)V

    iput-object v0, p0, Landroidx/fragment/app/x0;->o:Landroidx/fragment/app/p0;

    new-instance v0, Landroidx/fragment/app/p0;

    const/4 v2, 0x2

    invoke-direct {v0, p0, v2}, Landroidx/fragment/app/p0;-><init>(Landroidx/fragment/app/x0;I)V

    iput-object v0, p0, Landroidx/fragment/app/x0;->p:Landroidx/fragment/app/p0;

    new-instance v0, Landroidx/fragment/app/p0;

    const/4 v3, 0x3

    invoke-direct {v0, p0, v3}, Landroidx/fragment/app/p0;-><init>(Landroidx/fragment/app/x0;I)V

    iput-object v0, p0, Landroidx/fragment/app/x0;->q:Landroidx/fragment/app/p0;

    new-instance v0, Landroidx/fragment/app/r0;

    invoke-direct {v0, p0}, Landroidx/fragment/app/r0;-><init>(Landroidx/fragment/app/x0;)V

    iput-object v0, p0, Landroidx/fragment/app/x0;->r:Landroidx/fragment/app/r0;

    const/4 v0, -0x1

    iput v0, p0, Landroidx/fragment/app/x0;->s:I

    new-instance v0, Landroidx/fragment/app/s0;

    invoke-direct {v0, p0}, Landroidx/fragment/app/s0;-><init>(Landroidx/fragment/app/x0;)V

    iput-object v0, p0, Landroidx/fragment/app/x0;->x:Landroidx/fragment/app/s0;

    new-instance v0, Landroidx/fragment/app/q0;

    invoke-direct {v0, p0, v1}, Landroidx/fragment/app/q0;-><init>(Landroidx/fragment/app/x0;I)V

    iput-object v0, p0, Landroidx/fragment/app/x0;->y:Landroidx/fragment/app/q0;

    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Landroidx/fragment/app/x0;->C:Ljava/util/ArrayDeque;

    new-instance v0, Landroidx/fragment/app/e;

    invoke-direct {v0, p0, v2}, Landroidx/fragment/app/e;-><init>(Ljava/lang/Object;I)V

    iput-object v0, p0, Landroidx/fragment/app/x0;->M:Landroidx/fragment/app/e;

    return-void
.end method

.method public static C(Landroidx/fragment/app/d0;)Z
    .locals 3

    iget-boolean v0, p0, Landroidx/fragment/app/d0;->mHasMenu:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Landroidx/fragment/app/d0;->mMenuVisible:Z

    if-nez v0, :cond_3

    :cond_0
    iget-object p0, p0, Landroidx/fragment/app/d0;->mChildFragmentManager:Landroidx/fragment/app/x0;

    iget-object p0, p0, Landroidx/fragment/app/x0;->c:Landroidx/fragment/app/f1;

    invoke-virtual {p0}, Landroidx/fragment/app/f1;->e()Ljava/util/ArrayList;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v0, 0x0

    move v1, v0

    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/fragment/app/d0;

    if-eqz v2, :cond_2

    invoke-static {v2}, Landroidx/fragment/app/x0;->C(Landroidx/fragment/app/d0;)Z

    move-result v1

    :cond_2
    if-eqz v1, :cond_1

    :cond_3
    const/4 v0, 0x1

    :cond_4
    return v0
.end method

.method public static D(Landroidx/fragment/app/d0;)Z
    .locals 3

    const/4 v0, 0x1

    if-nez p0, :cond_0

    return v0

    :cond_0
    iget-object v1, p0, Landroidx/fragment/app/d0;->mFragmentManager:Landroidx/fragment/app/x0;

    iget-object v2, v1, Landroidx/fragment/app/x0;->w:Landroidx/fragment/app/d0;

    invoke-virtual {p0, v2}, Landroidx/fragment/app/d0;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    iget-object p0, v1, Landroidx/fragment/app/x0;->v:Landroidx/fragment/app/d0;

    invoke-static {p0}, Landroidx/fragment/app/x0;->D(Landroidx/fragment/app/d0;)Z

    move-result p0

    if-eqz p0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static R(Landroidx/fragment/app/d0;)V
    .locals 3

    const/4 v0, 0x2

    const-string v1, "FragmentManager"

    invoke-static {v1, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "show: "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-boolean v0, p0, Landroidx/fragment/app/d0;->mHidden:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/fragment/app/d0;->mHidden:Z

    iget-boolean v0, p0, Landroidx/fragment/app/d0;->mHiddenChanged:Z

    xor-int/lit8 v0, v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/d0;->mHiddenChanged:Z

    :cond_1
    return-void
.end method


# virtual methods
.method public final A()Landroidx/fragment/app/q0;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/x0;->v:Landroidx/fragment/app/d0;

    if-eqz v0, :cond_0

    iget-object v0, v0, Landroidx/fragment/app/d0;->mFragmentManager:Landroidx/fragment/app/x0;

    invoke-virtual {v0}, Landroidx/fragment/app/x0;->A()Landroidx/fragment/app/q0;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/x0;->y:Landroidx/fragment/app/q0;

    return-object v0
.end method

.method public final B(Landroidx/fragment/app/d0;)V
    .locals 3

    const/4 v0, 0x2

    const-string v1, "FragmentManager"

    invoke-static {v1, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "hide: "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-boolean v0, p1, Landroidx/fragment/app/d0;->mHidden:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    iput-boolean v0, p1, Landroidx/fragment/app/d0;->mHidden:Z

    iget-boolean v1, p1, Landroidx/fragment/app/d0;->mHiddenChanged:Z

    xor-int/2addr v0, v1

    iput-boolean v0, p1, Landroidx/fragment/app/d0;->mHiddenChanged:Z

    invoke-virtual {p0, p1}, Landroidx/fragment/app/x0;->Q(Landroidx/fragment/app/d0;)V

    :cond_1
    return-void
.end method

.method public final E(IZ)V
    .locals 3

    iget-object v0, p0, Landroidx/fragment/app/x0;->t:Landroidx/fragment/app/m0;

    if-nez v0, :cond_1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "No activity"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    if-nez p2, :cond_2

    iget p2, p0, Landroidx/fragment/app/x0;->s:I

    if-ne p1, p2, :cond_2

    return-void

    :cond_2
    iput p1, p0, Landroidx/fragment/app/x0;->s:I

    iget-object p1, p0, Landroidx/fragment/app/x0;->c:Landroidx/fragment/app/f1;

    iget-object p2, p1, Landroidx/fragment/app/f1;->a:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_3
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    iget-object v1, p1, Landroidx/fragment/app/f1;->b:Ljava/util/HashMap;

    if-eqz v0, :cond_4

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/fragment/app/d0;

    iget-object v0, v0, Landroidx/fragment/app/d0;->mWho:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/fragment/app/e1;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Landroidx/fragment/app/e1;->j()V

    goto :goto_1

    :cond_4
    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_5
    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/fragment/app/e1;

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Landroidx/fragment/app/e1;->j()V

    iget-object v1, v0, Landroidx/fragment/app/e1;->c:Landroidx/fragment/app/d0;

    iget-boolean v2, v1, Landroidx/fragment/app/d0;->mRemoving:Z

    if-eqz v2, :cond_5

    invoke-virtual {v1}, Landroidx/fragment/app/d0;->isInBackStack()Z

    move-result v2

    if-nez v2, :cond_5

    iget-boolean v2, v1, Landroidx/fragment/app/d0;->mBeingSaved:Z

    if-eqz v2, :cond_6

    iget-object v2, p1, Landroidx/fragment/app/f1;->c:Ljava/util/HashMap;

    iget-object v1, v1, Landroidx/fragment/app/d0;->mWho:Ljava/lang/String;

    invoke-virtual {v2, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    invoke-virtual {v0}, Landroidx/fragment/app/e1;->m()V

    :cond_6
    invoke-virtual {p1, v0}, Landroidx/fragment/app/f1;->h(Landroidx/fragment/app/e1;)V

    goto :goto_2

    :cond_7
    invoke-virtual {p1}, Landroidx/fragment/app/f1;->d()Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_8
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    const/4 v0, 0x0

    if-eqz p2, :cond_a

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroidx/fragment/app/e1;

    iget-object v1, p2, Landroidx/fragment/app/e1;->c:Landroidx/fragment/app/d0;

    iget-boolean v2, v1, Landroidx/fragment/app/d0;->mDeferStart:Z

    if-eqz v2, :cond_8

    iget-boolean v2, p0, Landroidx/fragment/app/x0;->b:Z

    if-eqz v2, :cond_9

    const/4 p2, 0x1

    iput-boolean p2, p0, Landroidx/fragment/app/x0;->H:Z

    goto :goto_3

    :cond_9
    iput-boolean v0, v1, Landroidx/fragment/app/d0;->mDeferStart:Z

    invoke-virtual {p2}, Landroidx/fragment/app/e1;->j()V

    goto :goto_3

    :cond_a
    iget-boolean p1, p0, Landroidx/fragment/app/x0;->D:Z

    if-eqz p1, :cond_b

    iget-object p1, p0, Landroidx/fragment/app/x0;->t:Landroidx/fragment/app/m0;

    if-eqz p1, :cond_b

    iget p2, p0, Landroidx/fragment/app/x0;->s:I

    const/4 v1, 0x7

    if-ne p2, v1, :cond_b

    check-cast p1, Landroidx/fragment/app/f0;

    iget-object p1, p1, Landroidx/fragment/app/f0;->e:Landroidx/fragment/app/g0;

    invoke-virtual {p1}, Landroid/app/Activity;->invalidateOptionsMenu()V

    iput-boolean v0, p0, Landroidx/fragment/app/x0;->D:Z

    :cond_b
    return-void
.end method

.method public final F()V
    .locals 2

    iget-object v0, p0, Landroidx/fragment/app/x0;->t:Landroidx/fragment/app/m0;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/fragment/app/x0;->E:Z

    iput-boolean v0, p0, Landroidx/fragment/app/x0;->F:Z

    iget-object v1, p0, Landroidx/fragment/app/x0;->L:Landroidx/fragment/app/b1;

    iput-boolean v0, v1, Landroidx/fragment/app/b1;->f:Z

    iget-object v0, p0, Landroidx/fragment/app/x0;->c:Landroidx/fragment/app/f1;

    invoke-virtual {v0}, Landroidx/fragment/app/f1;->f()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/d0;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Landroidx/fragment/app/d0;->noteStateNotSaved()V

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final G()Z
    .locals 8

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroidx/fragment/app/x0;->t(Z)Z

    const/4 v1, 0x1

    invoke-virtual {p0, v1}, Landroidx/fragment/app/x0;->s(Z)V

    iget-object v2, p0, Landroidx/fragment/app/x0;->w:Landroidx/fragment/app/d0;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Landroidx/fragment/app/d0;->getChildFragmentManager()Landroidx/fragment/app/x0;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/fragment/app/x0;->G()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_2

    :cond_0
    iget-object v2, p0, Landroidx/fragment/app/x0;->I:Ljava/util/ArrayList;

    iget-object v3, p0, Landroidx/fragment/app/x0;->J:Ljava/util/ArrayList;

    const/4 v4, -0x1

    invoke-virtual {p0, v2, v3, v4, v0}, Landroidx/fragment/app/x0;->H(Ljava/util/ArrayList;Ljava/util/ArrayList;II)Z

    move-result v2

    if-eqz v2, :cond_1

    iput-boolean v1, p0, Landroidx/fragment/app/x0;->b:Z

    :try_start_0
    iget-object v3, p0, Landroidx/fragment/app/x0;->I:Ljava/util/ArrayList;

    iget-object v4, p0, Landroidx/fragment/app/x0;->J:Ljava/util/ArrayList;

    invoke-virtual {p0, v3, v4}, Landroidx/fragment/app/x0;->J(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, Landroidx/fragment/app/x0;->d()V

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-virtual {p0}, Landroidx/fragment/app/x0;->d()V

    throw v0

    :cond_1
    :goto_0
    invoke-virtual {p0}, Landroidx/fragment/app/x0;->S()V

    iget-boolean v3, p0, Landroidx/fragment/app/x0;->H:Z

    iget-object v4, p0, Landroidx/fragment/app/x0;->c:Landroidx/fragment/app/f1;

    if-eqz v3, :cond_4

    iput-boolean v0, p0, Landroidx/fragment/app/x0;->H:Z

    invoke-virtual {v4}, Landroidx/fragment/app/f1;->d()Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_2
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/fragment/app/e1;

    iget-object v6, v5, Landroidx/fragment/app/e1;->c:Landroidx/fragment/app/d0;

    iget-boolean v7, v6, Landroidx/fragment/app/d0;->mDeferStart:Z

    if-eqz v7, :cond_2

    iget-boolean v7, p0, Landroidx/fragment/app/x0;->b:Z

    if-eqz v7, :cond_3

    iput-boolean v1, p0, Landroidx/fragment/app/x0;->H:Z

    goto :goto_1

    :cond_3
    iput-boolean v0, v6, Landroidx/fragment/app/d0;->mDeferStart:Z

    invoke-virtual {v5}, Landroidx/fragment/app/e1;->j()V

    goto :goto_1

    :cond_4
    iget-object v0, v4, Landroidx/fragment/app/f1;->b:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->removeAll(Ljava/util/Collection;)Z

    move v1, v2

    :goto_2
    return v1
.end method

.method public final H(Ljava/util/ArrayList;Ljava/util/ArrayList;II)Z
    .locals 5

    const/4 v0, 0x1

    and-int/2addr p4, v0

    const/4 v1, 0x0

    if-eqz p4, :cond_0

    move p4, v0

    goto :goto_0

    :cond_0
    move p4, v1

    :goto_0
    iget-object v2, p0, Landroidx/fragment/app/x0;->d:Ljava/util/ArrayList;

    const/4 v3, -0x1

    if-eqz v2, :cond_a

    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_5

    :cond_1
    if-gez p3, :cond_3

    if-eqz p4, :cond_2

    move v3, v1

    goto :goto_5

    :cond_2
    iget-object p3, p0, Landroidx/fragment/app/x0;->d:Ljava/util/ArrayList;

    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    move-result p3

    add-int/lit8 v3, p3, -0x1

    goto :goto_5

    :cond_3
    iget-object v2, p0, Landroidx/fragment/app/x0;->d:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    sub-int/2addr v2, v0

    :goto_1
    if-ltz v2, :cond_5

    iget-object v4, p0, Landroidx/fragment/app/x0;->d:Ljava/util/ArrayList;

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/fragment/app/a;

    if-ltz p3, :cond_4

    iget v4, v4, Landroidx/fragment/app/a;->r:I

    if-ne p3, v4, :cond_4

    goto :goto_2

    :cond_4
    add-int/lit8 v2, v2, -0x1

    goto :goto_1

    :cond_5
    :goto_2
    if-gez v2, :cond_7

    :cond_6
    :goto_3
    move v3, v2

    goto :goto_5

    :cond_7
    if-eqz p4, :cond_8

    :goto_4
    if-lez v2, :cond_6

    iget-object p4, p0, Landroidx/fragment/app/x0;->d:Ljava/util/ArrayList;

    add-int/lit8 v3, v2, -0x1

    invoke-virtual {p4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Landroidx/fragment/app/a;

    if-ltz p3, :cond_6

    iget p4, p4, Landroidx/fragment/app/a;->r:I

    if-ne p3, p4, :cond_6

    add-int/lit8 v2, v2, -0x1

    goto :goto_4

    :cond_8
    iget-object p3, p0, Landroidx/fragment/app/x0;->d:Ljava/util/ArrayList;

    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    move-result p3

    sub-int/2addr p3, v0

    if-ne v2, p3, :cond_9

    goto :goto_5

    :cond_9
    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_a
    :goto_5
    if-gez v3, :cond_b

    return v1

    :cond_b
    iget-object p3, p0, Landroidx/fragment/app/x0;->d:Ljava/util/ArrayList;

    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    move-result p3

    sub-int/2addr p3, v0

    :goto_6
    if-lt p3, v3, :cond_c

    iget-object p4, p0, Landroidx/fragment/app/x0;->d:Ljava/util/ArrayList;

    invoke-virtual {p4, p3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Landroidx/fragment/app/a;

    invoke-virtual {p1, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object p4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p2, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 p3, p3, -0x1

    goto :goto_6

    :cond_c
    return v0
.end method

.method public final I(Landroidx/fragment/app/d0;)V
    .locals 3

    const-string v0, "FragmentManager"

    const/4 v1, 0x2

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "remove: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " nesting="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p1, Landroidx/fragment/app/d0;->mBackStackNesting:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    invoke-virtual {p1}, Landroidx/fragment/app/d0;->isInBackStack()Z

    move-result v0

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    iget-boolean v2, p1, Landroidx/fragment/app/d0;->mDetached:Z

    if-eqz v2, :cond_1

    if-eqz v0, :cond_3

    :cond_1
    iget-object v0, p0, Landroidx/fragment/app/x0;->c:Landroidx/fragment/app/f1;

    iget-object v2, v0, Landroidx/fragment/app/f1;->a:Ljava/util/ArrayList;

    monitor-enter v2

    :try_start_0
    iget-object v0, v0, Landroidx/fragment/app/f1;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v0, 0x0

    iput-boolean v0, p1, Landroidx/fragment/app/d0;->mAdded:Z

    invoke-static {p1}, Landroidx/fragment/app/x0;->C(Landroidx/fragment/app/d0;)Z

    move-result v0

    if-eqz v0, :cond_2

    iput-boolean v1, p0, Landroidx/fragment/app/x0;->D:Z

    :cond_2
    iput-boolean v1, p1, Landroidx/fragment/app/d0;->mRemoving:Z

    invoke-virtual {p0, p1}, Landroidx/fragment/app/x0;->Q(Landroidx/fragment/app/d0;)V

    :cond_3
    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final J(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 4

    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ne v0, v1, :cond_6

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v1, v0, :cond_4

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/fragment/app/a;

    iget-boolean v3, v3, Landroidx/fragment/app/a;->o:Z

    if-nez v3, :cond_3

    if-eq v2, v1, :cond_1

    invoke-virtual {p0, p1, p2, v2, v1}, Landroidx/fragment/app/x0;->u(Ljava/util/ArrayList;Ljava/util/ArrayList;II)V

    :cond_1
    add-int/lit8 v2, v1, 0x1

    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_2

    :goto_1
    if-ge v2, v0, :cond_2

    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/fragment/app/a;

    iget-boolean v3, v3, Landroidx/fragment/app/a;->o:Z

    if-nez v3, :cond_2

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_2
    invoke-virtual {p0, p1, p2, v1, v2}, Landroidx/fragment/app/x0;->u(Ljava/util/ArrayList;Ljava/util/ArrayList;II)V

    add-int/lit8 v1, v2, -0x1

    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_4
    if-eq v2, v0, :cond_5

    invoke-virtual {p0, p1, p2, v2, v0}, Landroidx/fragment/app/x0;->u(Ljava/util/ArrayList;Ljava/util/ArrayList;II)V

    :cond_5
    return-void

    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Internal error with the back stack records"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final K(Landroid/os/Parcelable;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    check-cast v1, Landroid/os/Bundle;

    invoke-virtual {v1}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    const-string v4, "result_"

    invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {v1, v3}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v4

    if-eqz v4, :cond_0

    iget-object v5, v0, Landroidx/fragment/app/x0;->t:Landroidx/fragment/app/m0;

    iget-object v5, v5, Landroidx/fragment/app/m0;->b:Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    const/4 v5, 0x7

    invoke-virtual {v3, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    iget-object v5, v0, Landroidx/fragment/app/x0;->k:Ljava/util/Map;

    invoke-interface {v5, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v1}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_2
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const-string v5, "state"

    if-eqz v4, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    const-string v6, "fragment_"

    invoke-virtual {v4, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-virtual {v1, v4}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v4

    if-eqz v4, :cond_2

    iget-object v6, v0, Landroidx/fragment/app/x0;->t:Landroidx/fragment/app/m0;

    iget-object v6, v6, Landroidx/fragment/app/m0;->b:Landroid/content/Context;

    invoke-virtual {v6}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v6

    invoke-virtual {v4, v6}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    invoke-virtual {v4, v5}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v4

    check-cast v4, Landroidx/fragment/app/d1;

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    iget-object v3, v0, Landroidx/fragment/app/x0;->c:Landroidx/fragment/app/f1;

    iget-object v4, v3, Landroidx/fragment/app/f1;->c:Ljava/util/HashMap;

    invoke-virtual {v4}, Ljava/util/HashMap;->clear()V

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroidx/fragment/app/d1;

    iget-object v7, v6, Landroidx/fragment/app/d1;->b:Ljava/lang/String;

    invoke-virtual {v4, v7, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_4
    invoke-virtual {v1, v5}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/z0;

    if-nez v1, :cond_5

    return-void

    :cond_5
    iget-object v2, v3, Landroidx/fragment/app/f1;->b:Ljava/util/HashMap;

    invoke-virtual {v2}, Ljava/util/HashMap;->clear()V

    iget-object v4, v1, Landroidx/fragment/app/z0;->a:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_6
    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    const/4 v6, 0x2

    iget-object v7, v0, Landroidx/fragment/app/x0;->l:Landroidx/fragment/app/x;

    const-string v8, "): "

    const-string v9, "FragmentManager"

    if-eqz v5, :cond_a

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    iget-object v10, v3, Landroidx/fragment/app/f1;->c:Ljava/util/HashMap;

    invoke-virtual {v10, v5}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    move-object v15, v5

    check-cast v15, Landroidx/fragment/app/d1;

    if-eqz v15, :cond_6

    iget-object v5, v0, Landroidx/fragment/app/x0;->L:Landroidx/fragment/app/b1;

    iget-object v5, v5, Landroidx/fragment/app/b1;->a:Ljava/util/HashMap;

    iget-object v10, v15, Landroidx/fragment/app/d1;->b:Ljava/lang/String;

    invoke-virtual {v5, v10}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/fragment/app/d0;

    if-eqz v5, :cond_8

    invoke-static {v9, v6}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v10

    if-eqz v10, :cond_7

    new-instance v10, Ljava/lang/StringBuilder;

    const-string v11, "restoreSaveState: re-attaching retained "

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_7
    new-instance v10, Landroidx/fragment/app/e1;

    invoke-direct {v10, v7, v3, v5, v15}, Landroidx/fragment/app/e1;-><init>(Landroidx/fragment/app/x;Landroidx/fragment/app/f1;Landroidx/fragment/app/d0;Landroidx/fragment/app/d1;)V

    goto :goto_4

    :cond_8
    new-instance v5, Landroidx/fragment/app/e1;

    iget-object v11, v0, Landroidx/fragment/app/x0;->l:Landroidx/fragment/app/x;

    iget-object v12, v0, Landroidx/fragment/app/x0;->c:Landroidx/fragment/app/f1;

    iget-object v7, v0, Landroidx/fragment/app/x0;->t:Landroidx/fragment/app/m0;

    iget-object v7, v7, Landroidx/fragment/app/m0;->b:Landroid/content/Context;

    invoke-virtual {v7}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v13

    invoke-virtual/range {p0 .. p0}, Landroidx/fragment/app/x0;->z()Landroidx/fragment/app/s0;

    move-result-object v14

    move-object v10, v5

    invoke-direct/range {v10 .. v15}, Landroidx/fragment/app/e1;-><init>(Landroidx/fragment/app/x;Landroidx/fragment/app/f1;Ljava/lang/ClassLoader;Landroidx/fragment/app/s0;Landroidx/fragment/app/d1;)V

    :goto_4
    iget-object v5, v10, Landroidx/fragment/app/e1;->c:Landroidx/fragment/app/d0;

    iput-object v0, v5, Landroidx/fragment/app/d0;->mFragmentManager:Landroidx/fragment/app/x0;

    invoke-static {v9, v6}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v6

    if-eqz v6, :cond_9

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "restoreSaveState: active ("

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v7, v5, Landroidx/fragment/app/d0;->mWho:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v9, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_9
    iget-object v5, v0, Landroidx/fragment/app/x0;->t:Landroidx/fragment/app/m0;

    iget-object v5, v5, Landroidx/fragment/app/m0;->b:Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v5

    invoke-virtual {v10, v5}, Landroidx/fragment/app/e1;->k(Ljava/lang/ClassLoader;)V

    invoke-virtual {v3, v10}, Landroidx/fragment/app/f1;->g(Landroidx/fragment/app/e1;)V

    iget v5, v0, Landroidx/fragment/app/x0;->s:I

    iput v5, v10, Landroidx/fragment/app/e1;->e:I

    goto/16 :goto_3

    :cond_a
    iget-object v4, v0, Landroidx/fragment/app/x0;->L:Landroidx/fragment/app/b1;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v5, Ljava/util/ArrayList;

    iget-object v4, v4, Landroidx/fragment/app/b1;->a:Ljava/util/HashMap;

    invoke-virtual {v4}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v4

    invoke-direct {v5, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    const/4 v10, 0x1

    if-eqz v5, :cond_d

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/fragment/app/d0;

    iget-object v11, v5, Landroidx/fragment/app/d0;->mWho:Ljava/lang/String;

    invoke-virtual {v2, v11}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    if-eqz v11, :cond_b

    goto :goto_5

    :cond_b
    invoke-static {v9, v6}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v11

    if-eqz v11, :cond_c

    new-instance v11, Ljava/lang/StringBuilder;

    const-string v12, "Discarding retained Fragment "

    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v12, " that was not found in the set of active Fragments "

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v12, v1, Landroidx/fragment/app/z0;->a:Ljava/util/ArrayList;

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-static {v9, v11}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_c
    iget-object v11, v0, Landroidx/fragment/app/x0;->L:Landroidx/fragment/app/b1;

    invoke-virtual {v11, v5}, Landroidx/fragment/app/b1;->e(Landroidx/fragment/app/d0;)V

    iput-object v0, v5, Landroidx/fragment/app/d0;->mFragmentManager:Landroidx/fragment/app/x0;

    new-instance v11, Landroidx/fragment/app/e1;

    invoke-direct {v11, v7, v3, v5}, Landroidx/fragment/app/e1;-><init>(Landroidx/fragment/app/x;Landroidx/fragment/app/f1;Landroidx/fragment/app/d0;)V

    iput v10, v11, Landroidx/fragment/app/e1;->e:I

    invoke-virtual {v11}, Landroidx/fragment/app/e1;->j()V

    iput-boolean v10, v5, Landroidx/fragment/app/d0;->mRemoving:Z

    invoke-virtual {v11}, Landroidx/fragment/app/e1;->j()V

    goto :goto_5

    :cond_d
    iget-object v2, v1, Landroidx/fragment/app/z0;->b:Ljava/util/ArrayList;

    iget-object v4, v3, Landroidx/fragment/app/f1;->a:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->clear()V

    if-eqz v2, :cond_10

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_10

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v3, v4}, Landroidx/fragment/app/f1;->b(Ljava/lang/String;)Landroidx/fragment/app/d0;

    move-result-object v5

    if-eqz v5, :cond_f

    invoke-static {v9, v6}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v7

    if-eqz v7, :cond_e

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v11, "restoreSaveState: added ("

    invoke-direct {v7, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v9, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_e
    invoke-virtual {v3, v5}, Landroidx/fragment/app/f1;->a(Landroidx/fragment/app/d0;)V

    goto :goto_6

    :cond_f
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "No instantiated fragment for ("

    const-string v3, ")"

    invoke-static {v2, v4, v3}, Ll/q;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_10
    iget-object v2, v1, Landroidx/fragment/app/z0;->c:[Landroidx/fragment/app/b;

    if-eqz v2, :cond_18

    new-instance v2, Ljava/util/ArrayList;

    iget-object v5, v1, Landroidx/fragment/app/z0;->c:[Landroidx/fragment/app/b;

    array-length v5, v5

    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v2, v0, Landroidx/fragment/app/x0;->d:Ljava/util/ArrayList;

    const/4 v2, 0x0

    :goto_7
    iget-object v5, v1, Landroidx/fragment/app/z0;->c:[Landroidx/fragment/app/b;

    array-length v7, v5

    if-ge v2, v7, :cond_17

    aget-object v5, v5, v2

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v7, Landroidx/fragment/app/a;

    invoke-direct {v7, v0}, Landroidx/fragment/app/a;-><init>(Landroidx/fragment/app/x0;)V

    const/4 v11, 0x0

    const/4 v12, 0x0

    :goto_8
    iget-object v13, v5, Landroidx/fragment/app/b;->a:[I

    array-length v14, v13

    if-ge v11, v14, :cond_13

    new-instance v14, Landroidx/fragment/app/g1;

    invoke-direct {v14}, Ljava/lang/Object;-><init>()V

    add-int/lit8 v15, v11, 0x1

    aget v4, v13, v11

    iput v4, v14, Landroidx/fragment/app/g1;->a:I

    invoke-static {v9, v6}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v4

    if-eqz v4, :cond_11

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v6, "Instantiate "

    invoke-direct {v4, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v6, " op #"

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v6, " base fragment #"

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget v6, v13, v15

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v9, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_11
    invoke-static {}, Landroidx/lifecycle/q;->values()[Landroidx/lifecycle/q;

    move-result-object v4

    iget-object v6, v5, Landroidx/fragment/app/b;->c:[I

    aget v6, v6, v12

    aget-object v4, v4, v6

    iput-object v4, v14, Landroidx/fragment/app/g1;->h:Landroidx/lifecycle/q;

    invoke-static {}, Landroidx/lifecycle/q;->values()[Landroidx/lifecycle/q;

    move-result-object v4

    iget-object v6, v5, Landroidx/fragment/app/b;->d:[I

    aget v6, v6, v12

    aget-object v4, v4, v6

    iput-object v4, v14, Landroidx/fragment/app/g1;->i:Landroidx/lifecycle/q;

    add-int/lit8 v4, v11, 0x2

    aget v6, v13, v15

    if-eqz v6, :cond_12

    move v6, v10

    goto :goto_9

    :cond_12
    const/4 v6, 0x0

    :goto_9
    iput-boolean v6, v14, Landroidx/fragment/app/g1;->c:Z

    add-int/lit8 v6, v11, 0x3

    aget v4, v13, v4

    iput v4, v14, Landroidx/fragment/app/g1;->d:I

    add-int/lit8 v15, v11, 0x4

    aget v6, v13, v6

    iput v6, v14, Landroidx/fragment/app/g1;->e:I

    add-int/lit8 v16, v11, 0x5

    aget v15, v13, v15

    iput v15, v14, Landroidx/fragment/app/g1;->f:I

    add-int/lit8 v11, v11, 0x6

    aget v13, v13, v16

    iput v13, v14, Landroidx/fragment/app/g1;->g:I

    iput v4, v7, Landroidx/fragment/app/a;->b:I

    iput v6, v7, Landroidx/fragment/app/a;->c:I

    iput v15, v7, Landroidx/fragment/app/a;->d:I

    iput v13, v7, Landroidx/fragment/app/a;->e:I

    invoke-virtual {v7, v14}, Landroidx/fragment/app/a;->b(Landroidx/fragment/app/g1;)V

    add-int/lit8 v12, v12, 0x1

    const/4 v6, 0x2

    goto/16 :goto_8

    :cond_13
    iget v4, v5, Landroidx/fragment/app/b;->e:I

    iput v4, v7, Landroidx/fragment/app/a;->f:I

    iget-object v4, v5, Landroidx/fragment/app/b;->f:Ljava/lang/String;

    iput-object v4, v7, Landroidx/fragment/app/a;->h:Ljava/lang/String;

    iput-boolean v10, v7, Landroidx/fragment/app/a;->g:Z

    iget v4, v5, Landroidx/fragment/app/b;->o:I

    iput v4, v7, Landroidx/fragment/app/a;->i:I

    iget-object v4, v5, Landroidx/fragment/app/b;->p:Ljava/lang/CharSequence;

    iput-object v4, v7, Landroidx/fragment/app/a;->j:Ljava/lang/CharSequence;

    iget v4, v5, Landroidx/fragment/app/b;->q:I

    iput v4, v7, Landroidx/fragment/app/a;->k:I

    iget-object v4, v5, Landroidx/fragment/app/b;->r:Ljava/lang/CharSequence;

    iput-object v4, v7, Landroidx/fragment/app/a;->l:Ljava/lang/CharSequence;

    iget-object v4, v5, Landroidx/fragment/app/b;->s:Ljava/util/ArrayList;

    iput-object v4, v7, Landroidx/fragment/app/a;->m:Ljava/util/ArrayList;

    iget-object v4, v5, Landroidx/fragment/app/b;->t:Ljava/util/ArrayList;

    iput-object v4, v7, Landroidx/fragment/app/a;->n:Ljava/util/ArrayList;

    iget-boolean v4, v5, Landroidx/fragment/app/b;->u:Z

    iput-boolean v4, v7, Landroidx/fragment/app/a;->o:Z

    iget v4, v5, Landroidx/fragment/app/b;->n:I

    iput v4, v7, Landroidx/fragment/app/a;->r:I

    const/4 v4, 0x0

    :goto_a
    iget-object v6, v5, Landroidx/fragment/app/b;->b:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v11

    if-ge v4, v11, :cond_15

    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    if-eqz v6, :cond_14

    iget-object v11, v7, Landroidx/fragment/app/a;->a:Ljava/util/ArrayList;

    invoke-virtual {v11, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Landroidx/fragment/app/g1;

    invoke-virtual {v3, v6}, Landroidx/fragment/app/f1;->b(Ljava/lang/String;)Landroidx/fragment/app/d0;

    move-result-object v6

    iput-object v6, v11, Landroidx/fragment/app/g1;->b:Landroidx/fragment/app/d0;

    :cond_14
    add-int/lit8 v4, v4, 0x1

    goto :goto_a

    :cond_15
    invoke-virtual {v7, v10}, Landroidx/fragment/app/a;->c(I)V

    const/4 v4, 0x2

    invoke-static {v9, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v5

    if-eqz v5, :cond_16

    const-string v5, "restoreAllState: back stack #"

    const-string v6, " (index "

    invoke-static {v5, v2, v6}, La7/a;->q(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    iget v6, v7, Landroidx/fragment/app/a;->r:I

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v9, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v5, Landroidx/fragment/app/q1;

    invoke-direct {v5}, Landroidx/fragment/app/q1;-><init>()V

    new-instance v6, Ljava/io/PrintWriter;

    invoke-direct {v6, v5}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    const-string v5, "  "

    const/4 v11, 0x0

    invoke-virtual {v7, v5, v6, v11}, Landroidx/fragment/app/a;->f(Ljava/lang/String;Ljava/io/PrintWriter;Z)V

    invoke-virtual {v6}, Ljava/io/PrintWriter;->close()V

    goto :goto_b

    :cond_16
    const/4 v11, 0x0

    :goto_b
    iget-object v5, v0, Landroidx/fragment/app/x0;->d:Ljava/util/ArrayList;

    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    move v6, v4

    goto/16 :goto_7

    :cond_17
    const/4 v11, 0x0

    goto :goto_c

    :cond_18
    const/4 v11, 0x0

    const/4 v2, 0x0

    iput-object v2, v0, Landroidx/fragment/app/x0;->d:Ljava/util/ArrayList;

    :goto_c
    iget-object v2, v0, Landroidx/fragment/app/x0;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    iget v4, v1, Landroidx/fragment/app/z0;->d:I

    invoke-virtual {v2, v4}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    iget-object v2, v1, Landroidx/fragment/app/z0;->e:Ljava/lang/String;

    if-eqz v2, :cond_19

    invoke-virtual {v3, v2}, Landroidx/fragment/app/f1;->b(Ljava/lang/String;)Landroidx/fragment/app/d0;

    move-result-object v2

    iput-object v2, v0, Landroidx/fragment/app/x0;->w:Landroidx/fragment/app/d0;

    invoke-virtual {v0, v2}, Landroidx/fragment/app/x0;->n(Landroidx/fragment/app/d0;)V

    :cond_19
    iget-object v2, v1, Landroidx/fragment/app/z0;->f:Ljava/util/ArrayList;

    if-eqz v2, :cond_1a

    move v4, v11

    :goto_d
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v4, v3, :cond_1a

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    iget-object v5, v1, Landroidx/fragment/app/z0;->n:Ljava/util/ArrayList;

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/fragment/app/c;

    iget-object v6, v0, Landroidx/fragment/app/x0;->j:Ljava/util/Map;

    invoke-interface {v6, v3, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v4, v4, 0x1

    goto :goto_d

    :cond_1a
    new-instance v2, Ljava/util/ArrayDeque;

    iget-object v1, v1, Landroidx/fragment/app/z0;->o:Ljava/util/ArrayList;

    invoke-direct {v2, v1}, Ljava/util/ArrayDeque;-><init>(Ljava/util/Collection;)V

    iput-object v2, v0, Landroidx/fragment/app/x0;->C:Ljava/util/ArrayDeque;

    return-void
.end method

.method public final L()Landroid/os/Bundle;
    .locals 12

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {p0}, Landroidx/fragment/app/x0;->x()V

    invoke-virtual {p0}, Landroidx/fragment/app/x0;->e()Ljava/util/HashSet;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/fragment/app/t1;

    invoke-virtual {v2}, Landroidx/fragment/app/t1;->e()V

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    invoke-virtual {p0, v1}, Landroidx/fragment/app/x0;->t(Z)Z

    iput-boolean v1, p0, Landroidx/fragment/app/x0;->E:Z

    iget-object v2, p0, Landroidx/fragment/app/x0;->L:Landroidx/fragment/app/b1;

    iput-boolean v1, v2, Landroidx/fragment/app/b1;->f:Z

    iget-object v1, p0, Landroidx/fragment/app/x0;->c:Landroidx/fragment/app/f1;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, Ljava/util/ArrayList;

    iget-object v1, v1, Landroidx/fragment/app/f1;->b:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->size()I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x2

    if-eqz v3, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/fragment/app/e1;

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Landroidx/fragment/app/e1;->m()V

    iget-object v3, v3, Landroidx/fragment/app/e1;->c:Landroidx/fragment/app/d0;

    iget-object v5, v3, Landroidx/fragment/app/d0;->mWho:Ljava/lang/String;

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v5, "FragmentManager"

    invoke-static {v5, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v4

    if-eqz v4, :cond_1

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v6, "Saved state of "

    invoke-direct {v4, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v6, ": "

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v3, Landroidx/fragment/app/d0;->mSavedFragmentState:Landroid/os/Bundle;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v5, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    :cond_2
    iget-object v1, p0, Landroidx/fragment/app/x0;->c:Landroidx/fragment/app/f1;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v3, Ljava/util/ArrayList;

    iget-object v1, v1, Landroidx/fragment/app/f1;->c:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-direct {v3, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_3

    const-string v1, "FragmentManager"

    invoke-static {v1, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_c

    const-string v1, "FragmentManager"

    const-string v2, "saveAllState: no fragments!"

    invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_7

    :cond_3
    iget-object v1, p0, Landroidx/fragment/app/x0;->c:Landroidx/fragment/app/f1;

    iget-object v5, v1, Landroidx/fragment/app/f1;->a:Ljava/util/ArrayList;

    monitor-enter v5

    :try_start_0
    iget-object v6, v1, Landroidx/fragment/app/f1;->a:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v6

    const/4 v7, 0x0

    if-eqz v6, :cond_4

    monitor-exit v5

    move-object v6, v7

    goto :goto_3

    :catchall_0
    move-exception v0

    goto/16 :goto_8

    :cond_4
    new-instance v6, Ljava/util/ArrayList;

    iget-object v8, v1, Landroidx/fragment/app/f1;->a:Ljava/util/ArrayList;

    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v8

    invoke-direct {v6, v8}, Ljava/util/ArrayList;-><init>(I)V

    iget-object v1, v1, Landroidx/fragment/app/f1;->a:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_5
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroidx/fragment/app/d0;

    iget-object v9, v8, Landroidx/fragment/app/d0;->mWho:Ljava/lang/String;

    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v9, "FragmentManager"

    invoke-static {v9, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v9

    if-eqz v9, :cond_5

    const-string v9, "FragmentManager"

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "saveAllState: adding fragment ("

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v11, v8, Landroidx/fragment/app/d0;->mWho:Ljava/lang/String;

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v11, "): "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v9, v8}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_2

    :cond_6
    monitor-exit v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_3
    iget-object v1, p0, Landroidx/fragment/app/x0;->d:Ljava/util/ArrayList;

    if-eqz v1, :cond_8

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lez v1, :cond_8

    new-array v5, v1, [Landroidx/fragment/app/b;

    const/4 v8, 0x0

    :goto_4
    if-ge v8, v1, :cond_9

    new-instance v9, Landroidx/fragment/app/b;

    iget-object v10, p0, Landroidx/fragment/app/x0;->d:Ljava/util/ArrayList;

    invoke-virtual {v10, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Landroidx/fragment/app/a;

    invoke-direct {v9, v10}, Landroidx/fragment/app/b;-><init>(Landroidx/fragment/app/a;)V

    aput-object v9, v5, v8

    const-string v9, "FragmentManager"

    invoke-static {v9, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v9

    if-eqz v9, :cond_7

    const-string v9, "FragmentManager"

    const-string v10, "saveAllState: adding back stack #"

    const-string v11, ": "

    invoke-static {v10, v8, v11}, La7/a;->q(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    iget-object v11, p0, Landroidx/fragment/app/x0;->d:Ljava/util/ArrayList;

    invoke-virtual {v11, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_7
    add-int/lit8 v8, v8, 0x1

    goto :goto_4

    :cond_8
    move-object v5, v7

    :cond_9
    new-instance v1, Landroidx/fragment/app/z0;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v7, v1, Landroidx/fragment/app/z0;->e:Ljava/lang/String;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iput-object v4, v1, Landroidx/fragment/app/z0;->f:Ljava/util/ArrayList;

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    iput-object v7, v1, Landroidx/fragment/app/z0;->n:Ljava/util/ArrayList;

    iput-object v2, v1, Landroidx/fragment/app/z0;->a:Ljava/util/ArrayList;

    iput-object v6, v1, Landroidx/fragment/app/z0;->b:Ljava/util/ArrayList;

    iput-object v5, v1, Landroidx/fragment/app/z0;->c:[Landroidx/fragment/app/b;

    iget-object v2, p0, Landroidx/fragment/app/x0;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v2

    iput v2, v1, Landroidx/fragment/app/z0;->d:I

    iget-object v2, p0, Landroidx/fragment/app/x0;->w:Landroidx/fragment/app/d0;

    if-eqz v2, :cond_a

    iget-object v2, v2, Landroidx/fragment/app/d0;->mWho:Ljava/lang/String;

    iput-object v2, v1, Landroidx/fragment/app/z0;->e:Ljava/lang/String;

    :cond_a
    iget-object v2, p0, Landroidx/fragment/app/x0;->j:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object v2, p0, Landroidx/fragment/app/x0;->j:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-virtual {v7, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    new-instance v2, Ljava/util/ArrayList;

    iget-object v4, p0, Landroidx/fragment/app/x0;->C:Ljava/util/ArrayDeque;

    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v2, v1, Landroidx/fragment/app/z0;->o:Ljava/util/ArrayList;

    const-string v2, "state"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    iget-object v1, p0, Landroidx/fragment/app/x0;->k:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_b

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const-string v4, "result_"

    invoke-static {v4, v2}, Ll/q;->x(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Landroidx/fragment/app/x0;->k:Ljava/util/Map;

    invoke-interface {v5, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/os/Bundle;

    invoke-virtual {v0, v4, v2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    goto :goto_5

    :cond_b
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_c

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/fragment/app/d1;

    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    const-string v4, "state"

    invoke-virtual {v3, v4, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "fragment_"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, v2, Landroidx/fragment/app/d1;->b:Ljava/lang/String;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    goto :goto_6

    :cond_c
    :goto_7
    return-object v0

    :goto_8
    :try_start_1
    monitor-exit v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final M()V
    .locals 3

    iget-object v0, p0, Landroidx/fragment/app/x0;->a:Ljava/util/ArrayList;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Landroidx/fragment/app/x0;->a:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Landroidx/fragment/app/x0;->t:Landroidx/fragment/app/m0;

    iget-object v1, v1, Landroidx/fragment/app/m0;->c:Landroid/os/Handler;

    iget-object v2, p0, Landroidx/fragment/app/x0;->M:Landroidx/fragment/app/e;

    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iget-object v1, p0, Landroidx/fragment/app/x0;->t:Landroidx/fragment/app/m0;

    iget-object v1, v1, Landroidx/fragment/app/m0;->c:Landroid/os/Handler;

    iget-object v2, p0, Landroidx/fragment/app/x0;->M:Landroidx/fragment/app/e;

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    invoke-virtual {p0}, Landroidx/fragment/app/x0;->S()V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final N(Landroidx/fragment/app/d0;Z)V
    .locals 1

    invoke-virtual {p0, p1}, Landroidx/fragment/app/x0;->y(Landroidx/fragment/app/d0;)Landroid/view/ViewGroup;

    move-result-object p1

    if-eqz p1, :cond_0

    instance-of v0, p1, Landroidx/fragment/app/k0;

    if-eqz v0, :cond_0

    check-cast p1, Landroidx/fragment/app/k0;

    xor-int/lit8 p2, p2, 0x1

    invoke-virtual {p1, p2}, Landroidx/fragment/app/k0;->setDrawDisappearingViewsLast(Z)V

    :cond_0
    return-void
.end method

.method public final O(Landroidx/fragment/app/d0;Landroidx/lifecycle/q;)V
    .locals 2

    iget-object v0, p1, Landroidx/fragment/app/d0;->mWho:Ljava/lang/String;

    iget-object v1, p0, Landroidx/fragment/app/x0;->c:Landroidx/fragment/app/f1;

    invoke-virtual {v1, v0}, Landroidx/fragment/app/f1;->b(Ljava/lang/String;)Landroidx/fragment/app/d0;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/fragment/app/d0;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p1, Landroidx/fragment/app/d0;->mHost:Landroidx/fragment/app/m0;

    if-eqz v0, :cond_0

    iget-object v0, p1, Landroidx/fragment/app/d0;->mFragmentManager:Landroidx/fragment/app/x0;

    if-ne v0, p0, :cond_1

    :cond_0
    iput-object p2, p1, Landroidx/fragment/app/d0;->mMaxState:Landroidx/lifecycle/q;

    return-void

    :cond_1
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Fragment "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " is not an active fragment of FragmentManager "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final P(Landroidx/fragment/app/d0;)V
    .locals 3

    if-eqz p1, :cond_1

    iget-object v0, p1, Landroidx/fragment/app/d0;->mWho:Ljava/lang/String;

    iget-object v1, p0, Landroidx/fragment/app/x0;->c:Landroidx/fragment/app/f1;

    invoke-virtual {v1, v0}, Landroidx/fragment/app/f1;->b(Ljava/lang/String;)Landroidx/fragment/app/d0;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/fragment/app/d0;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p1, Landroidx/fragment/app/d0;->mHost:Landroidx/fragment/app/m0;

    if-eqz v0, :cond_1

    iget-object v0, p1, Landroidx/fragment/app/d0;->mFragmentManager:Landroidx/fragment/app/x0;

    if-ne v0, p0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " is not an active fragment of FragmentManager "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    iget-object v0, p0, Landroidx/fragment/app/x0;->w:Landroidx/fragment/app/d0;

    iput-object p1, p0, Landroidx/fragment/app/x0;->w:Landroidx/fragment/app/d0;

    invoke-virtual {p0, v0}, Landroidx/fragment/app/x0;->n(Landroidx/fragment/app/d0;)V

    iget-object p1, p0, Landroidx/fragment/app/x0;->w:Landroidx/fragment/app/d0;

    invoke-virtual {p0, p1}, Landroidx/fragment/app/x0;->n(Landroidx/fragment/app/d0;)V

    return-void
.end method

.method public final Q(Landroidx/fragment/app/d0;)V
    .locals 3

    invoke-virtual {p0, p1}, Landroidx/fragment/app/x0;->y(Landroidx/fragment/app/d0;)Landroid/view/ViewGroup;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Landroidx/fragment/app/d0;->getEnterAnim()I

    move-result v1

    invoke-virtual {p1}, Landroidx/fragment/app/d0;->getExitAnim()I

    move-result v2

    add-int/2addr v2, v1

    invoke-virtual {p1}, Landroidx/fragment/app/d0;->getPopEnterAnim()I

    move-result v1

    add-int/2addr v1, v2

    invoke-virtual {p1}, Landroidx/fragment/app/d0;->getPopExitAnim()I

    move-result v2

    add-int/2addr v2, v1

    if-lez v2, :cond_1

    const v1, 0x7f0800e9

    invoke-virtual {v0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_0

    invoke-virtual {v0, v1, p1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    :cond_0
    invoke-virtual {v0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/fragment/app/d0;

    invoke-virtual {p1}, Landroidx/fragment/app/d0;->getPopDirection()Z

    move-result p1

    invoke-virtual {v0, p1}, Landroidx/fragment/app/d0;->setPopDirection(Z)V

    :cond_1
    return-void
.end method

.method public final S()V
    .locals 3

    iget-object v0, p0, Landroidx/fragment/app/x0;->a:Ljava/util/ArrayList;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Landroidx/fragment/app/x0;->a:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    const/4 v2, 0x1

    if-nez v1, :cond_1

    iget-object v1, p0, Landroidx/fragment/app/x0;->h:Landroidx/activity/j0;

    iput-boolean v2, v1, Landroidx/activity/y;->a:Z

    iget-object v1, v1, Landroidx/activity/y;->c:Lc9/a;

    if-eqz v1, :cond_0

    invoke-interface {v1}, Lc9/a;->invoke()Ljava/lang/Object;

    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Landroidx/fragment/app/x0;->h:Landroidx/activity/j0;

    iget-object v1, p0, Landroidx/fragment/app/x0;->d:Ljava/util/ArrayList;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lez v1, :cond_2

    iget-object v1, p0, Landroidx/fragment/app/x0;->v:Landroidx/fragment/app/d0;

    invoke-static {v1}, Landroidx/fragment/app/x0;->D(Landroidx/fragment/app/d0;)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v2, 0x0

    :goto_0
    iput-boolean v2, v0, Landroidx/activity/y;->a:Z

    iget-object v0, v0, Landroidx/activity/y;->c:Lc9/a;

    if-eqz v0, :cond_3

    invoke-interface {v0}, Lc9/a;->invoke()Ljava/lang/Object;

    :cond_3
    return-void

    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final a(Landroidx/fragment/app/d0;)Landroidx/fragment/app/e1;
    .locals 3

    iget-object v0, p1, Landroidx/fragment/app/d0;->mPreviousWho:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-static {p1, v0}, Ln3/c;->d(Landroidx/fragment/app/d0;Ljava/lang/String;)V

    :cond_0
    const/4 v0, 0x2

    const-string v1, "FragmentManager"

    invoke-static {v1, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "add: "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    invoke-virtual {p0, p1}, Landroidx/fragment/app/x0;->f(Landroidx/fragment/app/d0;)Landroidx/fragment/app/e1;

    move-result-object v0

    iput-object p0, p1, Landroidx/fragment/app/d0;->mFragmentManager:Landroidx/fragment/app/x0;

    iget-object v1, p0, Landroidx/fragment/app/x0;->c:Landroidx/fragment/app/f1;

    invoke-virtual {v1, v0}, Landroidx/fragment/app/f1;->g(Landroidx/fragment/app/e1;)V

    iget-boolean v2, p1, Landroidx/fragment/app/d0;->mDetached:Z

    if-nez v2, :cond_3

    invoke-virtual {v1, p1}, Landroidx/fragment/app/f1;->a(Landroidx/fragment/app/d0;)V

    const/4 v1, 0x0

    iput-boolean v1, p1, Landroidx/fragment/app/d0;->mRemoving:Z

    iget-object v2, p1, Landroidx/fragment/app/d0;->mView:Landroid/view/View;

    if-nez v2, :cond_2

    iput-boolean v1, p1, Landroidx/fragment/app/d0;->mHiddenChanged:Z

    :cond_2
    invoke-static {p1}, Landroidx/fragment/app/x0;->C(Landroidx/fragment/app/d0;)Z

    move-result p1

    if-eqz p1, :cond_3

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/fragment/app/x0;->D:Z

    :cond_3
    return-object v0
.end method

.method public final b(Landroidx/fragment/app/m0;Landroidx/fragment/app/j0;Landroidx/fragment/app/d0;)V
    .locals 7

    iget-object v0, p0, Landroidx/fragment/app/x0;->t:Landroidx/fragment/app/m0;

    if-nez v0, :cond_12

    iput-object p1, p0, Landroidx/fragment/app/x0;->t:Landroidx/fragment/app/m0;

    iput-object p2, p0, Landroidx/fragment/app/x0;->u:Landroidx/fragment/app/j0;

    iput-object p3, p0, Landroidx/fragment/app/x0;->v:Landroidx/fragment/app/d0;

    iget-object p2, p0, Landroidx/fragment/app/x0;->m:Ljava/util/concurrent/CopyOnWriteArrayList;

    if-eqz p3, :cond_0

    new-instance v0, Landroidx/fragment/app/t0;

    invoke-direct {v0, p3}, Landroidx/fragment/app/t0;-><init>(Landroidx/fragment/app/d0;)V

    invoke-virtual {p2, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    instance-of v0, p1, Landroidx/fragment/app/c1;

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, Landroidx/fragment/app/c1;

    invoke-virtual {p2, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    :goto_0
    iget-object p2, p0, Landroidx/fragment/app/x0;->v:Landroidx/fragment/app/d0;

    if-eqz p2, :cond_2

    invoke-virtual {p0}, Landroidx/fragment/app/x0;->S()V

    :cond_2
    instance-of p2, p1, Landroidx/activity/k0;

    if-eqz p2, :cond_4

    move-object p2, p1

    check-cast p2, Landroidx/activity/k0;

    invoke-interface {p2}, Landroidx/activity/k0;->getOnBackPressedDispatcher()Landroidx/activity/i0;

    move-result-object v0

    iput-object v0, p0, Landroidx/fragment/app/x0;->g:Landroidx/activity/i0;

    if-eqz p3, :cond_3

    move-object p2, p3

    :cond_3
    iget-object v1, p0, Landroidx/fragment/app/x0;->h:Landroidx/activity/j0;

    invoke-virtual {v0, p2, v1}, Landroidx/activity/i0;->a(Landroidx/lifecycle/w;Landroidx/activity/y;)V

    :cond_4
    const/4 p2, 0x0

    if-eqz p3, :cond_6

    iget-object p1, p3, Landroidx/fragment/app/d0;->mFragmentManager:Landroidx/fragment/app/x0;

    iget-object p1, p1, Landroidx/fragment/app/x0;->L:Landroidx/fragment/app/b1;

    iget-object v0, p1, Landroidx/fragment/app/b1;->b:Ljava/util/HashMap;

    iget-object v1, p3, Landroidx/fragment/app/d0;->mWho:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/b1;

    if-nez v1, :cond_5

    new-instance v1, Landroidx/fragment/app/b1;

    iget-boolean p1, p1, Landroidx/fragment/app/b1;->d:Z

    invoke-direct {v1, p1}, Landroidx/fragment/app/b1;-><init>(Z)V

    iget-object p1, p3, Landroidx/fragment/app/d0;->mWho:Ljava/lang/String;

    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_5
    iput-object v1, p0, Landroidx/fragment/app/x0;->L:Landroidx/fragment/app/b1;

    goto :goto_1

    :cond_6
    instance-of v0, p1, Landroidx/lifecycle/g1;

    if-eqz v0, :cond_7

    check-cast p1, Landroidx/lifecycle/g1;

    invoke-interface {p1}, Landroidx/lifecycle/g1;->getViewModelStore()Landroidx/lifecycle/f1;

    move-result-object p1

    new-instance v0, Landroidx/lifecycle/e1;

    sget-object v1, Landroidx/fragment/app/b1;->g:Landroidx/fragment/app/a1;

    invoke-direct {v0, p1, v1}, Landroidx/lifecycle/e1;-><init>(Landroidx/lifecycle/f1;Landroidx/fragment/app/a1;)V

    const-class p1, Landroidx/fragment/app/b1;

    invoke-virtual {v0, p1}, Landroidx/lifecycle/e1;->a(Ljava/lang/Class;)Landroidx/lifecycle/x0;

    move-result-object p1

    check-cast p1, Landroidx/fragment/app/b1;

    iput-object p1, p0, Landroidx/fragment/app/x0;->L:Landroidx/fragment/app/b1;

    goto :goto_1

    :cond_7
    new-instance p1, Landroidx/fragment/app/b1;

    invoke-direct {p1, p2}, Landroidx/fragment/app/b1;-><init>(Z)V

    iput-object p1, p0, Landroidx/fragment/app/x0;->L:Landroidx/fragment/app/b1;

    :goto_1
    iget-object p1, p0, Landroidx/fragment/app/x0;->L:Landroidx/fragment/app/b1;

    iget-boolean v0, p0, Landroidx/fragment/app/x0;->E:Z

    const/4 v1, 0x1

    if-nez v0, :cond_9

    iget-boolean v0, p0, Landroidx/fragment/app/x0;->F:Z

    if-eqz v0, :cond_8

    goto :goto_2

    :cond_8
    move v0, p2

    goto :goto_3

    :cond_9
    :goto_2
    move v0, v1

    :goto_3
    iput-boolean v0, p1, Landroidx/fragment/app/b1;->f:Z

    iget-object v0, p0, Landroidx/fragment/app/x0;->c:Landroidx/fragment/app/f1;

    iput-object p1, v0, Landroidx/fragment/app/f1;->d:Landroidx/fragment/app/b1;

    iget-object p1, p0, Landroidx/fragment/app/x0;->t:Landroidx/fragment/app/m0;

    instance-of v0, p1, Lb4/g;

    const/4 v2, 0x3

    if-eqz v0, :cond_a

    if-nez p3, :cond_a

    check-cast p1, Lb4/g;

    invoke-interface {p1}, Lb4/g;->getSavedStateRegistry()Lb4/e;

    move-result-object p1

    new-instance v0, Landroidx/activity/f;

    invoke-direct {v0, p0, v2}, Landroidx/activity/f;-><init>(Ljava/lang/Object;I)V

    const-string v3, "android:support:fragments"

    invoke-virtual {p1, v3, v0}, Lb4/e;->d(Ljava/lang/String;Lb4/d;)V

    invoke-virtual {p1, v3}, Lb4/e;->a(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_a

    invoke-virtual {p0, p1}, Landroidx/fragment/app/x0;->K(Landroid/os/Parcelable;)V

    :cond_a
    iget-object p1, p0, Landroidx/fragment/app/x0;->t:Landroidx/fragment/app/m0;

    instance-of v0, p1, Ld/j;

    if-eqz v0, :cond_c

    check-cast p1, Ld/j;

    invoke-interface {p1}, Ld/j;->getActivityResultRegistry()Ld/i;

    move-result-object p1

    if-eqz p3, :cond_b

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p3, Landroidx/fragment/app/d0;->mWho:Ljava/lang/String;

    const-string v4, ":"

    invoke-static {v0, v3, v4}, La7/a;->p(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_4

    :cond_b
    const-string v0, ""

    :goto_4
    const-string v3, "FragmentManager:"

    invoke-static {v3, v0}, Ll/q;->x(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v3, "StartActivityForResult"

    invoke-static {v0, v3}, Ll/q;->j(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Le/e;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    new-instance v5, Landroidx/fragment/app/q0;

    const/4 v6, 0x2

    invoke-direct {v5, p0, v6}, Landroidx/fragment/app/q0;-><init>(Landroidx/fragment/app/x0;I)V

    invoke-virtual {p1, v3, v4, v5}, Ld/i;->d(Ljava/lang/String;Le/b;Ld/c;)Ld/f;

    move-result-object v3

    iput-object v3, p0, Landroidx/fragment/app/x0;->z:Ld/f;

    const-string v3, "StartIntentSenderForResult"

    invoke-static {v0, v3}, Ll/q;->j(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Le/c;

    invoke-direct {v4, v1}, Le/c;-><init>(I)V

    new-instance v1, Landroidx/fragment/app/q0;

    invoke-direct {v1, p0, v2}, Landroidx/fragment/app/q0;-><init>(Landroidx/fragment/app/x0;I)V

    invoke-virtual {p1, v3, v4, v1}, Ld/i;->d(Ljava/lang/String;Le/b;Ld/c;)Ld/f;

    move-result-object v1

    iput-object v1, p0, Landroidx/fragment/app/x0;->A:Ld/f;

    const-string v1, "RequestPermissions"

    invoke-static {v0, v1}, Ll/q;->j(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Le/d;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    new-instance v2, Landroidx/fragment/app/q0;

    invoke-direct {v2, p0, p2}, Landroidx/fragment/app/q0;-><init>(Landroidx/fragment/app/x0;I)V

    invoke-virtual {p1, v0, v1, v2}, Ld/i;->d(Ljava/lang/String;Le/b;Ld/c;)Ld/f;

    move-result-object p1

    iput-object p1, p0, Landroidx/fragment/app/x0;->B:Ld/f;

    :cond_c
    iget-object p1, p0, Landroidx/fragment/app/x0;->t:Landroidx/fragment/app/m0;

    instance-of p2, p1, Lr2/n;

    if-eqz p2, :cond_d

    check-cast p1, Lr2/n;

    iget-object p2, p0, Landroidx/fragment/app/x0;->n:Landroidx/fragment/app/p0;

    invoke-interface {p1, p2}, Lr2/n;->addOnConfigurationChangedListener(La3/a;)V

    :cond_d
    iget-object p1, p0, Landroidx/fragment/app/x0;->t:Landroidx/fragment/app/m0;

    instance-of p2, p1, Lr2/o;

    if-eqz p2, :cond_e

    check-cast p1, Lr2/o;

    iget-object p2, p0, Landroidx/fragment/app/x0;->o:Landroidx/fragment/app/p0;

    invoke-interface {p1, p2}, Lr2/o;->addOnTrimMemoryListener(La3/a;)V

    :cond_e
    iget-object p1, p0, Landroidx/fragment/app/x0;->t:Landroidx/fragment/app/m0;

    instance-of p2, p1, Lq2/o0;

    if-eqz p2, :cond_f

    check-cast p1, Lq2/o0;

    iget-object p2, p0, Landroidx/fragment/app/x0;->p:Landroidx/fragment/app/p0;

    invoke-interface {p1, p2}, Lq2/o0;->addOnMultiWindowModeChangedListener(La3/a;)V

    :cond_f
    iget-object p1, p0, Landroidx/fragment/app/x0;->t:Landroidx/fragment/app/m0;

    instance-of p2, p1, Lq2/p0;

    if-eqz p2, :cond_10

    check-cast p1, Lq2/p0;

    iget-object p2, p0, Landroidx/fragment/app/x0;->q:Landroidx/fragment/app/p0;

    invoke-interface {p1, p2}, Lq2/p0;->addOnPictureInPictureModeChangedListener(La3/a;)V

    :cond_10
    iget-object p1, p0, Landroidx/fragment/app/x0;->t:Landroidx/fragment/app/m0;

    instance-of p2, p1, Lb3/i;

    if-eqz p2, :cond_11

    if-nez p3, :cond_11

    check-cast p1, Lb3/i;

    iget-object p2, p0, Landroidx/fragment/app/x0;->r:Landroidx/fragment/app/r0;

    invoke-interface {p1, p2}, Lb3/i;->addMenuProvider(Lb3/o;)V

    :cond_11
    return-void

    :cond_12
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Already attached"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final c(Landroidx/fragment/app/d0;)V
    .locals 4

    const-string v0, "FragmentManager"

    const/4 v1, 0x2

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v2

    if-eqz v2, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "attach: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-boolean v2, p1, Landroidx/fragment/app/d0;->mDetached:Z

    if-eqz v2, :cond_2

    const/4 v2, 0x0

    iput-boolean v2, p1, Landroidx/fragment/app/d0;->mDetached:Z

    iget-boolean v2, p1, Landroidx/fragment/app/d0;->mAdded:Z

    if-nez v2, :cond_2

    iget-object v2, p0, Landroidx/fragment/app/x0;->c:Landroidx/fragment/app/f1;

    invoke-virtual {v2, p1}, Landroidx/fragment/app/f1;->a(Landroidx/fragment/app/d0;)V

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_1

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "add from attach: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    invoke-static {p1}, Landroidx/fragment/app/x0;->C(Landroidx/fragment/app/d0;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/fragment/app/x0;->D:Z

    :cond_2
    return-void
.end method

.method public final d()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/fragment/app/x0;->b:Z

    iget-object v0, p0, Landroidx/fragment/app/x0;->J:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v0, p0, Landroidx/fragment/app/x0;->I:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    return-void
.end method

.method public final e()Ljava/util/HashSet;
    .locals 4

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iget-object v1, p0, Landroidx/fragment/app/x0;->c:Landroidx/fragment/app/f1;

    invoke-virtual {v1}, Landroidx/fragment/app/f1;->d()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/fragment/app/e1;

    iget-object v2, v2, Landroidx/fragment/app/e1;->c:Landroidx/fragment/app/d0;

    iget-object v2, v2, Landroidx/fragment/app/d0;->mContainer:Landroid/view/ViewGroup;

    if-eqz v2, :cond_0

    invoke-virtual {p0}, Landroidx/fragment/app/x0;->A()Landroidx/fragment/app/q0;

    move-result-object v3

    invoke-static {v2, v3}, Landroidx/fragment/app/t1;->f(Landroid/view/ViewGroup;Landroidx/fragment/app/q0;)Landroidx/fragment/app/t1;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public final f(Landroidx/fragment/app/d0;)Landroidx/fragment/app/e1;
    .locals 3

    iget-object v0, p1, Landroidx/fragment/app/d0;->mWho:Ljava/lang/String;

    iget-object v1, p0, Landroidx/fragment/app/x0;->c:Landroidx/fragment/app/f1;

    iget-object v2, v1, Landroidx/fragment/app/f1;->b:Ljava/util/HashMap;

    invoke-virtual {v2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/fragment/app/e1;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Landroidx/fragment/app/e1;

    iget-object v2, p0, Landroidx/fragment/app/x0;->l:Landroidx/fragment/app/x;

    invoke-direct {v0, v2, v1, p1}, Landroidx/fragment/app/e1;-><init>(Landroidx/fragment/app/x;Landroidx/fragment/app/f1;Landroidx/fragment/app/d0;)V

    iget-object p1, p0, Landroidx/fragment/app/x0;->t:Landroidx/fragment/app/m0;

    iget-object p1, p1, Landroidx/fragment/app/m0;->b:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroidx/fragment/app/e1;->k(Ljava/lang/ClassLoader;)V

    iget p1, p0, Landroidx/fragment/app/x0;->s:I

    iput p1, v0, Landroidx/fragment/app/e1;->e:I

    return-object v0
.end method

.method public final g(Landroidx/fragment/app/d0;)V
    .locals 4

    const-string v0, "FragmentManager"

    const/4 v1, 0x2

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v2

    if-eqz v2, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "detach: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-boolean v2, p1, Landroidx/fragment/app/d0;->mDetached:Z

    if-nez v2, :cond_3

    const/4 v2, 0x1

    iput-boolean v2, p1, Landroidx/fragment/app/d0;->mDetached:Z

    iget-boolean v3, p1, Landroidx/fragment/app/d0;->mAdded:Z

    if-eqz v3, :cond_3

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_1

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "remove from detach: "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    iget-object v0, p0, Landroidx/fragment/app/x0;->c:Landroidx/fragment/app/f1;

    iget-object v1, v0, Landroidx/fragment/app/f1;->a:Ljava/util/ArrayList;

    monitor-enter v1

    :try_start_0
    iget-object v0, v0, Landroidx/fragment/app/f1;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v0, 0x0

    iput-boolean v0, p1, Landroidx/fragment/app/d0;->mAdded:Z

    invoke-static {p1}, Landroidx/fragment/app/x0;->C(Landroidx/fragment/app/d0;)Z

    move-result v0

    if-eqz v0, :cond_2

    iput-boolean v2, p0, Landroidx/fragment/app/x0;->D:Z

    :cond_2
    invoke-virtual {p0, p1}, Landroidx/fragment/app/x0;->Q(Landroidx/fragment/app/d0;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :cond_3
    :goto_0
    return-void
.end method

.method public final h(Landroid/view/MenuItem;)Z
    .locals 4

    iget v0, p0, Landroidx/fragment/app/x0;->s:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ge v0, v2, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/x0;->c:Landroidx/fragment/app/f1;

    invoke-virtual {v0}, Landroidx/fragment/app/f1;->f()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/fragment/app/d0;

    if-eqz v3, :cond_1

    invoke-virtual {v3, p1}, Landroidx/fragment/app/d0;->performContextItemSelected(Landroid/view/MenuItem;)Z

    move-result v3

    if-eqz v3, :cond_1

    return v2

    :cond_2
    return v1
.end method

.method public final i(Landroid/view/Menu;Landroid/view/MenuInflater;)Z
    .locals 7

    iget v0, p0, Landroidx/fragment/app/x0;->s:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ge v0, v2, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/x0;->c:Landroidx/fragment/app/f1;

    invoke-virtual {v0}, Landroidx/fragment/app/f1;->f()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v3, 0x0

    move v4, v1

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/fragment/app/d0;

    if-eqz v5, :cond_1

    invoke-virtual {v5}, Landroidx/fragment/app/d0;->isMenuVisible()Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-virtual {v5, p1, p2}, Landroidx/fragment/app/d0;->performCreateOptionsMenu(Landroid/view/Menu;Landroid/view/MenuInflater;)Z

    move-result v6

    if-eqz v6, :cond_1

    if-nez v3, :cond_2

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    :cond_2
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v4, v2

    goto :goto_0

    :cond_3
    iget-object p1, p0, Landroidx/fragment/app/x0;->e:Ljava/util/ArrayList;

    if-eqz p1, :cond_6

    :goto_1
    iget-object p1, p0, Landroidx/fragment/app/x0;->e:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-ge v1, p1, :cond_6

    iget-object p1, p0, Landroidx/fragment/app/x0;->e:Ljava/util/ArrayList;

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/fragment/app/d0;

    if-eqz v3, :cond_4

    invoke-virtual {v3, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_5

    :cond_4
    invoke-virtual {p1}, Landroidx/fragment/app/d0;->onDestroyOptionsMenu()V

    :cond_5
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_6
    iput-object v3, p0, Landroidx/fragment/app/x0;->e:Ljava/util/ArrayList;

    return v4
.end method

.method public final j()V
    .locals 8

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/x0;->G:Z

    invoke-virtual {p0, v0}, Landroidx/fragment/app/x0;->t(Z)Z

    invoke-virtual {p0}, Landroidx/fragment/app/x0;->e()Ljava/util/HashSet;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/fragment/app/t1;

    invoke-virtual {v2}, Landroidx/fragment/app/t1;->e()V

    goto :goto_0

    :cond_0
    iget-object v1, p0, Landroidx/fragment/app/x0;->t:Landroidx/fragment/app/m0;

    instance-of v2, v1, Landroidx/lifecycle/g1;

    iget-object v3, p0, Landroidx/fragment/app/x0;->c:Landroidx/fragment/app/f1;

    if-eqz v2, :cond_1

    iget-object v0, v3, Landroidx/fragment/app/f1;->d:Landroidx/fragment/app/b1;

    iget-boolean v0, v0, Landroidx/fragment/app/b1;->e:Z

    goto :goto_1

    :cond_1
    iget-object v1, v1, Landroidx/fragment/app/m0;->b:Landroid/content/Context;

    instance-of v2, v1, Landroid/app/Activity;

    if-eqz v2, :cond_2

    check-cast v1, Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->isChangingConfigurations()Z

    move-result v1

    xor-int/2addr v0, v1

    :goto_1
    if-eqz v0, :cond_5

    :cond_2
    iget-object v0, p0, Landroidx/fragment/app/x0;->j:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/c;

    iget-object v1, v1, Landroidx/fragment/app/c;->a:Ljava/util/ArrayList;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    iget-object v4, v3, Landroidx/fragment/app/f1;->d:Landroidx/fragment/app/b1;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v5, 0x3

    const-string v6, "FragmentManager"

    invoke-static {v6, v5}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v5

    if-eqz v5, :cond_4

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v7, "Clearing non-config state for saved state of Fragment "

    invoke-direct {v5, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v6, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_4
    invoke-virtual {v4, v2}, Landroidx/fragment/app/b1;->d(Ljava/lang/String;)V

    goto :goto_2

    :cond_5
    const/4 v0, -0x1

    invoke-virtual {p0, v0}, Landroidx/fragment/app/x0;->p(I)V

    iget-object v0, p0, Landroidx/fragment/app/x0;->t:Landroidx/fragment/app/m0;

    instance-of v1, v0, Lr2/o;

    if-eqz v1, :cond_6

    check-cast v0, Lr2/o;

    iget-object v1, p0, Landroidx/fragment/app/x0;->o:Landroidx/fragment/app/p0;

    invoke-interface {v0, v1}, Lr2/o;->removeOnTrimMemoryListener(La3/a;)V

    :cond_6
    iget-object v0, p0, Landroidx/fragment/app/x0;->t:Landroidx/fragment/app/m0;

    instance-of v1, v0, Lr2/n;

    if-eqz v1, :cond_7

    check-cast v0, Lr2/n;

    iget-object v1, p0, Landroidx/fragment/app/x0;->n:Landroidx/fragment/app/p0;

    invoke-interface {v0, v1}, Lr2/n;->removeOnConfigurationChangedListener(La3/a;)V

    :cond_7
    iget-object v0, p0, Landroidx/fragment/app/x0;->t:Landroidx/fragment/app/m0;

    instance-of v1, v0, Lq2/o0;

    if-eqz v1, :cond_8

    check-cast v0, Lq2/o0;

    iget-object v1, p0, Landroidx/fragment/app/x0;->p:Landroidx/fragment/app/p0;

    invoke-interface {v0, v1}, Lq2/o0;->removeOnMultiWindowModeChangedListener(La3/a;)V

    :cond_8
    iget-object v0, p0, Landroidx/fragment/app/x0;->t:Landroidx/fragment/app/m0;

    instance-of v1, v0, Lq2/p0;

    if-eqz v1, :cond_9

    check-cast v0, Lq2/p0;

    iget-object v1, p0, Landroidx/fragment/app/x0;->q:Landroidx/fragment/app/p0;

    invoke-interface {v0, v1}, Lq2/p0;->removeOnPictureInPictureModeChangedListener(La3/a;)V

    :cond_9
    iget-object v0, p0, Landroidx/fragment/app/x0;->t:Landroidx/fragment/app/m0;

    instance-of v1, v0, Lb3/i;

    if-eqz v1, :cond_a

    check-cast v0, Lb3/i;

    iget-object v1, p0, Landroidx/fragment/app/x0;->r:Landroidx/fragment/app/r0;

    invoke-interface {v0, v1}, Lb3/i;->removeMenuProvider(Lb3/o;)V

    :cond_a
    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/fragment/app/x0;->t:Landroidx/fragment/app/m0;

    iput-object v0, p0, Landroidx/fragment/app/x0;->u:Landroidx/fragment/app/j0;

    iput-object v0, p0, Landroidx/fragment/app/x0;->v:Landroidx/fragment/app/d0;

    iget-object v1, p0, Landroidx/fragment/app/x0;->g:Landroidx/activity/i0;

    if-eqz v1, :cond_c

    iget-object v1, p0, Landroidx/fragment/app/x0;->h:Landroidx/activity/j0;

    iget-object v1, v1, Landroidx/activity/y;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_b

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/activity/c;

    invoke-interface {v2}, Landroidx/activity/c;->cancel()V

    goto :goto_3

    :cond_b
    iput-object v0, p0, Landroidx/fragment/app/x0;->g:Landroidx/activity/i0;

    :cond_c
    iget-object v0, p0, Landroidx/fragment/app/x0;->z:Ld/f;

    if-eqz v0, :cond_d

    invoke-virtual {v0}, Ld/f;->b()V

    iget-object v0, p0, Landroidx/fragment/app/x0;->A:Ld/f;

    invoke-virtual {v0}, Ld/f;->b()V

    iget-object v0, p0, Landroidx/fragment/app/x0;->B:Ld/f;

    invoke-virtual {v0}, Ld/f;->b()V

    :cond_d
    return-void
.end method

.method public final k()V
    .locals 3

    iget-object v0, p0, Landroidx/fragment/app/x0;->c:Landroidx/fragment/app/f1;

    invoke-virtual {v0}, Landroidx/fragment/app/f1;->e()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/d0;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroidx/fragment/app/d0;->isHidden()Z

    move-result v2

    invoke-virtual {v1, v2}, Landroidx/fragment/app/d0;->onHiddenChanged(Z)V

    iget-object v1, v1, Landroidx/fragment/app/d0;->mChildFragmentManager:Landroidx/fragment/app/x0;

    invoke-virtual {v1}, Landroidx/fragment/app/x0;->k()V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final l(Landroid/view/MenuItem;)Z
    .locals 4

    iget v0, p0, Landroidx/fragment/app/x0;->s:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ge v0, v2, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/x0;->c:Landroidx/fragment/app/f1;

    invoke-virtual {v0}, Landroidx/fragment/app/f1;->f()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/fragment/app/d0;

    if-eqz v3, :cond_1

    invoke-virtual {v3, p1}, Landroidx/fragment/app/d0;->performOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result v3

    if-eqz v3, :cond_1

    return v2

    :cond_2
    return v1
.end method

.method public final m(Landroid/view/Menu;)V
    .locals 2

    iget v0, p0, Landroidx/fragment/app/x0;->s:I

    const/4 v1, 0x1

    if-ge v0, v1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/x0;->c:Landroidx/fragment/app/f1;

    invoke-virtual {v0}, Landroidx/fragment/app/f1;->f()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/d0;

    if-eqz v1, :cond_1

    invoke-virtual {v1, p1}, Landroidx/fragment/app/d0;->performOptionsMenuClosed(Landroid/view/Menu;)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final n(Landroidx/fragment/app/d0;)V
    .locals 2

    if-eqz p1, :cond_0

    iget-object v0, p1, Landroidx/fragment/app/d0;->mWho:Ljava/lang/String;

    iget-object v1, p0, Landroidx/fragment/app/x0;->c:Landroidx/fragment/app/f1;

    invoke-virtual {v1, v0}, Landroidx/fragment/app/f1;->b(Ljava/lang/String;)Landroidx/fragment/app/d0;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/fragment/app/d0;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroidx/fragment/app/d0;->performPrimaryNavigationFragmentChanged()V

    :cond_0
    return-void
.end method

.method public final o(Landroid/view/Menu;)Z
    .locals 5

    iget v0, p0, Landroidx/fragment/app/x0;->s:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ge v0, v2, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/x0;->c:Landroidx/fragment/app/f1;

    invoke-virtual {v0}, Landroidx/fragment/app/f1;->f()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/fragment/app/d0;

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Landroidx/fragment/app/d0;->isMenuVisible()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-virtual {v3, p1}, Landroidx/fragment/app/d0;->performPrepareOptionsMenu(Landroid/view/Menu;)Z

    move-result v3

    if-eqz v3, :cond_1

    move v1, v2

    goto :goto_0

    :cond_2
    return v1
.end method

.method public final p(I)V
    .locals 4

    const/4 v0, 0x1

    const/4 v1, 0x0

    :try_start_0
    iput-boolean v0, p0, Landroidx/fragment/app/x0;->b:Z

    iget-object v2, p0, Landroidx/fragment/app/x0;->c:Landroidx/fragment/app/f1;

    iget-object v2, v2, Landroidx/fragment/app/f1;->b:Ljava/util/HashMap;

    invoke-virtual {v2}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/fragment/app/e1;

    if-eqz v3, :cond_0

    iput p1, v3, Landroidx/fragment/app/e1;->e:I

    goto :goto_0

    :cond_1
    invoke-virtual {p0, p1, v1}, Landroidx/fragment/app/x0;->E(IZ)V

    invoke-virtual {p0}, Landroidx/fragment/app/x0;->e()Ljava/util/HashSet;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/fragment/app/t1;

    invoke-virtual {v2}, Landroidx/fragment/app/t1;->e()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_2
    iput-boolean v1, p0, Landroidx/fragment/app/x0;->b:Z

    invoke-virtual {p0, v0}, Landroidx/fragment/app/x0;->t(Z)Z

    return-void

    :goto_2
    iput-boolean v1, p0, Landroidx/fragment/app/x0;->b:Z

    throw p1
.end method

.method public final q(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 5

    const-string v0, "    "

    invoke-static {p1, v0}, Ll/q;->j(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Landroidx/fragment/app/x0;->c:Landroidx/fragment/app/f1;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "    "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    iget-object v3, v1, Landroidx/fragment/app/f1;->b:Ljava/util/HashMap;

    invoke-virtual {v3}, Ljava/util/HashMap;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_1

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v4, "Active Fragments:"

    invoke-virtual {p3, v4}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/fragment/app/e1;

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    if-eqz v4, :cond_0

    iget-object v4, v4, Landroidx/fragment/app/e1;->c:Landroidx/fragment/app/d0;

    invoke-virtual {p3, v4}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    invoke-virtual {v4, v2, p2, p3, p4}, Landroidx/fragment/app/d0;->dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const-string v4, "null"

    invoke-virtual {p3, v4}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    iget-object p2, v1, Landroidx/fragment/app/f1;->a:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p4

    const/4 v1, 0x0

    if-lez p4, :cond_2

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v2, "Added Fragments:"

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    move v2, v1

    :goto_1
    if-ge v2, p4, :cond_2

    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/fragment/app/d0;

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v4, "  #"

    invoke-virtual {p3, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(I)V

    const-string v4, ": "

    invoke-virtual {p3, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {v3}, Landroidx/fragment/app/d0;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_2
    iget-object p2, p0, Landroidx/fragment/app/x0;->e:Ljava/util/ArrayList;

    if-eqz p2, :cond_3

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p2

    if-lez p2, :cond_3

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p4, "Fragments Created Menus:"

    invoke-virtual {p3, p4}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    move p4, v1

    :goto_2
    if-ge p4, p2, :cond_3

    iget-object v2, p0, Landroidx/fragment/app/x0;->e:Ljava/util/ArrayList;

    invoke-virtual {v2, p4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/fragment/app/d0;

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v3, "  #"

    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p3, p4}, Ljava/io/PrintWriter;->print(I)V

    const-string v3, ": "

    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {v2}, Landroidx/fragment/app/d0;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    add-int/lit8 p4, p4, 0x1

    goto :goto_2

    :cond_3
    iget-object p2, p0, Landroidx/fragment/app/x0;->d:Ljava/util/ArrayList;

    if-eqz p2, :cond_4

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p2

    if-lez p2, :cond_4

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p4, "Back Stack:"

    invoke-virtual {p3, p4}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    move p4, v1

    :goto_3
    if-ge p4, p2, :cond_4

    iget-object v2, p0, Landroidx/fragment/app/x0;->d:Ljava/util/ArrayList;

    invoke-virtual {v2, p4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/fragment/app/a;

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v3, "  #"

    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p3, p4}, Ljava/io/PrintWriter;->print(I)V

    const-string v3, ": "

    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {v2}, Landroidx/fragment/app/a;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    const/4 v3, 0x1

    invoke-virtual {v2, v0, p3, v3}, Landroidx/fragment/app/a;->f(Ljava/lang/String;Ljava/io/PrintWriter;Z)V

    add-int/lit8 p4, p4, 0x1

    goto :goto_3

    :cond_4
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p4, "Back Stack Index: "

    invoke-direct {p2, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p4, p0, Landroidx/fragment/app/x0;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p4}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result p4

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    iget-object p2, p0, Landroidx/fragment/app/x0;->a:Ljava/util/ArrayList;

    monitor-enter p2

    :try_start_0
    iget-object p4, p0, Landroidx/fragment/app/x0;->a:Ljava/util/ArrayList;

    invoke-virtual {p4}, Ljava/util/ArrayList;->size()I

    move-result p4

    if-lez p4, :cond_5

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "Pending Actions:"

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    :goto_4
    if-ge v1, p4, :cond_5

    iget-object v0, p0, Landroidx/fragment/app/x0;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/fragment/app/v0;

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v2, "  #"

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(I)V

    const-string v2, ": "

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_4

    :catchall_0
    move-exception p1

    goto :goto_5

    :cond_5
    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p2, "FragmentManager misc state:"

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p2, "  mHost="

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object p2, p0, Landroidx/fragment/app/x0;->t:Landroidx/fragment/app/m0;

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p2, "  mContainer="

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object p2, p0, Landroidx/fragment/app/x0;->u:Landroidx/fragment/app/j0;

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    iget-object p2, p0, Landroidx/fragment/app/x0;->v:Landroidx/fragment/app/d0;

    if-eqz p2, :cond_6

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p2, "  mParent="

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object p2, p0, Landroidx/fragment/app/x0;->v:Landroidx/fragment/app/d0;

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_6
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p2, "  mCurState="

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget p2, p0, Landroidx/fragment/app/x0;->s:I

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(I)V

    const-string p2, " mStateSaved="

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean p2, p0, Landroidx/fragment/app/x0;->E:Z

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Z)V

    const-string p2, " mStopped="

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean p2, p0, Landroidx/fragment/app/x0;->F:Z

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Z)V

    const-string p2, " mDestroyed="

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean p2, p0, Landroidx/fragment/app/x0;->G:Z

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Z)V

    iget-boolean p2, p0, Landroidx/fragment/app/x0;->D:Z

    if-eqz p2, :cond_7

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p1, "  mNeedMenuInvalidate="

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean p1, p0, Landroidx/fragment/app/x0;->D:Z

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->println(Z)V

    :cond_7
    return-void

    :goto_5
    :try_start_1
    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final r(Landroidx/fragment/app/v0;Z)V
    .locals 2

    if-nez p2, :cond_3

    iget-object v0, p0, Landroidx/fragment/app/x0;->t:Landroidx/fragment/app/m0;

    if-nez v0, :cond_1

    iget-boolean p1, p0, Landroidx/fragment/app/x0;->G:Z

    if-eqz p1, :cond_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "FragmentManager has been destroyed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "FragmentManager has not been attached to a host."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-boolean v0, p0, Landroidx/fragment/app/x0;->E:Z

    if-nez v0, :cond_2

    iget-boolean v0, p0, Landroidx/fragment/app/x0;->F:Z

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Can not perform this action after onSaveInstanceState"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    :goto_0
    iget-object v0, p0, Landroidx/fragment/app/x0;->a:Ljava/util/ArrayList;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Landroidx/fragment/app/x0;->t:Landroidx/fragment/app/m0;

    if-nez v1, :cond_5

    if-eqz p2, :cond_4

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Activity has been destroyed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    iget-object p2, p0, Landroidx/fragment/app/x0;->a:Ljava/util/ArrayList;

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Landroidx/fragment/app/x0;->M()V

    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final s(Z)V
    .locals 2

    iget-boolean v0, p0, Landroidx/fragment/app/x0;->b:Z

    if-nez v0, :cond_6

    iget-object v0, p0, Landroidx/fragment/app/x0;->t:Landroidx/fragment/app/m0;

    if-nez v0, :cond_1

    iget-boolean p1, p0, Landroidx/fragment/app/x0;->G:Z

    if-eqz p1, :cond_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "FragmentManager has been destroyed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "FragmentManager has not been attached to a host."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    iget-object v1, p0, Landroidx/fragment/app/x0;->t:Landroidx/fragment/app/m0;

    iget-object v1, v1, Landroidx/fragment/app/m0;->c:Landroid/os/Handler;

    invoke-virtual {v1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_5

    if-nez p1, :cond_3

    iget-boolean p1, p0, Landroidx/fragment/app/x0;->E:Z

    if-nez p1, :cond_2

    iget-boolean p1, p0, Landroidx/fragment/app/x0;->F:Z

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Can not perform this action after onSaveInstanceState"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    :goto_0
    iget-object p1, p0, Landroidx/fragment/app/x0;->I:Ljava/util/ArrayList;

    if-nez p1, :cond_4

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Landroidx/fragment/app/x0;->I:Ljava/util/ArrayList;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Landroidx/fragment/app/x0;->J:Ljava/util/ArrayList;

    :cond_4
    return-void

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Must be called from main thread of fragment host"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "FragmentManager is already executing transactions"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final t(Z)Z
    .locals 9

    invoke-virtual {p0, p1}, Landroidx/fragment/app/x0;->s(Z)V

    const/4 p1, 0x0

    move v0, p1

    :goto_0
    iget-object v1, p0, Landroidx/fragment/app/x0;->I:Ljava/util/ArrayList;

    iget-object v2, p0, Landroidx/fragment/app/x0;->J:Ljava/util/ArrayList;

    iget-object v3, p0, Landroidx/fragment/app/x0;->a:Ljava/util/ArrayList;

    monitor-enter v3

    :try_start_0
    iget-object v4, p0, Landroidx/fragment/app/x0;->a:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v4

    const/4 v5, 0x1

    if-eqz v4, :cond_0

    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p1

    goto/16 :goto_5

    :cond_0
    :try_start_1
    iget-object v4, p0, Landroidx/fragment/app/x0;->a:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    move v6, p1

    move v7, v6

    :goto_1
    if-ge v6, v4, :cond_1

    iget-object v8, p0, Landroidx/fragment/app/x0;->a:Ljava/util/ArrayList;

    invoke-virtual {v8, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroidx/fragment/app/v0;

    invoke-interface {v8, v1, v2}, Landroidx/fragment/app/v0;->a(Ljava/util/ArrayList;Ljava/util/ArrayList;)Z

    move-result v8
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    or-int/2addr v7, v8

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :catchall_1
    move-exception p1

    goto :goto_4

    :cond_1
    :try_start_2
    iget-object v1, p0, Landroidx/fragment/app/x0;->a:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    iget-object v1, p0, Landroidx/fragment/app/x0;->t:Landroidx/fragment/app/m0;

    iget-object v1, v1, Landroidx/fragment/app/m0;->c:Landroid/os/Handler;

    iget-object v2, p0, Landroidx/fragment/app/x0;->M:Landroidx/fragment/app/e;

    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v7, :cond_2

    iput-boolean v5, p0, Landroidx/fragment/app/x0;->b:Z

    :try_start_3
    iget-object v0, p0, Landroidx/fragment/app/x0;->I:Ljava/util/ArrayList;

    iget-object v1, p0, Landroidx/fragment/app/x0;->J:Ljava/util/ArrayList;

    invoke-virtual {p0, v0, v1}, Landroidx/fragment/app/x0;->J(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    invoke-virtual {p0}, Landroidx/fragment/app/x0;->d()V

    move v0, v5

    goto :goto_0

    :catchall_2
    move-exception p1

    invoke-virtual {p0}, Landroidx/fragment/app/x0;->d()V

    throw p1

    :cond_2
    :goto_2
    invoke-virtual {p0}, Landroidx/fragment/app/x0;->S()V

    iget-boolean v1, p0, Landroidx/fragment/app/x0;->H:Z

    if-eqz v1, :cond_5

    iput-boolean p1, p0, Landroidx/fragment/app/x0;->H:Z

    iget-object v1, p0, Landroidx/fragment/app/x0;->c:Landroidx/fragment/app/f1;

    invoke-virtual {v1}, Landroidx/fragment/app/f1;->d()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_3
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/fragment/app/e1;

    iget-object v3, v2, Landroidx/fragment/app/e1;->c:Landroidx/fragment/app/d0;

    iget-boolean v4, v3, Landroidx/fragment/app/d0;->mDeferStart:Z

    if-eqz v4, :cond_3

    iget-boolean v4, p0, Landroidx/fragment/app/x0;->b:Z

    if-eqz v4, :cond_4

    iput-boolean v5, p0, Landroidx/fragment/app/x0;->H:Z

    goto :goto_3

    :cond_4
    iput-boolean p1, v3, Landroidx/fragment/app/d0;->mDeferStart:Z

    invoke-virtual {v2}, Landroidx/fragment/app/e1;->j()V

    goto :goto_3

    :cond_5
    iget-object p1, p0, Landroidx/fragment/app/x0;->c:Landroidx/fragment/app/f1;

    iget-object p1, p1, Landroidx/fragment/app/f1;->b:Ljava/util/HashMap;

    invoke-virtual {p1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object p1

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/Collection;->removeAll(Ljava/util/Collection;)Z

    return v0

    :goto_4
    :try_start_4
    iget-object v0, p0, Landroidx/fragment/app/x0;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v0, p0, Landroidx/fragment/app/x0;->t:Landroidx/fragment/app/m0;

    iget-object v0, v0, Landroidx/fragment/app/m0;->c:Landroid/os/Handler;

    iget-object v1, p0, Landroidx/fragment/app/x0;->M:Landroidx/fragment/app/e;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    throw p1

    :goto_5
    monitor-exit v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x80

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "FragmentManager{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " in "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/fragment/app/x0;->v:Landroidx/fragment/app/d0;

    const-string v2, "}"

    const-string v3, "{"

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/fragment/app/x0;->v:Landroidx/fragment/app/d0;

    invoke-static {v1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    iget-object v1, p0, Landroidx/fragment/app/x0;->t:Landroidx/fragment/app/m0;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/fragment/app/x0;->t:Landroidx/fragment/app/m0;

    invoke-static {v1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_1
    const-string v1, "null"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_0
    const-string v1, "}}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final u(Ljava/util/ArrayList;Ljava/util/ArrayList;II)V
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move/from16 v3, p3

    move/from16 v4, p4

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/fragment/app/a;

    iget-boolean v5, v5, Landroidx/fragment/app/a;->o:Z

    iget-object v6, v0, Landroidx/fragment/app/x0;->K:Ljava/util/ArrayList;

    if-nez v6, :cond_0

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    iput-object v6, v0, Landroidx/fragment/app/x0;->K:Ljava/util/ArrayList;

    goto :goto_0

    :cond_0
    invoke-virtual {v6}, Ljava/util/ArrayList;->clear()V

    :goto_0
    iget-object v6, v0, Landroidx/fragment/app/x0;->K:Ljava/util/ArrayList;

    iget-object v7, v0, Landroidx/fragment/app/x0;->c:Landroidx/fragment/app/f1;

    invoke-virtual {v7}, Landroidx/fragment/app/f1;->f()Ljava/util/List;

    move-result-object v8

    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object v6, v0, Landroidx/fragment/app/x0;->w:Landroidx/fragment/app/d0;

    move v9, v3

    const/4 v10, 0x0

    :goto_1
    const/4 v11, 0x1

    if-ge v9, v4, :cond_13

    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Landroidx/fragment/app/a;

    invoke-virtual {v2, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/Boolean;

    invoke-virtual {v14}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v14

    if-nez v14, :cond_d

    iget-object v14, v0, Landroidx/fragment/app/x0;->K:Ljava/util/ArrayList;

    const/4 v12, 0x0

    :goto_2
    iget-object v8, v13, Landroidx/fragment/app/a;->a:Ljava/util/ArrayList;

    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v8

    if-ge v12, v8, :cond_c

    iget-object v8, v13, Landroidx/fragment/app/a;->a:Ljava/util/ArrayList;

    invoke-virtual {v8, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroidx/fragment/app/g1;

    iget v15, v8, Landroidx/fragment/app/g1;->a:I

    if-eq v15, v11, :cond_b

    const/4 v11, 0x2

    const/16 v3, 0x9

    if-eq v15, v11, :cond_5

    const/4 v11, 0x3

    if-eq v15, v11, :cond_4

    const/4 v11, 0x6

    if-eq v15, v11, :cond_4

    const/4 v11, 0x7

    if-eq v15, v11, :cond_3

    const/16 v11, 0x8

    if-eq v15, v11, :cond_1

    goto :goto_3

    :cond_1
    iget-object v11, v13, Landroidx/fragment/app/a;->a:Ljava/util/ArrayList;

    new-instance v15, Landroidx/fragment/app/g1;

    invoke-direct {v15, v3, v6}, Landroidx/fragment/app/g1;-><init>(ILandroidx/fragment/app/d0;)V

    invoke-virtual {v11, v12, v15}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    const/4 v3, 0x1

    iput-boolean v3, v8, Landroidx/fragment/app/g1;->c:Z

    add-int/lit8 v12, v12, 0x1

    iget-object v3, v8, Landroidx/fragment/app/g1;->b:Landroidx/fragment/app/d0;

    move-object v6, v3

    :cond_2
    :goto_3
    move-object/from16 v18, v7

    :goto_4
    const/4 v2, 0x1

    goto/16 :goto_9

    :cond_3
    move-object/from16 v18, v7

    const/4 v2, 0x1

    goto/16 :goto_8

    :cond_4
    iget-object v11, v8, Landroidx/fragment/app/g1;->b:Landroidx/fragment/app/d0;

    invoke-virtual {v14, v11}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    iget-object v8, v8, Landroidx/fragment/app/g1;->b:Landroidx/fragment/app/d0;

    if-ne v8, v6, :cond_2

    iget-object v6, v13, Landroidx/fragment/app/a;->a:Ljava/util/ArrayList;

    new-instance v11, Landroidx/fragment/app/g1;

    invoke-direct {v11, v8, v3}, Landroidx/fragment/app/g1;-><init>(Landroidx/fragment/app/d0;I)V

    invoke-virtual {v6, v12, v11}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    add-int/lit8 v12, v12, 0x1

    move-object/from16 v18, v7

    const/4 v2, 0x1

    const/4 v6, 0x0

    goto/16 :goto_9

    :cond_5
    iget-object v11, v8, Landroidx/fragment/app/g1;->b:Landroidx/fragment/app/d0;

    iget v15, v11, Landroidx/fragment/app/d0;->mContainerId:I

    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    move-result v17

    const/16 v16, 0x1

    add-int/lit8 v17, v17, -0x1

    move/from16 v3, v17

    const/16 v17, 0x0

    :goto_5
    if-ltz v3, :cond_9

    invoke-virtual {v14, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v18

    move-object/from16 v2, v18

    check-cast v2, Landroidx/fragment/app/d0;

    move-object/from16 v18, v7

    iget v7, v2, Landroidx/fragment/app/d0;->mContainerId:I

    if-ne v7, v15, :cond_8

    if-ne v2, v11, :cond_6

    move/from16 v19, v15

    const/16 v17, 0x1

    goto :goto_7

    :cond_6
    if-ne v2, v6, :cond_7

    iget-object v6, v13, Landroidx/fragment/app/a;->a:Ljava/util/ArrayList;

    new-instance v7, Landroidx/fragment/app/g1;

    move/from16 v19, v15

    const/16 v15, 0x9

    invoke-direct {v7, v15, v2}, Landroidx/fragment/app/g1;-><init>(ILandroidx/fragment/app/d0;)V

    invoke-virtual {v6, v12, v7}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    add-int/lit8 v12, v12, 0x1

    const/4 v6, 0x0

    goto :goto_6

    :cond_7
    move/from16 v19, v15

    const/16 v15, 0x9

    :goto_6
    new-instance v7, Landroidx/fragment/app/g1;

    const/4 v15, 0x3

    invoke-direct {v7, v15, v2}, Landroidx/fragment/app/g1;-><init>(ILandroidx/fragment/app/d0;)V

    iget v15, v8, Landroidx/fragment/app/g1;->d:I

    iput v15, v7, Landroidx/fragment/app/g1;->d:I

    iget v15, v8, Landroidx/fragment/app/g1;->f:I

    iput v15, v7, Landroidx/fragment/app/g1;->f:I

    iget v15, v8, Landroidx/fragment/app/g1;->e:I

    iput v15, v7, Landroidx/fragment/app/g1;->e:I

    iget v15, v8, Landroidx/fragment/app/g1;->g:I

    iput v15, v7, Landroidx/fragment/app/g1;->g:I

    iget-object v15, v13, Landroidx/fragment/app/a;->a:Ljava/util/ArrayList;

    invoke-virtual {v15, v12, v7}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    invoke-virtual {v14, v2}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    const/4 v2, 0x1

    add-int/2addr v12, v2

    goto :goto_7

    :cond_8
    move/from16 v19, v15

    :goto_7
    add-int/lit8 v3, v3, -0x1

    move-object/from16 v2, p2

    move-object/from16 v7, v18

    move/from16 v15, v19

    goto :goto_5

    :cond_9
    move-object/from16 v18, v7

    if-eqz v17, :cond_a

    iget-object v2, v13, Landroidx/fragment/app/a;->a:Ljava/util/ArrayList;

    invoke-virtual {v2, v12}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    add-int/lit8 v12, v12, -0x1

    goto/16 :goto_4

    :cond_a
    const/4 v2, 0x1

    iput v2, v8, Landroidx/fragment/app/g1;->a:I

    iput-boolean v2, v8, Landroidx/fragment/app/g1;->c:Z

    invoke-virtual {v14, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_9

    :cond_b
    move-object/from16 v18, v7

    move v2, v11

    :goto_8
    iget-object v3, v8, Landroidx/fragment/app/g1;->b:Landroidx/fragment/app/d0;

    invoke-virtual {v14, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_9
    add-int/2addr v12, v2

    move/from16 v3, p3

    move v11, v2

    move-object/from16 v7, v18

    move-object/from16 v2, p2

    goto/16 :goto_2

    :cond_c
    move-object/from16 v18, v7

    goto :goto_c

    :cond_d
    move-object/from16 v18, v7

    move v2, v11

    iget-object v3, v0, Landroidx/fragment/app/x0;->K:Ljava/util/ArrayList;

    iget-object v7, v13, Landroidx/fragment/app/a;->a:Ljava/util/ArrayList;

    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v7

    sub-int/2addr v7, v2

    :goto_a
    if-ltz v7, :cond_10

    iget-object v8, v13, Landroidx/fragment/app/a;->a:Ljava/util/ArrayList;

    invoke-virtual {v8, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroidx/fragment/app/g1;

    iget v11, v8, Landroidx/fragment/app/g1;->a:I

    if-eq v11, v2, :cond_f

    const/4 v2, 0x3

    if-eq v11, v2, :cond_e

    packed-switch v11, :pswitch_data_0

    goto :goto_b

    :pswitch_0
    iget-object v11, v8, Landroidx/fragment/app/g1;->h:Landroidx/lifecycle/q;

    iput-object v11, v8, Landroidx/fragment/app/g1;->i:Landroidx/lifecycle/q;

    goto :goto_b

    :pswitch_1
    iget-object v6, v8, Landroidx/fragment/app/g1;->b:Landroidx/fragment/app/d0;

    goto :goto_b

    :pswitch_2
    const/4 v6, 0x0

    goto :goto_b

    :cond_e
    :pswitch_3
    iget-object v8, v8, Landroidx/fragment/app/g1;->b:Landroidx/fragment/app/d0;

    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_b

    :cond_f
    const/4 v2, 0x3

    :pswitch_4
    iget-object v8, v8, Landroidx/fragment/app/g1;->b:Landroidx/fragment/app/d0;

    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    :goto_b
    add-int/lit8 v7, v7, -0x1

    const/4 v2, 0x1

    goto :goto_a

    :cond_10
    :goto_c
    if-nez v10, :cond_12

    iget-boolean v2, v13, Landroidx/fragment/app/a;->g:Z

    if-eqz v2, :cond_11

    goto :goto_d

    :cond_11
    const/4 v10, 0x0

    goto :goto_e

    :cond_12
    :goto_d
    const/4 v10, 0x1

    :goto_e
    add-int/lit8 v9, v9, 0x1

    move-object/from16 v2, p2

    move/from16 v3, p3

    move-object/from16 v7, v18

    goto/16 :goto_1

    :cond_13
    move-object/from16 v18, v7

    iget-object v2, v0, Landroidx/fragment/app/x0;->K:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    if-nez v5, :cond_16

    iget v2, v0, Landroidx/fragment/app/x0;->s:I

    const/4 v3, 0x1

    if-lt v2, v3, :cond_16

    move/from16 v2, p3

    :goto_f
    if-ge v2, v4, :cond_16

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/fragment/app/a;

    iget-object v3, v3, Landroidx/fragment/app/a;->a:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_10
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_15

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/fragment/app/g1;

    iget-object v5, v5, Landroidx/fragment/app/g1;->b:Landroidx/fragment/app/d0;

    if-eqz v5, :cond_14

    iget-object v6, v5, Landroidx/fragment/app/d0;->mFragmentManager:Landroidx/fragment/app/x0;

    if-eqz v6, :cond_14

    invoke-virtual {v0, v5}, Landroidx/fragment/app/x0;->f(Landroidx/fragment/app/d0;)Landroidx/fragment/app/e1;

    move-result-object v5

    move-object/from16 v6, v18

    invoke-virtual {v6, v5}, Landroidx/fragment/app/f1;->g(Landroidx/fragment/app/e1;)V

    goto :goto_11

    :cond_14
    move-object/from16 v6, v18

    :goto_11
    move-object/from16 v18, v6

    goto :goto_10

    :cond_15
    move-object/from16 v6, v18

    add-int/lit8 v2, v2, 0x1

    goto :goto_f

    :cond_16
    move/from16 v2, p3

    :goto_12
    const/4 v3, -0x1

    if-ge v2, v4, :cond_1e

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/fragment/app/a;

    move-object/from16 v6, p2

    invoke-virtual {v6, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Boolean;

    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    const-string v8, "Unknown cmd: "

    if-eqz v7, :cond_1c

    invoke-virtual {v5, v3}, Landroidx/fragment/app/a;->c(I)V

    iget-object v3, v5, Landroidx/fragment/app/a;->a:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/4 v7, 0x1

    sub-int/2addr v3, v7

    :goto_13
    if-ltz v3, :cond_1b

    iget-object v9, v5, Landroidx/fragment/app/a;->a:Ljava/util/ArrayList;

    invoke-virtual {v9, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Landroidx/fragment/app/g1;

    iget-object v10, v9, Landroidx/fragment/app/g1;->b:Landroidx/fragment/app/d0;

    if-eqz v10, :cond_1a

    const/4 v11, 0x0

    iput-boolean v11, v10, Landroidx/fragment/app/d0;->mBeingSaved:Z

    invoke-virtual {v10, v7}, Landroidx/fragment/app/d0;->setPopDirection(Z)V

    iget v7, v5, Landroidx/fragment/app/a;->f:I

    const/16 v11, 0x2002

    const/16 v12, 0x1001

    if-eq v7, v12, :cond_19

    if-eq v7, v11, :cond_17

    const/16 v11, 0x1004

    const/16 v12, 0x2005

    if-eq v7, v12, :cond_19

    const/16 v13, 0x1003

    if-eq v7, v13, :cond_18

    if-eq v7, v11, :cond_17

    const/4 v11, 0x0

    goto :goto_14

    :cond_17
    move v11, v12

    goto :goto_14

    :cond_18
    move v11, v13

    :cond_19
    :goto_14
    invoke-virtual {v10, v11}, Landroidx/fragment/app/d0;->setNextTransition(I)V

    iget-object v7, v5, Landroidx/fragment/app/a;->n:Ljava/util/ArrayList;

    iget-object v11, v5, Landroidx/fragment/app/a;->m:Ljava/util/ArrayList;

    invoke-virtual {v10, v7, v11}, Landroidx/fragment/app/d0;->setSharedElementNames(Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    :cond_1a
    iget v7, v9, Landroidx/fragment/app/g1;->a:I

    iget-object v11, v5, Landroidx/fragment/app/a;->p:Landroidx/fragment/app/x0;

    packed-switch v7, :pswitch_data_1

    :pswitch_5
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v3, v9, Landroidx/fragment/app/g1;->a:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_6
    iget-object v7, v9, Landroidx/fragment/app/g1;->h:Landroidx/lifecycle/q;

    invoke-virtual {v11, v10, v7}, Landroidx/fragment/app/x0;->O(Landroidx/fragment/app/d0;Landroidx/lifecycle/q;)V

    :goto_15
    const/4 v7, 0x1

    goto/16 :goto_16

    :pswitch_7
    invoke-virtual {v11, v10}, Landroidx/fragment/app/x0;->P(Landroidx/fragment/app/d0;)V

    goto :goto_15

    :pswitch_8
    const/4 v7, 0x0

    invoke-virtual {v11, v7}, Landroidx/fragment/app/x0;->P(Landroidx/fragment/app/d0;)V

    goto :goto_15

    :pswitch_9
    iget v7, v9, Landroidx/fragment/app/g1;->d:I

    iget v12, v9, Landroidx/fragment/app/g1;->e:I

    iget v13, v9, Landroidx/fragment/app/g1;->f:I

    iget v9, v9, Landroidx/fragment/app/g1;->g:I

    invoke-virtual {v10, v7, v12, v13, v9}, Landroidx/fragment/app/d0;->setAnimations(IIII)V

    const/4 v7, 0x1

    invoke-virtual {v11, v10, v7}, Landroidx/fragment/app/x0;->N(Landroidx/fragment/app/d0;Z)V

    invoke-virtual {v11, v10}, Landroidx/fragment/app/x0;->g(Landroidx/fragment/app/d0;)V

    goto :goto_15

    :pswitch_a
    iget v7, v9, Landroidx/fragment/app/g1;->d:I

    iget v12, v9, Landroidx/fragment/app/g1;->e:I

    iget v13, v9, Landroidx/fragment/app/g1;->f:I

    iget v9, v9, Landroidx/fragment/app/g1;->g:I

    invoke-virtual {v10, v7, v12, v13, v9}, Landroidx/fragment/app/d0;->setAnimations(IIII)V

    invoke-virtual {v11, v10}, Landroidx/fragment/app/x0;->c(Landroidx/fragment/app/d0;)V

    goto :goto_15

    :pswitch_b
    iget v7, v9, Landroidx/fragment/app/g1;->d:I

    iget v12, v9, Landroidx/fragment/app/g1;->e:I

    iget v13, v9, Landroidx/fragment/app/g1;->f:I

    iget v9, v9, Landroidx/fragment/app/g1;->g:I

    invoke-virtual {v10, v7, v12, v13, v9}, Landroidx/fragment/app/d0;->setAnimations(IIII)V

    const/4 v7, 0x1

    invoke-virtual {v11, v10, v7}, Landroidx/fragment/app/x0;->N(Landroidx/fragment/app/d0;Z)V

    invoke-virtual {v11, v10}, Landroidx/fragment/app/x0;->B(Landroidx/fragment/app/d0;)V

    goto :goto_15

    :pswitch_c
    iget v7, v9, Landroidx/fragment/app/g1;->d:I

    iget v12, v9, Landroidx/fragment/app/g1;->e:I

    iget v13, v9, Landroidx/fragment/app/g1;->f:I

    iget v9, v9, Landroidx/fragment/app/g1;->g:I

    invoke-virtual {v10, v7, v12, v13, v9}, Landroidx/fragment/app/d0;->setAnimations(IIII)V

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v10}, Landroidx/fragment/app/x0;->R(Landroidx/fragment/app/d0;)V

    goto :goto_15

    :pswitch_d
    iget v7, v9, Landroidx/fragment/app/g1;->d:I

    iget v12, v9, Landroidx/fragment/app/g1;->e:I

    iget v13, v9, Landroidx/fragment/app/g1;->f:I

    iget v9, v9, Landroidx/fragment/app/g1;->g:I

    invoke-virtual {v10, v7, v12, v13, v9}, Landroidx/fragment/app/d0;->setAnimations(IIII)V

    invoke-virtual {v11, v10}, Landroidx/fragment/app/x0;->a(Landroidx/fragment/app/d0;)Landroidx/fragment/app/e1;

    goto :goto_15

    :pswitch_e
    iget v7, v9, Landroidx/fragment/app/g1;->d:I

    iget v12, v9, Landroidx/fragment/app/g1;->e:I

    iget v13, v9, Landroidx/fragment/app/g1;->f:I

    iget v9, v9, Landroidx/fragment/app/g1;->g:I

    invoke-virtual {v10, v7, v12, v13, v9}, Landroidx/fragment/app/d0;->setAnimations(IIII)V

    const/4 v7, 0x1

    invoke-virtual {v11, v10, v7}, Landroidx/fragment/app/x0;->N(Landroidx/fragment/app/d0;Z)V

    invoke-virtual {v11, v10}, Landroidx/fragment/app/x0;->I(Landroidx/fragment/app/d0;)V

    :goto_16
    add-int/lit8 v3, v3, -0x1

    goto/16 :goto_13

    :cond_1b
    const/4 v7, 0x0

    const/4 v10, 0x0

    goto/16 :goto_1a

    :cond_1c
    const/4 v7, 0x1

    invoke-virtual {v5, v7}, Landroidx/fragment/app/a;->c(I)V

    iget-object v3, v5, Landroidx/fragment/app/a;->a:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/4 v11, 0x0

    :goto_17
    if-ge v11, v3, :cond_1b

    iget-object v7, v5, Landroidx/fragment/app/a;->a:Ljava/util/ArrayList;

    invoke-virtual {v7, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroidx/fragment/app/g1;

    iget-object v9, v7, Landroidx/fragment/app/g1;->b:Landroidx/fragment/app/d0;

    if-eqz v9, :cond_1d

    const/4 v10, 0x0

    iput-boolean v10, v9, Landroidx/fragment/app/d0;->mBeingSaved:Z

    invoke-virtual {v9, v10}, Landroidx/fragment/app/d0;->setPopDirection(Z)V

    iget v10, v5, Landroidx/fragment/app/a;->f:I

    invoke-virtual {v9, v10}, Landroidx/fragment/app/d0;->setNextTransition(I)V

    iget-object v10, v5, Landroidx/fragment/app/a;->m:Ljava/util/ArrayList;

    iget-object v12, v5, Landroidx/fragment/app/a;->n:Ljava/util/ArrayList;

    invoke-virtual {v9, v10, v12}, Landroidx/fragment/app/d0;->setSharedElementNames(Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    :cond_1d
    iget v10, v7, Landroidx/fragment/app/g1;->a:I

    iget-object v12, v5, Landroidx/fragment/app/a;->p:Landroidx/fragment/app/x0;

    packed-switch v10, :pswitch_data_2

    :pswitch_f
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v3, v7, Landroidx/fragment/app/g1;->a:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_10
    iget-object v7, v7, Landroidx/fragment/app/g1;->i:Landroidx/lifecycle/q;

    invoke-virtual {v12, v9, v7}, Landroidx/fragment/app/x0;->O(Landroidx/fragment/app/d0;Landroidx/lifecycle/q;)V

    const/4 v7, 0x0

    const/4 v10, 0x0

    goto/16 :goto_19

    :pswitch_11
    const/4 v10, 0x0

    invoke-virtual {v12, v10}, Landroidx/fragment/app/x0;->P(Landroidx/fragment/app/d0;)V

    :goto_18
    const/4 v7, 0x0

    goto :goto_19

    :pswitch_12
    const/4 v10, 0x0

    invoke-virtual {v12, v9}, Landroidx/fragment/app/x0;->P(Landroidx/fragment/app/d0;)V

    goto :goto_18

    :pswitch_13
    const/4 v10, 0x0

    iget v13, v7, Landroidx/fragment/app/g1;->d:I

    iget v14, v7, Landroidx/fragment/app/g1;->e:I

    iget v15, v7, Landroidx/fragment/app/g1;->f:I

    iget v7, v7, Landroidx/fragment/app/g1;->g:I

    invoke-virtual {v9, v13, v14, v15, v7}, Landroidx/fragment/app/d0;->setAnimations(IIII)V

    const/4 v7, 0x0

    invoke-virtual {v12, v9, v7}, Landroidx/fragment/app/x0;->N(Landroidx/fragment/app/d0;Z)V

    invoke-virtual {v12, v9}, Landroidx/fragment/app/x0;->c(Landroidx/fragment/app/d0;)V

    goto :goto_18

    :pswitch_14
    const/4 v10, 0x0

    iget v13, v7, Landroidx/fragment/app/g1;->d:I

    iget v14, v7, Landroidx/fragment/app/g1;->e:I

    iget v15, v7, Landroidx/fragment/app/g1;->f:I

    iget v7, v7, Landroidx/fragment/app/g1;->g:I

    invoke-virtual {v9, v13, v14, v15, v7}, Landroidx/fragment/app/d0;->setAnimations(IIII)V

    invoke-virtual {v12, v9}, Landroidx/fragment/app/x0;->g(Landroidx/fragment/app/d0;)V

    goto :goto_18

    :pswitch_15
    const/4 v10, 0x0

    iget v13, v7, Landroidx/fragment/app/g1;->d:I

    iget v14, v7, Landroidx/fragment/app/g1;->e:I

    iget v15, v7, Landroidx/fragment/app/g1;->f:I

    iget v7, v7, Landroidx/fragment/app/g1;->g:I

    invoke-virtual {v9, v13, v14, v15, v7}, Landroidx/fragment/app/d0;->setAnimations(IIII)V

    const/4 v7, 0x0

    invoke-virtual {v12, v9, v7}, Landroidx/fragment/app/x0;->N(Landroidx/fragment/app/d0;Z)V

    invoke-static {v9}, Landroidx/fragment/app/x0;->R(Landroidx/fragment/app/d0;)V

    goto :goto_18

    :pswitch_16
    const/4 v10, 0x0

    iget v13, v7, Landroidx/fragment/app/g1;->d:I

    iget v14, v7, Landroidx/fragment/app/g1;->e:I

    iget v15, v7, Landroidx/fragment/app/g1;->f:I

    iget v7, v7, Landroidx/fragment/app/g1;->g:I

    invoke-virtual {v9, v13, v14, v15, v7}, Landroidx/fragment/app/d0;->setAnimations(IIII)V

    invoke-virtual {v12, v9}, Landroidx/fragment/app/x0;->B(Landroidx/fragment/app/d0;)V

    goto :goto_18

    :pswitch_17
    const/4 v10, 0x0

    iget v13, v7, Landroidx/fragment/app/g1;->d:I

    iget v14, v7, Landroidx/fragment/app/g1;->e:I

    iget v15, v7, Landroidx/fragment/app/g1;->f:I

    iget v7, v7, Landroidx/fragment/app/g1;->g:I

    invoke-virtual {v9, v13, v14, v15, v7}, Landroidx/fragment/app/d0;->setAnimations(IIII)V

    invoke-virtual {v12, v9}, Landroidx/fragment/app/x0;->I(Landroidx/fragment/app/d0;)V

    goto :goto_18

    :pswitch_18
    const/4 v10, 0x0

    iget v13, v7, Landroidx/fragment/app/g1;->d:I

    iget v14, v7, Landroidx/fragment/app/g1;->e:I

    iget v15, v7, Landroidx/fragment/app/g1;->f:I

    iget v7, v7, Landroidx/fragment/app/g1;->g:I

    invoke-virtual {v9, v13, v14, v15, v7}, Landroidx/fragment/app/d0;->setAnimations(IIII)V

    const/4 v7, 0x0

    invoke-virtual {v12, v9, v7}, Landroidx/fragment/app/x0;->N(Landroidx/fragment/app/d0;Z)V

    invoke-virtual {v12, v9}, Landroidx/fragment/app/x0;->a(Landroidx/fragment/app/d0;)Landroidx/fragment/app/e1;

    :goto_19
    add-int/lit8 v11, v11, 0x1

    goto/16 :goto_17

    :goto_1a
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_12

    :cond_1e
    move-object/from16 v6, p2

    add-int/lit8 v2, v4, -0x1

    invoke-virtual {v6, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    move/from16 v5, p3

    :goto_1b
    if-ge v5, v4, :cond_23

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroidx/fragment/app/a;

    if-eqz v2, :cond_20

    iget-object v8, v7, Landroidx/fragment/app/a;->a:Ljava/util/ArrayList;

    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v8

    const/4 v9, 0x1

    sub-int/2addr v8, v9

    :goto_1c
    if-ltz v8, :cond_22

    iget-object v9, v7, Landroidx/fragment/app/a;->a:Ljava/util/ArrayList;

    invoke-virtual {v9, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Landroidx/fragment/app/g1;

    iget-object v9, v9, Landroidx/fragment/app/g1;->b:Landroidx/fragment/app/d0;

    if-eqz v9, :cond_1f

    invoke-virtual {v0, v9}, Landroidx/fragment/app/x0;->f(Landroidx/fragment/app/d0;)Landroidx/fragment/app/e1;

    move-result-object v9

    invoke-virtual {v9}, Landroidx/fragment/app/e1;->j()V

    :cond_1f
    add-int/lit8 v8, v8, -0x1

    goto :goto_1c

    :cond_20
    iget-object v7, v7, Landroidx/fragment/app/a;->a:Ljava/util/ArrayList;

    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_21
    :goto_1d
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_22

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroidx/fragment/app/g1;

    iget-object v8, v8, Landroidx/fragment/app/g1;->b:Landroidx/fragment/app/d0;

    if-eqz v8, :cond_21

    invoke-virtual {v0, v8}, Landroidx/fragment/app/x0;->f(Landroidx/fragment/app/d0;)Landroidx/fragment/app/e1;

    move-result-object v8

    invoke-virtual {v8}, Landroidx/fragment/app/e1;->j()V

    goto :goto_1d

    :cond_22
    add-int/lit8 v5, v5, 0x1

    goto :goto_1b

    :cond_23
    iget v5, v0, Landroidx/fragment/app/x0;->s:I

    const/4 v7, 0x1

    invoke-virtual {v0, v5, v7}, Landroidx/fragment/app/x0;->E(IZ)V

    new-instance v5, Ljava/util/HashSet;

    invoke-direct {v5}, Ljava/util/HashSet;-><init>()V

    move/from16 v7, p3

    :goto_1e
    if-ge v7, v4, :cond_26

    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroidx/fragment/app/a;

    iget-object v8, v8, Landroidx/fragment/app/a;->a:Ljava/util/ArrayList;

    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_24
    :goto_1f
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_25

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Landroidx/fragment/app/g1;

    iget-object v9, v9, Landroidx/fragment/app/g1;->b:Landroidx/fragment/app/d0;

    if-eqz v9, :cond_24

    iget-object v9, v9, Landroidx/fragment/app/d0;->mContainer:Landroid/view/ViewGroup;

    if-eqz v9, :cond_24

    invoke-virtual/range {p0 .. p0}, Landroidx/fragment/app/x0;->A()Landroidx/fragment/app/q0;

    move-result-object v10

    invoke-static {v9, v10}, Landroidx/fragment/app/t1;->f(Landroid/view/ViewGroup;Landroidx/fragment/app/q0;)Landroidx/fragment/app/t1;

    move-result-object v9

    invoke-virtual {v5, v9}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_1f

    :cond_25
    add-int/lit8 v7, v7, 0x1

    goto :goto_1e

    :cond_26
    invoke-virtual {v5}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_20
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_27

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroidx/fragment/app/t1;

    iput-boolean v2, v7, Landroidx/fragment/app/t1;->d:Z

    invoke-virtual {v7}, Landroidx/fragment/app/t1;->h()V

    invoke-virtual {v7}, Landroidx/fragment/app/t1;->c()V

    goto :goto_20

    :cond_27
    move/from16 v2, p3

    :goto_21
    if-ge v2, v4, :cond_29

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/fragment/app/a;

    invoke-virtual {v6, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Boolean;

    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    if-eqz v7, :cond_28

    iget v7, v5, Landroidx/fragment/app/a;->r:I

    if-ltz v7, :cond_28

    iput v3, v5, Landroidx/fragment/app/a;->r:I

    :cond_28
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    add-int/lit8 v2, v2, 0x1

    goto :goto_21

    :cond_29
    return-void

    :pswitch_data_0
    .packed-switch 0x6
        :pswitch_3
        :pswitch_4
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_e
        :pswitch_5
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_18
        :pswitch_f
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
    .end packed-switch
.end method

.method public final v(I)Landroidx/fragment/app/d0;
    .locals 5

    iget-object v0, p0, Landroidx/fragment/app/x0;->c:Landroidx/fragment/app/f1;

    iget-object v1, v0, Landroidx/fragment/app/f1;->a:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    :goto_0
    if-ltz v2, :cond_1

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/fragment/app/d0;

    if-eqz v3, :cond_0

    iget v4, v3, Landroidx/fragment/app/d0;->mFragmentId:I

    if-ne v4, p1, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, -0x1

    goto :goto_0

    :cond_1
    iget-object v0, v0, Landroidx/fragment/app/f1;->b:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/e1;

    if-eqz v1, :cond_2

    iget-object v3, v1, Landroidx/fragment/app/e1;->c:Landroidx/fragment/app/d0;

    iget v1, v3, Landroidx/fragment/app/d0;->mFragmentId:I

    if-ne v1, p1, :cond_2

    goto :goto_1

    :cond_3
    const/4 v3, 0x0

    :goto_1
    return-object v3
.end method

.method public final w(Ljava/lang/String;)Landroidx/fragment/app/d0;
    .locals 5

    iget-object v0, p0, Landroidx/fragment/app/x0;->c:Landroidx/fragment/app/f1;

    iget-object v1, v0, Landroidx/fragment/app/f1;->a:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    :goto_0
    if-ltz v2, :cond_1

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/fragment/app/d0;

    if-eqz v3, :cond_0

    iget-object v4, v3, Landroidx/fragment/app/d0;->mTag:Ljava/lang/String;

    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, -0x1

    goto :goto_0

    :cond_1
    iget-object v0, v0, Landroidx/fragment/app/f1;->b:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/e1;

    if-eqz v1, :cond_2

    iget-object v3, v1, Landroidx/fragment/app/e1;->c:Landroidx/fragment/app/d0;

    iget-object v1, v3, Landroidx/fragment/app/d0;->mTag:Ljava/lang/String;

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_3
    const/4 v3, 0x0

    :goto_1
    return-object v3
.end method

.method public final x()V
    .locals 4

    invoke-virtual {p0}, Landroidx/fragment/app/x0;->e()Ljava/util/HashSet;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/t1;

    iget-boolean v2, v1, Landroidx/fragment/app/t1;->e:Z

    if-eqz v2, :cond_0

    const-string v2, "FragmentManager"

    const/4 v3, 0x2

    invoke-static {v2, v3}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v3

    if-eqz v3, :cond_1

    const-string v3, "SpecialEffectsController: Forcing postponed operations"

    invoke-static {v2, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    const/4 v2, 0x0

    iput-boolean v2, v1, Landroidx/fragment/app/t1;->e:Z

    invoke-virtual {v1}, Landroidx/fragment/app/t1;->c()V

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final y(Landroidx/fragment/app/d0;)Landroid/view/ViewGroup;
    .locals 2

    iget-object v0, p1, Landroidx/fragment/app/d0;->mContainer:Landroid/view/ViewGroup;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget v0, p1, Landroidx/fragment/app/d0;->mContainerId:I

    const/4 v1, 0x0

    if-gtz v0, :cond_1

    return-object v1

    :cond_1
    iget-object v0, p0, Landroidx/fragment/app/x0;->u:Landroidx/fragment/app/j0;

    invoke-virtual {v0}, Landroidx/fragment/app/j0;->c()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Landroidx/fragment/app/x0;->u:Landroidx/fragment/app/j0;

    iget p1, p1, Landroidx/fragment/app/d0;->mContainerId:I

    invoke-virtual {v0, p1}, Landroidx/fragment/app/j0;->b(I)Landroid/view/View;

    move-result-object p1

    instance-of v0, p1, Landroid/view/ViewGroup;

    if-eqz v0, :cond_2

    check-cast p1, Landroid/view/ViewGroup;

    return-object p1

    :cond_2
    return-object v1
.end method

.method public final z()Landroidx/fragment/app/s0;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/x0;->v:Landroidx/fragment/app/d0;

    if-eqz v0, :cond_0

    iget-object v0, v0, Landroidx/fragment/app/d0;->mFragmentManager:Landroidx/fragment/app/x0;

    invoke-virtual {v0}, Landroidx/fragment/app/x0;->z()Landroidx/fragment/app/s0;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/x0;->x:Landroidx/fragment/app/s0;

    return-object v0
.end method
