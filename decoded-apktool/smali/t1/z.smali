.class public final Lt1/z;
.super Ljava/lang/Object;


# instance fields
.field public a:F

.field public b:F

.field public c:F

.field public d:F

.field public e:F

.field public f:F

.field public g:F

.field public h:F

.field public i:J


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lt1/z;->a:F

    iput v0, p0, Lt1/z;->b:F

    const/high16 v0, 0x41000000    # 8.0f

    iput v0, p0, Lt1/z;->h:F

    sget v0, Le1/p0;->c:I

    sget-wide v0, Le1/p0;->b:J

    iput-wide v0, p0, Lt1/z;->i:J

    return-void
.end method
