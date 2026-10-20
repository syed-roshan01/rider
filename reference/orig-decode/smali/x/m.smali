.class public final Lx/m;
.super Ljava/lang/Object;

# interfaces
.implements Lx/l;


# instance fields
.field public final a:Lp9/c0;


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lo9/a;->b:Lo9/a;

    new-instance v1, Lp9/c0;

    const/4 v2, 0x0

    const/16 v3, 0x10

    invoke-direct {v1, v2, v3, v0}, Lp9/c0;-><init>(IILo9/a;)V

    iput-object v1, p0, Lx/m;->a:Lp9/c0;

    return-void
.end method


# virtual methods
.method public final a(Lx/k;Lu8/e;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lx/m;->a:Lp9/c0;

    invoke-virtual {v0, p1, p2}, Lp9/c0;->emit(Ljava/lang/Object;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lv8/a;->a:Lv8/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lq8/l;->a:Lq8/l;

    return-object p1
.end method

.method public final b(Lx/k;)V
    .locals 1

    iget-object v0, p0, Lx/m;->a:Lp9/c0;

    invoke-virtual {v0, p1}, Lp9/c0;->f(Ljava/lang/Object;)Z

    return-void
.end method
