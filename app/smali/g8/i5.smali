.class public final Lg8/i5;
.super Ljava/lang/Object;


# instance fields
.field public final a:I

.field public final b:J

.field public final c:J

.field public final d:D

.field public final e:Ljava/lang/Long;

.field public final f:Lr6/t;


# direct methods
.method public constructor <init>(IJJDLjava/lang/Long;Ljava/util/Set;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lg8/i5;->a:I

    iput-wide p2, p0, Lg8/i5;->b:J

    iput-wide p4, p0, Lg8/i5;->c:J

    iput-wide p6, p0, Lg8/i5;->d:D

    iput-object p8, p0, Lg8/i5;->e:Ljava/lang/Long;

    invoke-static {p9}, Lr6/t;->q(Ljava/util/Collection;)Lr6/t;

    move-result-object p1

    iput-object p1, p0, Lg8/i5;->f:Lr6/t;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 6

    instance-of v0, p1, Lg8/i5;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lg8/i5;

    iget v0, p1, Lg8/i5;->a:I

    iget v2, p0, Lg8/i5;->a:I

    if-ne v2, v0, :cond_1

    iget-wide v2, p0, Lg8/i5;->b:J

    iget-wide v4, p1, Lg8/i5;->b:J

    cmp-long v0, v2, v4

    if-nez v0, :cond_1

    iget-wide v2, p0, Lg8/i5;->c:J

    iget-wide v4, p1, Lg8/i5;->c:J

    cmp-long v0, v2, v4

    if-nez v0, :cond_1

    iget-wide v2, p0, Lg8/i5;->d:D

    iget-wide v4, p1, Lg8/i5;->d:D

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Double;->compare(DD)I

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lg8/i5;->e:Ljava/lang/Long;

    iget-object v2, p1, Lg8/i5;->e:Ljava/lang/Long;

    invoke-static {v0, v2}, Ly3/e;->f0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lg8/i5;->f:Lr6/t;

    iget-object p1, p1, Lg8/i5;->f:Lr6/t;

    invoke-static {v0, p1}, Ly3/e;->f0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public final hashCode()I
    .locals 7

    iget v0, p0, Lg8/i5;->a:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget-wide v2, p0, Lg8/i5;->b:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    iget-wide v3, p0, Lg8/i5;->c:J

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    iget-wide v4, p0, Lg8/i5;->d:D

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    iget-object v5, p0, Lg8/i5;->e:Ljava/lang/Long;

    iget-object v6, p0, Lg8/i5;->f:Lr6/t;

    filled-new-array/range {v1 .. v6}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    invoke-static {p0}, Lf6/a;->j0(Ljava/lang/Object;)Lq6/g;

    move-result-object v0

    iget v1, p0, Lg8/i5;->a:I

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "maxAttempts"

    invoke-virtual {v0, v1, v2}, Lq6/g;->d(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "initialBackoffNanos"

    iget-wide v2, p0, Lg8/i5;->b:J

    invoke-virtual {v0, v1, v2, v3}, Lq6/g;->b(Ljava/lang/String;J)V

    const-string v1, "maxBackoffNanos"

    iget-wide v2, p0, Lg8/i5;->c:J

    invoke-virtual {v0, v1, v2, v3}, Lq6/g;->b(Ljava/lang/String;J)V

    iget-wide v1, p0, Lg8/i5;->d:D

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v1

    const-string v2, "backoffMultiplier"

    invoke-virtual {v0, v1, v2}, Lq6/g;->d(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "perAttemptRecvTimeoutNanos"

    iget-object v2, p0, Lg8/i5;->e:Ljava/lang/Long;

    invoke-virtual {v0, v2, v1}, Lq6/g;->a(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lg8/i5;->f:Lr6/t;

    const-string v2, "retryableStatusCodes"

    invoke-virtual {v0, v1, v2}, Lq6/g;->a(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lq6/g;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
