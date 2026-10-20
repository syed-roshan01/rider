.class public final Lh0/m0;
.super Ld9/j;

# interfaces
.implements Lc9/a;


# static fields
.field public static final b:Lh0/m0;

.field public static final c:Lh0/m0;


# instance fields
.field public final synthetic a:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Lh0/m0;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lh0/m0;-><init>(I)V

    sput-object v0, Lh0/m0;->b:Lh0/m0;

    new-instance v0, Lh0/m0;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lh0/m0;-><init>(I)V

    sput-object v0, Lh0/m0;->c:Lh0/m0;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lh0/m0;->a:I

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lh0/m0;->a:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lh0/c1;->b:Lh0/b1;

    return-object v0

    :pswitch_0
    const/4 v0, 0x0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
