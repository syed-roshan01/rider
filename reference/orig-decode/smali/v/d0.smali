.class public final Lv/d0;
.super Ljava/lang/Object;

# interfaces
.implements Lv/i1;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lv/d0;->a:I

    return-void
.end method


# virtual methods
.method public final a(J)F
    .locals 1

    iget v0, p0, Lv/d0;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-static {p1, p2}, Ld1/c;->e(J)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    return p1

    :pswitch_0
    invoke-static {p1, p2}, Ld1/c;->d(J)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    return p1

    :pswitch_1
    invoke-static {p1, p2}, Ld1/c;->c(J)F

    move-result p1

    return p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final b(FJ)J
    .locals 3

    iget v0, p0, Lv/d0;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-static {p2, p3}, Ld1/c;->e(J)F

    move-result v0

    invoke-static {p2, p3}, Ld1/c;->e(J)F

    move-result v1

    invoke-static {v1}, Ljava/lang/Math;->signum(F)F

    move-result v1

    mul-float/2addr v1, p1

    sub-float/2addr v0, v1

    invoke-static {p2, p3}, Ld1/c;->d(J)F

    move-result p1

    invoke-static {p1, v0}, Ld9/i;->f(FF)J

    move-result-wide p1

    return-wide p1

    :pswitch_0
    invoke-static {p2, p3}, Ld1/c;->d(J)F

    move-result v0

    invoke-static {p2, p3}, Ld1/c;->d(J)F

    move-result v1

    invoke-static {v1}, Ljava/lang/Math;->signum(F)F

    move-result v1

    mul-float/2addr v1, p1

    sub-float/2addr v0, v1

    invoke-static {p2, p3}, Ld1/c;->e(J)F

    move-result p1

    invoke-static {v0, p1}, Ld9/i;->f(FF)J

    move-result-wide p1

    return-wide p1

    :pswitch_1
    invoke-virtual {p0, p2, p3}, Lv/d0;->a(J)F

    move-result v0

    invoke-static {p2, p3}, Ld1/c;->d(J)F

    move-result v1

    div-float/2addr v1, v0

    invoke-static {p2, p3}, Ld1/c;->e(J)F

    move-result v2

    div-float/2addr v2, v0

    invoke-static {v1, v2}, Ld9/i;->f(FF)J

    move-result-wide v0

    invoke-static {p1, v0, v1}, Ld1/c;->h(FJ)J

    move-result-wide v0

    invoke-static {p2, p3, v0, v1}, Ld1/c;->f(JJ)J

    move-result-wide p1

    return-wide p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
