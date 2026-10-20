.class public abstract Lg8/q0;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lh8/c;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lg8/q0;->a:I

    .line 2
    invoke-direct {p0, p1, v0}, Lg8/q0;-><init>(Ljava/lang/Object;I)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lg8/q0;->a:I

    iput-object p1, p0, Lg8/q0;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public abstract a()V
.end method

.method public abstract b()V
.end method

.method public final run()V
    .locals 3

    iget v0, p0, Lg8/q0;->a:I

    iget-object v1, p0, Lg8/q0;->b:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    :try_start_0
    move-object v0, v1

    check-cast v0, Lh8/c;

    iget-object v0, v0, Lh8/c;->p:Lja/e0;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lg8/q0;->a()V

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/io/IOException;

    const-string v2, "Unable to perform write due to unavailable sink."

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    check-cast v1, Lh8/c;

    iget-object v1, v1, Lh8/c;->d:Lh8/d;

    check-cast v1, Lh8/n;

    invoke-virtual {v1, v0}, Lh8/n;->p(Ljava/lang/Exception;)V

    :goto_1
    return-void

    :pswitch_0
    check-cast v1, Le8/b0;

    invoke-virtual {v1}, Le8/b0;->a()Le8/b0;

    move-result-object v0

    :try_start_1
    invoke-virtual {p0}, Lg8/q0;->b()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-virtual {v1, v0}, Le8/b0;->c(Le8/b0;)V

    return-void

    :catchall_0
    move-exception v2

    invoke-virtual {v1, v0}, Le8/b0;->c(Le8/b0;)V

    throw v2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
