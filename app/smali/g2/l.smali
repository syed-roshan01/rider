.class public final Lg2/l;
.super Ljava/lang/Object;

# interfaces
.implements Lg2/i;


# virtual methods
.method public final a(Lg2/k;)V
    .locals 1

    const/4 v0, -0x1

    iput v0, p1, Lg2/k;->d:I

    iput v0, p1, Lg2/k;->e:I

    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 0

    instance-of p1, p1, Lg2/l;

    return p1
.end method

.method public final hashCode()I
    .locals 1

    const-class v0, Lg2/l;

    invoke-static {v0}, Ld9/v;->a(Ljava/lang/Class;)Ld9/e;

    move-result-object v0

    invoke-virtual {v0}, Ld9/e;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "FinishComposingTextCommand()"

    return-object v0
.end method
