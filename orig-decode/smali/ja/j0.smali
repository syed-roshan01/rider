.class public final Lja/j0;
.super Lja/m;


# static fields
.field public static final e:Lja/x;


# instance fields
.field public final b:Lja/x;

.field public final c:Lja/m;

.field public final d:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Lja/x;->b:Ljava/lang/String;

    const/4 v0, 0x0

    const-string v1, "/"

    invoke-static {v1, v0}, Lfa/l;->i(Ljava/lang/String;Z)Lja/x;

    move-result-object v0

    sput-object v0, Lja/j0;->e:Lja/x;

    return-void
.end method

.method public constructor <init>(Lja/x;Lja/m;Ljava/util/LinkedHashMap;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lja/j0;->b:Lja/x;

    iput-object p2, p0, Lja/j0;->c:Lja/m;

    iput-object p3, p0, Lja/j0;->d:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final a(Lja/x;)Lja/e0;
    .locals 1

    new-instance p1, Ljava/io/IOException;

    const-string v0, "zip file systems are read-only"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final b(Lja/x;Lja/x;)V
    .locals 1

    const-string v0, "source"

    invoke-static {p1, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "target"

    invoke-static {p2, p1}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ljava/io/IOException;

    const-string p2, "zip file systems are read-only"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final c(Lja/x;)V
    .locals 1

    new-instance p1, Ljava/io/IOException;

    const-string v0, "zip file systems are read-only"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final d(Lja/x;)V
    .locals 1

    const-string v0, "path"

    invoke-static {p1, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ljava/io/IOException;

    const-string v0, "zip file systems are read-only"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final g(Lja/x;)Ljava/util/List;
    .locals 3

    const-string v0, "dir"

    invoke-static {p1, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lja/j0;->e:Lja/x;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x1

    invoke-static {v0, p1, v1}, Lka/c;->b(Lja/x;Lja/x;Z)Lja/x;

    move-result-object v0

    iget-object v1, p0, Lja/j0;->d:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lka/g;

    if-eqz v0, :cond_0

    iget-object p1, v0, Lka/g;->h:Ljava/util/ArrayList;

    invoke-static {p1}, Lr8/p;->W0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "not a directory: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final i(Lja/x;)Lja/l;
    .locals 10

    const-string v0, "path"

    invoke-static {p1, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lja/j0;->e:Lja/x;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x1

    invoke-static {v0, p1, v1}, Lka/c;->b(Lja/x;Lja/x;Z)Lja/x;

    move-result-object p1

    iget-object v0, p0, Lja/j0;->d:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lka/g;

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    new-instance v9, Lja/l;

    iget-boolean v3, p1, Lka/g;->b:Z

    xor-int/lit8 v2, v3, 0x1

    const/4 v4, 0x0

    if-eqz v3, :cond_1

    move-object v5, v0

    goto :goto_0

    :cond_1
    iget-wide v5, p1, Lka/g;->d:J

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    move-object v5, v1

    :goto_0
    const/4 v6, 0x0

    iget-object v7, p1, Lka/g;->f:Ljava/lang/Long;

    const/4 v8, 0x0

    move-object v1, v9

    invoke-direct/range {v1 .. v8}, Lja/l;-><init>(ZZLja/x;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V

    iget-wide v1, p1, Lka/g;->g:J

    const-wide/16 v3, -0x1

    cmp-long p1, v1, v3

    if-nez p1, :cond_2

    return-object v9

    :cond_2
    iget-object p1, p0, Lja/j0;->c:Lja/m;

    iget-object v3, p0, Lja/j0;->b:Lja/x;

    invoke-virtual {p1, v3}, Lja/m;->j(Lja/x;)Lja/s;

    move-result-object p1

    :try_start_0
    invoke-virtual {p1, v1, v2}, Lja/s;->e(J)Lja/k;

    move-result-object v1

    invoke-static {v1}, Lr9/a;->c(Lja/g0;)Lja/a0;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    :try_start_1
    invoke-static {v1, v9}, Lr9/a;->j(Lja/a0;Lja/l;)Lja/l;

    move-result-object v2

    invoke-static {v2}, Ld7/a;->j(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-virtual {v1}, Lja/a0;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-object v1, v0

    goto :goto_2

    :catchall_0
    move-exception v1

    goto :goto_2

    :catchall_1
    move-exception v2

    :try_start_3
    invoke-virtual {v1}, Lja/a0;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_1

    :catchall_2
    move-exception v1

    :try_start_4
    invoke-static {v2, v1}, Ld7/a;->c(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    :goto_1
    move-object v1, v2

    move-object v2, v0

    :goto_2
    if-nez v1, :cond_3

    invoke-static {v2}, Ld7/a;->j(Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    :try_start_5
    invoke-virtual {p1}, Lja/s;->a()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    goto :goto_5

    :catchall_3
    move-exception v0

    goto :goto_5

    :catchall_4
    move-exception v1

    goto :goto_3

    :cond_3
    :try_start_6
    throw v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    :goto_3
    if-eqz p1, :cond_4

    :try_start_7
    invoke-virtual {p1}, Lja/s;->a()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    goto :goto_4

    :catchall_5
    move-exception p1

    invoke-static {v1, p1}, Ld7/a;->c(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    :cond_4
    :goto_4
    move-object v2, v0

    move-object v0, v1

    :goto_5
    if-nez v0, :cond_5

    invoke-static {v2}, Ld7/a;->j(Ljava/lang/Object;)V

    return-object v2

    :cond_5
    throw v0
.end method

.method public final j(Lja/x;)Lja/s;
    .locals 1

    const-string v0, "file"

    invoke-static {p1, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "not implemented yet!"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final k(Lja/x;)Lja/e0;
    .locals 1

    const-string v0, "file"

    invoke-static {p1, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ljava/io/IOException;

    const-string v0, "zip file systems are read-only"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final l(Lja/x;)Lja/g0;
    .locals 8

    const-string v0, "file"

    invoke-static {p1, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lja/j0;->e:Lja/x;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x1

    invoke-static {v0, p1, v1}, Lka/c;->b(Lja/x;Lja/x;Z)Lja/x;

    move-result-object v0

    iget-object v2, p0, Lja/j0;->d:Ljava/util/Map;

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lka/g;

    if-eqz v0, :cond_3

    iget-object p1, p0, Lja/j0;->c:Lja/m;

    iget-object v2, p0, Lja/j0;->b:Lja/x;

    invoke-virtual {p1, v2}, Lja/m;->j(Lja/x;)Lja/s;

    move-result-object p1

    const/4 v2, 0x0

    :try_start_0
    iget-wide v3, v0, Lka/g;->g:J

    invoke-virtual {p1, v3, v4}, Lja/s;->e(J)Lja/k;

    move-result-object v3

    invoke-static {v3}, Lr9/a;->c(Lja/g0;)Lja/a0;

    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-virtual {p1}, Lja/s;->a()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-object p1, v2

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_1

    :catchall_1
    move-exception v3

    if-eqz p1, :cond_0

    :try_start_2
    invoke-virtual {p1}, Lja/s;->a()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_0

    :catchall_2
    move-exception p1

    invoke-static {v3, p1}, Ld7/a;->c(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    :cond_0
    :goto_0
    move-object p1, v3

    move-object v3, v2

    :goto_1
    if-nez p1, :cond_2

    invoke-static {v3}, Ld7/a;->j(Ljava/lang/Object;)V

    invoke-static {v3, v2}, Lr9/a;->j(Lja/a0;Lja/l;)Lja/l;

    iget p1, v0, Lka/g;->e:I

    iget-wide v4, v0, Lka/g;->d:J

    if-nez p1, :cond_1

    new-instance p1, Lka/e;

    invoke-direct {p1, v3, v4, v5, v1}, Lka/e;-><init>(Lja/g0;JZ)V

    goto :goto_2

    :cond_1
    new-instance p1, Lja/r;

    new-instance v2, Lka/e;

    iget-wide v6, v0, Lka/g;->c:J

    invoke-direct {v2, v3, v6, v7, v1}, Lka/e;-><init>(Lja/g0;JZ)V

    new-instance v0, Ljava/util/zip/Inflater;

    invoke-direct {v0, v1}, Ljava/util/zip/Inflater;-><init>(Z)V

    invoke-static {v2}, Lr9/a;->c(Lja/g0;)Lja/a0;

    move-result-object v1

    invoke-direct {p1, v1, v0}, Lja/r;-><init>(Lja/a0;Ljava/util/zip/Inflater;)V

    new-instance v0, Lka/e;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v4, v5, v1}, Lka/e;-><init>(Lja/g0;JZ)V

    move-object p1, v0

    :goto_2
    return-object p1

    :cond_2
    throw p1

    :cond_3
    new-instance v0, Ljava/io/FileNotFoundException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "no such file: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
