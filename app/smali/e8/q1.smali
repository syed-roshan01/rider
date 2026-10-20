.class public final Le8/q1;
.super Ljava/lang/Object;


# instance fields
.field public final a:I

.field public final b:Le8/w1;

.field public final c:Le8/h2;

.field public final d:Lg8/n5;

.field public final e:Ljava/util/concurrent/ScheduledExecutorService;

.field public final f:Le8/i;

.field public final g:Ljava/util/concurrent/Executor;

.field public final h:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/Integer;Le8/w1;Le8/h2;Lg8/n5;Ljava/util/concurrent/ScheduledExecutorService;Le8/i;Ljava/util/concurrent/Executor;Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "defaultPort not set"

    invoke-static {p1, v0}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iput p1, p0, Le8/q1;->a:I

    const-string p1, "proxyDetector not set"

    invoke-static {p2, p1}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object p2, p0, Le8/q1;->b:Le8/w1;

    const-string p1, "syncContext not set"

    invoke-static {p3, p1}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object p3, p0, Le8/q1;->c:Le8/h2;

    const-string p1, "serviceConfigParser not set"

    invoke-static {p4, p1}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object p4, p0, Le8/q1;->d:Lg8/n5;

    iput-object p5, p0, Le8/q1;->e:Ljava/util/concurrent/ScheduledExecutorService;

    iput-object p6, p0, Le8/q1;->f:Le8/i;

    iput-object p7, p0, Le8/q1;->g:Ljava/util/concurrent/Executor;

    iput-object p8, p0, Le8/q1;->h:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Lf6/a;->j0(Ljava/lang/Object;)Lq6/g;

    move-result-object v0

    iget v1, p0, Le8/q1;->a:I

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "defaultPort"

    invoke-virtual {v0, v1, v2}, Lq6/g;->d(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "proxyDetector"

    iget-object v2, p0, Le8/q1;->b:Le8/w1;

    invoke-virtual {v0, v2, v1}, Lq6/g;->a(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "syncContext"

    iget-object v2, p0, Le8/q1;->c:Le8/h2;

    invoke-virtual {v0, v2, v1}, Lq6/g;->a(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "serviceConfigParser"

    iget-object v2, p0, Le8/q1;->d:Lg8/n5;

    invoke-virtual {v0, v2, v1}, Lq6/g;->a(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "scheduledExecutorService"

    iget-object v2, p0, Le8/q1;->e:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-virtual {v0, v2, v1}, Lq6/g;->a(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "channelLogger"

    iget-object v2, p0, Le8/q1;->f:Le8/i;

    invoke-virtual {v0, v2, v1}, Lq6/g;->a(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "executor"

    iget-object v2, p0, Le8/q1;->g:Ljava/util/concurrent/Executor;

    invoke-virtual {v0, v2, v1}, Lq6/g;->a(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "overrideAuthority"

    iget-object v2, p0, Le8/q1;->h:Ljava/lang/String;

    invoke-virtual {v0, v2, v1}, Lq6/g;->a(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lq6/g;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
