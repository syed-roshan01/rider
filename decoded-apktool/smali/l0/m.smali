.class public abstract Ll0/m;
.super Ljava/lang/Object;


# static fields
.field public static final a:F

.field public static final b:I

.field public static final c:F

.field public static final d:I

.field public static final e:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-wide/high16 v0, 0x4008000000000000L    # 3.0

    double-to-float v0, v0

    sput v0, Ll0/m;->a:F

    sget-object v0, Le0/f;->a:Le0/e;

    const/16 v0, 0x23

    sput v0, Ll0/m;->b:I

    sget v0, Ll0/f;->a:F

    const-wide/high16 v0, 0x4048000000000000L    # 48.0

    double-to-float v0, v0

    sput v0, Ll0/m;->c:F

    const/16 v0, 0x1a

    sput v0, Ll0/m;->d:I

    const/16 v0, 0xf

    sput v0, Ll0/m;->e:I

    return-void
.end method
