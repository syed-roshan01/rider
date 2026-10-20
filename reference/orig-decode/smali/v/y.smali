.class public final Lv/y;
.super Ljava/lang/Object;

# interfaces
.implements Lv/f2;


# instance fields
.field public final a:Lc9/c;

.field public final b:Lv/x;

.field public final c:Lu/v1;

.field public final d:Lm0/n1;


# direct methods
.method public constructor <init>(Lc9/c;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv/y;->a:Lc9/c;

    new-instance p1, Lv/x;

    invoke-direct {p1, p0}, Lv/x;-><init>(Lv/y;)V

    iput-object p1, p0, Lv/y;->b:Lv/x;

    new-instance p1, Lu/v1;

    invoke-direct {p1}, Lu/v1;-><init>()V

    iput-object p1, p0, Lv/y;->c:Lu/v1;

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    sget-object v0, Lm0/o3;->a:Lm0/o3;

    invoke-static {p1, v0}, Ld7/t;->g0(Ljava/lang/Object;Lm0/z2;)Lm0/n1;

    move-result-object p1

    iput-object p1, p0, Lv/y;->d:Lm0/n1;

    return-void
.end method


# virtual methods
.method public final b()Z
    .locals 1

    iget-object v0, p0, Lv/y;->d:Lm0/n1;

    invoke-virtual {v0}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final c(Lu/s1;Lc9/e;Lu8/e;)Ljava/lang/Object;
    .locals 2

    new-instance v0, Lv/w;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, p2, v1}, Lv/w;-><init>(Lv/y;Lu/s1;Lc9/e;Lu8/e;)V

    invoke-static {v0, p3}, Ld7/a;->q(Lc9/e;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lv8/a;->a:Lv8/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lq8/l;->a:Lq8/l;

    return-object p1
.end method

.method public final e(F)F
    .locals 1

    iget-object v0, p0, Lv/y;->a:Lc9/c;

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-interface {v0, p1}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    return p1
.end method
