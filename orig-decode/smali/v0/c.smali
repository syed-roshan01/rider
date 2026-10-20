.class public final Lv0/c;
.super Ld9/j;

# interfaces
.implements Lc9/a;


# instance fields
.field public final synthetic a:Lv0/d;


# direct methods
.method public constructor <init>(Lv0/d;)V
    .locals 0

    iput-object p1, p0, Lv0/c;->a:Lv0/d;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lv0/c;->a:Lv0/d;

    iget-object v1, v0, Lv0/d;->a:Lv0/p;

    iget-object v2, v0, Lv0/d;->d:Ljava/lang/Object;

    if-eqz v2, :cond_0

    iget-object v1, v1, Lv0/p;->a:Lc9/e;

    invoke-interface {v1, v0, v2}, Lc9/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Value should be initialized"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
