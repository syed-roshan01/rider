.class public final Lg8/e;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lg8/f;


# direct methods
.method public constructor <init>(Lg8/f;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg8/e;->b:Lg8/f;

    iput p2, p0, Lg8/e;->a:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lg8/e;->b:Lg8/f;

    :try_start_0
    invoke-static {}, Lo8/b;->d()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    :try_start_1
    invoke-static {}, Lo8/b;->b()V

    iget-object v1, v0, Lg8/f;->a:Lg8/r0;

    iget v2, p0, Lg8/e;->a:I

    invoke-interface {v1, v2}, Lg8/r0;->a(I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    sget-object v1, Lo8/b;->a:Lo8/a;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_1

    :catchall_0
    move-exception v1

    :try_start_3
    sget-object v2, Lo8/b;->a:Lo8/a;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v2

    :try_start_4
    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :catchall_2
    move-exception v1

    check-cast v0, Lh8/k;

    invoke-virtual {v0, v1}, Lh8/k;->b(Ljava/lang/Throwable;)V

    :goto_1
    return-void
.end method
