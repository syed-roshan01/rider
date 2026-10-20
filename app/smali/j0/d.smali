.class public final Lj0/d;
.super Ljava/lang/Object;

# interfaces
.implements Lj0/w;


# static fields
.field public static final a:Lj0/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lj0/d;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lj0/d;->a:Lj0/d;

    return-void
.end method


# virtual methods
.method public final a(Lm0/m;)Lj0/h;
    .locals 4

    check-cast p1, Lm0/q;

    const v0, -0x61250617

    invoke-virtual {p1, v0}, Lm0/q;->Z(I)V

    sget-wide v0, Le1/r;->b:J

    invoke-static {v0, v1}, Landroidx/compose/ui/graphics/a;->m(J)F

    move-result v0

    float-to-double v0, v0

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    cmpl-double v0, v0, v2

    if-lez v0, :cond_0

    sget-object v0, Lj0/y;->b:Lj0/h;

    goto :goto_0

    :cond_0
    sget-object v0, Lj0/y;->c:Lj0/h;

    :goto_0
    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Lm0/q;->t(Z)V

    return-object v0
.end method

.method public final b(Lm0/m;)J
    .locals 3

    check-cast p1, Lm0/q;

    const v0, 0x79b8960e

    invoke-virtual {p1, v0}, Lm0/q;->Z(I)V

    sget-wide v0, Le1/r;->b:J

    invoke-static {v0, v1}, Landroidx/compose/ui/graphics/a;->m(J)F

    const/4 v2, 0x0

    invoke-virtual {p1, v2}, Lm0/q;->t(Z)V

    return-wide v0
.end method
