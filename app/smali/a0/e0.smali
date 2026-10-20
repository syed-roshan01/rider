.class public final La0/e0;
.super Ljava/lang/Object;

# interfaces
.implements La0/b0;


# instance fields
.field public final a:I

.field public final b:J

.field public c:Lr1/f1;

.field public d:Z


# direct methods
.method public constructor <init>(IJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, La0/e0;->a:I

    iput-wide p2, p0, La0/e0;->b:J

    return-void
.end method


# virtual methods
.method public final cancel()V
    .locals 1

    iget-boolean v0, p0, La0/e0;->d:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    iput-boolean v0, p0, La0/e0;->d:Z

    iget-object v0, p0, La0/e0;->c:Lr1/f1;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lr1/f1;->a()V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, La0/e0;->c:Lr1/f1;

    :cond_1
    return-void
.end method
