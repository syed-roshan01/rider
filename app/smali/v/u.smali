.class public final Lv/u;
.super Ljava/lang/Object;

# interfaces
.implements Lv/y0;


# instance fields
.field public a:Lt/y;

.field public final b:Ly0/p;


# direct methods
.method public constructor <init>(Lt/y;)V
    .locals 1

    sget-object v0, Landroidx/compose/foundation/gestures/a;->d:Lv/v1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv/u;->a:Lt/y;

    iput-object v0, p0, Lv/u;->b:Ly0/p;

    return-void
.end method


# virtual methods
.method public final a(Lv/h2;FLu8/e;)Ljava/lang/Object;
    .locals 2

    new-instance v0, Lv/t;

    const/4 v1, 0x0

    invoke-direct {v0, p2, p0, p1, v1}, Lv/t;-><init>(FLv/u;Lv/r1;Lu8/e;)V

    iget-object p1, p0, Lv/u;->b:Ly0/p;

    invoke-static {p1, v0, p3}, Lz6/a;->u0(Lu8/j;Lc9/e;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
