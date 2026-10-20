.class public final Lm0/x1;
.super Ljava/lang/Object;

# interfaces
.implements Lm0/w1;


# instance fields
.field public a:I

.field public b:Lm0/y1;

.field public c:Lm0/c;

.field public d:Lc9/e;

.field public e:I

.field public f:Lq/r;

.field public g:Lq/s;


# direct methods
.method public constructor <init>(Lm0/x;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm0/x1;->b:Lm0/y1;

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    iget-object v0, p0, Lm0/x1;->b:Lm0/y1;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lm0/x1;->c:Lm0/c;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lm0/c;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final b(Ljava/lang/Object;)I
    .locals 1

    iget-object v0, p0, Lm0/x1;->b:Lm0/y1;

    if-eqz v0, :cond_0

    invoke-interface {v0, p0, p1}, Lm0/y1;->c(Lm0/x1;Ljava/lang/Object;)I

    move-result p1

    if-nez p1, :cond_1

    :cond_0
    const/4 p1, 0x1

    :cond_1
    return p1
.end method

.method public final c(Z)V
    .locals 0

    if-eqz p1, :cond_0

    iget p1, p0, Lm0/x1;->a:I

    or-int/lit8 p1, p1, 0x20

    iput p1, p0, Lm0/x1;->a:I

    goto :goto_0

    :cond_0
    iget p1, p0, Lm0/x1;->a:I

    and-int/lit8 p1, p1, -0x21

    iput p1, p0, Lm0/x1;->a:I

    :goto_0
    return-void
.end method

.method public final d(Lc9/e;)V
    .locals 0

    iput-object p1, p0, Lm0/x1;->d:Lc9/e;

    return-void
.end method
