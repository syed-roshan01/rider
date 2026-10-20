.class public final Lu/r;
.super Ld9/j;

# interfaces
.implements Lc9/c;


# static fields
.field public static final b:Lu/r;

.field public static final c:Lu/r;

.field public static final d:Lu/r;

.field public static final e:Lu/r;

.field public static final f:Lu/r;


# instance fields
.field public final synthetic a:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Lu/r;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lu/r;-><init>(I)V

    sput-object v0, Lu/r;->b:Lu/r;

    new-instance v0, Lu/r;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lu/r;-><init>(I)V

    sput-object v0, Lu/r;->c:Lu/r;

    new-instance v0, Lu/r;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lu/r;-><init>(I)V

    sput-object v0, Lu/r;->d:Lu/r;

    new-instance v0, Lu/r;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lu/r;-><init>(I)V

    sput-object v0, Lu/r;->e:Lu/r;

    new-instance v0, Lu/r;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lu/r;-><init>(I)V

    sput-object v0, Lu/r;->f:Lu/r;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lu/r;->a:I

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    sget-object v0, Lq8/l;->a:Lq8/l;

    iget v1, p0, Lu/r;->a:I

    packed-switch v1, :pswitch_data_0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    new-instance v0, Lu/p2;

    invoke-direct {v0, p1}, Lu/p2;-><init>(I)V

    return-object v0

    :pswitch_0
    check-cast p1, Ly1/v;

    sget-object v1, Ly1/f;->d:Ly1/f;

    sget-object v2, Ly1/t;->a:[Lj9/f;

    sget-object v2, Ly1/r;->c:Ly1/u;

    sget-object v3, Ly1/t;->a:[Lj9/f;

    const/4 v4, 0x1

    aget-object v3, v3, v4

    invoke-virtual {v2, p1, v1}, Ly1/u;->a(Ly1/v;Ljava/lang/Object;)V

    return-object v0

    :pswitch_1
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    return-object v0

    :pswitch_2
    check-cast p1, Lr1/w0;

    return-object v0

    :pswitch_3
    check-cast p1, Lg1/e;

    check-cast p1, Lt1/i0;

    invoke-virtual {p1}, Lt1/i0;->a()V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
