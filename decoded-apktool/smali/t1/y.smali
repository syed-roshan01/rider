.class public final Lt1/y;
.super Ljava/lang/Object;


# instance fields
.field public final a:Landroidx/compose/ui/node/a;

.field public final b:Lm0/n1;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/node/a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt1/y;->a:Landroidx/compose/ui/node/a;

    sget-object p1, Lm0/o3;->a:Lm0/o3;

    const/4 v0, 0x0

    invoke-static {v0, p1}, Ld7/t;->g0(Ljava/lang/Object;Lm0/z2;)Lm0/n1;

    move-result-object p1

    iput-object p1, p0, Lt1/y;->b:Lm0/n1;

    return-void
.end method


# virtual methods
.method public final a()Lr1/j0;
    .locals 2

    iget-object v0, p0, Lt1/y;->b:Lm0/n1;

    invoke-virtual {v0}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lr1/j0;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Intrinsic size is queried but there is no measure policy in place."

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
