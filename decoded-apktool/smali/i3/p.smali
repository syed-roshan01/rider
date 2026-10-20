.class public final Li3/p;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# virtual methods
.method public final run()V
    .locals 2

    :try_start_0
    const-string v0, "EmojiCompat.EmojiCompatInitializer.run"

    sget v1, Lx2/q;->a:I

    invoke-static {v0}, Lx2/p;->a(Ljava/lang/String;)V

    invoke-static {}, Li3/l;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Li3/l;->a()Li3/l;

    move-result-object v0

    invoke-virtual {v0}, Li3/l;->d()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    invoke-static {}, Lx2/p;->b()V

    return-void

    :goto_1
    sget v1, Lx2/q;->a:I

    invoke-static {}, Lx2/p;->b()V

    throw v0
.end method
