.class public abstract Lt/d0;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lt/w;

.field public static final b:Lt/w;

.field public static final c:Lt/b0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lt/w;

    const v1, 0x3ecccccd    # 0.4f

    const v2, 0x3e4ccccd    # 0.2f

    invoke-direct {v0, v1, v2}, Lt/w;-><init>(FF)V

    sput-object v0, Lt/d0;->a:Lt/w;

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v3

    if-nez v3, :cond_0

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {v2}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_0

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v2

    if-nez v2, :cond_0

    new-instance v2, Lt/w;

    invoke-direct {v2, v1, v0}, Lt/w;-><init>(FF)V

    sput-object v2, Lt/d0;->b:Lt/w;

    new-instance v0, Lt/b0;

    const/4 v1, 0x6

    invoke-direct {v0, v1}, Lt/b0;-><init>(I)V

    sput-object v0, Lt/d0;->c:Lt/b0;

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: 0.0, 0.0, 0.2, 1.0."

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
