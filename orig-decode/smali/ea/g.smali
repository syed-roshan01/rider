.class public final Lea/g;
.super Lea/h;


# virtual methods
.method public final b(Lea/y;)V
    .locals 2

    const-string v0, "stream"

    invoke-static {p1, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lea/b;->f:Lea/b;

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lea/y;->c(Lea/b;Ljava/io/IOException;)V

    return-void
.end method
