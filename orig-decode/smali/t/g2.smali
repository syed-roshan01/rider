.class public final Lt/g2;
.super Ljava/lang/Object;

# interfaces
.implements Lt/b2;


# instance fields
.field public final synthetic a:Lt/c2;


# direct methods
.method public constructor <init>(FFLt/t;)V
    .locals 1

    if-eqz p3, :cond_0

    new-instance v0, La4/c0;

    invoke-direct {v0, p1, p2, p3}, La4/c0;-><init>(FFLt/t;)V

    goto :goto_0

    :cond_0
    new-instance v0, La4/c0;

    invoke-direct {v0, p1, p2}, La4/c0;-><init>(FF)V

    :goto_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Lt/c2;

    invoke-direct {p1, v0}, Lt/c2;-><init>(La4/c0;)V

    iput-object p1, p0, Lt/g2;->a:Lt/c2;

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    iget-object v0, p0, Lt/g2;->a:Lt/c2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    return v0
.end method

.method public final b(Lt/t;Lt/t;Lt/t;)J
    .locals 1

    iget-object v0, p0, Lt/g2;->a:Lt/c2;

    invoke-virtual {v0, p1, p2, p3}, Lt/c2;->b(Lt/t;Lt/t;Lt/t;)J

    move-result-wide p1

    return-wide p1
.end method

.method public final c(JLt/t;Lt/t;Lt/t;)Lt/t;
    .locals 6

    iget-object v0, p0, Lt/g2;->a:Lt/c2;

    move-wide v1, p1

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Lt/c2;->c(JLt/t;Lt/t;Lt/t;)Lt/t;

    move-result-object p1

    return-object p1
.end method

.method public final d(JLt/t;Lt/t;Lt/t;)Lt/t;
    .locals 6

    iget-object v0, p0, Lt/g2;->a:Lt/c2;

    move-wide v1, p1

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Lt/c2;->d(JLt/t;Lt/t;Lt/t;)Lt/t;

    move-result-object p1

    return-object p1
.end method

.method public final g(Lt/t;Lt/t;Lt/t;)Lt/t;
    .locals 1

    iget-object v0, p0, Lt/g2;->a:Lt/c2;

    invoke-virtual {v0, p1, p2, p3}, Lt/c2;->g(Lt/t;Lt/t;Lt/t;)Lt/t;

    move-result-object p1

    return-object p1
.end method
