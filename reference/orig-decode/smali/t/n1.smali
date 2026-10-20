.class public final Lt/n1;
.super Ljava/lang/Object;


# instance fields
.field public final a:Lt/x1;

.field public final b:Lm0/n1;

.field public final synthetic c:Lt/u1;


# direct methods
.method public constructor <init>(Lt/u1;Lt/x1;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt/n1;->c:Lt/u1;

    iput-object p2, p0, Lt/n1;->a:Lt/x1;

    sget-object p1, Lm0/o3;->a:Lm0/o3;

    const/4 p2, 0x0

    invoke-static {p2, p1}, Ld7/t;->g0(Ljava/lang/Object;Lm0/z2;)Lm0/n1;

    move-result-object p1

    iput-object p1, p0, Lt/n1;->b:Lm0/n1;

    return-void
.end method


# virtual methods
.method public final a(Lc9/c;Lc9/c;)Lt/m1;
    .locals 8

    iget-object v0, p0, Lt/n1;->b:Lm0/n1;

    invoke-virtual {v0}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lt/m1;

    iget-object v2, p0, Lt/n1;->c:Lt/u1;

    if-nez v1, :cond_0

    new-instance v1, Lt/m1;

    new-instance v3, Lt/q1;

    invoke-virtual {v2}, Lt/u1;->b()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {p2, v4}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v2}, Lt/u1;->b()Ljava/lang/Object;

    move-result-object v5

    invoke-interface {p2, v5}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iget-object v6, p0, Lt/n1;->a:Lt/x1;

    iget-object v7, v6, Lt/x1;->a:Lc9/c;

    invoke-interface {v7, v5}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lt/t;

    invoke-virtual {v5}, Lt/t;->d()V

    invoke-direct {v3, v2, v4, v5, v6}, Lt/q1;-><init>(Lt/u1;Ljava/lang/Object;Lt/t;Lt/x1;)V

    invoke-direct {v1, p0, v3, p1, p2}, Lt/m1;-><init>(Lt/n1;Lt/q1;Lc9/c;Lc9/c;)V

    invoke-virtual {v0, v1}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    iget-object v0, v2, Lt/u1;->h:Lw0/u;

    invoke-virtual {v0, v3}, Lw0/u;->add(Ljava/lang/Object;)Z

    :cond_0
    iput-object p2, v1, Lt/m1;->c:Lc9/c;

    iput-object p1, v1, Lt/m1;->b:Lc9/c;

    invoke-virtual {v2}, Lt/u1;->c()Lt/o1;

    move-result-object p1

    invoke-virtual {v1, p1}, Lt/m1;->b(Lt/o1;)V

    return-object v1
.end method
