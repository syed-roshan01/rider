.class public final Landroidx/fragment/app/y;
.super Landroidx/fragment/app/b0;


# instance fields
.field public final synthetic a:Lo/a;

.field public final synthetic b:Ljava/util/concurrent/atomic/AtomicReference;

.field public final synthetic c:Le/b;

.field public final synthetic d:Ld/c;

.field public final synthetic e:Landroidx/fragment/app/d0;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/d0;Lo/a;Ljava/util/concurrent/atomic/AtomicReference;Le/b;Ld/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/fragment/app/y;->e:Landroidx/fragment/app/d0;

    iput-object p2, p0, Landroidx/fragment/app/y;->a:Lo/a;

    iput-object p3, p0, Landroidx/fragment/app/y;->b:Ljava/util/concurrent/atomic/AtomicReference;

    iput-object p4, p0, Landroidx/fragment/app/y;->c:Le/b;

    iput-object p5, p0, Landroidx/fragment/app/y;->d:Ld/c;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5

    iget-object v0, p0, Landroidx/fragment/app/y;->e:Landroidx/fragment/app/d0;

    invoke-virtual {v0}, Landroidx/fragment/app/d0;->generateActivityResultKey()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Landroidx/fragment/app/y;->a:Lo/a;

    const/4 v3, 0x0

    invoke-interface {v2, v3}, Lo/a;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ld/i;

    iget-object v3, p0, Landroidx/fragment/app/y;->c:Le/b;

    iget-object v4, p0, Landroidx/fragment/app/y;->d:Ld/c;

    invoke-virtual {v2, v1, v0, v3, v4}, Ld/i;->c(Ljava/lang/String;Landroidx/lifecycle/w;Le/b;Ld/c;)Ld/f;

    move-result-object v0

    iget-object v1, p0, Landroidx/fragment/app/y;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    return-void
.end method
