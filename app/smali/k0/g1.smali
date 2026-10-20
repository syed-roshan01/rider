.class public abstract Lk0/g1;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lm0/m3;

.field public static final b:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lm0/m3;

    invoke-static {}, Lh7/۟۟ۧۨ۟;->ۣ۟۠ۢۨ()Lk0/j0;

    move-result-object v1

    invoke-direct {v0, v1}, Lm0/m3;-><init>(Lc9/a;)V

    sput-object v0, Lk0/g1;->a:Lm0/m3;

    sget v0, Lcom/google/android/datatransport/cct/ۨۡ۠ۦ;->ۦۨۧ۟:I

    xor-int/lit8 v0, v0, -0x6e

    int-to-float v0, v0

    invoke-static {v0, v0}, Lf/ۣ۟ۤۤ;->۟ۤۨۤۨ(FF)J

    move-result-wide v0

    sput-wide v0, Lk0/g1;->b:J

    return-void
.end method
