.class public final Lg8/t;
.super Ljava/lang/Object;

# interfaces
.implements Lg8/j5;


# static fields
.field public static final f:Ljava/util/logging/Logger;


# instance fields
.field public final a:Ljava/util/concurrent/ScheduledExecutorService;

.field public final b:Le8/h2;

.field public final c:Lr7/e;

.field public d:Lg8/i1;

.field public e:Lv6/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lg8/t;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Lg8/t;->f:Ljava/util/logging/Logger;

    return-void
.end method

.method public constructor <init>(Lr7/e;Ljava/util/concurrent/ScheduledExecutorService;Le8/h2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg8/t;->c:Lr7/e;

    iput-object p2, p0, Lg8/t;->a:Ljava/util/concurrent/ScheduledExecutorService;

    iput-object p3, p0, Lg8/t;->b:Le8/h2;

    return-void
.end method


# virtual methods
.method public final a(Lg8/t0;)V
    .locals 9

    iget-object v0, p0, Lg8/t;->b:Le8/h2;

    invoke-virtual {v0}, Le8/h2;->d()V

    iget-object v0, p0, Lg8/t;->d:Lg8/i1;

    if-nez v0, :cond_0

    iget-object v0, p0, Lg8/t;->c:Lr7/e;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lr7/e;->d()Lg8/i1;

    move-result-object v0

    iput-object v0, p0, Lg8/t;->d:Lg8/i1;

    :cond_0
    iget-object v0, p0, Lg8/t;->e:Lv6/d;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lv6/d;->b:Ljava/lang/Object;

    check-cast v0, Le8/g2;

    iget-boolean v1, v0, Le8/g2;->c:Z

    if-nez v1, :cond_1

    iget-boolean v0, v0, Le8/g2;->b:Z

    if-nez v0, :cond_1

    return-void

    :cond_1
    iget-object v0, p0, Lg8/t;->d:Lg8/i1;

    invoke-virtual {v0}, Lg8/i1;->a()J

    move-result-wide v7

    iget-object v1, p0, Lg8/t;->b:Le8/h2;

    sget-object v5, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    iget-object v6, p0, Lg8/t;->a:Ljava/util/concurrent/ScheduledExecutorService;

    move-object v2, p1

    move-wide v3, v7

    invoke-virtual/range {v1 .. v6}, Le8/h2;->c(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/ScheduledExecutorService;)Lv6/d;

    move-result-object p1

    iput-object p1, p0, Lg8/t;->e:Lv6/d;

    sget-object p1, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    sget-object v1, Lg8/t;->f:Ljava/util/logging/Logger;

    const-string v2, "Scheduling DNS resolution backoff for {0}ns"

    invoke-virtual {v1, p1, v2, v0}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method
