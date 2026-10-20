.class public final Lo2/d;
.super Ld9/j;

# interfaces
.implements Lc9/a;


# static fields
.field public static final b:Lo2/d;

.field public static final c:Lo2/d;

.field public static final d:Lo2/d;


# instance fields
.field public final synthetic a:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Lo2/d;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo2/d;-><init>(I)V

    sput-object v0, Lo2/d;->b:Lo2/d;

    new-instance v0, Lo2/d;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lo2/d;-><init>(I)V

    sput-object v0, Lo2/d;->c:Lo2/d;

    new-instance v0, Lo2/d;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lo2/d;-><init>(I)V

    sput-object v0, Lo2/d;->d:Lo2/d;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lo2/d;->a:I

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lo2/d;->a:I

    packed-switch v0, :pswitch_data_0

    packed-switch v0, :pswitch_data_1

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    goto :goto_0

    :pswitch_0
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    :goto_0
    return-object v0

    :pswitch_1
    const-string v0, "DEFAULT_TEST_TAG"

    return-object v0

    :pswitch_2
    packed-switch v0, :pswitch_data_2

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    goto :goto_1

    :pswitch_3
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    :goto_1
    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_3
    .end packed-switch
.end method
