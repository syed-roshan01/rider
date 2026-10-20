.class public final Ly/r0;
.super Ld9/j;

# interfaces
.implements Lc9/c;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:F


# direct methods
.method public synthetic constructor <init>(IF)V
    .locals 0

    iput p1, p0, Ly/r0;->a:I

    iput p2, p0, Ly/r0;->b:F

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Ly/r0;->a:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lm2/b;

    iget p1, p0, Ly/r0;->b:F

    invoke-static {p1}, Ld7/t;->p0(F)I

    move-result p1

    const/4 v0, 0x0

    invoke-static {p1, v0}, Li1/b;->c(II)J

    move-result-wide v0

    new-instance p1, Lm2/i;

    invoke-direct {p1, v0, v1}, Lm2/i;-><init>(J)V

    return-object p1

    :pswitch_0
    invoke-static {p1}, La7/a;->w(Ljava/lang/Object;)V

    const/4 p1, 0x0

    packed-switch v0, :pswitch_data_1

    throw p1

    :pswitch_1
    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_1
    .end packed-switch
.end method
