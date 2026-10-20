.class public final Lu/x0;
.super Ly0/n;

# interfaces
.implements Ls1/f;


# instance fields
.field public final u:Lc9/c;

.field public final v:Ls1/j;


# direct methods
.method public constructor <init>(Lq/w;)V
    .locals 2

    invoke-direct {p0}, Ly0/n;-><init>()V

    iput-object p1, p0, Lu/x0;->u:Lc9/c;

    new-instance p1, Lq/w;

    const/4 v0, 0x7

    invoke-direct {p1, p0, v0}, Lq/w;-><init>(Ljava/lang/Object;I)V

    sget-object v0, Lu/v0;->a:Ls1/i;

    new-instance v1, Ls1/j;

    invoke-direct {v1, v0}, Ls1/j;-><init>(Ls1/c;)V

    iget-object v0, v1, Ls1/j;->A:Lm0/n1;

    invoke-virtual {v0, p1}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    iput-object v1, p0, Lu/x0;->v:Ls1/j;

    return-void
.end method


# virtual methods
.method public final j()Lf6/a;
    .locals 1

    iget-object v0, p0, Lu/x0;->v:Ls1/j;

    return-object v0
.end method
