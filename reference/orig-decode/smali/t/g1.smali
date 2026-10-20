.class public final Lt/g1;
.super Ld9/j;

# interfaces
.implements Lc9/c;


# static fields
.field public static final A:Lt/g1;

.field public static final b:Lt/g1;

.field public static final c:Lt/g1;

.field public static final d:Lt/g1;

.field public static final e:Lt/g1;

.field public static final f:Lt/g1;

.field public static final n:Lt/g1;

.field public static final o:Lt/g1;

.field public static final p:Lt/g1;

.field public static final q:Lt/g1;

.field public static final r:Lt/g1;

.field public static final s:Lt/g1;

.field public static final t:Lt/g1;

.field public static final u:Lt/g1;

.field public static final v:Lt/g1;

.field public static final w:Lt/g1;

.field public static final x:Lt/g1;

.field public static final y:Lt/g1;

.field public static final z:Lt/g1;


# instance fields
.field public final synthetic a:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Lt/g1;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lt/g1;-><init>(I)V

    sput-object v0, Lt/g1;->b:Lt/g1;

    new-instance v0, Lt/g1;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lt/g1;-><init>(I)V

    sput-object v0, Lt/g1;->c:Lt/g1;

    new-instance v0, Lt/g1;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lt/g1;-><init>(I)V

    sput-object v0, Lt/g1;->d:Lt/g1;

    new-instance v0, Lt/g1;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Lt/g1;-><init>(I)V

    sput-object v0, Lt/g1;->e:Lt/g1;

    new-instance v0, Lt/g1;

    const/4 v1, 0x6

    invoke-direct {v0, v1}, Lt/g1;-><init>(I)V

    sput-object v0, Lt/g1;->f:Lt/g1;

    new-instance v0, Lt/g1;

    const/4 v1, 0x7

    invoke-direct {v0, v1}, Lt/g1;-><init>(I)V

    sput-object v0, Lt/g1;->n:Lt/g1;

    new-instance v0, Lt/g1;

    const/16 v1, 0x8

    invoke-direct {v0, v1}, Lt/g1;-><init>(I)V

    sput-object v0, Lt/g1;->o:Lt/g1;

    new-instance v0, Lt/g1;

    const/16 v1, 0x9

    invoke-direct {v0, v1}, Lt/g1;-><init>(I)V

    sput-object v0, Lt/g1;->p:Lt/g1;

    new-instance v0, Lt/g1;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Lt/g1;-><init>(I)V

    sput-object v0, Lt/g1;->q:Lt/g1;

    new-instance v0, Lt/g1;

    const/16 v1, 0xb

    invoke-direct {v0, v1}, Lt/g1;-><init>(I)V

    sput-object v0, Lt/g1;->r:Lt/g1;

    new-instance v0, Lt/g1;

    const/16 v1, 0xc

    invoke-direct {v0, v1}, Lt/g1;-><init>(I)V

    sput-object v0, Lt/g1;->s:Lt/g1;

    new-instance v0, Lt/g1;

    const/16 v1, 0xd

    invoke-direct {v0, v1}, Lt/g1;-><init>(I)V

    sput-object v0, Lt/g1;->t:Lt/g1;

    new-instance v0, Lt/g1;

    const/16 v1, 0xe

    invoke-direct {v0, v1}, Lt/g1;-><init>(I)V

    sput-object v0, Lt/g1;->u:Lt/g1;

    new-instance v0, Lt/g1;

    const/16 v1, 0xf

    invoke-direct {v0, v1}, Lt/g1;-><init>(I)V

    sput-object v0, Lt/g1;->v:Lt/g1;

    new-instance v0, Lt/g1;

    const/16 v1, 0x10

    invoke-direct {v0, v1}, Lt/g1;-><init>(I)V

    sput-object v0, Lt/g1;->w:Lt/g1;

    new-instance v0, Lt/g1;

    const/16 v1, 0x11

    invoke-direct {v0, v1}, Lt/g1;-><init>(I)V

    sput-object v0, Lt/g1;->x:Lt/g1;

    new-instance v0, Lt/g1;

    const/16 v1, 0x12

    invoke-direct {v0, v1}, Lt/g1;-><init>(I)V

    sput-object v0, Lt/g1;->y:Lt/g1;

    new-instance v0, Lt/g1;

    const/16 v1, 0x13

    invoke-direct {v0, v1}, Lt/g1;-><init>(I)V

    sput-object v0, Lt/g1;->z:Lt/g1;

    new-instance v0, Lt/g1;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Lt/g1;-><init>(I)V

    sput-object v0, Lt/g1;->A:Lt/g1;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lt/g1;->a:I

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    sget-object v0, Lq8/l;->a:Lq8/l;

    iget v1, p0, Lt/g1;->a:I

    const-wide v2, 0xffffffffL

    const/16 v4, 0x20

    packed-switch v1, :pswitch_data_0

    check-cast p1, Lt/q;

    iget v0, p1, Lt/q;->a:F

    iget p1, p1, Lt/q;->b:F

    invoke-static {v0, p1}, Ld7/t;->j(FF)J

    move-result-wide v0

    new-instance p1, Ld1/f;

    invoke-direct {p1, v0, v1}, Ld1/f;-><init>(J)V

    return-object p1

    :pswitch_0
    check-cast p1, Ld1/f;

    iget-wide v0, p1, Ld1/f;->a:J

    new-instance p1, Lt/q;

    invoke-static {v0, v1}, Ld1/f;->d(J)F

    move-result v2

    invoke-static {v0, v1}, Ld1/f;->b(J)F

    move-result v0

    invoke-direct {p1, v2, v0}, Lt/q;-><init>(FF)V

    return-object p1

    :pswitch_1
    check-cast p1, Lt/s;

    new-instance v0, Ld1/d;

    iget v1, p1, Lt/s;->a:F

    iget v2, p1, Lt/s;->b:F

    iget v3, p1, Lt/s;->c:F

    iget p1, p1, Lt/s;->d:F

    invoke-direct {v0, v1, v2, v3, p1}, Ld1/d;-><init>(FFFF)V

    return-object v0

    :pswitch_2
    check-cast p1, Ld1/d;

    new-instance v0, Lt/s;

    iget v1, p1, Ld1/d;->a:F

    iget v2, p1, Ld1/d;->b:F

    iget v3, p1, Ld1/d;->c:F

    iget p1, p1, Ld1/d;->d:F

    invoke-direct {v0, v1, v2, v3, p1}, Lt/s;-><init>(FFFF)V

    return-object v0

    :pswitch_3
    check-cast p1, Lt/q;

    iget v0, p1, Lt/q;->a:F

    iget p1, p1, Lt/q;->b:F

    invoke-static {v0, p1}, Ld9/i;->f(FF)J

    move-result-wide v0

    new-instance p1, Ld1/c;

    invoke-direct {p1, v0, v1}, Ld1/c;-><init>(J)V

    return-object p1

    :pswitch_4
    check-cast p1, Ld1/c;

    iget-wide v0, p1, Ld1/c;->a:J

    new-instance p1, Lt/q;

    invoke-static {v0, v1}, Ld1/c;->d(J)F

    move-result v2

    invoke-static {v0, v1}, Ld1/c;->e(J)F

    move-result v0

    invoke-direct {p1, v2, v0}, Lt/q;-><init>(FF)V

    return-object p1

    :pswitch_5
    check-cast p1, Lt/p;

    iget p1, p1, Lt/p;->a:F

    float-to-int p1, p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_6
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    new-instance v0, Lt/p;

    int-to-float p1, p1

    invoke-direct {v0, p1}, Lt/p;-><init>(F)V

    return-object v0

    :pswitch_7
    check-cast p1, Lt/q;

    iget v0, p1, Lt/q;->a:F

    invoke-static {v0}, Ld7/t;->p0(F)I

    move-result v0

    iget p1, p1, Lt/q;->b:F

    invoke-static {p1}, Ld7/t;->p0(F)I

    move-result p1

    invoke-static {v0, p1}, Lo1/s;->e(II)J

    move-result-wide v0

    new-instance p1, Lm2/k;

    invoke-direct {p1, v0, v1}, Lm2/k;-><init>(J)V

    return-object p1

    :pswitch_8
    check-cast p1, Lm2/k;

    iget-wide v0, p1, Lm2/k;->a:J

    new-instance p1, Lt/q;

    shr-long v4, v0, v4

    long-to-int v4, v4

    int-to-float v4, v4

    and-long/2addr v0, v2

    long-to-int v0, v0

    int-to-float v0, v0

    invoke-direct {p1, v4, v0}, Lt/q;-><init>(FF)V

    return-object p1

    :pswitch_9
    check-cast p1, Lt/q;

    iget v0, p1, Lt/q;->a:F

    invoke-static {v0}, Ld7/t;->p0(F)I

    move-result v0

    iget p1, p1, Lt/q;->b:F

    invoke-static {p1}, Ld7/t;->p0(F)I

    move-result p1

    invoke-static {v0, p1}, Li1/b;->c(II)J

    move-result-wide v0

    new-instance p1, Lm2/i;

    invoke-direct {p1, v0, v1}, Lm2/i;-><init>(J)V

    return-object p1

    :pswitch_a
    check-cast p1, Lm2/i;

    iget-wide v0, p1, Lm2/i;->a:J

    new-instance p1, Lt/q;

    sget v5, Lm2/i;->c:I

    shr-long v4, v0, v4

    long-to-int v4, v4

    int-to-float v4, v4

    and-long/2addr v0, v2

    long-to-int v0, v0

    int-to-float v0, v0

    invoke-direct {p1, v4, v0}, Lt/q;-><init>(FF)V

    return-object p1

    :pswitch_b
    check-cast p1, Lt/p;

    iget p1, p1, Lt/p;->a:F

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    return-object p1

    :pswitch_c
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    new-instance v0, Lt/p;

    invoke-direct {v0, p1}, Lt/p;-><init>(F)V

    return-object v0

    :pswitch_d
    check-cast p1, Lt/p;

    iget p1, p1, Lt/p;->a:F

    new-instance v0, Lm2/e;

    invoke-direct {v0, p1}, Lm2/e;-><init>(F)V

    return-object v0

    :pswitch_e
    check-cast p1, Lm2/e;

    iget p1, p1, Lm2/e;->a:F

    new-instance v0, Lt/p;

    invoke-direct {v0, p1}, Lt/p;-><init>(F)V

    return-object v0

    :pswitch_f
    check-cast p1, Lt/q;

    iget v0, p1, Lt/q;->a:F

    iget p1, p1, Lt/q;->b:F

    invoke-static {v0, p1}, Li1/b;->a(FF)J

    move-result-wide v0

    new-instance p1, Lm2/f;

    invoke-direct {p1, v0, v1}, Lm2/f;-><init>(J)V

    return-object p1

    :pswitch_10
    check-cast p1, Lm2/f;

    iget-wide v0, p1, Lm2/f;->a:J

    new-instance p1, Lt/q;

    sget-wide v5, Lm2/f;->b:J

    cmp-long v7, v0, v5

    const-string v8, "DpOffset is unspecified"

    if-eqz v7, :cond_1

    shr-long v9, v0, v4

    long-to-int v4, v9

    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v4

    cmp-long v5, v0, v5

    if-eqz v5, :cond_0

    and-long/2addr v0, v2

    long-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    invoke-direct {p1, v4, v0}, Lt/q;-><init>(FF)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_11
    check-cast p1, Lt/m;

    return-object v0

    :pswitch_12
    check-cast p1, Lt/m;

    return-object v0

    :pswitch_13
    check-cast p1, Lt/m;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
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
