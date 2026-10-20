.class public final Lt/t1;
.super Ld9/j;

# interfaces
.implements Lc9/e;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lt/u1;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(Lt/u1;Ljava/lang/Object;II)V
    .locals 0

    iput p4, p0, Lt/t1;->a:I

    iput-object p1, p0, Lt/t1;->b:Lt/u1;

    iput-object p2, p0, Lt/t1;->c:Ljava/lang/Object;

    iput p3, p0, Lt/t1;->d:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    sget-object v0, Lq8/l;->a:Lq8/l;

    iget v1, p0, Lt/t1;->d:I

    iget-object v2, p0, Lt/t1;->b:Lt/u1;

    iget-object v3, p0, Lt/t1;->c:Ljava/lang/Object;

    iget v4, p0, Lt/t1;->a:I

    packed-switch v4, :pswitch_data_0

    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    packed-switch v4, :pswitch_data_1

    or-int/lit8 p2, v1, 0x1

    invoke-static {p2}, Lm0/s;->m(I)I

    move-result p2

    invoke-virtual {v2, v3, p1, p2}, Lt/u1;->h(Ljava/lang/Object;Lm0/m;I)V

    goto :goto_0

    :pswitch_0
    or-int/lit8 p2, v1, 0x1

    invoke-static {p2}, Lm0/s;->m(I)I

    move-result p2

    invoke-virtual {v2, v3, p1, p2}, Lt/u1;->a(Ljava/lang/Object;Lm0/m;I)V

    :goto_0
    return-object v0

    :pswitch_1
    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    packed-switch v4, :pswitch_data_2

    or-int/lit8 p2, v1, 0x1

    invoke-static {p2}, Lm0/s;->m(I)I

    move-result p2

    invoke-virtual {v2, v3, p1, p2}, Lt/u1;->h(Ljava/lang/Object;Lm0/m;I)V

    goto :goto_1

    :pswitch_2
    or-int/lit8 p2, v1, 0x1

    invoke-static {p2}, Lm0/s;->m(I)I

    move-result p2

    invoke-virtual {v2, v3, p1, p2}, Lt/u1;->a(Ljava/lang/Object;Lm0/m;I)V

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
