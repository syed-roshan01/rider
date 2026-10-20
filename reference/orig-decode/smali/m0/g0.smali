.class public final Lm0/g0;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/Choreographer$FrameCallback;


# instance fields
.field public final synthetic a:Lm9/k;

.field public final synthetic b:Lc9/c;


# direct methods
.method public constructor <init>(Lm9/l;Lc9/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm0/g0;->a:Lm9/k;

    iput-object p2, p0, Lm0/g0;->b:Lc9/c;

    return-void
.end method


# virtual methods
.method public final doFrame(J)V
    .locals 1

    sget-object v0, Lm0/h0;->a:Landroid/view/Choreographer;

    iget-object v0, p0, Lm0/g0;->b:Lc9/c;

    :try_start_0
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-interface {v0, p1}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-static {p1}, Ld7/t;->N(Ljava/lang/Throwable;)Lq8/g;

    move-result-object p1

    :goto_0
    iget-object p2, p0, Lm0/g0;->a:Lm9/k;

    invoke-interface {p2, p1}, Lu8/e;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method
