.class public final Ls/h0;
.super Ld9/j;

# interfaces
.implements Lc9/c;


# static fields
.field public static final b:Ls/h0;

.field public static final c:Ls/h0;

.field public static final d:Ls/h0;

.field public static final e:Ls/h0;

.field public static final f:Ls/h0;

.field public static final n:Ls/h0;


# instance fields
.field public final synthetic a:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Ls/h0;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ls/h0;-><init>(I)V

    sput-object v0, Ls/h0;->b:Ls/h0;

    new-instance v0, Ls/h0;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ls/h0;-><init>(I)V

    sput-object v0, Ls/h0;->c:Ls/h0;

    new-instance v0, Ls/h0;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ls/h0;-><init>(I)V

    sput-object v0, Ls/h0;->d:Ls/h0;

    new-instance v0, Ls/h0;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Ls/h0;-><init>(I)V

    sput-object v0, Ls/h0;->e:Ls/h0;

    new-instance v0, Ls/h0;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Ls/h0;-><init>(I)V

    sput-object v0, Ls/h0;->f:Ls/h0;

    new-instance v0, Ls/h0;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Ls/h0;-><init>(I)V

    sput-object v0, Ls/h0;->n:Ls/h0;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Ls/h0;->a:I

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    const-wide v0, 0xffffffffL

    const/16 v2, 0x20

    const/4 v3, 0x7

    const/4 v4, 0x0

    const/4 v5, 0x0

    iget v6, p0, Ls/h0;->a:I

    packed-switch v6, :pswitch_data_0

    check-cast p1, Lt/o1;

    packed-switch v6, :pswitch_data_1

    sget-object p1, Landroidx/compose/animation/a;->c:Lt/d1;

    goto :goto_0

    :pswitch_0
    invoke-static {v5, v4, v3}, Lt/e;->r(FLjava/lang/Object;I)Lt/d1;

    move-result-object p1

    :goto_0
    return-object p1

    :pswitch_1
    check-cast p1, Lt/o1;

    packed-switch v6, :pswitch_data_2

    sget-object p1, Landroidx/compose/animation/a;->c:Lt/d1;

    goto :goto_1

    :pswitch_2
    invoke-static {v5, v4, v3}, Lt/e;->r(FLjava/lang/Object;I)Lt/d1;

    move-result-object p1

    :goto_1
    return-object p1

    :pswitch_3
    check-cast p1, Lt/q;

    iget v3, p1, Lt/q;->a:F

    iget p1, p1, Lt/q;->b:F

    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v3

    int-to-long v3, v3

    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p1

    int-to-long v5, p1

    shl-long v2, v3, v2

    and-long/2addr v0, v5

    or-long/2addr v0, v2

    new-instance p1, Le1/p0;

    invoke-direct {p1, v0, v1}, Le1/p0;-><init>(J)V

    return-object p1

    :pswitch_4
    check-cast p1, Le1/p0;

    iget-wide v3, p1, Le1/p0;->a:J

    new-instance p1, Lt/q;

    shr-long v5, v3, v2

    long-to-int v2, v5

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    and-long/2addr v0, v3

    long-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    invoke-direct {p1, v2, v0}, Lt/q;-><init>(FF)V

    return-object p1

    :pswitch_5
    check-cast p1, Lf1/d;

    sget-object v0, Ls/h0;->b:Ls/h0;

    new-instance v1, Lq/w;

    const/4 v2, 0x3

    invoke-direct {v1, p1, v2}, Lq/w;-><init>(Ljava/lang/Object;I)V

    sget-object p1, Lt/y1;->a:Lt/x1;

    new-instance p1, Lt/x1;

    invoke-direct {p1, v0, v1}, Lt/x1;-><init>(Lc9/c;Lc9/c;)V

    return-object p1

    :pswitch_6
    check-cast p1, Le1/r;

    iget-wide v0, p1, Le1/r;->a:J

    sget-object p1, Lf1/e;->t:Lf1/l;

    invoke-static {v0, v1, p1}, Le1/r;->a(JLf1/d;)J

    move-result-wide v0

    invoke-static {v0, v1}, Le1/r;->h(J)F

    move-result p1

    invoke-static {v0, v1}, Le1/r;->g(J)F

    move-result v2

    invoke-static {v0, v1}, Le1/r;->e(J)F

    move-result v3

    invoke-static {v0, v1}, Le1/r;->d(J)F

    move-result v0

    new-instance v1, Lt/s;

    invoke-direct {v1, v0, p1, v2, v3}, Lt/s;-><init>(FFFF)V

    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_1
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x4
        :pswitch_0
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x4
        :pswitch_2
    .end packed-switch
.end method
