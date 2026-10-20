.class public abstract Lk0/p0;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lu0/b;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    invoke-static {}, Lcom/google/firebase/emulators/۟ۥۦۣۢ;->ۣ۟ۧۨ()Lk0/m0;

    move-result-object v0

    new-instance v1, Lu0/b;

    const v2, 0x30cceddf

    sget v3, Lcom/google/firebase/inject/ۣۣ۟۠ۧ;->۟ۢ۟ۡۨ:I

    xor-int/2addr v2, v3

    const/4 v3, 0x0

    invoke-direct {v1, v2, v0, v3}, Lu0/b;-><init>(ILd9/j;Z)V

    sput-object v1, Lk0/p0;->a:Lu0/b;

    return-void
.end method
