.class public final Lcom/google/android/gms/common/api/internal/d0;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/api/j;
.implements Lcom/google/android/gms/common/api/k;


# instance fields
.field public final a:Ljava/util/LinkedList;

.field public final b:Lcom/google/android/gms/common/api/d;

.field public final c:Lcom/google/android/gms/common/api/internal/a;

.field public final d:Landroidx/fragment/app/x;

.field public final e:Ljava/util/HashSet;

.field public final f:Ljava/util/HashMap;

.field public final g:I

.field public final h:Lcom/google/android/gms/common/api/internal/o0;

.field public i:Z

.field public final j:Ljava/util/ArrayList;

.field public k:Lz5/b;

.field public l:I

.field public final synthetic m:Lcom/google/android/gms/common/api/internal/f;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/api/internal/f;Lcom/google/android/gms/common/api/i;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/d0;->m:Lcom/google/android/gms/common/api/internal/f;

    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/common/api/internal/d0;->a:Ljava/util/LinkedList;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/common/api/internal/d0;->e:Ljava/util/HashSet;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/common/api/internal/d0;->f:Ljava/util/HashMap;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/common/api/internal/d0;->j:Ljava/util/ArrayList;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/common/api/internal/d0;->k:Lz5/b;

    const/4 v1, 0x0

    iput v1, p0, Lcom/google/android/gms/common/api/internal/d0;->l:I

    iget-object v1, p1, Lcom/google/android/gms/common/api/internal/f;->n:Lcom/google/android/gms/internal/base/zaq;

    invoke-virtual {v1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-virtual {p2, v1, p0}, Lcom/google/android/gms/common/api/i;->zab(Landroid/os/Looper;Lcom/google/android/gms/common/api/internal/d0;)Lcom/google/android/gms/common/api/d;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/common/api/internal/d0;->b:Lcom/google/android/gms/common/api/d;

    invoke-virtual {p2}, Lcom/google/android/gms/common/api/i;->getApiKey()Lcom/google/android/gms/common/api/internal/a;

    move-result-object v2

    iput-object v2, p0, Lcom/google/android/gms/common/api/internal/d0;->c:Lcom/google/android/gms/common/api/internal/a;

    new-instance v2, Landroidx/fragment/app/x;

    invoke-direct {v2}, Landroidx/fragment/app/x;-><init>()V

    iput-object v2, p0, Lcom/google/android/gms/common/api/internal/d0;->d:Landroidx/fragment/app/x;

    invoke-virtual {p2}, Lcom/google/android/gms/common/api/i;->zaa()I

    move-result v2

    iput v2, p0, Lcom/google/android/gms/common/api/internal/d0;->g:I

    invoke-interface {v1}, Lcom/google/android/gms/common/api/d;->requiresSignIn()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, p1, Lcom/google/android/gms/common/api/internal/f;->n:Lcom/google/android/gms/internal/base/zaq;

    iget-object p1, p1, Lcom/google/android/gms/common/api/internal/f;->e:Landroid/content/Context;

    invoke-virtual {p2, p1, v0}, Lcom/google/android/gms/common/api/i;->zac(Landroid/content/Context;Landroid/os/Handler;)Lcom/google/android/gms/common/api/internal/o0;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/d0;->h:Lcom/google/android/gms/common/api/internal/o0;

    return-void

    :cond_0
    iput-object v0, p0, Lcom/google/android/gms/common/api/internal/d0;->h:Lcom/google/android/gms/common/api/internal/o0;

    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 3

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/d0;->m:Lcom/google/android/gms/common/api/internal/f;

    iget-object v2, v1, Lcom/google/android/gms/common/api/internal/f;->n:Lcom/google/android/gms/internal/base/zaq;

    invoke-virtual {v2}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v2

    if-ne v0, v2, :cond_0

    invoke-virtual {p0, p1}, Lcom/google/android/gms/common/api/internal/d0;->h(I)V

    return-void

    :cond_0
    iget-object v0, v1, Lcom/google/android/gms/common/api/internal/f;->n:Lcom/google/android/gms/internal/base/zaq;

    new-instance v1, Lcom/google/android/gms/common/api/internal/c0;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lcom/google/android/gms/common/api/internal/c0;-><init>(Ljava/lang/Object;II)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final b(Lz5/b;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/common/api/internal/d0;->p(Lz5/b;Ljava/lang/RuntimeException;)V

    return-void
.end method

.method public final c(Lz5/b;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/d0;->e:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La7/a;->w(Ljava/lang/Object;)V

    sget-object v0, Lz5/b;->e:Lz5/b;

    invoke-static {p1, v0}, Ly3/e;->g0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/d0;->b:Lcom/google/android/gms/common/api/d;

    invoke-interface {p1}, Lcom/google/android/gms/common/api/d;->getEndpointPackageName()Ljava/lang/String;

    :cond_0
    const/4 p1, 0x0

    throw p1

    :cond_1
    invoke-virtual {v0}, Ljava/util/HashSet;->clear()V

    return-void
.end method

.method public final d(Lcom/google/android/gms/common/api/Status;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/d0;->m:Lcom/google/android/gms/common/api/internal/f;

    iget-object v0, v0, Lcom/google/android/gms/common/api/internal/f;->n:Lcom/google/android/gms/internal/base/zaq;

    invoke-static {v0}, Lf6/a;->s(Lcom/google/android/gms/internal/base/zaq;)V

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v0, v1}, Lcom/google/android/gms/common/api/internal/d0;->e(Lcom/google/android/gms/common/api/Status;Ljava/lang/RuntimeException;Z)V

    return-void
.end method

.method public final e(Lcom/google/android/gms/common/api/Status;Ljava/lang/RuntimeException;Z)V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/d0;->m:Lcom/google/android/gms/common/api/internal/f;

    iget-object v0, v0, Lcom/google/android/gms/common/api/internal/f;->n:Lcom/google/android/gms/internal/base/zaq;

    invoke-static {v0}, Lf6/a;->s(Lcom/google/android/gms/internal/base/zaq;)V

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    move v2, v1

    goto :goto_0

    :cond_0
    move v2, v0

    :goto_0
    if-eqz p2, :cond_1

    move v0, v1

    :cond_1
    if-eq v2, v0, :cond_6

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/d0;->a:Ljava/util/LinkedList;

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/common/api/internal/t0;

    if-eqz p3, :cond_3

    iget v2, v1, Lcom/google/android/gms/common/api/internal/t0;->a:I

    const/4 v3, 0x2

    if-ne v2, v3, :cond_2

    :cond_3
    if-eqz p1, :cond_4

    invoke-virtual {v1, p1}, Lcom/google/android/gms/common/api/internal/t0;->a(Lcom/google/android/gms/common/api/Status;)V

    goto :goto_2

    :cond_4
    invoke-virtual {v1, p2}, Lcom/google/android/gms/common/api/internal/t0;->b(Ljava/lang/RuntimeException;)V

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    goto :goto_1

    :cond_5
    return-void

    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Status XOR exception should be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final f()V
    .locals 6

    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/d0;->a:Ljava/util/LinkedList;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_2

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/android/gms/common/api/internal/t0;

    iget-object v5, p0, Lcom/google/android/gms/common/api/internal/d0;->b:Lcom/google/android/gms/common/api/d;

    invoke-interface {v5}, Lcom/google/android/gms/common/api/d;->isConnected()Z

    move-result v5

    if-nez v5, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p0, v4}, Lcom/google/android/gms/common/api/internal/d0;->k(Lcom/google/android/gms/common/api/internal/t0;)Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-virtual {v1, v4}, Ljava/util/LinkedList;->remove(Ljava/lang/Object;)Z

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method

.method public final g()V
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/d0;->m:Lcom/google/android/gms/common/api/internal/f;

    iget-object v1, v0, Lcom/google/android/gms/common/api/internal/f;->n:Lcom/google/android/gms/internal/base/zaq;

    invoke-static {v1}, Lf6/a;->s(Lcom/google/android/gms/internal/base/zaq;)V

    const/4 v1, 0x0

    iput-object v1, p0, Lcom/google/android/gms/common/api/internal/d0;->k:Lz5/b;

    sget-object v2, Lz5/b;->e:Lz5/b;

    invoke-virtual {p0, v2}, Lcom/google/android/gms/common/api/internal/d0;->c(Lz5/b;)V

    iget-boolean v2, p0, Lcom/google/android/gms/common/api/internal/d0;->i:Z

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcom/google/android/gms/common/api/internal/f;->n:Lcom/google/android/gms/internal/base/zaq;

    const/16 v3, 0xb

    iget-object v4, p0, Lcom/google/android/gms/common/api/internal/d0;->c:Lcom/google/android/gms/common/api/internal/a;

    invoke-virtual {v2, v3, v4}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    iget-object v0, v0, Lcom/google/android/gms/common/api/internal/f;->n:Lcom/google/android/gms/internal/base/zaq;

    const/16 v2, 0x9

    invoke-virtual {v0, v2, v4}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/common/api/internal/d0;->i:Z

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/d0;->f:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_1

    invoke-virtual {p0}, Lcom/google/android/gms/common/api/internal/d0;->f()V

    invoke-virtual {p0}, Lcom/google/android/gms/common/api/internal/d0;->i()V

    return-void

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La7/a;->w(Ljava/lang/Object;)V

    throw v1
.end method

.method public final h(I)V
    .locals 7

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/d0;->m:Lcom/google/android/gms/common/api/internal/f;

    iget-object v1, v0, Lcom/google/android/gms/common/api/internal/f;->n:Lcom/google/android/gms/internal/base/zaq;

    invoke-static {v1}, Lf6/a;->s(Lcom/google/android/gms/internal/base/zaq;)V

    const/4 v1, 0x0

    iput-object v1, p0, Lcom/google/android/gms/common/api/internal/d0;->k:Lz5/b;

    const/4 v2, 0x1

    iput-boolean v2, p0, Lcom/google/android/gms/common/api/internal/d0;->i:Z

    iget-object v3, p0, Lcom/google/android/gms/common/api/internal/d0;->b:Lcom/google/android/gms/common/api/d;

    invoke-interface {v3}, Lcom/google/android/gms/common/api/d;->getLastDisconnectMessage()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lcom/google/android/gms/common/api/internal/d0;->d:Landroidx/fragment/app/x;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "The connection to Google Play services was lost"

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    if-ne p1, v2, :cond_0

    const-string p1, " due to service disconnection."

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    const/4 v6, 0x3

    if-ne p1, v6, :cond_1

    const-string p1, " due to dead object exception."

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    :goto_0
    if-eqz v3, :cond_2

    const-string p1, " Last reason for disconnect: "

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2
    new-instance p1, Lcom/google/android/gms/common/api/Status;

    const/16 v3, 0x14

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {p1, v3, v5}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;)V

    invoke-virtual {v4, p1, v2}, Landroidx/fragment/app/x;->o(Lcom/google/android/gms/common/api/Status;Z)V

    iget-object p1, v0, Lcom/google/android/gms/common/api/internal/f;->n:Lcom/google/android/gms/internal/base/zaq;

    const/16 v2, 0x9

    iget-object v3, p0, Lcom/google/android/gms/common/api/internal/d0;->c:Lcom/google/android/gms/common/api/internal/a;

    invoke-static {p1, v2, v3}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v2

    const-wide/16 v4, 0x1388

    invoke-virtual {p1, v2, v4, v5}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    iget-object p1, v0, Lcom/google/android/gms/common/api/internal/f;->n:Lcom/google/android/gms/internal/base/zaq;

    const/16 v2, 0xb

    invoke-static {p1, v2, v3}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v2

    const-wide/32 v3, 0x1d4c0

    invoke-virtual {p1, v2, v3, v4}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    iget-object p1, v0, Lcom/google/android/gms/common/api/internal/f;->g:Ll/t;

    iget-object p1, p1, Ll/t;->b:Ljava/lang/Object;

    check-cast p1, Landroid/util/SparseIntArray;

    invoke-virtual {p1}, Landroid/util/SparseIntArray;->clear()V

    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/d0;->f:Ljava/util/HashMap;

    invoke-virtual {p1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_3

    return-void

    :cond_3
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, La7/a;->w(Ljava/lang/Object;)V

    throw v1
.end method

.method public final i()V
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/d0;->m:Lcom/google/android/gms/common/api/internal/f;

    iget-object v1, v0, Lcom/google/android/gms/common/api/internal/f;->n:Lcom/google/android/gms/internal/base/zaq;

    const/16 v2, 0xc

    iget-object v3, p0, Lcom/google/android/gms/common/api/internal/d0;->c:Lcom/google/android/gms/common/api/internal/a;

    invoke-virtual {v1, v2, v3}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    iget-object v1, v0, Lcom/google/android/gms/common/api/internal/f;->n:Lcom/google/android/gms/internal/base/zaq;

    invoke-virtual {v1, v2, v3}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v2

    iget-wide v3, v0, Lcom/google/android/gms/common/api/internal/f;->a:J

    invoke-virtual {v1, v2, v3, v4}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    return-void
.end method

.method public final j()V
    .locals 3

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/d0;->m:Lcom/google/android/gms/common/api/internal/f;

    iget-object v2, v1, Lcom/google/android/gms/common/api/internal/f;->n:Lcom/google/android/gms/internal/base/zaq;

    invoke-virtual {v2}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v2

    if-ne v0, v2, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/common/api/internal/d0;->g()V

    return-void

    :cond_0
    iget-object v0, v1, Lcom/google/android/gms/common/api/internal/f;->n:Lcom/google/android/gms/internal/base/zaq;

    new-instance v1, Lcom/google/android/gms/common/api/internal/n0;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v2}, Lcom/google/android/gms/common/api/internal/n0;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final k(Lcom/google/android/gms/common/api/internal/t0;)Z
    .locals 14

    instance-of v0, p1, Lcom/google/android/gms/common/api/internal/j0;

    const-string v1, "DeadObjectException thrown while running ApiCallRunner."

    const/4 v2, 0x1

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/d0;->b:Lcom/google/android/gms/common/api/d;

    invoke-interface {v0}, Lcom/google/android/gms/common/api/d;->requiresSignIn()Z

    move-result v3

    iget-object v4, p0, Lcom/google/android/gms/common/api/internal/d0;->d:Landroidx/fragment/app/x;

    invoke-virtual {p1, v4, v3}, Lcom/google/android/gms/common/api/internal/t0;->d(Landroidx/fragment/app/x;Z)V

    :try_start_0
    invoke-virtual {p1, p0}, Lcom/google/android/gms/common/api/internal/t0;->c(Lcom/google/android/gms/common/api/internal/d0;)V
    :try_end_0
    .catch Landroid/os/DeadObjectException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    invoke-virtual {p0, v2}, Lcom/google/android/gms/common/api/internal/d0;->a(I)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/common/api/d;->disconnect(Ljava/lang/String;)V

    :goto_0
    return v2

    :cond_0
    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/common/api/internal/j0;

    invoke-virtual {v0, p0}, Lcom/google/android/gms/common/api/internal/j0;->g(Lcom/google/android/gms/common/api/internal/d0;)[Lz5/d;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    if-eqz v3, :cond_5

    array-length v6, v3

    if-nez v6, :cond_1

    goto :goto_3

    :cond_1
    iget-object v6, p0, Lcom/google/android/gms/common/api/internal/d0;->b:Lcom/google/android/gms/common/api/d;

    invoke-interface {v6}, Lcom/google/android/gms/common/api/d;->getAvailableFeatures()[Lz5/d;

    move-result-object v6

    if-nez v6, :cond_2

    new-array v6, v4, [Lz5/d;

    :cond_2
    array-length v7, v6

    new-instance v8, Lq/f;

    invoke-direct {v8, v7}, Lq/z;-><init>(I)V

    move v9, v4

    :goto_1
    if-ge v9, v7, :cond_3

    aget-object v10, v6, v9

    iget-object v11, v10, Lz5/d;->a:Ljava/lang/String;

    invoke-virtual {v10}, Lz5/d;->e()J

    move-result-wide v12

    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v10

    invoke-virtual {v8, v11, v10}, Lq/z;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    :cond_3
    array-length v6, v3

    move v7, v4

    :goto_2
    if-ge v7, v6, :cond_5

    aget-object v9, v3, v7

    iget-object v10, v9, Lz5/d;->a:Ljava/lang/String;

    invoke-virtual {v8, v10}, Lq/f;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Long;

    if-eqz v10, :cond_6

    invoke-virtual {v10}, Ljava/lang/Long;->longValue()J

    move-result-wide v10

    invoke-virtual {v9}, Lz5/d;->e()J

    move-result-wide v12

    cmp-long v10, v10, v12

    if-gez v10, :cond_4

    goto :goto_4

    :cond_4
    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    :cond_5
    :goto_3
    move-object v9, v5

    :cond_6
    :goto_4
    if-nez v9, :cond_7

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/d0;->b:Lcom/google/android/gms/common/api/d;

    invoke-interface {v0}, Lcom/google/android/gms/common/api/d;->requiresSignIn()Z

    move-result v3

    iget-object v4, p0, Lcom/google/android/gms/common/api/internal/d0;->d:Landroidx/fragment/app/x;

    invoke-virtual {p1, v4, v3}, Lcom/google/android/gms/common/api/internal/t0;->d(Landroidx/fragment/app/x;Z)V

    :try_start_1
    invoke-virtual {p1, p0}, Lcom/google/android/gms/common/api/internal/t0;->c(Lcom/google/android/gms/common/api/internal/d0;)V
    :try_end_1
    .catch Landroid/os/DeadObjectException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_5

    :catch_1
    invoke-virtual {p0, v2}, Lcom/google/android/gms/common/api/internal/d0;->a(I)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/common/api/d;->disconnect(Ljava/lang/String;)V

    :goto_5
    return v2

    :cond_7
    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/d0;->b:Lcom/google/android/gms/common/api/d;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    iget-object v1, v9, Lz5/d;->a:Ljava/lang/String;

    invoke-virtual {v9}, Lz5/d;->e()J

    move-result-wide v6

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v8

    new-instance v10, Ljava/lang/StringBuilder;

    add-int/lit8 v3, v3, 0x4d

    add-int/2addr v3, v8

    invoke-direct {v10, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v10, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " could not execute call because it requires feature ("

    invoke-virtual {v10, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ", "

    invoke-virtual {v10, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p1, ")."

    invoke-virtual {v10, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "GoogleApiManager"

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/d0;->m:Lcom/google/android/gms/common/api/internal/f;

    iget-boolean p1, p1, Lcom/google/android/gms/common/api/internal/f;->o:Z

    if-eqz p1, :cond_a

    invoke-virtual {v0, p0}, Lcom/google/android/gms/common/api/internal/j0;->f(Lcom/google/android/gms/common/api/internal/d0;)Z

    move-result p1

    if-eqz p1, :cond_a

    new-instance p1, Lcom/google/android/gms/common/api/internal/e0;

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/d0;->c:Lcom/google/android/gms/common/api/internal/a;

    invoke-direct {p1, v0, v9}, Lcom/google/android/gms/common/api/internal/e0;-><init>(Lcom/google/android/gms/common/api/internal/a;Lz5/d;)V

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/d0;->j:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v0

    const-wide/16 v1, 0x1388

    const/16 v3, 0xf

    if-ltz v0, :cond_8

    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/d0;->j:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/common/api/internal/e0;

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/d0;->m:Lcom/google/android/gms/common/api/internal/f;

    iget-object v0, v0, Lcom/google/android/gms/common/api/internal/f;->n:Lcom/google/android/gms/internal/base/zaq;

    invoke-virtual {v0, v3, p1}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/d0;->m:Lcom/google/android/gms/common/api/internal/f;

    iget-object v0, v0, Lcom/google/android/gms/common/api/internal/f;->n:Lcom/google/android/gms/internal/base/zaq;

    invoke-static {v0, v3, p1}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    iget-object v3, p0, Lcom/google/android/gms/common/api/internal/d0;->m:Lcom/google/android/gms/common/api/internal/f;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0, p1, v1, v2}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    goto :goto_6

    :cond_8
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/d0;->j:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/d0;->m:Lcom/google/android/gms/common/api/internal/f;

    iget-object v0, v0, Lcom/google/android/gms/common/api/internal/f;->n:Lcom/google/android/gms/internal/base/zaq;

    invoke-static {v0, v3, p1}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v3

    iget-object v6, p0, Lcom/google/android/gms/common/api/internal/d0;->m:Lcom/google/android/gms/common/api/internal/f;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0, v3, v1, v2}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/d0;->m:Lcom/google/android/gms/common/api/internal/f;

    iget-object v0, v0, Lcom/google/android/gms/common/api/internal/f;->n:Lcom/google/android/gms/internal/base/zaq;

    const/16 v1, 0x10

    invoke-static {v0, v1, p1}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/d0;->m:Lcom/google/android/gms/common/api/internal/f;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-wide/32 v1, 0x1d4c0

    invoke-virtual {v0, p1, v1, v2}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    new-instance p1, Lz5/b;

    const/4 v0, 0x2

    invoke-direct {p1, v0, v5}, Lz5/b;-><init>(ILandroid/app/PendingIntent;)V

    invoke-virtual {p0, p1}, Lcom/google/android/gms/common/api/internal/d0;->l(Lz5/b;)Z

    move-result v0

    if-nez v0, :cond_9

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/d0;->m:Lcom/google/android/gms/common/api/internal/f;

    iget v1, p0, Lcom/google/android/gms/common/api/internal/d0;->g:I

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/common/api/internal/f;->c(Lz5/b;I)Z

    :cond_9
    :goto_6
    return v4

    :cond_a
    new-instance p1, Lcom/google/android/gms/common/api/n;

    invoke-direct {p1, v9}, Lcom/google/android/gms/common/api/n;-><init>(Lz5/d;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/common/api/internal/t0;->b(Ljava/lang/RuntimeException;)V

    return v2
.end method

.method public final l(Lz5/b;)Z
    .locals 5

    sget-object v0, Lcom/google/android/gms/common/api/internal/f;->r:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/d0;->m:Lcom/google/android/gms/common/api/internal/f;

    iget-object v2, v1, Lcom/google/android/gms/common/api/internal/f;->k:Lcom/google/android/gms/common/api/internal/x;

    const/4 v3, 0x0

    if-eqz v2, :cond_2

    iget-object v1, v1, Lcom/google/android/gms/common/api/internal/f;->l:Lq/g;

    iget-object v2, p0, Lcom/google/android/gms/common/api/internal/d0;->c:Lcom/google/android/gms/common/api/internal/a;

    invoke-virtual {v1, v2}, Lq/g;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/d0;->m:Lcom/google/android/gms/common/api/internal/f;

    iget-object v1, v1, Lcom/google/android/gms/common/api/internal/f;->k:Lcom/google/android/gms/common/api/internal/x;

    iget v2, p0, Lcom/google/android/gms/common/api/internal/d0;->g:I

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v4, Lcom/google/android/gms/common/api/internal/u0;

    invoke-direct {v4, p1, v2}, Lcom/google/android/gms/common/api/internal/u0;-><init>(Lz5/b;I)V

    iget-object p1, v1, Lcom/google/android/gms/common/api/internal/x;->b:Ljava/util/concurrent/atomic/AtomicReference;

    :cond_0
    const/4 v2, 0x0

    invoke-virtual {p1, v2, v4}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object p1, v1, Lcom/google/android/gms/common/api/internal/x;->c:Lcom/google/android/gms/internal/base/zaq;

    new-instance v2, Lcom/google/android/gms/common/api/internal/v0;

    invoke-direct {v2, v3, v1, v4}, Lcom/google/android/gms/common/api/internal/v0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_0

    :goto_0
    monitor-exit v0

    const/4 p1, 0x1

    return p1

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_2
    monitor-exit v0

    return v3

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final m(Z)Z
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/d0;->m:Lcom/google/android/gms/common/api/internal/f;

    iget-object v0, v0, Lcom/google/android/gms/common/api/internal/f;->n:Lcom/google/android/gms/internal/base/zaq;

    invoke-static {v0}, Lf6/a;->s(Lcom/google/android/gms/internal/base/zaq;)V

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/d0;->b:Lcom/google/android/gms/common/api/d;

    invoke-interface {v0}, Lcom/google/android/gms/common/api/d;->isConnected()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/d0;->f:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->size()I

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/d0;->d:Landroidx/fragment/app/x;

    iget-object v3, v1, Landroidx/fragment/app/x;->a:Ljava/lang/Object;

    check-cast v3, Ljava/util/Map;

    invoke-interface {v3}, Ljava/util/Map;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_1

    iget-object v1, v1, Landroidx/fragment/app/x;->b:Ljava/lang/Object;

    check-cast v1, Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const-string p1, "Timing out service connection."

    invoke-interface {v0, p1}, Lcom/google/android/gms/common/api/d;->disconnect(Ljava/lang/String;)V

    const/4 p1, 0x1

    return p1

    :cond_1
    :goto_0
    if-eqz p1, :cond_2

    invoke-virtual {p0}, Lcom/google/android/gms/common/api/internal/d0;->i()V

    :cond_2
    return v2
.end method

.method public final n()V
    .locals 12

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/d0;->m:Lcom/google/android/gms/common/api/internal/f;

    iget-object v1, v0, Lcom/google/android/gms/common/api/internal/f;->n:Lcom/google/android/gms/internal/base/zaq;

    invoke-static {v1}, Lf6/a;->s(Lcom/google/android/gms/internal/base/zaq;)V

    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/d0;->b:Lcom/google/android/gms/common/api/d;

    invoke-interface {v1}, Lcom/google/android/gms/common/api/d;->isConnected()Z

    move-result v2

    if-nez v2, :cond_6

    invoke-interface {v1}, Lcom/google/android/gms/common/api/d;->isConnecting()Z

    move-result v2

    if-eqz v2, :cond_0

    goto/16 :goto_3

    :cond_0
    const/16 v2, 0xa

    :try_start_0
    iget-object v3, v0, Lcom/google/android/gms/common/api/internal/f;->g:Ll/t;

    iget-object v4, v0, Lcom/google/android/gms/common/api/internal/f;->e:Landroid/content/Context;

    invoke-virtual {v3, v4, v1}, Ll/t;->h(Landroid/content/Context;Lcom/google/android/gms/common/api/d;)I

    move-result v3

    if-eqz v3, :cond_1

    new-instance v0, Lz5/b;

    const/4 v4, 0x0

    invoke-direct {v0, v3, v4}, Lz5/b;-><init>(ILandroid/app/PendingIntent;)V

    const-string v3, "GoogleApiManager"

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Lz5/b;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v6

    add-int/lit8 v6, v6, 0x23

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v7

    add-int/2addr v6, v7

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7, v6}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v6, "The service for "

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " is not available: "

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0, v0, v4}, Lcom/google/android/gms/common/api/internal/d0;->p(Lz5/b;Ljava/lang/RuntimeException;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    goto :goto_2

    :cond_1
    new-instance v3, Lcom/google/android/gms/common/api/internal/f0;

    iget-object v4, p0, Lcom/google/android/gms/common/api/internal/d0;->c:Lcom/google/android/gms/common/api/internal/a;

    invoke-direct {v3, v0, v1, v4}, Lcom/google/android/gms/common/api/internal/f0;-><init>(Lcom/google/android/gms/common/api/internal/f;Lcom/google/android/gms/common/api/d;Lcom/google/android/gms/common/api/internal/a;)V

    invoke-interface {v1}, Lcom/google/android/gms/common/api/d;->requiresSignIn()Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/d0;->h:Lcom/google/android/gms/common/api/internal/o0;

    invoke-static {v0}, Lf6/a;->x(Ljava/lang/Object;)V

    iget-object v4, v0, Lcom/google/android/gms/common/api/internal/o0;->f:Lm6/c;

    if-eqz v4, :cond_2

    invoke-interface {v4}, Lcom/google/android/gms/common/api/d;->disconnect()V

    :cond_2
    invoke-static {v0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    iget-object v7, v0, Lcom/google/android/gms/common/api/internal/o0;->e:Lcom/google/android/gms/common/internal/h;

    iput-object v4, v7, Lcom/google/android/gms/common/internal/h;->g:Ljava/lang/Integer;

    iget-object v4, v0, Lcom/google/android/gms/common/api/internal/o0;->c:Lw5/b;

    iget-object v5, v0, Lcom/google/android/gms/common/api/internal/o0;->a:Landroid/content/Context;

    iget-object v11, v0, Lcom/google/android/gms/common/api/internal/o0;->b:Landroid/os/Handler;

    invoke-virtual {v11}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v6

    iget-object v8, v7, Lcom/google/android/gms/common/internal/h;->f:Lm6/a;

    move-object v9, v0

    move-object v10, v0

    invoke-virtual/range {v4 .. v10}, Lw5/b;->buildClient(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/internal/h;Ljava/lang/Object;Lcom/google/android/gms/common/api/j;Lcom/google/android/gms/common/api/k;)Lcom/google/android/gms/common/api/d;

    move-result-object v4

    iput-object v4, v0, Lcom/google/android/gms/common/api/internal/o0;->f:Lm6/c;

    iput-object v3, v0, Lcom/google/android/gms/common/api/internal/o0;->g:Lcom/google/android/gms/common/api/internal/f0;

    iget-object v4, v0, Lcom/google/android/gms/common/api/internal/o0;->d:Ljava/util/Set;

    if-eqz v4, :cond_4

    invoke-interface {v4}, Ljava/util/Set;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_3

    goto :goto_0

    :cond_3
    iget-object v0, v0, Lcom/google/android/gms/common/api/internal/o0;->f:Lm6/c;

    invoke-interface {v0}, Lm6/c;->b()V

    goto :goto_1

    :cond_4
    :goto_0
    new-instance v4, Lcom/google/android/gms/common/api/internal/n0;

    const/4 v5, 0x0

    invoke-direct {v4, v0, v5}, Lcom/google/android/gms/common/api/internal/n0;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v11, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_5
    :goto_1
    :try_start_1
    invoke-interface {v1, v3}, Lcom/google/android/gms/common/api/d;->connect(Lcom/google/android/gms/common/internal/d;)V
    :try_end_1
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_1

    return-void

    :catch_1
    move-exception v0

    new-instance v1, Lz5/b;

    invoke-direct {v1, v2}, Lz5/b;-><init>(I)V

    invoke-virtual {p0, v1, v0}, Lcom/google/android/gms/common/api/internal/d0;->p(Lz5/b;Ljava/lang/RuntimeException;)V

    return-void

    :goto_2
    new-instance v1, Lz5/b;

    invoke-direct {v1, v2}, Lz5/b;-><init>(I)V

    invoke-virtual {p0, v1, v0}, Lcom/google/android/gms/common/api/internal/d0;->p(Lz5/b;Ljava/lang/RuntimeException;)V

    :cond_6
    :goto_3
    return-void
.end method

.method public final o(Lcom/google/android/gms/common/api/internal/t0;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/d0;->m:Lcom/google/android/gms/common/api/internal/f;

    iget-object v0, v0, Lcom/google/android/gms/common/api/internal/f;->n:Lcom/google/android/gms/internal/base/zaq;

    invoke-static {v0}, Lf6/a;->s(Lcom/google/android/gms/internal/base/zaq;)V

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/d0;->b:Lcom/google/android/gms/common/api/d;

    invoke-interface {v0}, Lcom/google/android/gms/common/api/d;->isConnected()Z

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/d0;->a:Ljava/util/LinkedList;

    if-eqz v0, :cond_1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/common/api/internal/d0;->k(Lcom/google/android/gms/common/api/internal/t0;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/common/api/internal/d0;->i()V

    return-void

    :cond_0
    invoke-virtual {v1, p1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_1
    invoke-virtual {v1, p1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/d0;->k:Lz5/b;

    if-eqz p1, :cond_2

    iget v0, p1, Lz5/b;->b:I

    if-eqz v0, :cond_2

    iget-object v0, p1, Lz5/b;->c:Landroid/app/PendingIntent;

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/common/api/internal/d0;->p(Lz5/b;Ljava/lang/RuntimeException;)V

    return-void

    :cond_2
    invoke-virtual {p0}, Lcom/google/android/gms/common/api/internal/d0;->n()V

    return-void
.end method

.method public final p(Lz5/b;Ljava/lang/RuntimeException;)V
    .locals 6

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/d0;->m:Lcom/google/android/gms/common/api/internal/f;

    iget-object v0, v0, Lcom/google/android/gms/common/api/internal/f;->n:Lcom/google/android/gms/internal/base/zaq;

    invoke-static {v0}, Lf6/a;->s(Lcom/google/android/gms/internal/base/zaq;)V

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/d0;->h:Lcom/google/android/gms/common/api/internal/o0;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lcom/google/android/gms/common/api/internal/o0;->f:Lm6/c;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/google/android/gms/common/api/d;->disconnect()V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/d0;->m:Lcom/google/android/gms/common/api/internal/f;

    iget-object v0, v0, Lcom/google/android/gms/common/api/internal/f;->n:Lcom/google/android/gms/internal/base/zaq;

    invoke-static {v0}, Lf6/a;->s(Lcom/google/android/gms/internal/base/zaq;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/common/api/internal/d0;->k:Lz5/b;

    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/d0;->m:Lcom/google/android/gms/common/api/internal/f;

    iget-object v1, v1, Lcom/google/android/gms/common/api/internal/f;->g:Ll/t;

    iget-object v1, v1, Ll/t;->b:Ljava/lang/Object;

    check-cast v1, Landroid/util/SparseIntArray;

    invoke-virtual {v1}, Landroid/util/SparseIntArray;->clear()V

    invoke-virtual {p0, p1}, Lcom/google/android/gms/common/api/internal/d0;->c(Lz5/b;)V

    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/d0;->b:Lcom/google/android/gms/common/api/d;

    instance-of v1, v1, Lb6/c;

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    iget v1, p1, Lz5/b;->b:I

    const/16 v3, 0x18

    if-eq v1, v3, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/d0;->m:Lcom/google/android/gms/common/api/internal/f;

    iput-boolean v2, v1, Lcom/google/android/gms/common/api/internal/f;->b:Z

    iget-object v1, v1, Lcom/google/android/gms/common/api/internal/f;->n:Lcom/google/android/gms/internal/base/zaq;

    const/16 v3, 0x13

    invoke-virtual {v1, v3}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v3

    const-wide/32 v4, 0x493e0

    invoke-virtual {v1, v3, v4, v5}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    :cond_1
    iget v1, p1, Lz5/b;->b:I

    const/4 v3, 0x4

    if-ne v1, v3, :cond_2

    sget-object p1, Lcom/google/android/gms/common/api/internal/f;->q:Lcom/google/android/gms/common/api/Status;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/common/api/internal/d0;->d(Lcom/google/android/gms/common/api/Status;)V

    return-void

    :cond_2
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/d0;->a:Ljava/util/LinkedList;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_3

    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/d0;->k:Lz5/b;

    return-void

    :cond_3
    if-eqz p2, :cond_4

    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/d0;->m:Lcom/google/android/gms/common/api/internal/f;

    iget-object p1, p1, Lcom/google/android/gms/common/api/internal/f;->n:Lcom/google/android/gms/internal/base/zaq;

    invoke-static {p1}, Lf6/a;->s(Lcom/google/android/gms/internal/base/zaq;)V

    const/4 p1, 0x0

    invoke-virtual {p0, v0, p2, p1}, Lcom/google/android/gms/common/api/internal/d0;->e(Lcom/google/android/gms/common/api/Status;Ljava/lang/RuntimeException;Z)V

    return-void

    :cond_4
    iget-object p2, p0, Lcom/google/android/gms/common/api/internal/d0;->m:Lcom/google/android/gms/common/api/internal/f;

    iget-boolean p2, p2, Lcom/google/android/gms/common/api/internal/f;->o:Z

    if-eqz p2, :cond_a

    iget-object p2, p0, Lcom/google/android/gms/common/api/internal/d0;->c:Lcom/google/android/gms/common/api/internal/a;

    invoke-static {p2, p1}, Lcom/google/android/gms/common/api/internal/f;->d(Lcom/google/android/gms/common/api/internal/a;Lz5/b;)Lcom/google/android/gms/common/api/Status;

    move-result-object p2

    invoke-virtual {p0, p2, v0, v2}, Lcom/google/android/gms/common/api/internal/d0;->e(Lcom/google/android/gms/common/api/Status;Ljava/lang/RuntimeException;Z)V

    iget-object p2, p0, Lcom/google/android/gms/common/api/internal/d0;->a:Ljava/util/LinkedList;

    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_5

    return-void

    :cond_5
    invoke-virtual {p0, p1}, Lcom/google/android/gms/common/api/internal/d0;->l(Lz5/b;)Z

    move-result p2

    if-eqz p2, :cond_6

    return-void

    :cond_6
    iget-object p2, p0, Lcom/google/android/gms/common/api/internal/d0;->m:Lcom/google/android/gms/common/api/internal/f;

    iget v0, p0, Lcom/google/android/gms/common/api/internal/d0;->g:I

    invoke-virtual {p2, p1, v0}, Lcom/google/android/gms/common/api/internal/f;->c(Lz5/b;I)Z

    move-result p2

    if-nez p2, :cond_9

    iget p2, p1, Lz5/b;->b:I

    const/16 v0, 0x12

    if-ne p2, v0, :cond_7

    iput-boolean v2, p0, Lcom/google/android/gms/common/api/internal/d0;->i:Z

    :cond_7
    iget-boolean p2, p0, Lcom/google/android/gms/common/api/internal/d0;->i:Z

    if-eqz p2, :cond_8

    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/d0;->m:Lcom/google/android/gms/common/api/internal/f;

    iget-object p1, p1, Lcom/google/android/gms/common/api/internal/f;->n:Lcom/google/android/gms/internal/base/zaq;

    const/16 p2, 0x9

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/d0;->c:Lcom/google/android/gms/common/api/internal/a;

    invoke-static {p1, p2, v0}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p2

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/d0;->m:Lcom/google/android/gms/common/api/internal/f;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-wide/16 v0, 0x1388

    invoke-virtual {p1, p2, v0, v1}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    return-void

    :cond_8
    iget-object p2, p0, Lcom/google/android/gms/common/api/internal/d0;->c:Lcom/google/android/gms/common/api/internal/a;

    invoke-static {p2, p1}, Lcom/google/android/gms/common/api/internal/f;->d(Lcom/google/android/gms/common/api/internal/a;Lz5/b;)Lcom/google/android/gms/common/api/Status;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/common/api/internal/d0;->d(Lcom/google/android/gms/common/api/Status;)V

    :cond_9
    return-void

    :cond_a
    iget-object p2, p0, Lcom/google/android/gms/common/api/internal/d0;->c:Lcom/google/android/gms/common/api/internal/a;

    invoke-static {p2, p1}, Lcom/google/android/gms/common/api/internal/f;->d(Lcom/google/android/gms/common/api/internal/a;Lz5/b;)Lcom/google/android/gms/common/api/Status;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/common/api/internal/d0;->d(Lcom/google/android/gms/common/api/Status;)V

    return-void
.end method

.method public final q()V
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/d0;->m:Lcom/google/android/gms/common/api/internal/f;

    iget-object v0, v0, Lcom/google/android/gms/common/api/internal/f;->n:Lcom/google/android/gms/internal/base/zaq;

    invoke-static {v0}, Lf6/a;->s(Lcom/google/android/gms/internal/base/zaq;)V

    sget-object v0, Lcom/google/android/gms/common/api/internal/f;->p:Lcom/google/android/gms/common/api/Status;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/common/api/internal/d0;->d(Lcom/google/android/gms/common/api/Status;)V

    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/d0;->d:Landroidx/fragment/app/x;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Landroidx/fragment/app/x;->o(Lcom/google/android/gms/common/api/Status;Z)V

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/d0;->f:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    new-array v1, v2, [Lcom/google/android/gms/common/api/internal/k;

    invoke-interface {v0, v1}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/android/gms/common/api/internal/k;

    array-length v1, v0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    new-instance v3, Lcom/google/android/gms/common/api/internal/r0;

    new-instance v4, Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-direct {v4}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    invoke-direct {v3, v4}, Lcom/google/android/gms/common/api/internal/r0;-><init>(Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    invoke-virtual {p0, v3}, Lcom/google/android/gms/common/api/internal/d0;->o(Lcom/google/android/gms/common/api/internal/t0;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    new-instance v0, Lz5/b;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lz5/b;-><init>(I)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/common/api/internal/d0;->c(Lz5/b;)V

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/d0;->b:Lcom/google/android/gms/common/api/d;

    invoke-interface {v0}, Lcom/google/android/gms/common/api/d;->isConnected()Z

    move-result v1

    if-eqz v1, :cond_1

    new-instance v1, Lcom/google/android/gms/common/api/internal/z;

    invoke-direct {v1, p0}, Lcom/google/android/gms/common/api/internal/z;-><init>(Lcom/google/android/gms/common/api/internal/d0;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/common/api/d;->onUserSignOut(Lcom/google/android/gms/common/internal/e;)V

    :cond_1
    return-void
.end method
