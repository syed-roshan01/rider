.class public final Ln0/f0;
.super Ln0/g0;


# static fields
.field public static final c:Ln0/f0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ln0/f0;

    const/4 v1, 0x0

    const/4 v2, 0x3

    invoke-direct {v0, v1, v1, v2}, Ln0/g0;-><init>(III)V

    sput-object v0, Ln0/f0;->c:Ln0/f0;

    return-void
.end method


# virtual methods
.method public final a(Ln0/h0;Lm0/d;Lm0/q2;Lm0/w;)V
    .locals 0

    invoke-interface {p2}, Lm0/d;->f()Ljava/lang/Object;

    move-result-object p1

    const-string p2, "null cannot be cast to non-null type androidx.compose.runtime.ComposeNodeLifecycleCallback"

    invoke-static {p1, p2}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lm0/j;

    invoke-interface {p1}, Lm0/j;->a()V

    return-void
.end method
