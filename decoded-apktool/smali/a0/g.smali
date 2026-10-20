.class public final La0/g;
.super Ld9/j;

# interfaces
.implements Lc9/c;


# static fields
.field public static final b:La0/g;

.field public static final c:La0/g;


# instance fields
.field public final synthetic a:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, La0/g;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, La0/g;-><init>(I)V

    sput-object v0, La0/g;->b:La0/g;

    new-instance v0, La0/g;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, La0/g;-><init>(I)V

    sput-object v0, La0/g;->c:La0/g;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, La0/g;->a:I

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, La0/g;->a:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    const/4 p1, 0x0

    return-object p1

    :pswitch_0
    check-cast p1, Le1/w;

    sget-object p1, Lq8/l;->a:Lq8/l;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
