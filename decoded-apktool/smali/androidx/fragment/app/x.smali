.class public final Landroidx/fragment/app/x;
.super Ljava/lang/Object;

# interfaces
.implements Lo/a;


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 3
    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Landroidx/fragment/app/x;->a:Ljava/lang/Object;

    new-instance v0, Ljava/util/WeakHashMap;

    .line 4
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 5
    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Landroidx/fragment/app/x;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroidx/fragment/app/x0;)V
    .locals 1

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Landroidx/fragment/app/x;->a:Ljava/lang/Object;

    iput-object p1, p0, Landroidx/fragment/app/x;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Landroidx/fragment/app/x;->b:Ljava/lang/Object;

    iput-object p2, p0, Landroidx/fragment/app/x;->a:Ljava/lang/Object;

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 2

    iget-object v0, p0, Landroidx/fragment/app/x;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/x0;

    iget-object v0, v0, Landroidx/fragment/app/x0;->v:Landroidx/fragment/app/d0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/fragment/app/d0;->getParentFragmentManager()Landroidx/fragment/app/x0;

    move-result-object v0

    iget-object v0, v0, Landroidx/fragment/app/x0;->l:Landroidx/fragment/app/x;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroidx/fragment/app/x;->a(Z)V

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/x;->a:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La7/a;->w(Ljava/lang/Object;)V

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    throw v0

    :cond_1
    throw v0

    :cond_2
    return-void
.end method

.method public apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    iget-object p1, p0, Landroidx/fragment/app/x;->a:Ljava/lang/Object;

    check-cast p1, Ld/i;

    return-object p1
.end method

.method public b(Z)V
    .locals 2

    iget-object v0, p0, Landroidx/fragment/app/x;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/x0;

    iget-object v1, v0, Landroidx/fragment/app/x0;->t:Landroidx/fragment/app/m0;

    iget-object v1, v1, Landroidx/fragment/app/m0;->b:Landroid/content/Context;

    iget-object v0, v0, Landroidx/fragment/app/x0;->v:Landroidx/fragment/app/d0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/fragment/app/d0;->getParentFragmentManager()Landroidx/fragment/app/x0;

    move-result-object v0

    iget-object v0, v0, Landroidx/fragment/app/x0;->l:Landroidx/fragment/app/x;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroidx/fragment/app/x;->b(Z)V

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/x;->a:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La7/a;->w(Ljava/lang/Object;)V

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    throw v0

    :cond_1
    throw v0

    :cond_2
    return-void
.end method

.method public c(Z)V
    .locals 2

    iget-object v0, p0, Landroidx/fragment/app/x;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/x0;

    iget-object v0, v0, Landroidx/fragment/app/x0;->v:Landroidx/fragment/app/d0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/fragment/app/d0;->getParentFragmentManager()Landroidx/fragment/app/x0;

    move-result-object v0

    iget-object v0, v0, Landroidx/fragment/app/x0;->l:Landroidx/fragment/app/x;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroidx/fragment/app/x;->c(Z)V

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/x;->a:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La7/a;->w(Ljava/lang/Object;)V

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    throw v0

    :cond_1
    throw v0

    :cond_2
    return-void
.end method

.method public d(Z)V
    .locals 2

    iget-object v0, p0, Landroidx/fragment/app/x;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/x0;

    iget-object v0, v0, Landroidx/fragment/app/x0;->v:Landroidx/fragment/app/d0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/fragment/app/d0;->getParentFragmentManager()Landroidx/fragment/app/x0;

    move-result-object v0

    iget-object v0, v0, Landroidx/fragment/app/x0;->l:Landroidx/fragment/app/x;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroidx/fragment/app/x;->d(Z)V

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/x;->a:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La7/a;->w(Ljava/lang/Object;)V

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    throw v0

    :cond_1
    throw v0

    :cond_2
    return-void
.end method

