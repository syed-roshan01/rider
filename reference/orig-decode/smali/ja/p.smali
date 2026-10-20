.class public final Lja/p;
.super Lja/i0;


# instance fields
.field public e:Lja/i0;


# direct methods
.method public constructor <init>(Lja/i0;)V
    .locals 1

    const-string v0, "delegate"

    invoke-static {p1, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lja/p;->e:Lja/i0;

    return-void
.end method


# virtual methods
.method public final a()Lja/i0;
    .locals 1

    iget-object v0, p0, Lja/p;->e:Lja/i0;

    invoke-virtual {v0}, Lja/i0;->a()Lja/i0;

    move-result-object v0

    return-object v0
.end method

.method public final b()Lja/i0;
    .locals 1

    iget-object v0, p0, Lja/p;->e:Lja/i0;

    invoke-virtual {v0}, Lja/i0;->b()Lja/i0;

    move-result-object v0

    return-object v0
.end method

.method public final c()J
    .locals 2

    iget-object v0, p0, Lja/p;->e:Lja/i0;

    invoke-virtual {v0}, Lja/i0;->c()J

    move-result-wide v0

    return-wide v0
.end method

.method public final d(J)Lja/i0;
    .locals 1

    iget-object v0, p0, Lja/p;->e:Lja/i0;

    invoke-virtual {v0, p1, p2}, Lja/i0;->d(J)Lja/i0;

    move-result-object p1

    return-object p1
.end method

.method public final e()Z
    .locals 1

    iget-object v0, p0, Lja/p;->e:Lja/i0;

    invoke-virtual {v0}, Lja/i0;->e()Z

    move-result v0

    return v0
.end method

.method public final f()V
    .locals 1

    iget-object v0, p0, Lja/p;->e:Lja/i0;

    invoke-virtual {v0}, Lja/i0;->f()V

    return-void
.end method

.method public final g(JLjava/util/concurrent/TimeUnit;)Lja/i0;
    .locals 1

    const-string v0, "unit"

    invoke-static {p3, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lja/p;->e:Lja/i0;

    invoke-virtual {v0, p1, p2, p3}, Lja/i0;->g(JLjava/util/concurrent/TimeUnit;)Lja/i0;

    move-result-object p1

    return-object p1
.end method
