.class public final Lz/z;
.super Ljava/lang/Object;


# instance fields
.field public final a:Lm0/l1;

.field public final b:Lm0/l1;

.field public c:Z

.field public d:Ljava/lang/Object;

.field public final e:La0/y;


# direct methods
.method public constructor <init>(II)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lo7/d0;->Z(I)Lm0/l1;

    move-result-object v0

    iput-object v0, p0, Lz/z;->a:Lm0/l1;

    invoke-static {p2}, Lo7/d0;->Z(I)Lm0/l1;

    move-result-object p2

    iput-object p2, p0, Lz/z;->b:Lm0/l1;

    new-instance p2, La0/y;

    invoke-direct {p2, p1}, La0/y;-><init>(I)V

    iput-object p2, p0, Lz/z;->e:La0/y;

    return-void
.end method


# virtual methods
.method public final a(II)V
    .locals 2

    int-to-float v0, p1

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_0

    iget-object v0, p0, Lz/z;->a:Lm0/l1;

    invoke-virtual {v0, p1}, Lm0/u2;->f(I)V

    iget-object v0, p0, Lz/z;->e:La0/y;

    invoke-virtual {v0, p1}, La0/y;->b(I)V

    iget-object p1, p0, Lz/z;->b:Lm0/l1;

    invoke-virtual {p1, p2}, Lm0/u2;->f(I)V

    return-void

    :cond_0
    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Index should be non-negative ("

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 p1, 0x29

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method
