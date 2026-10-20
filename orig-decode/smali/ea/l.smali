.class public final Lea/l;
.super Ljava/lang/Object;

# interfaces
.implements Lc9/a;


# instance fields
.field public final a:Lea/u;

.field public final synthetic b:Lea/r;


# direct methods
.method public constructor <init>(Lea/r;Lea/u;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lea/l;->b:Lea/r;

    iput-object p2, p0, Lea/l;->a:Lea/u;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lea/l;->b:Lea/r;

    iget-object v1, p0, Lea/l;->a:Lea/u;

    sget-object v2, Lea/b;->d:Lea/b;

    const/4 v3, 0x0

    :try_start_0
    invoke-virtual {v1, p0}, Lea/u;->b(Lea/l;)V

    :cond_0
    const/4 v4, 0x0

    invoke-virtual {v1, v4, p0}, Lea/u;->a(ZLea/l;)Z

    move-result v4

    if-nez v4, :cond_0

    sget-object v4, Lea/b;->b:Lea/b;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    sget-object v2, Lea/b;->n:Lea/b;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-virtual {v0, v4, v2, v3}, Lea/r;->a(Lea/b;Lea/b;Ljava/io/IOException;)V

    :goto_0
    invoke-static {v1}, Ly9/b;->b(Ljava/io/Closeable;)V

    goto :goto_2

    :catchall_0
    move-exception v5

    goto :goto_3

    :catch_0
    move-exception v3

    goto :goto_1

    :catchall_1
    move-exception v5

    move-object v4, v2

    goto :goto_3

    :catch_1
    move-exception v3

    move-object v4, v2

    :goto_1
    :try_start_2
    sget-object v2, Lea/b;->c:Lea/b;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-virtual {v0, v2, v2, v3}, Lea/r;->a(Lea/b;Lea/b;Ljava/io/IOException;)V

    goto :goto_0

    :goto_2
    sget-object v0, Lq8/l;->a:Lq8/l;

    return-object v0

    :goto_3
    invoke-virtual {v0, v4, v2, v3}, Lea/r;->a(Lea/b;Lea/b;Ljava/io/IOException;)V

    invoke-static {v1}, Ly9/b;->b(Ljava/io/Closeable;)V

    throw v5
.end method
