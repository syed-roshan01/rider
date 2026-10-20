.class public final Ln8/g;
.super Ljava/lang/Object;


# instance fields
.field public a:Ln8/j;

.field public volatile b:Lv6/d;

.field public c:Lv6/d;

.field public d:Ljava/lang/Long;

.field public e:I

.field public final f:Ljava/util/HashSet;


# direct methods
.method public constructor <init>(Ln8/j;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lv6/d;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lv6/d;-><init>(Lu/k1;)V

    iput-object v0, p0, Ln8/g;->b:Lv6/d;

    new-instance v0, Lv6/d;

    invoke-direct {v0, v1}, Lv6/d;-><init>(Lu/k1;)V

    iput-object v0, p0, Ln8/g;->c:Lv6/d;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Ln8/g;->f:Ljava/util/HashSet;

    iput-object p1, p0, Ln8/g;->a:Ln8/j;

    return-void
.end method


# virtual methods
.method public final a(Ln8/n;)V
    .locals 4

    invoke-virtual {p0}, Ln8/g;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p1, Ln8/n;->c:Z

    if-nez v0, :cond_0

    invoke-virtual {p1}, Ln8/n;->j()V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ln8/g;->e()Z

    move-result v0

    if-nez v0, :cond_1

    iget-boolean v0, p1, Ln8/n;->c:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    iput-boolean v0, p1, Ln8/n;->c:Z

    iget-object v0, p1, Ln8/n;->d:Le8/y;

    if-eqz v0, :cond_1

    iget-object v1, p1, Ln8/n;->e:Le8/y0;

    invoke-interface {v1, v0}, Le8/y0;->a(Le8/y;)V

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x2

    const-string v2, "Subchannel unejected: {0}"

    iget-object v3, p1, Ln8/n;->f:Le8/i;

    invoke-virtual {v3, v1, v2, v0}, Le8/i;->b(ILjava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    :goto_0
    iput-object p0, p1, Ln8/n;->b:Ln8/g;

    iget-object v0, p0, Ln8/g;->f:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final b(J)V
    .locals 0

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Ln8/g;->d:Ljava/lang/Long;

    iget p1, p0, Ln8/g;->e:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ln8/g;->e:I

    iget-object p1, p0, Ln8/g;->f:Ljava/util/HashSet;

    invoke-virtual {p1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ln8/n;

    invoke-virtual {p2}, Ln8/n;->j()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final c()J
    .locals 4

    iget-object v0, p0, Ln8/g;->c:Lv6/d;

    iget-object v0, v0, Lv6/d;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v0

    iget-object v2, p0, Ln8/g;->c:Lv6/d;

    iget-object v2, v2, Lv6/d;->c:Ljava/lang/Object;

    check-cast v2, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v2

    add-long/2addr v2, v0

    return-wide v2
.end method

.method public final d(Z)V
    .locals 2

    iget-object v0, p0, Ln8/g;->a:Ln8/j;

    iget-object v1, v0, Ln8/j;->e:Lp/a;

    if-nez v1, :cond_0

    iget-object v0, v0, Ln8/j;->f:Lp/a;

    if-nez v0, :cond_0

    return-void

    :cond_0
    if-eqz p1, :cond_1

    iget-object p1, p0, Ln8/g;->b:Lv6/d;

    iget-object p1, p1, Lv6/d;->b:Ljava/lang/Object;

    check-cast p1, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicLong;->getAndIncrement()J

    goto :goto_0

    :cond_1
    iget-object p1, p0, Ln8/g;->b:Lv6/d;

    iget-object p1, p1, Lv6/d;->c:Ljava/lang/Object;

    check-cast p1, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicLong;->getAndIncrement()J

    :goto_0
    return-void
.end method

.method public final e()Z
    .locals 1

    iget-object v0, p0, Ln8/g;->d:Ljava/lang/Long;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final f()D
    .locals 4

    iget-object v0, p0, Ln8/g;->c:Lv6/d;

    iget-object v0, v0, Lv6/d;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v0

    long-to-double v0, v0

    invoke-virtual {p0}, Ln8/g;->c()J

    move-result-wide v2

    long-to-double v2, v2

    div-double/2addr v0, v2

    return-wide v0
.end method

.method public final g()V
    .locals 6

    iget-object v0, p0, Ln8/g;->d:Ljava/lang/Long;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    const-string v2, "not currently ejected"

    invoke-static {v2, v0}, Ly3/e;->N(Ljava/lang/String;Z)V

    const/4 v0, 0x0

    iput-object v0, p0, Ln8/g;->d:Ljava/lang/Long;

    iget-object v0, p0, Ln8/g;->f:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ln8/n;

    iput-boolean v1, v2, Ln8/n;->c:Z

    iget-object v3, v2, Ln8/n;->d:Le8/y;

    if-eqz v3, :cond_1

    iget-object v4, v2, Ln8/n;->e:Le8/y0;

    invoke-interface {v4, v3}, Le8/y0;->a(Le8/y;)V

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v3

    const/4 v4, 0x2

    const-string v5, "Subchannel unejected: {0}"

    iget-object v2, v2, Ln8/n;->f:Le8/i;

    invoke-virtual {v2, v4, v5, v3}, Le8/i;->b(ILjava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "AddressTracker{subchannels="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ln8/g;->f:Ljava/util/HashSet;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
