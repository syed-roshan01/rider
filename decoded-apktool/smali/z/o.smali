.class public final Lz/o;
.super Ld9/j;

# interfaces
.implements Lc9/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lm0/l3;


# direct methods
.method public synthetic constructor <init>(Lm0/l3;I)V
    .locals 0

    iput p2, p0, Lz/o;->a:I

    iput-object p1, p0, Lz/o;->b:Lm0/l3;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lz/o;->a:I

    iget-object v1, p0, Lz/o;->b:Lm0/l3;

    packed-switch v0, :pswitch_data_0

    packed-switch v0, :pswitch_data_1

    sget-object v0, Lh0/k0;->a:Lt/q;

    invoke-interface {v1}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ld1/c;

    iget-wide v0, v0, Ld1/c;->a:J

    goto :goto_0

    :pswitch_0
    invoke-interface {v1}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ld1/c;

    iget-wide v0, v0, Ld1/c;->a:J

    :goto_0
    new-instance v2, Ld1/c;

    invoke-direct {v2, v0, v1}, Ld1/c;-><init>(J)V

    return-object v2

    :pswitch_1
    packed-switch v0, :pswitch_data_2

    sget-object v0, Lh0/k0;->a:Lt/q;

    invoke-interface {v1}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ld1/c;

    iget-wide v0, v0, Ld1/c;->a:J

    goto :goto_1

    :pswitch_2
    invoke-interface {v1}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ld1/c;

    iget-wide v0, v0, Ld1/c;->a:J

    :goto_1
    new-instance v2, Ld1/c;

    invoke-direct {v2, v0, v1}, Ld1/c;-><init>(J)V

    return-object v2

    :pswitch_3
    invoke-interface {v1}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_4
    invoke-interface {v1}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc9/a;

    invoke-interface {v0}, Lc9/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La0/s;

    return-object v0

    :pswitch_5
    new-instance v0, Lz/g;

    invoke-interface {v1}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc9/c;

    invoke-direct {v0, v1}, Lz/g;-><init>(Lc9/c;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_1
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x3
        :pswitch_2
    .end packed-switch
.end method
