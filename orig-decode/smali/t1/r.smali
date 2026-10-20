.class public final Lt1/r;
.super Ljava/lang/Object;


# instance fields
.field public final a:Lt1/q;

.field public final b:Lt1/q;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lt1/q;

    invoke-direct {v0}, Lt1/q;-><init>()V

    iput-object v0, p0, Lt1/r;->a:Lt1/q;

    new-instance v0, Lt1/q;

    invoke-direct {v0}, Lt1/q;-><init>()V

    iput-object v0, p0, Lt1/r;->b:Lt1/q;

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/node/a;Z)V
    .locals 1

    iget-object v0, p0, Lt1/r;->a:Lt1/q;

    if-eqz p2, :cond_0

    invoke-virtual {v0, p1}, Lt1/q;->a(Landroidx/compose/ui/node/a;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1}, Lt1/q;->b(Landroidx/compose/ui/node/a;)Z

    move-result p2

    if-nez p2, :cond_1

    iget-object p2, p0, Lt1/r;->b:Lt1/q;

    invoke-virtual {p2, p1}, Lt1/q;->a(Landroidx/compose/ui/node/a;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final b()Z
    .locals 2

    iget-object v0, p0, Lt1/r;->b:Lt1/q;

    iget-object v0, v0, Lt1/q;->c:Lt1/v1;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, Lt1/r;->a:Lt1/q;

    iget-object v0, v0, Lt1/q;->c:Lt1/v1;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    xor-int/2addr v0, v1

    return v0
.end method
