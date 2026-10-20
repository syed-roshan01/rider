.class public final Li1/a;
.super Ljava/lang/Object;


# instance fields
.field public a:Le1/f;

.field public b:Le1/d;

.field public c:J

.field public d:I

.field public final e:Lg1/c;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Li1/a;->c:J

    const/4 v0, 0x0

    iput v0, p0, Li1/a;->d:I

    new-instance v0, Lg1/c;

    invoke-direct {v0}, Lg1/c;-><init>()V

    iput-object v0, p0, Li1/a;->e:Lg1/c;

    return-void
.end method
