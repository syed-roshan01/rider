.class public final Lp9/k;
.super Ljava/lang/Object;

# interfaces
.implements Lp9/f;


# instance fields
.field public final synthetic a:Lp9/f;

.field public final synthetic b:Lc9/e;


# direct methods
.method public constructor <init>(Lq9/o;Lp9/m0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp9/k;->a:Lp9/f;

    iput-object p2, p0, Lp9/k;->b:Lc9/e;

    return-void
.end method


# virtual methods
.method public final collect(Lp9/g;Lu8/e;)Ljava/lang/Object;
    .locals 3

    new-instance v0, Ld9/q;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    new-instance v1, Lp9/m;

    iget-object v2, p0, Lp9/k;->b:Lc9/e;

    invoke-direct {v1, v0, p1, v2}, Lp9/m;-><init>(Ld9/q;Lp9/g;Lc9/e;)V

    iget-object p1, p0, Lp9/k;->a:Lp9/f;

    invoke-interface {p1, v1, p2}, Lp9/f;->collect(Lp9/g;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lv8/a;->a:Lv8/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lq8/l;->a:Lq8/l;

    return-object p1
.end method
