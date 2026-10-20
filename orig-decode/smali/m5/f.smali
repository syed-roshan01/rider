.class public final Lm5/f;
.super Ljava/lang/Object;


# instance fields
.field public final a:Ll/t;

.field public final b:Lm5/d;

.field public final c:Ljava/util/HashMap;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lm5/d;)V
    .locals 1

    new-instance v0, Ll/t;

    invoke-direct {v0, p1}, Ll/t;-><init>(Landroid/content/Context;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lm5/f;->c:Ljava/util/HashMap;

    iput-object v0, p0, Lm5/f;->a:Ll/t;

    iput-object p2, p0, Lm5/f;->b:Lm5/d;

    return-void
.end method


# virtual methods
.method public final declared-synchronized a(Ljava/lang/String;)Lm5/h;
    .locals 5

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lm5/f;->c:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lm5/f;->c:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lm5/h;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    :try_start_1
    iget-object v0, p0, Lm5/f;->a:Ll/t;

    invoke-virtual {v0, p1}, Ll/t;->d(Ljava/lang/String;)Lcom/google/android/datatransport/cct/CctBackendFactory;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v0, :cond_1

    monitor-exit p0

    const/4 p1, 0x0

    return-object p1

    :cond_1
    :try_start_2
    iget-object v1, p0, Lm5/f;->b:Lm5/d;

    new-instance v2, Lm5/b;

    iget-object v3, v1, Lm5/d;->a:Landroid/content/Context;

    iget-object v4, v1, Lm5/d;->b:Lt5/a;

    iget-object v1, v1, Lm5/d;->c:Lt5/a;

    invoke-direct {v2, v3, v4, v1, p1}, Lm5/b;-><init>(Landroid/content/Context;Lt5/a;Lt5/a;Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Lcom/google/android/datatransport/cct/CctBackendFactory;->create(Lm5/c;)Lm5/h;

    move-result-object v0

    iget-object v1, p0, Lm5/f;->c:Ljava/util/HashMap;

    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return-object v0

    :goto_0
    monitor-exit p0

    throw p1
.end method
