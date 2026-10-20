.class public abstract Ll0/r;
.super Ljava/lang/Object;


# static fields
.field public static final a:F

.field public static final b:I

.field public static final c:I

.field public static final d:I

.field public static final e:F

.field public static final f:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget v0, Ll0/f;->a:F

    const-wide/high16 v0, 0x4050000000000000L    # 64.0

    double-to-float v0, v0

    sput v0, Ll0/r;->a:F

    const/16 v0, 0x12

    sput v0, Ll0/r;->b:I

    const/16 v1, 0xd

    sput v1, Ll0/r;->c:I

    sput v0, Ll0/r;->d:I

    sget v0, Ll0/f;->c:F

    sput v0, Ll0/r;->e:F

    const/16 v0, 0x13

    sput v0, Ll0/r;->f:I

    return-void
.end method
