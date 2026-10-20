.class public final Le8/j1;
.super Le8/i1;


# instance fields
.field public final e:Le8/k1;


# direct methods
.method public constructor <init>(Ljava/lang/String;ZLe8/k1;)V
    .locals 1

    invoke-direct {p0, p1, p2, p3}, Le8/i1;-><init>(Ljava/lang/String;ZLjava/lang/Object;)V

    const-string p2, "-bin"

    invoke-virtual {p1, p2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    iput-object p3, p0, Le8/j1;->e:Le8/k1;

    return-void

    :cond_0
    new-instance p3, Ljava/lang/IllegalArgumentException;

    filled-new-array {p1, p2}, [Ljava/lang/Object;

    move-result-object p1

    const-string p2, "ASCII header is named %s.  Only binary headers may end with %s"

    invoke-static {p2, p1}, Lf6/a;->c0(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p3, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p3
.end method


# virtual methods
.method public final a([B)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Le8/j1;->e:Le8/k1;

    invoke-interface {v0, p1}, Le8/k1;->b([B)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ljava/io/Serializable;)[B
    .locals 1

    iget-object v0, p0, Le8/j1;->e:Le8/k1;

    invoke-interface {v0, p1}, Le8/k1;->a(Ljava/io/Serializable;)[B

    move-result-object p1

    const-string v0, "null marshaller.toAsciiString()"

    invoke-static {p1, v0}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1
.end method
