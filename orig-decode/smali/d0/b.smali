.class public final Ld0/b;
.super Ld9/j;

# interfaces
.implements Lc9/c;


# instance fields
.field public final synthetic a:Z


# direct methods
.method public constructor <init>(Z)V
    .locals 0

    iput-boolean p1, p0, Ld0/b;->a:Z

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    check-cast p1, Ly1/v;

    sget-object v0, Ly1/t;->a:[Lj9/f;

    sget-object v0, Ly1/r;->A:Ly1/u;

    sget-object v1, Ly1/t;->a:[Lj9/f;

    const/16 v2, 0x11

    aget-object v1, v1, v2

    iget-boolean v1, p0, Ld0/b;->a:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Ly1/u;->a(Ly1/v;Ljava/lang/Object;)V

    sget-object p1, Lq8/l;->a:Lq8/l;

    return-object p1
.end method
