.class public final Lx9/b0;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field public final a:Ll/r;

.field public final b:Lx9/x;

.field public final c:Ljava/lang/String;

.field public final d:I

.field public final e:Lx9/o;

.field public final f:Lx9/q;

.field public final n:Lk4/o;

.field public final o:Lx9/b0;

.field public final p:Lx9/b0;

.field public final q:Lx9/b0;

.field public final r:J

.field public final s:J

.field public final t:Lba/d;

.field public u:Lx9/c;


# direct methods
.method public constructor <init>(Ll/r;Lx9/x;Ljava/lang/String;ILx9/o;Lx9/q;Lk4/o;Lx9/b0;Lx9/b0;Lx9/b0;JJLba/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx9/b0;->a:Ll/r;

    iput-object p2, p0, Lx9/b0;->b:Lx9/x;

    iput-object p3, p0, Lx9/b0;->c:Ljava/lang/String;

    iput p4, p0, Lx9/b0;->d:I

    iput-object p5, p0, Lx9/b0;->e:Lx9/o;

    iput-object p6, p0, Lx9/b0;->f:Lx9/q;

    iput-object p7, p0, Lx9/b0;->n:Lk4/o;

    iput-object p8, p0, Lx9/b0;->o:Lx9/b0;

    iput-object p9, p0, Lx9/b0;->p:Lx9/b0;

    iput-object p10, p0, Lx9/b0;->q:Lx9/b0;

    iput-wide p11, p0, Lx9/b0;->r:J

    iput-wide p13, p0, Lx9/b0;->s:J

    iput-object p15, p0, Lx9/b0;->t:Lba/d;

    return-void
.end method

.method public static b(Lx9/b0;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p0, p0, Lx9/b0;->f:Lx9/q;

    invoke-virtual {p0, p1}, Lx9/q;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    :cond_0
    return-object p0
.end method


# virtual methods
.method public final a()Lx9/c;
    .locals 1

    iget-object v0, p0, Lx9/b0;->u:Lx9/c;

    if-nez v0, :cond_0

    sget-object v0, Lx9/c;->n:Lx9/c;

    iget-object v0, p0, Lx9/b0;->f:Lx9/q;

    invoke-static {v0}, Lq8/k;->l(Lx9/q;)Lx9/c;

    move-result-object v0

    iput-object v0, p0, Lx9/b0;->u:Lx9/c;

    :cond_0
    return-object v0
.end method

.method public final close()V
    .locals 2

    iget-object v0, p0, Lx9/b0;->n:Lk4/o;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lk4/o;->close()V

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "response is not eligible for a body and must not be closed"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final e()Lx9/a0;
    .locals 3

    new-instance v0, Lx9/a0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iget-object v1, p0, Lx9/b0;->a:Ll/r;

    iput-object v1, v0, Lx9/a0;->a:Ll/r;

    iget-object v1, p0, Lx9/b0;->b:Lx9/x;

    iput-object v1, v0, Lx9/a0;->b:Lx9/x;

    iget v1, p0, Lx9/b0;->d:I

    iput v1, v0, Lx9/a0;->c:I

    iget-object v1, p0, Lx9/b0;->c:Ljava/lang/String;

    iput-object v1, v0, Lx9/a0;->d:Ljava/lang/String;

    iget-object v1, p0, Lx9/b0;->e:Lx9/o;

    iput-object v1, v0, Lx9/a0;->e:Lx9/o;

    iget-object v1, p0, Lx9/b0;->f:Lx9/q;

    invoke-virtual {v1}, Lx9/q;->k()Lx9/p;

    move-result-object v1

    iput-object v1, v0, Lx9/a0;->f:Lx9/p;

    iget-object v1, p0, Lx9/b0;->n:Lk4/o;

    iput-object v1, v0, Lx9/a0;->g:Lk4/o;

    iget-object v1, p0, Lx9/b0;->o:Lx9/b0;

    iput-object v1, v0, Lx9/a0;->h:Lx9/b0;

    iget-object v1, p0, Lx9/b0;->p:Lx9/b0;

    iput-object v1, v0, Lx9/a0;->i:Lx9/b0;

    iget-object v1, p0, Lx9/b0;->q:Lx9/b0;

    iput-object v1, v0, Lx9/a0;->j:Lx9/b0;

    iget-wide v1, p0, Lx9/b0;->r:J

    iput-wide v1, v0, Lx9/a0;->k:J

    iget-wide v1, p0, Lx9/b0;->s:J

    iput-wide v1, v0, Lx9/a0;->l:J

    iget-object v1, p0, Lx9/b0;->t:Lba/d;

    iput-object v1, v0, Lx9/a0;->m:Lba/d;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Response{protocol="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lx9/b0;->b:Lx9/x;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", code="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lx9/b0;->d:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", message="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lx9/b0;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", url="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lx9/b0;->a:Ll/r;

    iget-object v1, v1, Ll/r;->b:Ljava/lang/Object;

    check-cast v1, Lx9/s;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
