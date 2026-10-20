.class public final Li1/g;
.super Ld9/j;

# interfaces
.implements Lc9/a;


# static fields
.field public static final b:Li1/g;

.field public static final c:Li1/g;


# instance fields
.field public final synthetic a:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Li1/g;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Li1/g;-><init>(I)V

    sput-object v0, Li1/g;->b:Li1/g;

    new-instance v0, Li1/g;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Li1/g;-><init>(I)V

    sput-object v0, Li1/g;->c:Li1/g;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Li1/g;->a:I

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Li1/g;->a:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lq8/l;->a:Lq8/l;

    return-object v0

    :pswitch_0
    new-instance v0, Le1/j;

    new-instance v1, Landroid/graphics/PathMeasure;

    invoke-direct {v1}, Landroid/graphics/PathMeasure;-><init>()V

    invoke-direct {v0, v1}, Le1/j;-><init>(Landroid/graphics/PathMeasure;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
