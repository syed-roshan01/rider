.class public final Le8/v1;
.super Ljava/lang/Object;


# static fields
.field public static final e:Ljava/util/logging/Logger;

.field public static f:Le8/v1;


# instance fields
.field public final a:Le8/u1;

.field public b:Ljava/lang/String;

.field public final c:Ljava/util/LinkedHashSet;

.field public d:Lr6/s;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Le8/v1;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Le8/v1;->e:Ljava/util/logging/Logger;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Le8/u1;

    invoke-direct {v0, p0}, Le8/u1;-><init>(Le8/v1;)V

    iput-object v0, p0, Le8/v1;->a:Le8/u1;

    const-string v0, "unknown"

    iput-object v0, p0, Le8/v1;->b:Ljava/lang/String;

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, Le8/v1;->c:Ljava/util/LinkedHashSet;

    sget-object v0, Lr6/f0;->n:Lr6/f0;

    iput-object v0, p0, Le8/v1;->d:Lr6/s;

    return-void
.end method


# virtual methods
.method public final declared-synchronized a()V
    .locals 9

    monitor-enter p0

    :try_start_0
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "unknown"

    iget-object v2, p0, Le8/v1;->c:Ljava/util/LinkedHashSet;

    invoke-virtual {v2}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/high16 v3, -0x80000000

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Le8/t1;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v5, "dns"

    invoke-virtual {v0, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Le8/t1;

    if-eqz v6, :cond_1

    invoke-virtual {v6}, Le8/t1;->o0()I

    move-result v6

    invoke-virtual {v4}, Le8/t1;->o0()I

    move-result v7

    if-ge v6, v7, :cond_2

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_1
    :goto_1
    invoke-virtual {v0, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    invoke-virtual {v4}, Le8/t1;->o0()I

    move-result v5

    if-ge v3, v5, :cond_0

    invoke-virtual {v4}, Le8/t1;->o0()I

    move-result v1

    const-string v3, "dns"

    move-object v8, v3

    move v3, v1

    move-object v1, v8

    goto :goto_0

    :cond_3
    invoke-static {v0}, Lr6/s;->a(Ljava/util/HashMap;)Lr6/s;

    move-result-object v0

    iput-object v0, p0, Le8/v1;->d:Lr6/s;

    iput-object v1, p0, Le8/v1;->b:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :goto_2
    monitor-exit p0

    throw v0
.end method
