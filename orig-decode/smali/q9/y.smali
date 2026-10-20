.class public final Lq9/y;
.super Ljava/lang/Object;

# interfaces
.implements Lu8/e;
.implements Lw8/d;


# instance fields
.field public final a:Lu8/e;

.field public final b:Lu8/j;


# direct methods
.method public constructor <init>(Lu8/e;Lu8/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq9/y;->a:Lu8/e;

    iput-object p2, p0, Lq9/y;->b:Lu8/j;

    return-void
.end method


# virtual methods
.method public final getCallerFrame()Lw8/d;
    .locals 2

    iget-object v0, p0, Lq9/y;->a:Lu8/e;

    instance-of v1, v0, Lw8/d;

    if-eqz v1, :cond_0

    check-cast v0, Lw8/d;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final getContext()Lu8/j;
    .locals 1

    iget-object v0, p0, Lq9/y;->b:Lu8/j;

    return-object v0
.end method

.method public final resumeWith(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lq9/y;->a:Lu8/e;

    invoke-interface {v0, p1}, Lu8/e;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method
