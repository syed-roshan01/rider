.class public final Lc5/s;
.super Ld9/j;

# interfaces
.implements Lc9/c;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroidx/lifecycle/w;

.field public final synthetic c:Lcom/auto/accept/ui/viewmodel/MainViewModel;


# direct methods
.method public synthetic constructor <init>(Landroidx/lifecycle/w;Lcom/auto/accept/ui/viewmodel/MainViewModel;I)V
    .locals 0

    iput p3, p0, Lc5/s;->a:I

    iput-object p1, p0, Lc5/s;->b:Landroidx/lifecycle/w;

    iput-object p2, p0, Lc5/s;->c:Lcom/auto/accept/ui/viewmodel/MainViewModel;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lm0/o0;)Lm0/n0;
    .locals 4

    iget v0, p0, Lc5/s;->a:I

    iget-object v1, p0, Lc5/s;->b:Landroidx/lifecycle/w;

    iget-object v2, p0, Lc5/s;->c:Lcom/auto/accept/ui/viewmodel/MainViewModel;

    const-string v3, "$this$DisposableEffect"

    packed-switch v0, :pswitch_data_0

    invoke-static {p1, v3}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lc5/q;

    const/4 v0, 0x1

    invoke-direct {p1, v2, v0}, Lc5/q;-><init>(Ljava/lang/Object;I)V

    invoke-interface {v1}, Landroidx/lifecycle/w;->getLifecycle()Landroidx/lifecycle/r;

    move-result-object v2

    invoke-virtual {v2, p1}, Landroidx/lifecycle/r;->a(Landroidx/lifecycle/v;)V

    new-instance v2, Lc5/r;

    invoke-direct {v2, v1, p1, v0}, Lc5/r;-><init>(Landroidx/lifecycle/w;Lc5/q;I)V

    return-object v2

    :pswitch_0
    invoke-static {p1, v3}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lc5/q;

    const/4 v0, 0x0

    invoke-direct {p1, v2, v0}, Lc5/q;-><init>(Ljava/lang/Object;I)V

    invoke-interface {v1}, Landroidx/lifecycle/w;->getLifecycle()Landroidx/lifecycle/r;

    move-result-object v2

    invoke-virtual {v2, p1}, Landroidx/lifecycle/r;->a(Landroidx/lifecycle/v;)V

    new-instance v2, Lc5/r;

    invoke-direct {v2, v1, p1, v0}, Lc5/r;-><init>(Landroidx/lifecycle/w;Lc5/q;I)V

    return-object v2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lc5/s;->a:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lm0/o0;

    invoke-virtual {p0, p1}, Lc5/s;->a(Lm0/o0;)Lm0/n0;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lm0/o0;

    invoke-virtual {p0, p1}, Lc5/s;->a(Lm0/o0;)Lm0/n0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
