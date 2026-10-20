.class public final Le8/h;
.super Ljava/lang/Object;


# static fields
.field public static final k:Le8/h;


# instance fields
.field public final a:Le8/c0;

.field public final b:Ljava/util/concurrent/Executor;

.field public final c:Ljava/lang/String;

.field public final d:Le8/f;

.field public final e:Ljava/lang/String;

.field public final f:[[Ljava/lang/Object;

.field public final g:Ljava/util/List;

.field public final h:Ljava/lang/Boolean;

.field public final i:Ljava/lang/Integer;

.field public final j:Ljava/lang/Integer;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Le8/g;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x0

    const/4 v2, 0x2

    filled-new-array {v1, v2}, [I

    move-result-object v1

    const-class v2, Ljava/lang/Object;

    invoke-static {v2, v1}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [[Ljava/lang/Object;

    iput-object v1, v0, Le8/g;->f:[[Ljava/lang/Object;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    iput-object v1, v0, Le8/g;->g:Ljava/util/List;

    new-instance v1, Le8/h;

    invoke-direct {v1, v0}, Le8/h;-><init>(Le8/g;)V

    sput-object v1, Le8/h;->k:Le8/h;

    return-void
.end method

.method public constructor <init>(Le8/g;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, Le8/g;->a:Le8/c0;

    iput-object v0, p0, Le8/h;->a:Le8/c0;

    iget-object v0, p1, Le8/g;->b:Ljava/util/concurrent/Executor;

    iput-object v0, p0, Le8/h;->b:Ljava/util/concurrent/Executor;

    iget-object v0, p1, Le8/g;->c:Ljava/lang/String;

    iput-object v0, p0, Le8/h;->c:Ljava/lang/String;

    iget-object v0, p1, Le8/g;->d:Le8/f;

    iput-object v0, p0, Le8/h;->d:Le8/f;

    iget-object v0, p1, Le8/g;->e:Ljava/lang/String;

    iput-object v0, p0, Le8/h;->e:Ljava/lang/String;

    iget-object v0, p1, Le8/g;->f:[[Ljava/lang/Object;

    iput-object v0, p0, Le8/h;->f:[[Ljava/lang/Object;

    iget-object v0, p1, Le8/g;->g:Ljava/util/List;

    iput-object v0, p0, Le8/h;->g:Ljava/util/List;

    iget-object v0, p1, Le8/g;->h:Ljava/lang/Boolean;

    iput-object v0, p0, Le8/h;->h:Ljava/lang/Boolean;

    iget-object v0, p1, Le8/g;->i:Ljava/lang/Integer;

    iput-object v0, p0, Le8/h;->i:Ljava/lang/Integer;

    iget-object p1, p1, Le8/g;->j:Ljava/lang/Integer;

    iput-object p1, p0, Le8/h;->j:Ljava/lang/Integer;

    return-void
.end method

.method public static b(Le8/h;)Le8/g;
    .locals 2

    new-instance v0, Le8/g;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iget-object v1, p0, Le8/h;->a:Le8/c0;

    iput-object v1, v0, Le8/g;->a:Le8/c0;

    iget-object v1, p0, Le8/h;->b:Ljava/util/concurrent/Executor;

    iput-object v1, v0, Le8/g;->b:Ljava/util/concurrent/Executor;

    iget-object v1, p0, Le8/h;->c:Ljava/lang/String;

    iput-object v1, v0, Le8/g;->c:Ljava/lang/String;

    iget-object v1, p0, Le8/h;->d:Le8/f;

    iput-object v1, v0, Le8/g;->d:Le8/f;

    iget-object v1, p0, Le8/h;->e:Ljava/lang/String;

    iput-object v1, v0, Le8/g;->e:Ljava/lang/String;

    iget-object v1, p0, Le8/h;->f:[[Ljava/lang/Object;

    iput-object v1, v0, Le8/g;->f:[[Ljava/lang/Object;

    iget-object v1, p0, Le8/h;->g:Ljava/util/List;

    iput-object v1, v0, Le8/g;->g:Ljava/util/List;

    iget-object v1, p0, Le8/h;->h:Ljava/lang/Boolean;

    iput-object v1, v0, Le8/g;->h:Ljava/lang/Boolean;

    iget-object v1, p0, Le8/h;->i:Ljava/lang/Integer;

    iput-object v1, v0, Le8/g;->i:Ljava/lang/Integer;

    iget-object p0, p0, Le8/h;->j:Ljava/lang/Integer;

    iput-object p0, v0, Le8/g;->j:Ljava/lang/Integer;

    return-object v0
.end method


# virtual methods
.method public final a(Lv6/d;)Ljava/lang/Object;
    .locals 4

    const-string v0, "key"

    invoke-static {p1, v0}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v2, p0, Le8/h;->f:[[Ljava/lang/Object;

    array-length v3, v2

    if-ge v1, v3, :cond_1

    aget-object v3, v2, v1

    aget-object v3, v3, v0

    invoke-virtual {p1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    aget-object p1, v2, v1

    const/4 v0, 0x1

    aget-object p1, p1, v0

    return-object p1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    iget-object p1, p1, Lv6/d;->c:Ljava/lang/Object;

    return-object p1
.end method

.method public final c(Lv6/d;Ljava/lang/Object;)Le8/h;
    .locals 7

    const-string v0, "key"

    invoke-static {p1, v0}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0}, Le8/h;->b(Le8/h;)Le8/g;

    move-result-object v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    iget-object v3, p0, Le8/h;->f:[[Ljava/lang/Object;

    array-length v4, v3

    const/4 v5, -0x1

    if-ge v2, v4, :cond_1

    aget-object v4, v3, v2

    aget-object v4, v4, v1

    invoke-virtual {p1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    move v2, v5

    :goto_1
    array-length v4, v3

    if-ne v2, v5, :cond_2

    const/4 v6, 0x1

    goto :goto_2

    :cond_2
    move v6, v1

    :goto_2
    add-int/2addr v4, v6

    const/4 v6, 0x2

    filled-new-array {v4, v6}, [I

    move-result-object v4

    const-class v6, Ljava/lang/Object;

    invoke-static {v6, v4}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, [[Ljava/lang/Object;

    iput-object v4, v0, Le8/g;->f:[[Ljava/lang/Object;

    array-length v6, v3

    invoke-static {v3, v1, v4, v1, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    if-ne v2, v5, :cond_3

    iget-object v1, v0, Le8/g;->f:[[Ljava/lang/Object;

    array-length v2, v3

    filled-new-array {p1, p2}, [Ljava/lang/Object;

    move-result-object p1

    aput-object p1, v1, v2

    goto :goto_3

    :cond_3
    iget-object v1, v0, Le8/g;->f:[[Ljava/lang/Object;

    filled-new-array {p1, p2}, [Ljava/lang/Object;

    move-result-object p1

    aput-object p1, v1, v2

    :goto_3
    new-instance p1, Le8/h;

    invoke-direct {p1, v0}, Le8/h;-><init>(Le8/g;)V

    return-object p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Lf6/a;->j0(Ljava/lang/Object;)Lq6/g;

    move-result-object v0

    const-string v1, "deadline"

    iget-object v2, p0, Le8/h;->a:Le8/c0;

    invoke-virtual {v0, v2, v1}, Lq6/g;->a(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "authority"

    iget-object v2, p0, Le8/h;->c:Ljava/lang/String;

    invoke-virtual {v0, v2, v1}, Lq6/g;->a(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "callCredentials"

    iget-object v2, p0, Le8/h;->d:Le8/f;

    invoke-virtual {v0, v2, v1}, Lq6/g;->a(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Le8/h;->b:Ljava/util/concurrent/Executor;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const-string v2, "executor"

    invoke-virtual {v0, v1, v2}, Lq6/g;->a(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "compressorName"

    iget-object v2, p0, Le8/h;->e:Ljava/lang/String;

    invoke-virtual {v0, v2, v1}, Lq6/g;->a(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Le8/h;->f:[[Ljava/lang/Object;

    invoke-static {v1}, Ljava/util/Arrays;->deepToString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "customOptions"

    invoke-virtual {v0, v1, v2}, Lq6/g;->a(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iget-object v2, p0, Le8/h;->h:Ljava/lang/Boolean;

    invoke-virtual {v1, v2}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v1

    const-string v2, "waitForReady"

    invoke-virtual {v0, v2, v1}, Lq6/g;->c(Ljava/lang/String;Z)V

    const-string v1, "maxInboundMessageSize"

    iget-object v2, p0, Le8/h;->i:Ljava/lang/Integer;

    invoke-virtual {v0, v2, v1}, Lq6/g;->a(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "maxOutboundMessageSize"

    iget-object v2, p0, Le8/h;->j:Ljava/lang/Integer;

    invoke-virtual {v0, v2, v1}, Lq6/g;->a(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "streamTracerFactories"

    iget-object v2, p0, Le8/h;->g:Ljava/util/List;

    invoke-virtual {v0, v2, v1}, Lq6/g;->a(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lq6/g;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
