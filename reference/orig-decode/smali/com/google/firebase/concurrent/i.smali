.class public final synthetic Lcom/google/firebase/concurrent/i;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Runnable;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Runnable;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lcom/google/firebase/concurrent/i;->a:I

    iput-object p1, p0, Lcom/google/firebase/concurrent/i;->b:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lcom/google/firebase/concurrent/i;->a:I

    iget-object v1, p0, Lcom/google/firebase/concurrent/i;->b:Ljava/lang/Runnable;

    packed-switch v0, :pswitch_data_0

    invoke-static {v1}, Lcom/google/firebase/concurrent/PausableExecutorServiceImpl;->b(Ljava/lang/Runnable;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_0
    invoke-static {v1}, Lcom/google/firebase/concurrent/LimitedConcurrencyExecutorService;->b(Ljava/lang/Runnable;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
