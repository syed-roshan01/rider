.class public final Lg8/a3;
.super Ljava/lang/Object;

# interfaces
.implements Lg8/t3;


# instance fields
.field public final synthetic a:Lg8/l3;


# direct methods
.method public constructor <init>(Lg8/l3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg8/a3;->a:Lg8/l3;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget-object v0, p0, Lg8/a3;->a:Lg8/l3;

    iget-object v1, v0, Lg8/l3;->F:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v1

    const-string v2, "Channel must have been shut down"

    invoke-static {v2, v1}, Ly3/e;->N(Ljava/lang/String;Z)V

    const/4 v1, 0x1

    iput-boolean v1, v0, Lg8/l3;->H:Z

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lg8/l3;->G(Z)V

    invoke-static {v0}, Lg8/l3;->z(Lg8/l3;)V

    invoke-static {v0}, Lg8/l3;->A(Lg8/l3;)V

    return-void
.end method

.method public final b(Z)V
    .locals 2

    iget-object v0, p0, Lg8/a3;->a:Lg8/l3;

    iget-object v1, v0, Lg8/l3;->X:Lg8/z1;

    iget-object v0, v0, Lg8/l3;->D:Lg8/y0;

    invoke-virtual {v1, v0, p1}, Lf4/y;->f(Ljava/lang/Object;Z)V

    return-void
.end method

.method public final c()V
    .locals 0

    return-void
.end method

.method public final d(Le8/c2;)V
    .locals 1

    iget-object p1, p0, Lg8/a3;->a:Lg8/l3;

    iget-object p1, p1, Lg8/l3;->F:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p1

    const-string v0, "Channel must have been shut down"

    invoke-static {v0, p1}, Ly3/e;->N(Ljava/lang/String;Z)V

    return-void
.end method
