.class public final Lu/l;
.super Ld9/j;

# interfaces
.implements Lc9/f;


# static fields
.field public static final b:Lu/l;

.field public static final c:Lu/l;


# instance fields
.field public final synthetic a:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Lu/l;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lu/l;-><init>(I)V

    sput-object v0, Lu/l;->b:Lu/l;

    new-instance v0, Lu/l;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lu/l;-><init>(I)V

    sput-object v0, Lu/l;->c:Lu/l;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lu/l;->a:I

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lr1/l0;Lr1/i0;J)Lr1/k0;
    .locals 4

    sget-object v0, Lr8/s;->a:Lr8/s;

    iget v1, p0, Lu/l;->a:I

    const/4 v2, 0x2

    packed-switch v1, :pswitch_data_0

    invoke-interface {p2, p3, p4}, Lr1/i0;->f(J)Lr1/x0;

    move-result-object p2

    sget p3, Lu/i0;->a:F

    int-to-float p4, v2

    mul-float/2addr p3, p4

    invoke-interface {p1, p3}, Lm2/b;->J(F)I

    move-result p3

    iget p4, p2, Lr1/x0;->a:I

    add-int/2addr p4, p3

    iget v1, p2, Lr1/x0;->b:I

    add-int/2addr v1, p3

    new-instance v2, Lu/k;

    const/4 v3, 0x1

    invoke-direct {v2, p2, p3, v3}, Lu/k;-><init>(Lr1/x0;II)V

    invoke-interface {p1, p4, v1, v0, v2}, Lr1/l0;->N(IILjava/util/Map;Lc9/c;)Lr1/k0;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-interface {p2, p3, p4}, Lr1/i0;->f(J)Lr1/x0;

    move-result-object p2

    sget p3, Lu/i0;->a:F

    int-to-float p4, v2

    mul-float/2addr p3, p4

    invoke-interface {p1, p3}, Lm2/b;->J(F)I

    move-result p3

    invoke-virtual {p2}, Lr1/x0;->b0()I

    move-result p4

    sub-int/2addr p4, p3

    const/4 v1, 0x0

    if-gez p4, :cond_0

    move p4, v1

    :cond_0
    invoke-virtual {p2}, Lr1/x0;->a0()I

    move-result v2

    sub-int/2addr v2, p3

    if-gez v2, :cond_1

    move v2, v1

    :cond_1
    new-instance v3, Lu/k;

    invoke-direct {v3, p2, p3, v1}, Lu/k;-><init>(Lr1/x0;II)V

    invoke-interface {p1, p4, v2, v0, v3}, Lr1/l0;->N(IILjava/util/Map;Lc9/c;)Lr1/k0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final synthetic e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lu/l;->a:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lr1/l0;

    check-cast p2, Lr1/i0;

    check-cast p3, Lm2/a;

    iget-wide v0, p3, Lm2/a;->a:J

    invoke-virtual {p0, p1, p2, v0, v1}, Lu/l;->a(Lr1/l0;Lr1/i0;J)Lr1/k0;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lr1/l0;

    check-cast p2, Lr1/i0;

    check-cast p3, Lm2/a;

    iget-wide v0, p3, Lm2/a;->a:J

    invoke-virtual {p0, p1, p2, v0, v1}, Lu/l;->a(Lr1/l0;Lr1/i0;J)Lr1/k0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
