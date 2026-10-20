.class public final Lg8/p3;
.super Lg8/n1;


# static fields
.field public static final c:Ljava/lang/ref/ReferenceQueue;

.field public static final d:Ljava/util/concurrent/ConcurrentHashMap;

.field public static final e:Ljava/util/logging/Logger;


# instance fields
.field public final b:Lg8/o3;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/ref/ReferenceQueue;

    invoke-direct {v0}, Ljava/lang/ref/ReferenceQueue;-><init>()V

    sput-object v0, Lg8/p3;->c:Ljava/lang/ref/ReferenceQueue;

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sput-object v0, Lg8/p3;->d:Ljava/util/concurrent/ConcurrentHashMap;

    const-class v0, Lg8/p3;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Lg8/p3;->e:Ljava/util/logging/Logger;

    return-void
.end method

.method public constructor <init>(Lg8/l3;)V
    .locals 3

    sget-object v0, Lg8/p3;->c:Ljava/lang/ref/ReferenceQueue;

    sget-object v1, Lg8/p3;->d:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {p0, p1}, Lg8/n1;-><init>(Lg8/l3;)V

    new-instance v2, Lg8/o3;

    invoke-direct {v2, p0, p1, v0, v1}, Lg8/o3;-><init>(Lg8/p3;Lg8/l3;Ljava/lang/ref/ReferenceQueue;Ljava/util/concurrent/ConcurrentHashMap;)V

    iput-object v2, p0, Lg8/p3;->b:Lg8/o3;

    return-void
.end method


# virtual methods
.method public final w()Le8/c1;
    .locals 3

    iget-object v0, p0, Lg8/p3;->b:Lg8/o3;

    iget-object v1, v0, Lg8/o3;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lg8/o3;->clear()V

    :cond_0
    iget-object v0, p0, Lg8/n1;->a:Le8/c1;

    invoke-virtual {v0}, Le8/c1;->w()Le8/c1;

    move-result-object v0

    return-object v0
.end method

.method public final x()Le8/c1;
    .locals 3

    iget-object v0, p0, Lg8/p3;->b:Lg8/o3;

    iget-object v1, v0, Lg8/o3;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lg8/o3;->clear()V

    :cond_0
    iget-object v0, p0, Lg8/n1;->a:Le8/c1;

    invoke-virtual {v0}, Le8/c1;->x()Le8/c1;

    move-result-object v0

    return-object v0
.end method
