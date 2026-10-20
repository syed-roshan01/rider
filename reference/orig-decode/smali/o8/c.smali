.class public final Lo8/c;
.super Ljava/lang/Object;


# instance fields
.field public final synthetic a:I

.field public b:J

.field public c:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lo8/c;->a:I

    const-string v0, ""

    iput-object v0, p0, Lo8/c;->c:Ljava/lang/Object;

    const-wide/high16 v0, -0x8000000000000000L

    iput-wide v0, p0, Lo8/c;->b:J

    return-void
.end method

.method public constructor <init>(I)V
    .locals 3

    iput p1, p0, Lo8/c;->a:I

    const/4 v0, 0x2

    const-wide/16 v1, 0x0

    if-eq p1, v0, :cond_0

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide v1, p0, Lo8/c;->b:J

    return-void

    .line 5
    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide v1, p0, Lo8/c;->b:J

    sget-object p1, Lo5/c;->b:Lo5/c;

    iput-object p1, p0, Lo8/c;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Le6/b;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x3

    iput v0, p0, Lo8/c;->a:I

    .line 2
    invoke-static {p1}, Lf6/a;->x(Ljava/lang/Object;)V

    iput-object p1, p0, Lo8/c;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(I)I
    .locals 7

    iget-object v0, p0, Lo8/c;->c:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lo8/c;

    const/16 v2, 0x40

    const-wide/16 v3, 0x1

    if-nez v1, :cond_1

    if-lt p1, v2, :cond_0

    iget-wide v0, p0, Lo8/c;->b:J

    invoke-static {v0, v1}, Ljava/lang/Long;->bitCount(J)I

    move-result p1

    return p1

    :cond_0
    iget-wide v0, p0, Lo8/c;->b:J

    shl-long v5, v3, p1

    sub-long/2addr v5, v3

    and-long/2addr v0, v5

    invoke-static {v0, v1}, Ljava/lang/Long;->bitCount(J)I

    move-result p1

    return p1

    :cond_1
    if-ge p1, v2, :cond_2

    iget-wide v0, p0, Lo8/c;->b:J

    shl-long v5, v3, p1

    sub-long/2addr v5, v3

    and-long/2addr v0, v5

    invoke-static {v0, v1}, Ljava/lang/Long;->bitCount(J)I

    move-result p1

    return p1

    :cond_2
    check-cast v0, Lo8/c;

    sub-int/2addr p1, v2

    invoke-virtual {v0, p1}, Lo8/c;->a(I)I

    move-result p1

    iget-wide v0, p0, Lo8/c;->b:J

    invoke-static {v0, v1}, Ljava/lang/Long;->bitCount(J)I

    move-result v0

    add-int/2addr v0, p1

    return v0
.end method

.method public final b()V
    .locals 2

    iget-object v0, p0, Lo8/c;->c:Ljava/lang/Object;

    check-cast v0, Lo8/c;

    if-nez v0, :cond_0

    new-instance v0, Lo8/c;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lo8/c;-><init>(I)V

    iput-object v0, p0, Lo8/c;->c:Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public final c(I)Z
    .locals 4

    const/16 v0, 0x40

    if-lt p1, v0, :cond_0

    invoke-virtual {p0}, Lo8/c;->b()V

    iget-object v1, p0, Lo8/c;->c:Ljava/lang/Object;

    check-cast v1, Lo8/c;

    sub-int/2addr p1, v0

    invoke-virtual {v1, p1}, Lo8/c;->c(I)Z

    move-result p1

    return p1

    :cond_0
    iget-wide v0, p0, Lo8/c;->b:J

    const-wide/16 v2, 0x1

    shl-long/2addr v2, p1

    and-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final d()V
    .locals 2

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo8/c;->b:J

    iget-object v0, p0, Lo8/c;->c:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lo8/c;

    if-eqz v1, :cond_0

    check-cast v0, Lo8/c;

    invoke-virtual {v0}, Lo8/c;->d()V

    :cond_0
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    iget v0, p0, Lo8/c;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lo8/c;->c:Ljava/lang/Object;

    check-cast v0, Lo8/c;

    if-nez v0, :cond_0

    iget-wide v0, p0, Lo8/c;->b:J

    invoke-static {v0, v1}, Ljava/lang/Long;->toBinaryString(J)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lo8/c;->c:Ljava/lang/Object;

    check-cast v1, Lo8/c;

    invoke-virtual {v1}, Lo8/c;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "xx"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lo8/c;->b:J

    invoke-static {v1, v2}, Ljava/lang/Long;->toBinaryString(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
