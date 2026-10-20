.class public final Le8/q;
.super Ljava/lang/Object;

# interfaces
.implements Le8/s;


# virtual methods
.method public final a(Lg8/y3;)Ljava/io/OutputStream;
    .locals 1

    new-instance v0, Ljava/util/zip/GZIPOutputStream;

    invoke-direct {v0, p1}, Ljava/util/zip/GZIPOutputStream;-><init>(Ljava/io/OutputStream;)V

    return-object v0
.end method

.method public final b(Lg8/n4;)Ljava/io/InputStream;
    .locals 1

    new-instance v0, Ljava/util/zip/GZIPInputStream;

    invoke-direct {v0, p1}, Ljava/util/zip/GZIPInputStream;-><init>(Ljava/io/InputStream;)V

    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    const-string v0, "gzip"

    return-object v0
.end method
