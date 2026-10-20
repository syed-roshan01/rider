.class public final Ll/b2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroidx/appcompat/widget/SearchView;


# direct methods
.method public synthetic constructor <init>(Landroidx/appcompat/widget/SearchView;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Ll/b2;->a:I

    iput-object p1, p0, Ll/b2;->b:Landroidx/appcompat/widget/SearchView;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget v0, p0, Ll/b2;->a:I

    iget-object v1, p0, Ll/b2;->b:Landroidx/appcompat/widget/SearchView;

    packed-switch v0, :pswitch_data_0

    iget-object v0, v1, Landroidx/appcompat/widget/SearchView;->V:Lf3/a;

    instance-of v1, v0, Ll/n2;

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lf3/a;->b(Landroid/database/Cursor;)V

    :cond_0
    return-void

    :pswitch_0
    invoke-virtual {v1}, Landroidx/appcompat/widget/SearchView;->q()V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
