.class public final Lh8/i;
.super Lg8/c;


# static fields
.field public static final l:Li8/b;

.field public static final m:J

.field public static final n:Lg8/l1;


# instance fields
.field public final a:Lg8/n3;

.field public final b:Lg8/k4;

.field public c:Lg8/l1;

.field public d:Lg8/l1;

.field public e:Ljavax/net/ssl/SSLSocketFactory;

.field public final f:Li8/b;

.field public g:I

.field public h:J

.field public final i:J

.field public final j:I

.field public final k:I


# direct methods
.method static constructor <clinit>()V
    .locals 8

    const-class v0, Lh8/i;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    new-instance v0, Ll/t2;

    sget-object v1, Li8/b;->e:Li8/b;

    invoke-direct {v0, v1}, Ll/t2;-><init>(Li8/b;)V

    sget-object v2, Li8/a;->p:Li8/a;

    sget-object v3, Li8/a;->r:Li8/a;

    sget-object v4, Li8/a;->q:Li8/a;

    sget-object v5, Li8/a;->s:Li8/a;

    sget-object v6, Li8/a;->u:Li8/a;

    sget-object v7, Li8/a;->t:Li8/a;

    filled-new-array/range {v2 .. v7}, [Li8/a;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/t2;->a([Li8/a;)V

    sget-object v1, Li8/m;->c:Li8/m;

    filled-new-array {v1}, [Li8/m;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/t2;->b([Li8/m;)V

    iget-boolean v1, v0, Ll/t2;->a:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    iput-boolean v1, v0, Ll/t2;->b:Z

    new-instance v1, Li8/b;

    invoke-direct {v1, v0}, Li8/b;-><init>(Ll/t2;)V

    sput-object v1, Lh8/i;->l:Li8/b;

    sget-object v0, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x3e8

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v0

    sput-wide v0, Lh8/i;->m:J

    new-instance v0, Lr7/e;

    const/16 v1, 0x19

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lr7/e;-><init>(II)V

    new-instance v1, Lg8/l1;

    invoke-direct {v1, v0}, Lg8/l1;-><init>(Lr7/e;)V

    sput-object v1, Lh8/i;->n:Lg8/l1;

    sget-object v0, Le8/j2;->a:Le8/j2;

    sget-object v1, Le8/j2;->b:Le8/j2;

    invoke-static {v0, v1}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "no TLS extensions for cleartext connections"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lg8/e6;->c:Lg8/k4;

    iput-object v0, p0, Lh8/i;->b:Lg8/k4;

    sget-object v0, Lh8/i;->n:Lg8/l1;

    iput-object v0, p0, Lh8/i;->c:Lg8/l1;

    sget-object v0, Lg8/s1;->q:Lr7/e;

    new-instance v1, Lg8/l1;

    invoke-direct {v1, v0}, Lg8/l1;-><init>(Lr7/e;)V

    iput-object v1, p0, Lh8/i;->d:Lg8/l1;

    sget-object v0, Lh8/i;->l:Li8/b;

    iput-object v0, p0, Lh8/i;->f:Li8/b;

    const/4 v0, 0x1

    iput v0, p0, Lh8/i;->g:I

    const-wide v0, 0x7fffffffffffffffL

    iput-wide v0, p0, Lh8/i;->h:J

    sget-wide v0, Lg8/s1;->l:J

    iput-wide v0, p0, Lh8/i;->i:J

    const v0, 0xffff

    iput v0, p0, Lh8/i;->j:I

    const v0, 0x7fffffff

    iput v0, p0, Lh8/i;->k:I

    new-instance v0, Lg8/n3;

    new-instance v1, Lh8/g;

    invoke-direct {v1, p0}, Lh8/g;-><init>(Lh8/i;)V

    new-instance v2, Lk6/w4;

    invoke-direct {v2, p0}, Lk6/w4;-><init>(Lh8/i;)V

    invoke-direct {v0, p1, v1, v2}, Lg8/n3;-><init>(Ljava/lang/String;Lh8/g;Lk6/w4;)V

    iput-object v0, p0, Lh8/i;->a:Lg8/n3;

    return-void
.end method

.method public static forTarget(Ljava/lang/String;)Lh8/i;
    .locals 1

    new-instance v0, Lh8/i;

    invoke-direct {v0, p0}, Lh8/i;-><init>(Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public final b(Ljava/util/concurrent/TimeUnit;)V
    .locals 4

    const-wide/16 v0, 0x1e

    invoke-virtual {p1, v0, v1}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v0

    iput-wide v0, p0, Lh8/i;->h:J

    sget-wide v2, Lg8/q2;->l:J

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    iput-wide v0, p0, Lh8/i;->h:J

    sget-wide v2, Lh8/i;->m:J

    cmp-long p1, v0, v2

    if-ltz p1, :cond_0

    const-wide v0, 0x7fffffffffffffffL

    iput-wide v0, p0, Lh8/i;->h:J

    :cond_0
    return-void
.end method

.method public final c()V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lh8/i;->g:I

    return-void
.end method

.method public scheduledExecutorService(Ljava/util/concurrent/ScheduledExecutorService;)Lh8/i;
    .locals 2

    new-instance v0, Lg8/l1;

    const-string v1, "scheduledExecutorService"

    invoke-static {p1, v1}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-direct {v0, p1}, Lg8/l1;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lh8/i;->d:Lg8/l1;

    return-object p0
.end method

.method public sslSocketFactory(Ljavax/net/ssl/SSLSocketFactory;)Lh8/i;
    .locals 0

    iput-object p1, p0, Lh8/i;->e:Ljavax/net/ssl/SSLSocketFactory;

    const/4 p1, 0x1

    iput p1, p0, Lh8/i;->g:I

    return-object p0
.end method

.method public transportExecutor(Ljava/util/concurrent/Executor;)Lh8/i;
    .locals 1

    if-nez p1, :cond_0

    sget-object p1, Lh8/i;->n:Lg8/l1;

    iput-object p1, p0, Lh8/i;->c:Lg8/l1;

    goto :goto_0

    :cond_0
    new-instance v0, Lg8/l1;

    invoke-direct {v0, p1}, Lg8/l1;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lh8/i;->c:Lg8/l1;

    :goto_0
    return-object p0
.end method
