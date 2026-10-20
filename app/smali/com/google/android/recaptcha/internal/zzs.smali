.class final Lcom/google/android/recaptcha/internal/zzs;
.super Lw8/i;

# interfaces
.implements Lc9/e;


# direct methods
.method public constructor <init>(Lu8/e;)V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0, p1}, Lw8/i;-><init>(ILu8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lu8/e;)Lu8/e;
    .locals 0

    new-instance p1, Lcom/google/android/recaptcha/internal/zzs;

    invoke-direct {p1, p2}, Lcom/google/android/recaptcha/internal/zzs;-><init>(Lu8/e;)V

    return-object p1
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lm9/d0;

    check-cast p2, Lu8/e;

    new-instance p1, Lcom/google/android/recaptcha/internal/zzs;

    invoke-direct {p1, p2}, Lcom/google/android/recaptcha/internal/zzs;-><init>(Lu8/e;)V

    sget-object p2, Lq8/l;->a:Lq8/l;

    invoke-virtual {p1, p2}, Lcom/google/android/recaptcha/internal/zzs;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object v0, Lv8/a;->a:Lv8/a;

    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Ljava/lang/Thread;->setPriority(I)V

    sget-object p1, Lq8/l;->a:Lq8/l;

    return-object p1
.end method
