.class public final Lu/j2;
.super Ld9/j;

# interfaces
.implements Lc9/c;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:Z

.field public final synthetic c:Z

.field public final synthetic d:Lu/p2;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(ZZZLu/p2;Lm9/d0;)V
    .locals 0

    iput-boolean p1, p0, Lu/j2;->a:Z

    iput-boolean p2, p0, Lu/j2;->b:Z

    iput-boolean p3, p0, Lu/j2;->c:Z

    iput-object p4, p0, Lu/j2;->d:Lu/p2;

    iput-object p5, p0, Lu/j2;->e:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    check-cast p1, Ly1/v;

    sget-object v0, Ly1/t;->a:[Lj9/f;

    sget-object v0, Ly1/r;->l:Ly1/u;

    sget-object v1, Ly1/t;->a:[Lj9/f;

    const/4 v2, 0x6

    aget-object v2, v1, v2

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v0, p1, v2}, Ly1/u;->a(Ly1/v;Ljava/lang/Object;)V

    new-instance v0, Ly1/h;

    new-instance v2, Lu/m2;

    iget-object v3, p0, Lu/j2;->d:Lu/p2;

    const/4 v4, 0x0

    invoke-direct {v2, v3, v4}, Lu/m2;-><init>(Lu/p2;I)V

    new-instance v4, Lu/m2;

    const/4 v5, 0x1

    invoke-direct {v4, v3, v5}, Lu/m2;-><init>(Lu/p2;I)V

    iget-boolean v5, p0, Lu/j2;->a:Z

    invoke-direct {v0, v2, v4, v5}, Ly1/h;-><init>(Lc9/a;Lc9/a;Z)V

    iget-boolean v2, p0, Lu/j2;->b:Z

    if-eqz v2, :cond_0

    sget-object v4, Ly1/r;->p:Ly1/u;

    const/16 v5, 0x9

    aget-object v1, v1, v5

    invoke-virtual {v4, p1, v0}, Ly1/u;->a(Ly1/v;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    sget-object v4, Ly1/r;->o:Ly1/u;

    const/16 v5, 0x8

    aget-object v1, v1, v5

    invoke-virtual {v4, p1, v0}, Ly1/u;->a(Ly1/v;Ljava/lang/Object;)V

    :goto_0
    iget-boolean v0, p0, Lu/j2;->c:Z

    if-eqz v0, :cond_1

    new-instance v0, Lu/l2;

    iget-object v1, p0, Lu/j2;->e:Ljava/lang/Object;

    check-cast v1, Lm9/d0;

    invoke-direct {v0, v1, v2, v3}, Lu/l2;-><init>(Lm9/d0;ZLu/p2;)V

    sget-object v1, Ly1/i;->d:Ly1/u;

    new-instance v2, Ly1/a;

    const/4 v3, 0x0

    invoke-direct {v2, v3, v0}, Ly1/a;-><init>(Ljava/lang/String;Lq8/a;)V

    check-cast p1, Ly1/j;

    invoke-virtual {p1, v1, v2}, Ly1/j;->k(Ly1/u;Ljava/lang/Object;)V

    :cond_1
    sget-object p1, Lq8/l;->a:Lq8/l;

    return-object p1
.end method
