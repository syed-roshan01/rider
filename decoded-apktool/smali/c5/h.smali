.class public final Lc5/h;
.super Ld9/j;

# interfaces
.implements Lc9/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroidx/activity/p;


# direct methods
.method public synthetic constructor <init>(Landroidx/activity/p;I)V
    .locals 0

    iput p2, p0, Lc5/h;->a:I

    iput-object p1, p0, Lc5/h;->b:Landroidx/activity/p;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lc5/h;->a:I

    iget-object v1, p0, Lc5/h;->b:Landroidx/activity/p;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {v1}, Landroidx/activity/p;->getViewModelStore()Landroidx/lifecycle/f1;

    move-result-object v0

    return-object v0

    :pswitch_0
    invoke-virtual {v1}, Landroidx/activity/p;->getDefaultViewModelProviderFactory()Landroidx/lifecycle/b1;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
