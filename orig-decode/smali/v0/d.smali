.class public final Lv0/d;
.super Ljava/lang/Object;

# interfaces
.implements Lm0/i2;


# instance fields
.field public a:Lv0/p;

.field public b:Lv0/l;

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/Object;

.field public e:[Ljava/lang/Object;

.field public f:Lv0/m;

.field public final n:Lv0/c;


# direct methods
.method public constructor <init>(Lv0/p;Lv0/l;Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv0/d;->a:Lv0/p;

    iput-object p2, p0, Lv0/d;->b:Lv0/l;

    iput-object p3, p0, Lv0/d;->c:Ljava/lang/String;

    iput-object p4, p0, Lv0/d;->d:Ljava/lang/Object;

    iput-object p5, p0, Lv0/d;->e:[Ljava/lang/Object;

    new-instance p1, Lv0/c;

    invoke-direct {p1, p0}, Lv0/c;-><init>(Lv0/d;)V

    iput-object p1, p0, Lv0/d;->n:Lv0/c;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 0

    invoke-virtual {p0}, Lv0/d;->c()V

    return-void
.end method

.method public final b()V
    .locals 1

    iget-object v0, p0, Lv0/d;->f:Lv0/m;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lv0/m;->a()V

    :cond_0
    return-void
.end method

.method public final c()V
    .locals 4

    iget-object v0, p0, Lv0/d;->b:Lv0/l;

    iget-object v1, p0, Lv0/d;->f:Lv0/m;

    if-nez v1, :cond_4

    if-eqz v0, :cond_3

    iget-object v1, p0, Lv0/d;->n:Lv0/c;

    invoke-virtual {v1}, Lv0/c;->invoke()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-interface {v0, v2}, Lv0/l;->a(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    new-instance v0, Ljava/lang/IllegalArgumentException;

    instance-of v1, v2, Lw0/s;

    if-eqz v1, :cond_1

    check-cast v2, Lw0/s;

    invoke-interface {v2}, Lw0/s;->a()Lm0/z2;

    move-result-object v1

    sget-object v3, Lm0/h1;->a:Lm0/h1;

    if-eq v1, v3, :cond_0

    invoke-interface {v2}, Lw0/s;->a()Lm0/z2;

    move-result-object v1

    sget-object v3, Lm0/o3;->a:Lm0/o3;

    if-eq v1, v3, :cond_0

    invoke-interface {v2}, Lw0/s;->a()Lm0/z2;

    move-result-object v1

    sget-object v3, Lm0/h2;->a:Lm0/h2;

    if-eq v1, v3, :cond_0

    const-string v1, "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver"

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "MutableState containing "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {v2}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable()."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable()."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :goto_0
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-object v2, p0, Lv0/d;->c:Ljava/lang/String;

    invoke-interface {v0, v2, v1}, Lv0/l;->e(Ljava/lang/String;Lv0/c;)Lv0/m;

    move-result-object v0

    iput-object v0, p0, Lv0/d;->f:Lv0/m;

    :cond_3
    return-void

    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "entry("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lv0/d;->f:Lv0/m;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ") is not null"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final d()V
    .locals 1

    iget-object v0, p0, Lv0/d;->f:Lv0/m;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lv0/m;->a()V

    :cond_0
    return-void
.end method
