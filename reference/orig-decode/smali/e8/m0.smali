.class public final Le8/m0;
.super Ljava/lang/Object;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Le8/l0;

.field public final c:J

.field public final d:Le8/p0;

.field public final e:Le8/p0;


# direct methods
.method public constructor <init>(Ljava/lang/String;Le8/l0;JLe8/p0;Le8/p0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le8/m0;->a:Ljava/lang/String;

    const-string p1, "severity"

    invoke-static {p2, p1}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object p2, p0, Le8/m0;->b:Le8/l0;

    iput-wide p3, p0, Le8/m0;->c:J

    iput-object p5, p0, Le8/m0;->d:Le8/p0;

    iput-object p6, p0, Le8/m0;->e:Le8/p0;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 6

    instance-of v0, p1, Le8/m0;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Le8/m0;

    iget-object v0, p1, Le8/m0;->a:Ljava/lang/String;

    iget-object v2, p0, Le8/m0;->a:Ljava/lang/String;

    invoke-static {v2, v0}, Ly3/e;->f0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Le8/m0;->b:Le8/l0;

    iget-object v2, p1, Le8/m0;->b:Le8/l0;

    invoke-static {v0, v2}, Ly3/e;->f0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-wide v2, p0, Le8/m0;->c:J

    iget-wide v4, p1, Le8/m0;->c:J

    cmp-long v0, v2, v4

    if-nez v0, :cond_0

    iget-object v0, p0, Le8/m0;->d:Le8/p0;

    iget-object v2, p1, Le8/m0;->d:Le8/p0;

    invoke-static {v0, v2}, Ly3/e;->f0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Le8/m0;->e:Le8/p0;

    iget-object p1, p1, Le8/m0;->e:Le8/p0;

    invoke-static {v0, p1}, Ly3/e;->f0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public final hashCode()I
    .locals 5

    iget-wide v0, p0, Le8/m0;->c:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iget-object v1, p0, Le8/m0;->d:Le8/p0;

    iget-object v2, p0, Le8/m0;->e:Le8/p0;

    iget-object v3, p0, Le8/m0;->a:Ljava/lang/String;

    iget-object v4, p0, Le8/m0;->b:Le8/l0;

    filled-new-array {v3, v4, v0, v1, v2}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    invoke-static {p0}, Lf6/a;->j0(Ljava/lang/Object;)Lq6/g;

    move-result-object v0

    const-string v1, "description"

    iget-object v2, p0, Le8/m0;->a:Ljava/lang/String;

    invoke-virtual {v0, v2, v1}, Lq6/g;->a(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "severity"

    iget-object v2, p0, Le8/m0;->b:Le8/l0;

    invoke-virtual {v0, v2, v1}, Lq6/g;->a(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "timestampNanos"

    iget-wide v2, p0, Le8/m0;->c:J

    invoke-virtual {v0, v1, v2, v3}, Lq6/g;->b(Ljava/lang/String;J)V

    const-string v1, "channelRef"

    iget-object v2, p0, Le8/m0;->d:Le8/p0;

    invoke-virtual {v0, v2, v1}, Lq6/g;->a(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "subchannelRef"

    iget-object v2, p0, Le8/m0;->e:Le8/p0;

    invoke-virtual {v0, v2, v1}, Lq6/g;->a(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lq6/g;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
