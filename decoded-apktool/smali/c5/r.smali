.class public final Lc5/r;
.super Ljava/lang/Object;

# interfaces
.implements Lm0/n0;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroidx/lifecycle/w;

.field public final synthetic c:Landroidx/lifecycle/u;


# direct methods
.method public synthetic constructor <init>(Landroidx/lifecycle/w;Lc5/q;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p3, p0, Lc5/r;->a:I

    iput-object p1, p0, Lc5/r;->b:Landroidx/lifecycle/w;

    iput-object p2, p0, Lc5/r;->c:Landroidx/lifecycle/u;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget v0, p0, Lc5/r;->a:I

    iget-object v1, p0, Lc5/r;->c:Landroidx/lifecycle/u;

    iget-object v2, p0, Lc5/r;->b:Landroidx/lifecycle/w;

    packed-switch v0, :pswitch_data_0

    invoke-interface {v2}, Landroidx/lifecycle/w;->getLifecycle()Landroidx/lifecycle/r;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroidx/lifecycle/r;->c(Landroidx/lifecycle/v;)V

    return-void

    :pswitch_0
    invoke-interface {v2}, Landroidx/lifecycle/w;->getLifecycle()Landroidx/lifecycle/r;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroidx/lifecycle/r;->c(Landroidx/lifecycle/v;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
