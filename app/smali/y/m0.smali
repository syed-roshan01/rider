.class public final Ly/m0;
.super Ly0/n;

# interfaces
.implements Lt1/o1;


# instance fields
.field public u:F

.field public v:Z


# virtual methods
.method public final h0(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

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
    iget v0, p0, Ly/m0;->u:F

    iput v0, p1, Ly/y0;->a:F

    iget-boolean v0, p0, Ly/m0;->v:Z

    iput-boolean v0, p1, Ly/y0;->b:Z

    return-object p1
.end method
