.class public final Lcom/google/android/gms/common/api/internal/r0;
.super Lcom/google/android/gms/common/api/internal/q0;


# instance fields
.field public final c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 1

    const/4 v0, 0x4

    invoke-direct {p0, v0, p1}, Lcom/google/android/gms/common/api/internal/q0;-><init>(ILcom/google/android/gms/tasks/TaskCompletionSource;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/r0;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final bridge synthetic d(Landroidx/fragment/app/x;Z)V
    .locals 0

    return-void
.end method

.method public final f(Lcom/google/android/gms/common/api/internal/d0;)Z
    .locals 1

    iget-object p1, p1, Lcom/google/android/gms/common/api/internal/d0;->f:Ljava/util/HashMap;

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/r0;->c:Ljava/lang/Object;

    invoke-static {v0}, La7/a;->w(Ljava/lang/Object;)V

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, La7/a;->w(Ljava/lang/Object;)V

    const/4 p1, 0x0

    return p1
.end method

.method public final g(Lcom/google/android/gms/common/api/internal/d0;)[Lz5/d;
    .locals 1

    iget-object p1, p1, Lcom/google/android/gms/common/api/internal/d0;->f:Ljava/util/HashMap;

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/r0;->c:Ljava/lang/Object;

    invoke-static {v0}, La7/a;->w(Ljava/lang/Object;)V

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, La7/a;->w(Ljava/lang/Object;)V

    return-object v0
.end method

.method public final h(Lcom/google/android/gms/common/api/internal/d0;)V
    .locals 1

    iget-object p1, p1, Lcom/google/android/gms/common/api/internal/d0;->f:Ljava/util/HashMap;

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/r0;->c:Ljava/lang/Object;

    invoke-static {v0}, La7/a;->w(Ljava/lang/Object;)V

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, La7/a;->w(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/q0;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->trySetResult(Ljava/lang/Object;)Z

    return-void
.end method
