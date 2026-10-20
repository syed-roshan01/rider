.class public final Le7/h;
.super Ljava/lang/Object;

# interfaces
.implements Lv6/p;


# static fields
.field public static final a:Le7/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Le7/h;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Le7/h;->a:Le7/h;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Class;
    .locals 1

    const-class v0, Le7/f;

    return-object v0
.end method

.method public final b(Lj0/b0;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p1, Lj0/b0;->c:Ljava/lang/Object;

    check-cast v0, Lv6/n;

    if-eqz v0, :cond_2

    iget-object p1, p1, Lj0/b0;->b:Ljava/lang/Object;

    check-cast p1, Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lv6/n;

    iget-object v1, v1, Lv6/n;->a:Ljava/lang/Object;

    check-cast v1, Le7/f;

    goto :goto_0

    :cond_1
    new-instance p1, Le7/g;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    return-object p1

    :cond_2
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "no primary in primitive set"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final c()Ljava/lang/Class;
    .locals 1

    const-class v0, Le7/f;

    return-object v0
.end method
