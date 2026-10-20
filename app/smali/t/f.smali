.class public final Lt/f;
.super Ld9/j;

# interfaces
.implements Lc9/a;


# instance fields
.field public final synthetic a:Lo9/g;

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lo9/g;Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lt/f;->a:Lo9/g;

    iput-object p2, p0, Lt/f;->b:Ljava/lang/Object;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lt/f;->a:Lo9/g;

    iget-object v1, p0, Lt/f;->b:Ljava/lang/Object;

    invoke-interface {v0, v1}, Lo9/t;->n(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lq8/l;->a:Lq8/l;

    return-object v0
.end method
