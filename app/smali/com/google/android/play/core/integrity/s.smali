.class final Lcom/google/android/play/core/integrity/s;
.super Ljava/lang/Object;


# instance fields
.field private final a:Lcom/google/android/play/core/integrity/s;

.field private final b:Lp6/h;

.field private final c:Lp6/h;

.field private final d:Lp6/h;

.field private final e:Lp6/h;

.field private final f:Lp6/h;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/play/core/integrity/r;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, Lcom/google/android/play/core/integrity/s;->a:Lcom/google/android/play/core/integrity/s;

    new-instance p2, Le/a;

    if-eqz p1, :cond_0

    invoke-direct {p2, p1}, Le/a;-><init>(Ljava/lang/Object;)V

    iput-object p2, p0, Lcom/google/android/play/core/integrity/s;->b:Lp6/h;

    invoke-static {}, Lcom/google/android/play/core/integrity/an;->a()Lcom/google/android/play/core/integrity/ao;

    move-result-object p1

    invoke-static {p1}, Lp6/f;->b(Lp6/g;)Lp6/h;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/play/core/integrity/s;->c:Lp6/h;

    new-instance v0, Lcom/google/android/play/core/integrity/az;

    invoke-direct {v0, p2, p1}, Lcom/google/android/play/core/integrity/az;-><init>(Lp6/h;Lp6/h;)V

    invoke-static {v0}, Lp6/f;->b(Lp6/g;)Lp6/h;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/play/core/integrity/s;->d:Lp6/h;

    new-instance p2, Lcom/google/android/play/core/integrity/be;

    invoke-direct {p2, p1}, Lcom/google/android/play/core/integrity/be;-><init>(Lp6/h;)V

    invoke-static {p2}, Lp6/f;->b(Lp6/g;)Lp6/h;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/play/core/integrity/s;->e:Lp6/h;

    new-instance v0, Lcom/google/android/play/core/integrity/am;

    invoke-direct {v0, p1, p2}, Lcom/google/android/play/core/integrity/am;-><init>(Lp6/h;Lp6/h;)V

    invoke-static {v0}, Lp6/f;->b(Lp6/g;)Lp6/h;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/play/core/integrity/s;->f:Lp6/h;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "instance cannot be null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final a()Lcom/google/android/play/core/integrity/StandardIntegrityManager;
    .locals 1

    iget-object v0, p0, Lcom/google/android/play/core/integrity/s;->f:Lp6/h;

    invoke-interface {v0}, Lp6/h;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/play/core/integrity/StandardIntegrityManager;

    return-object v0
.end method
