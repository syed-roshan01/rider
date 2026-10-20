.class public final Ll/h1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ll/o1;


# direct methods
.method public synthetic constructor <init>(Ll/o1;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Ll/h1;->a:I

    iput-object p1, p0, Ll/h1;->b:Ll/o1;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget v0, p0, Ll/h1;->a:I

    iget-object v1, p0, Ll/h1;->b:Ll/o1;

    packed-switch v0, :pswitch_data_0

    iget-object v0, v1, Ll/o1;->c:Ll/t1;

    if-eqz v0, :cond_0

    sget-object v2, Lb3/q0;->a:Ljava/lang/reflect/Field;

    invoke-static {v0}, Lb3/e0;->b(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, v1, Ll/o1;->c:Ll/t1;

    invoke-virtual {v0}, Landroid/widget/AdapterView;->getCount()I

    move-result v0

    iget-object v2, v1, Ll/o1;->c:Ll/t1;

    invoke-virtual {v2}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v2

    if-le v0, v2, :cond_0

    iget-object v0, v1, Ll/o1;->c:Ll/t1;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const v2, 0x7fffffff

    if-gt v0, v2, :cond_0

    iget-object v0, v1, Ll/o1;->C:Ll/y;

    const/4 v2, 0x2

    invoke-virtual {v0, v2}, Landroid/widget/PopupWindow;->setInputMethodMode(I)V

    invoke-virtual {v1}, Ll/o1;->e()V

    :cond_0
    return-void

    :pswitch_0
    iget-object v0, v1, Ll/o1;->c:Ll/t1;

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ll/b1;->setListSelectionHidden(Z)V

    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    :cond_1
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
