.class public final Lf2/i;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lf2/h;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Lm9/a0;->a:Lm9/a0;

    new-instance v1, Lf2/h;

    invoke-direct {v1, v0}, Lu8/a;-><init>(Lu8/i;)V

    sput-object v1, Lf2/i;->a:Lf2/h;

    return-void
.end method

.method public constructor <init>(La4/q;)V
    .locals 2

    sget-object p1, Lu8/k;->a:Lu8/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Li2/h;->a:Lm9/s1;

    sget-object v1, Lf2/i;->a:Lf2/h;

    invoke-virtual {v1, v0}, Lu8/a;->O(Lu8/j;)Lu8/j;

    move-result-object v0

    invoke-interface {v0, p1}, Lu8/j;->O(Lu8/j;)Lu8/j;

    move-result-object p1

    new-instance v0, Lm9/y1;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lm9/i1;-><init>(Lm9/f1;)V

    invoke-interface {p1, v0}, Lu8/j;->O(Lu8/j;)Lu8/j;

    move-result-object p1

    invoke-static {p1}, Ld7/a;->b(Lu8/j;)Lr9/e;

    return-void
.end method
