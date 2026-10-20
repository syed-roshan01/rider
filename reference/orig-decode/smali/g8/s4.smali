.class public final Lg8/s4;
.super Ljava/lang/Object;


# instance fields
.field public final a:Ljava/util/concurrent/ScheduledExecutorService;

.field public final b:Ljava/util/concurrent/Executor;

.field public final c:Ljava/lang/Runnable;

.field public final d:Lq6/l;

.field public e:J

.field public f:Z

.field public g:Ljava/util/concurrent/ScheduledFuture;


# direct methods
.method public constructor <init>(Lg8/u2;Le8/h2;Ljava/util/concurrent/ScheduledExecutorService;Lq6/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg8/s4;->c:Ljava/lang/Runnable;

    iput-object p2, p0, Lg8/s4;->b:Ljava/util/concurrent/Executor;

    iput-object p3, p0, Lg8/s4;->a:Ljava/util/concurrent/ScheduledExecutorService;

    iput-object p4, p0, Lg8/s4;->d:Lq6/l;

    invoke-virtual {p4}, Lq6/l;->b()V

    return-void
.end method
