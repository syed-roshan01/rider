.class public abstract Ll0/p;
.super Ljava/lang/Object;


# static fields
.field public static final a:F

.field public static final b:I

.field public static final c:I

.field public static final d:I

.field public static final e:I

.field public static final f:F

.field public static final g:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget v0, Ll0/f;->d:F

    sput v0, Ll0/p;->a:F

    const/4 v0, 0x3

    sput v0, Ll0/p;->b:I

    const/4 v0, 0x4

    sput v0, Ll0/p;->c:I

    sput v0, Ll0/p;->d:I

    const/4 v0, 0x2

    sput v0, Ll0/p;->e:I

    const-wide/high16 v0, 0x4048000000000000L    # 48.0

    double-to-float v0, v0

    sput v0, Ll0/p;->f:F

    const-wide/high16 v0, 0x4051000000000000L    # 68.0

    double-to-float v0, v0

    sput v0, Ll0/p;->g:F

    return-void
.end method
