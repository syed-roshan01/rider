.class public final Lg8/t5;
.super Ljava/lang/Object;


# instance fields
.field public final a:Le8/a1;

.field public final b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Le8/a1;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg8/t5;->a:Le8/a1;

    iput-object p2, p0, Lg8/t5;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    const-class v3, Lg8/t5;

    if-eq v3, v2, :cond_1

    goto :goto_1

    :cond_1
    check-cast p1, Lg8/t5;

    iget-object v2, p0, Lg8/t5;->a:Le8/a1;

    iget-object v3, p1, Lg8/t5;->a:Le8/a1;

    invoke-static {v2, v3}, Ly3/e;->f0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lg8/t5;->b:Ljava/lang/Object;

    iget-object p1, p1, Lg8/t5;->b:Ljava/lang/Object;

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
    .locals 2

    iget-object v0, p0, Lg8/t5;->a:Le8/a1;

    iget-object v1, p0, Lg8/t5;->b:Ljava/lang/Object;

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Lf6/a;->j0(Ljava/lang/Object;)Lq6/g;

    move-result-object v0

    const-string v1, "provider"

    iget-object v2, p0, Lg8/t5;->a:Le8/a1;

    invoke-virtual {v0, v2, v1}, Lq6/g;->a(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "config"

    iget-object v2, p0, Lg8/t5;->b:Ljava/lang/Object;

    invoke-virtual {v0, v2, v1}, Lq6/g;->a(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lq6/g;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
