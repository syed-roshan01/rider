.class public final Lm0/i3;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/Iterator;
.implements Le9/a;


# instance fields
.field public final a:Lm0/n2;

.field public final b:I

.field public c:I


# direct methods
.method public constructor <init>(Lm0/n2;Lm0/s0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm0/i3;->a:Lm0/n2;

    iget p1, p1, Lm0/n2;->n:I

    iput p1, p0, Lm0/i3;->b:I

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public final remove()V
    .locals 2

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Operation is not supported for read-only collection"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
