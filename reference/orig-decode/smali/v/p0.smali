.class public final Lv/p0;
.super Lw8/i;

# interfaces
.implements Lc9/f;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(ILu8/e;)V
    .locals 0

    iput p1, p0, Lv/p0;->a:I

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Lw8/i;-><init>(ILu8/e;)V

    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    sget-object v0, Lq8/l;->a:Lq8/l;

    const/4 v1, 0x0

    const/4 v2, 0x2

    iget v3, p0, Lv/p0;->a:I

    packed-switch v3, :pswitch_data_0

    check-cast p1, Lv/l1;

    check-cast p2, Ld1/c;

    iget-wide p1, p2, Ld1/c;->a:J

    check-cast p3, Lu8/e;

    new-instance p1, Lv/p0;

    const/4 p2, 0x3

    invoke-direct {p1, p2, p3}, Lv/p0;-><init>(ILu8/e;)V

    invoke-virtual {p1, v0}, Lv/p0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0

    :pswitch_0
    check-cast p1, Lm9/d0;

    check-cast p2, Ld1/c;

    iget-wide p1, p2, Ld1/c;->a:J

    check-cast p3, Lu8/e;

    packed-switch v3, :pswitch_data_1

    new-instance p1, Lv/p0;

    invoke-direct {p1, v2, p3}, Lv/p0;-><init>(ILu8/e;)V

    invoke-virtual {p1, v0}, Lv/p0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :pswitch_1
    new-instance p1, Lv/p0;

    invoke-direct {p1, v1, p3}, Lv/p0;-><init>(ILu8/e;)V

    invoke-virtual {p1, v0}, Lv/p0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    return-object v0

    :pswitch_2
    check-cast p1, Lm9/d0;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    check-cast p3, Lu8/e;

    new-instance p1, Lv/p0;

    const/4 p2, 0x1

    invoke-direct {p1, p2, p3}, Lv/p0;-><init>(ILu8/e;)V

    invoke-virtual {p1, v0}, Lv/p0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0

    :pswitch_3
    check-cast p1, Lm9/d0;

    check-cast p2, Ld1/c;

    iget-wide p1, p2, Ld1/c;->a:J

    check-cast p3, Lu8/e;

    packed-switch v3, :pswitch_data_2

    new-instance p1, Lv/p0;

    invoke-direct {p1, v2, p3}, Lv/p0;-><init>(ILu8/e;)V

    invoke-virtual {p1, v0}, Lv/p0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :pswitch_4
    new-instance p1, Lv/p0;

    invoke-direct {p1, v1, p3}, Lv/p0;-><init>(ILu8/e;)V

    invoke-virtual {p1, v0}, Lv/p0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_1
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_4
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    sget-object v0, Lq8/l;->a:Lq8/l;

    iget v1, p0, Lv/p0;->a:I

    packed-switch v1, :pswitch_data_0

    sget-object v1, Lv8/a;->a:Lv8/a;

    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    return-object v0

    :pswitch_0
    sget-object v1, Lv8/a;->a:Lv8/a;

    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    return-object v0

    :pswitch_1
    sget-object v1, Lv8/a;->a:Lv8/a;

    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    return-object v0

    :pswitch_2
    sget-object v1, Lv8/a;->a:Lv8/a;

    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
