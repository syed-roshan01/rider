.class public final Ll4/l;
.super Ljava/lang/Object;


# instance fields
.field public final a:Ll4/e;


# direct methods
.method public constructor <init>(Ll4/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll4/l;->a:Ll4/e;

    return-void
.end method


# virtual methods
.method public final a()Ll4/m;
    .locals 3

    iget-object v0, p0, Ll4/l;->a:Ll4/e;

    iget-object v1, v0, Ll4/e;->d:Ljava/lang/Object;

    check-cast v1, Ll4/j;

    monitor-enter v1

    const/4 v2, 0x1

    :try_start_0
    invoke-virtual {v0, v2}, Ll4/e;->d(Z)V

    iget-object v0, v0, Ll4/e;->b:Ljava/lang/Object;

    check-cast v0, Ll4/f;

    iget-object v0, v0, Ll4/f;->a:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ll4/j;->f(Ljava/lang/String;)Ll4/g;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    if-eqz v0, :cond_0

    new-instance v1, Ll4/m;

    invoke-direct {v1, v0}, Ll4/m;-><init>(Ll4/g;)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return-object v1

    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method
