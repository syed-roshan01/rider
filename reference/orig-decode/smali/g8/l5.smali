.class public final Lg8/l5;
.super Le8/i;


# instance fields
.field public final d:Le8/i;

.field public final synthetic e:Lg8/m5;


# direct methods
.method public constructor <init>(Lg8/m5;Le8/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg8/l5;->e:Lg8/m5;

    iput-object p2, p0, Lg8/l5;->d:Le8/i;

    return-void
.end method


# virtual methods
.method public final d(Le8/c2;)V
    .locals 2

    iget-object v0, p0, Lg8/l5;->d:Le8/i;

    invoke-virtual {v0, p1}, Le8/i;->d(Le8/c2;)V

    iget-object p1, p0, Lg8/l5;->e:Lg8/m5;

    iget-object p1, p1, Lg8/m5;->c:Le8/h2;

    new-instance v0, Landroidx/activity/d;

    const/16 v1, 0xf

    invoke-direct {v0, p0, v1}, Landroidx/activity/d;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, v0}, Le8/h2;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final e(Le8/s1;)V
    .locals 5

    sget-object v0, Lg8/m5;->d:Le8/b;

    iget-object v1, p1, Le8/s1;->b:Le8/c;

    iget-object v2, v1, Le8/c;->a:Ljava/util/IdentityHashMap;

    invoke-virtual {v2, v0}, Ljava/util/IdentityHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_2

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    sget-object v2, Le8/c;->b:Le8/c;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, Lg8/k5;

    iget-object v3, p0, Lg8/l5;->e:Lg8/m5;

    invoke-direct {v2, v3}, Lg8/k5;-><init>(Lg8/m5;)V

    new-instance v3, Ljava/util/IdentityHashMap;

    const/4 v4, 0x1

    invoke-direct {v3, v4}, Ljava/util/IdentityHashMap;-><init>(I)V

    invoke-virtual {v3, v0, v2}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, v1, Le8/c;->a:Ljava/util/IdentityHashMap;

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

    new-instance v1, Le8/s1;

    iget-object v2, p1, Le8/s1;->a:Ljava/util/List;

    check-cast v2, Ljava/util/List;

    iget-object p1, p1, Le8/s1;->c:Le8/r1;

    invoke-direct {v1, v2, v0, p1}, Le8/s1;-><init>(Ljava/util/List;Le8/c;Le8/r1;)V

    iget-object p1, p0, Lg8/l5;->d:Le8/i;

    invoke-virtual {p1, v1}, Le8/i;->e(Le8/s1;)V

    return-void

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "RetryingNameResolver can only be used once to wrap a NameResolver"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
