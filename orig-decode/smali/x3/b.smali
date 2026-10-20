.class public final Lx3/b;
.super Lx3/c;


# instance fields
.field public final a:Landroid/adservices/measurement/MeasurementManager;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-static {}, Lc3/d;->c()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "context.getSystemService\u2026:class.java\n            )"

    invoke-static {p1, v0}, Ld7/a;->l(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lc3/d;->a(Ljava/lang/Object;)Landroid/adservices/measurement/MeasurementManager;

    move-result-object p1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx3/b;->a:Landroid/adservices/measurement/MeasurementManager;

    return-void
.end method


# virtual methods
.method public a(Lu8/e;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lu8/e;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lm9/l;

    invoke-static {p1}, Ld7/t;->b0(Lu8/e;)Lu8/e;

    move-result-object p1

    const/4 v1, 0x1

    invoke-direct {v0, v1, p1}, Lm9/l;-><init>(ILu8/e;)V

    invoke-virtual {v0}, Lm9/l;->t()V

    new-instance p1, Lm/a;

    const/4 v1, 0x2

    invoke-direct {p1, v1}, Lm/a;-><init>(I)V

    new-instance v1, Lx2/i;

    invoke-direct {v1, v0}, Lx2/i;-><init>(Lm9/l;)V

    iget-object v2, p0, Lx3/b;->a:Landroid/adservices/measurement/MeasurementManager;

    invoke-static {v2, p1, v1}, Lc3/d;->g(Landroid/adservices/measurement/MeasurementManager;Lm/a;Landroid/os/OutcomeReceiver;)V

    invoke-virtual {v0}, Lm9/l;->s()Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lv8/a;->a:Lv8/a;

    return-object p1
.end method

.method public b(Landroid/net/Uri;Landroid/view/InputEvent;Lu8/e;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            "Landroid/view/InputEvent;",
            "Lu8/e;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lm9/l;

    invoke-static {p3}, Ld7/t;->b0(Lu8/e;)Lu8/e;

    move-result-object p3

    const/4 v1, 0x1

    invoke-direct {v0, v1, p3}, Lm9/l;-><init>(ILu8/e;)V

    invoke-virtual {v0}, Lm9/l;->t()V

    new-instance p3, Lm/a;

    const/4 v1, 0x6

    invoke-direct {p3, v1}, Lm/a;-><init>(I)V

    new-instance v1, Lx2/i;

    invoke-direct {v1, v0}, Lx2/i;-><init>(Lm9/l;)V

    iget-object v2, p0, Lx3/b;->a:Landroid/adservices/measurement/MeasurementManager;

    invoke-static {v2, p1, p2, p3, v1}, Lc3/d;->e(Landroid/adservices/measurement/MeasurementManager;Landroid/net/Uri;Landroid/view/InputEvent;Lm/a;Landroid/os/OutcomeReceiver;)V

    invoke-virtual {v0}, Lm9/l;->s()Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lv8/a;->a:Lv8/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lq8/l;->a:Lq8/l;

    return-object p1
.end method

.method public c(Landroid/net/Uri;Lu8/e;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            "Lu8/e;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lm9/l;

    invoke-static {p2}, Ld7/t;->b0(Lu8/e;)Lu8/e;

    move-result-object p2

    const/4 v1, 0x1

    invoke-direct {v0, v1, p2}, Lm9/l;-><init>(ILu8/e;)V

    invoke-virtual {v0}, Lm9/l;->t()V

    new-instance p2, Lm/a;

    const/4 v1, 0x3

    invoke-direct {p2, v1}, Lm/a;-><init>(I)V

    new-instance v1, Lx2/i;

    invoke-direct {v1, v0}, Lx2/i;-><init>(Lm9/l;)V

    iget-object v2, p0, Lx3/b;->a:Landroid/adservices/measurement/MeasurementManager;

    invoke-static {v2, p1, p2, v1}, Lc3/d;->f(Landroid/adservices/measurement/MeasurementManager;Landroid/net/Uri;Lm/a;Landroid/os/OutcomeReceiver;)V

    invoke-virtual {v0}, Lm9/l;->s()Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lv8/a;->a:Lv8/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lq8/l;->a:Lq8/l;

    return-object p1
.end method

.method public e(Lx3/a;Lu8/e;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx3/a;",
            "Lu8/e;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance p1, Lm9/l;

    invoke-static {p2}, Ld7/t;->b0(Lu8/e;)Lu8/e;

    move-result-object p2

    const/4 v0, 0x1

    invoke-direct {p1, v0, p2}, Lm9/l;-><init>(ILu8/e;)V

    invoke-virtual {p1}, Lm9/l;->t()V

    invoke-static {}, Lc3/d;->d()V

    const/4 p1, 0x0

    throw p1
.end method

.method public f(Lx3/d;Lu8/e;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx3/d;",
            "Lu8/e;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance p1, Lm9/l;

    invoke-static {p2}, Ld7/t;->b0(Lu8/e;)Lu8/e;

    move-result-object p2

    const/4 v0, 0x1

    invoke-direct {p1, v0, p2}, Lm9/l;-><init>(ILu8/e;)V

    invoke-virtual {p1}, Lm9/l;->t()V

    invoke-static {}, Lc3/d;->i()V

    const/4 p1, 0x0

    throw p1
.end method

.method public g(Lx3/e;Lu8/e;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx3/e;",
            "Lu8/e;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance p1, Lm9/l;

    invoke-static {p2}, Ld7/t;->b0(Lu8/e;)Lu8/e;

    move-result-object p2

    const/4 v0, 0x1

    invoke-direct {p1, v0, p2}, Lm9/l;-><init>(ILu8/e;)V

    invoke-virtual {p1}, Lm9/l;->t()V

    invoke-static {}, Lc3/d;->j()V

    const/4 p1, 0x0

    throw p1
.end method
