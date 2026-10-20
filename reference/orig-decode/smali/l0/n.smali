.class public abstract Ll0/n;
.super Ljava/lang/Object;


# static fields
.field public static final a:F

.field public static final b:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-wide/high16 v0, 0x4034000000000000L    # 20.0

    double-to-float v0, v0

    sput v0, Ll0/n;->a:F

    const-wide/high16 v0, 0x4044000000000000L    # 40.0

    double-to-float v0, v0

    sput v0, Ll0/n;->b:F

    return-void
.end method
