.class public final Ln8/v;
.super Le8/z0;


# static fields
.field public static final h:Le8/b;

.field public static final i:Le8/c2;


# instance fields
.field public final c:Le8/j0;

.field public final d:Ljava/util/HashMap;

.field public final e:Ljava/util/Random;

.field public f:Le8/x;

.field public g:Ln8/u;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Le8/b;

    const-string v1, "state-info"

    invoke-direct {v0, v1}, Le8/b;-><init>(Ljava/lang/String;)V

    sput-object v0, Ln8/v;->h:Le8/b;

    sget-object v0, Le8/c2;->e:Le8/c2;

    const-string v1, "no subchannels ready"

    invoke-virtual {v0, v1}, Le8/c2;->g(Ljava/lang/String;)Le8/c2;

    move-result-object v0

    sput-object v0, Ln8/v;->i:Le8/c2;

    return-void
.end method

.method public constructor <init>(Le8/j0;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ln8/v;->d:Ljava/util/HashMap;

    new-instance v0, Ln8/r;

    sget-object v1, Ln8/v;->i:Le8/c2;

    invoke-direct {v0, v1}, Ln8/r;-><init>(Le8/c2;)V

    iput-object v0, p0, Ln8/v;->g:Ln8/u;

    const-string v0, "helper"

    invoke-static {p1, v0}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object p1, p0, Ln8/v;->c:Le8/j0;

    new-instance p1, Ljava/util/Random;

    invoke-direct {p1}, Ljava/util/Random;-><init>()V

    iput-object p1, p0, Ln8/v;->e:Ljava/util/Random;

    return-void
.end method

.method public static g(Le8/x0;)Ln8/t;
    .locals 1

    invoke-virtual {p0}, Le8/x0;->c()Le8/c;

    move-result-object p0

    sget-object v0, Ln8/v;->h:Le8/b;

    iget-object p0, p0, Le8/c;->a:Ljava/util/IdentityHashMap;

    invoke-virtual {p0, v0}, Ljava/util/IdentityHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ln8/t;

    const-string v0, "STATE_INFO"

    invoke-static {p0, v0}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p0
.end method


# virtual methods
.method public final a(Le8/w0;)Z
    .locals 11

    iget-object v0, p1, Le8/w0;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    sget-object v1, Le8/c2;->m:Le8/c2;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "NameResolver returned no usable address. addrs="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", attrs="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p1, Le8/w0;->b:Le8/c;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Le8/c2;->g(Ljava/lang/String;)Le8/c2;

    move-result-object p1

    invoke-virtual {p0, p1}, Ln8/v;->c(Le8/c2;)V

    return v2

    :cond_0
    iget-object p1, p0, Ln8/v;->d:Ljava/util/HashMap;

    invoke-virtual {p1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v1

    new-instance v3, Ljava/util/HashMap;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v4

    const/4 v5, 0x2

    mul-int/2addr v4, v5

    invoke-direct {v3, v4}, Ljava/util/HashMap;-><init>(I)V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Le8/g0;

    new-instance v6, Le8/g0;

    iget-object v7, v4, Le8/g0;->a:Ljava/util/List;

    sget-object v8, Le8/c;->b:Le8/c;

    invoke-direct {v6, v7, v8}, Le8/g0;-><init>(Ljava/util/List;Le8/c;)V

    invoke-virtual {v3, v6, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    invoke-virtual {v3}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-interface {v4, v0}, Ljava/util/Set;->removeAll(Ljava/util/Collection;)Z

    invoke-virtual {v3}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v3, 0x1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Le8/g0;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le8/g0;

    invoke-virtual {p1, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Le8/x0;

    if-eqz v7, :cond_2

    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v7, v1}, Le8/x0;->i(Ljava/util/List;)V

    goto :goto_1

    :cond_2
    sget-object v7, Le8/c;->b:Le8/c;

    sget-object v8, Ln8/v;->h:Le8/b;

    new-instance v9, Ln8/t;

    sget-object v10, Le8/x;->d:Le8/x;

    invoke-static {v10}, Le8/y;->a(Le8/x;)Le8/y;

    move-result-object v10

    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    iput-object v10, v9, Ln8/t;->a:Ljava/lang/Object;

    new-instance v10, Ljava/util/IdentityHashMap;

    invoke-direct {v10, v3}, Ljava/util/IdentityHashMap;-><init>(I)V

    invoke-virtual {v10, v8, v9}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    filled-new-array {v2, v5}, [I

    move-result-object v3

    const-class v8, Ljava/lang/Object;

    invoke-static {v8, v3}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [[Ljava/lang/Object;

    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    iget-object v7, v7, Le8/c;->a:Ljava/util/IdentityHashMap;

    invoke-virtual {v7}, Ljava/util/IdentityHashMap;->entrySet()Ljava/util/Set;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_3
    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_4

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/Map$Entry;

    invoke-interface {v8}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v9

    invoke-virtual {v10, v9}, Ljava/util/IdentityHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_3

    invoke-interface {v8}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Le8/b;

    invoke-interface {v8}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v10, v9, v8}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_4
    new-instance v7, Le8/c;

    invoke-direct {v7, v10}, Le8/c;-><init>(Ljava/util/IdentityHashMap;)V

    new-instance v8, Le8/u0;

    invoke-direct {v8, v1, v7, v3, v2}, Le8/u0;-><init>(Ljava/util/List;Le8/c;[[Ljava/lang/Object;I)V

    iget-object v1, p0, Ln8/v;->c:Le8/j0;

    invoke-virtual {v1, v8}, Le8/j0;->h(Le8/u0;)Le8/x0;

    move-result-object v1

    const-string v3, "subchannel"

    invoke-static {v1, v3}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v3, Lv6/d;

    const/16 v7, 0x11

    invoke-direct {v3, p0, v1, v7}, Lv6/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v1, v3}, Le8/x0;->h(Le8/y0;)V

    invoke-virtual {p1, v6, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1}, Le8/x0;->f()V

    goto/16 :goto_1

    :cond_5
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v4}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Le8/g0;

    invoke-virtual {p1, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Le8/x0;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_6
    invoke-virtual {p0}, Ln8/v;->h()V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le8/x0;

    invoke-virtual {v0}, Le8/x0;->g()V

    invoke-static {v0}, Ln8/v;->g(Le8/x0;)Ln8/t;

    move-result-object v0

    sget-object v1, Le8/x;->e:Le8/x;

    invoke-static {v1}, Le8/y;->a(Le8/x;)Le8/y;

    move-result-object v1

    iput-object v1, v0, Ln8/t;->a:Ljava/lang/Object;

    goto :goto_4

    :cond_7
    return v3
.end method

.method public final c(Le8/c2;)V
    .locals 2

    iget-object v0, p0, Ln8/v;->f:Le8/x;

    sget-object v1, Le8/x;->b:Le8/x;

    if-eq v0, v1, :cond_0

    sget-object v0, Le8/x;->c:Le8/x;

    new-instance v1, Ln8/r;

    invoke-direct {v1, p1}, Ln8/r;-><init>(Le8/c2;)V

    invoke-virtual {p0, v0, v1}, Ln8/v;->i(Le8/x;Ln8/u;)V

    :cond_0
    return-void
.end method

.method public final f()V
    .locals 4

    iget-object v0, p0, Ln8/v;->d:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Le8/x0;

    invoke-virtual {v2}, Le8/x0;->g()V

    invoke-static {v2}, Ln8/v;->g(Le8/x0;)Ln8/t;

    move-result-object v2

    sget-object v3, Le8/x;->e:Le8/x;

    invoke-static {v3}, Le8/y;->a(Le8/x;)Le8/y;

    move-result-object v3

    iput-object v3, v2, Ln8/t;->a:Ljava/lang/Object;

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    return-void
.end method

.method public final h()V
    .locals 7

    iget-object v0, p0, Ln8/v;->d:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v1

    new-instance v2, Ljava/util/ArrayList;

    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    sget-object v4, Le8/x;->b:Le8/x;

    if-eqz v3, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Le8/x0;

    invoke-static {v3}, Ln8/v;->g(Le8/x0;)Ln8/t;

    move-result-object v5

    iget-object v5, v5, Ln8/t;->a:Ljava/lang/Object;

    check-cast v5, Le8/y;

    iget-object v5, v5, Le8/y;->a:Le8/x;

    if-ne v5, v4, :cond_0

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    sget-object v1, Ln8/v;->i:Le8/c2;

    const/4 v2, 0x0

    move-object v3, v1

    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    sget-object v5, Le8/x;->a:Le8/x;

    if-eqz v4, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Le8/x0;

    invoke-static {v4}, Ln8/v;->g(Le8/x0;)Ln8/t;

    move-result-object v4

    iget-object v4, v4, Ln8/t;->a:Ljava/lang/Object;

    check-cast v4, Le8/y;

    iget-object v6, v4, Le8/y;->a:Le8/x;

    if-eq v6, v5, :cond_3

    sget-object v5, Le8/x;->d:Le8/x;

    if-ne v6, v5, :cond_4

    :cond_3
    const/4 v2, 0x1

    :cond_4
    if-eq v3, v1, :cond_5

    invoke-virtual {v3}, Le8/c2;->e()Z

    move-result v5

    if-nez v5, :cond_2

    :cond_5
    iget-object v3, v4, Le8/y;->b:Le8/c2;

    goto :goto_1

    :cond_6
    if-eqz v2, :cond_7

    goto :goto_2

    :cond_7
    sget-object v5, Le8/x;->c:Le8/x;

    :goto_2
    new-instance v0, Ln8/r;

    invoke-direct {v0, v3}, Ln8/r;-><init>(Le8/c2;)V

    invoke-virtual {p0, v5, v0}, Ln8/v;->i(Le8/x;Ln8/u;)V

    goto :goto_3

    :cond_8
    iget-object v0, p0, Ln8/v;->e:Ljava/util/Random;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/util/Random;->nextInt(I)I

    move-result v0

    new-instance v1, Ln8/s;

    invoke-direct {v1, v0, v2}, Ln8/s;-><init>(ILjava/util/ArrayList;)V

    invoke-virtual {p0, v4, v1}, Ln8/v;->i(Le8/x;Ln8/u;)V

    :goto_3
    return-void
.end method

.method public final i(Le8/x;Ln8/u;)V
    .locals 1

    iget-object v0, p0, Ln8/v;->f:Le8/x;

    if-ne p1, v0, :cond_0

    iget-object v0, p0, Ln8/v;->g:Ln8/u;

    invoke-virtual {p2, v0}, Ln8/u;->B0(Ln8/u;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    iget-object v0, p0, Ln8/v;->c:Le8/j0;

    invoke-virtual {v0, p1, p2}, Le8/j0;->r(Le8/x;Lz6/a;)V

    iput-object p1, p0, Ln8/v;->f:Le8/x;

    iput-object p2, p0, Ln8/v;->g:Ln8/u;

    :cond_1
    return-void
.end method
