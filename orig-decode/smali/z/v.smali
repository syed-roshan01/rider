.class public final Lz/v;
.super Ld9/j;

# interfaces
.implements Lc9/c;


# static fields
.field public static final b:Lz/v;

.field public static final c:Lz/v;


# instance fields
.field public final synthetic a:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Lz/v;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lz/v;-><init>(I)V

    sput-object v0, Lz/v;->b:Lz/v;

    new-instance v0, Lz/v;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lz/v;-><init>(I)V

    sput-object v0, Lz/v;->c:Lz/v;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lz/v;->a:I

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lz/v;->a:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/util/List;

    new-instance v0, Lz/g0;

    const/4 v1, 0x0

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    const/4 v2, 0x1

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-direct {v0, v1, p1}, Lz/g0;-><init>(II)V

    return-object v0

    :pswitch_0
    check-cast p1, Lr1/w0;

    sget-object p1, Lq8/l;->a:Lq8/l;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
