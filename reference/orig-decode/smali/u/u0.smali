.class public final Lu/u0;
.super Ld9/j;

# interfaces
.implements Lc9/a;


# static fields
.field public static final b:Lu/u0;

.field public static final c:Lu/u0;

.field public static final d:Lu/u0;


# instance fields
.field public final synthetic a:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Lu/u0;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lu/u0;-><init>(I)V

    sput-object v0, Lu/u0;->b:Lu/u0;

    new-instance v0, Lu/u0;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lu/u0;-><init>(I)V

    sput-object v0, Lu/u0;->c:Lu/u0;

    new-instance v0, Lu/u0;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lu/u0;-><init>(I)V

    sput-object v0, Lu/u0;->d:Lu/u0;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lu/u0;->a:I

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lu/u0;->a:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lu/z1;

    invoke-direct {v0}, Lu/z1;-><init>()V

    return-object v0

    :pswitch_0
    sget-object v0, Lu/k0;->a:Lu/k0;

    return-object v0

    :pswitch_1
    const/4 v0, 0x0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