.method public e(Z)V
    .locals 2

    iget-object v0, p0, Landroidx/fragment/app/x;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/x0;

    iget-object v0, v0, Landroidx/fragment/app/x0;->v:Landroidx/fragment/app/d0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/fragment/app/d0;->getParentFragmentManager()Landroidx/fragment/app/x0;

    move-result-object v0

    iget-object v0, v0, Landroidx/fragment/app/x0;->l:Landroidx/fragment/app/x;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroidx/fragment/app/x;->e(Z)V

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/x;->a:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La7/a;->w(Ljava/lang/Object;)V

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    throw v0

    :cond_1
    throw v0

    :cond_2
    return-void
.end method

.method public f(Z)V
    .locals 2

    iget-object v0, p0, Landroidx/fragment/app/x;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/x0;

    iget-object v0, v0, Landroidx/fragment/app/x0;->v:Landroidx/fragment/app/d0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/fragment/app/d0;->getParentFragmentManager()Landroidx/fragment/app/x0;

    move-result-object v0

    iget-object v0, v0, Landroidx/fragment/app/x0;->l:Landroidx/fragment/app/x;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroidx/fragment/app/x;->f(Z)V

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/x;->a:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La7/a;->w(Ljava/lang/Object;)V

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    throw v0

    :cond_1
    throw v0

    :cond_2
    return-void
.end method

.method public g(Z)V
    .locals 2

    iget-object v0, p0, Landroidx/fragment/app/x;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/x0;

    iget-object v1, v0, Landroidx/fragment/app/x0;->t:Landroidx/fragment/app/m0;

    iget-object v1, v1, Landroidx/fragment/app/m0;->b:Landroid/content/Context;

    iget-object v0, v0, Landroidx/fragment/app/x0;->v:Landroidx/fragment/app/d0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/fragment/app/d0;->getParentFragmentManager()Landroidx/fragment/app/x0;

    move-result-object v0

    iget-object v0, v0, Landroidx/fragment/app/x0;->l:Landroidx/fragment/app/x;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroidx/fragment/app/x;->g(Z)V

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/x;->a:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La7/a;->w(Ljava/lang/Object;)V

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    throw v0

    :cond_1
    throw v0

    :cond_2
    return-void
.end method

.method public h(Z)V
    .locals 2

    iget-object v0, p0, Landroidx/fragment/app/x;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/x0;

    iget-object v0, v0, Landroidx/fragment/app/x0;->v:Landroidx/fragment/app/d0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/fragment/app/d0;->getParentFragmentManager()Landroidx/fragment/app/x0;

    move-result-object v0

    iget-object v0, v0, Landroidx/fragment/app/x0;->l:Landroidx/fragment/app/x;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroidx/fragment/app/x;->h(Z)V

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/x;->a:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La7/a;->w(Ljava/lang/Object;)V

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    throw v0

    :cond_1
    throw v0

    :cond_2
    return-void
.end method

.method public i(Z)V
    .locals 2

    iget-object v0, p0, Landroidx/fragment/app/x;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/x0;

    iget-object v0, v0, Landroidx/fragment/app/x0;->v:Landroidx/fragment/app/d0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/fragment/app/d0;->getParentFragmentManager()Landroidx/fragment/app/x0;

    move-result-object v0

    iget-object v0, v0, Landroidx/fragment/app/x0;->l:Landroidx/fragment/app/x;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroidx/fragment/app/x;->i(Z)V

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/x;->a:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La7/a;->w(Ljava/lang/Object;)V

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    throw v0

    :cond_1
    throw v0

    :cond_2
    return-void
.end method

.method public j(Z)V
    .locals 2

    iget-object v0, p0, Landroidx/fragment/app/x;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/x0;

    iget-object v0, v0, Landroidx/fragment/app/x0;->v:Landroidx/fragment/app/d0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/fragment/app/d0;->getParentFragmentManager()Landroidx/fragment/app/x0;

    move-result-object v0

    iget-object v0, v0, Landroidx/fragment/app/x0;->l:Landroidx/fragment/app/x;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroidx/fragment/app/x;->j(Z)V

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/x;->a:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La7/a;->w(Ljava/lang/Object;)V

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    throw v0

    :cond_1
    throw v0

    :cond_2
    return-void
.end method

