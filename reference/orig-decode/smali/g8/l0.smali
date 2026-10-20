.class public final Lg8/l0;
.super Ljava/lang/Object;


# instance fields
.field public a:Ljava/lang/String;

.field public b:Le8/c;

.field public c:Ljava/lang/String;

.field public d:Le8/k0;


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lg8/l0;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lg8/l0;

    iget-object v0, p0, Lg8/l0;->a:Ljava/lang/String;

    iget-object v2, p1, Lg8/l0;->a:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lg8/l0;->b:Le8/c;

    iget-object v2, p1, Lg8/l0;->b:Le8/c;

    invoke-virtual {v0, v2}, Le8/c;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lg8/l0;->c:Ljava/lang/String;

    iget-object v2, p1, Lg8/l0;->c:Ljava/lang/String;

    invoke-static {v0, v2}, Ly3/e;->f0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lg8/l0;->d:Le8/k0;

    iget-object p1, p1, Lg8/l0;->d:Le8/k0;

    invoke-static {v0, p1}, Ly3/e;->f0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public final hashCode()I
    .locals 4

    iget-object v0, p0, Lg8/l0;->a:Ljava/lang/String;

    iget-object v1, p0, Lg8/l0;->b:Le8/c;

    iget-object v2, p0, Lg8/l0;->c:Ljava/lang/String;

    iget-object v3, p0, Lg8/l0;->d:Le8/k0;

    filled-new-array {v0, v1, v2, v3}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method
