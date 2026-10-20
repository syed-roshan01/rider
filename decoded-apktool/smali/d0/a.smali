.class public final Ld0/a;
.super Ld9/j;

# interfaces
.implements Lc9/c;


# static fields
.field public static final a:Ld0/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ld0/a;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ld9/j;-><init>(I)V

    sput-object v0, Ld0/a;->a:Ld0/a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Ly1/v;

    sget-object v0, Ly1/t;->a:[Lj9/f;

    sget-object v0, Ly1/r;->e:Ly1/u;

    sget-object v1, Lq8/l;->a:Lq8/l;

    check-cast p1, Ly1/j;

    invoke-virtual {p1, v0, v1}, Ly1/j;->k(Ly1/u;Ljava/lang/Object;)V

    return-object v1
.end method
