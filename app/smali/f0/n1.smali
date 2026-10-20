.class public abstract Lf0/n1;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lt/j0;

.field public static final b:F


# direct methods
.method static constructor <clinit>()V
    .locals 3

    invoke-static {}, Lq5/۟ۥۣۢۨ;->۟۠۟۠ۧ()Lf0/j;

    move-result-object v0

    new-instance v1, Lt/u0;

    invoke-direct {v1}, Lt/u0;-><init>()V

    invoke-static {v0, v1}, Lf1/ۥۦ۟ۥ;->ۥۦۣۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lt/v0;

    invoke-direct {v0, v1}, Lt/v0;-><init>(Lt/u0;)V

    const/4 v1, 0x0

    sget v2, Lia/۟۠ۡۦ۟;->۟ۥۥۧۡ:I

    xor-int/lit8 v2, v2, 0x79

    invoke-static {v0, v1, v2}, Le2/۟۟ۥۦ;->ۣ۟ۨۨۥ(Ljava/lang/Object;II)Lt/j0;

    move-result-object v0

    sput-object v0, Lf0/n1;->a:Lt/j0;

    sget v0, Ld1/ۣۣ۟ۢۨ;->۟ۦۢ۠ۧ:I

    xor-int/lit8 v0, v0, -0xd

    int-to-float v0, v0

    sput v0, Lf0/n1;->b:F

    return-void
.end method
