.class public abstract Li3/h;
.super Ljava/lang/Object;


# instance fields
.field public final a:Li3/k;

.field public b:I

.field public final c:Li3/e;


# direct methods
.method public constructor <init>(Li3/k;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Li3/h;->b:I

    new-instance v0, Li3/e;

    invoke-direct {v0}, Li3/e;-><init>()V

    iput-object v0, p0, Li3/h;->c:Li3/e;

    iput-object p1, p0, Li3/h;->a:Li3/k;

    return-void
.end method
