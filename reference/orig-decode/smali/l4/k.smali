.class public final Ll4/k;
.super Lja/n;


# instance fields
.field public final b:Lc9/c;

.field public c:Z


# direct methods
.method public constructor <init>(Lja/e0;Lh1/b;)V
    .locals 0

    invoke-direct {p0, p1}, Lja/n;-><init>(Lja/e0;)V

    iput-object p2, p0, Ll4/k;->b:Lc9/c;

    return-void
.end method


# virtual methods
.method public final b0(Lja/g;J)V
    .locals 1

    iget-boolean v0, p0, Ll4/k;->c:Z

    if-eqz v0, :cond_0

    invoke-virtual {p1, p2, p3}, Lja/g;->l(J)V

    return-void

    :cond_0
    :try_start_0
    invoke-super {p0, p1, p2, p3}, Lja/n;->b0(Lja/g;J)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const/4 p2, 0x1

    iput-boolean p2, p0, Ll4/k;->c:Z

    iget-object p2, p0, Ll4/k;->b:Lc9/c;

    invoke-interface {p2, p1}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    return-void
.end method

.method public final close()V
    .locals 2

    :try_start_0
    invoke-super {p0}, Lja/n;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const/4 v1, 0x1

    iput-boolean v1, p0, Ll4/k;->c:Z

    iget-object v1, p0, Ll4/k;->b:Lc9/c;

    invoke-interface {v1, v0}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    return-void
.end method

.method public final flush()V
    .locals 2

    :try_start_0
    invoke-super {p0}, Lja/n;->flush()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const/4 v1, 0x1

    iput-boolean v1, p0, Ll4/k;->c:Z

    iget-object v1, p0, Ll4/k;->b:Lc9/c;

    invoke-interface {v1, v0}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    return-void
.end method
