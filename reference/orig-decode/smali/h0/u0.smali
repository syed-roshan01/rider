.class public final Lh0/u0;
.super Ljava/lang/Object;

# interfaces
.implements Lh0/l;


# instance fields
.field public final synthetic a:Lh0/v0;


# direct methods
.method public constructor <init>(Lh0/v0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh0/u0;->a:Lh0/v0;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 0

    return-void
.end method

.method public final b(J)Z
    .locals 8

    iget-object v0, p0, Lh0/u0;->a:Lh0/v0;

    invoke-virtual {v0}, Lh0/v0;->k()Lg2/a0;

    move-result-object v1

    iget-object v1, v1, Lg2/a0;->a:La2/e;

    iget-object v1, v1, La2/e;->a:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return v2

    :cond_0
    iget-object v1, v0, Lh0/v0;->d:Lf0/c2;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lf0/c2;->d()Lf0/d2;

    move-result-object v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Lh0/v0;->k()Lg2/a0;

    move-result-object v1

    const/4 v4, 0x0

    const/4 v5, 0x0

    sget-object v6, Lh0/r;->a:Lb0/l0;

    const/4 v7, 0x0

    move-wide v2, p1

    invoke-static/range {v0 .. v7}, Lh0/v0;->c(Lh0/v0;Lg2/a0;JZZLh0/s;Z)J

    const/4 p1, 0x1

    return p1

    :cond_2
    :goto_0
    return v2
.end method

.method public final c(JLh0/s;)Z
    .locals 8

    iget-object v0, p0, Lh0/u0;->a:Lh0/v0;

    invoke-virtual {v0}, Lh0/v0;->k()Lg2/a0;

    move-result-object v1

    iget-object v1, v1, Lg2/a0;->a:La2/e;

    iget-object v1, v1, La2/e;->a:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return v2

    :cond_0
    iget-object v1, v0, Lh0/v0;->d:Lf0/c2;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lf0/c2;->d()Lf0/d2;

    move-result-object v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Lh0/v0;->k()Lg2/a0;

    move-result-object v1

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    move-wide v2, p1

    move-object v6, p3

    invoke-static/range {v0 .. v7}, Lh0/v0;->c(Lh0/v0;Lg2/a0;JZZLh0/s;Z)J

    const/4 p1, 0x1

    return p1

    :cond_2
    :goto_0
    return v2
.end method

.method public final d(JLb0/l0;)Z
    .locals 8

    iget-object v0, p0, Lh0/u0;->a:Lh0/v0;

    invoke-virtual {v0}, Lh0/v0;->k()Lg2/a0;

    move-result-object v1

    iget-object v1, v1, Lg2/a0;->a:La2/e;

    iget-object v1, v1, La2/e;->a:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return v2

    :cond_0
    iget-object v1, v0, Lh0/v0;->d:Lf0/c2;

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Lf0/c2;->d()Lf0/d2;

    move-result-object v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    iget-object v1, v0, Lh0/v0;->j:Lc1/k;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lc1/k;->a()Z

    :cond_2
    iput-wide p1, v0, Lh0/v0;->l:J

    const/4 p1, -0x1

    iput p1, v0, Lh0/v0;->q:I

    const/4 p1, 0x1

    invoke-virtual {v0, p1}, Lh0/v0;->h(Z)V

    invoke-virtual {v0}, Lh0/v0;->k()Lg2/a0;

    move-result-object v1

    iget-wide v2, v0, Lh0/v0;->l:J

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v7, 0x0

    move-object v6, p3

    invoke-static/range {v0 .. v7}, Lh0/v0;->c(Lh0/v0;Lg2/a0;JZZLh0/s;Z)J

    return p1

    :cond_3
    :goto_0
    return v2
.end method
