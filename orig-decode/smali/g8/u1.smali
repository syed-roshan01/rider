.class public final Lg8/u1;
.super Ljava/lang/Object;


# instance fields
.field public final a:I

.field public final b:J

.field public final c:Lr6/t;


# direct methods
.method public constructor <init>(IJLjava/util/Set;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lg8/u1;->a:I

    iput-wide p2, p0, Lg8/u1;->b:J

    invoke-static {p4}, Lr6/t;->q(Ljava/util/Collection;)Lr6/t;

    move-result-object p1

    iput-object p1, p0, Lg8/u1;->c:Lr6/t;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 6

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    const-class v3, Lg8/u1;

    if-eq v3, v2, :cond_1

    goto :goto_1

    :cond_1
    check-cast p1, Lg8/u1;

    iget v2, p0, Lg8/u1;->a:I

    iget v3, p1, Lg8/u1;->a:I

    if-ne v2, v3, :cond_2

    iget-wide v2, p0, Lg8/u1;->b:J

    iget-wide v4, p1, Lg8/u1;->b:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_2

    iget-object v2, p0, Lg8/u1;->c:Lr6/t;

    iget-object p1, p1, Lg8/u1;->c:Lr6/t;

    invoke-static {v2, p1}, Ly3/e;->f0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    move v0, v1

    :goto_0
    return v0

    :cond_3
    :goto_1
    return v1
.end method

.method public final hashCode()I
    .locals 3

    iget v0, p0, Lg8/u1;->a:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-wide v1, p0, Lg8/u1;->b:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    iget-object v2, p0, Lg8/u1;->c:Lr6/t;

    filled-new-array {v0, v1, v2}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    invoke-static {p0}, Lf6/a;->j0(Ljava/lang/Object;)Lq6/g;

    move-result-object v0

    iget v1, p0, Lg8/u1;->a:I

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "maxAttempts"

    invoke-virtual {v0, v1, v2}, Lq6/g;->d(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "hedgingDelayNanos"

    iget-wide v2, p0, Lg8/u1;->b:J

    invoke-virtual {v0, v1, v2, v3}, Lq6/g;->b(Ljava/lang/String;J)V

    iget-object v1, p0, Lg8/u1;->c:Lr6/t;

    const-string v2, "nonFatalStatusCodes"

    invoke-virtual {v0, v1, v2}, Lq6/g;->a(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lq6/g;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
