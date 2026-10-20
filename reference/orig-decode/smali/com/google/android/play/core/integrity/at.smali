.class Lcom/google/android/play/core/integrity/at;
.super Lp6/o;


# instance fields
.field final a:Lcom/google/android/gms/tasks/TaskCompletionSource;

.field final synthetic b:Lcom/google/android/play/core/integrity/ax;


# direct methods
.method public constructor <init>(Lcom/google/android/play/core/integrity/ax;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/play/core/integrity/at;->b:Lcom/google/android/play/core/integrity/ax;

    const-string p1, "com.google.android.play.core.integrity.protocol.IExpressIntegrityServiceCallback"

    invoke-direct {p0, p1}, Lp6/i;-><init>(Ljava/lang/String;)V

    iput-object p2, p0, Lcom/google/android/play/core/integrity/at;->a:Lcom/google/android/gms/tasks/TaskCompletionSource;

    return-void
.end method


# virtual methods
.method public final b(Landroid/os/Bundle;)V
    .locals 1

    iget-object p1, p0, Lcom/google/android/play/core/integrity/at;->b:Lcom/google/android/play/core/integrity/ax;

    iget-object p1, p1, Lcom/google/android/play/core/integrity/ax;->a:Lp6/c;

    iget-object v0, p0, Lcom/google/android/play/core/integrity/at;->a:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-virtual {p1, v0}, Lp6/c;->c(Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    return-void
.end method

.method public c(Landroid/os/Bundle;)V
    .locals 1

    iget-object p1, p0, Lcom/google/android/play/core/integrity/at;->b:Lcom/google/android/play/core/integrity/ax;

    iget-object p1, p1, Lcom/google/android/play/core/integrity/ax;->a:Lp6/c;

    iget-object v0, p0, Lcom/google/android/play/core/integrity/at;->a:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-virtual {p1, v0}, Lp6/c;->c(Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    return-void
.end method

.method public final d(Landroid/os/Bundle;)V
    .locals 1

    iget-object p1, p0, Lcom/google/android/play/core/integrity/at;->b:Lcom/google/android/play/core/integrity/ax;

    iget-object p1, p1, Lcom/google/android/play/core/integrity/ax;->a:Lp6/c;

    iget-object v0, p0, Lcom/google/android/play/core/integrity/at;->a:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-virtual {p1, v0}, Lp6/c;->c(Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    return-void
.end method

.method public e(Landroid/os/Bundle;)V
    .locals 1

    iget-object p1, p0, Lcom/google/android/play/core/integrity/at;->b:Lcom/google/android/play/core/integrity/ax;

    iget-object p1, p1, Lcom/google/android/play/core/integrity/ax;->a:Lp6/c;

    iget-object v0, p0, Lcom/google/android/play/core/integrity/at;->a:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-virtual {p1, v0}, Lp6/c;->c(Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    return-void
.end method
