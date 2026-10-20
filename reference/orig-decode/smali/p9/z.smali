.class public final Lp9/z;
.super Ljava/lang/Object;

# interfaces
.implements Lp9/o0;
.implements Lp9/f;
.implements Lq9/q;


# instance fields
.field public final synthetic a:Lp9/o0;


# direct methods
.method public constructor <init>(Lp9/q0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp9/z;->a:Lp9/o0;

    return-void
.end method


# virtual methods
.method public final b(Lu8/j;ILo9/a;)Lp9/f;
    .locals 1

    if-ltz p2, :cond_0

    const/4 v0, 0x2

    if-ge p2, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, -0x2

    if-ne p2, v0, :cond_1

    :goto_0
    sget-object v0, Lo9/a;->b:Lo9/a;

    if-ne p3, v0, :cond_1

    :goto_1
    move-object v0, p0

    goto :goto_2

    :cond_1
    if-eqz p2, :cond_2

    const/4 v0, -0x3

    if-ne p2, v0, :cond_3

    :cond_2
    sget-object v0, Lo9/a;->a:Lo9/a;

    if-ne p3, v0, :cond_3

    goto :goto_1

    :cond_3
    new-instance v0, Lq9/j;

    invoke-direct {v0, p2, p1, p3, p0}, Lq9/i;-><init>(ILu8/j;Lo9/a;Lp9/f;)V

    :goto_2
    return-object v0
.end method

.method public final collect(Lp9/g;Lu8/e;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lp9/z;->a:Lp9/o0;

    invoke-interface {v0, p1, p2}, Lp9/f;->collect(Lp9/g;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final getValue()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lp9/z;->a:Lp9/o0;

    invoke-interface {v0}, Lp9/o0;->getValue()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
