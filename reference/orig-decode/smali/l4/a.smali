.class public final Ll4/a;
.super Ljava/lang/Object;


# instance fields
.field public a:Lja/x;

.field public b:Lja/t;

.field public c:D

.field public d:J

.field public e:J

.field public f:Lt9/c;


# virtual methods
.method public final a()Ll4/n;
    .locals 10

    iget-object v3, p0, Ll4/a;->a:Lja/x;

    if-eqz v3, :cond_1

    iget-wide v0, p0, Ll4/a;->c:D

    const-wide/16 v4, 0x0

    cmpl-double v2, v0, v4

    if-lez v2, :cond_0

    :try_start_0
    invoke-virtual {v3}, Lja/x;->e()Ljava/io/File;

    move-result-object v2

    invoke-virtual {v2}, Ljava/io/File;->mkdir()Z

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    new-instance v4, Landroid/os/StatFs;

    invoke-direct {v4, v2}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Landroid/os/StatFs;->getBlockCountLong()J

    move-result-wide v5

    long-to-double v5, v5

    mul-double/2addr v0, v5

    invoke-virtual {v4}, Landroid/os/StatFs;->getBlockSizeLong()J

    move-result-wide v4

    long-to-double v4, v4

    mul-double/2addr v0, v4

    double-to-long v4, v0

    iget-wide v6, p0, Ll4/a;->d:J

    iget-wide v8, p0, Ll4/a;->e:J

    invoke-static/range {v4 .. v9}, Lz6/a;->s(JJJ)J

    move-result-wide v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    iget-wide v0, p0, Ll4/a;->d:J

    :goto_0
    move-wide v1, v0

    goto :goto_1

    :cond_0
    const-wide/16 v0, 0x0

    goto :goto_0

    :goto_1
    new-instance v6, Ll4/n;

    iget-object v4, p0, Ll4/a;->b:Lja/t;

    iget-object v5, p0, Ll4/a;->f:Lt9/c;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Ll4/n;-><init>(JLja/x;Lja/t;Lt9/c;)V

    return-object v6

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "directory == null"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
