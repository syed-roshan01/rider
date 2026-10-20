.class public final Lh0/a;
.super Ld9/j;

# interfaces
.implements Lc9/c;


# instance fields
.field public final synthetic a:Lh0/m;

.field public final synthetic b:Z

.field public final synthetic c:Z


# direct methods
.method public constructor <init>(Lh0/m;ZZ)V
    .locals 0

    iput-object p1, p0, Lh0/a;->a:Lh0/m;

    iput-boolean p2, p0, Lh0/a;->b:Z

    iput-boolean p3, p0, Lh0/a;->c:Z

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    check-cast p1, Ly1/v;

    iget-object v0, p0, Lh0/a;->a:Lh0/m;

    invoke-interface {v0}, Lh0/m;->a()J

    move-result-wide v3

    sget-object v0, Lh0/d0;->c:Ly1/u;

    new-instance v7, Lh0/c0;

    iget-boolean v1, p0, Lh0/a;->b:Z

    if-eqz v1, :cond_0

    sget-object v1, Lf0/n0;->b:Lf0/n0;

    :goto_0
    move-object v2, v1

    goto :goto_1

    :cond_0
    sget-object v1, Lf0/n0;->c:Lf0/n0;

    goto :goto_0

    :goto_1
    iget-boolean v1, p0, Lh0/a;->c:Z

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    :goto_2
    move v5, v1

    goto :goto_3

    :cond_1
    const/4 v1, 0x3

    goto :goto_2

    :goto_3
    invoke-static {v3, v4}, Ld9/i;->u(J)Z

    move-result v6

    move-object v1, v7

    invoke-direct/range {v1 .. v6}, Lh0/c0;-><init>(Lf0/n0;JIZ)V

    check-cast p1, Ly1/j;

    invoke-virtual {p1, v0, v7}, Ly1/j;->k(Ly1/u;Ljava/lang/Object;)V

    sget-object p1, Lq8/l;->a:Lq8/l;

    return-object p1
.end method
