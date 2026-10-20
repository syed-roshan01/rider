.class public final Lm5/g;
.super Ljava/lang/Object;

# interfaces
.implements Ln5/b;


# instance fields
.field public final a:Lp8/a;

.field public final b:Lp8/a;


# direct methods
.method public constructor <init>(Ln5/c;Lm5/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm5/g;->a:Lp8/a;

    iput-object p2, p0, Lm5/g;->b:Lp8/a;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lm5/g;->a:Lp8/a;

    invoke-interface {v0}, Lp8/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Lm5/g;->b:Lp8/a;

    invoke-interface {v1}, Lp8/a;->get()Ljava/lang/Object;

    move-result-object v1

    new-instance v2, Lm5/f;

    check-cast v1, Lm5/d;

    invoke-direct {v2, v0, v1}, Lm5/f;-><init>(Landroid/content/Context;Lm5/d;)V

    return-object v2
.end method
