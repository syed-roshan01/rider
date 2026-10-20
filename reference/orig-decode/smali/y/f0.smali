.class public final Ly/f0;
.super Ly0/n;

# interfaces
.implements Lt1/o1;


# instance fields
.field public u:Ly0/b;


# virtual methods
.method public final h0(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    instance-of v0, p1, Ly/y0;

    if-eqz v0, :cond_0

    check-cast p1, Ly/y0;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_1

    new-instance p1, Ly/y0;

    invoke-direct {p1}, Ly/y0;-><init>()V

    :cond_1
    iget-object v0, p0, Ly/f0;->u:Ly0/b;

    new-instance v1, Ly/y;

    invoke-direct {v1, v0}, Ly/y;-><init>(Ly0/b;)V

    iput-object v1, p1, Ly/y0;->c:Ly/a0;

    return-object p1
.end method
