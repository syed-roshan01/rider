.class public final Ls4/a;
.super Ljava/lang/Object;

# interfaces
.implements Ls4/p;


# instance fields
.field public final a:Landroidx/lifecycle/r;

.field public final b:Lm9/f1;


# direct methods
.method public constructor <init>(Landroidx/lifecycle/r;Lm9/f1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls4/a;->a:Landroidx/lifecycle/r;

    iput-object p2, p0, Ls4/a;->b:Lm9/f1;

    return-void
.end method


# virtual methods
.method public final c(Landroidx/lifecycle/w;)V
    .locals 1

    const/4 p1, 0x0

    iget-object v0, p0, Ls4/a;->b:Lm9/f1;

    invoke-interface {v0, p1}, Lm9/f1;->a(Ljava/util/concurrent/CancellationException;)V

    return-void
.end method
