.class public final Lp9/e;
.super Ljava/lang/Object;

# interfaces
.implements Lp9/f;


# instance fields
.field public final a:Lp9/f;

.field public final b:Lc9/c;

.field public final c:Lc9/e;


# direct methods
.method public constructor <init>(Lp9/f;)V
    .locals 2

    sget-object v0, Lp9/j;->a:Lp9/j;

    sget-object v1, Lp9/i;->a:Lp9/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp9/e;->a:Lp9/f;

    iput-object v0, p0, Lp9/e;->b:Lc9/c;

    iput-object v1, p0, Lp9/e;->c:Lc9/e;

    return-void
.end method


# virtual methods
.method public final collect(Lp9/g;Lu8/e;)Ljava/lang/Object;
    .locals 3

    new-instance v0, Ld9/u;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sget-object v1, Lq9/c;->b:Li3/u;

    iput-object v1, v0, Ld9/u;->a:Ljava/lang/Object;

    new-instance v1, Ls/c0;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v0, p1, v2}, Ls/c0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    iget-object p1, p0, Lp9/e;->a:Lp9/f;

    invoke-interface {p1, v1, p2}, Lp9/f;->collect(Lp9/g;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lv8/a;->a:Lv8/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lq8/l;->a:Lq8/l;

    return-object p1
.end method
