.class public final Ly/n;
.super Ld9/j;

# interfaces
.implements Lc9/c;


# static fields
.field public static final b:Ly/n;

.field public static final c:Ly/n;

.field public static final d:Ly/n;


# instance fields
.field public final synthetic a:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Ly/n;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ly/n;-><init>(I)V

    sput-object v0, Ly/n;->b:Ly/n;

    new-instance v0, Ly/n;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ly/n;-><init>(I)V

    sput-object v0, Ly/n;->c:Ly/n;

    new-instance v0, Ly/n;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ly/n;-><init>(I)V

    sput-object v0, Ly/n;->d:Ly/n;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Ly/n;->a:I

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    sget-object v0, Lq8/l;->a:Lq8/l;

    iget v1, p0, Ly/n;->a:I

    packed-switch v1, :pswitch_data_0

    check-cast p1, Lr1/w0;

    return-object v0

    :pswitch_0
    check-cast p1, Lr1/w0;

    return-object v0

    :pswitch_1
    check-cast p1, Lr1/w0;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
