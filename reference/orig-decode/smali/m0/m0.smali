.class public final Lm0/m0;
.super Ljava/lang/Object;

# interfaces
.implements Lm0/i2;


# instance fields
.field public final a:Lc9/c;

.field public b:Lm0/n0;


# direct methods
.method public constructor <init>(Lc9/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm0/m0;->a:Lc9/c;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    sget-object v0, Lm0/s;->g:Lm0/o0;

    iget-object v1, p0, Lm0/m0;->a:Lc9/c;

    invoke-interface {v1, v0}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm0/n0;

    iput-object v0, p0, Lm0/m0;->b:Lm0/n0;

    return-void
.end method

.method public final b()V
    .locals 0

    return-void
.end method

.method public final d()V
    .locals 1

    iget-object v0, p0, Lm0/m0;->b:Lm0/n0;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lm0/n0;->a()V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lm0/m0;->b:Lm0/n0;

    return-void
.end method
