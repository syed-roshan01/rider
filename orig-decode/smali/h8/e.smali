.class public final Lh8/e;
.super Ljava/lang/Object;

# interfaces
.implements Lj8/b;


# static fields
.field public static final d:Ljava/util/logging/Logger;


# instance fields
.field public final a:Lh8/d;

.field public final b:Lj8/b;

.field public final c:Lv6/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lh8/n;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Lh8/e;->d:Ljava/util/logging/Logger;

    return-void
.end method

.method public constructor <init>(Lh8/d;Lh8/b;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lv6/d;

    sget-object v1, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    invoke-direct {v0, v1}, Lv6/d;-><init>(Ljava/util/logging/Level;)V

    iput-object v0, p0, Lh8/e;->c:Lv6/d;

    const-string v0, "transportExceptionHandler"

    invoke-static {p1, v0}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object p1, p0, Lh8/e;->a:Lh8/d;

    iput-object p2, p0, Lh8/e;->b:Lj8/b;

    return-void
.end method


# virtual methods
.method public final D(La4/k;)V
    .locals 4

    iget-object v0, p0, Lh8/e;->c:Lv6/d;

    invoke-virtual {v0}, Lv6/d;->f()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, v0, Lv6/d;->b:Ljava/lang/Object;

    check-cast v1, Ljava/util/logging/Logger;

    iget-object v0, v0, Lv6/d;->c:Ljava/lang/Object;

    check-cast v0, Ljava/util/logging/Level;

    const/4 v2, 0x2

    invoke-static {v2}, La7/a;->H(I)Ljava/lang/String;

    move-result-object v2

    const-string v3, " SETTINGS: ack=true"

    invoke-virtual {v2, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    :cond_0
    :try_start_0
    iget-object v0, p0, Lh8/e;->b:Lj8/b;

    invoke-interface {v0, p1}, Lj8/b;->D(La4/k;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    iget-object v0, p0, Lh8/e;->a:Lh8/d;

    check-cast v0, Lh8/n;

    invoke-virtual {v0, p1}, Lh8/n;->p(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method

.method public final E()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lh8/e;->b:Lj8/b;

    invoke-interface {v0}, Lj8/b;->E()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    iget-object v1, p0, Lh8/e;->a:Lh8/d;

    check-cast v1, Lh8/n;

    invoke-virtual {v1, v0}, Lh8/n;->p(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method

.method public final G(ZILjava/util/List;)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lh8/e;->b:Lj8/b;

    invoke-interface {v0, p1, p2, p3}, Lj8/b;->G(ZILjava/util/List;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    iget-object p2, p0, Lh8/e;->a:Lh8/d;

    check-cast p2, Lh8/n;

    invoke-virtual {p2, p1}, Lh8/n;->p(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method

.method public final N(IJ)V
    .locals 2

    const/4 v0, 0x2

    iget-object v1, p0, Lh8/e;->c:Lv6/d;

    invoke-virtual {v1, v0, p1, p2, p3}, Lv6/d;->l(IIJ)V

    :try_start_0
    iget-object v0, p0, Lh8/e;->b:Lj8/b;

    invoke-interface {v0, p1, p2, p3}, Lj8/b;->N(IJ)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    iget-object p2, p0, Lh8/e;->a:Lh8/d;

    check-cast p2, Lh8/n;

    invoke-virtual {p2, p1}, Lh8/n;->p(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method

.method public final R()I
    .locals 1

    iget-object v0, p0, Lh8/e;->b:Lj8/b;

    invoke-interface {v0}, Lj8/b;->R()I

    move-result v0

    return v0
.end method

.method public final X(IZI)V
    .locals 9

    const-wide v0, 0xffffffffL

    const/16 v2, 0x20

    const/4 v3, 0x2

    iget-object v4, p0, Lh8/e;->c:Lv6/d;

    if-eqz p2, :cond_0

    int-to-long v5, p1

    shl-long/2addr v5, v2

    int-to-long v7, p3

    and-long/2addr v0, v7

    or-long/2addr v0, v5

    invoke-virtual {v4}, Lv6/d;->f()Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, v4, Lv6/d;->b:Ljava/lang/Object;

    check-cast v2, Ljava/util/logging/Logger;

    iget-object v4, v4, Lv6/d;->c:Ljava/lang/Object;

    check-cast v4, Ljava/util/logging/Level;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v3}, La7/a;->H(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " PING: ack=true bytes="

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v4, v0}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    int-to-long v5, p1

    shl-long/2addr v5, v2

    int-to-long v7, p3

    and-long/2addr v0, v7

    or-long/2addr v0, v5

    invoke-virtual {v4, v3, v0, v1}, Lv6/d;->i(IJ)V

    :cond_1
    :goto_0
    :try_start_0
    iget-object v0, p0, Lh8/e;->b:Lj8/b;

    invoke-interface {v0, p1, p2, p3}, Lj8/b;->X(IZI)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    iget-object p2, p0, Lh8/e;->a:Lh8/d;

    check-cast p2, Lh8/n;

    invoke-virtual {p2, p1}, Lh8/n;->p(Ljava/lang/Exception;)V

    :goto_1
    return-void
.end method

.method public final close()V
    .locals 4

    :try_start_0
    iget-object v0, p0, Lh8/e;->b:Lj8/b;

    invoke-interface {v0}, Ljava/io/Closeable;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    const-class v2, Ljava/io/IOException;

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    goto :goto_0

    :cond_0
    sget-object v1, Ljava/util/logging/Level;->INFO:Ljava/util/logging/Level;

    :goto_0
    const-string v2, "Failed closing connection"

    sget-object v3, Lh8/e;->d:Ljava/util/logging/Logger;

    invoke-virtual {v3, v1, v2, v0}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_1
    return-void
.end method

.method public final d(Lj8/a;[B)V
    .locals 5

    iget-object v0, p0, Lh8/e;->b:Lj8/b;

    invoke-static {p2}, Lja/j;->l([B)Lja/j;

    move-result-object v1

    iget-object v2, p0, Lh8/e;->c:Lv6/d;

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4, p1, v1}, Lv6/d;->h(IILj8/a;Lja/j;)V

    :try_start_0
    invoke-interface {v0, p1, p2}, Lj8/b;->d(Lj8/a;[B)V

    invoke-interface {v0}, Lj8/b;->flush()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    iget-object p2, p0, Lh8/e;->a:Lh8/d;

    check-cast p2, Lh8/n;

    invoke-virtual {p2, p1}, Lh8/n;->p(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method

.method public final flush()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lh8/e;->b:Lj8/b;

    invoke-interface {v0}, Lj8/b;->flush()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    iget-object v1, p0, Lh8/e;->a:Lh8/d;

    check-cast v1, Lh8/n;

    invoke-virtual {v1, v0}, Lh8/n;->p(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method

.method public final o(ILj8/a;)V
    .locals 2

    const/4 v0, 0x2

    iget-object v1, p0, Lh8/e;->c:Lv6/d;

    invoke-virtual {v1, v0, p1, p2}, Lv6/d;->j(IILj8/a;)V

    :try_start_0
    iget-object v0, p0, Lh8/e;->b:Lj8/b;

    invoke-interface {v0, p1, p2}, Lj8/b;->o(ILj8/a;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    iget-object p2, p0, Lh8/e;->a:Lh8/d;

    check-cast p2, Lh8/n;

    invoke-virtual {p2, p1}, Lh8/n;->p(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method

.method public final r(IILja/g;Z)V
    .locals 6

    iget-object v0, p0, Lh8/e;->c:Lv6/d;

    const/4 v1, 0x2

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move v2, p1

    move-object v3, p3

    move v4, p2

    move v5, p4

    invoke-virtual/range {v0 .. v5}, Lv6/d;->g(IILja/g;IZ)V

    :try_start_0
    iget-object v0, p0, Lh8/e;->b:Lj8/b;

    invoke-interface {v0, p1, p2, p3, p4}, Lj8/b;->r(IILja/g;Z)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    iget-object p2, p0, Lh8/e;->a:Lh8/d;

    check-cast p2, Lh8/n;

    invoke-virtual {p2, p1}, Lh8/n;->p(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method

.method public final v(La4/k;)V
    .locals 2

    const/4 v0, 0x2

    iget-object v1, p0, Lh8/e;->c:Lv6/d;

    invoke-virtual {v1, v0, p1}, Lv6/d;->k(ILa4/k;)V

    :try_start_0
    iget-object v0, p0, Lh8/e;->b:Lj8/b;

    invoke-interface {v0, p1}, Lj8/b;->v(La4/k;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    iget-object v0, p0, Lh8/e;->a:Lh8/d;

    check-cast v0, Lh8/n;

    invoke-virtual {v0, p1}, Lh8/n;->p(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method
