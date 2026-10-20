.class public final Ls1/j;
.super Lf6/a;


# instance fields
.field public final A:Lm0/n1;

.field public final z:Ls1/c;


# direct methods
.method public constructor <init>(Ls1/c;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls1/j;->z:Ls1/c;

    sget-object p1, Lm0/o3;->a:Lm0/o3;

    const/4 v0, 0x0

    invoke-static {v0, p1}, Ld7/t;->g0(Ljava/lang/Object;Lm0/z2;)Lm0/n1;

    move-result-object p1

    iput-object p1, p0, Ls1/j;->A:Lm0/n1;

    return-void
.end method


# virtual methods
.method public final B(Ls1/c;)Z
    .locals 1

    iget-object v0, p0, Ls1/j;->z:Ls1/c;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final I(Ls1/i;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ls1/j;->z:Ls1/c;

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Ls1/j;->A:Lm0/n1;

    invoke-virtual {p1}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    :cond_0
    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Check failed."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
