.class public final Lc5/k;
.super Ld9/j;

# interfaces
.implements Lc9/e;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/auto/accept/ui/viewmodel/MainViewModel;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Lcom/auto/accept/ui/viewmodel/MainViewModel;II)V
    .locals 0

    iput p3, p0, Lc5/k;->a:I

    iput-object p1, p0, Lc5/k;->b:Lcom/auto/accept/ui/viewmodel/MainViewModel;

    iput p2, p0, Lc5/k;->c:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lm0/m;I)V
    .locals 2

    iget p2, p0, Lc5/k;->a:I

    iget-object v0, p0, Lc5/k;->b:Lcom/auto/accept/ui/viewmodel/MainViewModel;

    iget v1, p0, Lc5/k;->c:I

    packed-switch p2, :pswitch_data_0

    or-int/lit8 p2, v1, 0x1

    invoke-static {p2}, Lm0/s;->m(I)I

    move-result p2

    invoke-static {v0, p1, p2}, Ld5/o1;->k(Lcom/auto/accept/ui/viewmodel/MainViewModel;Lm0/m;I)V

    return-void

    :pswitch_0
    or-int/lit8 p2, v1, 0x1

    invoke-static {p2}, Lm0/s;->m(I)I

    move-result p2

    invoke-static {v0, p1, p2}, Ld5/o1;->f(Lcom/auto/accept/ui/viewmodel/MainViewModel;Lm0/m;I)V

    return-void

    :pswitch_1
    or-int/lit8 p2, v1, 0x1

    invoke-static {p2}, Lm0/s;->m(I)I

    move-result p2

    invoke-static {v0, p1, p2}, Ld5/o1;->f(Lcom/auto/accept/ui/viewmodel/MainViewModel;Lm0/m;I)V

    return-void

    :pswitch_2
    or-int/lit8 p2, v1, 0x1

    invoke-static {p2}, Lm0/s;->m(I)I

    move-result p2

    invoke-static {v0, p1, p2}, Ld5/o1;->e(Lcom/auto/accept/ui/viewmodel/MainViewModel;Lm0/m;I)V

    return-void

    :pswitch_3
    or-int/lit8 p2, v1, 0x1

    invoke-static {p2}, Lm0/s;->m(I)I

    move-result p2

    invoke-static {v0, p1, p2}, Ly3/e;->z(Lcom/auto/accept/ui/viewmodel/MainViewModel;Lm0/m;I)V

    return-void

    :pswitch_4
    or-int/lit8 p2, v1, 0x1

    invoke-static {p2}, Lm0/s;->m(I)I

    move-result p2

    invoke-static {v0, p1, p2}, Ly3/e;->b(Lcom/auto/accept/ui/viewmodel/MainViewModel;Lm0/m;I)V

    return-void

    :pswitch_5
    or-int/lit8 p2, v1, 0x1

    invoke-static {p2}, Lm0/s;->m(I)I

    move-result p2

    invoke-static {v0, p1, p2}, Ly3/e;->a(Lcom/auto/accept/ui/viewmodel/MainViewModel;Lm0/m;I)V

    return-void

    :pswitch_6
    or-int/lit8 p2, v1, 0x1

    invoke-static {p2}, Lm0/s;->m(I)I

    move-result p2

    invoke-static {v0, p1, p2}, Ly3/e;->a(Lcom/auto/accept/ui/viewmodel/MainViewModel;Lm0/m;I)V

    return-void

    :pswitch_7
    or-int/lit8 p2, v1, 0x1

    invoke-static {p2}, Lm0/s;->m(I)I

    move-result p2

    invoke-static {v0, p1, p2}, Ly3/e;->a(Lcom/auto/accept/ui/viewmodel/MainViewModel;Lm0/m;I)V

    return-void

    :pswitch_8
    or-int/lit8 p2, v1, 0x1

    invoke-static {p2}, Lm0/s;->m(I)I

    move-result p2

    invoke-static {v0, p1, p2}, Ly3/e;->a(Lcom/auto/accept/ui/viewmodel/MainViewModel;Lm0/m;I)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    sget-object v0, Lq8/l;->a:Lq8/l;

    iget v1, p0, Lc5/k;->a:I

    packed-switch v1, :pswitch_data_0

    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lc5/k;->a(Lm0/m;I)V

    return-object v0

    :pswitch_0
    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lc5/k;->a(Lm0/m;I)V

    return-object v0

    :pswitch_1
    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lc5/k;->a(Lm0/m;I)V

    return-object v0

    :pswitch_2
    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lc5/k;->a(Lm0/m;I)V

    return-object v0

    :pswitch_3
    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lc5/k;->a(Lm0/m;I)V

    return-object v0

    :pswitch_4
    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lc5/k;->a(Lm0/m;I)V

    return-object v0

    :pswitch_5
    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lc5/k;->a(Lm0/m;I)V

    return-object v0

    :pswitch_6
    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lc5/k;->a(Lm0/m;I)V

    return-object v0

    :pswitch_7
    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lc5/k;->a(Lm0/m;I)V

    return-object v0

    :pswitch_8
    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lc5/k;->a(Lm0/m;I)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
