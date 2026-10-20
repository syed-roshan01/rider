.class public final Lu/j0;
.super Ljava/lang/Object;

# interfaces
.implements Lu/j1;


# instance fields
.field public final a:Lm0/l3;

.field public final b:Lm0/l3;

.field public final c:Lm0/l3;


# direct methods
.method public constructor <init>(Lm0/g1;Lm0/g1;Lm0/g1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu/j0;->a:Lm0/l3;

    iput-object p2, p0, Lu/j0;->b:Lm0/l3;

    iput-object p3, p0, Lu/j0;->c:Lm0/l3;

    return-void
.end method


# virtual methods
.method public final c(Lg1/e;)V
    .locals 8

    move-object v0, p1

    check-cast v0, Lt1/i0;

    invoke-virtual {v0}, Lt1/i0;->a()V

    iget-object p1, p0, Lu/j0;->a:Lm0/l3;

    invoke-interface {p1}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v1, v0, Lt1/i0;->a:Lg1/c;

    if-eqz p1, :cond_0

    sget-wide v2, Le1/r;->b:J

    const p1, 0x3e99999a    # 0.3f

    invoke-static {v2, v3, p1}, Le1/r;->b(JF)J

    move-result-wide v2

    const-wide/16 v4, 0x0

    invoke-interface {v1}, Lg1/g;->e()J

    move-result-wide v6

    const/16 p1, 0x7a

    move-wide v1, v2

    move-wide v3, v4

    move-wide v5, v6

    move v7, p1

    invoke-static/range {v0 .. v7}, Lg1/g;->U(Lg1/g;JJJI)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lu/j0;->b:Lm0/l3;

    invoke-interface {p1}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, Lu/j0;->c:Lm0/l3;

    invoke-interface {p1}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_2

    :cond_1
    sget-wide v2, Le1/r;->b:J

    const p1, 0x3dcccccd    # 0.1f

    invoke-static {v2, v3, p1}, Le1/r;->b(JF)J

    move-result-wide v2

    const-wide/16 v4, 0x0

    invoke-interface {v1}, Lg1/g;->e()J

    move-result-wide v6

    const/16 p1, 0x7a

    move-wide v1, v2

    move-wide v3, v4

    move-wide v5, v6

    move v7, p1

    invoke-static/range {v0 .. v7}, Lg1/g;->U(Lg1/g;JJJI)V

    :cond_2
    :goto_0
    return-void
.end method
