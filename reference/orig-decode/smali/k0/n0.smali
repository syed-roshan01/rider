.class public abstract Lk0/n0;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lu0/b;

.field public static final b:Lu0/b;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const/4 v4, 0x0

    invoke-static {}, Lcom/google/android/gms/internal/stats/ۧۦۣ۟;->ۧۡ۠ۡ()Lk0/l0;

    move-result-object v0

    new-instance v1, Lu0/b;

    const v2, -0x3d052d48

    sget v3, Lcom/google/firebase/heartbeatinfo/ۤ۠ۥۦ;->۟۟۟۠ۨ:I

    xor-int/2addr v2, v3

    invoke-direct {v1, v2, v0, v4}, Lu0/b;-><init>(ILd9/j;Z)V

    sput-object v1, Lk0/n0;->a:Lu0/b;

    invoke-static {}, Lg/۟ۧ۠ۤ;->۟ۥۣۤۧ()Lk0/m0;

    move-result-object v0

    new-instance v1, Lu0/b;

    const v2, -0x53171a3a

    sget v3, Lh3/۟ۡۥ۠۠;->ۨۡ۟۟:I

    xor-int/2addr v2, v3

    invoke-direct {v1, v2, v0, v4}, Lu0/b;-><init>(ILd9/j;Z)V

    sput-object v1, Lk0/n0;->b:Lu0/b;

    return-void
.end method
