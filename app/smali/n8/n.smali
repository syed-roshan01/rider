.class public final Ln8/n;
.super Le8/x0;


# instance fields
.field public final a:Le8/x0;

.field public b:Ln8/g;

.field public c:Z

.field public d:Le8/y;

.field public e:Le8/y0;

.field public final f:Le8/i;

.field public final synthetic g:Ln8/p;


# direct methods
.method public constructor <init>(Ln8/p;Le8/x0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln8/n;->g:Ln8/p;

    iput-object p2, p0, Ln8/n;->a:Le8/x0;

    invoke-virtual {p2}, Le8/x0;->d()Le8/i;

    move-result-object p1

    iput-object p1, p0, Ln8/n;->f:Le8/i;

    return-void
.end method


# virtual methods
.method public final b()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Ln8/n;->a:Le8/x0;

    invoke-virtual {v0}, Le8/x0;->b()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final c()Le8/c;
    .locals 5

    iget-object v0, p0, Ln8/n;->b:Ln8/g;

    iget-object v1, p0, Ln8/n;->a:Le8/x0;

    if-eqz v0, :cond_2

    invoke-virtual {v1}, Le8/x0;->c()Le8/c;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Ln8/p;->k:Le8/b;

    iget-object v2, p0, Ln8/n;->b:Ln8/g;

    new-instance v3, Ljava/util/IdentityHashMap;

    const/4 v4, 0x1

    invoke-direct {v3, v4}, Ljava/util/IdentityHashMap;-><init>(I)V

    invoke-virtual {v3, v1, v2}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, v0, Le8/c;->a:Ljava/util/IdentityHashMap;

    invoke-virtual {v0}, Ljava/util/IdentityHashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/util/IdentityHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Le8/b;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v3, v2, v1}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    new-instance v0, Le8/c;

    invoke-direct {v0, v3}, Le8/c;-><init>(Ljava/util/IdentityHashMap;)V

    return-object v0

    :cond_2
    invoke-virtual {v1}, Le8/x0;->c()Le8/c;

    move-result-object v0

    return-object v0
.end method

.method public final d()Le8/i;
    .locals 1

    iget-object v0, p0, Ln8/n;->a:Le8/x0;

    invoke-virtual {v0}, Le8/x0;->d()Le8/i;

    move-result-object v0

    return-object v0
.end method

.method public final e()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ln8/n;->a:Le8/x0;

    invoke-virtual {v0}, Le8/x0;->e()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final f()V
    .locals 1

    iget-object v0, p0, Ln8/n;->a:Le8/x0;

    invoke-virtual {v0}, Le8/x0;->f()V

    return-void
.end method

.method public final g()V
    .locals 1

    iget-object v0, p0, Ln8/n;->a:Le8/x0;

    invoke-virtual {v0}, Le8/x0;->g()V

    return-void
.end method

.method public final h(Le8/y0;)V
    .locals 2

    iput-object p1, p0, Ln8/n;->e:Le8/y0;

    new-instance v0, Lv6/d;

    const/16 v1, 0x10

    invoke-direct {v0, p0, p1, v1}, Lv6/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    iget-object p1, p0, Ln8/n;->a:Le8/x0;

    invoke-virtual {p1, v0}, Le8/x0;->h(Le8/y0;)V

    return-void
.end method

