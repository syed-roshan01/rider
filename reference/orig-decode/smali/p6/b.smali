.class public final Lp6/b;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/ServiceConnection;


# instance fields
.field public final synthetic a:Lp6/c;


# direct methods
.method public synthetic constructor <init>(Lp6/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp6/b;->a:Lp6/c;

    return-void
.end method


# virtual methods
.method public final onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 3

    iget-object v0, p0, Lp6/b;->a:Lp6/c;

    iget-object v1, v0, Lp6/c;->b:Lp6/v;

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v2, "ServiceConnectionImpl.onServiceConnected(%s)"

    invoke-virtual {v1, v2, p1}, Lp6/v;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance p1, Lp6/c0;

    invoke-direct {p1, p0, p2}, Lp6/c0;-><init>(Lp6/b;Landroid/os/IBinder;)V

    invoke-virtual {v0}, Lp6/c;->a()Landroid/os/Handler;

    move-result-object p2

    invoke-virtual {p2, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 3

    iget-object v0, p0, Lp6/b;->a:Lp6/c;

    iget-object v1, v0, Lp6/c;->b:Lp6/v;

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v2, "ServiceConnectionImpl.onServiceDisconnected(%s)"

    invoke-virtual {v1, v2, p1}, Lp6/v;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance p1, Lp6/a0;

    const/4 v1, 0x1

    invoke-direct {p1, p0, v1}, Lp6/a0;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0}, Lp6/c;->a()Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
