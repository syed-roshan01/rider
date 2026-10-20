.class public final Lr9/w;
.super Ld9/j;

# interfaces
.implements Lc9/e;


# static fields
.field public static final b:Lr9/w;

.field public static final c:Lr9/w;

.field public static final d:Lr9/w;


# instance fields
.field public final synthetic a:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Lr9/w;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lr9/w;-><init>(I)V

    sput-object v0, Lr9/w;->b:Lr9/w;

    new-instance v0, Lr9/w;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lr9/w;-><init>(I)V

    sput-object v0, Lr9/w;->c:Lr9/w;

    new-instance v0, Lr9/w;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lr9/w;-><init>(I)V

    sput-object v0, Lr9/w;->d:Lr9/w;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lr9/w;->a:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lr9/w;->a:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lr9/y;

    check-cast p2, Lu8/h;

    return-object p1

    :pswitch_0
    invoke-static {p1}, La7/a;->w(Ljava/lang/Object;)V

    check-cast p2, Lu8/h;

    const/4 p1, 0x0

    return-object p1

    :pswitch_1
    check-cast p2, Lu8/h;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
