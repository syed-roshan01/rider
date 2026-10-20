.class public final Lv0/m;
.super Ljava/lang/Object;


# instance fields
.field public final synthetic a:Lv0/n;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lc9/a;


# direct methods
.method public constructor <init>(Lv0/n;Ljava/lang/String;Lv0/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv0/m;->a:Lv0/n;

    iput-object p2, p0, Lv0/m;->b:Ljava/lang/String;

    iput-object p3, p0, Lv0/m;->c:Lc9/a;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    iget-object v0, p0, Lv0/m;->a:Lv0/n;

    iget-object v1, v0, Lv0/n;->c:Ljava/util/LinkedHashMap;

    iget-object v2, p0, Lv0/m;->b:Ljava/lang/String;

    invoke-interface {v1, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    if-eqz v1, :cond_0

    iget-object v3, p0, Lv0/m;->c:Lc9/a;

    invoke-interface {v1, v3}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    :cond_0
    if-eqz v1, :cond_1

    move-object v3, v1

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    xor-int/lit8 v3, v3, 0x1

    if-eqz v3, :cond_1

    iget-object v0, v0, Lv0/n;->c:Ljava/util/LinkedHashMap;

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-void
.end method
