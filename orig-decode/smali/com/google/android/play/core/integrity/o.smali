.class final Lcom/google/android/play/core/integrity/o;
.super Ljava/lang/Object;


# instance fields
.field private final a:Lcom/google/android/play/core/integrity/o;

.field private final b:Lp6/h;

.field private final c:Lp6/h;

.field private final d:Lp6/h;

.field private final e:Lp6/h;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/play/core/integrity/n;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, Lcom/google/android/play/core/integrity/o;->a:Lcom/google/android/play/core/integrity/o;

    new-instance p2, Le/a;

    if-eqz p1, :cond_0

    invoke-direct {p2, p1}, Le/a;-><init>(Ljava/lang/Object;)V

    iput-object p2, p0, Lcom/google/android/play/core/integrity/o;->b:Lp6/h;

    invoke-static {}, Lcom/google/android/play/core/integrity/y;->a()Lcom/google/android/play/core/integrity/z;

    move-result-object p1

    invoke-static {p1}, Lp6/f;->b(Lp6/g;)Lp6/h;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/play/core/integrity/o;->c:Lp6/h;

    new-instance v0, Lcom/google/android/play/core/integrity/af;

    invoke-direct {v0, p2, p1}, Lcom/google/android/play/core/integrity/af;-><init>(Lp6/h;Lp6/h;)V

    invoke-static {v0}, Lp6/f;->b(Lp6/g;)Lp6/h;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/play/core/integrity/o;->d:Lp6/h;

    new-instance p2, Lcom/google/android/play/core/integrity/x;

    invoke-direct {p2, p1}, Lcom/google/android/play/core/integrity/x;-><init>(Lp6/h;)V

    invoke-static {p2}, Lp6/f;->b(Lp6/g;)Lp6/h;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/play/core/integrity/o;->e:Lp6/h;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "instance cannot be null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final a()Lcom/google/android/play/core/integrity/IntegrityManager;
    .locals 1

    iget-object v0, p0, Lcom/google/android/play/core/integrity/o;->e:Lp6/h;

    invoke-interface {v0}, Lp6/h;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/play/core/integrity/IntegrityManager;

    return-object v0
.end method
