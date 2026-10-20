.class public final Lc0/g;
.super Lc0/a;


# instance fields
.field public w:Lc0/f;


# direct methods
.method public constructor <init>(Lc0/f;)V
    .locals 0

    invoke-direct {p0}, Lc0/a;-><init>()V

    iput-object p1, p0, Lc0/g;->w:Lc0/f;

    return-void
.end method


# virtual methods
.method public final A0()V
    .locals 2

    iget-object v0, p0, Lc0/g;->w:Lc0/f;

    instance-of v1, v0, Lc0/f;

    if-eqz v1, :cond_0

    const-string v1, "null cannot be cast to non-null type androidx.compose.foundation.relocation.BringIntoViewRequesterImpl"

    invoke-static {v0, v1}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v0, Lc0/f;->a:Lo0/i;

    invoke-virtual {v0, p0}, Lo0/i;->m(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public final z0()V
    .locals 2

    iget-object v0, p0, Lc0/g;->w:Lc0/f;

    instance-of v1, v0, Lc0/f;

    if-eqz v1, :cond_0

    const-string v1, "null cannot be cast to non-null type androidx.compose.foundation.relocation.BringIntoViewRequesterImpl"

    invoke-static {v0, v1}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, v0, Lc0/f;->a:Lo0/i;

    invoke-virtual {v1, p0}, Lo0/i;->m(Ljava/lang/Object;)Z

    :cond_0
    instance-of v1, v0, Lc0/f;

    if-eqz v1, :cond_1

    iget-object v1, v0, Lc0/f;->a:Lo0/i;

    invoke-virtual {v1, p0}, Lo0/i;->c(Ljava/lang/Object;)V

    :cond_1
    iput-object v0, p0, Lc0/g;->w:Lc0/f;

    return-void
.end method
