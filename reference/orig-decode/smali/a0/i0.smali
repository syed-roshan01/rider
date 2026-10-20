.class public final La0/i0;
.super Ld9/j;

# interfaces
.implements Lc9/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:La0/h0;


# direct methods
.method public synthetic constructor <init>(La0/h0;I)V
    .locals 0

    iput p2, p0, La0/i0;->a:I

    iput-object p1, p0, La0/i0;->b:La0/h0;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Float;
    .locals 3

    iget v0, p0, La0/i0;->a:I

    iget-object v1, p0, La0/i0;->b:La0/h0;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object v0, v1

    check-cast v0, Lz/d;

    iget v2, v0, Lz/d;->a:I

    iget-object v0, v0, Lz/d;->c:Lv/f2;

    packed-switch v2, :pswitch_data_1

    check-cast v0, Lb0/h0;

    invoke-virtual {v0}, Lb0/h0;->d()Z

    move-result v0

    goto :goto_0

    :pswitch_0
    check-cast v0, Lz/g0;

    invoke-virtual {v0}, Lz/g0;->d()Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_0

    invoke-interface {v1}, La0/h0;->a()F

    move-result v0

    const/16 v1, 0x64

    int-to-float v1, v1

    add-float/2addr v0, v1

    goto :goto_1

    :cond_0
    invoke-interface {v1}, La0/h0;->a()F

    move-result v0

    :goto_1
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0

    :pswitch_1
    invoke-interface {v1}, La0/h0;->a()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, La0/i0;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0}, La0/i0;->a()Ljava/lang/Float;

    move-result-object v0

    return-object v0

    :pswitch_0
    invoke-virtual {p0}, La0/i0;->a()Ljava/lang/Float;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