.method public final i(Ljava/util/List;)V
    .locals 6

    iget-object v0, p0, Ln8/n;->a:Le8/x0;

    invoke-virtual {v0}, Le8/x0;->b()Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Ln8/p;->g(Ljava/util/List;)Z

    move-result v1

    iget-object v2, p0, Ln8/n;->g:Ln8/p;

    const/4 v3, 0x0

    const/4 v4, 0x0

    if-eqz v1, :cond_1

    invoke-static {p1}, Ln8/p;->g(Ljava/util/List;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, v2, Ln8/p;->c:Ln8/h;

    iget-object v5, p0, Ln8/n;->b:Ln8/g;

    invoke-virtual {v1, v5}, Lr6/k;->containsValue(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Ln8/n;->b:Ln8/g;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object v3, p0, Ln8/n;->b:Ln8/g;

    iget-object v1, v1, Ln8/g;->f:Ljava/util/HashSet;

    invoke-virtual {v1, p0}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    :cond_0
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le8/g0;

    iget-object v1, v1, Le8/g0;->a:Ljava/util/List;

    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/net/SocketAddress;

    iget-object v3, v2, Ln8/p;->c:Ln8/h;

    invoke-virtual {v3, v1}, Lr6/k;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    iget-object v2, v2, Ln8/p;->c:Ln8/h;

    invoke-virtual {v2, v1}, Lr6/k;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ln8/g;

    invoke-virtual {v1, p0}, Ln8/g;->a(Ln8/n;)V

    goto/16 :goto_0

    :cond_1
    invoke-virtual {v0}, Le8/x0;->b()Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Ln8/p;->g(Ljava/util/List;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-static {p1}, Ln8/p;->g(Ljava/util/List;)Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, v2, Ln8/p;->c:Ln8/h;

    invoke-virtual {p0}, Le8/x0;->a()Le8/g0;

    move-result-object v5

    iget-object v5, v5, Le8/g0;->a:Ljava/util/List;

    invoke-interface {v5, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v1, v5}, Lr6/k;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, v2, Ln8/p;->c:Ln8/h;

    invoke-virtual {p0}, Le8/x0;->a()Le8/g0;

    move-result-object v2

    iget-object v2, v2, Le8/g0;->a:Ljava/util/List;

    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v2}, Lr6/k;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ln8/g;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object v3, p0, Ln8/n;->b:Ln8/g;

    iget-object v2, v1, Ln8/g;->f:Ljava/util/HashSet;

    invoke-virtual {v2, p0}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    iget-object v2, v1, Ln8/g;->b:Lv6/d;

    invoke-virtual {v2}, Lv6/d;->n()V

    iget-object v1, v1, Ln8/g;->c:Lv6/d;

    invoke-virtual {v1}, Lv6/d;->n()V

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, Le8/x0;->b()Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Ln8/p;->g(Ljava/util/List;)Z

    move-result v1

    if-nez v1, :cond_3

    invoke-static {p1}, Ln8/p;->g(Ljava/util/List;)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le8/g0;

    iget-object v1, v1, Le8/g0;->a:Ljava/util/List;

    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/net/SocketAddress;

    iget-object v3, v2, Ln8/p;->c:Ln8/h;

    invoke-virtual {v3, v1}, Lr6/k;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    iget-object v2, v2, Ln8/p;->c:Ln8/h;

    invoke-virtual {v2, v1}, Lr6/k;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ln8/g;

    invoke-virtual {v1, p0}, Ln8/g;->a(Ln8/n;)V

    :cond_3
    :goto_0
    invoke-virtual {v0, p1}, Le8/x0;->i(Ljava/util/List;)V

    return-void
.end method

.method public final j()V
    .locals 4

    const/4 v0, 0x1

    iput-boolean v0, p0, Ln8/n;->c:Z

    iget-object v1, p0, Ln8/n;->e:Le8/y0;

    sget-object v2, Le8/c2;->m:Le8/c2;

    invoke-virtual {v2}, Le8/c2;->e()Z

    move-result v3

    xor-int/2addr v0, v3

    const-string v3, "The error status must not be OK"

    invoke-static {v3, v0}, Ly3/e;->G(Ljava/lang/String;Z)V

    new-instance v0, Le8/y;

    sget-object v3, Le8/x;->c:Le8/x;

    invoke-direct {v0, v3, v2}, Le8/y;-><init>(Le8/x;Le8/c2;)V

    invoke-interface {v1, v0}, Le8/y0;->a(Le8/y;)V

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Ln8/n;->f:Le8/i;

    const/4 v2, 0x2

    const-string v3, "Subchannel ejected: {0}"

    invoke-virtual {v1, v2, v3, v0}, Le8/i;->b(ILjava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "OutlierDetectionSubchannel{addresses="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ln8/n;->a:Le8/x0;

    invoke-virtual {v1}, Le8/x0;->b()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
