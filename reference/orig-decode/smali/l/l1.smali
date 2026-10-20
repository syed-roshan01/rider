.class public final Ll/l1;
.super Landroid/database/DataSetObserver;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Ll/l1;->a:I

    iput-object p1, p0, Ll/l1;->b:Ljava/lang/Object;

    invoke-direct {p0}, Landroid/database/DataSetObserver;-><init>()V

    return-void
.end method


# virtual methods
.method public final onChanged()V
    .locals 2

    iget v0, p0, Ll/l1;->a:I

    iget-object v1, p0, Ll/l1;->b:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v1, Lf3/a;

    const/4 v0, 0x1

    iput-boolean v0, v1, Lf3/a;->a:Z

    invoke-virtual {v1}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    return-void

    :pswitch_0
    check-cast v1, Ll/o1;

    iget-object v0, v1, Ll/o1;->C:Ll/y;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {v1}, Ll/o1;->e()V

    :cond_0
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onInvalidated()V
    .locals 2

    iget v0, p0, Ll/l1;->a:I

    iget-object v1, p0, Ll/l1;->b:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v1, Lf3/a;

    const/4 v0, 0x0

    iput-boolean v0, v1, Lf3/a;->a:Z

    invoke-virtual {v1}, Landroid/widget/BaseAdapter;->notifyDataSetInvalidated()V

    return-void

    :pswitch_0
    check-cast v1, Ll/o1;

    invoke-virtual {v1}, Ll/o1;->dismiss()V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
