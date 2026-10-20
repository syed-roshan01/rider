.class final Landroidx/compose/foundation/BackgroundElement;
.super Lt1/u0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lt1/u0;"
    }
.end annotation


# instance fields
.field public final b:J

.field public final c:Le1/n;

.field public final d:F

.field public final e:Le1/l0;


# direct methods
.method public constructor <init>(JLe1/j0;FLe1/l0;I)V
    .locals 1

    and-int/lit8 v0, p6, 0x1

    if-eqz v0, :cond_0

    sget-wide p1, Le1/r;->g:J

    :cond_0
    and-int/lit8 p6, p6, 0x2

    if-eqz p6, :cond_1

    const/4 p3, 0x0

    :cond_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Landroidx/compose/foundation/BackgroundElement;->b:J

    iput-object p3, p0, Landroidx/compose/foundation/BackgroundElement;->c:Le1/n;

    iput p4, p0, Landroidx/compose/foundation/BackgroundElement;->d:F

    iput-object p5, p0, Landroidx/compose/foundation/BackgroundElement;->e:Le1/l0;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 5

    instance-of v0, p1, Landroidx/compose/foundation/BackgroundElement;

    if-eqz v0, :cond_0

    check-cast p1, Landroidx/compose/foundation/BackgroundElement;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    const/4 v0, 0x0

    if-nez p1, :cond_1

    return v0

    :cond_1
    iget-wide v1, p0, Landroidx/compose/foundation/BackgroundElement;->b:J

    iget-wide v3, p1, Landroidx/compose/foundation/BackgroundElement;->b:J

    invoke-static {v1, v2, v3, v4}, Le1/r;->c(JJ)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Landroidx/compose/foundation/BackgroundElement;->c:Le1/n;

    iget-object v2, p1, Landroidx/compose/foundation/BackgroundElement;->c:Le1/n;

    invoke-static {v1, v2}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget v1, p0, Landroidx/compose/foundation/BackgroundElement;->d:F

    iget v2, p1, Landroidx/compose/foundation/BackgroundElement;->d:F

    cmpg-float v1, v1, v2

    if-nez v1, :cond_2

    iget-object v1, p0, Landroidx/compose/foundation/BackgroundElement;->e:Le1/l0;

    iget-object p1, p1, Landroidx/compose/foundation/BackgroundElement;->e:Le1/l0;

    invoke-static {v1, p1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 v0, 0x1

    :cond_2
    return v0
.end method

.method public final hashCode()I
    .locals 3

    sget v0, Le1/r;->h:I

    iget-wide v0, p0, Landroidx/compose/foundation/BackgroundElement;->b:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Landroidx/compose/foundation/BackgroundElement;->c:Le1/n;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v2, p0, Landroidx/compose/foundation/BackgroundElement;->d:F

    invoke-static {v2, v0, v1}, Ll/q;->a(FII)I

    move-result v0

    iget-object v1, p0, Landroidx/compose/foundation/BackgroundElement;->e:Le1/l0;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final l()Ly0/n;
    .locals 3

    new-instance v0, Lu/p;

    invoke-direct {v0}, Ly0/n;-><init>()V

    iget-wide v1, p0, Landroidx/compose/foundation/BackgroundElement;->b:J

    iput-wide v1, v0, Lu/p;->u:J

    iget-object v1, p0, Landroidx/compose/foundation/BackgroundElement;->c:Le1/n;

    iput-object v1, v0, Lu/p;->v:Le1/n;

    iget v1, p0, Landroidx/compose/foundation/BackgroundElement;->d:F

    iput v1, v0, Lu/p;->w:F

    iget-object v1, p0, Landroidx/compose/foundation/BackgroundElement;->e:Le1/l0;

    iput-object v1, v0, Lu/p;->x:Le1/l0;

    return-object v0
.end method

.method public final m(Ly0/n;)V
    .locals 2

    check-cast p1, Lu/p;

    iget-wide v0, p0, Landroidx/compose/foundation/BackgroundElement;->b:J

    iput-wide v0, p1, Lu/p;->u:J

    iget-object v0, p0, Landroidx/compose/foundation/BackgroundElement;->c:Le1/n;

    iput-object v0, p1, Lu/p;->v:Le1/n;

    iget v0, p0, Landroidx/compose/foundation/BackgroundElement;->d:F

    iput v0, p1, Lu/p;->w:F

    iget-object v0, p0, Landroidx/compose/foundation/BackgroundElement;->e:Le1/l0;

    iput-object v0, p1, Lu/p;->x:Le1/l0;

    return-void
.end method
