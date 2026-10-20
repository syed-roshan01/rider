.class public final Lg8/k;
.super Ljava/lang/Object;

# interfaces
.implements Lg8/v3;


# instance fields
.field public final a:Lg8/j;

.field public final b:Lg8/v3;

.field public final c:Ljava/util/ArrayDeque;


# direct methods
.method public constructor <init>(Lg8/v3;Lg8/v1;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Lg8/k;->c:Ljava/util/ArrayDeque;

    iput-object p1, p0, Lg8/k;->b:Lg8/v3;

    iput-object p2, p0, Lg8/k;->a:Lg8/j;

    return-void
.end method


# virtual methods
.method public final a(Lg8/a6;)V
    .locals 2

    :goto_0
    invoke-interface {p1}, Lg8/a6;->next()Ljava/io/InputStream;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lg8/k;->c:Ljava/util/ArrayDeque;

    invoke-virtual {v1, v0}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final b(Ljava/lang/Throwable;)V
    .locals 2

    new-instance v0, Lg8/x1;

    const/4 v1, 0x2

    invoke-direct {v0, p0, p1, v1}, Lg8/x1;-><init>(Ljava/lang/Object;Ljava/lang/Throwable;I)V

    iget-object p1, p0, Lg8/k;->a:Lg8/j;

    check-cast p1, Lh8/k;

    invoke-virtual {p1, v0}, Lh8/k;->o(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final c(Z)V
    .locals 2

    new-instance v0, Lk6/m4;

    const/4 v1, 0x2

    invoke-direct {v0, v1, p0, p1}, Lk6/m4;-><init>(ILjava/lang/Object;Z)V

    iget-object p1, p0, Lg8/k;->a:Lg8/j;

    check-cast p1, Lh8/k;

    invoke-virtual {p1, v0}, Lh8/k;->o(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final d(I)V
    .locals 2

    new-instance v0, Lcom/google/android/gms/common/api/internal/c0;

    const/4 v1, 0x2

    invoke-direct {v0, p0, p1, v1}, Lcom/google/android/gms/common/api/internal/c0;-><init>(Ljava/lang/Object;II)V

    iget-object p1, p0, Lg8/k;->a:Lg8/j;

    check-cast p1, Lh8/k;

    invoke-virtual {p1, v0}, Lh8/k;->o(Ljava/lang/Runnable;)V

    return-void
.end method
