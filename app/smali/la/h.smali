.class public final synthetic Lla/h;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/os/IBinder$DeathRecipient;


# instance fields
.field public final synthetic a:Lla/i;


# direct methods
.method public synthetic constructor <init>(Lla/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lla/h;->a:Lla/i;

    return-void
.end method


# virtual methods
.method public final binderDied()V
    .locals 3

    const/4 v0, 0x0

    iget-object v1, p0, Lla/h;->a:Lla/i;

    iput-object v0, v1, Lla/i;->a:Lw9/c;

    const-string v0, "ShizukuRemoteProcess"

    const-string v2, "remote process is dead"

    invoke-static {v0, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    sget-object v0, Lla/i;->d:Ljava/util/Set;

    invoke-interface {v0, v1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    return-void
.end method