.method public k(Z)V
    .locals 2

    iget-object v0, p0, Landroidx/fragment/app/x;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/x0;

    iget-object v0, v0, Landroidx/fragment/app/x0;->v:Landroidx/fragment/app/d0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/fragment/app/d0;->getParentFragmentManager()Landroidx/fragment/app/x0;

    move-result-object v0

    iget-object v0, v0, Landroidx/fragment/app/x0;->l:Landroidx/fragment/app/x;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroidx/fragment/app/x;->k(Z)V

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/x;->a:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La7/a;->w(Ljava/lang/Object;)V

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    throw v0

    :cond_1
    throw v0

    :cond_2
    return-void
.end method

.method public l(Z)V
    .locals 2

    iget-object v0, p0, Landroidx/fragment/app/x;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/x0;

    iget-object v0, v0, Landroidx/fragment/app/x0;->v:Landroidx/fragment/app/d0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/fragment/app/d0;->getParentFragmentManager()Landroidx/fragment/app/x0;

    move-result-object v0

    iget-object v0, v0, Landroidx/fragment/app/x0;->l:Landroidx/fragment/app/x;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroidx/fragment/app/x;->l(Z)V

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/x;->a:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La7/a;->w(Ljava/lang/Object;)V

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    throw v0

    :cond_1
    throw v0

    :cond_2
    return-void
.end method

.method public m(Z)V
    .locals 2

    iget-object v0, p0, Landroidx/fragment/app/x;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/x0;

    iget-object v0, v0, Landroidx/fragment/app/x0;->v:Landroidx/fragment/app/d0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/fragment/app/d0;->getParentFragmentManager()Landroidx/fragment/app/x0;

    move-result-object v0

    iget-object v0, v0, Landroidx/fragment/app/x0;->l:Landroidx/fragment/app/x;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroidx/fragment/app/x;->m(Z)V

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/x;->a:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La7/a;->w(Ljava/lang/Object;)V

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    throw v0

    :cond_1
    throw v0

    :cond_2
    return-void
.end method

.method public n(Z)V
    .locals 2

    iget-object v0, p0, Landroidx/fragment/app/x;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/x0;

    iget-object v0, v0, Landroidx/fragment/app/x0;->v:Landroidx/fragment/app/d0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/fragment/app/d0;->getParentFragmentManager()Landroidx/fragment/app/x0;

    move-result-object v0

    iget-object v0, v0, Landroidx/fragment/app/x0;->l:Landroidx/fragment/app/x;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroidx/fragment/app/x;->n(Z)V

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/x;->a:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La7/a;->w(Ljava/lang/Object;)V

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    throw v0

    :cond_1
    throw v0

    :cond_2
    return-void
.end method

.method public o(Lcom/google/android/gms/common/api/Status;Z)V
    .locals 4

    iget-object v0, p0, Landroidx/fragment/app/x;->a:Ljava/lang/Object;

    check-cast v0, Ljava/util/Map;

    monitor-enter v0

    :try_start_0
    new-instance v1, Ljava/util/HashMap;

    iget-object v2, p0, Landroidx/fragment/app/x;->a:Ljava/lang/Object;

    check-cast v2, Ljava/util/Map;

    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    iget-object v0, p0, Landroidx/fragment/app/x;->b:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ljava/util/Map;

    monitor-enter v2

    :try_start_1
    new-instance v0, Ljava/util/HashMap;

    iget-object v3, p0, Landroidx/fragment/app/x;->b:Ljava/lang/Object;

    check-cast v3, Ljava/util/Map;

    invoke-direct {v0, v3}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-virtual {v1}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    if-nez p2, :cond_0

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, La7/a;->w(Ljava/lang/Object;)V

    const/4 p1, 0x0

    throw p1

    :cond_1
    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    if-nez p2, :cond_3

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_2

    :cond_3
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/tasks/TaskCompletionSource;

    new-instance v2, Lcom/google/android/gms/common/api/g;

    invoke-direct {v2, p1}, Lcom/google/android/gms/common/api/g;-><init>(Lcom/google/android/gms/common/api/Status;)V

    invoke-virtual {v1, v2}, Lcom/google/android/gms/tasks/TaskCompletionSource;->trySetException(Ljava/lang/Exception;)Z

    goto :goto_1

    :cond_4
    return-void

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1

    :catchall_1
    move-exception p1

    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw p1
.end method
