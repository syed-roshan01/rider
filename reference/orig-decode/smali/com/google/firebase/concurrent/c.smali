.class public final synthetic Lcom/google/firebase/concurrent/c;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Runnable;

.field public final synthetic c:Lcom/google/firebase/concurrent/DelegatingScheduledFuture$Completer;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Runnable;Lcom/google/firebase/concurrent/DelegatingScheduledFuture$Completer;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p3, p0, Lcom/google/firebase/concurrent/c;->a:I

    iput-object p1, p0, Lcom/google/firebase/concurrent/c;->b:Ljava/lang/Runnable;

    iput-object p2, p0, Lcom/google/firebase/concurrent/c;->c:Lcom/google/firebase/concurrent/DelegatingScheduledFuture$Completer;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget v0, p0, Lcom/google/firebase/concurrent/c;->a:I

    iget-object v1, p0, Lcom/google/firebase/concurrent/c;->c:Lcom/google/firebase/concurrent/DelegatingScheduledFuture$Completer;

    iget-object v2, p0, Lcom/google/firebase/concurrent/c;->b:Ljava/lang/Runnable;

    packed-switch v0, :pswitch_data_0

    invoke-static {v2, v1}, Lcom/google/firebase/concurrent/DelegatingScheduledExecutorService;->j(Ljava/lang/Runnable;Lcom/google/firebase/concurrent/DelegatingScheduledFuture$Completer;)V

    return-void

    :pswitch_0
    invoke-static {v2, v1}, Lcom/google/firebase/concurrent/DelegatingScheduledExecutorService;->b(Ljava/lang/Runnable;Lcom/google/firebase/concurrent/DelegatingScheduledFuture$Completer;)V

    return-void

    :pswitch_1
    invoke-static {v2, v1}, Lcom/google/firebase/concurrent/DelegatingScheduledExecutorService;->h(Ljava/lang/Runnable;Lcom/google/firebase/concurrent/DelegatingScheduledFuture$Completer;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
