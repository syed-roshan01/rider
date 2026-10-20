.class public final Le8/a;
.super Ljava/lang/Object;


# instance fields
.field public a:Le8/c;

.field public b:Ljava/util/IdentityHashMap;


# direct methods
.method public constructor <init>(Le8/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le8/a;->a:Le8/c;

    return-void
.end method


# virtual methods
.method public final a()Le8/c;
    .locals 4

    iget-object v0, p0, Le8/a;->b:Ljava/util/IdentityHashMap;

    if-eqz v0, :cond_2

    iget-object v0, p0, Le8/a;->a:Le8/c;

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

    iget-object v2, p0, Le8/a;->b:Ljava/util/IdentityHashMap;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/IdentityHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    iget-object v2, p0, Le8/a;->b:Ljava/util/IdentityHashMap;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Le8/b;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v2, v3, v1}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    new-instance v0, Le8/c;

    iget-object v1, p0, Le8/a;->b:Ljava/util/IdentityHashMap;

    invoke-direct {v0, v1}, Le8/c;-><init>(Ljava/util/IdentityHashMap;)V

    iput-object v0, p0, Le8/a;->a:Le8/c;

    const/4 v0, 0x0

    iput-object v0, p0, Le8/a;->b:Ljava/util/IdentityHashMap;

    :cond_2
    iget-object v0, p0, Le8/a;->a:Le8/c;

    return-object v0
.end method

.method public final b(Le8/b;)V
    .locals 2

    iget-object v0, p0, Le8/a;->a:Le8/c;

    iget-object v0, v0, Le8/c;->a:Ljava/util/IdentityHashMap;

    invoke-virtual {v0, p1}, Ljava/util/IdentityHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/util/IdentityHashMap;

    iget-object v1, p0, Le8/a;->a:Le8/c;

    iget-object v1, v1, Le8/c;->a:Ljava/util/IdentityHashMap;

    invoke-direct {v0, v1}, Ljava/util/IdentityHashMap;-><init>(Ljava/util/Map;)V

    invoke-virtual {v0, p1}, Ljava/util/IdentityHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Le8/c;

    invoke-direct {v1, v0}, Le8/c;-><init>(Ljava/util/IdentityHashMap;)V

    iput-object v1, p0, Le8/a;->a:Le8/c;

    :cond_0
    iget-object v0, p0, Le8/a;->b:Ljava/util/IdentityHashMap;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Ljava/util/IdentityHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-void
.end method

.method public final c(Le8/b;Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Le8/a;->b:Ljava/util/IdentityHashMap;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/IdentityHashMap;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/IdentityHashMap;-><init>(I)V

    iput-object v0, p0, Le8/a;->b:Ljava/util/IdentityHashMap;

    :cond_0
    iget-object v0, p0, Le8/a;->b:Ljava/util/IdentityHashMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
