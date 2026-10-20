.class public final Lv4/a;
.super Ljava/lang/Object;

# interfaces
.implements Lv4/b;


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 0

    instance-of p1, p1, Lv4/a;

    return p1
.end method

.method public final hashCode()I
    .locals 1

    const-class v0, Lv4/a;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method
