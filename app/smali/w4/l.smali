.class public final Lw4/l;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/ComponentCallbacks2;
.implements Lr4/f;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljava/lang/ref/WeakReference;

.field public final c:Lr4/g;

.field public volatile d:Z

.field public final e:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method public constructor <init>(Li4/o;Landroid/content/Context;Z)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lw4/l;->a:Landroid/content/Context;

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lw4/l;->b:Ljava/lang/ref/WeakReference;

    if-eqz p3, :cond_1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-class p1, Landroid/net/ConnectivityManager;

    invoke-static {p2, p1}, Lr2/k;->getSystemService(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/net/ConnectivityManager;

    if-eqz p1, :cond_0

    const-string p3, "android.permission.ACCESS_NETWORK_STATE"

    invoke-static {p2, p3}, Lr2/k;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result p2

    if-nez p2, :cond_0

    :try_start_0
    new-instance p2, Lr4/i;

    invoke-direct {p2, p1, p0}, Lr4/i;-><init>(Landroid/net/ConnectivityManager;Lr4/f;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    new-instance p2, Lr4/e;

    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    goto :goto_0

    :cond_0
    new-instance p2, Lr4/e;

    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    goto :goto_0

    :cond_1
    new-instance p2, Lr4/e;

    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    :goto_0
    iput-object p2, p0, Lw4/l;->c:Lr4/g;

    invoke-interface {p2}, Lr4/g;->a()Z

    move-result p1

    iput-boolean p1, p0, Lw4/l;->d:Z

    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p1, p0, Lw4/l;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Lw4/l;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lw4/l;->a:Landroid/content/Context;

    invoke-virtual {v0, p0}, Landroid/content/Context;->unregisterComponentCallbacks(Landroid/content/ComponentCallbacks;)V

    iget-object v0, p0, Lw4/l;->c:Lr4/g;

    invoke-interface {v0}, Lr4/g;->shutdown()V

    return-void
.end method

.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    iget-object p1, p0, Lw4/l;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Li4/o;

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lw4/l;->a()V

    :cond_0
    return-void
.end method

.method public final onLowMemory()V
    .locals 1

    const/16 v0, 0x50

    invoke-virtual {p0, v0}, Lw4/l;->onTrimMemory(I)V

    return-void
.end method

.method public final onTrimMemory(I)V
    .locals 2

    iget-object v0, p0, Lw4/l;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li4/o;

    if-eqz v0, :cond_1

    iget-object v0, v0, Li4/o;->b:Lq8/c;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lq8/c;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lq4/f;

    if-eqz v0, :cond_0

    iget-object v1, v0, Lq4/f;->a:Lq4/l;

    invoke-interface {v1, p1}, Lq4/l;->b(I)V

    iget-object v0, v0, Lq4/f;->b:Lq4/m;

    invoke-interface {v0, p1}, Lq4/m;->b(I)V

    :cond_0
    sget-object p1, Lq8/l;->a:Lq8/l;

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_2

    invoke-virtual {p0}, Lw4/l;->a()V

    :cond_2
    return-void
.end method
