.class public final Lcom/google/android/play/core/integrity/x;
.super Ljava/lang/Object;

# interfaces
.implements Lp6/g;


# instance fields
.field private final a:Lp6/h;


# direct methods
.method public constructor <init>(Lp6/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/play/core/integrity/x;->a:Lp6/h;

    return-void
.end method


# virtual methods
.method public final bridge synthetic a()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/google/android/play/core/integrity/x;->a:Lp6/h;

    invoke-interface {v0}, Lp6/h;->a()Ljava/lang/Object;

    move-result-object v0

    new-instance v1, Lcom/google/android/play/core/integrity/w;

    check-cast v0, Lcom/google/android/play/core/integrity/ad;

    invoke-direct {v1, v0}, Lcom/google/android/play/core/integrity/w;-><init>(Lcom/google/android/play/core/integrity/ad;)V

    return-object v1
.end method
