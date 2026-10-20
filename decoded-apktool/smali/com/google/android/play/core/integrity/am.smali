.class public final Lcom/google/android/play/core/integrity/am;
.super Ljava/lang/Object;

# interfaces
.implements Lp6/g;


# instance fields
.field private final a:Lp6/h;

.field private final b:Lp6/h;


# direct methods
.method public constructor <init>(Lp6/h;Lp6/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/play/core/integrity/am;->a:Lp6/h;

    iput-object p2, p0, Lcom/google/android/play/core/integrity/am;->b:Lp6/h;

    return-void
.end method


# virtual methods
.method public final bridge synthetic a()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lcom/google/android/play/core/integrity/am;->a:Lp6/h;

    invoke-interface {v0}, Lp6/h;->a()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/play/core/integrity/am;->b:Lp6/h;

    invoke-interface {v1}, Lp6/h;->a()Ljava/lang/Object;

    move-result-object v1

    new-instance v2, Lcom/google/android/play/core/integrity/al;

    check-cast v0, Lcom/google/android/play/core/integrity/ax;

    check-cast v1, Lcom/google/android/play/core/integrity/bd;

    invoke-direct {v2, v0, v1}, Lcom/google/android/play/core/integrity/al;-><init>(Lcom/google/android/play/core/integrity/ax;Lcom/google/android/play/core/integrity/bd;)V

    return-object v2
.end method
