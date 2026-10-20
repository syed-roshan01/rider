.class public final synthetic Ll/a3;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroidx/appcompat/widget/Toolbar;


# direct methods
.method public synthetic constructor <init>(Landroidx/appcompat/widget/Toolbar;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Ll/a3;->a:I

    iput-object p1, p0, Ll/a3;->b:Landroidx/appcompat/widget/Toolbar;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget v0, p0, Ll/a3;->a:I

    iget-object v1, p0, Ll/a3;->b:Landroidx/appcompat/widget/Toolbar;

    packed-switch v0, :pswitch_data_0

    iget-object v0, v1, Landroidx/appcompat/widget/Toolbar;->R:Ll/e3;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, v0, Ll/e3;->b:Lk/m;

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lk/m;->collapseActionView()Z

    :cond_1
    return-void

    :pswitch_0
    invoke-virtual {v1}, Landroidx/appcompat/widget/Toolbar;->m()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
