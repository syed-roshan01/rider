.class public abstract Lw8/i;
.super Lw8/c;

# interfaces
.implements Ld9/g;


# instance fields
.field private final arity:I


# direct methods
.method public constructor <init>(ILu8/e;)V
    .locals 0

    invoke-direct {p0, p2}, Lw8/c;-><init>(Lu8/e;)V

    iput p1, p0, Lw8/i;->arity:I

    return-void
.end method


# virtual methods
.method public getArity()I
    .locals 1

    iget v0, p0, Lw8/i;->arity:I

    return v0
.end method

.method public toString()Ljava/lang/String;
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
