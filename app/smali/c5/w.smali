.class public final Lc5/w;
.super Ld9/j;

# interfaces
.implements Lc9/e;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(II)V
    .locals 0

    iput p2, p0, Lc5/w;->a:I

    iput p1, p0, Lc5/w;->b:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    sget-object v0, Lq8/l;->a:Lq8/l;

    iget v1, p0, Lc5/w;->b:I

    iget v2, p0, Lc5/w;->a:I

    packed-switch v2, :pswitch_data_0

    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    packed-switch v2, :pswitch_data_1

    or-int/lit8 p2, v1, 0x1

    invoke-static {p2}, Lm0/s;->m(I)I

    move-result p2

    invoke-static {p1, p2}, Ly3/e;->x(Lm0/m;I)V

    goto :goto_0

    :pswitch_0
    or-int/lit8 p2, v1, 0x1

    invoke-static {p2}, Lm0/s;->m(I)I

    move-result p2

    invoke-static {p1, p2}, Ly3/e;->d(Lm0/m;I)V

    :goto_0
    return-object v0

    :pswitch_1
    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    packed-switch v2, :pswitch_data_2

    or-int/lit8 p2, v1, 0x1

    invoke-static {p2}, Lm0/s;->m(I)I

    move-result p2

    invoke-static {p1, p2}, Ly3/e;->x(Lm0/m;I)V

    goto :goto_1

    :pswitch_2
    or-int/lit8 p2, v1, 0x1

    invoke-static {p2}, Lm0/s;->m(I)I

    move-result p2

    invoke-static {p1, p2}, Ly3/e;->d(Lm0/m;I)V

    :goto_1
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_2
    .end packed-switch
.end method
