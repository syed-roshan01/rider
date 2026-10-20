.class public final Ln0/m;
.super Ln0/g0;


# static fields
.field public static final c:Ln0/m;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ln0/m;

    const/4 v1, 0x0

    const/4 v2, 0x3

    invoke-direct {v0, v1, v1, v2}, Ln0/g0;-><init>(III)V

    sput-object v0, Ln0/m;->c:Ln0/m;

    return-void
.end method


# virtual methods
.method public final a(Ln0/h0;Lm0/d;Lm0/q2;Lm0/w;)V
    .locals 0

    const-string p1, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>"

    invoke-static {p2, p1}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    invoke-static {p3, p2, p1}, Lm9/e0;->J(Lm0/q2;Lm0/d;I)V

    invoke-virtual {p3}, Lm0/q2;->i()V

    return-void
.end method
