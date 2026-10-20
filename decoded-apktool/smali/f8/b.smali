.class public final Lf8/b;
.super Le8/c1;


# instance fields
.field public final a:Le8/c1;

.field public final b:Landroid/content/Context;

.field public final c:Landroid/net/ConnectivityManager;

.field public final d:Ljava/lang/Object;

.field public e:Ll/h;


# direct methods
.method public constructor <init>(Le8/c1;Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lf8/b;->d:Ljava/lang/Object;

    iput-object p1, p0, Lf8/b;->a:Le8/c1;

    iput-object p2, p0, Lf8/b;->b:Landroid/content/Context;

    if-eqz p2, :cond_0

    const-string p1, "connectivity"

    invoke-virtual {p2, p1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/net/ConnectivityManager;

    iput-object p1, p0, Lf8/b;->c:Landroid/net/ConnectivityManager;

    :try_start_0
    invoke-virtual {p0}, Lf8/b;->y()V
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string p2, "AndroidChannelBuilder"

    const-string v0, "Failed to configure network monitoring. Does app have ACCESS_NETWORK_STATE permission?"

    invoke-static {p2, v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    iput-object p1, p0, Lf8/b;->c:Landroid/net/ConnectivityManager;

    :goto_0
    return-void
.end method


# virtual methods
.method public final g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lf8/b;->a:Le8/c1;

    invoke-virtual {v0}, Le8/j0;->g()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final m(Le8/p1;Le8/h;)Le8/k;
    .locals 1

    iget-object v0, p0, Lf8/b;->a:Le8/c1;

    invoke-virtual {v0, p1, p2}, Le8/j0;->m(Le8/p1;Le8/h;)Le8/k;

    move-result-object p1

    return-object p1
.end method

.method public final s(JLjava/util/concurrent/TimeUnit;)Z
    .locals 1

    iget-object v0, p0, Lf8/b;->a:Le8/c1;

    invoke-virtual {v0, p1, p2, p3}, Le8/c1;->s(JLjava/util/concurrent/TimeUnit;)Z

    move-result p1

    return p1
.end method

.method public final t()V
    .locals 1

    iget-object v0, p0, Lf8/b;->a:Le8/c1;

    invoke-virtual {v0}, Le8/c1;->t()V

    return-void
.end method

.method public final u()Le8/x;
    .locals 1

    iget-object v0, p0, Lf8/b;->a:Le8/c1;

    invoke-virtual {v0}, Le8/c1;->u()Le8/x;

    move-result-object v0

    return-object v0
.end method

.method public final v(Le8/x;Lcom/google/firebase/firestore/remote/f;)V
    .locals 1

    iget-object v0, p0, Lf8/b;->a:Le8/c1;

    invoke-virtual {v0, p1, p2}, Le8/c1;->v(Le8/x;Lcom/google/firebase/firestore/remote/f;)V

    return-void
.end method

.method public final w()Le8/c1;
    .locals 2

    iget-object v0, p0, Lf8/b;->d:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lf8/b;->e:Ll/h;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ll/h;->run()V

    const/4 v1, 0x0

    iput-object v1, p0, Lf8/b;->e:Ll/h;

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lf8/b;->a:Le8/c1;

    invoke-virtual {v0}, Le8/c1;->w()Le8/c1;

    move-result-object v0

    return-object v0

    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final x()Le8/c1;
    .locals 2

    iget-object v0, p0, Lf8/b;->d:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lf8/b;->e:Ll/h;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ll/h;->run()V

    const/4 v1, 0x0

    iput-object v1, p0, Lf8/b;->e:Ll/h;

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lf8/b;->a:Le8/c1;

    invoke-virtual {v0}, Le8/c1;->x()Le8/c1;

    move-result-object v0

    return-object v0

    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final y()V
    .locals 3

    iget-object v0, p0, Lf8/b;->c:Landroid/net/ConnectivityManager;

    if-eqz v0, :cond_0

    new-instance v1, Lr4/h;

    invoke-direct {v1, p0}, Lr4/h;-><init>(Lf8/b;)V

    invoke-virtual {v0, v1}, Landroid/net/ConnectivityManager;->registerDefaultNetworkCallback(Landroid/net/ConnectivityManager$NetworkCallback;)V

    new-instance v0, Ll/h;

    const/16 v2, 0x11

    invoke-direct {v0, v2, p0, v1}, Ll/h;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iput-object v0, p0, Lf8/b;->e:Ll/h;

    goto :goto_0

    :cond_0
    new-instance v0, Lf8/a;

    invoke-direct {v0, p0}, Lf8/a;-><init>(Lf8/b;)V

    new-instance v1, Landroid/content/IntentFilter;

    const-string v2, "android.net.conn.CONNECTIVITY_CHANGE"

    invoke-direct {v1, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lf8/b;->b:Landroid/content/Context;

    invoke-virtual {v2, v0, v1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    new-instance v1, Ll/h;

    const/16 v2, 0x12

    invoke-direct {v1, v2, p0, v0}, Ll/h;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iput-object v1, p0, Lf8/b;->e:Ll/h;

    :goto_0
    return-void
.end method
