.class public abstract Lt9/j;
.super Ljava/lang/Object;


# static fields
.field public static final a:Ljava/lang/String;

.field public static final b:J

.field public static final c:I

.field public static final d:I

.field public static final e:J

.field public static final f:Lt9/f;

.field public static final g:Lx9/v;

.field public static final h:Lx9/v;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    const-string v0, "kotlinx.coroutines.scheduler.default.name"

    sget v1, Lr9/v;->a:I

    :try_start_0
    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_0

    const-string v0, "DefaultDispatcher"

    :cond_0
    sput-object v0, Lt9/j;->a:Ljava/lang/String;

    const-string v1, "kotlinx.coroutines.scheduler.resolution.ns"

    const-wide/32 v2, 0x186a0

    const-wide/16 v4, 0x1

    const-wide v6, 0x7fffffffffffffffL

    invoke-static/range {v1 .. v7}, Lr9/a;->q(Ljava/lang/String;JJJ)J

    move-result-wide v0

    sput-wide v0, Lt9/j;->b:J

    sget v0, Lr9/v;->a:I

    const/4 v1, 0x2

    if-ge v0, v1, :cond_1

    move v0, v1

    :cond_1
    const/16 v1, 0x8

    const-string v2, "kotlinx.coroutines.scheduler.core.pool.size"

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v2, v0, v3, v4, v1}, Lr9/a;->r(Ljava/lang/String;IIII)I

    move-result v0

    sput v0, Lt9/j;->c:I

    const-string v0, "kotlinx.coroutines.scheduler.max.pool.size"

    const/4 v1, 0x4

    const v2, 0x1ffffe

    invoke-static {v0, v2, v4, v2, v1}, Lr9/a;->r(Ljava/lang/String;IIII)I

    move-result v0

    sput v0, Lt9/j;->d:I

    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-string v5, "kotlinx.coroutines.scheduler.keep.alive.sec"

    const-wide/16 v6, 0x3c

    const-wide/16 v8, 0x1

    const-wide v10, 0x7fffffffffffffffL

    invoke-static/range {v5 .. v11}, Lr9/a;->q(Ljava/lang/String;JJJ)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v0

    sput-wide v0, Lt9/j;->e:J

    sget-object v0, Lt9/f;->s:Lt9/f;

    sput-object v0, Lt9/j;->f:Lt9/f;

    new-instance v0, Lx9/v;

    invoke-direct {v0, v4}, Lx9/v;-><init>(I)V

    sput-object v0, Lt9/j;->g:Lx9/v;

    new-instance v0, Lx9/v;

    invoke-direct {v0, v3}, Lx9/v;-><init>(I)V

    sput-object v0, Lt9/j;->h:Lx9/v;

    return-void
.end method
