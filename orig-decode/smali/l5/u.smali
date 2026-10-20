.class public final Ll5/u;
.super Ljava/lang/Object;

# interfaces
.implements Ll5/t;


# static fields
.field public static volatile e:Ll5/k;


# instance fields
.field public final a:Lt5/a;

.field public final b:Lt5/a;

.field public final c:Lp5/d;

.field public final d:Lq5/i;


# direct methods
.method public constructor <init>(Lt5/a;Lt5/a;Lp5/d;Lq5/i;Lq5/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll5/u;->a:Lt5/a;

    iput-object p2, p0, Ll5/u;->b:Lt5/a;

    iput-object p3, p0, Ll5/u;->c:Lp5/d;

    iput-object p4, p0, Ll5/u;->d:Lq5/i;

    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p1, Landroidx/activity/d;

    const/16 p2, 0xb

    invoke-direct {p1, p5, p2}, Landroidx/activity/d;-><init>(Ljava/lang/Object;I)V

    iget-object p2, p5, Lq5/k;->a:Ljava/util/concurrent/Executor;

    invoke-interface {p2, p1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static a()Ll5/u;
    .locals 2

    sget-object v0, Ll5/u;->e:Ll5/k;

    if-eqz v0, :cond_0

    iget-object v0, v0, Ll5/k;->f:Lp8/a;

    invoke-interface {v0}, Lp8/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll5/u;

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Not initialized!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static b(Landroid/content/Context;)V
    .locals 2

    sget-object v0, Ll5/u;->e:Ll5/k;

    if-nez v0, :cond_1

    const-class v0, Ll5/u;

    monitor-enter v0

    :try_start_0
    sget-object v1, Ll5/u;->e:Ll5/k;

    if-nez v1, :cond_0

    new-instance v1, Lj/a;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p0, v1, Lj/a;->a:Landroid/content/Context;

    invoke-virtual {v1}, Lj/a;->b()Ll5/k;

    move-result-object p0

    sput-object p0, Ll5/u;->e:Ll5/k;

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    goto :goto_2

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    :cond_1
    :goto_2
    return-void
.end method
