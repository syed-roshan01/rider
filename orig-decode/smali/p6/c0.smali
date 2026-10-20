.class public final Lp6/c0;
.super Lp6/w;


# instance fields
.field public final synthetic n:Landroid/os/IBinder;

.field public final synthetic o:Lp6/b;


# direct methods
.method public constructor <init>(Lp6/b;Landroid/os/IBinder;)V
    .locals 0

    iput-object p1, p0, Lp6/c0;->o:Lp6/b;

    iput-object p2, p0, Lp6/c0;->n:Landroid/os/IBinder;

    invoke-direct {p0}, Lp6/w;-><init>()V

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 6

    iget-object v0, p0, Lp6/c0;->o:Lp6/b;

    iget-object v1, v0, Lp6/b;->a:Lp6/c;

    iget-object v2, v1, Lp6/c;->i:Lp6/b0;

    iget-object v3, p0, Lp6/c0;->n:Landroid/os/IBinder;

    invoke-interface {v2, v3}, Lp6/b0;->a(Landroid/os/IBinder;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/os/IInterface;

    iput-object v2, v1, Lp6/c;->n:Landroid/os/IInterface;

    iget-object v0, v0, Lp6/b;->a:Lp6/c;

    iget-object v1, v0, Lp6/c;->b:Lp6/v;

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/Object;

    const-string v4, "linkToDeath"

    invoke-virtual {v1, v4, v3}, Lp6/v;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    :try_start_0
    iget-object v1, v0, Lp6/c;->n:Landroid/os/IInterface;

    invoke-interface {v1}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object v1

    iget-object v3, v0, Lp6/c;->k:Lp6/y;

    invoke-interface {v1, v3, v2}, Landroid/os/IBinder;->linkToDeath(Landroid/os/IBinder$DeathRecipient;I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    new-array v3, v2, [Ljava/lang/Object;

    const-string v4, "linkToDeath failed"

    iget-object v5, v0, Lp6/c;->b:Lp6/v;

    invoke-virtual {v5, v1, v4, v3}, Lp6/v;->a(Landroid/os/RemoteException;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    iput-boolean v2, v0, Lp6/c;->g:Z

    iget-object v1, v0, Lp6/c;->d:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Runnable;

    invoke-interface {v2}, Ljava/lang/Runnable;->run()V

    goto :goto_1

    :cond_0
    iget-object v0, v0, Lp6/c;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    return-void
.end method
