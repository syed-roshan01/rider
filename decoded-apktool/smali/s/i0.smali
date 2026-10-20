.class public final Ls/i0;
.super Ljava/lang/Object;


# instance fields
.field public final a:Ls/q0;

.field public final b:Ls/r0;

.field public final c:Lm0/k1;

.field public final d:Ls/y0;


# direct methods
.method public constructor <init>(Ls/q0;Ls/r0;)V
    .locals 3

    sget-object v0, Ls/n;->a:Ls/n;

    new-instance v1, Ls/y0;

    const/4 v2, 0x1

    invoke-direct {v1, v2, v0}, Ls/y0;-><init>(ZLc9/e;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls/i0;->a:Ls/q0;

    iput-object p2, p0, Ls/i0;->b:Ls/r0;

    const/4 p1, 0x0

    invoke-static {p1}, Lm9/e0;->H(F)Lm0/k1;

    move-result-object p1

    iput-object p1, p0, Ls/i0;->c:Lm0/k1;

    iput-object v1, p0, Ls/i0;->d:Ls/y0;

    return-void
.end method
