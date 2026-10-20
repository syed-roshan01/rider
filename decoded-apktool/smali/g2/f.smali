.class public final Lg2/f;
.super Ljava/lang/Object;

# interfaces
.implements Lg2/i;


# virtual methods
.method public final a(Lg2/k;)V
    .locals 3

    iget-object v0, p1, Lg2/k;->a:Lg2/t;

    invoke-virtual {v0}, Lg2/t;->a()I

    move-result v0

    const-string v1, ""

    const/4 v2, 0x0

    invoke-virtual {p1, v2, v0, v1}, Lg2/k;->d(IILjava/lang/String;)V

    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 0

    instance-of p1, p1, Lg2/f;

    return p1
.end method

.method public final hashCode()I
    .locals 1

    const-class v0, Lg2/f;

    invoke-static {v0}, Ld9/v;->a(Ljava/lang/Class;)Ld9/e;

    move-result-object v0

    invoke-virtual {v0}, Ld9/e;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "DeleteAllCommand()"

    return-object v0
.end method
