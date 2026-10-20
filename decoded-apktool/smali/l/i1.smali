.class public final Ll/i1;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/widget/AdapterView$OnItemSelectedListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Ll/i1;->a:I

    iput-object p1, p0, Ll/i1;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final onItemSelected(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0

    iget p1, p0, Ll/i1;->a:I

    iget-object p2, p0, Ll/i1;->b:Ljava/lang/Object;

    packed-switch p1, :pswitch_data_0

    check-cast p2, Landroidx/appcompat/widget/SearchView;

    invoke-virtual {p2, p3}, Landroidx/appcompat/widget/SearchView;->m(I)V

    return-void

    :pswitch_0
    const/4 p1, -0x1

    if-eq p3, p1, :cond_0

    check-cast p2, Ll/o1;

    iget-object p1, p2, Ll/o1;->c:Ll/t1;

    if-eqz p1, :cond_0

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Ll/b1;->setListSelectionHidden(Z)V

    :cond_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onNothingSelected(Landroid/widget/AdapterView;)V
    .locals 0

    return-void
.end method
