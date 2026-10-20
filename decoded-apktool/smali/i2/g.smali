.class public final Li2/g;
.super Ljava/lang/Object;


# instance fields
.field public a:Lm0/l3;


# virtual methods
.method public final a()Lm0/l3;
    .locals 3

    invoke-static {}, Li3/l;->a()Li3/l;

    move-result-object v0

    invoke-virtual {v0}, Li3/l;->b()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    new-instance v0, Li2/k;

    invoke-direct {v0, v2}, Li2/k;-><init>(Z)V

    goto :goto_0

    :cond_0
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    sget-object v2, Lm0/o3;->a:Lm0/o3;

    invoke-static {v1, v2}, Ld7/t;->g0(Ljava/lang/Object;Lm0/z2;)Lm0/n1;

    move-result-object v1

    new-instance v2, Li2/f;

    invoke-direct {v2, v1, p0}, Li2/f;-><init>(Lm0/n1;Li2/g;)V

    invoke-virtual {v0, v2}, Li3/l;->h(Li3/j;)V

    move-object v0, v1

    :goto_0
    return-object v0
.end method
