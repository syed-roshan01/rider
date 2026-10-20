.class public final Lb/e;
.super Ld9/j;

# interfaces
.implements Lc9/a;


# static fields
.field public static final b:Lb/e;

.field public static final c:Lb/e;

.field public static final d:Lb/e;


# instance fields
.field public final synthetic a:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Lb/e;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lb/e;-><init>(I)V

    sput-object v0, Lb/e;->b:Lb/e;

    new-instance v0, Lb/e;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lb/e;-><init>(I)V

    sput-object v0, Lb/e;->c:Lb/e;

    new-instance v0, Lb/e;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lb/e;-><init>(I)V

    sput-object v0, Lb/e;->d:Lb/e;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lb/e;->a:I

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lb/e;->a:I

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x0

    return-object v0

    :pswitch_0
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
