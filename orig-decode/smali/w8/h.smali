.class public abstract Lw8/h;
.super Lw8/g;

# interfaces
.implements Ld9/g;


# instance fields
.field public final a:I


# direct methods
.method public constructor <init>(Lu8/e;)V
    .locals 0

    invoke-direct {p0, p1}, Lw8/g;-><init>(Lu8/e;)V

    const/4 p1, 0x2

    iput p1, p0, Lw8/h;->a:I

    return-void
.end method


# virtual methods
.method public final getArity()I
    .locals 1

    iget v0, p0, Lw8/h;->a:I

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Lw8/a;->getCompletion()Lu8/e;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Ld9/v;->a:Ld9/w;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p0}, Ld9/w;->a(Ld9/g;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "renderLambdaToString(...)"

    invoke-static {v0, v1}, Ld7/a;->l(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-super {p0}, Lw8/a;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0
.end method
