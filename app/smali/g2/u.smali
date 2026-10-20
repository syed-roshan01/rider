.class public final Lg2/u;
.super Ljava/lang/Object;

# interfaces
.implements Lg2/l0;


# instance fields
.field public final a:C


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x2022

    iput-char v0, p0, Lg2/u;->a:C

    return-void
.end method


# virtual methods
.method public final a(La2/e;)Lg2/i0;
    .locals 4

    new-instance v0, Lg2/i0;

    new-instance v1, La2/e;

    iget-char v2, p0, Lg2/u;->a:C

    invoke-static {v2}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v2

    iget-object p1, p1, La2/e;->a:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    invoke-static {p1, v2}, Ll9/i;->b1(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v2, 0x0

    const/4 v3, 0x6

    invoke-direct {v1, p1, v2, v3}, La2/e;-><init>(Ljava/lang/String;Ljava/util/ArrayList;I)V

    sget-object p1, Lg2/r;->a:Lg2/k0;

    invoke-direct {v0, v1, p1}, Lg2/i0;-><init>(La2/e;Lg2/s;)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lg2/u;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lg2/u;

    iget-char p1, p1, Lg2/u;->a:C

    iget-char v1, p0, Lg2/u;->a:C

    if-eq v1, p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final hashCode()I
    .locals 1

    iget-char v0, p0, Lg2/u;->a:C

    invoke-static {v0}, Ljava/lang/Character;->hashCode(C)I

    move-result v0

    return v0
.end method
