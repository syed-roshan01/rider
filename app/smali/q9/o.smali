.class public final Lq9/o;
.super Lq9/i;


# instance fields
.field public final e:Lc9/f;


# direct methods
.method public constructor <init>(Lc9/f;Lp9/f;Lu8/j;ILo9/a;)V
    .locals 0

    invoke-direct {p0, p4, p3, p5, p2}, Lq9/i;-><init>(ILu8/j;Lo9/a;Lp9/f;)V

    iput-object p1, p0, Lq9/o;->e:Lc9/f;

    return-void
.end method


# virtual methods
.method public final d(Lu8/j;ILo9/a;)Lq9/g;
    .locals 7

    new-instance v6, Lq9/o;

    iget-object v1, p0, Lq9/o;->e:Lc9/f;

    iget-object v2, p0, Lq9/i;->d:Lp9/f;

    move-object v0, v6

    move-object v3, p1

    move v4, p2

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Lq9/o;-><init>(Lc9/f;Lp9/f;Lu8/j;ILo9/a;)V

    return-object v6
.end method

.method public final g(Lp9/g;Lu8/e;)Ljava/lang/Object;
    .locals 2

    new-instance v0, Lq9/n;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lq9/n;-><init>(Lq9/o;Lp9/g;Lu8/e;)V

    invoke-static {v0, p2}, Ld7/a;->q(Lc9/e;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lv8/a;->a:Lv8/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lq8/l;->a:Lq8/l;

    return-object p1
.end method
