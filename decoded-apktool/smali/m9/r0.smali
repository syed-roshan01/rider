.class public final Lm9/r0;
.super Lm9/t0;


# instance fields
.field public final c:Lm9/k;

.field public final synthetic d:Lm9/v0;


# direct methods
.method public constructor <init>(Lm9/v0;JLm9/l;)V
    .locals 0

    iput-object p1, p0, Lm9/r0;->d:Lm9/v0;

    invoke-direct {p0, p2, p3}, Lm9/t0;-><init>(J)V

    iput-object p4, p0, Lm9/r0;->c:Lm9/k;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lm9/r0;->c:Lm9/k;

    iget-object v1, p0, Lm9/r0;->d:Lm9/v0;

    invoke-interface {v0, v1}, Lm9/k;->d(Lm9/z;)V

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-super {p0}, Lm9/t0;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lm9/r0;->c:Lm9/k;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
