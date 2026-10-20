.class public final synthetic Landroidx/fragment/app/e0;
.super Ljava/lang/Object;

# interfaces
.implements La3/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroidx/fragment/app/g0;


# direct methods
.method public synthetic constructor <init>(Landroidx/fragment/app/g0;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Landroidx/fragment/app/e0;->a:I

    iput-object p1, p0, Landroidx/fragment/app/e0;->b:Landroidx/fragment/app/g0;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    iget v0, p0, Landroidx/fragment/app/e0;->a:I

    iget-object v1, p0, Landroidx/fragment/app/e0;->b:Landroidx/fragment/app/g0;

    packed-switch v0, :pswitch_data_0

    check-cast p1, Landroid/content/Intent;

    iget-object p1, v1, Landroidx/fragment/app/g0;->mFragments:Landroidx/fragment/app/l0;

    invoke-virtual {p1}, Landroidx/fragment/app/l0;->a()V

    return-void

    :pswitch_0
    check-cast p1, Landroid/content/res/Configuration;

    iget-object p1, v1, Landroidx/fragment/app/g0;->mFragments:Landroidx/fragment/app/l0;

    invoke-virtual {p1}, Landroidx/fragment/app/l0;->a()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
