.class public final Lh0/g0;
.super Ld9/j;

# interfaces
.implements Lc9/c;


# static fields
.field public static final b:Lh0/g0;

.field public static final c:Lh0/g0;

.field public static final d:Lh0/g0;


# instance fields
.field public final synthetic a:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Lh0/g0;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lh0/g0;-><init>(I)V

    sput-object v0, Lh0/g0;->b:Lh0/g0;

    new-instance v0, Lh0/g0;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lh0/g0;-><init>(I)V

    sput-object v0, Lh0/g0;->c:Lh0/g0;

    new-instance v0, Lh0/g0;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lh0/g0;-><init>(I)V

    sput-object v0, Lh0/g0;->d:Lh0/g0;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lh0/g0;->a:I

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lh0/g0;->a:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lg2/a0;

    sget-object p1, Lq8/l;->a:Lq8/l;

    return-object p1

    :pswitch_0
    check-cast p1, Lt/q;

    iget v0, p1, Lt/q;->a:F

    iget p1, p1, Lt/q;->b:F

    invoke-static {v0, p1}, Ld9/i;->f(FF)J

    move-result-wide v0

    new-instance p1, Ld1/c;

    invoke-direct {p1, v0, v1}, Ld1/c;-><init>(J)V

    return-object p1

    :pswitch_1
    check-cast p1, Ld1/c;

    iget-wide v0, p1, Ld1/c;->a:J

    invoke-static {v0, v1}, Ld9/i;->u(J)Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Lt/q;

    invoke-static {v0, v1}, Ld1/c;->d(J)F

    move-result v2

    invoke-static {v0, v1}, Ld1/c;->e(J)F

    move-result v0

    invoke-direct {p1, v2, v0}, Lt/q;-><init>(FF)V

    goto :goto_0

    :cond_0
    sget-object p1, Lh0/k0;->a:Lt/q;

    :goto_0
    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
