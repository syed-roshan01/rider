.class public final Lc5/g;
.super Ld9/j;

# interfaces
.implements Lc9/e;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/auto/accept/ui/MainActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/auto/accept/ui/MainActivity;I)V
    .locals 0

    iput p2, p0, Lc5/g;->a:I

    iput-object p1, p0, Lc5/g;->b:Lcom/auto/accept/ui/MainActivity;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lm0/m;I)V
    .locals 3

    iget v0, p0, Lc5/g;->a:I

    iget-object v1, p0, Lc5/g;->b:Lcom/auto/accept/ui/MainActivity;

    const/4 v2, 0x2

    packed-switch v0, :pswitch_data_0

    and-int/lit8 p2, p2, 0xb

    if-ne p2, v2, :cond_1

    move-object p2, p1

    check-cast p2, Lm0/q;

    invoke-virtual {p2}, Lm0/q;->G()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lm0/q;->U()V

    goto :goto_1

    :cond_1
    :goto_0
    new-instance p2, Lc5/g;

    const/4 v0, 0x0

    invoke-direct {p2, v1, v0}, Lc5/g;-><init>(Lcom/auto/accept/ui/MainActivity;I)V

    const v0, 0x5bb35ca1

    invoke-static {p1, v0, p2}, Ld7/t;->K(Lm0/m;ILd9/j;)Lu0/b;

    move-result-object p2

    const/4 v0, 0x6

    invoke-static {p2, p1, v0}, Le5/b;->a(Lc9/e;Lm0/m;I)V

    :goto_1
    return-void

    :pswitch_0
    and-int/lit8 p2, p2, 0xb

    if-ne p2, v2, :cond_3

    move-object p2, p1

    check-cast p2, Lm0/q;

    invoke-virtual {p2}, Lm0/q;->G()Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {p2}, Lm0/q;->U()V

    goto :goto_3

    :cond_3
    :goto_2
    sget p2, Lcom/auto/accept/ui/MainActivity;->n:I

    iget-object p2, v1, Lcom/auto/accept/ui/MainActivity;->e:Landroidx/lifecycle/y0;

    invoke-virtual {p2}, Landroidx/lifecycle/y0;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/auto/accept/ui/viewmodel/MainViewModel;

    const/16 v0, 0x8

    invoke-static {p2, p1, v0}, Ly3/e;->a(Lcom/auto/accept/ui/viewmodel/MainViewModel;Lm0/m;I)V

    :goto_3
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    sget-object v0, Lq8/l;->a:Lq8/l;

    iget v1, p0, Lc5/g;->a:I

    packed-switch v1, :pswitch_data_0

    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lc5/g;->a(Lm0/m;I)V

    return-object v0

    :pswitch_0
    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lc5/g;->a(Lm0/m;I)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
