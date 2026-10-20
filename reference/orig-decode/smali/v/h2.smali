.class public final Lv/h2;
.super Ljava/lang/Object;

# interfaces
.implements Lv/r1;


# instance fields
.field public final synthetic a:Lv/l2;

.field public final synthetic b:Lc9/c;


# direct methods
.method public constructor <init>(Lv/l2;Lu/s;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv/h2;->a:Lv/l2;

    iput-object p2, p0, Lv/h2;->b:Lc9/c;

    return-void
.end method


# virtual methods
.method public final a(F)F
    .locals 3

    iget-object v0, p0, Lv/h2;->a:Lv/l2;

    invoke-virtual {v0, p1}, Lv/l2;->d(F)J

    move-result-wide v1

    new-instance p1, Ld1/c;

    invoke-direct {p1, v1, v2}, Ld1/c;-><init>(J)V

    iget-object v1, p0, Lv/h2;->b:Lc9/c;

    invoke-interface {v1, p1}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ld1/c;

    iget-wide v1, p1, Ld1/c;->a:J

    iget-object p1, v0, Lv/l2;->b:Lv/h1;

    sget-object v0, Lv/h1;->b:Lv/h1;

    if-ne p1, v0, :cond_0

    invoke-static {v1, v2}, Ld1/c;->d(J)F

    move-result p1

    goto :goto_0

    :cond_0
    invoke-static {v1, v2}, Ld1/c;->e(J)F

    move-result p1

    :goto_0
    return p1
.end method
